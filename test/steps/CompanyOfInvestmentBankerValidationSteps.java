package test.steps;


import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import test.pages.CompanyOfInvestmentBankerValidationPage;
import test.pages.PageFactory;

import javax.inject.Inject;

public class CompanyOfInvestmentBankerValidationSteps {
    private final CompanyOfInvestmentBankerValidationPage companyOfInvestmentBankerValidationPage;

    @Inject
    public CompanyOfInvestmentBankerValidationSteps(PageFactory thePageFactory) {
        companyOfInvestmentBankerValidationPage = thePageFactory.newCompanyOfInvestmentBankerValidationPage();
    }

    @Then("I verify '$strCompanyName' company name of investment banker is displayed")
    public void verifyCompanyNameOfInvestmentIsDisplayed(@Named("strCompanyName") String strCompanyName){
        companyOfInvestmentBankerValidationPage.verifyCompanyNameOfInvestmentIsDisplayed(strCompanyName);
    }

    @Then("I verify '$strCompanyName' company name of investment banker is not displayed")
    public void  verifyCompanyNameOfInvestmentNotDisplayed(@Named("strCompanyName") String strCompanyName){
        companyOfInvestmentBankerValidationPage.verifyCompanyNameOfInvestmentNotDisplayed(strCompanyName);
    }

    @When("I set value in project size field")
    public void setProjectSizeSlider(){
       companyOfInvestmentBankerValidationPage.setProjectSizeSlider();
    }

    @When("I clear values in project size field")
    public void clearProjectSizeSlider(){
        companyOfInvestmentBankerValidationPage.clearProjectSizeSlider();
    }

    @Then("I verify investment banker company name of '$strSideSearch' is displayed")
    public void verifyCompanyOfDealSponsor(@Named("strSideSearch") String strSideSearch){
        companyOfInvestmentBankerValidationPage.companyOfInvestmentBankerIsDisplayed(2, strSideSearch);
    }

    @Then("I verify investment banker company name of '$strSideSearch' is not displayed")
    public void companyNotDisplayed(@Named("strSideSearch") String strSideSearch){
        companyOfInvestmentBankerValidationPage.companyOfInvestmentBankerNotDisplayed(2,strSideSearch);
    }

    @Then("I verify company name of investment banker selected all search option is displayed")
    public void verifyAllOptions(){
        companyOfInvestmentBankerValidationPage.verifyAllOptionsOfInvestmentBankerCompany(2);
    }

    @When("I select health care and storage option in asset experience drop down")
    public void selectHealthCareAndStorage(){
        companyOfInvestmentBankerValidationPage.selectHealthCareAndStorage();
    }

    @When("I clear health care and storage option in asset experience drop down")
    public void clearHealthCareAndStorage(){
        companyOfInvestmentBankerValidationPage.clearHealthCareAndStorage();
    }

    @When("I select permitted and pursuit option in deal stage drop down")
    public void selectPermittedAndPursuit(){
        companyOfInvestmentBankerValidationPage.selectPermittedAndPursuit();
    }

    @When("I clear permitted and pursuit option in deal stage drop down")
    public void clearPermittedAndPursuit(){
        companyOfInvestmentBankerValidationPage.clearPermittedAndPursuit();
    }

    @When("I select number of office in profile field")
    public void selectNumberOfOffice(){
        companyOfInvestmentBankerValidationPage.selectNumberOfOffice();
    }

    @When("I clear number of office in profile field")
    public void clearNumberOfOffice(){
        companyOfInvestmentBankerValidationPage.clearNumberOfOffice();
    }

    @When("I select number of professionals in profile field")
    public void selectNumberOfProfessionals(){
        companyOfInvestmentBankerValidationPage.selectNumberOfProfessionals();
    }

    @When("I clear number of professionals in profile field")
    public void clearNumberOfProfessionals(){
        companyOfInvestmentBankerValidationPage.clearNumberOfProfessionals();
    }

    @When("I select number of value transaction completed in profile field")
    public void selectNumberOfValueTransaction(){
        companyOfInvestmentBankerValidationPage.selectNumberOfValueTransaction();
    }

    @When("I clear number of value transaction completed in profile field")
    public void clearNumberOfValueTransaction(){
        companyOfInvestmentBankerValidationPage.clearNumberOfValueTransaction();
    }

    @When("I select number of transaction completed in profile field")
    public void selectNumOfTransactionCompleted(){
        companyOfInvestmentBankerValidationPage.selectNumOfTransactionCompleted();
    }

    @When("I clear number of transaction completed in profile field")
    public void clearNumOfTransactionCompleted(){
        companyOfInvestmentBankerValidationPage.clearNumOfTransactionCompleted();
    }
}
