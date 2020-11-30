// =======================================================================================
// This is a SDO journey for generate orders after case is Submitted
// This journey begins once the FPL case is submitted
// =======================================================================================


package uk.gov.hmcts.reform.exui.performance.scenarios

import java.text.SimpleDateFormat
import java.util.Date

import io.gatling.core.Predef._
import io.gatling.http.Predef.{http, status, _}
import uk.gov.hmcts.reform.exui.performance.scenarios.utils.{Environment, FPLAHeader}

import scala.util.Random

object EXUIFPLASDO {

  val IdamUrl = Environment.idamURL
  val baseURL = Environment.baseURL
  val loginFeeder = csv("FPLUserData.csv").circular

  val MinThinkTime = Environment.minThinkTimeFPLC
  val MaxThinkTime = Environment.maxThinkTimeFPLC
  val MinThinkTimeFPLV = Environment.minThinkTimeFPLV
  val MaxThinkTimeFPLV = Environment.maxThinkTimeFPLV
  val MinThinkTimeSDO = Environment.minThinkTimeSDO
  val MaxThinkTimeSDO = Environment.maxThinkTimeSDO
  private val rng: Random = new Random()
  private def firstName(): String = rng.alphanumeric.take(10).mkString
  private def lastName(): String = rng.alphanumeric.take(10).mkString
  val sdfDate = new SimpleDateFormat("yyyy-MM-dd")
  val now = new Date()
  val timeStamp = sdfDate.format(now)

  // =======================================================================================
  // Following scenario is business flow for fpl view  when user loggedin as fpla admin after a create a case
    // =======================================================================================

  val fplviewcaseforsdoasadmin =


      exec(http("XUI${service}_040_005_SearchPage")
        .get("/aggregated/caseworkers/:uid/jurisdictions?access=read")
        .headers(FPLAHeader.headers_adminsearch))

        .exec(http("XUI${service}_040_010_SearchPaginationMetaData")
          .get("/aggregated/caseworkers/:uid/jurisdictions/PUBLICLAW/case-types/CARE_SUPERVISION_EPO/cases?view=SEARCH&page=1&state=Submitted&case_reference=${caseId}")
          .headers(FPLAHeader.headers_adminsearch))

        .exec(http("XUI${service}_040_015_SearchResults")
          .get("/data/caseworkers/:uid/jurisdictions/PUBLICLAW/case-types/CARE_SUPERVISION_EPO/cases/pagination_metadata?state=Submitted&case_reference=${caseId}")
          .headers(FPLAHeader.headers_adminsearch))

        .exec(http("XUI${service}_040_020_SearchPaginationMetaData")
          .get("/aggregated/caseworkers/:uid/jurisdictions/PUBLICLAW/case-types/CARE_SUPERVISION_EPO/cases?view=SEARCH&page=1&state=Submitted&case_reference=${caseId}")
          .headers(FPLAHeader.headers_adminsearch))

        .exec(http("XUI${service}_040_025_SearchAccessJurisdictions")
          .get("/aggregated/caseworkers/:uid/jurisdictions?access=read")
          .headers(FPLAHeader.headers_adminsearchview))

        .exec(http("XUI${service}_040_030_SearchInputs")
          .get("/data/internal/case-types/CARE_SUPERVISION_EPO/search-inputs")
          .headers(FPLAHeader.headers_68)
        )

      .pause(MinThinkTimeFPLV, MaxThinkTimeFPLV)


      .exec(http("XUI${service}_050_005_ViewCase")
        .get("/data/internal/cases/${caseId}")
        .headers(FPLAHeader.headers_872)
      )

      .exec(http("XUI${service}_050_010_ViewCaseProfile")
        .get("/undefined/cases/${caseId}")
        .headers(FPLAHeader.headers_admin_case_search))

      .exec(http("XUI${service}_050_010_ViewCasePaymentGroups")
        .get("/payments/cases/${caseId}/paymentgroups")
        .headers(FPLAHeader.headers_admin_case_search)
        .check(status.in(200, 304, 403, 404)))
      .pause(MinThinkTimeFPLV, MaxThinkTimeFPLV)

  // =======================================================================================
  // Following scenario is business flow for fpl activities  when user loggedin as fpla admin after a create a case
  // =======================================================================================


  val fplasdoadminactivities =

  // =======================================================================================
  // FamilyCaseNumber - Step1 : after login as fpl admin go to the case and click on Family Case Number
  // =======================================================================================

