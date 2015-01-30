package test.steps;


import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import test.pages.CompanyOfInvestmentBankerPage;
import test.pages.PageFactory;

import javax.inject.Inject;

public class CompanyOfInvestmentBankerSteps {
    private final CompanyOfInvestmentBankerPage companyOfinvestmentBankerPage;

    @Inject
    public CompanyOfInvestmentBankerSteps(PageFactory thePageFactory) {
        companyOfinvestmentBankerPage = thePageFactory.newCompanyOfInvestmentBankerPage();
    }

    @Then("I should see 'Investment Banker' as subrole in search option")
    public void verifySubRoleOfBanker(){
        companyOfinvestmentBankerPage.verifySubRoleOfBanker();
    }

    @Then("I should see 'Capital Raising' as strategy in search option")
    public void verifyStrategyOfBanker(){
        companyOfinvestmentBankerPage.verifyStrategyOfBanker();
    }

    @When("I click on banker company name")
    public void clickOnCompanyName(){
        companyOfinvestmentBankerPage.clickOnCompanyName(1);
    }

    @When("I click on banker project name")
    public void clickOnProject(){
        companyOfinvestmentBankerPage.clickOnProject(2);
    }

    @When("I set the values in the slider of project size")
    public void setSlider(){
        companyOfinvestmentBankerPage.setSlider();
    }

    @Then("I verify company name of investment banker is displayed")
    public void verifyInvestmentBankerCompany(){
        companyOfinvestmentBankerPage.verifyInvestmentBankerCompany(1);
    }

    @When("I clear the project size field")
    public void clearSlider(){
        companyOfinvestmentBankerPage.clearSlider();
    }

    @When("I select health care option in asset experience drop down")
    public void selectHealthCareOption(){
        companyOfinvestmentBankerPage.selectHealthCareOption();
    }

    @When("I clear health care option in asset experience drop down")
    public void clearHealthCareOption(){
        companyOfinvestmentBankerPage.clearHealthCareOption();
    }

    @When("I select permitted option in deal stage drop down")
    public void selectPermittedOption(){
        companyOfinvestmentBankerPage.selectPermittedOption();
    }

    @When("I clear permitted option in deal stage drop down")
    public void clearPermittedOption(){
        companyOfinvestmentBankerPage.clearPermittedOption();
    }

    @When("I click on profile and experience field")
    public void clickProfileAndExperienceField(){
        companyOfinvestmentBankerPage.clickProfileAndExperienceField();
    }

    @When("I select number of offices")
    public void selectNoOfOfficeField(){
        companyOfinvestmentBankerPage.selectNoOfOfficeField();
    }

    @When("I clear number of offices")
    public void clearNoOfOfficeField(){
        companyOfinvestmentBankerPage.clearNoOfOfficeField();
    }

    @When("I select number of professionals")
    public void selectNoOfProfessionals(){
        companyOfinvestmentBankerPage.selectNoOfProfessionals();
    }

    @When("I clear number of professionals")
    public void clearNoOfProfessionals(){
        companyOfinvestmentBankerPage.clearNoOfProfessionals();
    }

    @When("I select number of value transactions completed")
    public void selectValueOfTransactionCompleted(){
        companyOfinvestmentBankerPage.selectValueOfTransactionCompleted();
    }

    @When("I clear number of value transaction completed")
    public void clearValueOfTransactionCompleted(){
        companyOfinvestmentBankerPage.clearValueOfTransactionCompleted();
    }

    @When("I select number of transaction completed")
    public void selectNumberOfTransactionCompleted(){
        companyOfinvestmentBankerPage.selectNumberOfTransactionCompleted();
    }

    @When("I clear number of transaction completed")
    public void clearNumberOfTransactionCompleted(){
        companyOfinvestmentBankerPage.clearNumberOfTransactionCompleted();
    }

    @When("I click on Wisconsin state")
    public void clickWisconsinState(){
        companyOfinvestmentBankerPage.clickWisconsinState();
    }

    @When("I enter and select Eden city")
    public void enterAndSelectEdenCity(){
        companyOfinvestmentBankerPage.enterAndSelectEdenCity();
    }


}
