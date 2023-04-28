package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UniversalCreditClaimScreenPage {

	WebDriver driver;

    By Question_Heading = By.id("question-heading");

    By Yes_Radio_Button =  By.id("radio-yes");
    By No_Radio_Button = By.id("radio-no");
	By Next_Button = By.id("next-button");

    public UniversalCreditClaimScreenPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnNextButton(){
        driver.findElement(Next_Button).click();
    }
    public void Universalcreditclaimoption (String claim_opt){
        if (claim_opt.equalsIgnoreCase("Yes")){
            driver.findElement(Yes_Radio_Button).click();
        }
        else if (claim_opt.equalsIgnoreCase("No")){
            driver.findElement(No_Radio_Button).click();
        }
    }
}
