package uk.gov.hmcts.reform.exui.performance.scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import uk.gov.hmcts.reform.exui.performance.scenarios.utils.Environment
import uk.gov.hmcts.reform.exui.performance.scenarios.utils.LoginHeader
import uk.gov.service.notify.NotificationClient

object EXUIMCLogin {

  //val BaseURL = Environment.baseURL
  val IdamUrl = Environment.idamURL
  val baseURL=Environment.baseURL
  val manageOrgURL=Environment.manageOrdURL
  val orgDomain=Environment.baseDomainOrg
  val baseDomain=Environment.baseDomain
  //val loginFeeder = csv("OrgId.csv").circular


  val MinThinkTime = Environment.minThinkTime
  val MaxThinkTime = Environment.maxThinkTime

  val headers_1 = Map(
      "Pragma" -> "no-cache",
      "Sec-Fetch-Dest" -> "empty",
      "Sec-Fetch-Mode" -> "cors",
      "Sec-Fetch-Site" -> "same-origin")

  val headers_4 = Map(
      "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
      "Pragma" -> "no-cache",
      "Sec-Fetch-Dest" -> "document",
      "Sec-Fetch-Mode" -> "navigate",
      "Sec-Fetch-Site" -> "same-origin",
      "Upgrade-Insecure-Requests" -> "1")

  //====================================================================================
  //Business process : Access Home Page by hitting the URL and relavant sub requests
  //below requests are Homepage and relavant sub requests as part of the login submission
  //=====================================================================================

  val manageCasesHomePage =
          exec(http("XUI${service}_010_005_Homepage")
           .get("/")
           .headers(LoginHeader.headers_0)
           .check(status.in(200,304))).exitHereIfFailed

      .exec(http("XUI${service}_010_010_HomepageConfigUI")
            .get("/external/configuration-ui")
            .headers(headers_1))

      .exec(http("XUI${service}_010_015_HomepageConfigJson")
            .get("/assets/config/config.json")
            .headers(headers_1))

      .exec(http("XUI${service}_010_020_HomepageTCEnabled")
            .get("/api/configuration?configurationKey=termsAndConditionsEnabled")
            .headers(headers_1))

      .exec(http("XUI${service}_010_025_HomepageIsAuthenticated")
            .get("/auth/isAuthenticated")
            .headers(headers_1))

      .exec(http("XUI${service}_010_030_AuthLogin")
            .get("/auth/login")
            .headers(headers_4)
            .check(css("input[name='_csrf']", "value").saveAs("csrfToken"))
            //.check(regex("manage-user%20create-user&state=(.*)&client").saveAs("state"))
            .check(regex("oauth2/callback&state=(.*)&nonce").saveAs("state"))
            .check(regex("&nonce=(.*)&response_type").saveAs("nonce"))
)


    .pause( MinThinkTime, MaxThinkTime )


  //====================================================================================
  //Business process : Access Home Page by hitting the URL and relavant sub requests
  //following is for manage org home page which is used for RJ
  //=====================================================================================

  val manageOrgHomePage =


      exec(http("XUI${service}_010_005_Homepage")
           .get(manageOrgURL + "/")
           .headers(LoginHeader.headers_0)
           .check(status.in(200,304))).exitHereIfFailed

      .exec(http("XUI${service}_010_010_HomepageConfigUI")
            .get(manageOrgURL + "/external/configuration-ui")
            .headers(headers_1))

      .exec(http("XUI${service}_010_015_HomepageConfigJson")
            .get(manageOrgURL + "/assets/config/config.json")
            .headers(headers_1))

      .exec(http("XUI${service}_010_020_HomepageTCEnabled")
            .get(manageOrgURL + "/api/configuration?configurationKey=termsAndConditionsEnabled")
            .headers(headers_1))

      .exec(http("XUI${service}_010_025_HomepageIsAuthenticated")
            .get(manageOrgURL + "/auth/isAuthenticated")
            .headers(headers_1))