    exec(http("XUI${service}_030_005_FamilyCaseNumberGo")
      .get("/data/internal/cases/${caseId}/event-triggers/addFamilyManCaseNumber?ignore-warning=false")
      .headers(FPLAHeader.headers_sdo_casenumbergo)
      .check(jsonPath("$.event_token").saveAs("event_token_sdo_casenumber"))
      .check(status.in(200, 304)))

      .exec(http("XUI${service}_030_010_FamilyCaseNumberGoProfile")
        .get("/data/internal/profile")
        .headers(FPLAHeader.headers_sdo_casenumbergoprofile)
        .check(status.in(200, 304)))

      .pause(MinThinkTimeSDO, MaxThinkTimeSDO)

    // =======================================================================================
    // after enter the family case number then click on continue
    // ==================================================================================

      .exec(http("XUI${service}_040_005_FamilyCaseNumberContinue")
        .post("/data/case-types/CARE_SUPERVISION_EPO/validate?pageId=addFamilyManCaseNumber1")
        .headers(FPLAHeader.headers_sdo_casenumbercontinue)
            // .body(StringBody(""))
            .body(ElFileBody("SDOFamilyCaseNumberContinue.json")).asJson
            .check(status.in(200, 304)))

      .exec(http("XUI${service}_040_010_FamilyCaseNumberContinueProfile")
        .get("/data/internal/profile")
        .headers(FPLAHeader.headers_sdo_casenumbercontinueprofile)
        .check(status.in(200, 304)))


      .pause(MinThinkTimeSDO, MaxThinkTimeSDO)

    // =======================================================================================
    // after family case number continue then submit the family case number
    // ==================================================================================


    .exec(http("XUI${service}_050_005_FamilyCaseNumberSaveContinue")
        .post("/data/cases/${caseId}/events")
        .headers(FPLAHeader.headers_sdo_casenumber_view)
            //  .body(StringBody(""))
            .body(ElFileBody("SDOFamilyCaseNumberSaveContinue.json")).asJson
            .check(status.in(200, 304)))


      .exec(http("XUI${service}_050_010_FamilyCaseNumberSaveViewCase")
        .get("/data/internal/cases/${caseId}")
        .headers(FPLAHeader.headers_93)
        .check(status.in(200, 304)))

      .exec(http("XUI${service}_050_015_FamilyCaseNumberSaveViewCaseUnDefined")
        .get("/undefined/cases/${caseId}")
        .headers(FPLAHeader.headers_94)
        .check(status.in(200, 304)))

      .exec(http("XUI${service}_050_020_FamilyCaseNumberPaymentGroups")
        .get("/payments/cases/${caseId}/paymentgroups")
        .headers(FPLAHeader.headers_96)
        .check(status.in(200, 304, 403)))

      .pause(MinThinkTimeSDO, MaxThinkTimeSDO)

      //enter allocated judge details

      .exec(http("XUI${service}_060_005_AllocatedJudgeGo")
            .get("/data/internal/cases/${caseId}/event-triggers/allocatedJudge?ignore-warning=false")
            .headers(FPLAHeader.headers_121)
            .check(jsonPath("$.event_token").saveAs("event_token_sdo_allocatedjudge"))
            .check(status.in(200, 304)))

      .exec(http("XUI${service}_060_010_AllocatedJudgeProfile")
            .get("/data/internal/profile")
            .headers(FPLAHeader.headers_124)
            .check(status.in(200, 304)))

      .pause(MinThinkTimeSDO, MaxThinkTimeSDO)

      .exec(http("XUI${service}_070_005_AllocatedJudgeContinue")
            .post("/data/case-types/CARE_SUPERVISION_EPO/validate?pageId=allocatedJudgeAllocatedJudge")
            .headers(FPLAHeader.headers_128)
            // .body(StringBody(""))
            .body(ElFileBody("SDOAllocatedJudgeContinue.json")).asJson
            .check(status.in(200, 304)))

      .exec(http("XUI${service}_070_010_AllocatedJudgeContinueProfile")
            .get("/data/internal/profile")
            .headers(FPLAHeader.headers_130)
            .check(status.in(200, 304)))


      .pause(MinThinkTimeSDO, MaxThinkTimeSDO)

