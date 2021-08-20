package uk.gov.hmcts.reform.exui.performance.scenarios.utils

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Environment {

 val idamURL = "https://idam-web-public.aat.platform.hmcts.net"
 val baseURL = "https://manage-case.aat.platform.hmcts.net"
 val baseDomain= "manage-case.aat.platform.hmcts.net"

 val minThinkTime = 3
 val maxThinkTime = 5

 val HttpProtocol = http

}
