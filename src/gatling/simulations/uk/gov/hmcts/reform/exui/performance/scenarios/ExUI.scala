package uk.gov.hmcts.reform.exui.performance.scenarios

import java.io.{BufferedWriter, FileWriter}

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import uk.gov.hmcts.reform.exui.performance.Feeders
import uk.gov.hmcts.reform.exui.performance.scenarios.utils.Environment
import uk.gov.service.notify.{NotificationClient, NotificationList}

import scala.collection.JavaConverters.iterableAsScalaIterableConverter
import scala.util.Random

object ExUI {

   //val BaseURL = Environment.baseURL
  val prdUrl=Environment.PRDUrl
  val IdamUrl = Environment.idamURL
  val approveUser=Environment.adminUserAO
  val approveUserPassword=Environment.adminPasswordAO
  val url_approve=Environment.url_approve
  val url_mo = Environment.manageOrdURL
  val baseDomainOrg = Environment.baseDomainOrg
  val baseDomainManageCase = Environment.baseDomain
  val idamAPI=Environment.idamAPI
  val notificationClient=Environment.notificationClient
  val feeder = csv("userid-increment.csv").circular
  val feederuser = csv("OrgDetails.csv").circular

  /*
  //floowing variable s are for create org
   */

  private val rng: Random = new Random()
  private def sRAId(): String = rng.alphanumeric.take(15).mkString
  private def companyNumber(): String = rng.alphanumeric.take(8).mkString
  private def companyURL(): String = rng.alphanumeric.take(15).mkString
  private def paymentAccount1(): String = rng.alphanumeric.take(7).mkString
  private def paymentAccount2(): String = rng.alphanumeric.take(7).mkString

