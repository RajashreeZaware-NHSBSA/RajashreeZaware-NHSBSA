@SmokeTest
Feature: Verify live with your partner screen

  Scenario Outline: Validate user gets valid output on live with your partner screen
    Given I want to check nhs costs online service
    And I want to start my entitlement
    And I live in "<country>"
    And I want to proceed on where you live screen
    And I "<option>" registered with GP practice
    And I want to proceed on GP practice screen
    And My dental practices in "<dp_country>" country
    And I proceed on dental practice country screen
    And My date of birth is "<Day>", "<Month>", "<Year>"
    And I will continue on date of birth screen
    When I "<choice>" live with a partner
    And I will continue on next screen
    Then I will land on "<pageName>" screen

    Examples: 
      | country | option | dp_country | Day | Month | Year | choice | pageName                                                |
      | England | am     | England    |   1 |     2 | 2000 | do     |Do you or your partner claim any benefits or tax credits?|
      | England | am     | England    |   1 |     2 | 2000 | do not |Do you claim any benefits or tax credits?                |