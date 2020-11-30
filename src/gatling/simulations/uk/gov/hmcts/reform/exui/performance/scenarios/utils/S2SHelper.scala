package uk.gov.hmcts.reform.exui.performance.scenarios.utils

import io.gatling.core.Predef._
import io.gatling.http.Predef._


object  S2SHelper {

 val S2SUrl=Environment.S2SUrl

  val S2SAuthToken =
    exec(http("Token_020_GetServiceToken")
      .post(S2SUrl + "/lease")
      .header("Content-Type", "application/json")
      .body(StringBody(
        s"""{
       "microservice": "rd_professional_api"
        }"""
      )).asJson
      .check(bodyString.saveAs("s2sToken"))
      .check(bodyString.saveAs("responseBody")))
    .pause(20)
      /*.exec( session => {
        println("the code of id is "+session("s2sToken").as[String])
        session
      })*/

}
