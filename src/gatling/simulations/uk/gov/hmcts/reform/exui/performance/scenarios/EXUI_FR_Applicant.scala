package uk.gov.hmcts.reform.exui.performance.scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import uk.gov.hmcts.reform.exui.performance.scenarios.utils.Environment
import uk.gov.hmcts.reform.exui.performance.scenarios.utils.FR_Applicant_Header._

object EXUI_FR_Applicant  {

	val minThinkTime = Environment.minThinkTimeFR
	val maxThinkTime = Environment.maxThinkTimeFR

	val createCase = scenario("CreateCase")
	  	.exec(http("XUI${service}_030_CreateCase1")
			.get("/aggregated/caseworkers/:uid/jurisdictions?access=create")
			.headers(headers_2)
			.check(status in (200,304)))
		.pause(minThinkTime, maxThinkTime)

		.exec(http("XUI${service}_040_005_CreateCaseEvent")
			.get("/data/internal/case-types/FinancialRemedyConsentedRespondent/event-triggers/FR_solicitorCreate?ignore-warning=false")
			.headers(headers_6)
			.check(status in (200,304)))


		.exec(http("XUI${service}_040_010_CreateCaseEvent2")
			.get("/data/internal/case-types/FinancialRemedyConsentedRespondent/event-triggers/FR_solicitorCreate?ignore-warning=false")
			.headers(headers_8)
			.check(jsonPath("$..event_token").saveAs("eventToken"))
			.check(status in (200,304)))


		.exec(http("XUI${service}_040_015_CreateCaseProfile")
			.get("/data/internal/profile")
			.headers(headers_9)
			.check(status in (200,304)))
		.pause(minThinkTime, maxThinkTime)

		.exec(http("XUI${service}_050_CreateSolicitor")
			.post("/data/case-types/FinancialRemedyConsentedRespondent/validate?pageId=FR_solicitorCreate1")
			.headers(headers_10)
			.body(StringBody("""{
					 |  "data": {
					 |    "isAdmin": null
					 |  },
					 |  "event": {
					 |    "id": "FR_solicitorCreate",
					 |    "summary": "",
					 |    "description": ""
					 |  },
					 |  "event_token": "${eventToken}",
					 |  "ignore_warning": false,
					 |  "event_data": {
					 |    "isAdmin": null
					 |  }
					 |}""".stripMargin))
			.check(status in (200,304)))
		.pause(minThinkTime, maxThinkTime)

		.exec(http("XUI${service}_060_GetAddress")
			.get("/api/addresses?postcode=SW1H9AJ")
			.headers(headers_15)
			.check(status in (200,304)))
		.pause(minThinkTime, maxThinkTime)

		.exec(http("XUI${service}_070_CreateSolicitor2")
			.post("/data/case-types/FinancialRemedyConsentedRespondent/validate?pageId=FR_solicitorCreate2")
			.headers(headers_18)
			.body(StringBody("""{
					 |  "data": {
					 |    "solicitorName": "Joe Bloggs",
					 |    "solicitorFirm": "HMCTS",
					 |    "solicitorReference": null,
					 |    "solicitorAddress": {
					 |      "AddressLine1": "Ministry Of Justice",
					 |      "AddressLine2": "Seventh Floor 102 Petty France",
					 |      "AddressLine3": "",
					 |      "PostTown": "London",
					 |      "County": "",
					 |      "PostCode": "SW1H 9AJ",
					 |      "Country": "United Kingdom"
					 |    },
					 |    "solicitorPhone": null,
					 |    "solicitorEmail": "abc@email.com",
					 |    "solicitorDXnumber": null,
					 |    "solicitorAgreeToReceiveEmails": "No"
					 |  },
					 |  "event": {
					 |    "id": "FR_solicitorCreate",
					 |    "summary": "",
					 |    "description": ""
					 |  },
					 |  "event_token": "${eventToken}",
					 |  "ignore_warning": false,
					 |  "event_data": {
					 |    "isAdmin": "No",
					 |    "solicitorName": "Joe Bloggs",
					 |    "solicitorFirm": "HMCTS",
					 |    "solicitorReference": null,
					 |    "solicitorAddress": {
					 |      "AddressLine1": "Ministry Of Justice",
					 |      "AddressLine2": "Seventh Floor 102 Petty France",
					 |      "AddressLine3": "",
					 |      "PostTown": "London",
					 |      "County": "",
					 |      "PostCode": "SW1H 9AJ",
					 |      "Country": "United Kingdom"
					 |    },
					 |    "solicitorPhone": null,
					 |    "solicitorEmail": "abc@email.com",
					 |    "solicitorDXnumber": null,
					 |    "solicitorAgreeToReceiveEmails": "No"
					 |  }
					 |}""".stripMargin))
			.check(status in (200,304)))
		.pause(minThinkTime, maxThinkTime)

