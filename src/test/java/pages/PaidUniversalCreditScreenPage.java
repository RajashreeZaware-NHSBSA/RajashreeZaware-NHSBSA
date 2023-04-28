package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaidUniversalCreditScreenPage {

    WebDriver driver;

    By Question_Heading = By.id("question-heading");
    By Yes_Radio_Button = By.id("yes-universal");
    By Not_Yet_Radio_Button = By.id("not-yet");
    By No_Radio_Button = By.id("different-benefit");

    By Next_Button = By.id("next-button");


    public PaidUniversalCreditScreenPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnNextButton() {
        driver.findElement(Next_Button).click();
    }

    public void universalCreditOption(String uc_opt) {
        if (uc_opt.equalsIgnoreCase("Yes")) {
            driver.findElement(Yes_Radio_Button).click();
        }
        else if (uc_opt.equalsIgnoreCase("Not yet")) {
            driver.findElement(Not_Yet_Radio_Button).click();
        }
        else if (uc_opt.equalsIgnoreCase("No")) {
            driver.findElement(No_Radio_Button).click();
        }
    }
}
