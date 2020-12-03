package uk.gov.hmcts.reform.exui.performance.scenarios.utils

object CaseworkerHeader {

val baseURL = Environment.baseURL

    val headers_sort = Map(
        "accept" -> "application/json",
        "content-type" -> "application/json",
        "origin" -> baseURL,
        "sec-fetch-dest" -> "empty",
        "sec-fetch-mode" -> "cors",
        "sec-fetch-site" -> "same-origin",
        "x-dtpc" -> "3$272180847_348h35vGVSERPHCKQWMJCRPGLHSAKFQMPLCLPHL-0e30")

    val headers_read = Map(
        "accept" -> "application/json, text/plain, */*",
        "sec-fetch-dest" -> "empty",
        "sec-fetch-mode" -> "cors",
        "sec-fetch-site" -> "same-origin",
        "x-dtpc" -> "2$595308963_803h13vGPUVHCQAOWPMASHWHNFGLKUMKEKFNFBO-0e7",
        "x-dtreferer" -> ({baseURL+"/cases"}))

val headers_2 = Map(
    "accept" -> "application/json",
    "content-type" -> "application/json",
    "origin" -> baseURL,
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-dtpc" -> "2$595308963_803h9vGPUVHCQAOWPMASHWHNFGLKUMKEKFNFBO-0e6")

val headers_4 = Map(
    "Pragma" -> "no-cache",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin")

val headers_5 = Map(
    "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-case-view.v2+json",
    "content-type" -> "application/json",
    "experimental" -> "true",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-dtpc" -> "2$595308963_803h12vGPUVHCQAOWPMASHWHNFGLKUMKEKFNFBO-0e7")

val headers_6 = Map(
    "Accept" -> "application/json, text/plain, */*",
    "Pragma" -> "no-cache",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin")

val headers_7 = Map(
    "Content-Type" -> "application/json",
    "Pragma" -> "no-cache",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin")

val headers_8 = Map(
    "Accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-workbasket-input-details.v2+json;charset=UTF-8",
    "Content-Type" -> "application/json",
    "Pragma" -> "no-cache",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "experimental" -> "true")

val headers_9 = Map(
    "Content-Type" -> "application/json",
    "Origin" -> baseURL,
    "Pragma" -> "no-cache",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin")

val headers_search = Map(
    "accept" -> "application/json, text/plain, */*",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-dtpc" -> "2$595308963_803h13vGPUVHCQAOWPMASHWHNFGLKUMKEKFNFBO-0e7",
    "x-dtreferer" -> ({baseURL+"/cases/case-search"}))

val headers_undefined = Map(
    "accept" -> "application/json, text/plain, */*",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-dtpc" -> "2$595308963_803h14vGPUVHCQAOWPMASHWHNFGLKUMKEKFNFBO-0e7",
    "x-dtreferer" -> ({baseURL+"/cases/case-search"}))

val headers_documents = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.9",
    "Sec-Fetch-Mode" -> "navigate",
    "Sec-Fetch-Site" -> "none",
    "Upgrade-Insecure-Requests" -> "1")
}