      .exec(http("XUI${service}_080_005_AllocatedJudgeSaveContinue")
            .post("/data/cases/${caseId}/events")
            .headers(FPLAHeader.headers_133)
            //  .body(StringBody(""))
            .body(ElFileBody("SDOAllocatedJudgeSaveContinue.json")).asJson
            .check(status.in(200, 304)))


      .exec(http("XUI${service}_080_010_AllocatedJudgeSaveViewCase")
            .get("/data/internal/cases/${caseId}")
            .headers(FPLAHeader.headers_135)
            .check(status.in(200, 304)))

      .exec(http("XUI${service}_080_015_AllocatedJudgeSaveViewCaseUnDefined")
            .get("/undefined/cases/${caseId}")
            .headers(FPLAHeader.headers_136)
            .check(status.in(200, 304)))

      .exec(http("XUI${service}_080_020_AllocatedJudgePaymentGroups")
            .get("/payments/cases/${caseId}/paymentgroups")
            .headers(FPLAHeader.headers_137)
            .check(status.in(200, 304, 403)))

      .pause(MinThinkTimeSDO, MaxThinkTimeSDO)

      //enter hearing booking details

      .exec(http("XUI${service}_090_005_HearingBookingDetailsGo")
      .get("/data/internal/cases/${caseId}/event-triggers/hearingBookingDetails?ignore-warning=false")
      .headers(FPLAHeader.headers_100)
      .check(jsonPath("$.event_token").saveAs("event_token_sdo_hearingbooking"))
        .check(jsonPath("$..id").find(4).optional.saveAs("hearingDetails"))
      .check(status.in(200, 304)))

      .exec(http("XUI${service}_090_010_HearingBookingDetailsProfile")
        .get("/data/internal/profile")
        .headers(FPLAHeader.headers_102)
        .check(status.in(200, 304)))

      .pause(MinThinkTimeSDO, MaxThinkTimeSDO)

      .exec(http("XUI${service}_100_005_HearingBookingDetailsContinue")
        .post("/data/case-types/CARE_SUPERVISION_EPO/validate?pageId=hearingBookingDetails1")
        .headers(FPLAHeader.headers_106)
            //.body(StringBody(""))
            .body(ElFileBody("SDOHearingBookingDetailsContinue.json")).asJson
            .check(status.in(200, 304)))

      .exec(http("XUI${service}_100_010_HearingBookingDetailsContinueProfile")
        .get("/data/internal/profile")
        .headers(FPLAHeader.headers_109)
        .check(status.in(200, 304)))


      .pause(MinThinkTimeSDO, MaxThinkTimeSDO)

      .exec(http("XUI${service}_110_005_HearingBookingDetailsSaveContinue")
        .post("/data/cases/${caseId}/events")
        .headers(FPLAHeader.headers_112)
            // .body(StringBody(""))
            .body(ElFileBody("SDOHearingBookingDetailsSaveContinue.json")).asJson
            .check(status.in(200, 304)))


      .exec(http("XUI${service}_110_010_HearingBookingDetailsSaveViewCase")
        .get("/data/internal/cases/${caseId}")
        .headers(FPLAHeader.headers_114)
        .check(status.in(200, 304)))

      .exec(http("XUI${service}_110_015_HearingBookingDetailsSaveViewCaseUnDefined")
        .get("/undefined/cases/${caseId}")
        .headers(FPLAHeader.headers_115)
        .check(status.in(200, 304)))

      .exec(http("XUI${service}_110_020_HearingBookingPaymentGroups")
        .get("/payments/cases/${caseId}/paymentgroups")
        .headers(FPLAHeader.headers_116)
        .check(status.in(200, 304, 403)))

      .pause(MinThinkTimeSDO, MaxThinkTimeSDO)

  //enter send to gatekeeper details

    .exec(http("XUI${service}_120_005_SendToGateKeeperGo")
    .get("/data/internal/cases/${caseId}/event-triggers/sendToGatekeeper?ignore-warning=false")
    .headers(FPLAHeader.headers_142)
    .check(jsonPath("$.event_token").saveAs("event_token_sdo_gk"))
        .check(jsonPath("$..id").find(6).optional.saveAs("gateKeeperEmail"))
    .check(status.in(200, 304)))

    .exec(http("XUI${service}_120_010_SendToGateKeeperProfile")
      .get("/data/internal/profile")
      .headers(FPLAHeader.headers_145)
      .check(status.in(200, 304)))

