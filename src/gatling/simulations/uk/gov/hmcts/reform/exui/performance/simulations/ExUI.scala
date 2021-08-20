package uk.gov.hmcts.reform.exui.performance.simulations

import io.gatling.core.Predef._
import uk.gov.hmcts.reform.exui.performance.scenarios._
import uk.gov.hmcts.reform.exui.performance.scenarios.utils._

class ExUI extends Simulation {

	val BaseURL = Environment.baseURL
	val feedUserDataProbate = csv("ProbateUserData.csv").circular

  val httpProtocol = Environment.HttpProtocol
		.baseUrl(BaseURL)
		.inferHtmlResources()
		.silentResources

	/*===============================================================================================
    * XUI Solicitor Probate Scenario
     ==================================================================================================*/
	val EXUIMCaseProbateScn = scenario("Probate XUI Scenario")
		.exitBlockOnFail {
			feed(feedUserDataProbate)
				.exec(EXUIMCLogin.manageCasesHomePage)
				.exec(EXUIMCLogin.manageCaseslogin)
				.exec(EXUIProbateMC.CreateProbateCase)
				.exec(EXUIProbateMC.AddDeceasedDetails)
				.exec(EXUIProbateMC.AddApplicationDetails)
				.exec(EXUIProbateMC.ReviewAndSubmitApplication)
				.exec(EXUIMCLogin.manageCase_Logout)
		}

	setUp(
		EXUIMCaseProbateScn.inject(rampUsers(10) during (180))
	).protocols(httpProtocol)
	 .assertions(global.successfulRequests.percent.gte(95),
		forAll.successfulRequests.percent.gte(80))

}
