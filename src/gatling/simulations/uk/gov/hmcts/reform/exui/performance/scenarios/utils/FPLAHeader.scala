package uk.gov.hmcts.reform.exui.performance.scenarios.utils

object FPLAHeader {

 val baseURL = Environment.baseURL

 val commonHeader = Map(
  "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3",
  "Accept-Encoding" -> "gzip, deflate, br",
  "Accept-Language" -> "en-US,en;q=0.9",
  "Sec-Fetch-Mode" -> "navigate",
  "Sec-Fetch-Site" -> "cross-site",
  "Upgrade-Insecure-Requests" -> "1")

 val headers_16 = Map(
  "Accept" -> "application/json",
  "Accept-Encoding" -> "gzip, deflate, br",
  "Accept-Language" -> "en-US,en;q=0.9",
  "Content-Type" -> "application/json",
  "Origin" -> baseURL,
  "Sec-Fetch-Mode" -> "cors",
  "Sec-Fetch-Site" -> "cross-site")

 val headers_uploadfile = Map(
  "Accept" -> "",
  "Content-Type" -> "multipart/form-data; boundary=----WebKitFormBoundary0NoZ3fbG8de034Bj",
  "Origin" -> baseURL,
  "Sec-Fetch-Dest" -> "empty",
  "Sec-Fetch-Mode" -> "cors",
  "Sec-Fetch-Site" -> "same-origin")

 val headers_casecreation = Map(
  "Accept" -> "application/json",
  "Accept-Encoding" -> "gzip, deflate, br",
  "Accept-Language" -> "en-US,en;q=0.9",
  "Content-Type" -> "application/json",
  "Origin" -> baseURL,
  "Sec-Fetch-Mode" -> "cors",
  "Sec-Fetch-Site" -> "cross-site")

 val headers_startcreatecase = Map(
  "Accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-start-case-trigger.v2+json;charset=UTF-8",
  "Accept-Encoding" -> "gzip, deflate, br",
  "Accept-Language" -> "en-US,en;q=0.9",
  "Content-Type" -> "application/json",
  "Origin" -> baseURL,
  "Sec-Fetch-Mode" -> "cors",
  "Sec-Fetch-Site" -> "cross-site",
  "experimental" -> "true")

 val headers_71 = Map(
  "Accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
  "Content-Type" -> "application/json",
  "Origin" -> baseURL,
  "Sec-Fetch-Dest" -> "empty",
  "Sec-Fetch-Mode" -> "cors",
  "Sec-Fetch-Site" -> "same-origin",
  "experimental" -> "true")

 val headers_72 = Map(
  "Accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.create-case.v2+json;charset=UTF-8",
  "Accept-Encoding" -> "gzip, deflate, br",
  "Accept-Language" -> "en-US,en;q=0.9",
  "Content-Type" -> "application/json",
  "Origin" -> baseURL,
  "Sec-Fetch-Mode" -> "cors",
  "Sec-Fetch-Site" -> "cross-site",
  "experimental" -> "true")

 val headers_74 = Map(
  "Accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-case-view.v2+json",
  "Accept-Encoding" -> "gzip, deflate, br",
  "Accept-Language" -> "en-US,en;q=0.9",
  "Content-Type" -> "application/json",
  "Origin" -> baseURL,
  "Sec-Fetch-Mode" -> "cors",
  "Sec-Fetch-Site" -> "cross-site",
  "experimental" -> "true")

 val headers_76 = Map(
  "Accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-start-event-trigger.v2+json;charset=UTF-8",
  "Accept-Encoding" -> "gzip, deflate, br",
  "Accept-Language" -> "en-US,en;q=0.9",
  "Content-Type" -> "application/json",
  "Origin" -> baseURL,
  "Sec-Fetch-Mode" -> "cors",
  "Sec-Fetch-Site" -> "cross-site",
  "experimental" -> "true")

