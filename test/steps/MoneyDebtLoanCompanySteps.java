package test.steps;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import test.pages.MoneyDebtLoanCompanyPage;
import test.pages.PageFactory;

public class MoneyDebtLoanCompanySteps {
    private final MoneyDebtLoanCompanyPage moneyDebtLoanCompanyPage;

    @Inject
    public MoneyDebtLoanCompanySteps(PageFactory thePageFactory) {
        moneyDebtLoanCompanyPage = thePageFactory.newMoneyDebtLoanCompanyPage();
    }

    @Then("I should see 'Money' in find of money search")
    public void verifyFindInMoneyDebtLoan(){
        moneyDebtLoanCompanyPage.verifyFindInMoneyDebtLoan(1);
    }

    @Then("I should see 'Land Loan' in loan of money debt loan search")
    public void verifyLoanInMoneyDebtLoan(){
        moneyDebtLoanCompanyPage.verifyLoanInMoneyDebtLoan(1);
    }

    @Then("I verify '$strCompanyNameDebtLoan' company name is displayed in money debt loan search")
        @Alias("I verify '$strCompanyNameOfMoneyDebt' company name is displayed in money debt hard money search")
    public void verifyCompanyNameDebtLoan(@Named("strCompanyNameDebtLoan") String strCompanyNameDebtLoan){
        moneyDebtLoanCompanyPage.verifyCompanyNameDebtLoan(strCompanyNameDebtLoan);
    }

    @Then("I verify '$strCompanyName' company name is not displayed in money debt loan search")
    public void verifyCompanyNameDebtLoanIsNotDisplayed(@Named("strCompanyName") String strCompanyName){
        moneyDebtLoanCompanyPage.verifyCompanyNameDebtLoanIsNotDisplayed(strCompanyName);
    }

    @When("I set the value in loan amount field")
    public void setLoanAmount(){
        moneyDebtLoanCompanyPage.setLoanAmount();
    }

    @When("I clear the value in loan amount field")
    public void clearLoanAmount(){
        moneyDebtLoanCompanyPage.clearLoanAmount();
    }

    @When("I set the value in term field")
    public void setTerm(){
        moneyDebtLoanCompanyPage.setTerm();
    }

    @When("I clear the value in term field")
    public void clearTerm(){
        moneyDebtLoanCompanyPage.clearTerm();
    }

    @When("I select insurance company option in lender profile")
    public void selectInsuranceCompany(){
        moneyDebtLoanCompanyPage.selectInsuranceCompany();
    }

    @When("I clear insurance company option in lender profile")
    public void clearInsuranceCompany(){
        moneyDebtLoanCompanyPage.clearInsuranceCompany();
    }

    @When("I click on route to lender in lender characteristics field")
    public void clickRouteToLender(){
        moneyDebtLoanCompanyPage.clickRouteToLender();
    }

    /*@When("I click route to lender field in lender characteristics")
    public void clickRouteToLenderField(){
        moneyDebtLoanCompanyPage.clickRouteToLenderField();
    }*/

    @When("I select brokers in route to lender field")
    public void selectBrokerOption(){
        moneyDebtLoanCompanyPage.selectBrokerOption();
    }

    @When("I clear brokers in route to lender field")
    public void clearBrokerOption(){
        moneyDebtLoanCompanyPage.clearBrokerOption();
    }

    @When("I set the value of LTV field")
    public void setLTVField(){
        moneyDebtLoanCompanyPage.setLTVField();
    }

    @When("I clear the value of LTV field")
    public void clearLTVField(){
        moneyDebtLoanCompanyPage.clearLTVField();
    }

    @When("I click on platform build option in asset strategy")
    public void clickPlatformBuild(){
        moneyDebtLoanCompanyPage.clickPlatformBuild();
    }

    @When("I clear on platform build option in asset strategy")
    public void clearPlatformBuild(){
        moneyDebtLoanCompanyPage.clearPlatformBuild();
    }

    @When("I click on New York state")
    public void clickNewYorkState(){
        moneyDebtLoanCompanyPage.clickNewYorkState();
    }

    @When("I enter and select Buffalo city")
    public void enterAndSelectBuffaloCity(){
        moneyDebtLoanCompanyPage.enterAndSelectBuffaloCity();
    }
}
