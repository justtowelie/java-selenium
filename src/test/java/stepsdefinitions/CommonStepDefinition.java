package stepsdefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import steps.SetUp;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import steps.CommonSteps;


public class CommonStepDefinition {

    private WebDriver driver;

    @Given("^the website is opened$")
    public void openSite() {
//        commonSteps.openSite();
//        commonSteps.verifyElementIsVisible(homePage.username);
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.findElement(By.cssSelector("input[name='username']")).isDisplayed();
        driver.quit();
    }
}
