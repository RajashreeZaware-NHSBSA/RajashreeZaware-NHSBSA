package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GpInScotlandOrWalesScreenPage {
	
	WebDriver driver;

    By am =  By.id("radio-yes");
    By am_not = By.id("radio-no");
	By Next_Button = By.id("next-button");
	By back_button = By.id("back-button");
    public GpInScotlandOrWalesScreenPage(WebDriver driver) {

        this.driver = driver;
    }
    public void gpRegistered(String option) {
        if(option.equalsIgnoreCase("am"))
        {
            driver.findElement(am).click();

        }
        else if (option.equalsIgnoreCase("am not"))
    {
            driver.findElement(am_not).click();

        }
    }
        public void clickOnNextButton(){
        driver.findElement(Next_Button).click();
    }

    public void backLink(){
        driver.findElement(back_button).click();
    }
}