      .exec(http("XUI${service}_010_030_AuthLogin")
            .get(manageOrgURL + "/auth/login")
            .headers(headers_4)
            .check(css("input[name='_csrf']", "value").saveAs("csrfToken"))
            .check(regex("manage-user%20create-user%20manage-roles&state=(.*)&client").saveAs("state"))
      )


    .pause( MinThinkTime, MaxThinkTime )


  val manageCasesHomePageGK =


      exec(http("XUI${service}_160_005_GKHomepage")
           .get("/")
           .headers(LoginHeader.headers_0)
           .check(status.in(200,304))).exitHereIfFailed

        .exec(http("XUI${service}_160_010_GKHomepage")
              .get("/external/config/ui")
              .headers(LoginHeader.headers_0)
              .check(status.in(200,304)))

      .exec(http("XUI${service}_160_015_GKHomepageTCEnabled")
            .get("/api/configuration?configurationKey=termsAndConditionsEnabled")
            .headers(LoginHeader.headers_hometc)
            .check(status.is(200)))

      .exec(http("XUI${service}_160_020_GKHompageLoginPage")
            .get(IdamUrl + "/login?response_type=code&client_id=xuiwebapp&redirect_uri=" + baseURL + "/oauth2/callback&scope=profile%20openid%20roles%20manage-user%20create-user")
            .headers(LoginHeader.headers_login)
            .check(regex("Sign in"))
            .check(css("input[name='_csrf']", "value").saveAs("csrfToken"))
            .check(status.is(200)))


    .pause( MinThinkTime, MaxThinkTime )

  //==================================================================================
  //Business process : Enter the login details and submit
  //below requests are main login and relavant sub requests as part of the login submission
  //==================================================================================

  val manageOrglogin =


      exec(http("XUI${service}_020_005_SignIn")
           .post(IdamUrl + "/login?response_type=code&redirect_uri=https%3A%2F%2F"+orgDomain+"%2Foauth2%2Fcallback&scope=profile%20openid%20roles%20manage-user%20create-user%20manage-roles&state=${state}&client_id=xuimowebapp")
           .formParam("username", "${respuser}")
           .formParam("password", "Pass19word")
           .formParam("save", "Sign in")
           .formParam("selfRegistrationEnabled", "false")
           .formParam("_csrf", "${csrfToken}")
           .headers(LoginHeader.headers_login_submit)
           .check(status.in(200, 304, 302))).exitHereIfFailed

      //      .exec(getCookieValue(CookieKey("__userid__").withDomain("manage-case.perftest.platform.hmcts.net").saveAs("myUserId")))

      .exec(http("XUI${service}_020_010_Homepage")
            .get(manageOrgURL + "/external/config/ui")
            .headers(LoginHeader.headers_0)
            .check(status.in(200,304)))

      /*.exec(http("XUI${service}_020_010_Homepage")
            .get("/external/config/ui")
            .headers(LoginHeader.headers_0)
            .check(status.in(200,304)))*/

      .exec(http("XUI${service}_020_015_SignInTCEnabled")
            .get(manageOrgURL + "/api/configuration?configurationKey=termsAndConditionsEnabled")
            .headers(LoginHeader.headers_38)
            .check(status.in(200, 304)))

      /* .exec(http("XUI${service}_020_020_SignInGetUserId")
             .get("/api/userTermsAndConditions/${myUserId}")
             .headers(LoginHeader.headers_tc))*/

      /* .exec(http("XUI${service}_020_025_SignInAcceptTCGet")
             .get("/accept-terms-and-conditions")
             .headers(LoginHeader.headers_tc_get)
             .check(status.in(200, 304)))*/

      /* .exec(http("XUI${service}_020_030_SignInTCEnabled")
             .get("/api/configuration?configurationKey=termsAndConditionsEnabled")
             .headers(LoginHeader.headers_tc))*/

      .repeat(1, "count") {
        exec(http("XUI${service}_020_020_AcceptT&CAccessJurisdictions${count}")
             .get(manageOrgURL + "/aggregated/caseworkers/:uid/jurisdictions?access=read")
             .headers(LoginHeader.headers_access_read)
             .check(status.in(200, 304, 302)))
      }

