package test.steps;


import com.google.inject.Inject;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.pages.CompanyOfBrokerValidationPage;
import test.pages.PageFactory;
import test.pages.WaitUtil;

public class CompanyOfBrokerValidationSteps {
    private final CompanyOfBrokerValidationPage companyOfBrokerValidationPage;

    @Inject
    public CompanyOfBrokerValidationSteps(PageFactory thePageFactory) {
        companyOfBrokerValidationPage = thePageFactory.newCompanyOfBrokerValidationPage();
    }

    @Then("I verify '$strCompanyNameIsDisplayed' company name of broker is displayed")
    public void verifyCompanyNameOfBrokerIsDisplayed(@Named("strCompanyName") String strCompanyName){
        companyOfBrokerValidationPage.verifyCompanyNameOfBrokerIsDisplayed(strCompanyName);
    }

    @Then("I verify '$strCompanyNameNotDisplayed' company name of broker is not displayed")
    public void  verifyCompanyNameOfBrokerNotDisplayed(@Named("strCompanyNameNotDisplayed") String strCompanyNameNotDisplayed){
        companyOfBrokerValidationPage.verifyCompanyNameOfBrokerNotDisplayed(strCompanyNameNotDisplayed);
    }
    @Then("I verify broker company name of '$strSideSearch' is displayed")
    public void verifyCompanyOfDealSponsor(@Named("strSideSearch") String strSideSearch){
        companyOfBrokerValidationPage.companyOfBrokerIsDisplayed(2, strSideSearch);
    }

    @Then("I verify broker company name of '$strSideSearch' is not displayed")
    public void companyNotDisplayed(@Named("strSideSearch") String strSideSearch){
        companyOfBrokerValidationPage.companyOfBrokerNotDisplayed(2, strSideSearch);

    }

    @Then("I verify company name of broker selected all search option is displayed")
    public void verifyAllOptions(){
        companyOfBrokerValidationPage.verifyAllOptionsOfBrokerCompany(2);
    }

    @When("I select solar and multi family option of asset experience field")
    public void selectSolarAndMultifamily(){
        companyOfBrokerValidationPage.selectSolarAndMultifamily();
    }

    @When("I clear solar and multi family options of asset experience field")
    public void clearSolarAndMultifamily(){
        companyOfBrokerValidationPage.clearSolarAndMultifamily();
    }

    @When("I select in dd and owned option in deal stage drop down")
    public void selectInDdAndOwnedOption(){
        companyOfBrokerValidationPage.selectInDdAndOwnedOption();
    }

    @When("I clear in dd and owned option in deal stage drop down")
    public void clearInDdAndOwnedOption(){
        companyOfBrokerValidationPage.clearInDdAndOwnedOption();
    }
}
