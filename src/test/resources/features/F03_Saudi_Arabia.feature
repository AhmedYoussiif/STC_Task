@TaskSuite
Feature: Validate the Subscription Packages – Type & Price and Currency for Saudi Arabia

  Scenario: Validate Plan type
    Given the user navigates to the STC landing page
    When he selects the "sa" country
    Then he should see the subscription package types "LITE" "CLASSIC" "PREMIUM"

  Scenario: Validate Price of the plan
    Given the user navigates to the STC landing page
    When he selects the "sa" country
    Then he should see Price of the plans accordingly "15" "25" "60"

  Scenario: Validate Currency of the selected country
    Given the user navigates to the STC landing page
    When he selects the "sa" country
    Then he should see the Currency of the selected country "SAR"


