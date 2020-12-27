$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/cucumber/featurefile/adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking",
  "description": "",
  "id": "hotel-booking",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "To login",
  "description": "",
  "id": "hotel-booking;to-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User launch the adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter the \"\u003cusername\u003e\" in username field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enter the \"\u003cpassword\u003e\" in password field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User click the login button and to check it navigates to next page",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "hotel-booking;to-login;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 10,
      "id": "hotel-booking;to-login;;1"
    },
    {
      "cells": [
        "AAA",
        "111"
      ],
      "line": 11,
      "id": "hotel-booking;to-login;;2"
    },
    {
      "cells": [
        "BBB",
        "222"
      ],
      "line": 12,
      "id": "hotel-booking;to-login;;3"
    },
    {
      "cells": [
        "PradeepHari",
        "Pradeep123"
      ],
      "line": 13,
      "id": "hotel-booking;to-login;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 6053900,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "To login",
  "description": "",
  "id": "hotel-booking;to-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User launch the adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter the \"AAA\" in username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enter the \"111\" in password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User click the login button and to check it navigates to next page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionpom.user_launch_the_adactin_application()"
});
formatter.result({
  "duration": 5490657200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AAA",
      "offset": 16
    }
  ],
  "location": "StepDefinitionpom.user_enter_the_in_username_field(String)"
});
formatter.result({
  "duration": 128682300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "111",
      "offset": 16
    }
  ],
  "location": "StepDefinitionpom.user_enter_the_in_password_field(String)"
});
formatter.result({
  "duration": 116309200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionpom.user_click_the_login_button_and_to_check_it_navigates_to_next_page()"
});
formatter.result({
  "duration": 836894000,
  "status": "passed"
});
formatter.after({
  "duration": 179700,
  "status": "passed"
});
formatter.before({
  "duration": 79000,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "To login",
  "description": "",
  "id": "hotel-booking;to-login;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User launch the adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter the \"BBB\" in username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enter the \"222\" in password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User click the login button and to check it navigates to next page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionpom.user_launch_the_adactin_application()"
});
formatter.result({
  "duration": 494174200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BBB",
      "offset": 16
    }
  ],
  "location": "StepDefinitionpom.user_enter_the_in_username_field(String)"
});
formatter.result({
  "duration": 83498300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "222",
      "offset": 16
    }
  ],
  "location": "StepDefinitionpom.user_enter_the_in_password_field(String)"
});
formatter.result({
  "duration": 75428000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionpom.user_click_the_login_button_and_to_check_it_navigates_to_next_page()"
});
formatter.result({
  "duration": 595476000,
  "status": "passed"
});
formatter.after({
  "duration": 187800,
  "status": "passed"
});
formatter.before({
  "duration": 515900,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "To login",
  "description": "",
  "id": "hotel-booking;to-login;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User launch the adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter the \"PradeepHari\" in username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enter the \"Pradeep123\" in password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User click the login button and to check it navigates to next page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionpom.user_launch_the_adactin_application()"
});
formatter.result({
  "duration": 592088500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PradeepHari",
      "offset": 16
    }
  ],
  "location": "StepDefinitionpom.user_enter_the_in_username_field(String)"
});
formatter.result({
  "duration": 99461600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pradeep123",
      "offset": 16
    }
  ],
  "location": "StepDefinitionpom.user_enter_the_in_password_field(String)"
});
formatter.result({
  "duration": 70491100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionpom.user_click_the_login_button_and_to_check_it_navigates_to_next_page()"
});
formatter.result({
  "duration": 3279887200,
  "status": "passed"
});
formatter.after({
  "duration": 121900,
  "status": "passed"
});
formatter.before({
  "duration": 109800,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "To verify the search hotel page",
  "description": "",
  "id": "hotel-booking;to-verify-the-search-hotel-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "User launch the location",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user select the hotel",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user select the roomtype",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user select the number of rooms",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user select the check in date",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user select the check out date",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user select the no of adults",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user select the no of childrens",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user click the search button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionpom.user_launch_the_location()"
});
formatter.result({
  "duration": 170843000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionpom.user_select_the_hotel()"
});
formatter.result({
  "duration": 130926300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionpom.user_select_the_roomtype()"
});
formatter.result({
  "duration": 132138400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionpom.user_select_the_number_of_rooms()"
});
formatter.result({
  "duration": 124708800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionpom.user_select_the_check_in_date()"
});
formatter.result({
  "duration": 126619700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionpom.user_select_the_check_out_date()"
});
formatter.result({
  "duration": 129344400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionpom.user_select_the_no_of_adults()"
});
formatter.result({
  "duration": 131409600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionpom.user_select_the_no_of_childrens()"
});
formatter.result({
  "duration": 117490600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionpom.user_click_the_search_button()"
});
formatter.result({
  "duration": 946683200,
  "status": "passed"
});
formatter.after({
  "duration": 95200,
  "status": "passed"
});
formatter.before({
  "duration": 98200,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "To Select Hotel",
  "description": "",
  "id": "hotel-booking;to-select-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 30,
  "name": "User click the select button",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "Click continue button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionpom.user_click_the_select_button()"
});
formatter.result({
  "duration": 66388500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionpom.click_continue_button()"
});
formatter.result({
  "duration": 768860400,
  "status": "passed"
});
formatter.after({
  "duration": 193300,
  "status": "passed"
});
formatter.before({
  "duration": 88100,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "To Book a Hotel",
  "description": "",
  "id": "hotel-booking;to-book-a-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 35,
  "name": "User Enter the first name",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "User enter the Last name",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "User enter the Address",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "User enter the Credit Card no",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "User enter the credit card type",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "User enter the expiry date",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "User enter the expiry year",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "User enter the CVV number",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "User click the submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionpom.user_Enter_the_first_name()"
});
formatter.result({
  "duration": 94577200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionpom.user_enter_the_Last_name()"
});
formatter.result({
  "duration": 75491000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionpom.user_enter_the_Address()"
});
formatter.result({
  "duration": 89582200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionpom.user_enter_the_Credit_Card_no()"
});
formatter.result({
  "duration": 91466100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionpom.user_enter_the_credit_card_type()"
});
formatter.result({
  "duration": 126613500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionpom.user_enter_the_expiry_date_and_select_year()"
});
formatter.result({
  "duration": 203365600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionpom.user_enter_the_expiry_year()"
});
formatter.result({
  "duration": 207528500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionpom.user_enter_the_CVV_number()"
});
formatter.result({
  "duration": 41508800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionpom.user_click_the_submit_button()"
});
formatter.result({
  "duration": 59870800,
  "status": "passed"
});
formatter.after({
  "duration": 63300,
  "status": "passed"
});
formatter.before({
  "duration": 53700,
  "status": "passed"
});
formatter.scenario({
  "line": 45,
  "name": "To logout from the page",
  "description": "",
  "id": "hotel-booking;to-logout-from-the-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 47,
  "name": "User click to logoutbutton",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionpom.user_click_to_logoutbutton()"
});
formatter.result({
  "duration": 574795300,
  "status": "passed"
});
formatter.after({
  "duration": 127700,
  "status": "passed"
});
});