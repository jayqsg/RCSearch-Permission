package test.steps;

import com.google.inject.Inject;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import test.pages.CompaniesOfFundSponsorValidationPage;
import test.pages.PageFactory;

public class CompaniesOfFundSponsorValidationSteps {
    private final CompaniesOfFundSponsorValidationPage companiesOfFundSponsorValidationPage;

    @Inject
    public CompaniesOfFundSponsorValidationSteps(PageFactory thePageFactory) {
        companiesOfFundSponsorValidationPage = thePageFactory.newCompaniesOfFundSponsorValidationPage();
    }

    @Then("I verify company of fund sponsor selected '$strSideOption' is displayed")
    public void verifyCompanyOfDeveloper(@Named("strSideOption") String strSideOption) throws Exception {
        companiesOfFundSponsorValidationPage.companyOfFundSponsorIsDisplayed(2,strSideOption);
    }

    @Then("I verify company of fund sponsor selected '$strSideSearch' is not displayed")
    public void companyOfFundSponsorNotDisplayed(@Named("strSideSearch") String strSideSearch) throws Exception {
        companiesOfFundSponsorValidationPage.companyOfFundSponsorNotDisplayed(2, strSideSearch);

    }

    @Then("I verify '$strCompanyName' company name is displayed in fund sponsor search")
    public void verifyProjectNameDebtLoan(@Named("strCompanyName") String strCompanyName){
        companiesOfFundSponsorValidationPage.verifyCompanyNameIsDisplayed(strCompanyName);
    }

    @Then("I verify '$strCompanyName' company name is not displayed in fund sponsor search")
    public void verifyCompanyNameOfDebtLoan(@Named("strCompanyName") String strCompanyName){
        companiesOfFundSponsorValidationPage.verifyCompanyNameIsNotDisplayed(strCompanyName);
    }

    @When("I select brokers and intermediary in route to sponsor method")
    public void selectSecondOption(){
        companiesOfFundSponsorValidationPage.selectSecondOption();
    }

    @Then("I verify company name of fund sponsor is not displayed")
    public void companyOfFundSponsorIsNotDisplayed(){
        Assert.assertTrue("The Searched String is found in the List",companiesOfFundSponsorValidationPage.companyOfFundSponsorIsNotDisplayed(1));
    }

    @Then("I verify fund sponsor company name of all search option is displayed")
    public void fundSponsorOfAllSearch() throws Exception {
       companiesOfFundSponsorValidationPage.fundSponsorOfAllSearch(1);
    }

    @When("I select health care and hotel option in fund sponsor search")
    public void selectHealthAndHotel(){
        companiesOfFundSponsorValidationPage.selectHealthAndHotel();
    }

    @When("I clear health care and hotel option in fund sponsor search")
    public void clearHealthAndHotel(){
        companiesOfFundSponsorValidationPage.clearHealthAndHotel();
    }

    @When("I select value add and core plus in risk profile")
    public void selectValueAddAndCorePlus(){
        companiesOfFundSponsorValidationPage.selectValueAddAndCorePlus();
    }

    @When("I clear value add and core plus options")
    public void clearValueAddAndCorePlus(){
        companiesOfFundSponsorValidationPage.clearValueAddAndCorePlus();
    }

    @When("I clear land bank and lease up options")
    public void clearLandBankAndLeaseUp(){
        companiesOfFundSponsorValidationPage.clearLandBankAndLeaseUp();
    }

    @When("I clear route to sponsor option in fund sponsor search")
    public void clearRouteInFundSponsor(){
        companiesOfFundSponsorValidationPage.clearRouteInFundSponsor();
    }
}