		.exec(http("XUI${service}_080_CreateSolicitor3")
			.post("/data/case-types/FinancialRemedyConsentedRespondent/validate?pageId=FR_solicitorCreate3")
			.headers(headers_22)
			.body(StringBody("""{
					 |  "data": {
					 |    "divorceCaseNumber": "EZ11D81265",
					 |    "divorceStageReached": "Petition Issued"
					 |  },
					 |  "event": {
					 |    "id": "FR_solicitorCreate",
					 |    "summary": "",
					 |    "description": ""
					 |  },
					 |  "event_token": "${eventToken}",
					 |  "ignore_warning": false,
					 |  "event_data": {
					 |    "isAdmin": "No",
					 |    "solicitorName": "Joe Bloggs",
					 |    "solicitorFirm": "HMCTS",
					 |    "solicitorReference": null,
					 |    "solicitorAddress": {
					 |      "AddressLine1": "Ministry Of Justice",
					 |      "AddressLine2": "Seventh Floor 102 Petty France",
					 |      "AddressLine3": "",
					 |      "PostTown": "London",
					 |      "County": "",
					 |      "PostCode": "SW1H 9AJ",
					 |      "Country": "United Kingdom"
					 |    },
					 |    "solicitorPhone": null,
					 |    "solicitorEmail": "abc@email.com",
					 |    "solicitorDXnumber": null,
					 |    "solicitorAgreeToReceiveEmails": "No",
					 |    "divorceCaseNumber": "EZ11D81265",
					 |    "divorceStageReached": "Petition Issued"
					 |  }
					 |}""".stripMargin))
			.check(status in (200,304)))
		.pause(minThinkTime, maxThinkTime)

		.exec(http("XUI${service}_090_CreateSolicitor4")
			.post("/data/case-types/FinancialRemedyConsentedRespondent/validate?pageId=FR_solicitorCreate4")
			.headers(headers_26)
			.body(StringBody("""{
					 |  "data": {
					 |    "applicantFMName": "Joe",
					 |    "applicantLName": "Baker",
					 |    "regionList": "southeast",
					 |    "southEastFRCList": "kent",
					 |    "kentSurreyCourtList": "FR_kent_surreyList_10"
					 |  },
					 |  "event": {
					 |    "id": "FR_solicitorCreate",
					 |    "summary": "",
					 |    "description": ""
					 |  },
					 |  "event_token": "${eventToken}",
					 |  "ignore_warning": false,
					 |  "event_data": {
					 |    "isAdmin": "No",
					 |    "solicitorName": "Joe Bloggs",
					 |    "solicitorFirm": "HMCTS",
					 |    "solicitorReference": null,
					 |    "solicitorAddress": {
					 |      "AddressLine1": "Ministry Of Justice",
					 |      "AddressLine2": "Seventh Floor 102 Petty France",
					 |      "AddressLine3": "",
					 |      "PostTown": "London",
					 |      "County": "",
					 |      "PostCode": "SW1H 9AJ",
					 |      "Country": "United Kingdom"
					 |    },
					 |    "solicitorPhone": null,
					 |    "solicitorEmail": "abc@email.com",
					 |    "solicitorDXnumber": null,
					 |    "solicitorAgreeToReceiveEmails": "No",
					 |    "divorceCaseNumber": "EZ11D81265",
					 |    "divorceStageReached": "Petition Issued",
					 |    "applicantFMName": "Joe",
					 |    "applicantLName": "Baker",
					 |    "regionList": "southeast",
					 |    "southEastFRCList": "kent",
					 |    "kentSurreyCourtList": "FR_kent_surreyList_10"
					 |  }
					 |}""".stripMargin))
			.check(status in (200,304)))
		.pause(minThinkTime, maxThinkTime)

		.exec(http("XUI${service}_100_GetShareCaseOrgs")
			.get("/api/caseshare/orgs")
			.headers(headers_27)
			.check(status in (200,304)))
		.pause(minThinkTime, maxThinkTime)

		.exec(http("XUI${service}_110_GetAddress2")
			.get("/api/addresses?postcode=SW1H9AJ")
			.headers(headers_31)
			.check(status in (200,304)))
		.pause(minThinkTime, maxThinkTime)

