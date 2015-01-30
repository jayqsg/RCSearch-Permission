package test.steps;


import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import test.pages.MoneyEquityFundCompanySearchPage;
import test.pages.PageFactory;

public class MoneyEquityFundCompanySearchSteps {

    private final MoneyEquityFundCompanySearchPage moneyEquityFundCompanySearchPage;

    @Inject
    public MoneyEquityFundCompanySearchSteps(PageFactory thePageFactory) {
        moneyEquityFundCompanySearchPage= thePageFactory.newMoneyEquityFundCompanySearchPage();
    }

    @Then("I should see 'Preferred Equity' in type of money search")
    public void verifyTypeInMoneySearch(){
        moneyEquityFundCompanySearchPage.verifyTypeInMoneySearch(1);
    }

    @Then("I should see 'Fund' in kind of money search")
    public void verifyKindInMoneySearch(){
        moneyEquityFundCompanySearchPage.verifyKindInMoneySearch(1);
    }

    @Then("I verify '$strCompanyNameMoneyFund' company name in money fund search is displayed")
    public void verifyCompanyNameDebtLoan(@Named("strCompanyNameMoneyFund") String strCompanyNameMoneyFund){
        moneyEquityFundCompanySearchPage.verifyCompanyNameMoneyFund(strCompanyNameMoneyFund);
    }

    @When("I click on investor characteristics field")
    public void clickInvestorCharacteristics(){
        moneyEquityFundCompanySearchPage.clickInvestorCharacteristics();
    }

    @When("I click on investor type field in investor characteristics")
    public void clickInvestorType(){
        moneyEquityFundCompanySearchPage.clickInvestorType();
    }

    @When("I select advisor option in investor type drop down")
    public void selectAdvisor(){
        moneyEquityFundCompanySearchPage.selectAdvisor();
    }

    @When("I clear advisor option in investor type drop down")
    public void clearAdvisor(){
        moneyEquityFundCompanySearchPage.selectAdvisor();
    }

    @When("I enter and select San Francisco city")
    public void enterAndSelectSanFranciscoCity(){
        moneyEquityFundCompanySearchPage.enterAndSelectSanFranciscoCity();
    }


}
