$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Cucumber/Demo/Features/Mercury.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Log in to Facebook with Examples",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@main"
    }
  ]
});
formatter.step({
  "name": "You are on facebook page",
  "keyword": "Given "
});
formatter.step({
  "name": "you enter username \u0027\u003cusername\u003e\u0027",
  "keyword": "When "
});
formatter.step({
  "name": "uou enter password \u0027\u003cpassword\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "name": "user should be at homepage",
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
        "password"
      ]
    },
    {
      "cells": [
        "2310strygwyr@gmail.com",
        "strygwyr"
      ]
    },
    {
      "cells": [
        "2310strygwyr@gmail.com",
        "strygwyr"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Log in to Facebook with Examples",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@main"
    }
  ]
});
formatter.step({
  "name": "You are on facebook page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "you enter username \u00272310strygwyr@gmail.com\u0027",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "uou enter password \u0027strygwyr\u0027",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should be at homepage",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Log in to Facebook with Examples",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@main"
    }
  ]
});
formatter.step({
  "name": "You are on facebook page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "you enter username \u00272310strygwyr@gmail.com\u0027",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "uou enter password \u0027strygwyr\u0027",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should be at homepage",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});