package test.steps;

/**
 * Created with IntelliJ IDEA.
 * User: Bhavana
 * Date: 6/17/14
 * Time: 3:00 PM
 * To change this template use File | Settings | File Templates.
 */

import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import test.pages.MoneyDebtLoanProjectPage;
import test.pages.PageFactory;

public class MoneyDebtLoanProjectSteps {
    private final MoneyDebtLoanProjectPage moneyDebtLoanProjectPage;

    @Inject
    public MoneyDebtLoanProjectSteps(PageFactory thePageFactory) {
        moneyDebtLoanProjectPage = thePageFactory.newMoneyDebtLoanProjectPage();
    }

    @Then("I verify '$strProjectName' project name is displayed in money debt loan search")
    public void verifyProjectNameDebtLoan(@Named("strProjectName") String strProjectName){
        moneyDebtLoanProjectPage.verifyProjectNameDebtLoan(strProjectName);
    }

    @When("I set asset or build value")
    public void setAssetOrBuild(){
        moneyDebtLoanProjectPage.setAssetOrBuild();
    }

    @When("I clear asset or build value")
    public void clearAssetOrBuild(){
        moneyDebtLoanProjectPage.clearAssetOrBuild();
    }

    @When("I set LVT field")
    public void setLVT(){
        moneyDebtLoanProjectPage.setLVT();
    }

    @When("I clear LVT field")
    public void clearLVT(){
        moneyDebtLoanProjectPage.clearLVT();
    }

    @When("I click on interest field")
    public void clickOnInterest(){
        moneyDebtLoanProjectPage.clickOnInterest();
    }

    @When("I select interest only option in interest field")
    public void selectInterestOnlyOption(){
        moneyDebtLoanProjectPage.selectInterestOnlyOption();
    }

    @When("I clear interest only option in interest field")
    public void clearInterestOnlyOption(){
        moneyDebtLoanProjectPage.clearInterestOnlyOption();
    }

    @When("I set interest rate")
    public void setInterestRate(){
        moneyDebtLoanProjectPage.setInterestRate();
    }

    @When("I clear interest rate")
    public void clearInterestRate(){
        moneyDebtLoanProjectPage.clearInterestRate();
    }

    @When("I select non recourse option")
    public void selectNonRecourse(){
        moneyDebtLoanProjectPage.selectNonRecourse();
    }

    @When("I select any option")
    public void selectAny(){
        moneyDebtLoanProjectPage.selectAny();
    }

    @When("I click collateral field")
    public void clickCollateral(){
        moneyDebtLoanProjectPage.clickCollateral();
    }

    @When("I select the asset option in collateral field")
    public void selectTheAssetOption(){
        moneyDebtLoanProjectPage.selectTheAssetOption();
    }

    @When("I clear the asset option in collateral field")
    public void clearTheAssetOption(){
        moneyDebtLoanProjectPage.clearTheAssetOption();
    }

    @When("I check requires points in project field")
    public void checkRequiresPointsInProject(){
        moneyDebtLoanProjectPage.checkRequiresPointsInProject();
    }

    @When("I un check requires points in project field")
    public void unCheckRequiresPointsInProject(){
        moneyDebtLoanProjectPage.unCheckRequiresPointsInProject();
    }

    @When("I click loan for field")
    public void clickLoanForField(){
        moneyDebtLoanProjectPage.clickLoanForField();
    }

    @When("I click loan for field in money debt mezz search")
    public void clickLoanForFieldInDebtMezz(){
        moneyDebtLoanProjectPage.clickLoanForFieldInDebtMezz();
    }

    @When("I click asset types in loan for field")
    public void clickAssetTypes(){
        moneyDebtLoanProjectPage.clickAssetTypes();
    }

    @When("I select commercial option in asset type field")
    public void selectCommercialOption(){
        moneyDebtLoanProjectPage.selectCommercialOption();
    }

    @When("I clear commercial option in asset type field")
    public void clearCommercialOption(){
        moneyDebtLoanProjectPage.clearCommercialOption();
    }

    @When("I click risk profile in loan for field")
    public void clickRiskProfileField(){
        moneyDebtLoanProjectPage.clickRiskProfileField();
    }

    @When("I select development option in risk profile field")
     public void selectDevelopmentOption(){
        moneyDebtLoanProjectPage.selectDevelopmentOption();
    }

