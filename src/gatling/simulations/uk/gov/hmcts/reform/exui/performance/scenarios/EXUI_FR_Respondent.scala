package uk.gov.hmcts.reform.exui.performance.scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import uk.gov.hmcts.reform.exui.performance.scenarios.utils.Environment
import uk.gov.hmcts.reform.exui.performance.scenarios.utils.Environment._
import uk.gov.hmcts.reform.exui.performance.scenarios.utils.FR_Respondent_Header._

object EXUI_FR_Respondent {

	val minThinkTime = Environment.minThinkTimeFR
	val maxThinkTime = Environment.maxThinkTimeFR

	val manageOrgURL=manageOrdURL

	val shareCase = scenario("ShareCase")
		.exec(http("XUI${service}_030_UnassignedCases")
			.post(manageOrgURL+"/api/unassignedCaseTypes")
			.headers(headers_37)
		.check(status in (200,304)))
		.pause(minThinkTime, maxThinkTime)

		.exec(http("XUI${service}_040_FRConsented")
			.post(manageOrgURL+"/api/unassignedcases?caseTypeId=FinancialRemedyConsentedRespondent")
			.headers(headers_38)
			.check(status in (200,304)))
		.pause(minThinkTime, maxThinkTime)

		.exec(http("XUI${service}_050_ShareCaseByCaseId")
			.get(manageOrgURL+"/api/caseshare/cases?case_ids=${caseId}")
			.headers(headers_9)
			.check(status in (200,304)))
		.pause(minThinkTime, maxThinkTime)

		.exec(http("XUI${service}_060_ShareCaseUsers")
			.get(manageOrgURL+"/api/caseshare/users")
			.headers(headers_9)
			.check(jsonPath("$..email").saveAs("email"))
			.check(jsonPath("$..firstName").saveAs("firstName"))
			.check(jsonPath("$..idamId").saveAs("idamId"))
			.check(jsonPath("$..lastName").saveAs("lastName"))
			.check(status in (200,304)))
		.pause(minThinkTime, maxThinkTime)

		.exec(http("XUI${service}_070_ShareCaseAssignments")
			.post(manageOrgURL+"/api/caseshare/case-assignments")
			.headers(headers_54)
			.body(StringBody("""{
					 |    "sharedCases":
					 |    [
					 |        {"caseId":"${caseId}",
					 |        "caseTitle":"Baker Vs Parker",
					 |        "caseTypeId":"FinancialRemedyConsentedRespondent",
					 |        "pendingShares":
					 |        [
					 |            {"email":"${email}",
					 |            "firstName":"${firstName}",
					 |            "idamId":"${idamId}",
					 |            "lastName":"${lastName}"}
					 |        ],
					 |        "pendingUnshares":[]}
					 |    ]
					 |}""".stripMargin))
			.check(status in (201,304)))
		.pause(minThinkTime, maxThinkTime)

}