		.exec(http("XUI${service}_120_CreateSolicitor5")
			.post("/data/case-types/FinancialRemedyConsentedRespondent/validate?pageId=FR_solicitorCreate5")
			.headers(headers_34)
			.body(StringBody("""{
					 |  "data": {
					 |    "appRespondentFMName": "Stephen",
					 |    "appRespondentLName": "Parker",
					 |    "appRespondentRep": "Yes",
					 |    "rSolicitorName": "Adam Walker",
					 |    "rOrgPolicy": {
					 |      "Organisation": {
					 |        "OrganisationID": "${respondent_orgref}",
					 |        "OrganisationName": "${respondent_orgname}"
					 |      },
					 |      "OrgPolicyCaseAssignedRole": "[RESPSOLICITOR]",
					 |      "OrgPolicyReference": "Test Resp Sol Ref"
					 |    },
					 |    "rSolicitorFirm": "resp sol & co",
					 |    "rSolicitorReference": null,
					 |    "rSolicitorAddress": {
					 |      "AddressLine1": "Ministry Of Justice",
					 |      "AddressLine2": "Seventh Floor 102 Petty France",
					 |      "AddressLine3": "",
					 |      "PostTown": "London",
					 |      "County": "",
					 |      "PostCode": "SW1H 9AJ",
					 |      "Country": "United Kingdom"
					 |    },
					 |    "rSolicitorPhone": null,
					 |    "rSolicitorEmail": null,
					 |    "rSolicitorDXnumber": null
					 |  },
					 |  "event": {
					 |    "id": "FR_solicitorCreate",
					 |    "summary": "",
					 |    "description": ""
					 |  },
					 |  "event_token": "${eventToken}",
					 |  "ignore_warning": false,
					 |  "event_data": {
					 |    "isAdmin": "No",
					 |    "solicitorName": "Joe Bloggs",
					 |    "solicitorFirm": "HMCTS",
					 |    "solicitorReference": null,
					 |    "solicitorAddress": {
					 |      "AddressLine1": "Ministry Of Justice",
					 |      "AddressLine2": "Seventh Floor 102 Petty France",
					 |      "AddressLine3": "",
					 |      "PostTown": "London",
					 |      "County": "",
					 |      "PostCode": "SW1H 9AJ",
					 |      "Country": "United Kingdom"
					 |    },
					 |    "solicitorPhone": null,
					 |    "solicitorEmail": "abc@email.com",
					 |    "solicitorDXnumber": null,
					 |    "solicitorAgreeToReceiveEmails": "No",
					 |    "divorceCaseNumber": "EZ11D81265",
					 |    "divorceStageReached": "Petition Issued",
					 |    "applicantFMName": "Joe",
					 |    "applicantLName": "Baker",
					 |    "regionList": "southeast",
					 |    "southEastFRCList": "kent",
					 |    "kentSurreyCourtList": "FR_kent_surreyList_10",
					 |    "appRespondentFMName": "Stephen",
					 |    "appRespondentLName": "Parker",
					 |    "appRespondentRep": "Yes",
					 |    "rSolicitorName": "Adam Walker",
					 |    "rOrgPolicy": {
					 |      "Organisation": {
					 |        "OrganisationID": "${respondent_orgref}",
					 |        "OrganisationName": "${respondent_orgname}"
					 |      },
					 |      "OrgPolicyCaseAssignedRole": "[RESPSOLICITOR]",
					 |      "OrgPolicyReference": "Test Resp Sol Ref"
					 |    },
					 |    "rSolicitorFirm": "resp sol & co",
					 |    "rSolicitorReference": null,
					 |    "rSolicitorAddress": {
					 |      "AddressLine1": "Ministry Of Justice",
					 |      "AddressLine2": "Seventh Floor 102 Petty France",
					 |      "AddressLine3": "",
					 |      "PostTown": "London",
					 |      "County": "",
					 |      "PostCode": "SW1H 9AJ",
					 |      "Country": "United Kingdom"
					 |    },
					 |    "rSolicitorPhone": null,
					 |    "rSolicitorEmail": null,
					 |    "rSolicitorDXnumber": null
					 |  }
					 |}""".stripMargin))
			.check(status in (200,304)))
		.pause(minThinkTime, maxThinkTime)

