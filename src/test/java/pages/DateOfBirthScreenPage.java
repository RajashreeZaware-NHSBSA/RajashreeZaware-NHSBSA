package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DateOfBirthScreenPage {

	
	WebDriver driver;
	By Next_Button = By.id("next-button");
    By Dob_Day = By.id("dob-day");
    By Dob_Month = By.id("dob-month");
    By Dob_Year = By.id("dob-year");
    public DateOfBirthScreenPage(WebDriver driver) {
        this.driver = driver;
    }
    
    public void clickOnNextButton(){
        driver.findElement(Next_Button).click();
    }

    public void enterDateOfbirth(String day, String month, String year) {
        driver.findElement(Dob_Day).sendKeys(day);
        driver.findElement(Dob_Month).sendKeys(month);
        driver.findElement(Dob_Year).sendKeys(year);
    }
}