      .exec(http("XUI${service}_020_025_GetWorkBasketInputs")
            .get(manageOrgURL + "/data/internal/case-types/FinancialRemedyMVP2/work-basket-inputs")
            .headers(LoginHeader.headers_17))
      .exec(getCookieValue(CookieKey("__auth__").withDomain(orgDomain).saveAs("authToken")))
      .exec(getCookieValue(CookieKey("XSRF-TOKEN").withDomain(orgDomain).saveAs("XSRFToken")))

      .exec(http("XUI${service}_020_030_GetPaginationMetaData")
            .get(manageOrgURL + "/data/caseworkers/:uid/jurisdictions/DIVORCE/case-types/FinancialRemedyMVP2/cases/pagination_metadata?state=caseAdded")
            .headers(LoginHeader.headers_0))

      .exec(http("XUI${service}_020_035_GetDefaultWorkBasketView")
            .get(manageOrgURL + "/aggregated/caseworkers/:uid/jurisdictions/DIVORCE/case-types/FinancialRemedyMVP2/cases?view=WORKBASKET&state=caseAdded&page=1")
            .headers(LoginHeader.headers_0))




    .pause(MinThinkTime , MaxThinkTime)


  val manageCaseslogin =


      exec(http("XUI${service}_020_005_SignIn")
           //.post(IdamUrl + "/login?response_type=code&client_id=xuiwebapp&redirect_uri=" + baseURL + "/oauth2/callback&scope=profile%20openid%20roles%20manage-user%20create-user")
           //.post(IdamUrl + "/login?response_type=code&redirect_uri=" + baseURL + "%2Foauth2%2Fcallback&scope=profile%20openid%20roles%20manage-user%20create-user&state=${state}&client_id=xuiwebapp")
           .post("https://idam-web-public.aat.platform.hmcts.net/login?client_id=xuiwebapp&redirect_uri=https://manage-case.aat.platform.hmcts.net/oauth2/callback&state=${state}&nonce=${nonce}&response_type=code&scope=profile%20openid%20roles%20manage-user%20create-user&prompt=")
           .formParam("username", "${user}")
           .formParam("password", "Pass19word")
           .formParam("save", "Sign in")
           .formParam("selfRegistrationEnabled", "false")
           .formParam("_csrf", "${csrfToken}")
           .headers(LoginHeader.headers_login_submit)
           .check(status.in(200, 304, 302))).exitHereIfFailed

      //      .exec(getCookieValue(CookieKey("__userid__").withDomain("manage-case.perftest.platform.hmcts.net").saveAs("myUserId")))

      .exec(http("XUI${service}_020_010_configUI")
            .get("/external/config/ui")
            .headers(LoginHeader.headers_0)
            .check(status.in(200,304)))

      .exec(http("XUI${service}_020_015_Config")
            .get("/assets/config/config.json")
            .headers(LoginHeader.headers_0)
            .check(status.in(200,304)))

      .exec(http("XUI${service}_020_020_SignInTCEnabled")
            .get("/api/configuration?configurationKey=termsAndConditionsEnabled")
            .headers(LoginHeader.headers_38)
            .check(status.in(200, 304)))

        .exec(http("XUI${service}_020_025_SignInGetUserId")
              .get("/api/user/details")
              .headers(LoginHeader.headers_0))

      /* .exec(http("XUI${service}_020_025_SignInAcceptTCGet")
             .get("/accept-terms-and-conditions")
             .headers(LoginHeader.headers_tc_get)
             .check(status.in(200, 304)))*/

      /* .exec(http("XUI${service}_020_030_SignInTCEnabled")
             .get("/api/configuration?configurationKey=termsAndConditionsEnabled")
             .headers(LoginHeader.headers_tc))*/

      .repeat(1, "count") {
        exec(http("XUI${service}_020_030_AcceptT&CAccessJurisdictions${count}")
             .get("/aggregated/caseworkers/:uid/jurisdictions?access=read")
             .headers(LoginHeader.headers_access_read)
             .check(status.in(200, 304, 302)))
      }