		.exec(http("XUI${service}_130_CreateSolicitor6")
			.post("/data/case-types/FinancialRemedyConsentedRespondent/validate?pageId=FR_solicitorCreate6")
			.headers(headers_37)
			.body(StringBody("""{
					 |  "data": {
					 |    "natureOfApplication2": [
					 |      "Lump Sum Order"
					 |    ]
					 |  },
					 |  "event": {
					 |    "id": "FR_solicitorCreate",
					 |    "summary": "",
					 |    "description": ""
					 |  },
					 |  "event_token": "${eventToken}",
					 |  "ignore_warning": false,
					 |  "event_data": {
					 |    "isAdmin": "No",
					 |    "solicitorName": "Joe Bloggs",
					 |    "solicitorFirm": "HMCTS",
					 |    "solicitorReference": null,
					 |    "solicitorAddress": {
					 |      "AddressLine1": "Ministry Of Justice",
					 |      "AddressLine2": "Seventh Floor 102 Petty France",
					 |      "AddressLine3": "",
					 |      "PostTown": "London",
					 |      "County": "",
					 |      "PostCode": "SW1H 9AJ",
					 |      "Country": "United Kingdom"
					 |    },
					 |    "solicitorPhone": null,
					 |    "solicitorEmail": "abc@email.com",
					 |    "solicitorDXnumber": null,
					 |    "solicitorAgreeToReceiveEmails": "No",
					 |    "divorceCaseNumber": "EZ11D81265",
					 |    "divorceStageReached": "Petition Issued",
					 |    "applicantFMName": "Joe",
					 |    "applicantLName": "Baker",
					 |    "regionList": "southeast",
					 |    "southEastFRCList": "kent",
					 |    "kentSurreyCourtList": "FR_kent_surreyList_10",
					 |    "appRespondentFMName": "Stephen",
					 |    "appRespondentLName": "Parker",
					 |    "appRespondentRep": "Yes",
					 |    "rSolicitorName": "Adam Walker",
					 |    "rOrgPolicy": {
					 |      "Organisation": {
					 |        "OrganisationID": "${respondent_orgref}",
					 |        "OrganisationName": "${respondent_orgname}"
					 |      },
					 |      "OrgPolicyCaseAssignedRole": "[RESPSOLICITOR]",
					 |      "OrgPolicyReference": "Test Resp Sol Ref"
					 |    },
					 |    "rSolicitorFirm": "resp sol & co",
					 |    "rSolicitorReference": null,
					 |    "rSolicitorAddress": {
					 |      "AddressLine1": "Ministry Of Justice",
					 |      "AddressLine2": "Seventh Floor 102 Petty France",
					 |      "AddressLine3": "",
					 |      "PostTown": "London",
					 |      "County": "",
					 |      "PostCode": "SW1H 9AJ",
					 |      "Country": "United Kingdom"
					 |    },
					 |    "rSolicitorPhone": null,
					 |    "rSolicitorEmail": null,
					 |    "rSolicitorDXnumber": null,
					 |    "natureOfApplication2": [
					 |      "Lump Sum Order"
					 |    ]
					 |  }
					 |}""".stripMargin))
			.check(status in (200,304)))
		.pause(minThinkTime, maxThinkTime)

		.exec(http("XUI${service}_140_GetDocuments1")
			.post("/documents")
			.headers(headers_41)
			.bodyPart(RawFileBodyPart("files", "dummy.pdf")
				.fileName("dummy.pdf")
				.transferEncoding("binary"))
			.asMultipartForm
			.formParam("classification", "PUBLIC")
			.check(jsonPath("$..href").saveAs("href1"))
			.check(status in (200,304)))
		.pause(minThinkTime, maxThinkTime)

