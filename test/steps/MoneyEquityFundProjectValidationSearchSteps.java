package test.steps;


import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import test.pages.MoneyEquityFundProjectValidationSearchPage;
import test.pages.PageFactory;

public class MoneyEquityFundProjectValidationSearchSteps {
    private final MoneyEquityFundProjectValidationSearchPage moneyEquityFundProjectValidationSearchPage;

    @Inject
    public MoneyEquityFundProjectValidationSearchSteps(PageFactory thePageFactory) {
        moneyEquityFundProjectValidationSearchPage= thePageFactory.newMoneyEquityFundProjectValidationSearchPage();
    }

    @Then("I verify '$strProjectName' project of investor is not displayed")
    @Alias("I verify '$strProjectName' project of deal sponsor is not displayed")
    public void verifyCompanyNameDebtLoan(@Named("strProjectName") String strProjectName){
        moneyEquityFundProjectValidationSearchPage.verifyProjectNameOfEquityFundNotDisplayed(strProjectName);
    }

    @When("I set the value for fund term field")
    public void setValueForFundTerm(){
        moneyEquityFundProjectValidationSearchPage.setValueForFundTerm();
    }

    @When("I clear the value for fund term field")
    public void clearValueForFundTerm(){
        moneyEquityFundProjectValidationSearchPage.clearValueForFundTerm();
    }

    @When("I select general partner and other investor option in investment status")
    public void selectGeneralPartnerAndOtherInvestor(){
        moneyEquityFundProjectValidationSearchPage.selectGeneralPartnerAndOtherInvestor();
    }

    @When("I clear general partner and other investor option in investment status")
    public void clearGeneralPartnerAndOtherInvestor(){
        moneyEquityFundProjectValidationSearchPage.clearGeneralPartnerAndOtherInvestor();
    }

    @When("I select limited partner option in investment status")
    public void selectLimitedPartner(){
        moneyEquityFundProjectValidationSearchPage.selectLimitedPartner();
    }

    @When("I select co GP option in investment status")
    public void selectCoGP(){
        moneyEquityFundProjectValidationSearchPage.selectCoGP();
    }

    @When("I select co developer option in investment status")
    public void selectCoDeveloper(){
        moneyEquityFundProjectValidationSearchPage.selectCoDeveloper();
    }

    @When("I select co lead option in investment status")
    public void selectCoLead(){
        moneyEquityFundProjectValidationSearchPage.selectCoLead();
    }

    @When("I clear co lead option in investment status")
    public void clearCoLead(){
        moneyEquityFundProjectValidationSearchPage.clearCoLead();
    }

    @When("I select direct only and placement agent option in route to investor")
    public void selectDirectOnlyAndPlacementAgent(){
        moneyEquityFundProjectValidationSearchPage.selectDirectOnlyAndPlacementAgent();
    }

    @When("I clear direct only and placement agent option in route to investor")
    public void clearDirectOnlyAndPlacementAgent(){
        moneyEquityFundProjectValidationSearchPage.clearDirectOnlyAndPlacementAgent();
    }

    @When("I select intermediary option in route to investor")
    public void selectIntermediary(){
        moneyEquityFundProjectValidationSearchPage.selectIntermediary();
    }

    @When("I select brokers option in route to investor")
    public void selectBrokers(){
        moneyEquityFundProjectValidationSearchPage.selectBrokers();
    }

    @When("I clear brokers option in route to investor")
    public void clearBrokers(){
        moneyEquityFundProjectValidationSearchPage.clearBrokers();
    }

    @When("I select placement agent option in route to investor")
    public void selectPlacementAgent_Money(){
        moneyEquityFundProjectValidationSearchPage.selectPlacementAgent_Money();
    }

    @When("I clear placement agent option in route to investor")
    public void clearPlacementAgent_Money(){
        moneyEquityFundProjectValidationSearchPage.clearPlacementAgent_Money();
    }

    @When("I select all option in route to investor")
    public void selectAllOption_Money(){
        moneyEquityFundProjectValidationSearchPage.selectAllOption_Money();
    }

    @When("I clear all option in route to investor")
    public void clearAllOption_Money(){
        moneyEquityFundProjectValidationSearchPage.clearAllOption_Money();
    }

}
