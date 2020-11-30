package uk.gov.hmcts.reform.exui.performance.scenarios.utils

object FR_Applicant_Header {

  val baseURL = Environment.baseURL

  val headers_2 = Map(
    "Accept" -> "application/json",
    "Content-Type" -> "application/json",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-XSRF-TOKEN" -> "${XSRFToken}",
    "sec-ch-ua" -> """Chromium";v="86", "\"Not\\A;Brand";v="99", "Google Chrome";v="86""",
    "sec-ch-ua-mobile" -> "?0",
    "x-dtpc" -> "3$259808026_422h5vQEGKFHUHMIDPKBQASVVNRMPKURVRUITM-0e16",
    "x-dtreferer" -> ({baseURL+"/cases"}))

  val headers_6 = Map(
    "Accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-start-case-trigger.v2+json;charset=UTF-8",
    "Content-Type" -> "application/json",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-XSRF-TOKEN" -> "${XSRFToken}",
    "experimental" -> "true",
    "sec-ch-ua" -> """Chromium";v="86", "\"Not\\A;Brand";v="99", "Google Chrome";v="86""",
    "sec-ch-ua-mobile" -> "?0",
    "x-dtpc" -> "3$259808026_422h8vQEGKFHUHMIDPKBQASVVNRMPKURVRUITM-0e17")

  val headers_8 = Map(
    "Accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-start-case-trigger.v2+json;charset=UTF-8",
    "Content-Type" -> "application/json",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-XSRF-TOKEN" -> "${XSRFToken}",
    "experimental" -> "true",
    "sec-ch-ua" -> """Chromium";v="86", "\"Not\\A;Brand";v="99", "Google Chrome";v="86""",
    "sec-ch-ua-mobile" -> "?0",
    "x-dtpc" -> "3$259808026_422h10vQEGKFHUHMIDPKBQASVVNRMPKURVRUITM-0e17")

  val headers_9 = Map(
    "Accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-user-profile.v2+json;charset=UTF-8",
    "Content-Type" -> "application/json",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-XSRF-TOKEN" -> "${XSRFToken}",
    "experimental" -> "true",
    "sec-ch-ua" -> """Chromium";v="86", "\"Not\\A;Brand";v="99", "Google Chrome";v="86""",
    "sec-ch-ua-mobile" -> "?0",
    "x-dtpc" -> "3$259808026_422h11vQEGKFHUHMIDPKBQASVVNRMPKURVRUITM-0e17",
    "x-dtreferer" -> ({baseURL+"/cases/case-filter"}))



  val headers_10 = Map(
    "Accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
    "Content-Type" -> "application/json",
    "Origin" -> baseURL,
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-XSRF-TOKEN" -> "${XSRFToken}",
    "experimental" -> "true",
    "sec-ch-ua" -> """Chromium";v="86", "\"Not\\A;Brand";v="99", "Google Chrome";v="86""",
    "sec-ch-ua-mobile" -> "?0",
    "x-dtpc" -> "3$259808026_422h12vQEGKFHUHMIDPKBQASVVNRMPKURVRUITM-0e18")

  val headers_15 = Map(
    "Accept" -> "application/json",
    "Content-Type" -> "application/json",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-XSRF-TOKEN" -> "${XSRFToken}",
    "sec-ch-ua" -> """Chromium";v="86", "\"Not\\A;Brand";v="99", "Google Chrome";v="86""",
    "sec-ch-ua-mobile" -> "?0",
    "x-dtpc" -> "3$259808026_422h15vQEGKFHUHMIDPKBQASVVNRMPKURVRUITM-0e19")

  val headers_18 = Map(
    "Accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
    "Content-Type" -> "application/json",
    "Origin" -> baseURL,
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-XSRF-TOKEN" -> "${XSRFToken}",
    "experimental" -> "true",
    "sec-ch-ua" -> """Chromium";v="86", "\"Not\\A;Brand";v="99", "Google Chrome";v="86""",
    "sec-ch-ua-mobile" -> "?0",
    "x-dtpc" -> "3$259808026_422h17vQEGKFHUHMIDPKBQASVVNRMPKURVRUITM-0e20")