		.exec(http("XUI${service}_150_CreateSolicitor8")
			.post("/data/case-types/FinancialRemedyConsentedRespondent/validate?pageId=FR_solicitorCreate8")
			.headers(headers_44)
			.body(StringBody("""{
					 |  "data": {
					 |    "consentOrder": {
					 |      "document_url": "${href1}",
					 |      "document_binary_url": "${href1}/binary",
					 |      "document_filename": "dummy.pdf"
					 |    }
					 |  },
					 |  "event": {
					 |    "id": "FR_solicitorCreate",
					 |    "summary": "",
					 |    "description": ""
					 |  },
					 |  "event_token": "${eventToken}",
					 |  "ignore_warning": false,
					 |  "event_data": {
					 |    "isAdmin": "No",
					 |    "solicitorName": "Joe Bloggs",
					 |    "solicitorFirm": "HMCTS",
					 |    "solicitorReference": null,
					 |    "solicitorAddress": {
					 |      "AddressLine1": "Ministry Of Justice",
					 |      "AddressLine2": "Seventh Floor 102 Petty France",
					 |      "AddressLine3": "",
					 |      "PostTown": "London",
					 |      "County": "",
					 |      "PostCode": "SW1H 9AJ",
					 |      "Country": "United Kingdom"
					 |    },
					 |    "solicitorPhone": null,
					 |    "solicitorEmail": "abc@email.com",
					 |    "solicitorDXnumber": null,
					 |    "solicitorAgreeToReceiveEmails": "No",
					 |    "divorceCaseNumber": "EZ11D81265",
					 |    "divorceStageReached": "Petition Issued",
					 |    "applicantFMName": "Joe",
					 |    "applicantLName": "Baker",
					 |    "regionList": "southeast",
					 |    "southEastFRCList": "kent",
					 |    "kentSurreyCourtList": "FR_kent_surreyList_10",
					 |    "appRespondentFMName": "Stephen",
					 |    "appRespondentLName": "Parker",
					 |    "appRespondentRep": "Yes",
					 |    "rSolicitorName": "Adam Walker",
					 |    "rOrgPolicy": {
					 |      "Organisation": {
					 |        "OrganisationID": "${respondent_orgref}",
					 |        "OrganisationName": "${respondent_orgname}"
					 |      },
					 |      "OrgPolicyCaseAssignedRole": "[RESPSOLICITOR]",
					 |      "OrgPolicyReference": "Test Resp Sol Ref"
					 |    },
					 |    "rSolicitorFirm": "resp sol & co",
					 |    "rSolicitorReference": null,
					 |    "rSolicitorAddress": {
					 |      "AddressLine1": "Ministry Of Justice",
					 |      "AddressLine2": "Seventh Floor 102 Petty France",
					 |      "AddressLine3": "",
					 |      "PostTown": "London",
					 |      "County": "",
					 |      "PostCode": "SW1H 9AJ",
					 |      "Country": "United Kingdom"
					 |    },
					 |    "rSolicitorPhone": null,
					 |    "rSolicitorEmail": null,
					 |    "rSolicitorDXnumber": null,
					 |    "natureOfApplication2": [
					 |      "Lump Sum Order"
					 |    ],
					 |    "consentOrder": {
					 |      "document_url": "${href1}",
					 |      "document_binary_url": "${href1}/binary",
					 |      "document_filename": "dummy.pdf"
					 |    }
					 |  }
					 |}""".stripMargin))
			.check(status in (200,304)))
		.pause(minThinkTime, maxThinkTime)

		.exec(http("XUI${service}_160_GetDocuments2")
			.post("/documents")
			.headers(headers_48)
			.bodyPart(RawFileBodyPart("files", "dummy.pdf")
				.fileName("dummy.pdf")
				.transferEncoding("binary"))
			.asMultipartForm
			.formParam("classification", "PUBLIC")
			.check(jsonPath("$..href").saveAs("href2"))
			.check(status in (200,304)))
		.pause(minThinkTime, maxThinkTime)

		.exec(http("XUI${service}_170_CreateSolicitor9")
			.post("/data/case-types/FinancialRemedyConsentedRespondent/validate?pageId=FR_solicitorCreate9")
			.headers(headers_51)
			.body(StringBody("""{
					 |  "data": {
					 |    "d81Question": "Yes",
					 |    "d81Joint": {
					 |      "document_url": "${href2}",
					 |      "document_binary_url": "${href2}/binary",
					 |      "document_filename": "dummy.pdf"
					 |    }
					 |  },
					 |  "event": {
					 |    "id": "FR_solicitorCreate",
					 |    "summary": "",
					 |    "description": ""
					 |  },
					 |  "event_token": "${eventToken}",
					 |  "ignore_warning": false,
					 |  "event_data": {
					 |    "isAdmin": "No",
					 |    "solicitorName": "Joe Bloggs",
					 |    "solicitorFirm": "HMCTS",
					 |    "solicitorReference": null,
					 |    "solicitorAddress": {
					 |      "AddressLine1": "Ministry Of Justice",
					 |      "AddressLine2": "Seventh Floor 102 Petty France",
					 |      "AddressLine3": "",
					 |      "PostTown": "London",
					 |      "County": "",
					 |      "PostCode": "SW1H 9AJ",
					 |      "Country": "United Kingdom"
					 |    },
					 |    "solicitorPhone": null,
					 |    "solicitorEmail": "abc@email.com",
					 |    "solicitorDXnumber": null,
					 |    "solicitorAgreeToReceiveEmails": "No",
					 |    "divorceCaseNumber": "EZ11D81265",
					 |    "divorceStageReached": "Petition Issued",
					 |    "applicantFMName": "Joe",
					 |    "applicantLName": "Baker",
					 |    "regionList": "southeast",
					 |    "southEastFRCList": "kent",
					 |    "kentSurreyCourtList": "FR_kent_surreyList_10",
					 |    "appRespondentFMName": "Stephen",
					 |    "appRespondentLName": "Parker",
					 |    "appRespondentRep": "Yes",
					 |    "rSolicitorName": "Adam Walker",
					 |    "rOrgPolicy": {
					 |      "Organisation": {
					 |        "OrganisationID": "${respondent_orgref}",
					 |        "OrganisationName": "${respondent_orgname}"
					 |      },
					 |      "OrgPolicyCaseAssignedRole": "[RESPSOLICITOR]",
					 |      "OrgPolicyReference": "Test Resp Sol Ref"
					 |    },
					 |    "rSolicitorFirm": "resp sol & co",
					 |    "rSolicitorReference": null,
					 |    "rSolicitorAddress": {
					 |      "AddressLine1": "Ministry Of Justice",
					 |      "AddressLine2": "Seventh Floor 102 Petty France",
					 |      "AddressLine3": "",
					 |      "PostTown": "London",
					 |      "County": "",
					 |      "PostCode": "SW1H 9AJ",
					 |      "Country": "United Kingdom"
					 |    },
					 |    "rSolicitorPhone": null,
					 |    "rSolicitorEmail": null,
					 |    "rSolicitorDXnumber": null,
					 |    "natureOfApplication2": [
					 |      "Lump Sum Order"
					 |    ],
					 |    "consentOrder": {
					 |      "document_url": "${href1}",
					 |      "document_binary_url": "${href1}/binary",
					 |      "document_filename": "dummy.pdf"
					 |    },
					 |    "d81Question": "Yes",
					 |    "d81Joint": {
					 |      "document_url": "${href2}",
					 |      "document_binary_url": "${href2}/binary",
					 |      "document_filename": "dummy.pdf"
					 |    }
					 |  }
					 |}""".stripMargin))
			.check(status in (200,304)))
		.pause(minThinkTime, maxThinkTime)

