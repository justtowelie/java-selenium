package pages;

import net.thucydides.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(css = "input[name='username']")
    public WebElementFacade username;

    @FindBy(css = "input[name='password']")
    public WebElementFacade password;

    @FindBy(css = "input[type='submit']")
    public WebElementFacade submit;
}
