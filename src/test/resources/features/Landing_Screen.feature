@SmokeTest
Feature: Check nhs costs online service- Landing screen

  Scenario Outline: Validate user able to click on start now button
    Given I want to check nhs costs online service
    When I want to start my entitlement
    Then I will see "<output>" screen
    Examples: 
    |output        |
    |Where You Live|
    
  