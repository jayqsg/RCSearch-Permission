package test.steps;


import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import test.pages.MoneyDebtMezzProjectValidationPage;
import test.pages.PageFactory;

public class MoneyDebtMezzProjectValidationSteps {

    private final MoneyDebtMezzProjectValidationPage moneyDebtMezzProjectValidationPage;

    @Inject
    public MoneyDebtMezzProjectValidationSteps(PageFactory thePageFactory) {
        moneyDebtMezzProjectValidationPage= thePageFactory.newMoneyDebtMezzProjectValidationPage();
    }

    @Then("I verify '$strProjectName' project name is not displayed in money debt mezz search")
    public void verifyProjectNameDebtMezzNotDisplayed(@Named("strProjectName") String strProjectName){
        moneyDebtMezzProjectValidationPage.verifyProjectNameDebtMezzNotDisplayed(strProjectName);
    }

    @When("I set value in mezz amount field")
    public void setValueOfMezzAmount(){
        moneyDebtMezzProjectValidationPage.setValueOfMezzAmount();
    }

    @When("I clear value in mezz amount field")
    public void clearValueOfMezzAmount(){
        moneyDebtMezzProjectValidationPage.clearValueOfMezzAmount();
    }

    @When("I set value of equity field")
    public void setEquity(){
        moneyDebtMezzProjectValidationPage.setValueOfEquity();
    }

    @When("I clear value of equity field")
    public void clearEquity(){
        moneyDebtMezzProjectValidationPage.clearValueOfEquity();
    }

    @When("I set value of debt field")
    public void setDebt(){
        moneyDebtMezzProjectValidationPage.setValueOfDebt();
    }

    @When("I clear value of debt field")
    public void clearDebt(){
        moneyDebtMezzProjectValidationPage.clearValueOfDebt();
    }

    @When("I set value for the term field")
    public void setTerm(){
        moneyDebtMezzProjectValidationPage.setValueOfTerm();
    }

    @When("I clear value for the term field")
    public void clearTerm(){
        moneyDebtMezzProjectValidationPage.clearValueOfTerm();
    }

    @When("I set value of interest rate field")
    public void setInterestRate(){
        moneyDebtMezzProjectValidationPage.setValueOfInterestRate();
    }

    @When("I clear value of interest rate field")
    public void clearInterestRate(){
        moneyDebtMezzProjectValidationPage.clearValueOfInterestRate();
    }




}