  val headers_tc_aat = Map(
    "Content-Type" -> "application/json",
    "Origin" -> url_approve,
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin")

  val headers_approve = Map(
    "accept" -> "application/json, text/plain, */*",
    "content-type" -> "application/json",
    "origin" -> url_approve,
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-dtpc" -> "3$177202940_215h13vRTEKHLKOUDUAFDGLBUMMTACUTRICRHRU-0e25")

  val headers_authlogin = Map(
    "accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "sec-fetch-dest" -> "document",
    "sec-fetch-mode" -> "navigate",
    "sec-fetch-site" -> "same-origin",
    "upgrade-insecure-requests" -> "1")

  val headers_login = Map(
    "accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "cache-control" -> "max-age=0",
    "sec-fetch-dest" -> "document",
    "sec-fetch-mode" -> "navigate",
    "sec-fetch-site" -> "same-site",
    "sec-fetch-user" -> "?1",
    "upgrade-insecure-requests" -> "1")

  val createSuperUser=
  feed(Feeders.createDynamicDataFeeder).exec(http("XUI_CreateSuperUser")
       .post(idamAPI+"/testing-support/accounts")
                        // .header("Authorization", "Bearer ${accessToken}")
                        // .header("ServiceAuthorization", "Bearer ${s2sToken}")
                        .header("Content-Type", "application/json")
                        .body(StringBody("{\"email\": \"${generatedEmail}\", \"forename\": \"Vijay\", \"password\": \"Pass19word\", \"surname\": \"Vykuntam\"}"))
                        .check(status is 201))
                   .pause(20)
val createOrg=
  exec(_.setAll(
    ("SRAId", sRAId()),
    ("CompanyNumber", companyNumber()),
    ("CompanyURL", companyURL()),
    ("PaymentAccount1",paymentAccount1()),
    ("PaymentAccount2",paymentAccount2()),
  ))
      .exec(http("RD15_External_CreateOrganization")
          .post(prdUrl+"/refdata/external/v1/organisations")
          .header("ServiceAuthorization", "Bearer ${s2sToken}")
          .body(StringBody("{\n   \"name\": \"${orgName}\",\n   \"sraId\": \"TRA${SRAId}\",\n   \"sraRegulated\": true,\n   \"companyNumber\": \"${CompanyNumber}\",\n" +
            "\"companyUrl\": \"www.tr${CompanyURL}.com\",\n   \"superUser\": {\n       \"firstName\": \"Vijay\",\n       \"lastName\": \"Vykuntam\",\n" +
            "\"email\": \"${generatedEmail}\"\n,\n        \"jurisdictions\": [\n    {\n      \"id\": \"DIVORCE\"\n    },\n    {\n      \"id\": \"SSCS\"\n    },\n    {\n      \"id\": \"PROBATE\"\n    },\n    {\n      \"id\": \"PUBLICLAW\"\n    },\n    {\n      \"id\": \"BULK SCANNING\"\n    },\n    {\n      \"id\": \"IA\"\n    },\n    {\n      \"id\": \"CMC\"\n    },\n    {\n      \"id\": \"EMPLOYMENT\"\n    },\n    {\n      \"id\": \"Family public law and adoption\"\n    },\n    {\n      \"id\": \"Civil enforcement and possession\"\n    }\n  ]   },\n   \"paymentAccount\": [\n\n          \"PBA${PaymentAccount1}\",\"PBA${PaymentAccount2}\"\n\n   ],\n" +
            "\"contactInformation\": [\n       {\n           \"addressLine1\": \"4\",\n           \"addressLine2\": \"Hibernia Gardens\",\n           \"addressLine3\": \"Maharaj road\",\n" +
            "\"townCity\": \"Hounslow\",\n           \"county\": \"middlesex\",\n           \"country\": \"UK\",\n           \"postCode\": \"TW3 3SD\",\n           \"dxAddress\": [\n" +
            "{\n                   \"dxNumber\": \"DX 1121111990\",\n                   \"dxExchange\": \"112111192099908492\"\n               }\n           ]\n       }\n   ]\n}"))
          .header("Content-Type", "application/json")
          .check(jsonPath("$.organisationIdentifier").saveAs("orgRefCode"))
          .check(status in (200,201)))
    .pause(15)



 /* val createOrg1=
    exec(http("EXUI_RO_Homepage")
         .get("/register-org/register")
         .check(status.is(200)))
    .pause(Environment.minThinkTime,Environment.maxThinkTime)
    .feed(Feeders.createDynamicDataFeeder).exec(http("EXUI_RO_Create")
      .post("/external/register-org/register")
      .body(ElFileBody("CR.json")).asJson
      .check(status.is(200)).check(jsonPath("$.organisationIdentifier").optional.saveAs("orgRefCode")))
    .pause(10)*/

  val approveOrgHomePage=
    exec(http("EXUI_AO_005_Homepage")
         .get(url_approve + "/")
         .check(status.is(200))
    )

    .exec(http("request_6")
          .get(url_approve+"/api/environment/config")
          .check(status.is(200))
    )

      .exec(http("request_12")
            .get(url_approve+"/auth/isAuthenticated")
            .check(status.is(200))
      )

    .exec(http("request_8")
          .get(url_approve+"/api/user/details")
          .check(status.is(200))
      .check(regex("oauth2/callback&state=(.*)&nonce").saveAs("state"))
      .check(regex("&nonce=(.*)&response_type").saveAs("nonce"))
      .check(css("input[name='_csrf']", "value").saveAs("csrfToken"))
    )

    .pause(Environment.minThinkTime)

  val approveOrganisationlogin =

    exec(http("EXUI_AO_005_Login")
         .post(IdamUrl + "/login?client_id=xuiaowebapp&redirect_uri="+url_approve+"/oauth2/callback&state=${state}&nonce=${nonce}&response_type=code&scope=profile%20openid%20roles%20manage-user%20create-user&prompt=")
         .headers(headers_login)
         .formParam("username", approveUser)
         .formParam("password", approveUserPassword)
         .formParam("save", "Sign in")
         .formParam("selfRegistrationEnabled", "false")
         .formParam("_csrf", "${csrfToken}")
         .check(status.is(200))
    )

    .pause(Environment.minThinkTime)

      .exec(http("request_5")
            .get( "/api/environment/config")
        .check(status.is(200))
           )


      .exec(http("request_6")
            .get( "/api/user/details")
        .check(status.is(200))
      )

      .exec(http("request_7")
            .get("/auth/isAuthenticated")
        .check(status.is(200))
      )

      .exec(http("request_9")
            .get( "/api/organisations?status=ACTIVE")
        .check(status.is(200))
      )

    .exec(http("EXUI_AO_010_Login")
          .get(url_approve + "/api/organisations?status=PENDING")
          .check(status.is(200))
    )
    .exec(getCookieValue(CookieKey("XSRF-TOKEN").withDomain("administer-orgs.perftest.platform.hmcts.net").saveAs("XSRFToken"))
    )

    .pause(30)




  val approveOrganisationApprove =

  exec(http("request_3")
        .get("/auth/isAuthenticated")
    .check(status.in(200,304)))
      .pause(10)

    .exec(http("request_4")
          .get("/auth/isAuthenticated")
      .check(status.in(200,304)))
          .pause(10)

      .exec(http("EXUI_AO_Approve")
      .put(url_approve+"/api/organisations/${orgRefCode}")
          .headers(headers_approve)
        .header("X-XSRF-TOKEN", "${XSRFToken}")
      .body(ElFileBody("AO.json")).asJson
      .check(status.is(200))
    .check(status.saveAs("aostatusvalue")))
    .pause(10)
       /* .exec {
      session =>
        val client = new NotificationClient(notificationClient)
        val pattern = new Regex("token.+")
        val str = findEmail(client,session("generatedEmail").as[String])
        session.set("activationLink", (pattern findFirstMatchIn str.get).mkString.trim.replace(")", ""))
    }
    .pause(40)
      .exec(http("SelfReg01_TX03_Password")
        .get(IdamUrl+"/users/register?&${activationLink}")
        .check(status.is(200))
        .check(css("input[name='token']", "value").saveAs("token"))
        .check(css("input[name='code']", "value").saveAs("code"))
        .check(css("input[name='_csrf']", "value").saveAs("_csrf")))
      .pause(40)
      .exec(http("SelfReg01_TX04_Activate").post(IdamUrl+"/users/activate")
        .formParam("_csrf", "${_csrf}")
        .formParam("code", "${code}")
        .formParam("token", "${token}")
        .formParam("password1", "Pass19word")
        .formParam("password2", "Pass19word")
        .check(status.is(200))
    .check(status.saveAs("aostatusvalue")))
      .pause(20)*/
    .doIf(session=>session("aostatusvalue").as[String].contains("200")) {
      exec { session =>
        val fw = new BufferedWriter(new FileWriter("OrgDetails.csv", true))
        try {
          fw.write(session("orgName").as[String] + "," + session("orgRefCode").as[String] + "," + session("generatedEmail").as[String] + "\r\n")
        } finally fw.close()
        session
      }
    }

  val approveOrganisationLogout =
    exec(http("EXUI_AO_005_Logout")
      .get(url_approve + "/api/logout")
      .check(status.is(200)))

  // following code is for manage organisation


  val manageOrgHomePage =
    feed(feederuser).
    exec(http("EXUI_MO_005_Homepage")
      .get(url_mo + "/")
     // .headers(headers_0)
      .check(status.is(200)))

     /* .exec(http("EXUI_MO_010_Homepage")
        .get(url_mo + "/api/user/details")
       // .headers(headers_1)
        .check(status.is(200))
        .check(regex("oauth2/callback&state=(.*)&nonce").saveAs("state"))
        .check(css("input[name='_csrf']", "value").saveAs("csrfToken"))
      )*/

    .exec(http("request_14")
  .get("/auth/login")
      .check(status.is(200))
     // .check(headerRegex("Location", "(?state=)(.*)").saveAs("state"))
      .check(regex("&state=(.*)&client_id").saveAs("state"))
      .check(css("input[name='_csrf']", "value").saveAs("csrfToken"))
    )


    .pause(Environment.minThinkTime)

  val manageOrganisationLogin =
    exec(http("EXUI_MO_005_Login")
      .post(IdamUrl + "/login?response_type=code&redirect_uri=https%3a%2f%2f"+baseDomainOrg+"%2foauth2%2fcallback&scope=profile%20openid%20roles%20manage-user%20create-user%20manage-roles&state=${state}&client_id=xuimowebapp")

      .formParam("username", "${generatedEmail}")
      .formParam("password", "Pass19word")
      .formParam("save", "Sign in")
      .formParam("selfRegistrationEnabled", "false")
      .formParam("_csrf", "${csrfToken}")
      .check(status.in(200, 302)))


    /*.exec(http("EXUI_MO_060_050_Login")
          .get(url_mo + "/api/user/details")
          .check(status.in(200, 302,304))
    .check(jsonPath("$.userId").optional.saveAs("myUserId")))


      .exec( session => {
        println("userId is "+session("myUserId").as[String])
        session
      })

      .exec(http("XUI_020_010_SignInTCEnabled")
            .get(url_mo+"/api/configuration?configurationKey=feature.termsAndConditionsEnabled")
            .check(status.in(200, 304)))

      .exec(http("XUI_020_010_SignInTCEnabled")
            .get(url_mo+"/api/userTermsAndConditions/${myUserId}")
            .check(status.in(200, 304)))*/


      .exec(http("EXUI_MO_020_Login")
            .get(url_mo + "/api/organisation/")
            .check(status.in(200, 302,304)))
      .pause(Environment.constantthinkTime)

    /*.exec(http("XUIASD_035_005_ConfirmT&C")
       .post(url_mo+"/api/userTermsAndConditions")
      .headers(headers_tc_aat)
       .body(StringBody("{\"userId\":\"${myUserId}\"}"))
       .check(status.in(200, 304, 302)))*/


     /* .exec(http("XUIASD_035_010_ConfirmT&C")
            .post(url_mo+"/api/userTermsAndConditions")
        .headers(headers_tc_aat)
            .body(StringBody("{\"userId\":\"${myUserId}\"}"))
            .check(status.in(200, 304, 302)))*/


      .exec(http("EXUI_MO_065_050_Login")
            .get(url_mo + "/api/user/details")
            .check(status.in(200, 302,304)))
      .pause(Environment.constantthinkTime)

      /*.exec(http("XUI_025_010_SignInTCEnabled")
            .get(url_mo+"/api/configuration?configurationKey=feature.termsAndConditionsEnabled")
            .check(status.in(200, 304)))*/


  val usersPage =
    exec(http("EXUI_MO_005_Userspage")
      .get(url_mo + "/api/userList")
      .check(status.is(200)))
    .pause(Environment.constantthinkTime)

  val inviteUserPage =
    exec(http("EXUI_MO_005_InviteUserpage")
      .get(url_mo + "/api/jurisdictions")
      .check(status.in(200,304)))
    .pause(Environment.minThinkTime)

  val sendInvitation =

  feed(Feeders.createDynamicUserDataFeeder).
    exec(http("XUI_CreateSuperUser").post(idamAPI+"/testing-support/accounts").header("Content-Type", "application/json").body(StringBody("{\"email\": \"${orgName}${generatedUserEmail}${n}@mailinator.com\", \"forename\": \"VUser\", \"password\": \"Pass19word\", \"surname\": \"VykUser\"}"))
      .check(status is 201))
    .pause(20)
          .exec(http("EXUI_MO_005_SendInvitation")
      .post(url_mo + "/api/inviteUser")
      .body(ElFileBody("MO.json")).asJson
      .check(status.is(200))
          .check(status.saveAs("userstatusvalue"))
      ).exitHereIfFailed
        .pause(20)
      /*exec {

        session =>
          val client = new NotificationClient(notificationClient)
          val pattern = new Regex("token.+")
         // val str = findEmail(client,session("orgName").as[String]+"_user"+session("userid").as[String]+"@mailinator.com")
         val str = findEmail(client,session("orgName").as[String]+session("generatedUserEmail").as[String]+session("n").as[String]+"@mailinator.com")
          session.set("activationLink", (pattern findFirstMatchIn str.get).mkString.trim.replace(")", ""))
      }
      .pause(40)
      .exec(http("InviteUser_TX03_Password")
        .get(IdamUrl+"/users/register?&${activationLink}")
        .check(status.is(200))
        .check(css("input[name='token']", "value").saveAs("token"))
        .check(css("input[name='code']", "value").saveAs("code"))
        .check(css("input[name='_csrf']", "value").saveAs("_csrf")))
      .pause(40)
      .exec(http("SelfReg01_TX04_Activate").post(IdamUrl+"/users/activate")
        .formParam("_csrf", "${_csrf}")
        .formParam("code", "${code}")
        .formParam("token", "${token}")
        .formParam("password1", "Pass19word")
        .formParam("password2", "Pass19word")
        .check(status.in(200,201))
        .check(status.saveAs("statusvalue")))
          .pause(20)*/
           .doIf(session=>session("userstatusvalue").as[String].contains("200")) {
            exec {
            session =>
              val fw = new BufferedWriter(new FileWriter("OrgId3.csv", true))
              try {
                fw.write(session("orgName").as[String] + ","+session("orgRefCode").as[String] + "," + session("generatedEmail").as[String] +","+ session("orgName").as[String]+session("generatedUserEmail").as[String]+session("n").as[String]+"@mailinator.com"+"\r\n")
              }
              finally fw.close()
              session
          }
        }

      .pause(Environment.constantthinkTime)

  val manageOrganisationLogout =
    exec(http("EXUI_MO_005_Logout")
      .get(url_mo + "/api/logout")
      .check(status.in(200,401,304)))

      .exec(http("EXUI_MO_010_Logout")
        .get(url_mo + "/api/user/details")
        .check(status.in(401,304)))

      .exec(http("EXUI_MO_015_Logout")
        .get(IdamUrl + "/?response_type=code&client_id=xuimowebapp&redirect_uri="+url_mo+"/oauth2/callback&scope=openid%20profile%20roles%20manage-user%20create-user")
    )

  // email notification related stuff
  def findEmail(client: NotificationClient, emailAddress:String) : Option[String] = {
    var emailBody = findEmailByStatus(client, emailAddress, "created")
    if (emailBody.isDefined) {
      return emailBody
    }
    emailBody = findEmailByStatus(client, emailAddress, "sending")
    if (emailBody.isDefined) {
      return emailBody
    }
    emailBody = findEmailByStatus(client, emailAddress, "delivered")
    if (emailBody.isDefined) {
      return emailBody
    }
    findEmailByStatus(client, emailAddress, "failed")
  }

  def findEmailByStatus(client: NotificationClient, emailAddress: String, status: String) : Option[String] = {
    val notificationList = client.getNotifications(status, "email", null, null)
    println("Searching notifications from " + status)
    val emailBody = getEmailBodyByEmailAddress(notificationList, emailAddress)
    if (emailBody.isDefined) {
      return emailBody
    }
    None
  }

  def getEmailBodyByEmailAddress(notifications: NotificationList, emailAddress: String) : Option[String] = {
    for(notification <- notifications.getNotifications.asScala) {
      if (notification.getEmailAddress.get().equalsIgnoreCase(emailAddress)) {
        println("Found match for email " + emailAddress)
        return Some(notification.getBody)
      } else {
        println("Comparing " + notification.getEmailAddress.get() + " with " + emailAddress)
      }
    }
    None
  }

}
