package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DentalPracticeCountryScreenPage {
	WebDriver driver;

    By Question_Heading = By.id("question-heading");
    By England = By.id("radio-england");
    By Scotland = By.id("radio-scotland");
    By Wales = By.id("radio-wales");
    By Northern_Ireland = By.id("radio-nire");
	By Next_Button = By.id("next-button");
	
    public DentalPracticeCountryScreenPage(WebDriver driver) {
        this.driver = driver;
    }
    
    public void clickOnNextButton(){
        driver.findElement(Next_Button).click();
    }

    public void denatlPracticeCountry(String dp_country){
    if (dp_country.equalsIgnoreCase("England")){
        driver.findElement(England).click();
    }
    }
}