      .exec(http("XUI${service}_020_035_GetWorkBasketInputs")
            .get("/data/internal/case-types/FinancialRemedyMVP2/work-basket-inputs")
            .headers(LoginHeader.headers_17))
      //.exec(getCookieValue(CookieKey("__auth__").withDomain(baseDomain).saveAs("authToken")))
      /*.exec(getCookieValue(CookieKey("XSRF-TOKEN").withDomain("manage-case.perftest.platform.hmcts.net").saveAs("XSRFToken")))*/
      /*.exec( session => {
        println("the xsrf code is "+session("XSRFToken").as[String])
        session
      })*/

      .exec(http("XUI${service}_020_040_GetPaginationMetaData")
            .get("/data/caseworkers/:uid/jurisdictions/DIVORCE/case-types/FinancialRemedyMVP2/cases/pagination_metadata?state=caseAdded")
            .headers(LoginHeader.headers_0))

      .exec(http("XUI${service}_020_045_GetDefaultWorkBasketView")
            .get("/aggregated/caseworkers/:uid/jurisdictions/DIVORCE/case-types/FinancialRemedyMVP2/cases?view=WORKBASKET&state=caseAdded&page=1")
            .headers(LoginHeader.headers_0))
      .exec(getCookieValue(CookieKey("XSRF-TOKEN").withDomain(baseDomain).saveAs("XSRFToken")))

      /* .exec(http("XUI${service}_020_040_HomepageIsAuthenticated")
               .get("/auth/isAuthenticated")
               .headers(LoginHeader.headers_0))*/


    .pause(MinThinkTime , MaxThinkTime)

    val caseworkerLogin =

      exec(http("XUI${service}_020_005_SignIn")
           //.post(IdamUrl + "/login?response_type=code&client_id=xuiwebapp&redirect_uri=" + baseURL + "/oauth2/callback&scope=profile%20openid%20roles%20manage-user%20create-user")
           //.post(IdamUrl + "/login?response_type=code&redirect_uri=" + baseURL + "%2Foauth2%2Fcallback&scope=profile%20openid%20roles%20manage-user%20create-user&state=${state}&client_id=xuiwebapp")
           .post("https://idam-web-public.aat.platform.hmcts.net/login?client_id=xuiwebapp&redirect_uri=https://manage-case.aat.platform.hmcts.net/oauth2/callback&state=${state}&nonce=${nonce}&response_type=code&scope=profile%20openid%20roles%20manage-user%20create-user&prompt=")
           .formParam("username", "${user}")
           .formParam("password", "Pass19word")
           .formParam("save", "Sign in")
           .formParam("selfRegistrationEnabled", "false")
           .formParam("_csrf", "${csrfToken}")
           .headers(LoginHeader.headers_login_submit)
           .check(status.in(200, 304, 302))).exitHereIfFailed

//      .exec(getCookieValue(CookieKey("__userid__").withDomain("manage-case.perftest.platform.hmcts.net").saveAs("myUserId")))

      .exec(http("XUI${service}_020_010_Homepage")
            .get("/external/config/ui")
            .headers(LoginHeader.headers_0)
            .check(status.in(200,304)))

      .exec(http("XUI${service}_020_015_SignInTCEnabled")
            .get("/api/configuration?configurationKey=termsAndConditionsEnabled")
            .headers(LoginHeader.headers_38)
            .check(status.in(200, 304)))

      .repeat(1, "count") {
        exec(http("XUI${service}_020_020_AcceptT&CAccessJurisdictions${count}")
             .get("/aggregated/caseworkers/:uid/jurisdictions?access=read")
             .headers(LoginHeader.headers_access_read)
             .check(status.in(200, 304, 302)))
      }

      .exec(http("XUI${service}_020_025_GetWorkBasketInputs")
            .get("/data/internal/case-types/GrantOfRepresentation/work-basket-inputs")
            .headers(LoginHeader.headers_17))

      .exec(http("XUI${service}_020_030_GetPaginationMetaData")
            .get("/data/caseworkers/:uid/jurisdictions/PROBATE/case-types/GrantOfRepresentation/cases/pagination_metadata?state=Open")
            .headers(LoginHeader.headers_0))

