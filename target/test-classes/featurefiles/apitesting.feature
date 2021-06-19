#Author: ujjwal kumar ujjwal
@testsuite
Feature: This feature is to test open APIs of the weather stations

  @negative
  Scenario Outline: To validate that attempt to register a weather station without an API key
    Given User has an invalid "<token>"
    When User hit the "<poststations>" endpoint with "<payload>"
    Then Verify the <status> code
    And check more outcomes like "<message>"

    Examples: 
      | payload   | poststations | token         | status | message                                                                           |
      | testdata1 | poststations | asghsa1254256 |    401 | Invalid API key. Please see http://openweathermap.org/faq#error401 for more info. |

  @postive
  Scenario Outline: To successfully register two stations
    Given User has a valid token
    When User hit the "<poststations>" endpoint with "<payload>"
    Then Verify the <status> code

    Examples: 
      | poststations | payload   | status |
      | poststations | testdata1 |    201 |
      | poststations | testdata2 |    201 |

  @postive
  Scenario Outline: To verify registered station are present in DB
    Given User has a valid token
    When User hit the "<getstation>"
    Then Verify the <status> code
    And Verify "<payload>" in response

    Examples: 
      | getstation | payload   | status |
      | getstations | testdata1 |    200 |
      | getstations | testdata2 |    200 |
