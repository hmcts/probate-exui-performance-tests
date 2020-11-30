package uk.gov.hmcts.reform.exui.performance.scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import uk.gov.hmcts.reform.exui.performance.scenarios.utils.{DivorceHeader, Environment}

object EXUIDivorceMC {


  //val BaseURL = Environment.baseURL
  val IdamUrl = Environment.idamURL
  val baseURL=Environment.baseURL
  //val loginFeeder = csv("OrgId.csv").circular

  val MinThinkTime = Environment.minThinkTimeDIV
  val MaxThinkTime = Environment.maxThinkTimeDIV



  /*val casedetails =


      .pause(MinThinkTime , MaxThinkTime )
*/

  val casecreation=

      exec(http("XUI${service}_040_CreateCase")
        .get("/aggregated/caseworkers/:uid/jurisdictions?access=create")
        .headers(DivorceHeader.headers_accessCreate)
        .check(status.in(200, 304)))

    .pause(MinThinkTime, MaxThinkTime)

      .exec(http("XUI${service}_050_005_StartCreateCase1")
      .get("/data/internal/case-types/DIVORCE_XUI/event-triggers/solicitorCreate?ignore-warning=false")
      .headers(DivorceHeader.headers_27)
      .check(status.in(200,304))
      .check(jsonPath("$.event_token").optional.saveAs("event_token")))

      .exec(http("XUI${service}_050_010_StartCreateCase2")
      .get("/data/internal/case-types/DIVORCE_XUI/event-triggers/solicitorCreate?ignore-warning=false")
      .headers(DivorceHeader.headers_27)
        .check(status.in(200,304)))

    .exec(http("XUI${service}_050_015_CreateCaseProfile")
      .get("/data/internal/profile")
      .headers(DivorceHeader.headers_31)
      .check(status.in(200,304))).exitHereIfFailed

      .exec(http("XUI${service}_050_020_ShareCaseOrg")
            .get("/api/caseshare/orgs")
            .headers(DivorceHeader.headers_shareorgs)
            .check(status.in(200,304)))

      .pause(MinThinkTime, MaxThinkTime)


      .exec(http("XUI${service}_060_CreateApplication")
      .post("/data/case-types/DIVORCE_XUI/validate?pageId=solicitorCreatesolicitorCreate")
      .headers(DivorceHeader.headers_soldata)
      .body(ElFileBody("RecordedSimulationSC_0123_request.json")).asJson
      .check(status.in(200,304)))

      .pause(MinThinkTime, MaxThinkTime)

      .exec(http("XUI${service}_070_SolicitorDetails")
      .post("/data/case-types/DIVORCE_XUI/validate?pageId=solicitorCreateSolAboutTheSolicitor")
        .headers(DivorceHeader.headers_aboutsol)
      .body(ElFileBody("RecordedSimulationSC_0127_request.json")).asJson
      .check(status.is(200)))
      .pause(MinThinkTime, MaxThinkTime)

      .exec(http("XUI${service}_080_PetitionerDetails")
            .post("/data/case-types/DIVORCE_XUI/validate?pageId=solicitorCreateSolAboutThePetitioner")
            .headers(DivorceHeader.headers_aboutpetitioner)
            .body(ElFileBody("RecordedSimulationSC_0132_request.json")).asJson
            .check(status.is(200)))
      .pause(MinThinkTime, MaxThinkTime)

      .exec(http("XUI${service}_090_RespondantDetails")
            .post("/data/case-types/DIVORCE_XUI/validate?pageId=solicitorCreateSolAboutTheRespondent")
            .headers(DivorceHeader.headers_headerRespondant)
            .body(ElFileBody("RecordedSimulationSC_0136_request.json")).asJson
            .check(status.is(200)))
      .pause(MinThinkTime, MaxThinkTime)

      .exec(http("XUI${service}_100_MarriageCertificate")
            .post("/data/case-types/DIVORCE_XUI/validate?pageId=solicitorCreateSolMarriageCertificate")
            .headers(DivorceHeader.headers_marriagecertificate)
            .body(ElFileBody("RecordedSimulationSC_0141_request.json")).asJson
            .check(status.is(200)))
      .pause(MinThinkTime, MaxThinkTime)

      .exec(http("XUI${service}_110_SolJurisdiction")
            .post("/data/case-types/DIVORCE_XUI/validate?pageId=solicitorCreateSolJurisdiction")
            .headers(DivorceHeader.headers_createjurisdiction)
            .body(ElFileBody("RecordedSimulationSC_0145_request.json")).asJson
            .check(status.is(200)))
      .pause(MinThinkTime, MaxThinkTime)

      .exec(http("XUI${service}_120_ReasonForDivorce")
            .post("/data/case-types/DIVORCE_XUI/validate?pageId=solicitorCreateSolReasonForDivorce")
            .headers(DivorceHeader.headers_reasonfordiv)
            .body(ElFileBody("RecordedSimulationSC_0150_request.json")).asJson
            .check(status.is(200)))
      .pause(MinThinkTime, MaxThinkTime)

