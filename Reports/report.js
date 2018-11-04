$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Facebook.feature");
formatter.feature({
  "line": 1,
  "name": "create new facebook account",
  "description": "",
  "id": "create-new-facebook-account",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "sign up to face book",
  "description": "",
  "id": "create-new-facebook-account;sign-up-to-face-book",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "lanch the browser and enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user gives first name \"dhanapal\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user gives lastname \"thimmarayan\"",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user gives mobile number \"9943395649\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user gives password \"321kavi@\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user gives day \"16\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user gives month \"5\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user gives year \"1992\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user click gender",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user click signup",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.lanch_the_browser_and_enter_the_url()"
});
formatter.result({
  "duration": 24215499576,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dhanapal",
      "offset": 23
    }
  ],
  "location": "StepDefinition.user_gives_first_name(String)"
});
formatter.result({
  "duration": 1477164474,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "thimmarayan",
      "offset": 21
    }
  ],
  "location": "StepDefinition.user_gives_lastname(String)"
});
formatter.result({
  "duration": 258736413,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "9943395649",
      "offset": 26
    }
  ],
  "location": "StepDefinition.user_gives_mobile_number(String)"
});
formatter.result({
  "duration": 207749484,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "321kavi@",
      "offset": 21
    }
  ],
  "location": "StepDefinition.user_gives_password(String)"
});
formatter.result({
  "duration": 326581105,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "16",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_gives_day(String)"
});
formatter.result({
  "duration": 404011109,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 18
    }
  ],
  "location": "StepDefinition.user_gives_month(String)"
});
formatter.result({
  "duration": 146818453,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1992",
      "offset": 17
    }
  ],
  "location": "StepDefinition.user_gives_year(String)"
});
formatter.result({
  "duration": 186209749,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_gender()"
});
formatter.result({
  "duration": 165102777,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_signup()"
});
formatter.result({
  "duration": 26321,
  "status": "passed"
});
});