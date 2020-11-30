package uk.gov.hmcts.reform.exui.performance.simulations

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import uk.gov.hmcts.reform.exui.performance.Feeders
import uk.gov.hmcts.reform.exui.performance.scenarios._
import uk.gov.hmcts.reform.exui.performance.scenarios.utils._

class ExUI extends Simulation {

	val BaseURL = Environment.baseURL
	val orgurl=Environment.manageOrdURL
	val feedUserDataProbate = csv("ProbateUserData.csv").circular
	val feedUserDataCaseworker = csv("Caseworkers.csv").circular

	/*val httpProtocol = Environment.HttpProtocol
		.proxy(Proxy("proxyout.reform.hmcts.net", 8080).httpsPort(8080))
	//.baseUrl("https://xui-webapp-aat.service.core-compute-aat.internal")
		.baseUrl("https://ccd-case-management-web-perftest.service.core-compute-perftest.internal")*/

  val XUIHttpProtocol = Environment.HttpProtocol
    .proxy(Proxy("proxyout.reform.hmcts.net", 8080).httpsPort(8080))
    .baseUrl(orgurl)
    //.baseUrl("https://ccd-case-management-web-perftest.service.core-compute-perftest.internal")
    .headers(Environment.commonHeader)


  val IAChttpProtocol = Environment.HttpProtocol
		//.proxy(Proxy("proxyout.reform.hmcts.net", 8080).httpsPort(8080))
		.baseUrl(BaseURL)
		//.baseUrl("https://xui-webapp-perftest.service.core-compute-perftest.internal")
		//.baseUrl("https://ccd-case-management-web-perftest.service.core-compute-perftest.internal")

   // .inferHtmlResources()
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/77.0.3865.90 Safari/537.36")

	val EXUIScn = scenario("EXUI").repeat(1)
	 {
		exec(
		//S2SHelper.S2SAuthToken,
		/*ExUI.createSuperUser,
		ExUI.createOrg,
      ExUI.approveOrgHomePage,
		ExUI.approveOrganisationlogin,
			ExUI.approveOrganisationApprove,
			ExUI.approveOrganisationLogout*/
			ExUI.manageOrgHomePage,
			ExUI.manageOrganisationLogin,
			ExUI.usersPage,
			ExUI.inviteUserPage
			.repeat(5,"n") {
				exec(ExUI.sendInvitation)
				},
			ExUI.manageOrganisationLogout
			)
	 }


  val EXUIMCaseProbateScn = scenario("***** Probate Case Journey ******").repeat(1)
  {
		feed(feedUserDataProbate).feed(Feeders.ProDataFeeder)
			.exec(EXUIMCLogin.manageCasesHomePage)
			.exec(EXUIMCLogin.manageCaseslogin)
		//	.exec(EXUIMCLogin.termsnconditions)
		.repeat(1) {
			exec(EXUIProbateMC.casecreation)
			//.exec(EXUIProbateMC.casedetails)
			}
		.exec(EXUIMCLogin.manageCase_Logout)
  }

	val EXUIMCaseCaseworkerScn = scenario("***** Caseworker Journey ******").repeat(1)
  {
		feed(feedUserDataCaseworker).feed(Feeders.CwDataFeeder)
			.exec(EXUIMCLogin.manageCasesHomePage)
			.exec(EXUIMCLogin.caseworkerLogin)
		.repeat(1) {
			exec(EXUICaseWorker.ApplyFilters)
			.exec(EXUICaseWorker.ViewCase)
			}
		.exec(EXUIMCLogin.manageCase_Logout)
  }

	setUp(
		EXUIMCaseProbateScn.inject(rampUsers(1) during (10))
		//EXUIMCaseCaseworkerScn.inject(rampUsers(1) during (10))
	).protocols(IAChttpProtocol)

	/*setUp(
		EXUIScn.inject(rampUsers(1) during (10))
	).protocols(XUIHttpProtocol)*/