      .pause(MinThinkTimeSDO, MaxThinkTimeSDO)

    .exec(http("XUI${service}_130_005_SendToGateKeeperContinue")
          .post("/data/case-types/CARE_SUPERVISION_EPO/validate?pageId=sendToGatekeeper1")
          .headers(FPLAHeader.headers_148)
          .body(ElFileBody("SDOSendToGateKeeperContinue.json")).asJson
          .check(status.in(200, 304)))

    .exec(http("XUI${service}_130_010_SendToGateKeeperContinueProfile")
      .get("/data/internal/profile")
      .headers(FPLAHeader.headers_151)
      .check(status.in(200, 304)))


      .pause(MinThinkTimeSDO, MaxThinkTimeSDO)

    .exec(http("XUI${service}_140_005_SendToGateKeeperSaveContinue")
          .post("/data/cases/${caseId}/events")
          .headers(FPLAHeader.headers_154)
          .body(ElFileBody("SDOSendToGateKeeperSaveContinue.json")).asJson
          .check(status.in(200, 304)))

    .exec(http("XUI${service}_140_010_SendToGateKeeperSaveViewCase")
      .get("/data/internal/cases/${caseId}")
      .headers(FPLAHeader.headers_156)
      .check(status.in(200, 304)))

    .exec(http("XUI${service}_140_015_SendToGateKeeperSaveViewCaseUndefined")
      .get("/undefined/cases/${caseId}")
      .headers(FPLAHeader.headers_157)
      .check(status.in(200, 304)))

    .exec(http("XUI${service}_140_020_SendToGateKeeperPaymentGroups")
      .get("/payments/cases/${caseId}/paymentgroups")
      .headers(FPLAHeader.headers_158)
      .check(status.in(200, 304, 403)))

      .pause(MinThinkTimeSDO, MaxThinkTimeSDO)

  val fplviewcaseforsdoasgatekeeper =

        exec(session => session.set("currentDate", timeStamp))
        .exec(http("XUI${service}_150_005_SearchPage")
        .get("/aggregated/caseworkers/:uid/jurisdictions?access=read")
        .headers(FPLAHeader.headers_search)
        .check(status.in(200, 304)))


        .exec(http("XUI${service}_150_010_SearchPaginationMetaData")
          .get("/aggregated/caseworkers/:uid/jurisdictions/PUBLICLAW/case-types/CARE_SUPERVISION_EPO/cases?view=SEARCH&page=1&state=Gatekeeping&case_reference=${caseId}")
          .headers(FPLAHeader.headers_236)
          .check(status.in(200, 304)))

        .exec(http("XUI${service}_150_015_SearchResults")
          .get("/data/caseworkers/:uid/jurisdictions/PUBLICLAW/case-types/CARE_SUPERVISION_EPO/cases/pagination_metadata?state=Gatekeeping&case_reference=${caseId}")
          .headers(FPLAHeader.headers_237)
          .check(status.in(200, 304)))


      .pause(MinThinkTimeSDO, MaxThinkTimeSDO)

      .exec(http("XUI${service}_160_005_ViewCase")
        .get("/data/internal/cases/${caseId}")
        .headers(FPLAHeader.headers_241)
        .check(status.in(200, 304)))
        // .check(regex("""internal/documents/(.+?)","document_filename""").find(0).saveAs("Document_ID"))
        //.check(status.is(200))




      .exec(http("XUI${service}_160_010_ViewcaseUndefined")
        .get("/undefined/cases/${caseId}")
        .headers(FPLAHeader.headers_242)
        .check(status.in(200, 304)))

      .exec(http("XUI${service}_160_015_PaymentGroups")
        .get("/payments/cases/${caseId}/paymentgroups")
        .headers(FPLAHeader.headers_243)
        .check(status.in(200, 304,403)))

      .pause(MinThinkTimeSDO, MaxThinkTimeSDO)

