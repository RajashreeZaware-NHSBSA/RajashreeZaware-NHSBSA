@SmokeTest
Feature: Verify where you live country screen

  Scenario Outline: Validate user gets valid output on where you live screen
    Given I want to check nhs costs online service
    When I want to start my entitlement
    And I will land on "Which country do you live in?" screen
    And I live in "<country>"
    And I want to proceed on where you live screen
    Then I will land on "<pageName>" screen
    Examples:
      | country |pageName                                  |
      | England | Is your GP practice in Scotland or Wales?|
      | Wales   | Is your GP practice in Scotland or Wales?|

  Scenario: Validate user gets valid output on where you live screen
    Given I want to check nhs costs online service
    When I want to start my entitlement
    And I will land on "Which country do you live in?" screen
    And I live in "Scotland"
    And I want to proceed on where you live screen
    Then I will land on "Do you live in the Highlands and Islands?" screen

  Scenario: Validate user gets valid output on where you live screen
    Given I want to check nhs costs online service
    When I want to start my entitlement
    And I will land on "Which country do you live in?" screen
    And I live in "Northern Ireland"
    And I want to proceed on where you live screen
    Then I will see the message "You cannot use this service because you live in Northern Ireland"