      .exec(http("XUI${service}_130_Behaviour")
            .post("/data/case-types/DIVORCE_XUI/validate?pageId=solicitorCreateSolSOCBehaviour1")
            .headers(DivorceHeader.headers_behaviour)
            .body(ElFileBody("RecordedSimulationSC_0155_request.json")).asJson
            .check(status.is(200)))
      .pause(MinThinkTime, MaxThinkTime)

      .exec(http("XUI${service}_140_ExistingCourtCases")
            .post("/data/case-types/DIVORCE_XUI/validate?pageId=solicitorCreateSolExistingCourtCases")
            .headers(DivorceHeader.headers_courtcases)
            .body(ElFileBody("RecordedSimulationSC_0160_request.json")).asJson
            .check(status.is(200)))
      .pause(MinThinkTime, MaxThinkTime)

      .exec(http("XUI${service}_150_DivideProperty")
            .post("/data/case-types/DIVORCE_XUI/validate?pageId=solicitorCreateSolDividingMoneyAndProperty")
            .headers(DivorceHeader.headers_devideprops)
            .body(ElFileBody("RecordedSimulationSC_0165_request.json")).asJson
            .check(status.is(200)))
      .pause(MinThinkTime, MaxThinkTime)

      .exec(http("XUI${service}_160_ClaimCosts")
            .post("/data/case-types/DIVORCE_XUI/validate?pageId=solicitorCreateSolApplyToClaimCosts")
            .headers(DivorceHeader.headers_claimcosts)
            .body(ElFileBody("RecordedSimulationSC_0170_request.json")).asJson
            .check(status.is(200)))
      .pause(MinThinkTime, MaxThinkTime)

      .exec(http("XUI${service}_170_UploadDocs")
            .post("/data/case-types/DIVORCE_XUI/validate?pageId=solicitorCreateSolUploadDocs")
            .headers(DivorceHeader.headers_upload)
            .body(ElFileBody("RecordedSimulationSC_0175_request.json")).asJson
            .check(status.is(200)))
      .pause(MinThinkTime, MaxThinkTime)

      .exec(http("XUI${service}_180_005_CreateLangPref")
            .post("/data/case-types/DIVORCE_XUI/validate?pageId=solicitorCreatelangPref")
            .headers(DivorceHeader.headers_langpref)
            .body(ElFileBody("RecordedSimulationSC_0180_request.json")).asJson
            .check(status.is(200)))

      .exec(http("XUI${service}_180_010_LangPrefProfile")
      .get("/data/internal/profile")
      .headers(DivorceHeader.headers_internalprofile)
        .check(status.in(200,304)))
      .pause(MinThinkTime, MaxThinkTime)

      .exec(http("XUI${service}_190_005_ApplicationDraftfinal")
            .post("/data/case-types/DIVORCE_XUI/cases?ignore-warning=false")
            .headers(DivorceHeader.headers_ignorewarning)
            .body(ElFileBody("RecordedSimulationSC_0186_request.json")).asJson
            .check(status.is(200))
      .check(jsonPath("$.id").optional.saveAs("caseId")))
    /*.exec( session => {
             println("the case Id is  "+session("caseId").as[String])
             session
           })*/

    .exec(http("XUI${service}_190_010_ApplicationDraftfinalProfile")
  .get("/data/internal/cases/${caseId}")
  .headers(DivorceHeader.headers_datainternal)
      .check(status.in(200,304)))
      .pause(MinThinkTime, MaxThinkTime)