    @When("I clear development option in risk profile field")
    public void clearDevelopmentOption(){
        moneyDebtLoanProjectPage.clearDevelopmentOption();
    }

    @When("I click deal stage in loan for field")
    public void clickDealStageField(){
        moneyDebtLoanProjectPage.clickDealStageField();
    }

    @When("I select concept option in deal stage field")
    public void selectConceptOption(){
        moneyDebtLoanProjectPage.selectConceptOption();
    }

    @When("I clear concept option in deal stage field")
    public void clearConceptOption(){
        moneyDebtLoanProjectPage.clearConceptOption();
    }

    @When("I click current asset status in loan for field")
    public void clickCurrentAssetStatusField(){
        moneyDebtLoanProjectPage.clickCurrentAssetStatusField();
    }

    @When("I select partially rented option in current asset status")
    public void selectPartiallyRentedOption(){
        moneyDebtLoanProjectPage.selectPartiallyRentedOption();
    }

    @When("I clear partially rented option in current asset status")
    public void clearPartiallyRentedOption(){
        moneyDebtLoanProjectPage.clearPartiallyRentedOption();
    }

    @When("I click asset strategy in loan for field")
        @Alias("I click asset strategy field in money search")
    public void clickAssetStrategyField(){
        moneyDebtLoanProjectPage.clickAssetStrategyField();
    }

    @When("I select land bank option in asset strategy")
    public void selectLandBankOption(){
        moneyDebtLoanProjectPage.selectLandBankOption();
    }

    @When("I clear land bank option in asset strategy")
    public void clearLandBankOption(){
        moneyDebtLoanProjectPage.clearLandBankOption();
    }

    @When("I click on lender characteristics field")
    public void clickOnLenderCharacteristics(){
        moneyDebtLoanProjectPage.clickOnLenderCharacteristics();
    }

    @When("I click lender profile in lender characteristics field")
    public void clickLenderProfile(){
        moneyDebtLoanProjectPage.clickLenderProfile();
    }

    @When("I click on lender profile in lender characteristics field")
    public void clickOnLenderProfile(){
        moneyDebtLoanProjectPage.clickOnLenderProfile();
    }

    @When("I select mezz fund option in lender profile of lender characteristics field")
    public void selectMezzFund(){
        moneyDebtLoanProjectPage.selectMezzFund();
    }

    @When("I clear mezz fund option in lender profile")
    public void clearMezzFund(){
        moneyDebtLoanProjectPage.clearMezzFund();
    }

    @When("I select CD's option in collateral field")
    public void selectCDOption(){
        moneyDebtLoanProjectPage.selectCDOption();
    }

    @When("I select PG's option in collateral field")
    public void selectPGOption(){
        moneyDebtLoanProjectPage.selectPGOption();
    }

    @When("I select other option in collateral field")
    public void selectOtherOptionInCollateral(){
        moneyDebtLoanProjectPage.selectOtherOption();
    }

    @When("I select all option in collateral field")
    public void selectAllOptionInCollateral(){
        moneyDebtLoanProjectPage.selectAllOptionInCollateral();
    }

    @When("I clear all option in collateral field")
    public void clearAllOptionInCollateral(){
        moneyDebtLoanProjectPage.clearAllOptionInCollateral();
    }

    @When("I set value of pre-leased")
    public void setPreLeasedValue(){
        moneyDebtLoanProjectPage.setPreLeasedValue();
    }

    @When("I set value of pre-leased field")
    public void setPreLeasedValues(){
        moneyDebtLoanProjectPage.setPreLeasedValues();
    }

    @When("I clear value of pre-leased")
    public void clearPreLeasedValue(){
        moneyDebtLoanProjectPage.clearPreLeasedValue();
    }

    @When("I clear value of pre-leased field")
    public void clearPreLeasedValues(){
        moneyDebtLoanProjectPage.clearPreLeasedValues();
    }

    @When("I set value of pre-sold")
    public void setPreSoldValue(){
        moneyDebtLoanProjectPage.setPreSoldValue();
    }

    @When("I set value of pre-sold field")
    public void setPreSoldValues(){
        moneyDebtLoanProjectPage.setPreSoldValues();
    }

    @When("I clear value of pre-sold")
    public void clearPreSoldValue(){
        moneyDebtLoanProjectPage.clearPreSoldValue();
    }

    @When("I clear value of pre-sold field")
    public void clearPreSoldValues(){
        moneyDebtLoanProjectPage.clearPreSoldValues();
    }

