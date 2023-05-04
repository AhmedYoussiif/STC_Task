@TaskSuite
Feature: Validate the Subscription Packages – Type & Price and Currency for Bahrain

  Scenario: Validate Plan type
    Given the user navigates to the STC landing page
    When he selects the "bh" country
    Then he should see the subscription package types "LITE" "CLASSIC" "PREMIUM"

  Scenario: Validate Price of the plan
    Given the user navigates to the STC landing page
    When he selects the "bh" country
    Then he should see Price of the plans accordingly "2" "3" "6"

  Scenario: Validate Currency of the selected country
    Given the user navigates to the STC landing page
    When he selects the "bh" country
    Then he should see the Currency of the selected country "BHD"
