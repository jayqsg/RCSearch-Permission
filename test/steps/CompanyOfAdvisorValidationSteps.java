package test.steps;

import com.google.inject.Inject;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import test.pages.CompanyOfAdvisorValidationPage;
import test.pages.PageFactory;

public class CompanyOfAdvisorValidationSteps {
    private final CompanyOfAdvisorValidationPage companyOfAdvisorValidationPage;

    @Inject
    public CompanyOfAdvisorValidationSteps(PageFactory thePageFactory) {
        companyOfAdvisorValidationPage = thePageFactory.newCompanyOfAdvisorValidationPage();
    }

    @Then("I verify '$strCompanyNameIsDisplayed' company name of advisor is displayed")
    public void verifyCompanyNameOfAdvisorIsDisplayed(@Named("strCompanyName") String strCompanyName){
        companyOfAdvisorValidationPage.verifyCompanyNameOfAdvisorIsDisplayed(strCompanyName);
    }

    @Then("I verify '$strCompanyNameNotDisplayed' company name of advisor is not displayed")
    public void  verifyCompanyNameOfAdvisorNotDisplayed(@Named("strCompanyNameNotDisplayed") String strCompanyNameNotDisplayed){
        companyOfAdvisorValidationPage.verifyCompanyNameOfAdvisorNotDisplayed(strCompanyNameNotDisplayed);
    }

    @Then("I verify advisor company name of '$strSideSearch' is displayed")
    public void verifyCompanyOfDealSponsor(@Named("strSideSearch") String strSideSearch){
        companyOfAdvisorValidationPage.companyOfAdvisorIsDisplayed(2, strSideSearch);
    }

    @Then("I verify advisor company name of '$strSideSearch' is not displayed")
    public void companyNotDisplayed(@Named("strSideSearch") String strSideSearch){
        boolean status = companyOfAdvisorValidationPage.companyOfAdvisorNotDisplayed(2, strSideSearch);
        Assert.assertTrue("The Searched String is found in the List", status);
    }

    @Then("I verify company name of advisor selected all search option is displayed")
    public void verifyAllOptions(){
        companyOfAdvisorValidationPage.verifyAllOptionsOfAdvisorCompany(2);
    }

    @When("I select office and multi family option in asset experience drop down")
    public void selectOfficeAndMultifamily(){
       companyOfAdvisorValidationPage.selectOfficeAndMultifamily();
    }

    @When("I clear office and multi family options in asset experience drop down")
    public void clearOfficeAndMultifamily(){
        companyOfAdvisorValidationPage.clearOfficeAndMultifamily();
    }

    @When("I click on multi family option in asset")
    public void selectMultiFamilyOption(){
        companyOfAdvisorValidationPage.selectMultiFamilyOption();
    }

    @When("I click on hotel option in asset")
    public void clickHotel(){
        companyOfAdvisorValidationPage.clickHotel();
    }

    @When("I click on sports option in asset")
    public void clickSports(){
        companyOfAdvisorValidationPage.clickSports();
    }

    @When("I click on health option in asset")
    public void clickHealth(){
        companyOfAdvisorValidationPage.clickHealth();
    }

    @When("I click on storage option in asset")
    public void clickStorage(){
        companyOfAdvisorValidationPage.clickStorage();
    }

    @When("I click on asset other option in asset")
    public void clickAssetOther(){
        companyOfAdvisorValidationPage.clickAssetOther();
    }

    @When("I click on retail option in asset")
    public void clickRetail(){
        companyOfAdvisorValidationPage.clickRetail();
    }

    @When("I click on industrial option in asset")
    public void clickIndustrial(){
        companyOfAdvisorValidationPage.clickIndustrial();
    }

    @When("I click on residential option in asset")
    public void clickResidential(){
        companyOfAdvisorValidationPage.clickResidential();
    }

    @When("I click on single option in asset")
    public void clickSingle(){
        companyOfAdvisorValidationPage.clickSingle();
    }

    @When("I click on retirement option in asset")
    public void clickRetirement(){
        companyOfAdvisorValidationPage.clickRetirement();
    }

    @When("I click on student option in asset")
    public void clickStudent(){
        companyOfAdvisorValidationPage.clickStudent();
    }

    @When("I click on residential other option in asset")
    public void clickResidentialOther(){
        companyOfAdvisorValidationPage.clickResidentialOther();
    }

    @When("I click on residential multi option in asset")
    public void clickResidentialMulti(){
        companyOfAdvisorValidationPage.clickResidentialMulti();
    }

    @When("I clear residential field in asset option")
    public void clearResidential(){
        companyOfAdvisorValidationPage.clearResidential();
    }

    @When("I click on mixed option in asset")
    public void clickMixed(){
        companyOfAdvisorValidationPage.clickMixed();
    }

    @When("I click on commercial option in asset")
    public void clickCommercial(){
        companyOfAdvisorValidationPage.clickCommercial();
    }

    @When("I click on solar option in asset")
    public void clickSolar(){
        companyOfAdvisorValidationPage.clickSolar();
    }

    @When("I clear asset options in asset drop down field")
    public void clearAsset(){
        companyOfAdvisorValidationPage.clearAsset();
    }

    @When("I select owned and concept option in deal stage drop down")
    public void selectOwnedAndConceptOption(){
        companyOfAdvisorValidationPage.selectOwnedAndConceptOption();
    }

    @When("I clear owned and concept options in deal stage drop down")
    public void clearOwnedAndConceptOptions(){
        companyOfAdvisorValidationPage.clearOwnedAndConceptOptions();
    }

    @When("I click on concept option in deal stage")
    public void clickConcept(){
        companyOfAdvisorValidationPage.clickConcept();
    }

    @When("I click on permitted option in deal stage")
    public void clickPermitted(){
        companyOfAdvisorValidationPage.clickPermitted();
    }

    @When("I click on ready option in deal stage")
    public void clickReady(){
        companyOfAdvisorValidationPage.clickReady();
    }

    @When("I click on LOI option in deal stage")
    public void clickLOI(){
        companyOfAdvisorValidationPage.clickLOI();
    }

    @When("I click on under contract option in deal stage")
    public void clickUnderContract(){
        companyOfAdvisorValidationPage.clickUnderContract();
    }

    @When("I click on plans option in deal stage")
    public void clickPlans(){
        companyOfAdvisorValidationPage.clickPlans();
    }

    @When("I click on under construction option in deal stage")
    public void clickUnderConstruction(){
        companyOfAdvisorValidationPage.clickUnderConstruction();
    }

    @When("I click on pursuit option in deal stage")
    public void clickPursuit(){
        companyOfAdvisorValidationPage.clickPursuit();
    }

    @When("I click on in DD option in deal stage")
    public void clickInDD(){
        companyOfAdvisorValidationPage.clickInDD();
    }

    @When("I clear deal stage field")
    public void clearDealStage(){
        companyOfAdvisorValidationPage.clearDealStage();
    }

}
