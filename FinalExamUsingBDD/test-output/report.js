$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/feature/login.feature");
formatter.feature({
  "line": 1,
  "name": "Valid user should be able to change color",
  "description": "",
  "id": "valid-user-should-be-able-to-change-color",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5283030371,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Sky Blue Background;",
  "description": "",
  "id": "valid-user-should-be-able-to-change-color;sky-blue-background;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Set SkyBlue Background button exists;",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on the SkyBlue button;",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "location": "Backgroundcolorsteps.set_SkyBlue_Background_button_exists()"
});
formatter.result({
  "duration": 233626699,
  "status": "passed"
});
formatter.match({
  "location": "Backgroundcolorsteps.i_click_on_the_SkyBlue_button()"
});
formatter.result({
  "duration": 18336,
  "status": "passed"
});
formatter.match({
  "location": "Backgroundcolorsteps.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "duration": 16220,
  "status": "passed"
});
formatter.after({
  "duration": 10578,
  "status": "passed"
});
formatter.before({
  "duration": 3982322988,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "White Background Change;",
  "description": "",
  "id": "valid-user-should-be-able-to-change-color;white-background-change;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "Set White Background button exists;",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I click on the White Background button;",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "the background color will change to white",
  "keyword": "Then "
});
formatter.match({
  "location": "Backgroundcolorsteps.set_White_Background_button_exists()"
});
formatter.result({
  "duration": 26093,
  "status": "passed"
});
formatter.match({
  "location": "Backgroundcolorsteps.i_click_on_the_White_Background_button()"
});
formatter.result({
  "duration": 232722237,
  "status": "passed"
});
formatter.match({
  "location": "Backgroundcolorsteps.the_background_color_will_change_to_white()"
});
formatter.result({
  "duration": 49394857,
  "status": "passed"
});
formatter.after({
  "duration": 13752,
  "status": "passed"
});
});