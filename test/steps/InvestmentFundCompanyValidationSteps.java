package test.steps;


import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import test.pages.InvestmentFundCompanyPage;
import test.pages.InvestmentFundCompanyValidationPage;
import test.pages.PageFactory;

public class InvestmentFundCompanyValidationSteps {
    private final InvestmentFundCompanyValidationPage investmentFundCompanyValidationPage;

    @Inject
    public InvestmentFundCompanyValidationSteps(PageFactory thePageFactory) {
        investmentFundCompanyValidationPage = thePageFactory.newInvestmentFundCompanyValidationPage();
    }

    @Then("I verify '$strCompanyName' company name of investments fund is displayed")
    public void verifyCompanyNameOfInvestmentIsDisplayed(@Named("strCompanyName") String strCompanyName){
        investmentFundCompanyValidationPage.verifyCompanyNameOfInvestmentsFundIsDisplayed(strCompanyName);
    }

    @Then("I verify '$strCompanyName' company name of investments fund is not displayed")
    public void  verifyCompanyNameOfInvestmentNotDisplayed(@Named("strCompanyName") String strCompanyName){
        investmentFundCompanyValidationPage.verifyCompanyNameOfInvestmentsFundNotDisplayed(strCompanyName);
    }

    /*@Then("I verify investments fund company name of '$strSideSearch' option is displayed")
    public void verifyCompanyOfDealSponsor(@Named("strSideSearch") String strSideSearch){
        investmentFundCompanyValidationPage.companyOfInvestmentsFundIsDisplayed(1, strSideSearch);
    }

    @Then("I verify investments fund company name of '$strSideSearch' option is not displayed")
    public void companyNotDisplayed(@Named("strSideSearch") String strSideSearch){
        boolean status = investmentFundCompanyValidationPage.companyOfInvestmentsFundNotDisplayed(1,strSideSearch);
        Assert.assertTrue("The Searched String is found in the List", status);
    }*/

    @When("I select co developer and other investor option in investing as drop down")
    public void selectCoDeveloperAndOtherInvestor(){
        investmentFundCompanyValidationPage.selectCoDeveloperAndOtherInvestor();
    }

    @When("I clear co developer and other investor option in investing as drop down")
    public void clearCoDeveloperAndOtherInvestor(){
        investmentFundCompanyValidationPage.clearCoDeveloperAndOtherInvestor();
    }

    @When("I select intermediary and placement agent option in route to investment field")
    public void selectIntermediaryAndPlacement(){
        investmentFundCompanyValidationPage.selectIntermediaryAndPlacement();
    }

    @When("I clear intermediary and placement agent option in route to investment field")
    public void clearIntermediaryAndPlacement(){
        investmentFundCompanyValidationPage.clearIntermediaryAndPlacement();
    }

    @When("I select solar and storage option of asset type")
    public void selectSolarAndStorage(){
        investmentFundCompanyValidationPage.selectSolarAndStorage();
    }

    @When("I clear solar and storage option of asset type")
    public void clearSolarAndStorage(){
        investmentFundCompanyValidationPage.clearSolarAndStorage();
    }

    @When("I select rezoning and recapitalization option in asset strategy")
    public void selectRezoningAndRecapitalization(){
        investmentFundCompanyValidationPage.selectRezoningAndRecapitalization();
    }

    @When("I clear rezoning and recapitalization option in asset strategy")
    public void clearRezoningAndRecapitalization(){
        investmentFundCompanyValidationPage.clearRezoningAndRecapitalization();
    }

    @When("I select core plus option in risk profile of investment fund search")
    public void selectCorePlus(){
        investmentFundCompanyValidationPage.selectCorePlus_Fund();
    }

    @When("I clear core plus option in risk profile of investment fund search")
    public void clearCorePlus(){
        investmentFundCompanyValidationPage.clearCorePlus_Fund();
    }
}
