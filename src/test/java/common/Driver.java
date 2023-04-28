//package common;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//import java.util.List;
//import java.util.Set;
//
//public class Driver implements WebDriver {
//
//    WebDriver driver;
//    String browserName;
//    public Driver(WebDriver driver){
//        this.driver=driver;
//    }
//
//    public Driver(String browserName) {
//        this.browserName = browserName;
//        if (browserName.equalsIgnoreCase("chrome")) {
//            WebDriverManager.chromedriver().setup();
//            ChromeOptions options = new ChromeOptions();
//            options.addArguments("--remote-allow-origins=*");
//            options.addArguments("--headless");
//            options.addArguments("--start-maximized");
//            DesiredCapabilities capabilities = new DesiredCapabilities();
//            capabilities.setCapability(ChromeOptions.CAPABILITY, options);
//            options.merge(capabilities);
//            this.driver = new ChromeDriver(options);
//        }
//        if (browserName.equalsIgnoreCase("firefox")) {
//            WebDriverManager.firefoxdriver().setup();
//            driver.manage().window().maximize();
//            this.driver = new FirefoxDriver();
//        }
//        if (browserName.equalsIgnoreCase("ie")) {
//            WebDriverManager.iedriver().setup();
//            this.driver = new InternetExplorerDriver();
//        }
//    }
//    public void get(String url) {
//
//    }
//
//    public String getCurrentUrl() {
//        return null;
//    }
//
//    public String getTitle() {
//        return null;
//    }
//
//    public List<WebElement> findElements(By by) {
//        return null;
//    }
//
//    public WebElement findElement(By by) {
//        return null;
//    }
//
//    public String getPageSource() {
//        return null;
//    }
//
//    public void close() {
//        this.driver.close();
//
//    }
//
//    public void quit() {
//
//    }
//
//    public Set<String> getWindowHandles() {
//        return null;
//    }
//
//    public String getWindowHandle() {
//        return null;
//    }
//
//    public TargetLocator switchTo() {
//        return null;
//    }
//
//    public Navigation navigate() {
//        return null;
//    }
//
//    public Options manage() {
//        return null;
//    }
//
//
//}