$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("authentification/Authentification.feature");
formatter.feature({
  "line": 2,
  "name": "Authentification - OrangeHRM",
  "description": "ETQ user je souhaite faire m\u0027authentifer",
  "id": "authentification---orangehrm",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@authentification"
    }
  ]
});
formatter.before({
  "duration": 9195422700,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Authentification - OrangeHRM",
  "description": "",
  "id": "authentification---orangehrm;authentification---orangehrm",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@auth"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "open application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "set username",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "set password",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "click nlogin button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "show page admin",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthentificationStepDef.openApplication()"
});
formatter.result({
  "duration": 3107294200,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDef.setUsername()"
});
formatter.result({
  "duration": 67220600,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDef.setPassword()"
});
formatter.result({
  "duration": 59149500,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDef.clickNloginButton()"
});
formatter.result({
  "duration": 5312826600,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDef.showPageAdmin()"
});
formatter.result({
  "duration": 34550400,
  "status": "passed"
});
formatter.after({
  "duration": 1335379000,
  "status": "passed"
});
formatter.uri("patientMedicalForm/PatientMedicalForm.feature");
formatter.feature({
  "line": 2,
  "name": "Fill the form - PatientMedical",
  "description": "I want to fill the form",
  "id": "fill-the-form---patientmedical",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@patientMedicalForm"
    }
  ]
});
formatter.before({
  "duration": 8357933500,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Fill the form - PatientMedical",
  "description": "",
  "id": "fill-the-form---patientmedical;fill-the-form---patientmedical",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@form"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "open application medical",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "set first name",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "set last name",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "click submit button",
  "keyword": "And "
});
formatter.match({
  "location": "FormStepDef.openApplicationMedical()"
});
formatter.result({
  "duration": 2599318100,
  "status": "passed"
});
formatter.match({
  "location": "FormStepDef.setFirstName()"
});
formatter.result({
  "duration": 670200,
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy16.sendKeys(Unknown Source)\r\n\tat com.e2eTest.automation.pageObject.FormPage.sendFirstName(FormPage.java:34)\r\n\tat com.e2eTest.automation.stepDefinition.FormStepDef.setFirstName(FormStepDef.java:35)\r\n\tat ✽.When set first name(patientMedicalForm/PatientMedicalForm.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "FormStepDef.setLastName()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FormStepDef.submitForm()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("current page url is :https://form.jotform.com/81665408084158");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1600434900,
  "status": "passed"
});
});