    /*.exec(http("request_59")
  .get("/api/monitoring-tools")
  .headers(DivorceHeader.headers_2)
      .check(status.is(200)))
      .pause(MinThinkTime, MaxThinkTime)


      .exec(http("XUI${service}_080_005_ApplicationDraft")
            .get("/data/internal/cases/1600677150585534/event-triggers/solicitorStatementOfTruthPaySubmit?ignore-warning=false")
            .headers(DivorceHeader.headers_65)
            .check(status.is(200))
      .check(jsonPath("$.event_token").optional.saveAs("event_token_submit")))

      .exec(http("XUI${service}_080_005_ApplicationDraft")
            .get("/data/internal/profile")
            .headers(DivorceHeader.headers_67)
            .check(status.is(200)))
      .pause(MinThinkTime, MaxThinkTime)

      .exec(http("request_69")
            .post("/data/case-types/DIVORCE_XUI/validate?pageId=solicitorStatementOfTruthPaySubmitSolStatementOfTruth")
            .headers(DivorceHeader.headers_69)
            .body(RawFileBody("RecordedSimulationDiv_0069_request.json"))
        .check(status.is(200)))
      .pause(MinThinkTime, MaxThinkTime)

      .exec(http("request_73")
            .post("/data/case-types/DIVORCE_XUI/validate?pageId=solicitorStatementOfTruthPaySubmitSolPayment")
            .headers(DivorceHeader.headers_73)
            .body(RawFileBody("RecordedSimulationDiv_0073_request.json"))
        .check(status.is(200)))
      .pause(MinThinkTime, MaxThinkTime)

      .exec(http("request_75")
            .post("/data/case-types/DIVORCE_XUI/validate?pageId=solicitorStatementOfTruthPaySubmitSolPaymentSummary")
            .headers(DivorceHeader.headers_75)
            .body(RawFileBody("RecordedSimulationDiv_0075_request.json"))
        .check(status.is(200)))
      .pause(MinThinkTime, MaxThinkTime)

      .exec(http("request_78")
            .post("/data/case-types/DIVORCE_XUI/validate?pageId=solicitorStatementOfTruthPaySubmitSolSummary")
            .headers(DivorceHeader.headers_78)
            .body(RawFileBody("RecordedSimulationDiv_0078_request.json"))
        .check(status.is(200)))
      .exec(http("XUI${service}_080_005_ApplicationDraft")
            .get("/data/internal/profile")
            .headers(DivorceHeader.headers_82)
            .check(status.is(200)))
      .pause(MinThinkTime, MaxThinkTime)

      .exec(http("request_83")
            .post("/data/cases/1600677150585534/events")
            .headers(DivorceHeader.headers_83)
            .body(RawFileBody("RecordedSimulationDiv_0083_request.json"))
            .check(status.is(200)))
      .exec(http("XUI${service}_080_005_85")
            .get("/data/internal/cases/1600677150585534")
            .headers(DivorceHeader.headers_85)
            .check(status.is(200)))
      .pause(MinThinkTime, MaxThinkTime)





      .exec(http("XUI${service}_090_005_CaseSubmitted")
        .post("/data/case-types/GrantOfRepresentation/cases?ignore-warning=false")
        .headers(ProbateHeader.headers_solappcreated)
        .body(ElFileBody("RecordedSimulationprobate1205_0025_request.json")).asJson
        .check(status.in(200,304))
      .check(jsonPath("$.id").optional.saveAs("caseId")))

      .exec(http("XUI${service}_090_010_ViewCase")
        .get("/data/internal/cases/${caseId}")
        .headers(ProbateHeader.headers_saveandviewcase)
        .check(status.in(200,304)))
      .pause(MinThinkTime, MaxThinkTime)*/


  val GETUsersByOrganisation = exec(http("GetUsersByOrg").get("http://rd-professional-api-perftest.service.core-compute-perftest.internal/refdata/internal/v1/organisations/${orgref}/users?returnRoles=false").header("ServiceAuthorization", "${s2sToken}").header("Authorization", " Bearer ${accessToken}").header("Content-Type", "application/json").check(status is 200)
    .check(jsonPath("$..email").find(0).optional.saveAs("user1"))
    .check(jsonPath("$..email").find(1).optional.saveAs("user2"))
    .check(jsonPath("$..email").find(2).optional.saveAs("user3"))
    .check(jsonPath("$..email").find(3).optional.saveAs("user4"))
    .check(jsonPath("$..email").find(4).optional.saveAs("user5"))
    .check(jsonPath("$..userIdentifier").find(0).optional.saveAs("userIdentifier1"))
    .check(jsonPath("$..userIdentifier").find(1).optional.saveAs("userIdentifier2"))
    .check(jsonPath("$..userIdentifier").find(2).optional.saveAs("userIdentifier3"))
    .check(jsonPath("$..userIdentifier").find(3).optional.saveAs("userIdentifier4"))
    .check(jsonPath("$..userIdentifier").find(4).optional.saveAs("userIdentifier5"))
  )
    .pause(MinThinkTime , MaxThinkTime )


  val shareacase =
      exec(http("XUI${service}_200_005_ShareACase")
    .get("/api/caseshare/cases?case_ids=${caseId}")
   .headers(DivorceHeader.headers_shareacasebyid)
    .check(status.in(200,304))
        .check(jsonPath("$..email").find(0).optional.saveAs("user0"))
        .check(jsonPath("$..firstName").find(0).optional.saveAs("firstName"))
        .check(jsonPath("$..lastName").find(0).optional.saveAs("lastName"))
        .check(jsonPath("$..idamId").find(0).optional.saveAs("idamId"))

      )

    .exec(http("XUI${service}_200_010_ShareACaseUsers")
  .get("/api/caseshare/users")
  .headers(DivorceHeader.headers_shareacasesuserslist)
      .check(status.in(200,304))
      .check(jsonPath("$..email").find(0).optional.saveAs("user1"))
      .check(jsonPath("$..firstName").find(0).optional.saveAs("firstName1"))
      .check(jsonPath("$..lastName").find(0).optional.saveAs("lastName1"))
      .check(jsonPath("$..idamId").find(0).optional.saveAs("idamId1"))
    )
        .pause(MinThinkTime , MaxThinkTime )

    .exec(http("XUI${service}_210_ShareACaseAssignments")
  .post("/api/caseshare/case-assignments")
 .headers(DivorceHeader.headers_shareacaseconfirm)
      .body(ElFileBody("RecordedSimulationSC_0229_request.json")).asJson
      .check(status.in(200,201)))
        .pause(MinThinkTime , MaxThinkTime )




}