  val fplasdogatekeeperactivities =
  //enter draft sdo details
    exec(http("XUI${service}_180_005_DraftSDOGo")
      .get("/data/internal/cases/${caseId}/event-triggers/draftSDO?ignore-warning=false")
      .headers(FPLAHeader.headers_248)
      .check(status.in(200, 304))
      .check(jsonPath("$.event_token").saveAs("event_token_sdo_draft"))
      .check(jsonPath("$..id").find(148).optional.saveAs("code145"))
      .check(jsonPath("$..id").find(149).optional.saveAs("code146"))
      .check(jsonPath("$..id").find(150).optional.saveAs("code147"))
      .check(jsonPath("$..id").find(151).optional.saveAs("code148"))
      .check(jsonPath("$..id").find(152).optional.saveAs("code149"))
     // .check(jsonPath("$..id").find(149).optional.saveAs("code150"))
      .check(jsonPath("$..id").find(326).optional.saveAs("code323"))
      .check(jsonPath("$..id").find(327).optional.saveAs("code324"))
      .check(jsonPath("$..id").find(328).optional.saveAs("code325"))
      .check(jsonPath("$..id").find(329).optional.saveAs("code326"))
      .check(jsonPath("$..id").find(330).optional.saveAs("code327"))
      .check(jsonPath("$..id").find(331).optional.saveAs("code328"))
      .check(jsonPath("$..id").find(332).optional.saveAs("code329"))
      .check(jsonPath("$..id").find(682).optional.saveAs("code679"))
      .check(jsonPath("$..id").find(508).optional.saveAs("code505"))
      .check(jsonPath("$..id").find(509).optional.saveAs("code506"))
      .check(jsonPath("$..id").find(510).optional.saveAs("code507"))
      .check(jsonPath("$..id").find(852).optional.saveAs("code849"))
      .check(jsonPath("$..id").find(1022).optional.saveAs("code1019"))

    )
    /* .exec( session => {
              println("the code of id is "+session("code145").as[String])
          session
        })*/

      .exec(http("XUI${service}_180_010_DraftSDOGoProfile")
        .get("/data/internal/profile")
        .headers(FPLAHeader.headers_251)
        .check(status.in(200, 304)))

      .pause(MinThinkTimeSDO, MaxThinkTimeSDO)

      //new request
      .exec(http("XUI${service}_190_DraftSDODateOfIssue")
      .post("/data/case-types/CARE_SUPERVISION_EPO/validate?pageId=draftSDOSdoDateOfIssue")
      .headers(FPLAHeader.headers_254)
      //.body(StringBody(""))
            .body(ElFileBody("SDODateOfIssue.json")).asJson
      .check(status.in(200, 304)))
      .pause(MinThinkTimeSDO, MaxThinkTimeSDO)

      //new request

      .exec(http("XUI${service}_200_DraftSDOJudgeAndLegal")
      .post("/data/case-types/CARE_SUPERVISION_EPO/validate?pageId=draftSDOjudgeAndLegalAdvisor")
      .headers(FPLAHeader.headers_254)
            // .body(StringBody(""))
            .body(ElFileBody("SDOJudgeAndLegalAdvisor.json")).asJson
            .check(status.in(200, 304)))
      .pause(MinThinkTimeSDO, MaxThinkTimeSDO)

      //new request

      .exec(http("XUI${service}_210_DraftSDOAllPartiesDirection")
      .post("/data/case-types/CARE_SUPERVISION_EPO/validate?pageId=draftSDOallPartiesDirections")
      .headers(FPLAHeader.headers_254)
            //  .body(StringBody(""))
            .body(ElFileBody("SDOAllPartiesDirection.json")).asJson
            .check(status.in(200, 304)))

      .pause(MinThinkTimeSDO, MaxThinkTimeSDO)

      //new request

      .exec(http("XUI${service}_220_DraftSDOLocalAuthorityDirection")
      .post("/data/case-types/CARE_SUPERVISION_EPO/validate?pageId=draftSDOlocalAuthorityDirections")
      .headers(FPLAHeader.headers_254)
            //   .body(StringBody(""))
            .body(ElFileBody("SDOLocalAuthorityDirection.json")).asJson
            .check(status.in(200, 304)))
      .pause(MinThinkTimeSDO, MaxThinkTimeSDO)

      //new request
      .exec(http("XUI${service}_230_DraftSDORespondantDirection")
      .post("/data/case-types/CARE_SUPERVISION_EPO/validate?pageId=draftSDOparentsAndRespondentsDirections")
      .headers(FPLAHeader.headers_254)
            // .body(StringBody(""))
            .body(ElFileBody("SDORespondantDirection.json")).asJson
    )
      .pause(MinThinkTimeSDO, MaxThinkTimeSDO)
      //new request
      .exec(http("XUI${service}_240_DraftSDOcafcasDirections")
      .post("/data/case-types/CARE_SUPERVISION_EPO/validate?pageId=draftSDOcafcassDirections")
      .headers(FPLAHeader.headers_254)
            //  .body(StringBody(""))
            .body(ElFileBody("SDOcafcasDirections.json")).asJson
            .check(status.in(200, 304)))
      .pause(MinThinkTimeSDO, MaxThinkTimeSDO)
      //next request

