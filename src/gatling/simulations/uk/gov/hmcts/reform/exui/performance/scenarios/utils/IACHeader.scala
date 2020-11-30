package uk.gov.hmcts.reform.exui.performance.scenarios.utils

object IACHeader {

 val baseURL = Environment.baseURL

 val commonHeader = Map(
  "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3",
  "Accept-Encoding" -> "gzip, deflate, br",
  "Accept-Language" -> "en-US,en;q=0.9",
  "Sec-Fetch-Mode" -> "navigate",
  "Sec-Fetch-Site" -> "cross-site",
  "Upgrade-Insecure-Requests" -> "1")

 val headers_createcase = Map(
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

 val headers_startcreatecase = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-start-case-trigger.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "1$579436139_19h8vMEARIAIGLUFFNPCKRPQRQVUGOPAKMIJN-0e10",
  "x-xsrf-token" -> "${XSRFToken}")



 val headers_9 = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "1$579436139_19h13vMEARIAIGLUFFNPCKRPQRQVUGOPAKMIJN-0e11",
  "x-xsrf-token" -> "${XSRFToken}")

 val headers_homeofficedecision = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "1$579436139_19h15vMEARIAIGLUFFNPCKRPQRQVUGOPAKMIJN-0e12",
  "x-xsrf-token" -> "${XSRFToken}")

 val headers_uploadnotice = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "1$579436139_19h17vMEARIAIGLUFFNPCKRPQRQVUGOPAKMIJN-0e13",
  "x-xsrf-token" -> "${XSRFToken}")

 val headers_basicdetails = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "1$579436139_19h19vMEARIAIGLUFFNPCKRPQRQVUGOPAKMIJN-0e14",
  "x-xsrf-token" -> "${XSRFToken}")


 val headers_nationality = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "1$579436139_19h21vMEARIAIGLUFFNPCKRPQRQVUGOPAKMIJN-0e15",
  "x-xsrf-token" -> "${XSRFToken}")

 val headers_postcode = Map(
  "accept" -> "application/json",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "1$579436139_19h23vMEARIAIGLUFFNPCKRPQRQVUGOPAKMIJN-0e16",
  "x-xsrf-token" -> "${XSRFToken}")

 val headers_appelantaddress = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "1$579436139_19h25vMEARIAIGLUFFNPCKRPQRQVUGOPAKMIJN-0e17",
  "x-xsrf-token" -> "${XSRFToken}")

 val headers_contactpref = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "1$579436139_19h27vMEARIAIGLUFFNPCKRPQRQVUGOPAKMIJN-0e18",
  "x-xsrf-token" -> "${XSRFToken}")

 val headers_appealtype = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "1$579436139_19h29vMEARIAIGLUFFNPCKRPQRQVUGOPAKMIJN-0e19",
  "x-xsrf-token" -> "${XSRFToken}")

 val headers_humanrights = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "1$579436139_19h31vMEARIAIGLUFFNPCKRPQRQVUGOPAKMIJN-0e20",
  "x-xsrf-token" -> "${XSRFToken}")

 val headers_orderpage = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "1$579436139_19h33vMEARIAIGLUFFNPCKRPQRQVUGOPAKMIJN-0e21",
  "x-xsrf-token" -> "${XSRFToken}")

 val headers_newmatters = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "1$579436139_19h35vMEARIAIGLUFFNPCKRPQRQVUGOPAKMIJN-0e22",
  "x-xsrf-token" -> "${XSRFToken}")

 val headers_otherappeals = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "1$579436139_19h37vMEARIAIGLUFFNPCKRPQRQVUGOPAKMIJN-0e23",
  "x-xsrf-token" -> "${XSRFToken}")

 val headers_repdetails = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "1$579436139_19h39vMEARIAIGLUFFNPCKRPQRQVUGOPAKMIJN-0e24",
  "x-xsrf-token" -> "${XSRFToken}")

 val headers_repprofile = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-user-profile.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "1$579436139_19h40vMEARIAIGLUFFNPCKRPQRQVUGOPAKMIJN-0e24",
  "x-dtreferer" ->  ({baseURL+"/cases/case-create/IA/Asylum/startAppeal/startAppeallegalRepresentativeDetails"}),
  "x-xsrf-token" -> "${XSRFToken}")

 val headers_casesave = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.create-case.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "1$579436139_19h42vMEARIAIGLUFFNPCKRPQRQVUGOPAKMIJN-0e25",
  "x-xsrf-token" -> "${XSRFToken}")

 val headers_submitappeal = Map(
  "accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "document",
  "sec-fetch-mode" -> "navigate",
  "sec-fetch-site" -> "same-origin",
  "sec-fetch-user" -> "?1",
  "upgrade-insecure-requests" -> "1")

 val headers_configui = Map(
  "accept" -> "*/*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin")

 val headers_caseview = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-case-view.v2+json",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-xsrf-token" -> "${XSRFToken}")




 val headers_32 = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.create-case.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin")

 val headers_newsubmitappeal = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-start-event-trigger.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-xsrf-token" -> "${XSRFToken}")



 val headers_submitdeclaration = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "1$581183307_826h4vMEARIAIGLUFFNPCKRPQRQVUGOPAKMIJN-0e27",
  "x-xsrf-token" -> "${XSRFToken}")

 val headers_internaldeclaration = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-user-profile.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "1$581183307_826h6vMEARIAIGLUFFNPCKRPQRQVUGOPAKMIJN-0e27",
  "x-dtreferer" -> ({baseURL+"/cases/case-details/${caseId}/trigger/submitAppeal/submitAppealdeclaration"}),
  "x-xsrf-token" -> "${XSRFToken}")

 val headers_declarationsubmitted = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.create-event.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "1$581183307_826h7vMEARIAIGLUFFNPCKRPQRQVUGOPAKMIJN-0e28",
  "x-xsrf-token" -> "${XSRFToken}")






 val headers_42 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$38732415_350h7vDTRMSASFKPLKDRFKMHCCHMMCARPGMHGD-0")

 val headers_submitpro = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-case-view.v2+json",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$54833124_131h9vATDARLUPBSPUDUSAPAWSHOBJTNRRCQHS-0")

 val headers_access_read = Map(
  "accept" -> "application/json",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$38734236_77h15vDTRMSASFKPLKDRFKMHCCHMMCARPGMHGD-0",
  "x-dtreferer" -> ({baseURL+"/accept-terms-and-conditions"}))



 val headers_search = Map(
  "accept" -> "application/json",
  "content-type" -> "application/json",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "1$78439528_577h30vMLHQLCSRKNFMUHDPORRGHTRKDKTJURRW-0e38",
  "x-dtreferer" -> ({baseURL+"/cases/case-details/${caseId}#documents"}))


 val headers_searchinputs = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-search-input-details.v2+json;charset=UTF-8",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "2$536900434_67h8vCCMUBMSCGHNCUOIDBBTTAAOSNMJBIPAF-0e5")

 val headers_searchresults = Map(
  "accept" -> "application/json",
  "content-type" -> "application/json",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "2$536900434_67h13vCCMUBMSCGHNCUOIDBBTTAAOSNMJBIPAF-0e7")



 val headers_documents = Map(
  "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3",
  "Accept-Encoding" -> "gzip, deflate, br",
  "Accept-Language" -> "en-US,en;q=0.9",
  "Sec-Fetch-Mode" -> "navigate",
  "Sec-Fetch-Site" -> "none",
  "Upgrade-Insecure-Requests" -> "1")

 val headers_data_internal = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-user-profile.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "1$579436139_19h11vMEARIAIGLUFFNPCKRPQRQVUGOPAKMIJN-0e10",
  "x-dtreferer" -> ({baseURL+"/cases/case-filter"}),
  "x-xsrf-token" -> "9PNYZHJX-zWgns_wpICH3RZeczMbC9f8m6w0")

 val headers_isauthenticatedsubmit = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin")

 val headers_internalprofiledatasubmit = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-user-profile.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-xsrf-token" -> "9PNYZHJX-zWgns_wpICH3RZeczMbC9f8m6w0")

 val headers_internal_data_Declare= Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-user-profile.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$54833124_131h15vATDARLUPBSPUDUSAPAWSHOBJTNRRCQHS-0",
  "x-dtreferer" -> "https://manage-case.perftest.platform.hmcts.net/cases/case-details/${caseId}/trigger/submitAppeal/submitAppealdeclaration")

 val headers_data_internal_rep = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-user-profile.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$54110241_838h36vATDARLUPBSPUDUSAPAWSHOBJTNRRCQHS-0",
  "x-dtreferer" -> "https://manage-case.perftest.platform.hmcts.net/cases/case-create/IA/Asylum/startAppeal/startAppeallegalRepresentativeDetails")

 val headers_data_internal_cases = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-case-view.v2+json",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "1$78439528_577h37vMLHQLCSRKNFMUHDPORRGHTRKDKTJURRW-0e39")


 val headers_sharecase1 = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-start-event-trigger.v2+json;charset=UTF-8",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$61761456_902h29vGMGKQDHJNJUKWRAKMQJOGGKKAFNQFRAC-0")



 val headers_shareacasesubmit = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$54833124_131h35vATDARLUPBSPUDUSAPAWSHOBJTNRRCQHS-0")


 val headers_shareacase12 = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.create-event.v2+json;charset=UTF-8",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$61761456_902h35vGMGKQDHJNJUKWRAKMQJOGGKKAFNQFRAC-0")

 val headers_shareacase14 = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-case-view.v2+json",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$61761456_902h37vGMGKQDHJNJUKWRAKMQJOGGKKAFNQFRAC-0")


 val headers_di_casedetails = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-user-profile.v2+json;charset=UTF-8",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$54833124_131h34vATDARLUPBSPUDUSAPAWSHOBJTNRRCQHS-0",
  "x-dtreferer" -> ({baseURL+"/cases/case-details/${caseId}"}))

 val headers_di_shareacase = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-user-profile.v2+json;charset=UTF-8",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$54833124_131h37vATDARLUPBSPUDUSAPAWSHOBJTNRRCQHS-0",
  "x-dtreferer" -> ({baseURL+"/cases/case-details/${caseId}/trigger/shareACase/shareACaseshareACase"}))






}