    @When("I set value of LVT field")
    public void setLVTValue(){
        moneyDebtLoanProjectPage.setLVTValue();
    }

    @When("I clear value of LVT field")
    public void clearLVTValue(){
        moneyDebtLoanProjectPage.clearLVTValue();
    }

    @When("I set value of term field")
    public void setTermField(){
        moneyDebtLoanProjectPage.setTermField();
    }

    @When("I clear value of term field")
    public void clearTermField(){
        moneyDebtLoanProjectPage.clearTermField();
    }

    @When("I click on deal stage drop down field in money search")
    public void clickDealStage(){
        moneyDebtLoanProjectPage.clickDealStage_MoneySearch();
    }

    @When("I click on concept option in deal stage drop down of money search")
    public void clickConcept(){
        moneyDebtLoanProjectPage.clickConcept_MoneySearch();
    }

    @When("I click on permitted option in deal stage drop down of money search")
    public void clickPermitted(){
        moneyDebtLoanProjectPage.clickPermitted_MoneySearch();
    }

    @When("I click on ready for purchase option in deal stage drop down of money search")
    public void clickReady(){
        moneyDebtLoanProjectPage.clickReady_MoneySearch();
    }

    @When("I click on LOI option in deal stage drop down of money search")
    public void clickLOI(){
        moneyDebtLoanProjectPage.clickLOI_MoneySearch();
    }

    @When("I click on under contract option in deal stage drop down of money search")
    public void clickUnderContract(){
        moneyDebtLoanProjectPage.clickUnderContract_MoneySearch();
    }

    @When("I click on plans option in deal stage drop down of money search")
    public void clickPlans(){
        moneyDebtLoanProjectPage.clickPlans_MoneySearch();
    }

    @When("I click on under construction option in deal stage drop down of money search")
    public void clickUnderConstruction(){
        moneyDebtLoanProjectPage.clickUnderConstruction_MoneySearch();
    }

    @When("I click on pursuit option in deal stage drop down of money search")
    public void clickPursuit(){
        moneyDebtLoanProjectPage.clickPursuit_MoneySearch();
    }

    @When("I click on in DD option in deal stage drop down of money search")
    public void clickInDD(){
        moneyDebtLoanProjectPage.clickInDD_MoneySearch();
    }

    @When("I select all option in deal stage drop down of money search")
    public void selectAll_MoneySearch(){
        moneyDebtLoanProjectPage.selectAll_MoneySearch();
    }

    @When("I clear all field in deal stage of money search")
    public void clearAll_MoneySearch(){
        moneyDebtLoanProjectPage.clearAll_MoneySearch();
    }

    @When("I click on current asset status drop down field in money search")
    public void clickOnCurrentAssetStatus_Money(){
        moneyDebtLoanProjectPage.clickOnCurrentAssetStatus_Money();
    }

    @When("I select partially stabilized option in current asset status field of money search")
    public void selectPartiallyStabilized_Money(){
        moneyDebtLoanProjectPage.selectPartiallyStabilized_Money();
    }

    @When("I select vacant option in current asset status field of money search")
    public void selectVacant_Money(){
        moneyDebtLoanProjectPage.selectVacant_Money();
    }

    @When("I select under construction option in current asset status field of money search")
    public void selectUnderConstruction_Money(){
        moneyDebtLoanProjectPage.selectUnderConstruction_Money();
    }

    @When("I select all option in current asset status field of money search")
    public void selectAll_Money(){
        moneyDebtLoanProjectPage.selectAll_Money();
    }

    @When("I select reo option in current asset status field of money search")
    public void selectReo(){
        moneyDebtLoanProjectPage.selectReo_Money();
    }

    @When("I select vacant structure option in current asset status field of money search")
    public void selectVacantStructure(){
        moneyDebtLoanProjectPage.selectVacantStructure_Money();
    }

    @When("I select partially rented option in current asset status field of money search")
    public void selectPartiallyRented(){
        moneyDebtLoanProjectPage.selectPartiallyRented_Money();
    }

    @When("I clear entitled option in current asset status field of money search")
    public void clearEntitled(){
        moneyDebtLoanProjectPage.clearEntitled_Money();
    }

    @When("I select entitled option in current asset status field of money search")
    public void selectEntitled(){
        moneyDebtLoanProjectPage.selectEntitled_Money();
    }

}
