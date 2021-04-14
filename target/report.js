$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Adactin.feature");
formatter.feature({
  "name": "To validate Login Function",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Validate Login Functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user entered \"\u003cusername\u003e\" and \"\u003cpassword\u003e\" user click login button navigate search hotel page",
  "keyword": "When "
});
formatter.step({
  "name": "user choose \"\u003cHotellocation\u003e\",\"\u003cHotelName\u003e\",\"\u003cRoomType\u003e\",\"\u003cNumberOfRooms\u003e\",\"\u003cCheckInDate\u003e\",\"\u003cCheckOutDate\u003e\",\"\u003cAdult\u003e\",\"\u003cChildren\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user click search button user go to next page",
  "keyword": "And "
});
formatter.step({
  "name": "user choose hotel and click continue button go to payment page",
  "keyword": "And "
});
formatter.step({
  "name": "user enter \"\u003cFirstName\u003e\",\"\u003cLastName\u003e\",\"\u003cAddress\u003e\",\"\u003cCreditCardNum\u003e\",\"\u003cCreditCardType\u003e\",\"\u003cExpiryMonth\u003e\",\"\u003cExpiryYear\u003e\",\"\u003cCvvNum\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user click book now button and user get booking details",
  "keyword": "And "
});
formatter.step({
  "name": "user have valid credenttials page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "Hotellocation",
        "HotelName",
        "RoomType",
        "NumberOfRooms",
        "CheckInDate",
        "CheckOutDate",
        "Adult",
        "Children",
        "FirstName",
        "LastName",
        "Address",
        "CreditCardNum",
        "CreditCardType",
        "ExpiryMonth",
        "ExpiryYear",
        "CvvNum"
      ]
    },
    {
      "cells": [
        "Ezhilkumaran",
        "qwert",
        "Sydney",
        "Hotel Creek",
        "Standard",
        "2",
        "19/10/2021",
        "19/10/2021",
        "2",
        "2",
        "Ezhil",
        "Kumaran",
        "CSR-Complex,Medavakkam,Chennai",
        "987654321987654321",
        "VISA",
        "July",
        "2022",
        "678"
      ]
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
  "name": "user adactin login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefinition.user_adactin_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate Login Functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "user entered \"Ezhilkumaran\" and \"qwert\" user click login button navigate search hotel page",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.user_entered_and_user_click_login_button_navigate_search_hotel_page(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user choose \"Sydney\",\"Hotel Creek\",\"Standard\",\"2\",\"19/10/2021\",\"19/10/2021\",\"2\",\"2\"",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.user_choose(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click search button user go to next page",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.user_click_search_button_user_go_to_next_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user choose hotel and click continue button go to payment page",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.user_choose_hotel_and_click_continue_button_go_to_payment_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter \"Ezhil\",\"Kumaran\",\"CSR-Complex,Medavakkam,Chennai\",\"987654321987654321\",\"VISA\",\"July\",\"2022\",\"678\"",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.user_enter(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click book now button and user get booking details",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.user_click_book_now_button_and_user_get_booking_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have valid credenttials page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_have_valid_credenttials_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});