package steps;
import net.thucydides.core.pages.WebElementFacade;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;

public class CommonSteps {
    private final WebDriver driver;

    public CommonSteps(WebDriver driver) {
        this.driver = driver;
    }

    public void openSite() {
        // Open a website
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }

    public void verifyElementIsVisible(WebElementFacade webElementFacade) {
        Assertions.assertThat(webElementFacade.isVisible())
                .isTrue();
    }
}
