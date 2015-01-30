package test.steps;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import test.pages.MoneyEquityFundCompanyValidationSearchPage;
import test.pages.PageFactory;

public class MoneyEquityFundCompanyValidationSearchSteps {
    private final MoneyEquityFundCompanyValidationSearchPage moneyEquityFundCompanyValidationSearchPage;

    @Inject
    public MoneyEquityFundCompanyValidationSearchSteps(PageFactory thePageFactory) {
        moneyEquityFundCompanyValidationSearchPage= thePageFactory.newMoneyEquityFundCompanyValidationSearchPage();
    }

    @Then("I verify '$strCompanyNameMoneyFund' company name in money fund search is not displayed")
    public void verifyCompanyNameDebtLoan(@Named("strCompanyNameMoneyFund") String strCompanyNameMoneyFund){
        moneyEquityFundCompanyValidationSearchPage.verifyCompanyNameNotDisplayedMoneyFund(strCompanyNameMoneyFund);
    }

    @When("I select office and solar option in asset type drop down list")
    public void selectOfficeAndSolar(){
        moneyEquityFundCompanyValidationSearchPage.selectOfficeAndSolar();
    }

    @When("I clear office and solar option in asset type drop down list")
    public void clearOfficeAndSolar(){
        moneyEquityFundCompanyValidationSearchPage.clearOfficeAndSolar();
    }

    @When("I scroll for asset strategy visibility")
    public void scroll(){
        moneyEquityFundCompanyValidationSearchPage.scroll();
    }

    @When("I click on 'Asset Strategy' drop down")
    public void clickAssetStrategyField(){
        moneyEquityFundCompanyValidationSearchPage.clickAssetStrategyField();
    }

    @When("I select special servicer and advisor option in investor type drop down")
    public void selectAdvisorAndSpecialServicer(){
        moneyEquityFundCompanyValidationSearchPage.selectAdvisorAndSpecialServicer();
    }

    @When("I clear special servicer and advisor option in investor type drop down")
    public void clearAdvisorAndSpecialServicer(){
        moneyEquityFundCompanyValidationSearchPage.clearAdvisorAndSpecialServicer();
    }

    @When("I select broker or intermediary option in investor type drop down")
     public void selectBrokerOrIntermediary(){
        moneyEquityFundCompanyValidationSearchPage.selectBrokerOrIntermediary();
    }

    @When("I select consultant option in investor type drop down")
    public void selectConsultant(){
        moneyEquityFundCompanyValidationSearchPage.selectConsultant();
    }

    @When("I select EB5 program option in investor type drop down")
    public void selectEB5Program(){
        moneyEquityFundCompanyValidationSearchPage.selectEB5Program();
    }

    @When("I select family office option in investor type drop down")
    public void selectFamilyOffice(){
        moneyEquityFundCompanyValidationSearchPage.selectFamilyOffice();
    }

    @When("I select fund of funds option in investor type drop down")
    public void selectFundOfFunds(){
        moneyEquityFundCompanyValidationSearchPage.selectFundOfFunds();
    }

    @When("I select hedge fund option in investor type drop down")
    public void selectHedgeFund(){
        moneyEquityFundCompanyValidationSearchPage.selectHedgeFund();
    }

    @When("I select individual investor option in investor type drop down")
    public void selectIndividualInvestor(){
        moneyEquityFundCompanyValidationSearchPage.selectIndividualInvestor();
    }

    @When("I select investment manager option in investor type drop down")
    public void selectInvestmentManager(){
        moneyEquityFundCompanyValidationSearchPage.selectInvestmentManager();
    }

    @When("I select NCREIF style trust or fund option in investor type drop down")
    public void selectNCREIFStyleTrust(){
        moneyEquityFundCompanyValidationSearchPage.selectNCREIFStyleTrust();
    }

    @When("I select owner operator option in investor type drop down")
    public void selectOwnerOperator(){
        moneyEquityFundCompanyValidationSearchPage.selectOwnerOperator();
    }

    @When("I select private equity real estate fund option in investor type drop down")
    public void selectPrivateEquityRealEstateFund(){
        moneyEquityFundCompanyValidationSearchPage.selectPrivateEquityRealEstateFund();
    }

    @When("I select public REIT option in investor type drop down")
    public void selectPublicREIT(){
        moneyEquityFundCompanyValidationSearchPage.selectPublicREIT();
    }

    @When("I select sovereign wealth fund option in investor type drop down")
    public void selectSovereignWealthFund(){
        moneyEquityFundCompanyValidationSearchPage.selectSovereignWealthFund();
    }

    @When("I select bank option in investor type drop down")
    public void selectBank(){
        moneyEquityFundCompanyValidationSearchPage.selectBank();
    }

    @When("I select construction lender or purchaser option in investor type drop down")
    public void selectConstructionLender(){
        moneyEquityFundCompanyValidationSearchPage.selectConstructionLender();
    }

    @When("I select crowd funding platform option in investor type drop down")
    public void selectCrowdFundingPlatform(){
        moneyEquityFundCompanyValidationSearchPage.selectCrowdFundingPlatform();
    }

    @When("I select endowment and foundation option in investor type drop down")
    public void selectEndowmentAndFoundation(){
        moneyEquityFundCompanyValidationSearchPage.selectEndowmentAndFoundation();
    }

    @When("I select fund option in investor type drop down")
    public void selectFund(){
        moneyEquityFundCompanyValidationSearchPage.selectFund();
    }

    @When("I select government agency option in investor type drop down")
    public void selectGovernmentAgency(){
        moneyEquityFundCompanyValidationSearchPage.selectGovernmentAgency();
    }

    @When("I select high net worth investor option in investor type drop down")
    public void selectHighNet(){
        moneyEquityFundCompanyValidationSearchPage.selectHighNet();
    }

    @When("I select insurance company option in investor type drop down")
    public void selectInsuranceCompany(){
        moneyEquityFundCompanyValidationSearchPage.selectInsuranceCompany();
    }

    @When("I select mezzanine option in investor type drop down")
    public void selectMezzanine(){
        moneyEquityFundCompanyValidationSearchPage.selectMezzanine();
    }

    @When("I select other institutional investor option in investor type drop down")
    public void selectOtherInstitutional(){
        moneyEquityFundCompanyValidationSearchPage.selectOtherInstitutional();
    }

    @When("I select pension fund option in investor type drop down")
    public void selectPensionFund(){
        moneyEquityFundCompanyValidationSearchPage.selectPensionFund();
    }

    @When("I select private REIT option in investor type drop down")
    public void selectPrivateREIT(){
        moneyEquityFundCompanyValidationSearchPage.selectPrivateREIT();
    }

    @When("I select senior lender option in investor type drop down")
    public void selectSeniorLender(){
        moneyEquityFundCompanyValidationSearchPage.selectSeniorLender();
    }

    @When("I select special servicer option in investor type drop down")
    public void selectSpecialServicer(){
        moneyEquityFundCompanyValidationSearchPage.selectSpecialServicer();
    }

    @When("I clear special servicer option in investor type drop down")
    public void clearSpecialServicer(){
        moneyEquityFundCompanyValidationSearchPage.clearSpecialServicer();
    }
}