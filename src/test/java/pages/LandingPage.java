package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
    WebDriver driver;

    private static final By Start_Now_Button = By.id("next-button");
    private static final By Coockies_Button = By.id("nhsuk-cookie-banner__link_accept_analytics");

    By Result_Heading = By.className("heading-large");

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void acceptCookies() {
        driver.findElement(Coockies_Button).click();
    }

    public void startNow() {
        driver.findElement(Start_Now_Button).click();
    }

    public void outputScreen(String expectedResult) {
        if (expectedResult.equalsIgnoreCase("You cannot use this service because you live in Northern Ireland")) {
            String actualResult = driver.findElement(Result_Heading).getText();
            Assert.assertEquals(expectedResult, actualResult);
        } else if (expectedResult.equalsIgnoreCase("You get help with NHS costs")) {
            driver.getPageSource().contains("You get help with NHS costs");
        }
    }

}