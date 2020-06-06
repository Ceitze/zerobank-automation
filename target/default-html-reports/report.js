$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Users should be able to login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.bitrix.stepdefinitions.LoginStepDef.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login as a driver",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "the user enter the driver information",
  "keyword": "When "
});
formatter.match({
  "location": "com.bitrix.stepdefinitions.LoginStepDef.the_user_enter_the_driver_information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bitrix.stepdefinitions.LoginStepDef.the_user_should_be_able_to_login()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: verify message expected:\u003c[]Account Summary\u003e but was:\u003c[Zero - ]Account Summary\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat com.bitrix.stepdefinitions.LoginStepDef.the_user_should_be_able_to_login(LoginStepDef.java:33)\r\n\tat ✽.the user should be able to login(file:///C:/Users/Ahmet%20Faruk/IdeaProjects/zerobank-automation/src/test/resources/features/Login.feature:11)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
});