package test.steps;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import test.pages.CompanyOfBrokerPage;
import test.pages.PageFactory;

import javax.inject.Inject;

public class CompanyOfBrokerSteps {
    private final CompanyOfBrokerPage companyOfBrokerPage;

    @Inject
    public CompanyOfBrokerSteps(PageFactory thePageFactory) {
        companyOfBrokerPage = thePageFactory.newCompanyOfBrokerPage();
    }

    @Then("I should see 'Brokers & Agencies' as subrole in search option")
    public void verifySubRoleOfBroker(){
        companyOfBrokerPage.verifySubRoleOfBroker();
    }

    @Then("I should see 'Acquisitions' as strategy in search option")
    public void verifyStrategy(){
        companyOfBrokerPage.verifyStrategy();
    }

    @Then("I should see 'Off Plan Sales' as strategy in search option")
    public void verifyOffPlanSalesIsDisplayedInStrategy(){
        companyOfBrokerPage.verifyOffPlanSalesIsDisplayedInStrategy();
    }

    @When("I click on broker company name")
    public void clickAppraisalUser(){
        companyOfBrokerPage.clickOnBrokerCompanyName(1);
    }

    @When("I click on broker service name")
    public void clickServiceUser(){
        companyOfBrokerPage.clickOnServiceOfBroker(1);
    }

    @Then("I verify company name of broker is displayed")
    public void verifyBrokerCompany(){
        companyOfBrokerPage.verifyBrokerCompany(1);
    }

    @When("I click on solar option in asset experience field")
    public void selectSolarOption(){
        companyOfBrokerPage.selectSolarOption();
    }

    @When("I clear solar option of asset experience field")
    public void clearSolarOption(){
        companyOfBrokerPage.clearSolarOption();
    }

    @When("I select in dd option in deal stage drop down")
    public void selectInDdOption(){
        companyOfBrokerPage.selectInDdOption();
    }

    @When("I clear in dd option in deal stage drop down")
    public void clearInDdOption(){
        companyOfBrokerPage.clearInDdOption();
    }

    @When("I click on West region")
    public void clickWest(){
        companyOfBrokerPage.clickWest();
    }

    @When("I click on California state")
    public void clickCaliforniaState(){
        companyOfBrokerPage.clickCaliforniaState();
    }

    @When("I enter and select Napa city")
    public void enterAndSelectNapaCity(){
        companyOfBrokerPage.enterAndSelectNapaCity();
    }
}
