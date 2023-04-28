package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourTakeHomePayScreenPage {
	WebDriver driver;

	By Yes_Radio_Button =  By.id("radio-yes");
	By No_Radio_Button = By.id("radio-no");
	By Next_Button = By.id("next-button");

	public YourTakeHomePayScreenPage(WebDriver driver) {
		this.driver = driver;
	}

	public void yourTakeHomePayOption (String option){
		if (option.equalsIgnoreCase("was")){
			driver.findElement(Yes_Radio_Button).click();
		} else if (option.equalsIgnoreCase("was not")) {
			driver.findElement(No_Radio_Button).click();
		}
	}

	public void clickOnNextButton(){
		driver.findElement(Next_Button).click();
	}

}
