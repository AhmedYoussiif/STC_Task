@TaskSuite
Feature: Validate the Subscription Packages – Type & Price and Currency for Kuwait

  Scenario: Validate Plan type
    Given the user navigates to the STC landing page
    When he selects the "kw" country
    Then he should see the subscription package types "LITE" "CLASSIC" "PREMIUM"

  Scenario: Validate Price of the plan
    Given the user navigates to the STC landing page
    When he selects the "kw" country
    Then he should see Price of the plans accordingly "1.2" "2.5" "4.8"

  Scenario: Validate Currency of the selected country
    Given the user navigates to the STC landing page
    When he selects the "kw" country
    Then he should see the Currency of the selected country "KWD"
