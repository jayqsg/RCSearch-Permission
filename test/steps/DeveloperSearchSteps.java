package test.steps;

import org.jbehave.core.annotations.Named;
import test.pages.PageFactory;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import test.pages.DeveloperSearchPage;
import javax.inject.Inject;

public class DeveloperSearchSteps {

    public final DeveloperSearchPage developerSearchPage;

    @Inject
    public DeveloperSearchSteps(PageFactory thePageFactory) {
        developerSearchPage = thePageFactory.newDeveloperSearchPage();
    }

    @Then("I should see sub role as $nameOSubRole")
    public void verifySearchOption(@Named("nameOSubRole") String strSubRole){
        String lStrSubRole = developerSearchPage.verifySearchOption();
        Assert.assertTrue(strSubRole.contains(lStrSubRole));
    }

    @Then("I verify 'Developer' name is displayed")
    public void verifyDeveloperName(){
        developerSearchPage.verifyDeveloperName(1);
    }

    @Then("I verify the 'Developer' name is displayed")
    public void verifyDeveloperNameIsDisplayed(){
        developerSearchPage.verifyDeveloperNameIsDisplayed(1);
    }

    @When("I click on verified developer name")
    public void clickOnDeveloper(){
        developerSearchPage.clickOnDeveloperName(1);
    }

    @Then("I verify 'Developer' company name is displayed")
    public void searchedCompany(){
        developerSearchPage.searchedDeveloperCompany(1);
    }

    @When("I click on Developer company name")
    public void clickOnDeveloperCompany(){
        developerSearchPage.clickOnDeveloperCompany(1);
    }

    @When("I select sale and leaseback option in strategy drop down list")
    public void selectStrategy(){
        developerSearchPage.selectStrategy();
    }

    @When("I clear strategy of asset drop down")
    public void clearStrategy(){
        developerSearchPage.clearStrategy();
    }

    @When("I click on MidWest region")
    public void clickMidWest(){
        developerSearchPage.clickMidWest();
    }

    @When("I click on West Virginia state")
    public void clickWestVirginiaState(){
        developerSearchPage.clickWestVirginiaState();
    }

    @When("I enter and select Halo city")
    public void enterAndSelectHaloCity(){
        developerSearchPage.enterAndSelectHaloCity();
    }

}
