package pages;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonSteps
{
    private WebDriver driver; // WebDriver object is declared at class level

    @Step
    public void openSite() {
        // Set the system property
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        try {
            // Initialize ChromeDriver instance
            driver = new ChromeDriver();
            // Open a website
            driver.get("https://www.example.com");
        } catch (Exception e) {
            // Handle any exceptions
            e.printStackTrace();
        }
    }

}
