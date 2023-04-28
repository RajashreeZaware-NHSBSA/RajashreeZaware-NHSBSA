package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WhereYouLiveScreenPage {
	WebDriver driver;

	By England = By.id("radio-england");
	By Scotland = By.id("radio-scotland");
	By Wales = By.id("radio-wales");
	By Northern_Ireland = By.id("radio-nire");
	By Next_Button = By.id("next-button");
	By Back_Link = By.id("back-button");
    By Question_Heading = By.id("question-heading");

	public WhereYouLiveScreenPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnNextButton() {
		driver.findElement(Next_Button).click();
	}

	public void liveInCountry(String country) {
        if(country.equalsIgnoreCase("England")||country.equalsIgnoreCase("ENGLAND")) 
        {
            driver.findElement(England).click();

        }
        else if(country.equalsIgnoreCase("scotland") || country.equalsIgnoreCase("SCOTLAND") ) {
            driver.findElement(Scotland).click();
        }
        else if(country.equalsIgnoreCase("wales") || country.equalsIgnoreCase("WALES") ) {
            driver.findElement(Wales).click();
        }

        else if (country.equalsIgnoreCase("Northern Ireland") || country.equalsIgnoreCase("NORTHERN_IRELAND") )
        {
            driver.findElement(Northern_Ireland).click();
        }
    }
	
	public void gpInScotlandOrWales(String expectedPageTitle) {
		String actualPageTitle = driver.findElement(Question_Heading).getText();
		Assert.assertEquals(expectedPageTitle ,actualPageTitle);
	}
}
