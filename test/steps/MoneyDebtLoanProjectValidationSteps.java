package test.steps;


import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import test.pages.MoneyDebtLoanProjectValidationPage;
import test.pages.PageFactory;

public class MoneyDebtLoanProjectValidationSteps {
    private final MoneyDebtLoanProjectValidationPage moneyDebtLoanProjectValidationPage;

    @Inject
    public MoneyDebtLoanProjectValidationSteps(PageFactory thePageFactory) {
        moneyDebtLoanProjectValidationPage = thePageFactory.newMoneyDebtLoanProjectValidationPage();
    }

    @Then("I verify '$strProjectNameOfDebtLoan' project name is not displayed in money debt loan search")
    public void verifyCompanyNameOfDebtLoan(@Named("strProjectNameOfDebtLoan") String strProjectNameOfDebtLoan){
        moneyDebtLoanProjectValidationPage.verifyProjectNameOfDebtLoanNotDisplayed(strProjectNameOfDebtLoan);
    }

    @Then("I verify project name of '$strSideSearch' option is displayed")
     public void verifyCompanyOfDealSponsor(@Named("strSideSearch") String strSideSearch){
        moneyDebtLoanProjectValidationPage.projectNameIsDisplayed(1, strSideSearch);
    }

    @Then("I verify project name of '$strSideSearch' option is not displayed")
    public void companyNotDisplayed(@Named("strSideSearch") String strSideSearch){
        moneyDebtLoanProjectValidationPage.projectNameNotDisplayed(1,strSideSearch);
    }

    @When("I set asset or build value field")
    public void setAssetBuildValue(){
        moneyDebtLoanProjectValidationPage.setAssetBuildValue();
    }

    @When("I clear asset or build value field")
    public void clearAssetBuildValue(){
        moneyDebtLoanProjectValidationPage.clearAssetBuildValue();
    }

    @When("I select interest only and fixed rate option in interest field")
    public void selectInterestOnlyAndFixedRate(){
        moneyDebtLoanProjectValidationPage.selectInterestOnlyAndFixedRate();
    }

    @When("I clear interest only and fixed rate option in interest field")
    public void clearInterestOnlyAndFixedRate(){
        moneyDebtLoanProjectValidationPage.clearInterestOnlyAndFixedRate();
    }

    @When("I set value for interest rate field")
    public void setValueOfInterestRate(){
        moneyDebtLoanProjectValidationPage.setValueOfInterestRate();
    }

    @When("I clear value for interest rate field")
    public void clearValueOfInterestRate(){
        moneyDebtLoanProjectValidationPage.clearValueOfInterestRate();
    }

    @When("I select recourse option")
    public void clickRecourse(){
        moneyDebtLoanProjectValidationPage.clickRecourse();
    }

    @When("I select the asset and cd option in collateral field")
    public void selectTheAssetAndCd(){
        moneyDebtLoanProjectValidationPage.selectTheAssetAndCd();
    }

    @When("I clear the asset and cd option in collateral field")
    public void clearTheAssetAndCd(){
        moneyDebtLoanProjectValidationPage.clearTheAssetAndCd();
    }

    @When("I select commercial and industrial option in asset type field")
    public void selectCommercialAndIndustrial(){
        moneyDebtLoanProjectValidationPage.selectCommercialAndIndustrial();
    }

    @When("I clear commercial and industrial option in asset type field")
    public void clearCommercialAndIndustrial(){
        moneyDebtLoanProjectValidationPage.clearCommercialAndIndustrial();
    }

    @When("I select development and opportunistic option in risk profile field")
    public void selectDevelopmentAndOpportunistic(){
        moneyDebtLoanProjectValidationPage.selectDevelopmentAndOpportunistic();
    }

    @When("I clear development and opportunistic option in risk profile field")
    public void clearDevelopmentAndOpportunistic(){
        moneyDebtLoanProjectValidationPage.clearDevelopmentAndOpportunistic();
    }

    @When("I select concept and under contract option in deal stage field")
    @Alias("I select under contract option in deal stage field")
    public void selectConceptAndUnderContract(){
        moneyDebtLoanProjectValidationPage.selectConceptAndUnderContract();
    }

    @When("I clear under contract option in deal stage field")
    public void clearUnderContract(){
        moneyDebtLoanProjectValidationPage.clearUnderContract();
    }

    @When("I clear concept and under contract option in deal stage field")
    public void clearConceptAndUnderContract(){
        moneyDebtLoanProjectValidationPage.clearConceptAndUnderContract();
    }

    @When("I select fixed rate option in interest field")
    public void selectInterest(){
        moneyDebtLoanProjectValidationPage.selectFixedRate();
    }

    @When("I select floating rate option in interest field")
    public void selectFloatingRate(){
        moneyDebtLoanProjectValidationPage.selectFloatingRate();
    }

    @When("I select PIK option in interest field")
    public void selectPIK(){
        moneyDebtLoanProjectValidationPage.selectPIK();
    }

    @When("I clear PIK option in interest field")
    public void clearPIK(){
        moneyDebtLoanProjectValidationPage.clearPIK();
    }

    @When("I set value for LVT slider")
    public void setValueOfLVT(){
        moneyDebtLoanProjectValidationPage.setValueOfLVT();
    }

    @When("I clear value for LVT slider")
    public void clearValueOfLVT(){
        moneyDebtLoanProjectValidationPage.clearValueOfLVT();
    }

    @When("I set value of term field in money search")
    public void setValueOfTermField(){
        moneyDebtLoanProjectValidationPage.setValueOfTermField();
    }

    @When("I clear value of term field in money search")
    public void clearValueOfTermField(){
        moneyDebtLoanProjectValidationPage.clearValueOfTermField();
    }
}
