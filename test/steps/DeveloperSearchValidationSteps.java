package test.steps;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import test.pages.DeveloperSearchValidationPage;
import test.pages.PageFactory;

import javax.inject.Inject;

public class DeveloperSearchValidationSteps {

    public final DeveloperSearchValidationPage developerSearchValidationPage;

    @Inject
    public DeveloperSearchValidationSteps(PageFactory thePageFactory) {
        developerSearchValidationPage = thePageFactory.newDeveloperSearchValidationPage();
    }

    @When("I select sale and leaseback and lease-up strategy in drop down")
    public void selectStrategyType(){
        developerSearchValidationPage.selectStrategyType();
    }

    @When("I clear strategy field drop down")
    public void clearStrategy(){
        developerSearchValidationPage.clearStrategy();
    }

    @When("I click on buy land strategy")
    public void clickBuyLand(){
        developerSearchValidationPage.clickBuyLand();
    }

    @Then("I verify developer user of all option is displayed")
    public void userOfAllSearchOption() throws Exception {
      developerSearchValidationPage.userOfAllSearchOption(1);
    }

    @When("I clear strategy field of developer search")
    public void clearStrategyField(){
        developerSearchValidationPage.clearStrategyField();
    }

}