		.exec(http("XUI${service}_180_CreateSolicitor11")
			.post("/data/case-types/FinancialRemedyConsentedRespondent/validate?pageId=FR_solicitorCreate11")
			.headers(headers_55)
			.body(StringBody("""{
					 |  "data": {
					 |    "otherCollection": []
					 |  },
					 |  "event": {
					 |    "id": "FR_solicitorCreate",
					 |    "summary": "",
					 |    "description": ""
					 |  },
					 |  "event_token": "${eventToken}",
					 |  "ignore_warning": false,
					 |  "event_data": {
					 |    "isAdmin": "No",
					 |    "solicitorName": "Joe Bloggs",
					 |    "solicitorFirm": "HMCTS",
					 |    "solicitorReference": null,
					 |    "solicitorAddress": {
					 |      "AddressLine1": "Ministry Of Justice",
					 |      "AddressLine2": "Seventh Floor 102 Petty France",
					 |      "AddressLine3": "",
					 |      "PostTown": "London",
					 |      "County": "",
					 |      "PostCode": "SW1H 9AJ",
					 |      "Country": "United Kingdom"
					 |    },
					 |    "solicitorPhone": null,
					 |    "solicitorEmail": "abc@email.com",
					 |    "solicitorDXnumber": null,
					 |    "solicitorAgreeToReceiveEmails": "No",
					 |    "divorceCaseNumber": "EZ11D81265",
					 |    "divorceStageReached": "Petition Issued",
					 |    "applicantFMName": "Joe",
					 |    "applicantLName": "Baker",
					 |    "regionList": "southeast",
					 |    "southEastFRCList": "kent",
					 |    "kentSurreyCourtList": "FR_kent_surreyList_10",
					 |    "appRespondentFMName": "Stephen",
					 |    "appRespondentLName": "Parker",
					 |    "appRespondentRep": "Yes",
					 |    "rSolicitorName": "Adam Walker",
					 |    "rOrgPolicy": {
					 |      "Organisation": {
					 |        "OrganisationID": "${respondent_orgref}",
					 |        "OrganisationName": "${respondent_orgname}"
					 |      },
					 |      "OrgPolicyCaseAssignedRole": "[RESPSOLICITOR]",
					 |      "OrgPolicyReference": "Test Resp Sol Ref"
					 |    },
					 |    "rSolicitorFirm": "resp sol & co",
					 |    "rSolicitorReference": null,
					 |    "rSolicitorAddress": {
					 |      "AddressLine1": "Ministry Of Justice",
					 |      "AddressLine2": "Seventh Floor 102 Petty France",
					 |      "AddressLine3": "",
					 |      "PostTown": "London",
					 |      "County": "",
					 |      "PostCode": "SW1H 9AJ",
					 |      "Country": "United Kingdom"
					 |    },
					 |    "rSolicitorPhone": null,
					 |    "rSolicitorEmail": null,
					 |    "rSolicitorDXnumber": null,
					 |    "natureOfApplication2": [
					 |      "Lump Sum Order"
					 |    ],
					 |    "consentOrder": {
					 |      "document_url": "${href1}",
					 |      "document_binary_url": "${href1}/binary",
					 |      "document_filename": "dummy.pdf"
					 |    },
					 |    "d81Question": "Yes",
					 |    "d81Joint": {
					 |      "document_url": "${href2}",
					 |      "document_binary_url": "${href2}/binary",
					 |      "document_filename": "dummy.pdf"
					 |    },
					 |    "otherCollection": []
					 |  }
					 |}""".stripMargin))
			.check(status in (200,304)))
		.pause(minThinkTime, maxThinkTime)

