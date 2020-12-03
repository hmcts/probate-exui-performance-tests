package uk.gov.hmcts.reform.exui.performance.scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import uk.gov.hmcts.reform.exui.performance.scenarios.utils.{CaseworkerHeader, Environment}

object EXUICaseWorker {

  val IdamUrl = Environment.idamURL
  val baseURL = Environment.baseURL
  val caseFeeder = csv("CaseworkerSearches.csv").random

  val MinThinkTime = Environment.minThinkTimeCW
  val MaxThinkTime = Environment.maxThinkTimeCW

  val ApplyFilters =
    feed(caseFeeder)
      .exec(http("XUI${service}_030_SearchPagination")
        .post("/data/internal/searchCases?ctid=${caseType}&use_case=SEARCH&view=SEARCH&page=1")
        .headers(CaseworkerHeader.headers_2)
        .header("X-XSRF-TOKEN", "${xsrfToken}")
        .body(StringBody("{\n  \"size\": 25\n}"))
        .check(jsonPath("$..case_id").find(0).optional.saveAs("caseNumber")))
        
      .pause(MinThinkTime, MaxThinkTime)

  val ApplySort=
    exec(http("XUI${service}_040_005_ApplySortCaseRef")
         .post("/data/internal/searchCases?ctid=${caseType}&use_case=WORKBASKET&view=WORKBASKET&page=1")
         .headers(CaseworkerHeader.headers_sort)
         .header("X-XSRF-TOKEN", "${xsrfToken}")
         .body(StringBody("{\n  \"sort\": {\n    \"column\": \"[CASE_REFERENCE]\",\n    \"order\": 1,\n    \"type\": \"Number\"\n  },\n  \"size\": 25\n}"))
         .check(status.is(200)))
    .pause(10)
    .exec(http("XUI${service}_040_010_ApplySortFirstName")
          .post("/data/internal/searchCases?ctid=${caseType}&use_case=WORKBASKET&view=WORKBASKET&page=1")
          .headers(CaseworkerHeader.headers_sort)
          .header("X-XSRF-TOKEN", "${xsrfToken}")
          .body(StringBody("{\n  \"sort\": {\n    \"column\": \"deceasedForenames\",\n    \"order\": 1,\n    \"type\": \"Text\"\n  },\n  \"size\": 25\n}"))
          .check(status.is(200)))
    .pause(10)

  val ClickFindCase=
    exec(http("XUI${service}_050_005_FindCase")
         .get("/aggregated/caseworkers/:uid/jurisdictions?access=read")
         .headers(CaseworkerHeader.headers_read)
         .header("X-XSRF-TOKEN", "${xsrfToken}")
    )

    .exec(http("XUI${service}_050_010_FindCaseSearch")
          .get("/data/internal/case-types/Asylum/search-inputs")
          .headers(CaseworkerHeader.headers_read)
          .header("X-XSRF-TOKEN", "${xsrfToken}")
          .check(status.in(200,404))
    )

    .exec(http("XUI${service}_050_015_FindCaseSearchMeta")
          .get("/aggregated/caseworkers/:uid/jurisdictions/IA/case-types/Asylum/cases?view=SEARCH&page=1")
          .headers(CaseworkerHeader.headers_read)
          .header("X-XSRF-TOKEN", "${xsrfToken}")
          .check(status.in(200,404)))
    .pause(10)
    //submit find a case

    .exec(http("XUI${service}_060_FindSearchResults")
          .post("/data/internal/searchCases?ctid=${caseType}&use_case=WORKBASKET&view=WORKBASKET&page=1")
          .headers(CaseworkerHeader.headers_2)
          .header("X-XSRF-TOKEN", "${xsrfToken}")
          .body(StringBody("{\n  \"size\": 25\n}"))
          .check(jsonPath("$..case_id").find(0).optional.saveAs("caseNumber"))
          .check(status.in(200,404)))
    .pause(10)

    .exec( session => {
      println("the case number is  "+session("caseNumber").as[String])
      session
    })

