package test.steps;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import test.pages.CompaniesSearchPage;
import test.pages.PageFactory;


public class CompaniesSearchSteps {
    private final CompaniesSearchPage companiesSearchPage;

    @Inject
    public CompaniesSearchSteps(PageFactory thePageFactory) {
        companiesSearchPage = thePageFactory.newCompaniesSearchPage();
    }

    @When("I click on company name of deal sponsor")
    public void clickDealSponsorCompanyName(){
        companiesSearchPage.clickDealSponsorCompanyName(1);
    }

    @Then("I should see '$strInvestorCompany' company name of investor")
    public void verifyInvestorCompanyName(@Named("strInvestorCompany") String strInvestorCompany){
        companiesSearchPage.verifyInvestorCompanyName(strInvestorCompany);
    }

    @When("I click on company name of investor")
    public void clickInvestorCompanyName(){
        companiesSearchPage.clickInvestorCompanyName(1);
    }

    @Then("I should see '$strLenderCompany' company name of lender")
    public void verifyLenderCompanyName(@Named("strLenderCompany") String strLenderCompany){
       companiesSearchPage.verifyLenderCompanyName(strLenderCompany);
    }

    @When("I click on company name of lender")
    public void clickLenderCompanyName(){
        companiesSearchPage.clickLenderCompanyName(1);
    }

    @Then("I should see '$strServiceCompany' company name of advisor")
    public void verifyAdvisorCompanyName(@Named("strServiceCompany") String strServiceCompany){
        companiesSearchPage.verifyAdvisorCompanyName(strServiceCompany);
    }

    @When("I click on company of real estate advisor")
    public void clickAdvisorCompanyName(){
        companiesSearchPage.clickAdvisorCompanyName(1);
    }


    @When("I enter company name in search field")
    public void enterCompanyName(){
        companiesSearchPage.enterCompanyName(1);
    }

    @When("I enter company type in search option")
    public void enterTypeField(){
        companiesSearchPage.enterTypeField(1);
    }

    @Then("I should see '$strDealSponsorCompany' company name of deal sponsor")
    public void verifyDealSponsorCompanyName(@Named("strDealSponsorCompany") String strDealSponsorCompany){
       companiesSearchPage.verifyDealSponsorCompanyName(strDealSponsorCompany);
    }

    @Then("I verify '$strDealSponsorCompany' company name of deal sponsor is displayed")
    public void verifyDealSponsorCompanyNameIsDisplayed(@Named("strDealSponsorCompany") String strDealSponsorCompany){
        companiesSearchPage.verifyDealSponsorCompanyNameIsDisplayed(strDealSponsorCompany);
    }

    @When("I clear name field in search option")
    public void clearCompanyNameField(){
        companiesSearchPage.clearCompanyNameField();
    }

    @When("I clear type field in search option")
    public void clearTypeField(){
        companiesSearchPage.clearTypeField();
    }


}



