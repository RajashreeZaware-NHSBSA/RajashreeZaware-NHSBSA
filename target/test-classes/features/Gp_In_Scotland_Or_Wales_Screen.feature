@SmokeTest
Feature: Verify GP practice in Scotland or Wales screen

  Scenario Outline: Validate user gets valid output on 'Is your GP practice in Scotland or Wales' screen
    Given I want to check nhs costs online service
    And I want to start my entitlement
    And I live in "<country>"
    And I want to proceed on where you live screen
    When I "<option>" registered with GP practice
    And I want to proceed on GP practice screen
    Then I will land on "<pageName>" screen
    Examples:
      | country | option | pageName                                 |
      | England | am     | Which country is your dental practice in?|
      | England | am not | Which country is your dental practice in?|

  Scenario Outline: Validate user is able to click on back link
    Given I want to check nhs costs online service
    And I want to start my entitlement
    And I live in "<country>"
    And I want to proceed on where you live screen
    And I "<option>" registered with GP practice
    And I want to proceed on GP practice screen
    When I want go back to the previous screen
    Then I will land on "<pageName>" screen
    Examples:
      | country | option | pageName                                  |
      | England | am     | Is your GP practice in Scotland or Wales? |
      | England | am not | Is your GP practice in Scotland or Wales? |