  val headers_22 = Map(
    "Accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
    "Content-Type" -> "application/json",
    "Origin" -> baseURL,
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-XSRF-TOKEN" -> "${XSRFToken}",
    "experimental" -> "true",
    "sec-ch-ua" -> """Chromium";v="86", "\"Not\\A;Brand";v="99", "Google Chrome";v="86""",
    "sec-ch-ua-mobile" -> "?0",
    "x-dtpc" -> "3$259808026_422h19vQEGKFHUHMIDPKBQASVVNRMPKURVRUITM-0e21")

  val headers_26 = Map(
    "Accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
    "Content-Type" -> "application/json",
    "Origin" -> baseURL,
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-XSRF-TOKEN" -> "${XSRFToken}",
    "experimental" -> "true",
    "sec-ch-ua" -> """Chromium";v="86", "\"Not\\A;Brand";v="99", "Google Chrome";v="86""",
    "sec-ch-ua-mobile" -> "?0",
    "x-dtpc" -> "3$259808026_422h21vQEGKFHUHMIDPKBQASVVNRMPKURVRUITM-0e22")

  val headers_27 = Map(
    "Accept" -> "application/json, text/plain, */*",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "sec-ch-ua" -> """Chromium";v="86", "\"Not\\A;Brand";v="99", "Google Chrome";v="86""",
    "sec-ch-ua-mobile" -> "?0")

  val headers_31 = Map(
    "Accept" -> "application/json",
    "Content-Type" -> "application/json",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-XSRF-TOKEN" -> "${XSRFToken}",
    "sec-ch-ua" -> """Chromium";v="86", "\"Not\\A;Brand";v="99", "Google Chrome";v="86""",
    "sec-ch-ua-mobile" -> "?0",
    "x-dtpc" -> "3$259808026_422h24vQEGKFHUHMIDPKBQASVVNRMPKURVRUITM-0e23")

  val headers_34 = Map(
    "Accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
    "Content-Type" -> "application/json",
    "Origin" -> baseURL,
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-XSRF-TOKEN" -> "${XSRFToken}",
    "experimental" -> "true",
    "sec-ch-ua" -> """Chromium";v="86", "\"Not\\A;Brand";v="99", "Google Chrome";v="86""",
    "sec-ch-ua-mobile" -> "?0",
    "x-dtpc" -> "3$259808026_422h26vQEGKFHUHMIDPKBQASVVNRMPKURVRUITM-0e24")

  val headers_37 = Map(
    "Accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
    "Content-Type" -> "application/json",
    "Origin" ->baseURL,
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-XSRF-TOKEN" -> "${XSRFToken}",
    "experimental" -> "true",
    "sec-ch-ua" -> """Chromium";v="86", "\"Not\\A;Brand";v="99", "Google Chrome";v="86""",
    "sec-ch-ua-mobile" -> "?0",
    "x-dtpc" -> "3$259808026_422h28vQEGKFHUHMIDPKBQASVVNRMPKURVRUITM-0e25")

  val headers_41 = Map(
    "Accept" -> "",
    "Content-Type" -> "multipart/form-data; boundary=----WebKitFormBoundarysWFdOsWptcJsOCpU",
    "Origin" -> baseURL,
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-XSRF-TOKEN" -> "${XSRFToken}",
    "sec-ch-ua" -> """Chromium";v="86", "\"Not\\A;Brand";v="99", "Google Chrome";v="86""",
    "sec-ch-ua-mobile" -> "?0",
    "x-dtpc" -> "3$259808026_422h30vQEGKFHUHMIDPKBQASVVNRMPKURVRUITM-0e26")

  val headers_44 = Map(
    "Accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
    "Content-Type" -> "application/json",
    "Origin" -> baseURL,
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-XSRF-TOKEN" -> "${XSRFToken}",
    "experimental" -> "true",
    "sec-ch-ua" -> """Chromium";v="86", "\"Not\\A;Brand";v="99", "Google Chrome";v="86""",
    "sec-ch-ua-mobile" -> "?0",
    "x-dtpc" -> "3$259808026_422h32vQEGKFHUHMIDPKBQASVVNRMPKURVRUITM-0e27")

  val headers_48 = Map(
    "Accept" -> "",
    "Content-Type" -> "multipart/form-data; boundary=----WebKitFormBoundarynZAT1BNCygsLwdnc",
    "Origin" -> baseURL,
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-XSRF-TOKEN" -> "${XSRFToken}",
    "sec-ch-ua" -> """Chromium";v="86", "\"Not\\A;Brand";v="99", "Google Chrome";v="86""",
    "sec-ch-ua-mobile" -> "?0",
    "x-dtpc" -> "3$259808026_422h34vQEGKFHUHMIDPKBQASVVNRMPKURVRUITM-0e28")