		.exec(http("XUI${service}_190_CreateSolicitor12")
			.post("/data/case-types/FinancialRemedyConsentedRespondent/validate?pageId=FR_solicitorCreate12")
			.headers(headers_59)
			.body(StringBody("""{
					 |  "data": {},
					 |  "event": {
					 |    "id": "FR_solicitorCreate",
					 |    "summary": "",
					 |    "description": ""
					 |  },
					 |  "event_token": "${eventToken}",
					 |  "ignore_warning": false,
					 |  "event_data": {
					 |    "isAdmin": "No",
					 |    "solicitorName": "Joe Bloggs",
					 |    "solicitorFirm": "HMCTS",
					 |    "solicitorReference": null,
					 |    "solicitorAddress": {
					 |      "AddressLine1": "Ministry Of Justice",
					 |      "AddressLine2": "Seventh Floor 102 Petty France",
					 |      "AddressLine3": "",
					 |      "PostTown": "London",
					 |      "County": "",
					 |      "PostCode": "SW1H 9AJ",
					 |      "Country": "United Kingdom"
					 |    },
					 |    "solicitorPhone": null,
					 |    "solicitorEmail": "abc@email.com",
					 |    "solicitorDXnumber": null,
					 |    "solicitorAgreeToReceiveEmails": "No",
					 |    "divorceCaseNumber": "EZ11D81265",
					 |    "divorceStageReached": "Petition Issued",
					 |    "applicantFMName": "Joe",
					 |    "applicantLName": "Baker",
					 |    "regionList": "southeast",
					 |    "southEastFRCList": "kent",
					 |    "kentSurreyCourtList": "FR_kent_surreyList_10",
					 |    "appRespondentFMName": "Stephen",
					 |    "appRespondentLName": "Parker",
					 |    "appRespondentRep": "Yes",
					 |    "rSolicitorName": "Adam Walker",
					 |    "rOrgPolicy": {
					 |      "Organisation": {
					 |        "OrganisationID": "${respondent_orgref}",
					 |        "OrganisationName": "${respondent_orgname}"
					 |      },
					 |      "OrgPolicyCaseAssignedRole": "[RESPSOLICITOR]",
					 |      "OrgPolicyReference": "Test Resp Sol Ref"
					 |    },
					 |    "rSolicitorFirm": "resp sol & co",
					 |    "rSolicitorReference": null,
					 |    "rSolicitorAddress": {
					 |      "AddressLine1": "Ministry Of Justice",
					 |      "AddressLine2": "Seventh Floor 102 Petty France",
					 |      "AddressLine3": "",
					 |      "PostTown": "London",
					 |      "County": "",
					 |      "PostCode": "SW1H 9AJ",
					 |      "Country": "United Kingdom"
					 |    },
					 |    "rSolicitorPhone": null,
					 |    "rSolicitorEmail": null,
					 |    "rSolicitorDXnumber": null,
					 |    "natureOfApplication2": [
					 |      "Lump Sum Order"
					 |    ],
					 |    "consentOrder": {
					 |      "document_url": "${href1}",
					 |      "document_binary_url": "${href1}/binary",
					 |      "document_filename": "dummy.pdf"
					 |    },
					 |    "d81Question": "Yes",
					 |    "d81Joint": {
					 |      "document_url": "${href2}",
					 |      "document_binary_url": "${href2}/binary",
					 |      "document_filename": "dummy.pdf"
					 |    },
					 |    "otherCollection": []
					 |  }
					 |}""".stripMargin))
			.check(status in (200,304)))
		.pause(minThinkTime, maxThinkTime)

		.exec(http("XUI${service}_200_CreateCase5")
			.get("/data/internal/profile")
			.headers(headers_61)
			.check(status in (200,304)))
		.pause(minThinkTime, maxThinkTime)

