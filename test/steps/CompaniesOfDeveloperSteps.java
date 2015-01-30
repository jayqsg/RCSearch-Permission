package test.steps;

import com.google.inject.Inject;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import test.pages.CompaniesOfDeveloperPage;
import test.pages.PageFactory;

public class CompaniesOfDeveloperSteps {

    private final CompaniesOfDeveloperPage companiesOfDeveloperPage;

    @Inject
    public CompaniesOfDeveloperSteps(PageFactory thePageFactory) {
        companiesOfDeveloperPage = thePageFactory.newCompaniesOfDeveloperPage();
    }

    @When("I select solar option in the asset drop down list")
    public void clickSolar(){
        companiesOfDeveloperPage.clickSolar();
    }

    @When("I clear asset option in asset type field")
    public void clearSolar(){
        companiesOfDeveloperPage.clearSolar();
    }

    @When("I select sales and leaseback option in strategy drop down")
    public void clickSales(){
        companiesOfDeveloperPage.clickSales();
    }

    @When("I clear strategy drop down of developer")
    public void clearSales(){
        companiesOfDeveloperPage.clearSales();
    }

    @When("I select opportunistic option in risk profile")
    public void clickOpportunistic(){
        companiesOfDeveloperPage.clickOpportunistic();
    }

    @When("I clear risk profile field of developer search")
    public void clearOpportunistic(){
        companiesOfDeveloperPage.clearOpportunistic();
    }

    @When("I select family office option in investment method drop down")
    public void clickFamilyOffice(){
        companiesOfDeveloperPage.clickFamilyOffice();
    }

    @When("I clear investment method field")
    public void clearFamilyOffice(){
        companiesOfDeveloperPage.clearFamilyOffice();
    }

    @When("I select placement agents in route to sponsor drop down")
    public void clickPlacementAgent(){
        companiesOfDeveloperPage.clickPlacementAgents();
    }

    @When("I clear route to sponsor drop down of search")
    public void clearPlacementAgents(){
        companiesOfDeveloperPage.clearPlacementAgents();
    }

    @Then("I verify company name of developer")
    public void developerCompanyName() throws Exception {
        companiesOfDeveloperPage.developerCompanyName(1);
    }

    @When("I select co-invests with partners field")
    public void selectCoInvests(){
        companiesOfDeveloperPage.selectCoInvests();
    }

    @When("I clear co invests with partners field")
    public void clearCoInvests(){
        companiesOfDeveloperPage.clearCoInvests();
    }
}

