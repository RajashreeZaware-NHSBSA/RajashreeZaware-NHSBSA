@SmokeTest
Feature: Verify universal credit claim screen

  Scenario Outline: Validate user gets valid output on universal credit claim screen
    Given I want to check nhs costs online service
    And I want to start my entitlement
    And I live in "<country>"
    And I want to proceed on where you live screen
    And I "<option>" registered with GP practice
    And I want to proceed on where you live screen
    And My dental practices in "<dp_country>" country
    And I proceed on dental practice country screen
    And My date of birth is "<Day>", "<Month>", "<Year>"
    And I will continue on date of birth screen
    And I "<choice>" live with a partner
    And I will continue on next screen
    And I choose "<opt>" for claim benefits or tax credits
    And I will continue on next screen
    And I choose "<credit_opt>" option on paid universal credit screen
    And I will continue on next screen
    When I choose "<claim_opt>" option as part of your universal credit
    And I will continue on next screen
    Then I will land on "<pageName>" screen
    Examples: 
      | country | option | dp_country | Day | Month | Year | choice | opt | credit_opt | claim_opt | pageName                         |
      | England | am     | England    |   1 |     2 | 2000 | do not | Yes | Yes        | Yes       | Was your take-home pay for your last Universal Credit period £935 or less?|
      | England | am     | England    |   1 |     2 | 2000 | do not | Yes | Yes        | No        | Was your take-home pay for your last Universal Credit period £435 or less?|