		.exec(http("XUI${service}_210_CreateCase6")
			.post("/data/case-types/FinancialRemedyConsentedRespondent/cases?ignore-warning=false")
			.headers(headers_64)
			.body(StringBody("""{
					 |  "data": {
					 |    "isAdmin": "No",
					 |    "applicantRepresented": null,
					 |    "applicantPhone": null,
					 |    "applicantEmail": null,
					 |    "solicitorName": "Joe Bloggs",
					 |    "solicitorFirm": "HMCTS",
					 |    "solicitorReference": null,
					 |    "solicitorAddress": {
					 |      "AddressLine1": "Ministry Of Justice",
					 |      "AddressLine2": "Seventh Floor 102 Petty France",
					 |      "AddressLine3": "",
					 |      "PostTown": "London",
					 |      "County": "",
					 |      "PostCode": "SW1H 9AJ",
					 |      "Country": "United Kingdom"
					 |    },
					 |    "solicitorPhone": null,
					 |    "solicitorEmail": "abc@email.com",
					 |    "solicitorDXnumber": null,
					 |    "solicitorAgreeToReceiveEmails": "No",
					 |    "divorceCaseNumber": "EZ11D81265",
					 |    "divorceStageReached": "Petition Issued",
					 |    "divorceDecreeNisiDate": null,
					 |    "divorceDecreeAbsoluteDate": null,
					 |    "applicantFMName": "Joe",
					 |    "applicantLName": "Baker",
					 |    "regionList": "southeast",
					 |    "midlandsFRCList": null,
					 |    "londonFRCList": null,
					 |    "northWestFRCList": null,
					 |    "northEastFRCList": null,
					 |    "southEastFRCList": "kent",
					 |    "southWestFRCList": null,
					 |    "walesFRCList": null,
					 |    "nottinghamCourtList": null,
					 |    "birminghamCourtList": null,
					 |    "londonCourtList": null,
					 |    "liverpoolCourtList": null,
					 |    "manchesterCourtList": null,
					 |    "otherNWCourtList": null,
					 |    "clevelandCourtList": null,
					 |    "nwyorkshireCourtList": null,
					 |    "humberCourtList": null,
					 |    "kentSurreyCourtList": "FR_kent_surreyList_10",
					 |    "otherSECourtList": null,
					 |    "otherSWCourtList": null,
					 |    "newportCourtList": null,
					 |    "swanseaCourtList": null,
					 |    "welshOtherCourtList": null,
					 |    "appRespondentFMName": "Stephen",
					 |    "appRespondentLName": "Parker",
					 |    "appRespondentRep": "Yes",
					 |    "rSolicitorName": "Adam Walker",
					 |    "rOrgPolicy": {
					 |      "Organisation": {
					 |        "OrganisationID": "${respondent_orgref}",
					 |        "OrganisationName": "${respondent_orgname}"
					 |      },
					 |      "OrgPolicyCaseAssignedRole": "[RESPSOLICITOR]",
					 |      "OrgPolicyReference": "Test Resp Sol Ref"
					 |    },
					 |    "rSolicitorFirm": "resp sol & co",
					 |    "rSolicitorReference": null,
					 |    "rSolicitorAddress": {
					 |      "AddressLine1": "Ministry Of Justice",
					 |      "AddressLine2": "Seventh Floor 102 Petty France",
					 |      "AddressLine3": "",
					 |      "PostTown": "London",
					 |      "County": "",
					 |      "PostCode": "SW1H 9AJ",
					 |      "Country": "United Kingdom"
					 |    },
					 |    "rSolicitorPhone": null,
					 |    "rSolicitorEmail": null,
					 |    "rSolicitorDXnumber": null,
					 |    "respondentPhone": null,
					 |    "respondentEmail": null,
					 |    "natureOfApplication2": [
					 |      "Lump Sum Order"
					 |    ],
					 |    "natureOfApplication3a": null,
					 |    "natureOfApplication3b": null,
					 |    "consentOrder": {
					 |      "document_url": "${href1}",
					 |      "document_binary_url": "${href1}/binary",
					 |      "document_filename": "dummy.pdf"
					 |    },
					 |    "d81Question": "Yes",
					 |    "d81Joint": {
					 |      "document_url": "${href2}",
					 |      "document_binary_url": "${href2}/binary",
					 |      "document_filename": "dummy.pdf"
					 |    },
					 |    "otherCollection": []
					 |  },
					 |  "event": {
					 |    "id": "FR_solicitorCreate",
					 |    "summary": "",
					 |    "description": ""
					 |  },
					 |  "event_token": "${eventToken}",
					 |  "ignore_warning": false,
					 |  "draft_id": null
					 |}""".stripMargin))
			.check(jsonPath("$..id").saveAs("caseId"))
			.check(status in (200,304)))
		.pause(minThinkTime, maxThinkTime)

		.exec(http("XUI${service}_220_GetCase")
			.get("/data/internal/cases/${caseId}")
			.headers(headers_66)
			.check(status in (200,304)))
		.pause(minThinkTime, maxThinkTime)

}
