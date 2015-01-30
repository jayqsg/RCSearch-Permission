package test.steps;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import test.pages.InvestmentFundProjectPage;
import test.pages.InvestmentFundProjectValidationPage;
import test.pages.PageFactory;

public class InvestmentFundProjectValidationSteps {
    private final InvestmentFundProjectValidationPage investmentFundProjectValidationPage;

    @Inject
    public InvestmentFundProjectValidationSteps(PageFactory thePageFactory) {
        investmentFundProjectValidationPage = thePageFactory.newInvestmentFundProjectValidationPage();
    }

    @Then("I verify '$strFundName' fund name of investor is displayed")
        @Alias("I verify fund name of deal sponsor '$strFundName' is displayed")
    public void verifyCompanyNameOfInvestmentIsDisplayed(@Named("strFundName") String strFundName){
        investmentFundProjectValidationPage.verifyCompanyNameOfInvestmentsFundIsDisplayed(strFundName);
    }

    @Then("I verify '$strFundName' fund name of investor is not displayed")
        @Alias("I verify fund name of deal sponsor '$strFundName' is not displayed")
    public void  verifyCompanyNameOfInvestmentNotDisplayed(@Named("strFundName") String strFundName){
        investmentFundProjectValidationPage.verifyCompanyNameOfInvestmentsFundNotDisplayed(strFundName);
    }

    @Then("I verify '$strDealSponsorFund' of investment fund is not displayed")
    public void  verifyFundOfInvestmentNotDisplayed(@Named("strDealSponsorFund") String strDealSponsorFund){
        investmentFundProjectValidationPage.verifyFundOfInvestmentsNotDisplayed(strDealSponsorFund);
    }

    @When("I set value for fund size field")
    public void setFundSize() {
        investmentFundProjectValidationPage.setFundSize();
    }

    @When("I clear value for fund size field")
    public void clearFundSize() {
        investmentFundProjectValidationPage.clearFundSize();
    }

    @When("I set the value of investment amount")
    public void setValueOfInvestmentAmount(){
        investmentFundProjectValidationPage.setValueOfInvestmentAmount();
    }

    @When("I clear the value of investment amount")
    public void clearValueOfInvestmentAmount(){
        investmentFundProjectValidationPage.clearValueOfInvestmentAmount();
    }

    @When("I select co developer and other investor option in investing as drop down field")
    public void selectCoDeveloperAndCoLead(){
        investmentFundProjectValidationPage.selectCoDeveloperAndOtherInvestor();
    }

    @When("I clear co developer and other investor option in investing as drop down field")
    public void clearCoDeveloperAndCoLead(){
        investmentFundProjectValidationPage.clearCoDeveloperAndOtherInvestor();
    }

    @When("I set values for manager experience field")
    public void setManagerExperienceField(){
        investmentFundProjectValidationPage.setManagerExperienceField();
    }

    @When("I clear values for manager experience field")
    public void clearManagerExperienceField(){
        investmentFundProjectValidationPage.clearManagerExperienceField();
    }

    @When("I set value for average returns over 1 year field")
    public void setAverageReturn1YearField(){
        investmentFundProjectValidationPage.setAverageReturn1YearField();
    }

    @When("I clear value for average returns over 1 year field")
    public void clearAverageReturn1YearField(){
        investmentFundProjectValidationPage.clearAverageReturn1YearField();
    }

    @When("I set value for average returns over 3 year field")
    public void setAverageReturnValue3YearField(){
        investmentFundProjectValidationPage.setAverageReturnValue3YearField();
    }

    @When("I clear value for average returns over 3 year field")
    public void clearAverageReturnValue3YearField(){
        investmentFundProjectValidationPage.clearAverageReturnValue3YearField();
    }

    @When("I set value for average returns over 5 year field")
    public void setAverageReturnValue5YearField(){
        investmentFundProjectValidationPage.setAverageReturnValue5YearField();
    }

    @When("I clear value for average returns over 5 year field")
    public void clearAverageReturnValue5YearField(){
        investmentFundProjectValidationPage.clearAverageReturnValue5YearField();
    }

    @When("I select limited partner option in investing as drop down field")
    public void selectLimitedPartner(){
        investmentFundProjectValidationPage.selectLimitedPartner();
    }

    @When("I select direct only option in route to investment field")
    public void selectDirectOnlyOption(){
        investmentFundProjectValidationPage.selectDirectOnlyOption();
    }

    @When("I select intermediary option in route to investment field")
    public void selectIntermediaryOption(){
        investmentFundProjectValidationPage.selectIntermediaryOption();
    }

    @When("I select broker option in route to investment field")
    public void selectBrokerOption(){
        investmentFundProjectValidationPage.selectBrokersOption();
    }

    @When("I select placement agent option in route to investment field")
    public void selectPlacementAgentOption(){
        investmentFundProjectValidationPage.selectPlacementAgentsOption();
    }

    @When("I select all option in route to investment field")
    public void selectAllOption(){
       investmentFundProjectValidationPage.selectAllOption();
    }

    @When("I clear all option in route to investment field")
    public void clearAllOption(){
        investmentFundProjectValidationPage.clearAllOption();
    }

}
