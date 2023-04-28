package pages;

import io.cucumber.java.mk_latn.No;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClaimBenefitsTaxCreditsScreenPage {

	WebDriver driver;

    By Yes_Radio_Button =  By.id("radio-yes");
    By No_Radio_Button = By.id("radio-no");
	By Next_Button = By.id("next-button");
	
    public ClaimBenefitsTaxCreditsScreenPage(WebDriver driver) {
        this.driver = driver;
    }
    
    public void clickOnNextButton(){
        driver.findElement(Next_Button).click();
    }

    public void ClaimBenefitsTaxCredits(String option){
        if (option.equalsIgnoreCase("Yes")){
            driver.findElement(Yes_Radio_Button).click();
        } else if (option.equalsIgnoreCase("No")) {
            driver.findElement(No_Radio_Button).click();
        }
    }
}
