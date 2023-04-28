@SmokeTest
Feature: Verify dental practice country screen

  Scenario Outline: Validate user gets valid output on dental practice country screen
    Given I want to check nhs costs online service
    And I want to start my entitlement
    And I live in "<country>"
    And I want to proceed on where you live screen
    And I "<option>" registered with GP practice
    And I want to proceed on GP practice screen
    And My dental practices in "<dp_country>" country
    When I proceed on dental practice country screen
    Then I will land on "<pageName>" screen
    Examples: 
      | country | option | dp_country | pageName                   |
      | England | am     | England    | What is your date of birth?|