      .exec(http("XUI${service}_250_DraftSDOOtherPartiesDirections")
      .post("/data/case-types/CARE_SUPERVISION_EPO/validate?pageId=draftSDOotherPartiesDirections")
      .headers(FPLAHeader.headers_254)
            //.body(StringBody(""))
            .body(ElFileBody("SDOOtherPartiesDirections.json")).asJson
            .check(status.in(200, 304)))
      .pause(MinThinkTimeSDO, MaxThinkTimeSDO)

      //next request
      .exec(http("XUI${service}_260_DraftSDOCourtDirections")
      .post("/data/case-types/CARE_SUPERVISION_EPO/validate?pageId=draftSDOcourtDirections")
      .headers(FPLAHeader.headers_254)
            // .body(StringBody(""))
            .body(ElFileBody("SDOCourtDirections.json")).asJson
            .check(status.in(200, 304))
            .check(regex("""internal/documents/(.*?)","document_filename""").find(0).saveAs("DocumentID")))


      .pause(MinThinkTimeSDO, MaxThinkTimeSDO)

     /* .exec( session => {
        println("document value is "+session("DocumentID").as[String])
        session
      })*/



      //next request
      .exec(http("XUI${service}_270_005_DraftSDODocumentReview")
      .post("/data/case-types/CARE_SUPERVISION_EPO/validate?pageId=draftSDOdocumentReview")
      .headers(FPLAHeader.headers_254)
            // .body(StringBody(""))
            .body(ElFileBody("SDODocumentReview.json")).asJson
            .check(status.in(200, 304)))

      .exec(http("XUI${service}_270_010_DraftSDODocumentReviewProfile")
        .get("/data/internal/profile")
        .headers(FPLAHeader.headers_298)
      .check(status.in(200, 304)))

      .pause(MinThinkTimeSDO, MaxThinkTimeSDO)


      //next request

      .exec(http("XUI${service}_280_005_DraftSDOFinalView")
      .post("/data/cases/${caseId}/events")
      .headers(FPLAHeader.headers_301)
            // .body(StringBody(""))
            .body(ElFileBody("SDOFinalView.json")).asJson
            .check(status.in(200, 304)))


      .exec(http("XUI${service}_280_010_DraftSDOFinalView1")
        .get("/data/internal/cases/${caseId}")
        .headers(FPLAHeader.headers_304)
        .check(status.in(200, 304)))

      .exec(http("XUI${service}_280_015_DraftSDOFinalView1Undefined")
        .get("/undefined/cases/${caseId}")
        .headers(FPLAHeader.headers_305)
      .check(status.in(200, 304)))

      .exec(http("XUI${service}_280_020_DraftSDOPaymentGroups")
        .get("/payments/cases/${caseId}/paymentgroups")
        .headers(FPLAHeader.headers_306)
        .check(status.is(403)))

      .pause(MinThinkTimeSDO, MaxThinkTimeSDO)




  //following is the journey for SDO after FPLA case is created

  //step1:access homepage
  //https://manage-case.perftest.platform.hmcts.net/external/config/ui
  //https://manage-case.perftest.platform.hmcts.net/api/configuration?configurationKey=termsAndConditionsEnabled

  //step2:login page
  //https://manage-case.perftest.platform.hmcts.net/external/config/ui
  //https://manage-case.perftest.platform.hmcts.net/api/configuration?configurationKey=termsAndConditionsEnabled
  //4 reads https://manage-case.perftest.platform.hmcts.net/aggregated/caseworkers/:uid/jurisdictions?access=read
  //one work basket input
  //https://manage-case.perftest.platform.hmcts.net/data/internal/case-types/CARE_SUPERVISION_EPO/work-basket-inputs
  //https://manage-case.perftest.platform.hmcts.net/aggregated/caseworkers/:uid/jurisdictions?access=read

