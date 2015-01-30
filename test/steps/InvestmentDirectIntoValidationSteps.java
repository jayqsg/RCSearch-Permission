package test.steps;


import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import test.pages.InvestmentDirectIntoValidationPage;
import test.pages.PageFactory;

public class InvestmentDirectIntoValidationSteps {

    private final InvestmentDirectIntoValidationPage investmentDirectIntoValidationPage;

    @Inject
    public InvestmentDirectIntoValidationSteps(PageFactory thePageFactory) {
        investmentDirectIntoValidationPage = thePageFactory.newInvestmentDirectIntoValidationPage();
    }

    @Then("I verify project of '$strAssetType' banker is not displayed")
    public void otherProject(@Named("$strAssetType") String strSideSearch){
       boolean status = investmentDirectIntoValidationPage.otherProject(1,strSideSearch);
       Assert.assertTrue("The Searched String is found in the List", status);
    }

    @Then("I verify listing of '$strAssetType' banker is not displayed")
    public void otherListing(@Named("$strAssetType") String strSideSearch){
        boolean status = investmentDirectIntoValidationPage.otherListing(2, strSideSearch);
        Assert.assertTrue("The Searched String is found in the List",status);
    }

    @Then("I verify project of '$strAssetType' banker is displayed")
    public void verifyProject(@Named("strSideSearch") String strSideSearch){
        investmentDirectIntoValidationPage.verifyProject(1, strSideSearch);
    }

    @Then("I verify listing of '$strSideSearch' banker is displayed")
    public void verifyListing(@Named("strSideSearch") String strSideSearch){
        investmentDirectIntoValidationPage.verifyListing(2, strSideSearch);
    }

    @When("I select mixed use asset type in investment banker")
    public void selectMixedUse(){
        investmentDirectIntoValidationPage.selectMixedUse();
    }

    @When("I clear mixed use asset type in investment banker")
    public void clearMixedUse(){
        investmentDirectIntoValidationPage.clearMixedUse();
    }

    @When("I select rezones/change of use project in strategy type")
    public void clickRezonesChange(){
        investmentDirectIntoValidationPage.clickRezonesChange();
    }

    @When("I clear rezones/changes of use projects of strategy field")
    public void clearRezonesChange(){
        investmentDirectIntoValidationPage.clearRezonesChange();
    }

    @When("I click on hard money equity type")
    public void clickHardMoney(){
        investmentDirectIntoValidationPage.clickHardMoney();
    }

    @When("I clear hard money equity type")
    public void clearHardMoney(){
        investmentDirectIntoValidationPage.clearHardMoney();
    }

    @When("I click on ready for purchase option in deal stage")
    public void clickReadyForPurchase(){
        investmentDirectIntoValidationPage.clickReadyForPurchase();
    }

    @When("I clear ready for purchase option in deal stage")
    public void clearReadyForPurchase(){
        investmentDirectIntoValidationPage.clearReadyForPurchase();
    }

    @When("I select co-gp option in investment structure")
    public void clickCoGp(){
        investmentDirectIntoValidationPage.clickCoGp();
    }

    @When("I clear co-gp option in investment structure")
    public void clearCoGp(){
        investmentDirectIntoValidationPage.clearCoGp();
    }

    @When("I enter deal size of user")
    public void enterDealSizeUser(){
        investmentDirectIntoValidationPage.enterDealSizeUser(2);
    }

    @When("I enter deal size range")
    public void enterDealSizeRange(){
        investmentDirectIntoValidationPage.enterDealSizeRange(3);
    }

    @Then("I should not see project of investment banker")
    public void verifyCompanyNameOfBanker(){
        boolean status = investmentDirectIntoValidationPage.verifyProject(1);
        Assert.assertTrue("The Searched String is found in the List",status);
    }

    @Then("I should not see listing of investment banker")
    public void verifyProjectOfBanker(){
        boolean status = investmentDirectIntoValidationPage.verifyListing(1);
        Assert.assertTrue("The Searched String is found in the List",status);
    }

    @When("I enter investment amount field")
    public void enterInvestmentsAmount(){
        investmentDirectIntoValidationPage.enterInvestmentsAmount(2);
    }

    @When("I enter investment amount text boxes")
    public void enterInvestmentAmountField(){
        investmentDirectIntoValidationPage.enterInvestmentAmountField(3);
    }

    @When("I enter value for Cash On Cash")
    public void enterValueForCashOnCash(){
        investmentDirectIntoValidationPage.enterValueForCashOnCash(2);
    }

    @When("I enter values for Cash On Cash")
    public void enterValuesForCashOnCash(){
        investmentDirectIntoValidationPage.enterValuesForCashOnCash(3);
    }

    @When("I enter value for capital return IRR")
    public void enterCapitalReturnIrr(){
        investmentDirectIntoValidationPage.enterCapitalReturnIrr(2);
    }

    @When("I enter values for capital return IRR")
    public void enterCapitalReturnIRR(){
        investmentDirectIntoValidationPage.enterCapitalReturnIRR(3);
    }

    @When("I enter values for fields of capital return from '$intNum' row")
    public void enterROE(@Named("$intNum") int intNum){
        investmentDirectIntoValidationPage.enterCapitalReturnsROE(intNum);
    }

    @When("I enter CAP field values from '$intNum' row")
    public void enterCAP(@Named("$intNum") int intNum){
        investmentDirectIntoValidationPage.enterCAP(intNum);
    }

    @When("I enter values for holding min field from '$intNum' row")
    public void enterHoldingMin(@Named("$intNum") int intNum){
        investmentDirectIntoValidationPage.enterHoldingMin(intNum);
    }

    @When("I enter fields of holding max from '$intNum' row")
    public void enterHoldingMax(@Named("$intNum") int intNum){
        investmentDirectIntoValidationPage.enterHoldingMax(intNum);
    }
}