	/*setUp(
		//EXUIMCaseCreationDivorceScn.inject(nothingFor(5),rampUsers(1) during (3))
		//EXUIMCaseCaseworkerScn.inject(rampUsers(1) during 1)
		//EXUIMCaseProbateScn.inject(nothingFor(5),rampUsers(1) during (3))
		/*EXUIMCaseCreationIACScn.inject(nothingFor(15),rampUsers(1) during (3)),
		EXUIMCaseViewIACScn.inject(nothingFor(25),rampUsers(1) during (3)),
		EXUIMCaseCreationFPLAScn.inject(nothingFor(35),rampUsers(1) during (2)),
		EXUIMCaseViewFPLAScn.inject(nothingFor(45),rampUsers(1) during (3)),*/
		EXUIFinancialRemedyScn.inject(atOnceUsers(1)).protocols(IAChttpProtocol))
}
*/
	/*setUp(
		EXUIScn.inject(rampUsers(209) during (3600))
			.protocols(XUIHttpProtocol)
	)*/
	/* setUp(
		 EXUIMCaseCreationDivorceScn.inject(rampUsers(395) during (600)))
      .protocols(IAChttpProtocol)*/
  /*setUp(
		//EXUIMCaseCreationFPLAScn.inject(rampUsers(1) during (1))
    //EXUIMCaseCreationDivorceScn.inject(rampUsers(1) during (1))
    EXUIMCaseProbateScn.inject(nothingFor(15),rampUsers(230) during (1200)),
    //EXUIMCaseCreationIACScn.inject(nothingFor(20),rampUsers(1) during (1)),
    //EXUIFinancialRemedyScn.inject(nothingFor(25),rampUsers(1) during (1)),
    //EXUIMCaseCaseworkerScn.inject(nothingFor(35),rampUsers(1) during (1))
		//EXUIMCaseViewIACScn.inject(nothingFor(25),rampUsers(1) during (3)),
		//EXUIMCaseViewFPLAScn.inject(nothingFor(15),rampUsers(1) during (3))
  ).protocols(IAChttpProtocol)*/
	/*setUp(
		EXUIMCaseViewIACScn.inject(rampUsers(74) during (600)))
		.protocols(IAChttpProtocol)*/

	/*setUp(
		EXUIMCaseCreationDivorceScn.inject(rampUsers(1) during (10)))
		.protocols(IAChttpProtocol)
*/

	/*setUp(
		EXUIMCaseProbateScn.inject(nothingFor(5),rampUsers(1) during (24)),
		EXUIMCaseCreationIACScn.inject(nothingFor(15),rampUsers(1) during (24)),
		EXUIMCaseCreationFPLAScn.inject(nothingFor(35),rampUsers(1) during (24)),
		EXUIMCaseCaseworkerScn.inject(nothingFor(55),rampUsers(1) during (24)),
		EXUIMCaseCreationDivorceScn.inject(nothingFor(65),rampUsers(1) during (24)),
		EXUIFinancialRemedyScn.inject(nothingFor(75),rampUsers(1) during (24))
	).protocols(IAChttpProtocol)*/

 /* setUp(
		EXUIMCaseProbateScn.inject(nothingFor(5),rampUsers(300) during (900)),
		EXUIMCaseCreationIACScn.inject(nothingFor(15),rampUsers(82) during (900)),
		EXUIMCaseViewIACScn.inject(nothingFor(25),rampUsers(74) during (900)),
		EXUIMCaseCreationFPLAScn.inject(nothingFor(35),rampUsers(38) during (600)),
		EXUIMCaseViewFPLAScn.inject(nothingFor(45),rampUsers(19) during (900)),
		EXUIMCaseCaseworkerScn.inject(nothingFor(55),rampUsers(200) during (900)),
		EXUIMCaseCreationDivorceScn.inject(nothingFor(65),rampUsers(200) during (900))
		EXUIFinancialRemedyScn.inject(nothingFor(75),rampUsers(200) during (900))
	).protocols(IAChttpProtocol)*/



}
