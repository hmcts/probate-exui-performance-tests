package uk.gov.hmcts.reform.exui.performance.scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import uk.gov.hmcts.reform.exui.performance.scenarios.utils.{Environment, Headers, LoginHeader}

object EXUIMCLogin {

  val IdamUrl = Environment.idamURL
  val baseURL=Environment.baseURL
  val baseDomain=Environment.baseDomain

  val MinThinkTime = Environment.minThinkTime
  val MaxThinkTime = Environment.maxThinkTime

  /*====================================================================================
  *Business process : Access Home Page by hitting the URL and relavant sub requests
  *below requests are Homepage and relavant sub requests for Manage cases
  *=====================================================================================*/

  val manageCasesHomePage =
    group("XUI_Probate_010_Homepage") {
      exec(http("XUI_Probate_010_005_Homepage")
        .get("/")
        .headers(LoginHeader.headers_0)
        .check(status.in(200, 304))).exitHereIfFailed

        .exec(http("XUI_Probate_010_010_HomepageConfigUI")
          .get("/external/configuration-ui")
          .headers(LoginHeader.headers_1))

        .exec(http("XUI_Probate_010_015_HomepageConfigJson")
          .get("/assets/config/config.json")
          .headers(LoginHeader.headers_1))

        .exec(http("XUI_Probate_010_020_HomepageTCEnabled")
          .get("/api/configuration?configurationKey=termsAndConditionsEnabled")
          .headers(LoginHeader.headers_1))

        .exec(http("XUI_Probate_010_025_HomepageIsAuthenticated")
          .get("/auth/isAuthenticated")
          .headers(LoginHeader.headers_1))

        .exec(http("XUI_Probate_010_030_AuthLogin")
          .get("/auth/login")
          .headers(LoginHeader.headers_4)
          .check(css("input[name='_csrf']", "value").saveAs("csrfToken"))
          .check(regex("/oauth2/callback&amp;state=(.*)&amp;nonce=").saveAs("state"))
          .check(regex("&nonce=(.*)&response_type").saveAs("nonce")))

    }

      .pause(MinThinkTime, MaxThinkTime)


  /*====================================================================================
  *Business process : Access Login Page by hitting the Manage Case Login URL and relavant
  * sub requests ,following is for manage org login page which is used for complete the
  * service related journeys like divorce,fpla,iac,probate etc...
  =====================================================================================*/


  val manageCaseslogin =
    group("XUI_Probate_020_005_SignIn") {
      exec(flushHttpCache).exec(http("XUI_Probate_020_005_SignIn")
        .post(IdamUrl + "/login?client_id=xuiwebapp&redirect_uri=" + baseURL + "/oauth2/callback&state=${state}&nonce=${nonce}&response_type=code&scope=profile%20openid%20roles%20manage-user%20create-user&prompt=")
        .formParam("username", "${user}")
        .formParam("password", "${password}")
        .formParam("save", "Sign in")
        .formParam("selfRegistrationEnabled", "false")
        .formParam("_csrf", "${csrfToken}")
        .headers(LoginHeader.headers_login_submit)
        .check(status.in(200, 304, 302))
        .check(regex("Manage cases"))).exitHereIfFailed

        .exec(http("XUI_Probate_020_010_configUI")
          .get("/external/config/ui")
          .headers(LoginHeader.headers_0)
          .check(status.in(200, 304)))

        .exec(http("XUI_Probate_020_015_Config")
          .get("/assets/config/config.json")
          .headers(LoginHeader.headers_0)
          .check(status.in(200, 304)))

        .exec(http("XUI_Probate_020_020_SignInTCEnabled")
          .get("/api/configuration?configurationKey=termsAndConditionsEnabled")
          .headers(LoginHeader.headers_38)
          .check(status.in(200, 304)))

        .exec(http("XUI_Probate_020_025_SignInGetUserId")
          .get("/api/user/details")
          .headers(LoginHeader.headers_0)
          .check(status.in(200, 304)))

        .repeat(1, "count") {
          exec(http("XUI_Probate_020_030_AcceptT&CAccessJurisdictions${count}")
            .get("/aggregated/caseworkers/:uid/jurisdictions?access=read")
            .headers(LoginHeader.headers_access_read)
            .check(status.in(200, 304, 302)))
        }

        .exec(http("XUI_Probate_020_035_GetWorkBasketInputs")
          .get("/data/internal/case-types/FinancialRemedyMVP2/work-basket-inputs")
          .headers(LoginHeader.headers_17)
          .check(status.in(200, 304, 302, 404)))

        .exec(http("XUI_Probate_020_040_HomepageIsAuthenticated")
          .get("/auth/isAuthenticated")
          .headers(LoginHeader.headers_0))

        .exec(http("XUI_Probate_020_045_CaseActivity")
          .options("/activity/cases/0/activity")
          .headers(Headers.commonHeader)
          .check(status.in(200, 304, 403)))

        .exec(http("XUI_Probate_020_050_CaseActivity")
          .get("/activity/cases/0/activity")
          .headers(Headers.commonHeader)
          .check(status.in(200, 304, 403)))

        .exec(http("XUI_Probate_020_055_GetDefaultWorkBasketView")
          .post("/data/internal/searchCases?ctid=Caveat&use_case=WORKBASKET&view=WORKBASKET&page=1") //need to make the ctid dynamic
          .headers(LoginHeader.headers_0)
          .check(jsonPath("$.results[*].case_id").findAll.transform(_.mkString(",")).optional.saveAs("caseList")))

        .doIf("${caseList.exists()}") {
          exec(http("XUI_Probate_020_060_CaseActivity")
            .get("/activity/cases/${caseList}/activity")
            .headers(Headers.commonHeader)
            .check(status.in(200, 403)))
        }

        .exec(getCookieValue(CookieKey("XSRF-TOKEN").withDomain(baseDomain).saveAs("XSRFToken")))

    }

      .pause(MinThinkTime, MaxThinkTime)

  //======================================================================================
  //Business process : Click on Terms and Conditions
  //below requests are Terms and Conditions page and relavant sub requests
  // ======================================================================================

  val manageCase_Logout =

    group("XUI_Probate_999_SignOut") {
      exec(http("XUI_Probate_999_SignOut")
        .get("/api/logout")
        .headers(LoginHeader.headers_signout)
        .check(status.in(200, 304, 302)))
    }

}