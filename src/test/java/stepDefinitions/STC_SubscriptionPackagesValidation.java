package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.DriverManager;
import managers.FileReaderManager;
import org.testng.asserts.SoftAssert;
import pages.Landing;

public class STC_SubscriptionPackagesValidation extends DriverManager {

    private final Landing landingPage = new Landing(getDriver());
    private final SoftAssert softAssert = new SoftAssert();

    @Given("the user navigates to the STC landing page")
    public void the_user_navigates_to_the_stc_landing_page() {
        getDriver().get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
    }

    @When("he selects the {string} country")
    public void he_selects_the_country(String country) {
        landingPage.clickCountryButtonSelection()
                .selectCountryByLabel(country);
    }

    @Then("he should see the subscription package types {string} {string} {string}")
    public void he_should_see_the_subscription_package_types(String litePackage, String classicPackage, String premiumPackage) {

        softAssert.assertEquals(getDriver().findElement(landingPage.get_SubscriptionType(1)).getText(), litePackage);
        softAssert.assertEquals(getDriver().findElement(landingPage.get_SubscriptionType(2)).getText(), classicPackage);
        softAssert.assertEquals(getDriver().findElement(landingPage.get_SubscriptionType(3)).getText(), premiumPackage);

        softAssert.assertAll();
    }


    @Then("he should see Price of the plans accordingly {string} {string} {string}")
    public void he_should_see_price_of_the_plans_accordingly(String litePrice, String classicPrice, String premiumPrice) {
        softAssert.assertEquals(getDriver().findElement(landingPage.get_SubscriptionPrice(1)).getText(), litePrice);
        softAssert.assertEquals(getDriver().findElement(landingPage.get_SubscriptionPrice(2)).getText(), classicPrice);
        softAssert.assertEquals(getDriver().findElement(landingPage.get_SubscriptionPrice(3)).getText(), premiumPrice);

        softAssert.assertAll();
    }

    @Then("he should see the Currency of the selected country {string}")
    public void he_should_see_the_currency_of_the_selected_country(String countryCurrency) {

        softAssert.assertTrue(getDriver().findElement(landingPage.get_Currency(1)).getText().contains(countryCurrency));
        softAssert.assertTrue(getDriver().findElement(landingPage.get_Currency(2)).getText().contains(countryCurrency));
        softAssert.assertTrue(getDriver().findElement(landingPage.get_Currency(3)).getText().contains(countryCurrency));

        softAssert.assertAll();
    }
}