  val ViewCase = 
  //Loop through each of the found cases and view
  doIf(session => session.contains("caseNumber")) {
      exec(http("XUI${service}_040_005_ViewCase")
        .get("/data/internal/cases/${caseNumber}")
        .headers(CaseworkerHeader.headers_5)
        .header("X-XSRF-TOKEN", "${xsrfToken}")
        .check(regex("""internal/documents/(.+?)","document_filename""")
        .find(0).optional.saveAs("Document_ID")))

      .exec(http("XUI${service}_040_010_ViewUndefined")
        .get("/undefined/cases/${caseNumber}")
        .headers(CaseworkerHeader.headers_undefined))

      .exec(http("XUI${service}_040_015_GetPaymentGroups")
        .get("/payments/cases/${caseNumber}/paymentgroups")
        .headers(CaseworkerHeader.headers_search)
        .check(status.in(200,404,403)))

      .pause(MinThinkTime, MaxThinkTime)

      //following is view tabs

      .exec(http("XUI${service}_080_005_DetailsTabAppeal")
            .get("/api/healthCheck?path=%2Fcases%2Fcase-details%2F${caseNumber}%23applicantTab")
            .headers(CaseworkerHeader.headers_4)
            .check(status.in(200,404)))

      .exec(http("XUI${service}_080_010_aosDetails")
            .get("/api/healthCheck?path=%2Fcases%2Fcase-details%2F${caseNumber}%23eventHistoryTab")
            .headers(CaseworkerHeader.headers_4)
            .check(status.in(200,404)))

      //Only do these steps if document_ID is found
      .doIf(session => session.contains("Document_ID")) {
        exec(http("XUI${service}_050_005_ViewCaseDocumentUI")
          .get("/external/config/ui")
          .headers(CaseworkerHeader.headers_documents)
          .header("X-XSRF-TOKEN", "${xsrfToken}"))

        .exec(http("XUI${service}_050_010_ViewCaseDocumentT&C")
          .get("/api/configuration?configurationKey=termsAndConditionsEnabled")
          .headers(CaseworkerHeader.headers_documents)
          .header("X-XSRF-TOKEN", "${xsrfToken}"))

        .exec(http("XUI${service}_050_015_ViewCaseDocumentAnnotations")
          .get("/em-anno/annotation-sets/filter?documentId=${Document_ID}")
          .headers(CaseworkerHeader.headers_documents)
          .header("X-XSRF-TOKEN", "${xsrfToken}")
          .check(status.in(200, 404, 304)))

        .exec(http("XUI${service}_050_020_ViewCaseDocumentBinary")
          .get("/documents/${Document_ID}/binary")
          .headers(CaseworkerHeader.headers_documents)
          .header("X-XSRF-TOKEN", "${xsrfToken}")
          .check(status.in(200, 404, 304)))

        .pause(MinThinkTime, MaxThinkTime)
      }

      //Simulate clicking on Case List
      .exec(http("XUI${service}_060_005_CaseListViewHealthcheck")
        .get("/api/healthCheck?path=%2Fcases")
        .headers(CaseworkerHeader.headers_6)
        .header("X-XSRF-TOKEN", "${xsrfToken}"))

			.exec(http("XUI${service}_060_010_CaseListViewGetJurisdictions")
        .get("/aggregated/caseworkers/:uid/jurisdictions?access=read")
        .headers(CaseworkerHeader.headers_7)
        .header("X-XSRF-TOKEN", "${xsrfToken}"))

      .exec(http("XUI${service}_060_015_CaseListViewWorkBasketInputs")
        .get("/data/internal/case-types/${caseType}/work-basket-inputs")
        .headers(CaseworkerHeader.headers_8)
        .header("X-XSRF-TOKEN", "${xsrfToken}"))

      .exec(http("XUI${service}_060_020_CaseListView")
        .post("/data/internal/searchCases?ctid=${caseType}&use_case=WORKBASKET&view=WORKBASKET&state=1_OPEN&page=1")
        .headers(CaseworkerHeader.headers_9)
        .header("X-XSRF-TOKEN", "${xsrfToken}")
        .body(StringBody("{\n  \"size\": 25\n}")))

      .pause(MinThinkTime, MaxThinkTime)
    }
}


