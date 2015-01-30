package test.steps;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import test.pages.MoneyDebtMezzProjectSearchPage;
import test.pages.PageFactory;

public class MoneyDebtMezzProjectSearchSteps {
    private final MoneyDebtMezzProjectSearchPage moneyDebtMezzProjectSearchPage;

    @Inject
    public MoneyDebtMezzProjectSearchSteps(PageFactory thePageFactory) {
        moneyDebtMezzProjectSearchPage= thePageFactory.newMoneyDebtMezzProjectSearchPage ();
    }

    @Then("I should see 'Money' in find of search option")
    public void verifyFindInSearchOptionOfMoney() {
        moneyDebtMezzProjectSearchPage.verifyFindInSearchOptionOfMoney(1);
    }

    @Then("I should see 'Core' in risk of search option")
    public void verifyRiskInSearchOptionOfMoney() {
        moneyDebtMezzProjectSearchPage.verifyRiskInSearchOptionOfMoney(1);
    }

    @Then("I verify '$strProjectName' project name is displayed in money debt mezz search")
    public void verifyProjectNameDebtMezz(@Named("strProjectName") String strProjectName){
        moneyDebtMezzProjectSearchPage.verifyProjectNameDebtMezz(strProjectName);
    }

    @When("I set value of mezz amount")
    public void setMezzAmount(){
        moneyDebtMezzProjectSearchPage.setMezzAmount();
    }

    @When("I clear value of mezz amount")
    public void clearMezzAmount(){
        moneyDebtMezzProjectSearchPage.clearMezzAmount();
    }

    @When("I set value of equity")
    public void setEquity(){
        moneyDebtMezzProjectSearchPage.setEquity();
    }

    @When("I clear value of equity")
    public void clearEquity(){
        moneyDebtMezzProjectSearchPage.clearEquity();
    }

    @When("I set value of debt")
    public void setDebt(){
        moneyDebtMezzProjectSearchPage.setDebt();
    }

    @When("I clear value of debt")
    public void clearDebt(){
        moneyDebtMezzProjectSearchPage.clearDebt();
    }

    @When("I set value of term")
    public void setTerm(){
        moneyDebtMezzProjectSearchPage.setTerm();
    }

    @When("I clear value of term")
    public void clearTerm(){
        moneyDebtMezzProjectSearchPage.clearTerm();
    }

    @When("I set value of interest rate")
    public void setInterestRate(){
        moneyDebtMezzProjectSearchPage.setInterestRate();
    }

    @When("I clear value of interest rate")
    public void clearInterestRate(){
        moneyDebtMezzProjectSearchPage.clearInterestRate();
    }

    @When("I select quick flip option in asset strategy")
    public void selectQuickFlip(){
        moneyDebtMezzProjectSearchPage.selectQuickFlip();
    }

    @When("I clear quick flip option in asset strategy")
    public void clearQuickFlip(){
        moneyDebtMezzProjectSearchPage.selectQuickFlip();
    }

    @When("I click on collateral drop down")
    public void clickCollateral(){
        moneyDebtMezzProjectSearchPage.clickCollateral();
    }

    @When("I select cross collateralized option in collateral field")
    public void selectCrossCollateralized(){
        moneyDebtMezzProjectSearchPage.selectCrossCollateralized();
    }

    @When("I clear cross collateralized option in collateral field")
    public void clearCrossCollateralized(){
        moneyDebtMezzProjectSearchPage.selectCrossCollateralized();
    }

    @When("I click on asset types field")
    public void clickAssetTypes(){
        moneyDebtMezzProjectSearchPage.clickAssetTypes();
    }

    @When("I select retail option in asset types field")
    public void selectRetailOption(){
        moneyDebtMezzProjectSearchPage.selectRetailOption();
    }

    @When("I clear retail option in asset types field")
    public void clearRetailOption(){
        moneyDebtMezzProjectSearchPage.selectRetailOption();
    }

    @When("I select value add option in risk profile")
    public void selectValueAdd(){
        moneyDebtMezzProjectSearchPage.selectValueAdd();
    }

    @When("I clear value add option in risk profile")
    public void clearValueAdd(){
        moneyDebtMezzProjectSearchPage.selectValueAdd();
    }

    @When("I select plans approved or entitled option in deal stage")
    public void selectPlansApproved(){
        moneyDebtMezzProjectSearchPage.selectPlansApproved();
    }

    @When("I clear plans approved or entitled option in deal stage")
    public void clearPlansApproved(){
        moneyDebtMezzProjectSearchPage.selectPlansApproved();
    }

    @When("I select REO option in current asset status field")
    public void selectREOOption(){
        moneyDebtMezzProjectSearchPage.selectREOOption();
    }

    @When("I clear REO option in current asset status field")
    public void clearREOOption(){
        moneyDebtMezzProjectSearchPage.selectREOOption();
    }

    @When("I select bank option in lender characteristics")
    public void selectBank(){
        moneyDebtMezzProjectSearchPage.selectBank();
    }

    @When("I clear bank option in lender characteristics")
    public void clearBank(){
        moneyDebtMezzProjectSearchPage.selectBank();
    }


}