  //Step3: now find acase with submitted and casenumber
  //https://manage-case.perftest.platform.hmcts.net/aggregated/caseworkers/:uid/jurisdictions/PUBLICLAW/case-types/CARE_SUPERVISION_EPO/cases?view=SEARCH&page=1&state=Submitted&case_reference=1589913815676227
  //https://manage-case.perftest.platform.hmcts.net/data/internal/case-types/CARE_SUPERVISION_EPO/search-inputs

  //step4: click on case
  //https://manage-case.perftest.platform.hmcts.net/data/internal/cases/1589913815676227
  //https://manage-case.perftest.platform.hmcts.net/data/internal/case-types/CARE_SUPERVISION_EPO/search-inputs
  //https://manage-case.perftest.platform.hmcts.net/data/internal/cases/1589913815676227
  //https://manage-case.perftest.platform.hmcts.net/undefined/cases/1589913815676227
  //https://manage-case.perftest.platform.hmcts.net/payments/cases/1589913815676227/paymentgroups-403 error

  //step5: add case number -
  //https://manage-case.perftest.platform.hmcts.net/data/internal/cases/1589913815676227/event-triggers/addFamilyManCaseNumber?ignore-warning=false
  //profile-https://manage-case.perftest.platform.hmcts.net/data/internal/profile

  //step6: enter family case number
  //https://manage-case.perftest.platform.hmcts.net/data/case-types/CARE_SUPERVISION_EPO/validate?pageId=addFamilyManCaseNumber1
  //profile

  //step7: save and continue
  //https://manage-case.perftest.platform.hmcts.net/data/cases/1589913815676227/events
  //https://manage-case.perftest.platform.hmcts.net/data/internal/cases/1589913815676227
  //https://manage-case.perftest.platform.hmcts.net/payments/cases/1589913815676227/paymentgroup-403
  //https://manage-case.perftest.platform.hmcts.net/undefined/cases/1589913815676227

  //step8: add hearing details
  //https://manage-case.perftest.platform.hmcts.net/data/internal/cases/1589913815676227/event-triggers/hearingBookingDetails?ignore-warning=false
  //https://manage-case.perftest.platform.hmcts.net/data/internal/profile


  //step9: enter hearing details
  //https://manage-case.perftest.platform.hmcts.net/data/case-types/CARE_SUPERVISION_EPO/validate?pageId=hearingBookingDetails1
  //https://manage-case.perftest.platform.hmcts.net/data/internal/profile

  // step10: hearing details save and continue
  //https://manage-case.perftest.platform.hmcts.net/data/cases/1589913815676227/events
  //https://manage-case.perftest.platform.hmcts.net/data/internal/cases/1589913815676227
  //https://manage-case.perftest.platform.hmcts.net/payments/cases/1589913815676227/paymentgroup-403
  //https://manage-case.perftest.platform.hmcts.net/undefined/cases/1589913815676227

  //step11: allocated judgego
  //https://manage-case.perftest.platform.hmcts.net/data/internal/cases/1589913815676227/event-triggers/allocatedJudge?ignore-warning=false
  //https://manage-case.perftest.platform.hmcts.net/data/internal/profile

  //step12: enter judge details
  //https://manage-case.perftest.platform.hmcts.net/data/case-types/CARE_SUPERVISION_EPO/validate?pageId=allocatedJudgeAllocatedJudge
  //https://manage-case.perftest.platform.hmcts.net/data/internal/profile

  //step12: judgedetailessaveandcontinue
  //https://manage-case.perftest.platform.hmcts.net/data/cases/1589913815676227/events
  //https://manage-case.perftest.platform.hmcts.net/data/internal/cases/1589913815676227
  //https://manage-case.perftest.platform.hmcts.net/payments/cases/1589913815676227/paymentgroup
  //https://manage-case.perftest.platform.hmcts.net/undefined/cases/1589913815676227

  //step13: send to gatekeeper
  //https://manage-case.perftest.platform.hmcts.net/data/internal/cases/1589913815676227/event-triggers/sendToGatekeeper?ignore-warning=false
  //https://manage-case.perftest.platform.hmcts.net/data/internal/profile

  //step14: gate keeper continue
  //https://manage-case.perftest.platform.hmcts.net/data/case-types/CARE_SUPERVISION_EPO/validate?pageId=sendToGatekeeper1
  //https://manage-case.perftest.platform.hmcts.net/data/internal/profile

