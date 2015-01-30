package test.steps;

import com.google.inject.Inject;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import test.pages.PageFactory;
import test.pages.PeopleSearchValidationPage;

public class PeopleSearchValidationSteps {
    private final PeopleSearchValidationPage peopleSearchValidationPage;

    @Inject
    public PeopleSearchValidationSteps(PageFactory thePageFactory) {
        peopleSearchValidationPage = thePageFactory.newPeopleSearchValidationPage();
    }

    @Then("I verify '$strInvestorUserName' investor user name is not displayed")
    public void verifyInvestorUser(@Named("strInvestorUserName") String strInvestorUserName){
        peopleSearchValidationPage.verifyInvestorUserNameNotDisplayed(strInvestorUserName);
    }

    @Then("I verify '$strInvestorUserName' investor user name is displayed")
    public void verifyInvestorUserNameIsDisplayed(@Named("strInvestorUserName") String strInvestorUserName){
        peopleSearchValidationPage.verifyInvestorUserNameIsDisplayed(strInvestorUserName);
    }

    @Then("I verify '$strDealSponsorUserName' deal sponsor user name is not displayed")
    public void verifyDealSponsorUserNameNotDisplayed(@Named("strDealSponsorUserName") String strDealSponsorUserName){
        peopleSearchValidationPage.verifyDealSponsorUserNameNotDisplayed(strDealSponsorUserName);
    }

    @When("I enter 'Investor' user name")
    public void enterInvestorUserName(){
        peopleSearchValidationPage.enterInvestorUserName(1);
    }

    @When("I enter 'Investor' job title")
    public void enterInvestorJobTitle(){
        peopleSearchValidationPage.enterInvestorJobTitle(1);
    }

    @When("I enter 'Investor' company name")
    public void enterInvestorCompanyName(){
        peopleSearchValidationPage.enterInvestorCompanyName(1);
    }

}