      .exec(http("XUI${service}_020_035_GetDefaultWorkBasketView")
            .get("/aggregated/caseworkers/:uid/jurisdictions/PROBATE/case-types/GrantOfRepresentation/cases?view=WORKBASKET&state=Open&page=1")
            .headers(LoginHeader.headers_0))

      .exec(getCookieValue(CookieKey("XSRF-TOKEN").withDomain(baseDomain).saveAs("xsrfToken")))


      .pause(MinThinkTime , MaxThinkTime)
      


  //======================================================================================
  //Business process : Click on Terms and Conditions
  //below requests are Terms and Conditions page and relavant sub requests
  // ======================================================================================

  val termsnconditions=

      exec(http("XUI${service}_030_005_ConfirmT&C")
           .post("/api/userTermsAndConditions")
           .headers(LoginHeader.headers_tc)
           .body(StringBody("{\"userId\":\"${myUserId}\"}"))
           .check(status.in(200, 304, 302))).exitHereIfFailed

      .exec(http("XUI${service}_030_010_AcceptT&CEnabled")
            .get("/api/configuration?configurationKey=termsAndConditionsEnabled")
            .headers(LoginHeader.headers_hometc)
            .check(status.in(200, 304, 302)))

      .repeat(1, "count") {
        exec(http("XUI${service}_030_015_AcceptT&CAccessJurisdictions${count}")
             .get("/aggregated/caseworkers/:uid/jurisdictions?access=read")
             .headers(LoginHeader.headers_access_read)
             .check(status.in(200, 304, 302)))
      }

      .exec(http("XUI${service}_030_020_GetWorkBasketInputs")
            .get("/data/internal/case-types/CARE_SUPERVISION_EPO/work-basket-inputs")
            .headers(LoginHeader.headers_17))

      .exec(http("XUI${service}_030_025_GetPaginationMetaData")
            .get("/data/caseworkers/:uid/jurisdictions/PUBLICLAW/case-types/CARE_SUPERVISION_EPO/cases/pagination_metadata?state=Open")
            .headers(LoginHeader.headers_0))

      .exec(http("XUI${service}_030_030_GetDefaultWorkBasketView")
            .get("/aggregated/caseworkers/:uid/jurisdictions/PUBLICLAW/case-types/CARE_SUPERVISION_EPO/cases?view=WORKBASKET&state=Open&page=1")
            .headers(LoginHeader.headers_0))


    .pause(MinThinkTime , MaxThinkTime )


  val managecasesadminlogin =


      exec(http("XUI${service}_020_005_SignIn")
           .post(IdamUrl + "/login?response_type=code&client_id=xuiwebapp&redirect_uri=" + baseURL + "/oauth2/callback&scope=profile%20openid%20roles%20manage-user%20create-user")
           .formParam("username", "fpla.admin@mailinator.com")
           .formParam("password", "Pass19word")
           .formParam("save", "Sign in")
           .formParam("selfRegistrationEnabled", "false")
           .formParam("_csrf", "${csrfToken}")
           .headers(LoginHeader.headers_login_submit)
           .check(status.in(200, 304, 302))).exitHereIfFailed

        .exec(http("XUI${service}_020_010_Homepage")
              .get("/external/config/ui")
              .headers(LoginHeader.headers_0)
              .check(status.in(200,304)))

      .exec(http("XUI${service}_020_015_SignInTCEnabled")
            .get("/api/configuration?configurationKey=termsAndConditionsEnabled")
            .headers(LoginHeader.headers_38)
            .check(status.in(200, 304)))

      .repeat(1, "count") {
        exec(http("XUI${service}_020_020_AcceptT&CAccessJurisdictions${count}")
             .get("/aggregated/caseworkers/:uid/jurisdictions?access=read")
             .headers(LoginHeader.headers_access_read)
             .check(status.in(200, 304, 302)))
      }

      .exec(http("XUI${service}_020_025_GetWorkBasketInputs")
            .get("/data/internal/case-types/CARE_SUPERVISION_EPO/work-basket-inputs")
            .headers(LoginHeader.headers_17))

