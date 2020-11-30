package uk.gov.hmcts.reform.exui.performance.scenarios.utils

import uk.gov.hmcts.reform.exui.performance.scenarios.utils.Environment._

object FR_Respondent_Header {

  val headers_9 = Map(
    "Accept" -> "application/json, text/plain, */*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "authorization" -> "${authToken}",
    "sec-ch-ua" -> """Chromium";v="86", "\"Not\\A;Brand";v="99", "Google Chrome";v="86""",
    "sec-ch-ua-mobile" -> "?0")

  val headers_37 = Map(
    "Accept" -> "application/json, text/plain, */*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "Origin" -> s"${manageOrdURL}",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-XSRF-TOKEN" -> "${XSRFToken}",
    "authorization" -> "${authToken}",
    "sec-ch-ua" -> """Chromium";v="86", "\"Not\\A;Brand";v="99", "Google Chrome";v="86""",
    "sec-ch-ua-mobile" -> "?0")

  val headers_38 = Map(
    "Accept" -> "application/json, text/plain, */*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "Origin" -> s"${manageOrdURL}",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-XSRF-TOKEN" -> "${XSRFToken}",
    "authorization" -> "${authToken}",
    "sec-ch-ua" -> """Chromium";v="86", "\"Not\\A;Brand";v="99", "Google Chrome";v="86""",
    "sec-ch-ua-mobile" -> "?0")

  val headers_54 = Map(
    "Accept" -> "application/json, text/plain, */*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "Content-Type" -> "application/json",
    "Origin" -> s"${manageOrdURL}",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-XSRF-TOKEN" -> "${XSRFToken}",
    "authorization" -> "${authToken}",
    "sec-ch-ua" -> """Chromium";v="86", "\"Not\\A;Brand";v="99", "Google Chrome";v="86""",
    "sec-ch-ua-mobile" -> "?0")

}