  //step15: gate keeper final step
  //https://manage-case.perftest.platform.hmcts.net/data/cases/1589913815676227/events
  //https://manage-case.perftest.platform.hmcts.net/data/internal/cases/1589913815676227
  //https://manage-case.perftest.platform.hmcts.net/payments/cases/1589913815676227/paymentgroup-403
  //https://manage-case.perftest.platform.hmcts.net/undefined/cases/1589913815676227

  //step16: signout of admin
  //https://manage-case.perftest.platform.hmcts.net/external/config/ui
  //https://manage-case.perftest.platform.hmcts.net/api/configuration?configurationKey=termsAndConditionsEnabled

  //step17: login as gate keeper
  //all login requests

  //step18: search for the case as gate keeper
  //https://manage-case.perftest.platform.hmcts.net/data/caseworkers/:uid/jurisdictions/PUBLICLAW/case-types/CARE_SUPERVISION_EPO/cases/pagination_metadata?state=Gatekeeping&case_reference=1589913815676227
  //https://manage-case.perftest.platform.hmcts.net/aggregated/caseworkers/:uid/jurisdictions/PUBLICLAW/case-types/CARE_SUPERVISION_EPO/cases?view=SEARCH&page=1&state=Gatekeeping&case_reference=1589913815676227

  //step : click on case for gate keeper
  //https://manage-case.perftest.platform.hmcts.net/data/internal/cases/1589913815676227
  //https://manage-case.perftest.platform.hmcts.net/payments/cases/1589913815676227/paymentgroup
  //https://manage-case.perftest.platform.hmcts.net/undefined/cases/1589913815676227


  //step : draft standard directions go after login as gate keeper
  //https://manage-case.perftest.platform.hmcts.net/data/internal/cases/1589913815676227/event-triggers/draftSDO?ignore-warning=false
  //https://manage-case.perftest.platform.hmcts.net/data/internal/profile
  //issue date to be addressed as current date
  //step : issue date-sdo
  //https://manage-case.perftest.platform.hmcts.net/data/case-types/CARE_SUPERVISION_EPO/validate?pageId=draftSDOSdoDateOfIssue

  //step: judge and justice legal advisor-sdo
  //https://manage-case.perftest.platform.hmcts.net/data/case-types/CARE_SUPERVISION_EPO/validate?pageId=draftSDOjudgeAndLegalAdvisor

  //step: do all party directions-sdo
  //https://manage-case.perftest.platform.hmcts.net/data/case-types/CARE_SUPERVISION_EPO/validate?pageId=draftSDOallPartiesDirections

  //step: local autjority directions-sdo
  //https://manage-case.perftest.platform.hmcts.net/data/case-types/CARE_SUPERVISION_EPO/validate?pageId=draftSDOlocalAuthorityDirections

  //step: parent and respondant
  //https://manage-case.perftest.platform.hmcts.net/data/case-types/CARE_SUPERVISION_EPO/validate?pageId=draftSDOparentsAndRespondentsDirections

  //step: cafcas directions
  //https://manage-case.perftest.platform.hmcts.net/data/case-types/CARE_SUPERVISION_EPO/validate?pageId=draftSDOcafcassDirections

  //step: other party directions
  //https://manage-case.perftest.platform.hmcts.net/data/case-types/CARE_SUPERVISION_EPO/validate?pageId=draftSDOotherPartiesDirections

  //step: court directions
  //https://manage-case.perftest.platform.hmcts.net/data/case-types/CARE_SUPERVISION_EPO/validate?pageId=draftSDOcourtDirections

  //step: document review and profile
  //https://manage-case.perftest.platform.hmcts.net/data/case-types/CARE_SUPERVISION_EPO/validate?pageId=draftSDOdocumentReview
  //https://manage-case.perftest.platform.hmcts.net/data/internal/profile

  //step: events sdo
  //https://manage-case.perftest.platform.hmcts.net/data/cases/1589913815676227/events
  //https://manage-case.perftest.platform.hmcts.net/data/internal/cases/1589913815676227
  //https://manage-case.perftest.platform.hmcts.net/payments/cases/1589913815676227/paymentgroup
  //https://manage-case.perftest.platform.hmcts.net/undefined/cases/1589913815676227


  //step: signout
  //https://manage-case.perftest.platform.hmcts.net/data/internal/cases/1589913815676227
  //https://manage-case.perftest.platform.hmcts.net/external/config/ui
  //https://manage-case.perftest.platform.hmcts.net/api/configuration?configurationKey=termsAndConditionsEnabled


}