      .exec(http("XUI${service}_020_030_GetPaginationMetaData")
            .get("/data/caseworkers/:uid/jurisdictions/PUBLICLAW/case-types/CARE_SUPERVISION_EPO/cases/pagination_metadata?state=Open")
            .headers(LoginHeader.headers_0))

      .exec(http("XUI${service}_020_035_GetDefaultWorkBasketView")
            .get("/aggregated/caseworkers/:uid/jurisdictions/PUBLICLAW/case-types/CARE_SUPERVISION_EPO/cases?view=WORKBASKET&state=Open&page=1")
            .headers(LoginHeader.headers_0))



    .pause(MinThinkTime , MaxThinkTime)

  val managecasesgatekeeperlogin =


      exec(http("XUI${service}_170_005_GKSignIn")
           .post(IdamUrl + "/login?response_type=code&client_id=xuiwebapp&redirect_uri=" + baseURL + "/oauth2/callback&scope=profile%20openid%20roles%20manage-user%20create-user")
           .formParam("username", "fpla.gatekeeper@mailinator.com")
           .formParam("password", "Pass19word")
           .formParam("save", "Sign in")
           .formParam("selfRegistrationEnabled", "false")
           .formParam("_csrf", "${csrfToken}")
           .headers(LoginHeader.headers_login_submit)
           .check(status.in(200, 304, 302))).exitHereIfFailed

        .exec(http("XUI${service}_170_010_GKSignIn")
              .get("/external/config/ui")
              .headers(LoginHeader.headers_0)
              .check(status.in(200,304)))

      .exec(http("XUI${service}_170_015_GKSignInTCEnabled")
            .get("/api/configuration?configurationKey=termsAndConditionsEnabled")
            .headers(LoginHeader.headers_38)
            .check(status.in(200, 304)))

      .repeat(1, "count") {
        exec(http("XUI${service}_170_020_GKAcceptT&CAccessJurisdictions${count}")
             .get("/aggregated/caseworkers/:uid/jurisdictions?access=read")
             .headers(LoginHeader.headers_access_read)
             .check(status.in(200, 304, 302)))
      }

      .exec(http("XUI${service}_170_025_GKGetWorkBasketInputs")
            .get("/data/internal/case-types/CARE_SUPERVISION_EPO/work-basket-inputs")
            .headers(LoginHeader.headers_17))

      .exec(http("XUI${service}_170_030_GKGetPaginationMetaData")
            .get("/data/caseworkers/:uid/jurisdictions/PUBLICLAW/case-types/CARE_SUPERVISION_EPO/cases/pagination_metadata?state=Open")
            .headers(LoginHeader.headers_0))

      .exec(http("XUI${service}_170_035_GKGetDefaultWorkBasketView")
            .get("/aggregated/caseworkers/:uid/jurisdictions/PUBLICLAW/case-types/CARE_SUPERVISION_EPO/cases?view=WORKBASKET&state=Open&page=1")
            .headers(LoginHeader.headers_0))



    .pause(MinThinkTime , MaxThinkTime)

  //======================================================================================
  //Business process : Click on Terms and Conditions
  //below requests are Terms and Conditions page and relavant sub requests
  // ======================================================================================

  val manageCase_Logout =

      exec(http("XUI${service}_${SignoutNumber}_SignOut")
           .get("/api/logout")
           .headers(LoginHeader.headers_signout)
           .check(status.in(200, 304, 302)))


  val manageOrg_Logout =

      exec(http("XUI${service}_${SignoutNumber}_SignOut")
           .get(manageOrgURL + "/api/logout")
           .headers(LoginHeader.headers_signout)
           .check(status.in(200, 304, 302)))


  val manageCase_LogoutAdmin =

      exec(http("XUI${service}_${SignoutNumberAdmin}_SignOut")
           .get("/api/logout")
           .headers(LoginHeader.headers_signout)
           .check(status.in(200, 304, 302)))

  pause(105)//to be removed

  val manageCase_LogoutGK =

      exec(http("XUI${service}_${SignoutNumberGK}_SignOut")
           .get("/api/logout")
           .headers(LoginHeader.headers_signout)
           .check(status.in(200, 304, 302)))
    
  pause(5)//to be removed
}