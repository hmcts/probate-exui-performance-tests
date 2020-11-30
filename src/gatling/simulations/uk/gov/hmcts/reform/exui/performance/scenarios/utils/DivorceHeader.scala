package uk.gov.hmcts.reform.exui.performance.scenarios.utils

object DivorceHeader {

 val baseURL = Environment.baseURL

 val commonHeader = Map(
  "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3",
  "Accept-Encoding" -> "gzip, deflate, br",
  "Accept-Language" -> "en-US,en;q=0.9",
  "Sec-Fetch-Mode" -> "navigate",
  "Sec-Fetch-Site" -> "cross-site",
  "Upgrade-Insecure-Requests" -> "1")

 val headers_accessCreate = Map(
  "accept" -> "application/json",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "2$587801235_171h5vAMKUMUBHAHCQKSABKWFBHHGLAHGGCPVR-0e8",
  "x-dtreferer" -> ({baseURL+"/cases"}),
  "x-xsrf-token" -> "${XSRFToken}")

 val headers_27 = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-start-case-trigger.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "2$587801235_171h8vAMKUMUBHAHCQKSABKWFBHHGLAHGGCPVR-0e9",
  "x-xsrf-token" -> "${XSRFToken}")

 val headers_31 = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-user-profile.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "2$587801235_171h11vAMKUMUBHAHCQKSABKWFBHHGLAHGGCPVR-0e9",
  "x-dtreferer" -> ({baseURL+"/cases/case-filter"}),
  "x-xsrf-token" -> "${XSRFToken}")

 val headers_shareorgs = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "2$587801235_171h12vAMKUMUBHAHCQKSABKWFBHHGLAHGGCPVR-0e9",
  "x-dtreferer" -> ({baseURL+"/cases/case-filter"}),
 "x-xsrf-token" -> "${XSRFToken}")
 val headers_soldata = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "2$587801235_171h14vAMKUMUBHAHCQKSABKWFBHHGLAHGGCPVR-0e10",
  "x-xsrf-token" -> "${XSRFToken}")

 val headers_aboutsol = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "2$587801235_171h16vAMKUMUBHAHCQKSABKWFBHHGLAHGGCPVR-0e11",
  "x-xsrf-token" -> "${XSRFToken}")

 val headers_aboutpetitioner = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "2$587801235_171h18vAMKUMUBHAHCQKSABKWFBHHGLAHGGCPVR-0e12",
  "x-xsrf-token" -> "${XSRFToken}")

 val headers_headerRespondant = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "2$587801235_171h20vAMKUMUBHAHCQKSABKWFBHHGLAHGGCPVR-0e13",
  "x-xsrf-token" -> "${XSRFToken}")

 val headers_marriagecertificate = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "2$587801235_171h22vAMKUMUBHAHCQKSABKWFBHHGLAHGGCPVR-0e14",
  "x-xsrf-token" -> "${XSRFToken}")

 val headers_createjurisdiction = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "2$587801235_171h24vAMKUMUBHAHCQKSABKWFBHHGLAHGGCPVR-0e15",
  "x-xsrf-token" -> "${XSRFToken}")

 val headers_reasonfordiv = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "2$587801235_171h26vAMKUMUBHAHCQKSABKWFBHHGLAHGGCPVR-0e16",
  "x-xsrf-token" -> "${XSRFToken}")

 val headers_behaviour = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "2$587801235_171h28vAMKUMUBHAHCQKSABKWFBHHGLAHGGCPVR-0e17",
  "x-xsrf-token" -> "${XSRFToken}")

 val headers_courtcases = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "2$587801235_171h30vAMKUMUBHAHCQKSABKWFBHHGLAHGGCPVR-0e18",
  "x-xsrf-token" -> "${XSRFToken}")

 val headers_devideprops = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "2$587801235_171h32vAMKUMUBHAHCQKSABKWFBHHGLAHGGCPVR-0e19",
  "x-xsrf-token" -> "${XSRFToken}")

 val headers_claimcosts = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "2$587801235_171h34vAMKUMUBHAHCQKSABKWFBHHGLAHGGCPVR-0e20",
  "x-xsrf-token" -> "${XSRFToken}")

 val headers_upload = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "2$587801235_171h36vAMKUMUBHAHCQKSABKWFBHHGLAHGGCPVR-0e21",
  "x-xsrf-token" -> "${XSRFToken}")

 val headers_langpref = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "2$587801235_171h38vAMKUMUBHAHCQKSABKWFBHHGLAHGGCPVR-0e22",
  "x-xsrf-token" -> "${XSRFToken}")

 val headers_internalprofile = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-user-profile.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "2$587801235_171h39vAMKUMUBHAHCQKSABKWFBHHGLAHGGCPVR-0e22",
  "x-dtreferer" -> ({baseURL+"/cases/case-create/DIVORCE/DIVORCE_XUI/solicitorCreate/solicitorCreatelangPref"}),
  "x-xsrf-token" -> "${XSRFToken}")

 val headers_ignorewarning = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.create-case.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "2$587801235_171h41vAMKUMUBHAHCQKSABKWFBHHGLAHGGCPVR-0e23",
  "x-xsrf-token" -> "${XSRFToken}")


 val headers_2 = Map(
  "Accept" -> "application/json, text/plain, */*",
  "Accept-Encoding" -> "gzip, deflate, br",
  "Accept-Language" -> "en-US,en;q=0.9",
  "Sec-Fetch-Dest" -> "empty",
  "Sec-Fetch-Mode" -> "cors",
  "Sec-Fetch-Site" -> "same-origin")

 val headers_datainternal = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-case-view.v2+json",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "2$587801235_171h43vAMKUMUBHAHCQKSABKWFBHHGLAHGGCPVR-0e23",
  "x-xsrf-token" -> "${XSRFToken}")

 val headers_shareacasebyid = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "request-context" -> "appId=cid-v1:32f2f79b-4f35-43d3-a880-a5a2e9f89979",
  "request-id" -> "|mwOx8.Bj7f6",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "2$587801235_171h55vAMKUMUBHAHCQKSABKWFBHHGLAHGGCPVR-0e27",
  "x-dtreferer" -> ({baseURL+"/cases"}))

 val headers_shareacasesuserslist = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "request-context" -> "appId=cid-v1:32f2f79b-4f35-43d3-a880-a5a2e9f89979",
  "request-id" -> "|mwOx8.SaOqy",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "2$587801235_171h56vAMKUMUBHAHCQKSABKWFBHHGLAHGGCPVR-0e27",
  "x-dtreferer" -> ({baseURL+"/cases"}))

 val headers_shareacaseconfirm = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "origin" -> "https://manage-case.perftest.platform.hmcts.net",
  "request-context" -> "appId=cid-v1:32f2f79b-4f35-43d3-a880-a5a2e9f89979",
  "request-id" -> "|mwOx8.klFcW",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "2$587801235_171h61vAMKUMUBHAHCQKSABKWFBHHGLAHGGCPVR-0e29",
  "x-dtreferer" ->   ({baseURL+"/cases/case-share-confirm"}),
  "x-xsrf-token" -> "${XSRFToken}")







}