 val headers_80 = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.create-event.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "request-context" -> "appId=cid-v1:7922b140-fa5f-482d-89b4-e66e9e6d675a",
  "request-id" -> "|nMQoY.0IOZ+",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "1$101466490_0h45vJCFUPSDSUVDHGRGENWIRBFQHRCWFPFSS-0e52")

 val headers_81 = Map(
  "Accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.create-event.v2+json;charset=UTF-8",
  "Content-Type" -> "application/json",
  "Origin" -> baseURL,
  "Sec-Fetch-Dest" -> "empty",
  "Sec-Fetch-Mode" -> "cors",
  "Sec-Fetch-Site" -> "same-origin",
  "experimental" -> "true")

 val headers_139 = Map(
  "Accept" -> "",
  "Accept-Encoding" -> "gzip, deflate, br",
  "Accept-Language" -> "en-US,en;q=0.9",
  "Content-Type" -> "multipart/form-data; boundary=----WebKitFormBoundaryucjE7WrGyxbtCSQN",
  "Origin" -> baseURL,
  "Sec-Fetch-Mode" -> "cors",
  "Sec-Fetch-Site" -> "cross-site")

 val headers_140 = Map(
  "Accept" -> "",
  "Accept-Encoding" -> "gzip, deflate, br",
  "Accept-Language" -> "en-US,en;q=0.9",
  "Content-Type" -> "multipart/form-data; boundary=----WebKitFormBoundary9n7AAqp1SNXC8LRR",
  "Origin" -> baseURL,
  "Sec-Fetch-Mode" -> "cors",
  "Sec-Fetch-Site" -> "cross-site")

 val headers_search = Map(
  "accept" -> "application/json",
  "content-type" -> "application/json",
  "origin" -> "https://manage-case.perftest.platform.hmcts.net",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "1$514772036_188h36vUMEMPMRJCAHVTFMREDAAAJFACRUNIRCA-0e15",
  "x-dtreferer" -> ({baseURL+"/cases"}),
  "x-xsrf-token" -> "V67Cl4Bt-_Q-U-MUHK3EP2fLJE21zTWWRQkI")

 val headers_searchpaginationmetadata = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-search-input-details.v2+json;charset=UTF-8",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "1$514772036_188h38vUMEMPMRJCAHVTFMREDAAAJFACRUNIRCA-0e15",
  "x-dtreferer" -> ({baseURL+"/cases"}),
  "x-xsrf-token" -> "V67Cl4Bt-_Q-U-MUHK3EP2fLJE21zTWWRQkI")

 val headers_results = Map(
  "accept" -> "application/json",
  "content-type" -> "application/json",
  "origin" -> "https://manage-case.perftest.platform.hmcts.net",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "1$514772036_188h36vUMEMPMRJCAHVTFMREDAAAJFACRUNIRCA-0e15",
  "x-dtreferer" -> ({baseURL+"/cases"}))

 val headers_documents = Map(
  "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3",
  "Accept-Encoding" -> "gzip, deflate, br",
  "Accept-Language" -> "en-US,en;q=0.9",
  "Sec-Fetch-Mode" -> "navigate",
  "Sec-Fetch-Site" -> "none",
  "Upgrade-Insecure-Requests" -> "1")

 val headers_createprofile = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-user-profile.v2+json;charset=UTF-8",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$407919787_877h38vPKUSVOSAPKKCNGHKEFHLNFMFNJDCKBGI-0",
  "x-dtreferer" -> ({baseURL+"/cases/case-filter"}))

 val headers_opencaseprofile = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-user-profile.v2+json;charset=UTF-8",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$407919787_877h40vPKUSVOSAPKKCNGHKEFHLNFMFNJDCKBGI-0",
  "x-dtreferer" ->  ({baseURL+"/cases/case-create/PUBLICLAW/CARE_SUPERVISION_EPO/openCase/openCase1"}))

 val headers_casesprofile = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-case-view.v2+json",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$407919787_877h43vPKUSVOSAPKKCNGHKEFHLNFMFNJDCKBGI-0")


 val headers_orddersprofile = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-user-profile.v2+json;charset=UTF-8",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "request-context" -> "appId=cid-v1:32f2f79b-4f35-43d3-a880-a5a2e9f89979",
  "request-id" -> "|l2yDf.Y7WW",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$407919787_877h48vPKUSVOSAPKKCNGHKEFHLNFMFNJDCKBGI-0",
  "x-dtreferer" -> ({baseURL+"/cases/case-details/${caseId}"}))

 val headers_ordersneed1profile= Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-user-profile.v2+json;charset=UTF-8",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "request-context" -> "appId=cid-v1:32f2f79b-4f35-43d3-a880-a5a2e9f89979",
  "request-id" -> "|l2yDf.xtL1X",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$407919787_877h51vPKUSVOSAPKKCNGHKEFHLNFMFNJDCKBGI-0",
  "x-dtreferer" -> ({baseURL+"/cases/case-details/${caseId}/trigger/ordersNeeded/ordersNeeded1"}))

 val headers_hearingneededprofile = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-user-profile.v2+json;charset=UTF-8",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "request-context" -> "appId=cid-v1:32f2f79b-4f35-43d3-a880-a5a2e9f89979",
  "request-id" -> "|l2yDf.foKPP",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$407919787_877h61vPKUSVOSAPKKCNGHKEFHLNFMFNJDCKBGI-0",
  "x-dtreferer" -> ({baseURL+"/cases/case-details/${caseId}/trigger/ordersNeeded/ordersNeeded1"}))

 val headers_childrenprofile = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-user-profile.v2+json;charset=UTF-8",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "request-context" -> "appId=cid-v1:32f2f79b-4f35-43d3-a880-a5a2e9f89979",
  "request-id" -> "|l2yDf.c7MKw",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$407919787_877h72vPKUSVOSAPKKCNGHKEFHLNFMFNJDCKBGI-0",
  "x-dtreferer" -> ({baseURL+"/cases/case-details/${caseId}/trigger/enterChildren/enterChildren1"}))



 val headers_respondantprofile = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-user-profile.v2+json;charset=UTF-8",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "request-context" -> "appId=cid-v1:32f2f79b-4f35-43d3-a880-a5a2e9f89979",
  "request-id" -> "|l2yDf.qOiFU",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$407919787_877h83vPKUSVOSAPKKCNGHKEFHLNFMFNJDCKBGI-0",
  "x-dtreferer" -> ({baseURL+"/cases/case-details/${caseId}/trigger/enterRespondents/enterRespondents1"}))



 val headers_applicantprofile = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-user-profile.v2+json;charset=UTF-8",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "request-context" -> "appId=cid-v1:32f2f79b-4f35-43d3-a880-a5a2e9f89979",
  "request-id" -> "|l2yDf.SiNFL",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$407919787_877h101vPKUSVOSAPKKCNGHKEFHLNFMFNJDCKBGI-0",
  "x-dtreferer" -> ({baseURL+"/cases/case-details/${caseId}/trigger/enterApplicant/enterApplicant1"}))


 val headers_groundsprofile = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-user-profile.v2+json;charset=UTF-8",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "request-context" -> "appId=cid-v1:32f2f79b-4f35-43d3-a880-a5a2e9f89979",
  "request-id" -> "|l2yDf.eINt",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$407919787_877h111vPKUSVOSAPKKCNGHKEFHLNFMFNJDCKBGI-0",
  "x-dtreferer" -> ({baseURL+"/cases/case-details/${caseId}/trigger/enterGrounds/enterGrounds1"}))

 val headers_otherprofile = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-user-profile.v2+json;charset=UTF-8",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "request-context" -> "appId=cid-v1:32f2f79b-4f35-43d3-a880-a5a2e9f89979",
  "request-id" -> "|l2yDf.fYX/R",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$407919787_877h121vPKUSVOSAPKKCNGHKEFHLNFMFNJDCKBGI-0",
  "x-dtreferer" ->  ({baseURL+"/cases/case-details/${caseId}/trigger/otherProposal/otherProposal1"}))

 val headers_uploaddocprofile = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-user-profile.v2+json;charset=UTF-8",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "request-context" -> "appId=cid-v1:32f2f79b-4f35-43d3-a880-a5a2e9f89979",
  "request-id" -> "|l2yDf.l5g3b",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$407919787_877h132vPKUSVOSAPKKCNGHKEFHLNFMFNJDCKBGI-0",
  "x-dtreferer" -> ({baseURL+"/cases/case-details/${caseId}/trigger/uploadDocuments/uploadDocuments1"}))

 val headers_submitprofile = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-user-profile.v2+json;charset=UTF-8",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "request-context" -> "appId=cid-v1:32f2f79b-4f35-43d3-a880-a5a2e9f89979",
  "request-id" -> "|l2yDf.bYLSk",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$407919787_877h171vNMOKVINRMMCFSCDPWHJRAGBTITOCLLHM-0",
  "x-dtreferer" -> ({baseURL+"/cases/case-details/${caseId}/trigger/submitApplication/submitApplication1"}))

 val headers_viewtab = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$430739744_795h37vRRPOHSUEPACJDAFRRDTWMOFWLCMTVMIB-0")

 val headers_searchinputs = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-search-input-details.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$430739744_795h28vRRPOHSUEPACJDAFRRDTWMOFWLCMTVMIB-0")

 // ======================================================================================
 // following are for FPLA SDO
 //=======================================================================================


 val headers_adminsearch = Map(
  "accept" -> "application/json",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h20vUWPCCHAJMMTKNRNUMIFPABHONGSJAHPC-0",
  "x-dtreferer" -> ({baseURL+"/cases"}))

 val headers_67 = Map(
  "accept" -> "application/json",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h22vUWPCCHAJMMTKNRNUMIFPABHONGSJAHPC-0",
  "x-dtreferer" -> ({baseURL+"/cases"}))

 val headers_68 = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-search-input-details.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h23vUWPCCHAJMMTKNRNUMIFPABHONGSJAHPC-0",
  "x-dtreferer" -> ({baseURL+"/cases"}))

 val headers_69 = Map(
  "accept" -> "*/*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "text/plain;charset=UTF-8",
  "origin" -> "https://manage-case.perftest.platform.hmcts.net",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtreferer" -> ({baseURL+"/cases"}))

 val headers_871 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h24vUWPCCHAJMMTKNRNUMIFPABHONGSJAHPC-0")

 val headers_872 = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-case-view.v2+json",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h25vUWPCCHAJMMTKNRNUMIFPABHONGSJAHPC-0")

 val headers_admin_case_search = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h27vUWPCCHAJMMTKNRNUMIFPABHONGSJAHPC-0",
  "x-dtreferer" ->  ({baseURL+"/cases/case-search"}))


 val headers_adminsearchview = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-case-view.v2+json",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h25vUWPCCHAJMMTKNRNUMIFPABHONGSJAHPC-0")

 val headers_874 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h26vUWPCCHAJMMTKNRNUMIFPABHONGSJAHPC-0",
  "x-dtreferer" -> ({baseURL+"/cases/case-search"}))


 val headers_876 = Map(
  "accept" -> "*/*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "text/plain;charset=UTF-8",
  "origin" -> "https://manage-case.perftest.platform.hmcts.net",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtreferer" -> ({baseURL+"/cases/case-search"}))

 val headers_78 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h40vUWPCCHAJMMTKNRNUMIFPABHONGSJAHPC-0")

 val headers_sdo_casenumbergo = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-start-event-trigger.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h41vUWPCCHAJMMTKNRNUMIFPABHONGSJAHPC-0")



 val headers_sdo_casenumbergoprofile = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-user-profile.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h43vUWPCCHAJMMTKNRNUMIFPABHONGSJAHPC-0",
  "x-dtreferer" -> ({baseURL+"/cases/case-details/${caseId}"}))

 val headers_83 = Map(
  "accept" -> "*/*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "text/plain;charset=UTF-8",
  "origin" -> "https://manage-case.perftest.platform.hmcts.net",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtreferer" -> ({baseURL+"/cases/case-details/${caseId}"}))

 val headers_sdo_casenumbercontinue = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> "https://manage-case.perftest.platform.hmcts.net",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h44vUWPCCHAJMMTKNRNUMIFPABHONGSJAHPC-0")


 val headers_sdo_casenumbercontinueprofile = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-user-profile.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h46vUWPCCHAJMMTKNRNUMIFPABHONGSJAHPC-0",
  "x-dtreferer" ->  ({baseURL+"/cases/case-details/${caseId}/trigger/addFamilyManCaseNumber/addFamilyManCaseNumber1"}))

 val headers_89 = Map(
  "accept" -> "*/*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "text/plain;charset=UTF-8",
  "origin" -> "https://manage-case.perftest.platform.hmcts.net",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtreferer" ->  ({baseURL+"/cases/case-details/${caseId}/trigger/addFamilyManCaseNumber/addFamilyManCaseNumber1"}))

 val headers_sdo_casenumber_view = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.create-event.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h47vUWPCCHAJMMTKNRNUMIFPABHONGSJAHPC-0")

 val headers_92 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h48vUWPCCHAJMMTKNRNUMIFPABHONGSJAHPC-0")

 val headers_93 = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-case-view.v2+json",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h49vUWPCCHAJMMTKNRNUMIFPABHONGSJAHPC-0")

 val headers_94 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h51vUWPCCHAJMMTKNRNUMIFPABHONGSJAHPC-0",
  "x-dtreferer" -> ({baseURL+"/cases/case-details/${caseId}/trigger/addFamilyManCaseNumber/submit"}))


 val headers_96 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h50vUWPCCHAJMMTKNRNUMIFPABHONGSJAHPC-0",
  "x-dtreferer" -> ({baseURL+"/cases/case-details/${caseId}/trigger/addFamilyManCaseNumber/submit"}))

 val headers_97 = Map(
  "accept" -> "*/*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "text/plain;charset=UTF-8",
  "origin" -> "https://manage-case.perftest.platform.hmcts.net",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtreferer" -> ({baseURL+"/cases/case-details/${caseId}/trigger/addFamilyManCaseNumber/submit"}))

 val headers_99 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h65vUWPCCHAJMMTKNRNUMIFPABHONGSJAHPC-0")

 val headers_100 = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-start-event-trigger.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h66vUWPCCHAJMMTKNRNUMIFPABHONGSJAHPC-0")

 val headers_101 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h67vUWPCCHAJMMTKNRNUMIFPABHONGSJAHPC-0")

 val headers_102 = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-user-profile.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h68vUWPCCHAJMMTKNRNUMIFPABHONGSJAHPC-0",
  "x-dtreferer" -> ({baseURL+"/cases/case-details/${caseId}"}))

 val headers_106 = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h69vUWPCCHAJMMTKNRNUMIFPABHONGSJAHPC-0")

 val headers_107 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h70vUWPCCHAJMMTKNRNUMIFPABHONGSJAHPC-0")

 val headers_109 = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-user-profile.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h71vUWPCCHAJMMTKNRNUMIFPABHONGSJAHPC-0",
  "x-dtreferer" -> ({baseURL+"/cases/case-details/${caseId}/trigger/hearingBookingDetails/hearingBookingDetails1"}))

 val headers_110 = Map(
  "accept" -> "*/*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "text/plain;charset=UTF-8",
  "origin" -> "https://manage-case.perftest.platform.hmcts.net",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtreferer" -> ({baseURL+"/cases/case-details/${caseId}/trigger/hearingBookingDetails/hearingBookingDetails1"}))


 val headers_112 = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.create-event.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h72vUWPCCHAJMMTKNRNUMIFPABHONGSJAHPC-0")

 val headers_113 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h73vUWPCCHAJMMTKNRNUMIFPABHONGSJAHPC-0")

 val headers_114 = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-case-view.v2+json",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h74vUWPCCHAJMMTKNRNUMIFPABHONGSJAHPC-0")

 val headers_115 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h76vUWPCCHAJMMTKNRNUMIFPABHONGSJAHPC-0",
  "x-dtreferer" -> ({baseURL+"/cases/case-details/${caseId}/trigger/hearingBookingDetails/submit"}))


 val headers_116 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h75vUWPCCHAJMMTKNRNUMIFPABHONGSJAHPC-0",
  "x-dtreferer" -> ({baseURL+"/cases/case-details/${caseId}/trigger/hearingBookingDetails/submit"}))

 val headers_117 = Map(
  "accept" -> "*/*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "text/plain;charset=UTF-8",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtreferer" -> "https://manage-case.perftest.platform.hmcts.net/cases/case-details/${caseId}/trigger/hearingBookingDetails/submit")

 val headers_120 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h90vUWPCCHAJMMTKNRNUMIFPABHONGSJAHPC-0")

 val headers_121 = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-start-event-trigger.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h91vUWPCCHAJMMTKNRNUMIFPABHONGSJAHPC-0")

 val headers_122 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h92vUWPCCHAJMMTKNRNUMIFPABHONGSJAHPC-0")

 val headers_124 = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-user-profile.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h93vUWPCCHAJMMTKNRNUMIFPABHONGSJAHPC-0",
  "x-dtreferer" -> ({baseURL+"/cases/case-details/${caseId}/trigger/cases/case-details/${caseId}"}))


 val headers_127 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h95vUWPCCHAJMMTKNRNUMIFPABHONGSJAHPC-0")

 val headers_128 = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> "https://manage-case.perftest.platform.hmcts.net",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h94vUWPCCHAJMMTKNRNUMIFPABHONGSJAHPC-0")

 val headers_130 = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-user-profile.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h96vUWPCCHAJMMTKNRNUMIFPABHONGSJAHPC-0",
  "x-dtreferer" -> ({baseURL+"/cases/case-details/${caseId}/trigger/allocatedJudge/allocatedJudgeAllocatedJudge"}))



 val headers_131 = Map(
  "accept" -> "*/*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "text/plain;charset=UTF-8",
  "origin" -> "https://manage-case.perftest.platform.hmcts.net",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtreferer" -> ({baseURL+"/cases/case-details/${caseId}/trigger/allocatedJudge/allocatedJudgeAllocatedJudge"}))



 val headers_133 = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.create-event.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h97vUWPCCHAJMMTKNRNUMIFPABHONGSJAHPC-0")

 val headers_134 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h98vUWPCCHAJMMTKNRNUMIFPABHONGSJAHPC-0")

 val headers_135 = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-case-view.v2+json",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h99vUWPCCHAJMMTKNRNUMIFPABHONGSJAHPC-0")

 val headers_136 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h101vUWPCCHAJMMTKNRNUMIFPABHONGSJAHPC-0",
  "x-dtreferer" -> ({baseURL+"/cases/case-details/${caseId}/trigger/allocatedJudge/submit"}))

 val headers_137 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h100vUWPCCHAJMMTKNRNUMIFPABHONGSJAHPC-0",
  "x-dtreferer" -> ({baseURL+"/cases/case-details/${caseId}/trigger/allocatedJudge/submit"}))

 val headers_138 = Map(
  "accept" -> "*/*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "text/plain;charset=UTF-8",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtreferer" -> ({baseURL+"/cases/case-details/${caseId}/trigger/allocatedJudge/submit"}))

 val headers_141 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h115vAHRFSBEAGTDRREKAQMHFKDWAKLKJUEMH-0")

 val headers_142 = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-start-event-trigger.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h116vAHRFSBEAGTDRREKAQMHFKDWAKLKJUEMH-0")

 val headers_143 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h117vAHRFSBEAGTDRREKAQMHFKDWAKLKJUEMH-0")

 val headers_145 = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-user-profile.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h118vAHRFSBEAGTDRREKAQMHFKDWAKLKJUEMH-0",
  "x-dtreferer" ->  ({baseURL+"/cases/case-details/${caseId}"}))


 val headers_148 = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h119vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0")

 val headers_149 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h120vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0")

 val headers_151 = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-user-profile.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h121vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0",
  "x-dtreferer" -> ({baseURL+"/cases/case-details/${caseId}/trigger/sendToGatekeeper/sendToGatekeeper1"}))

 val headers_152 = Map(
  "accept" -> "*/*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "text/plain;charset=UTF-8",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtreferer" -> ({baseURL+"/cases/case-details/${caseId}/trigger/sendToGatekeeper/sendToGatekeeper1"}))


 val headers_154 = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.create-event.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h122vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0")

 val headers_155 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h123vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0")

 val headers_156 = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-case-view.v2+json",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h124vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0")

 val headers_157 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h126vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0",
  "x-dtreferer" ->  ({baseURL+"/cases/case-details/${caseId}/trigger/sendToGatekeeper/submit"}))


 val headers_158 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$142779249_815h125vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0",
  "x-dtreferer" ->  ({baseURL+"/cases/case-details/${caseId}/trigger/sendToGatekeeper/submit"}))

 val headers_159 = Map(
  "accept" -> "*/*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "text/plain;charset=UTF-8",
  "origin" -> "https://manage-case.perftest.platform.hmcts.net",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtreferer" ->  ({baseURL+"/cases/case-details/${caseId}/trigger/sendToGatekeeper/submit"}))

 val headers_162 = Map(
  "accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "document",
  "sec-fetch-mode" -> "navigate",
  "sec-fetch-site" -> "same-origin",
  "sec-fetch-user" -> "?1",
  "upgrade-insecure-requests" -> "1")

 val headers_168 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150230120_154h2vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0")

 val headers_169 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150230120_154h3vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0")

 val headers_170 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150230120_154h4vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0")

 val headers_171 = Map(
  "accept" -> "*/*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "if-modified-since" -> "Fri, 22 May 2020 09:00:00 GMT",
  "sec-fetch-dest" -> "script",
  "sec-fetch-mode" -> "no-cors",
  "sec-fetch-site" -> "cross-site")

 val headers_197 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h3vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0")

 val headers_198 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h4vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0")

 val headers_199 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h2vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0")

 val headers_203 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h7vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0")

 val headers_210 = Map(
  "accept" -> "application/json",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h8vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0",
  "x-dtreferer" -> baseURL)

 val headers_211 = Map(
  "accept" -> "application/json",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h9vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0",
  "x-dtreferer" -> baseURL)

 val headers_212 = Map(
  "accept" -> "application/json",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h10vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0",
  "x-dtreferer" -> baseURL)

 val headers_213 = Map(
  "accept" -> "application/json",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h11vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0",
  "x-dtreferer" -> baseURL)

 val headers_215 = Map(
  "accept" -> "application/json",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h13vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0",
  "x-dtreferer" -> baseURL)

 val headers_217 = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-workbasket-input-details.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h12vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0",
  "x-dtreferer" -> baseURL)

 val headers_218 = Map(
  "accept" -> "application/json",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h15vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0",
  "x-dtreferer" -> baseURL)

 val headers_219 = Map(
  "accept" -> "application/json",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h17vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0",
  "x-dtreferer" -> baseURL)

 val headers_220 = Map(
  "accept" -> "application/json",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h16vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0",
  "x-dtreferer" -> baseURL)

 val headers_223 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h18vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0")

 val headers_225 = Map(
  "accept" -> "application/json",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h19vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0",
  "x-dtreferer" ->  ({baseURL+"/cases"}))



 val headers_226 = Map(
  "accept" -> "application/json",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h20vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0",
  "x-dtreferer" ->  ({baseURL+"/cases"}))

 val headers_227 = Map(
  "accept" -> "application/json",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h21vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0",
  "x-dtreferer" ->  ({baseURL+"/cases"}))

 val headers_228 = Map(
  "accept" -> "application/json",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h22vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0",
  "x-dtreferer" ->  ({baseURL+"/cases"}))

 val headers_229 = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-search-input-details.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h23vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0",
  "x-dtreferer" ->  ({baseURL+"/cases"}))

 val headers_232 = Map(
  "accept" -> "application/json",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h24vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0")

 val headers_233 = Map(
  "accept" -> "application/json",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h25vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0")

 val headers_236 = Map(
  "accept" -> "application/json",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h26vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0")

 val headers_237 = Map(
  "accept" -> "application/json",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h27vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0")

 val headers_240 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h28vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0")

 val headers_241 = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-case-view.v2+json",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h29vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0")

 val headers_242 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h31vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0",
  "x-dtreferer" ->  ({baseURL+"/cases/case-search"}))

 val headers_243 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h30vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0",
  "x-dtreferer" -> ({baseURL+"/cases/case-search"}))

 val headers_247 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h44vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0")

 val headers_248 = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-start-event-trigger.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin")


 val headers_249 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h46vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0")

 val headers_251 = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-user-profile.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin")

 val headers_254 = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin")

 val headers_255 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h49vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0")

 val headers_256 = Map(
  "accept" -> "*/*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "text/plain;charset=UTF-8",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtreferer" -> ({baseURL+"/cases/case-details/${caseId}/trigger/draftSDO/draftSDOSdoDateOfIssue"}))

 val headers_259 = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h50vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0")

 val headers_260 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h51vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0")

 val headers_262 = Map(
  "accept" -> "*/*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "text/plain;charset=UTF-8",
  "origin" -> "https://manage-case.perftest.platform.hmcts.net",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtreferer" -> ({baseURL+"/cases/case-details/${caseId}/trigger/draftSDO/draftSDOjudgeAndLegalAdvisor"}))


 val headers_264 = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h52vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0")

 val headers_265 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h53vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0")

 val headers_267 = Map(
  "accept" -> "*/*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "text/plain;charset=UTF-8",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtreferer" -> ({baseURL+"/cases/case-details/${caseId}/trigger/draftSDO/draftSDOallPartiesDirections"}))



 val headers_269 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h55vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0")

 val headers_270 = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h54vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0")

 val headers_272 = Map(
  "accept" -> "*/*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "text/plain;charset=UTF-8",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtreferer" -> ({baseURL+"/cases/case-details/${caseId}/trigger/draftSDO/draftSDOlocalAuthorityDirections"}))


 val headers_274 = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h56vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0")

 val headers_275 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h57vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0")

 val headers_277 = Map(
  "accept" -> "*/*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "text/plain;charset=UTF-8",
  "origin" -> "https://manage-case.perftest.platform.hmcts.net",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtreferer" ->  ({baseURL+"/cases/case-details/${caseId}/trigger/draftSDO/draftSDOparentsAndRespondentsDirections"}))



 val headers_279 = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h58vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0")

 val headers_280 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h59vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0")

 val headers_282 = Map(
  "accept" -> "*/*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "text/plain;charset=UTF-8",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtreferer" -> ({baseURL+"/cases/case-details/${caseId}/trigger/draftSDO/draftSDOcafcassDirections"}))


 val headers_284 = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h60vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0")

 val headers_285 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h61vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0")

 val headers_287 = Map(
  "accept" -> "*/*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "text/plain;charset=UTF-8",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtreferer" -> ({baseURL+"/cases/case-details/${caseId}/trigger/draftSDO/draftSDOotherPartiesDirections"}))


 val headers_289 = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h62vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0")

 val headers_290 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h63vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0")

 val headers_293 = Map(
  "accept" -> "*/*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "text/plain;charset=UTF-8",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtreferer" -> ({baseURL+"/cases/case-details/${caseId}/trigger/draftSDO/draftSDOcourtDirections"}))



 val headers_295 = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.case-data-validate.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h64vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0")

 val headers_296 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h65vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0")

 val headers_298 = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-user-profile.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin")

 val headers_299 = Map(
  "accept" -> "*/*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "text/plain;charset=UTF-8",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtreferer" -> ({baseURL+"/cases/case-details/${caseId}/trigger/draftSDO/draftSDOdocumentReview"}))


 val headers_301 = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.create-event.v2+json;charset=UTF-8",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin")

 val headers_303 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h68vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0")

 val headers_304 = Map(
  "accept" -> "application/vnd.uk.gov.hmcts.ccd-data-store-api.ui-case-view.v2+json",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "application/json",
  "experimental" -> "true",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin")

 val headers_305 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin")

 val headers_306 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin")

 val headers_308 = Map(
  "accept" -> "*/*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "content-type" -> "text/plain;charset=UTF-8",
  "origin" -> baseURL,
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtreferer" ->  ({baseURL+"/cases/case-details/${caseId}/trigger/draftSDO/submit"}))

 val headers_310 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h86vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0")

 val headers_314 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$150478102_170h87vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0")

 val headers_321 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$151995464_260h3vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0")

 val headers_322 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$151995464_260h4vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0")

 val headers_323 = Map(
  "accept" -> "application/json, text/plain, */*",
  "accept-encoding" -> "gzip, deflate, br",
  "accept-language" -> "en-US,en;q=0.9",
  "sec-fetch-dest" -> "empty",
  "sec-fetch-mode" -> "cors",
  "sec-fetch-site" -> "same-origin",
  "x-dtpc" -> "3$151995464_260h2vLUKIPDRTGHKMLPHEPIVUENOBLKPRFDMA-0")

}
