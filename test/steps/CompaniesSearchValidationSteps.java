package test.steps;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import test.pages.CompaniesSearchValidationPage;
import test.pages.PageFactory;

public class CompaniesSearchValidationSteps {
    private final CompaniesSearchValidationPage companiesSearchValidationPage;

    @Inject
    public CompaniesSearchValidationSteps(PageFactory thePageFactory) {
        companiesSearchValidationPage = thePageFactory.newCompaniesSearchValidationPage();
    }

    @Then("I verify '$strDealSponsorCompany' company name of deal sponsor is not displayed")
    public void verifyDealSponsorCompanyNameNotDisplayed(@Named("strDealSponsorCompany") String strDealSponsorCompany){
        companiesSearchValidationPage.verifyDealSponsorCompanyNameNotDisplayed(strDealSponsorCompany);
    }

    @Then("I verify '$strDeveloperCompany' company name of developer is displayed")
    public void verifyDeveloperCompanyNameIsDisplayed(@Named("strDeveloperCompany") String strDeveloperCompany){
        companiesSearchValidationPage.verifyDeveloperCompanyNameIsDisplayed(strDeveloperCompany);
    }

    @Then("I verify '$strDeveloperCompany' company name of developer is not displayed")
    public void verifyDeveloperCompanyNameNotDisplayed(@Named("strDeveloperCompany") String strDeveloperCompany){
        companiesSearchValidationPage.verifyDeveloperCompanyNameNotDisplayed(strDeveloperCompany);
    }

    @When("I enter developer company type in search option")
    public void enterInvestorType(){
        companiesSearchValidationPage.enterDeveloperType(1);
    }

    @When("I enter developer Company Title")
    public void enterInvestorCompanyTitle(){
        companiesSearchValidationPage.enterDeveloperCompanyTitle(1);
    }

    @When("I clear Investor Company Title")
    public void clearInvestorCompanyTitle(){
        companiesSearchValidationPage.clearInvestorCompanyTitle();
    }

}
