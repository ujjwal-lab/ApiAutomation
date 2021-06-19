$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/apitesting.feature");
formatter.feature({
  "name": "This feature is to test open APIs of the weather stations",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@testsuite"
    }
  ]
});
formatter.scenarioOutline({
  "name": "To validate that attempt to register a weather station without an API key",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@negative"
    }
  ]
});
formatter.step({
  "name": "User has an invalid \"\u003ctoken\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "User hit the \"\u003cpoststations\u003e\" endpoint with \"\u003cpayload\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Verify the \u003cstatus\u003e code",
  "keyword": "Then "
});
formatter.step({
  "name": "check more outcomes like \"\u003cmessage\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "payload",
        "poststations",
        "token",
        "status",
        "message"
      ]
    },
    {
      "cells": [
        "testdata1",
        "poststations",
        "asghsa1254256",
        "401",
        "Invalid API key. Please see http://openweathermap.org/faq#error401 for more info."
      ]
    }
  ]
});
formatter.scenario({
  "name": "To validate that attempt to register a weather station without an API key",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@testsuite"
    },
    {
      "name": "@negative"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User has an invalid \"asghsa1254256\"",
  "keyword": "Given "
});
formatter.match({
  "location": "TestinvalidTokenStep.user_has_an_invalid(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User hit the \"poststations\" endpoint with \"testdata1\"",
  "keyword": "When "
});
formatter.match({
  "location": "TestStationRegStep.user_hit_the_endpoint_with(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the 401 code",
  "keyword": "Then "
});
formatter.match({
  "location": "TestStationRegStep.verify_the_success_code(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "check more outcomes like \"Invalid API key. Please see http://openweathermap.org/faq#error401 for more info.\"",
  "keyword": "And "
});
formatter.match({
  "location": "TestinvalidTokenStep.check_more_outcomes_like(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "To successfully register two stations",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@postive"
    }
  ]
});
formatter.step({
  "name": "User has a valid token",
  "keyword": "Given "
});
formatter.step({
  "name": "User hit the \"\u003cpoststations\u003e\" endpoint with \"\u003cpayload\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Verify the \u003cstatus\u003e code",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "poststations",
        "payload",
        "status"
      ]
    },
    {
      "cells": [
        "poststations",
        "testdata1",
        "201"
      ]
    },
    {
      "cells": [
        "poststations",
        "testdata2",
        "201"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To successfully register two stations",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@testsuite"
    },
    {
      "name": "@postive"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User has a valid token",
  "keyword": "Given "
});
formatter.match({
  "location": "TestStationRegStep.user_has_a_valid_token()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User hit the \"poststations\" endpoint with \"testdata1\"",
  "keyword": "When "
});
formatter.match({
  "location": "TestStationRegStep.user_hit_the_endpoint_with(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the 201 code",
  "keyword": "Then "
});
formatter.match({
  "location": "TestStationRegStep.verify_the_success_code(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To successfully register two stations",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@testsuite"
    },
    {
      "name": "@postive"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User has a valid token",
  "keyword": "Given "
});
formatter.match({
  "location": "TestStationRegStep.user_has_a_valid_token()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User hit the \"poststations\" endpoint with \"testdata2\"",
  "keyword": "When "
});
formatter.match({
  "location": "TestStationRegStep.user_hit_the_endpoint_with(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the 201 code",
  "keyword": "Then "
});
formatter.match({
  "location": "TestStationRegStep.verify_the_success_code(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "To verify registered station are present in DB",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@postive"
    }
  ]
});
formatter.step({
  "name": "User has a valid token",
  "keyword": "Given "
});
formatter.step({
  "name": "User hit the \"\u003cgetstation\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Verify the \u003cstatus\u003e code",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify \"\u003cpayload\u003e\" in response",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "getstation",
        "payload",
        "status"
      ]
    },
    {
      "cells": [
        "getstations",
        "testdata1",
        "200"
      ]
    },
    {
      "cells": [
        "getstations",
        "testdata2",
        "200"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To verify registered station are present in DB",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@testsuite"
    },
    {
      "name": "@postive"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User has a valid token",
  "keyword": "Given "
});
formatter.match({
  "location": "TestStationRegStep.user_has_a_valid_token()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User hit the \"getstations\"",
  "keyword": "When "
});
formatter.match({
  "location": "TestVerifyStationStep.user_hit_the(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the 200 code",
  "keyword": "Then "
});
formatter.match({
  "location": "TestStationRegStep.verify_the_success_code(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify \"testdata1\" in response",
  "keyword": "And "
});
formatter.match({
  "location": "TestVerifyStationStep.verify_in_response(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify registered station are present in DB",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@testsuite"
    },
    {
      "name": "@postive"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User has a valid token",
  "keyword": "Given "
});
formatter.match({
  "location": "TestStationRegStep.user_has_a_valid_token()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User hit the \"getstations\"",
  "keyword": "When "
});
formatter.match({
  "location": "TestVerifyStationStep.user_hit_the(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the 200 code",
  "keyword": "Then "
});
formatter.match({
  "location": "TestStationRegStep.verify_the_success_code(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify \"testdata2\" in response",
  "keyword": "And "
});
formatter.match({
  "location": "TestVerifyStationStep.verify_in_response(String)"
});
formatter.result({
  "status": "passed"
});
});