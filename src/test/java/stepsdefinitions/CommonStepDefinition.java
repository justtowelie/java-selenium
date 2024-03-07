package stepsdefinitions;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;
import pages.CommonSteps;

public class CommonStepDefinition {


    @Given("the website is opened")
    public void openSite()
    {
        CommonSteps commonSteps = new CommonSteps();
        commonSteps.openSite();
    }

}