  val headers_51 = Map(
    "Accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
    "Content-Type" -> "application/json",
    "Origin" -> baseURL,
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-XSRF-TOKEN" -> "${XSRFToken}",
    "experimental" -> "true",
    "sec-ch-ua" -> """Chromium";v="86", "\"Not\\A;Brand";v="99", "Google Chrome";v="86""",
    "sec-ch-ua-mobile" -> "?0",
    "x-dtpc" -> "3$259808026_422h36vQEGKFHUHMIDPKBQASVVNRMPKURVRUITM-0e29")

  val headers_55 = Map(
    "Accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
    "Content-Type" -> "application/json",
    "Origin" -> baseURL,
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-XSRF-TOKEN" -> "${XSRFToken}",
    "experimental" -> "true",
    "sec-ch-ua" -> """Chromium";v="86", "\"Not\\A;Brand";v="99", "Google Chrome";v="86""",
    "sec-ch-ua-mobile" -> "?0",
    "x-dtpc" -> "3$259808026_422h38vQEGKFHUHMIDPKBQASVVNRMPKURVRUITM-0e30")

  val headers_59 = Map(
    "Accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
    "Content-Type" -> "application/json",
    "Origin" -> baseURL,
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-XSRF-TOKEN" -> "${XSRFToken}",
    "experimental" -> "true",
    "sec-ch-ua" -> """Chromium";v="86", "\"Not\\A;Brand";v="99", "Google Chrome";v="86""",
    "sec-ch-ua-mobile" -> "?0",
    "x-dtpc" -> "3$259808026_422h40vQEGKFHUHMIDPKBQASVVNRMPKURVRUITM-0e31")

  val headers_61 = Map(
    "Accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-user-profile.v2+json;charset=UTF-8",
    "Content-Type" -> "application/json",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-XSRF-TOKEN" -> "${XSRFToken}",
    "experimental" -> "true",
    "sec-ch-ua" -> """Chromium";v="86", "\"Not\\A;Brand";v="99", "Google Chrome";v="86""",
    "sec-ch-ua-mobile" -> "?0",
    "x-dtpc" -> "3$259808026_422h41vQEGKFHUHMIDPKBQASVVNRMPKURVRUITM-0e31",
    "x-dtreferer" -> ({baseURL+"/cases/case-create/DIVORCE/FinancialRemedyConsentedRespondent/FR_solicitorCreate/FR_solicitorCreate12"}))



  val headers_64 = Map(
    "Accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.create-case.v2+json;charset=UTF-8",
    "Content-Type" -> "application/json",
    "Origin" -> baseURL,
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-XSRF-TOKEN" -> "${XSRFToken}",
    "experimental" -> "true",
    "sec-ch-ua" -> """Chromium";v="86", "\"Not\\A;Brand";v="99", "Google Chrome";v="86""",
    "sec-ch-ua-mobile" -> "?0",
    "x-dtpc" -> "3$259808026_422h43vQEGKFHUHMIDPKBQASVVNRMPKURVRUITM-0e32")

  val headers_66 = Map(
    "Accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-case-view.v2+json",
    "Content-Type" -> "application/json",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-XSRF-TOKEN" -> "${XSRFToken}",
    "experimental" -> "true",
    "sec-ch-ua" -> """Chromium";v="86", "\"Not\\A;Brand";v="99", "Google Chrome";v="86""",
    "sec-ch-ua-mobile" -> "?0",
    "x-dtpc" -> "3$259808026_422h45vQEGKFHUHMIDPKBQASVVNRMPKURVRUITM-0e32")

  val headers_67 = Map(
    "Accept" -> "application/json, text/plain, */*",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "sec-ch-ua" -> """Chromium";v="86", "\"Not\\A;Brand";v="99", "Google Chrome";v="86""",
    "sec-ch-ua-mobile" -> "?0",
    "x-dtpc" -> "3$259808026_422h46vQEGKFHUHMIDPKBQASVVNRMPKURVRUITM-0e32",
    "x-dtreferer" -> ({baseURL+"/cases/case-create/DIVORCE/FinancialRemedyConsentedRespondent/FR_solicitorCreate/submit"}))



}
