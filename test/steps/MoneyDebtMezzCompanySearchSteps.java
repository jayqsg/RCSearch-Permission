package test.steps;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import test.pages.MoneyDebtMezzCompanySearchPage;
import test.pages.PageFactory;

public class MoneyDebtMezzCompanySearchSteps {
    private final MoneyDebtMezzCompanySearchPage moneyDebtMezzCompanySearchPage;

    @Inject
    public MoneyDebtMezzCompanySearchSteps(PageFactory thePageFactory) {
        moneyDebtMezzCompanySearchPage= thePageFactory.newMoneyDebtMezzCompanySearchPage();
    }

    @Then("I verify '$strCompanyName' company name is displayed in money debt mezz search")
    public void verifyCompanyNameDebtMezz(@Named("strCompanyName") String strCompanyName){
        moneyDebtMezzCompanySearchPage.verifyCompanyNameDebtMezz(strCompanyName);
    }

    @Then("I verify '$strCompanyName' company name is not displayed in money debt mezz search")
    public void verifyCompanyNameDebtMezzNotDisplayed(@Named("strCompanyName") String strCompanyName){
        moneyDebtMezzCompanySearchPage.verifyCompanyNameDebtMezzNotDisplayed(strCompanyName);
    }

    @When("I enter and select Mason city")
    public void enterAndSelectMasonCity(){
        moneyDebtMezzCompanySearchPage.enterAndSelectMasonCity();
    }
}
