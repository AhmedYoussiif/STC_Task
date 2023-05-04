package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Landing {
    private final WebDriver driver;

    //locators
    private static final By btn_Country_Selection = By.xpath("//div[@id='country']");


    public static By get_Country(String country) {
        return By.xpath("//span[contains(@id, '" + country + "-contry-lable')]");
    }

    public By get_SubscriptionType(int index) {
        return By.xpath("(//strong[contains(@class, 'plan-title')])[" + index + "]");
    }

    public By get_SubscriptionPrice(int index) {
        return By.xpath("(//div[contains(@class, 'price')])[" + index + "]/b");
    }

    public By get_Currency(int index) {
        return By.xpath("(//div[contains(@class, 'price')]/i)[" + index + "]");
    }

    public Landing(WebDriver driver) {
        this.driver = driver;
    }


    //Actions
    public Landing clickCountryButtonSelection() {
        driver.findElement(btn_Country_Selection).click();
        return this;
    }

    public void selectCountryByLabel(String country) {
        driver.findElement(get_Country(country)).click();
    }

}
