package test.steps;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import test.pages.FundSponsorPage;
import test.pages.PageFactory;
import com.google.inject.Inject;


public class FundSponsorSteps {

    private final FundSponsorPage fundSponsorPage;

    @Inject
    public FundSponsorSteps(PageFactory thePageFactory) {
        fundSponsorPage = thePageFactory.newFundSponsorPage();
    }

    @Then("I verify the sub role type")
    public void verifySubRole(){
        fundSponsorPage.verifySubRole(2);
    }

    @Then("I verify 'Fund Sponsor' user is displayed")
    public void verifyUser(){
        fundSponsorPage.verifyUser(1);
    }

    @Then("I verify fund sponsor user is displayed")
    public void verifyFundSponsorUser(){
        fundSponsorPage.verifyFundSponsorUser(1);
    }

    @When("I click on the verified fund sponsor name")
    public void clickOnVerifyUser(){
        fundSponsorPage.clickOnVerifyUser(1);
    }

    @Then("I verify 'Fund Sponsor' company name is displayed")
    public void verifyFundSponsorCompany(){
        fundSponsorPage.verifyFundSponsorCompany(1);
    }

    @When("I click on Fund Sponsor company name")
    public void clickOnFundSponsorCompanyName(){
        fundSponsorPage.clickOnFundSponsorCompanyName(1);
    }

    @When("I enter location of fund sponsor in text field")
    public void enterLocation(){
        fundSponsorPage.enterLocation(1);
    }

    @When("I click on the location")
    public void clickLocation(){
        fundSponsorPage.clickLocation(1);
    }

    @Then("I verify Location field of fund sponsor")
    public void verifyLocation(){
        fundSponsorPage.verifyLocation(1);
    }

    @When("I click on land bank option in strategy type")
    public void selectStrategyType(){
        fundSponsorPage.selectStrategyType();
    }

    @When("I clear strategy drop down field of fund sponsor")
    public void clearStrategy(){
        fundSponsorPage.clearStrategy();
    }

    @When("I click on Iowa state")
    public void clickIowaState(){
        fundSponsorPage.clickIowaState();
    }

    @When("I enter and select Hale city")
    public void enterAndSelectHaleCity(){
        fundSponsorPage.enterAndSelectHaleCity();
    }
}
