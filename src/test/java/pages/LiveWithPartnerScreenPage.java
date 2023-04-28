package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LiveWithPartnerScreenPage {

	WebDriver driver;

    By Question_Heading = By.id("question-heading");
    By Yes_Radio_Button =  By.id("radio-yes");
    By No_Radio_Button = By.id("radio-no");
	By Next_Button = By.id("next-button");
	
	
    public LiveWithPartnerScreenPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectYesOrNoChoice(String yesOrNo){
        if (yesOrNo.equalsIgnoreCase("do")){
            driver.findElement(Yes_Radio_Button).click();
        }
        else if(yesOrNo.equalsIgnoreCase("do not")){
            driver.findElement(No_Radio_Button).click();
        }

    }
    
    public void clickOnNextButton(){
        driver.findElement(Next_Button).click();
    }
}
