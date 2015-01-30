package test.steps;

import com.google.inject.Inject;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import test.pages.FundSponsorValidationPage;
import test.pages.PageFactory;

public class FundSponsorValidationSteps {

    private final FundSponsorValidationPage fundSponsorValidationPage;

    @Inject
    public FundSponsorValidationSteps(PageFactory thePageFactory) {
        fundSponsorValidationPage = thePageFactory.newFundSponsorValidationPage();
    }

    @When("I select land bank and lease up option in strategy drop down")
    public void selectTwoStrategyOption(){
        fundSponsorValidationPage.selectTwoStrategyOption();
    }

    @When("I clear strategy drop down field")
    public void clearStrategy(){
        fundSponsorValidationPage.clearStrategy();
    }

    @Then("I verify fund sponsor user of all option is displayed")
    public void userOfAllSearchOption(){
        fundSponsorValidationPage.userOfAllSearchOption(1);
    }

    @When("I clear 'Strategy' drop down field")
    public void clearStrategyField(){
        fundSponsorValidationPage.clearStrategyField();
    }
}
