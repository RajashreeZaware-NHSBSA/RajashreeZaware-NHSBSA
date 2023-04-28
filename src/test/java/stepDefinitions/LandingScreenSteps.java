package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.*;

public class LandingScreenSteps {
    String app_url = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start";
    public WebDriver driver;
    LandingPage login;
    WhereYouLiveScreenPage lic;
    GpInScotlandOrWalesScreenPage gpregistered;
    DentalPracticeCountryScreenPage dpCountry;
    DateOfBirthScreenPage dateOfBirthScreenPage;
    LiveWithPartnerScreenPage liveWithPartnerScreenPage;
    ClaimBenefitsTaxCreditsScreenPage claimBenefitsTaxCreditsScreenPage;
    PaidUniversalCreditScreenPage paidUniversalCreditScreenPage;
    UniversalCreditClaimScreenPage universalCreditClaimScreenPage;
    YourTakeHomePayScreenPage yourTakeHomePayScreenPage;


    @Before
    public void setUp() {
//        String browserName = getParameter("browser");
//        driver = new Driver(browserName);
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--headless");
        options.addArguments("--start-maximized");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        options.merge(capabilities);
        this.driver = new ChromeDriver(options);
    }

    @Given("I want to check nhs costs online service")
    public void I_want_to_check_nhs_costs_online_service() {
        driver.get(app_url);
        login = new LandingPage(driver);
        login.acceptCookies();
    }

    @When("I want to start my entitlement")
    public void I_want_to_start_my_entitlement() {
        login = new LandingPage(driver);
        login.startNow();
    }

    @Then("^I will see (.*) screen$")
    public void i_will_see_screen(String screen) {
        login = new LandingPage(driver);
        login.outputScreen(screen);
    }

    @And("I want to proceed on where you live screen")
    public void i_want_to_proceed_on_where_you_live_screen() {
        lic = new WhereYouLiveScreenPage(driver);
        lic.clickOnNextButton();
    }


    @Then("I will land on {string} screen")
    public void iWillLandOnScreen(String pageHeading) {
        lic = new WhereYouLiveScreenPage(driver);
        lic.gpInScotlandOrWales(pageHeading);
    }

    @And("I live in {string}")
    public void iLiveIn(String country) {
        lic = new WhereYouLiveScreenPage(driver);
        lic.liveInCountry(country);
    }

    @Then("I will see the message {string}")
    public void iWillSeeTheMessage(String message) {
        login = new LandingPage(driver);
        login.outputScreen(message);
    }

    @And("I {string} registered with GP practice")
    public void iRegisteredWithGPPractice(String option) {
        gpregistered = new GpInScotlandOrWalesScreenPage(driver);
        gpregistered.gpRegistered(option);
    }

    @When("I want go back to the previous screen")
    public void iWantGoBackToThePreviousScreen() {
        gpregistered = new GpInScotlandOrWalesScreenPage(driver);
        gpregistered.backLink();
    }

    @And("I want to proceed on GP practice screen")
    public void IwanttoproceedonGPpracticescreen() {
        gpregistered = new GpInScotlandOrWalesScreenPage(driver);
        gpregistered.clickOnNextButton();
    }

    @And("My dental practices in {string} country")
    public void Mydentalpracticesincountry(String country) {
        dpCountry = new DentalPracticeCountryScreenPage(driver);
        dpCountry.denatlPracticeCountry(country);
    }

    @When("I proceed on dental practice country screen")
    public void Iproceedondentalpracticecountryscreen() {
        dpCountry = new DentalPracticeCountryScreenPage(driver);
        dpCountry.clickOnNextButton();
    }

    @And("My date of birth is {string}, {string}, {string}")
    public void myDateOfBirthIs(String day, String month, String year) {
        dateOfBirthScreenPage = new DateOfBirthScreenPage(driver);
        dateOfBirthScreenPage.enterDateOfbirth(day, month, year);
    }

    @When("I will continue on date of birth screen")
    public void iWillContinueOnDateOfBirthScreen() {
        dateOfBirthScreenPage = new DateOfBirthScreenPage(driver);
        dateOfBirthScreenPage.clickOnNextButton();
    }

    @When("I {string} live with a partner")
    public void iLiveWithAPartner(String item) {
        liveWithPartnerScreenPage = new LiveWithPartnerScreenPage(driver);
        liveWithPartnerScreenPage.selectYesOrNoChoice(item);
    }

    @And("I will continue on next screen")
    public void iWillContinueOnNextScreen() {
        liveWithPartnerScreenPage = new LiveWithPartnerScreenPage(driver);
        liveWithPartnerScreenPage.clickOnNextButton();
    }

    @When("I choose {string} for claim benefits or tax credits")
    public void iChooseForClaimBenefitsOrTaxCredits(String opt) {
        claimBenefitsTaxCreditsScreenPage = new ClaimBenefitsTaxCreditsScreenPage(driver);
        claimBenefitsTaxCreditsScreenPage.ClaimBenefitsTaxCredits(opt);
    }

    @When("I choose {string} option on paid universal credit screen")
    public void iChooseOptionOnPaidUniversalCreditScreen(String choose) {
        paidUniversalCreditScreenPage = new PaidUniversalCreditScreenPage(driver);
        paidUniversalCreditScreenPage.universalCreditOption(choose);
    }

    @When("I choose {string} option as part of your universal credit")
    public void iChooseOptionAsPartOfYourUniversalCredit(String claimOpt) {
        universalCreditClaimScreenPage = new UniversalCreditClaimScreenPage(driver);
        universalCreditClaimScreenPage.Universalcreditclaimoption(claimOpt);
    }

    @And("My take-home pay for last universal credit period {string} less")
    public void myTakeHomePayForLastUniversalCreditPeriodLess(String homePay) {
        yourTakeHomePayScreenPage = new YourTakeHomePayScreenPage(driver);
        yourTakeHomePayScreenPage.yourTakeHomePayOption(homePay);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
//	private String getParameter(String name) {
//		String value = System.getProperty(name);
//		if (value == null)
//			throw new RuntimeException(name + " is not a parameter!");
//
//		if (value.isEmpty())
//			throw new RuntimeException(name + " is empty!");
//
//		return value;
//	}
}

