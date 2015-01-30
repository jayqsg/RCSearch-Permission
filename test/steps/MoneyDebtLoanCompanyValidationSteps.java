package test.steps;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import test.pages.MoneyDebtLoanCompanyValidationPage;
import test.pages.PageFactory;

public class MoneyDebtLoanCompanyValidationSteps {
    private final MoneyDebtLoanCompanyValidationPage moneyDebtLoanCompanyValidationPage;

    @Inject
    public MoneyDebtLoanCompanyValidationSteps(PageFactory thePageFactory) {
        moneyDebtLoanCompanyValidationPage = thePageFactory.newMoneyDebtLoanCompanyValidationPage();
    }

   /* @Then("I verify '$strCompanyNamOfeDebtLoan' company name is not displayed in money debt loan search")
    public void verifyCompanyNameOfDebtLoan(@Named("strCompanyNameOfDebtLoan") String strCompanyNameOfDebtLoan){
        moneyDebtLoanCompanyValidationPage.verifyCompanyNameOfDebtLoan(strCompanyNameOfDebtLoan);
    }*/

    @Then("I verify company name of '$strSideSearch' option in money debt loan search is displayed")
    public void verifyCompanyOfDealSponsor(@Named("strSideSearch") String strSideSearch){
        moneyDebtLoanCompanyValidationPage.companyNameOfDebtLoanIsDisplayed(2, strSideSearch);
    }

    @Then("I verify company name of '$strSideSearch' option in money debt loan search is not displayed")
    public void companyNameOfDebtLoanNotDisplayed(@Named("strSideSearch") String strSideSearch){
       moneyDebtLoanCompanyValidationPage.companyNameOfDebtLoanNotDisplayed(2,strSideSearch);

    }

    @When("I set the value in loan amount")
    public void setValueInLoanAmount(){
        moneyDebtLoanCompanyValidationPage.setValueInLoanAmount();
    }

    @When("I clear the value in loan amount")
    public void clearValueInLoanAmount(){
        moneyDebtLoanCompanyValidationPage.clearValueInLoanAmount();
    }

    @When("I set value in term field")
    public void setTermValue(){
        moneyDebtLoanCompanyValidationPage.setTermValue();
    }

    @When("I clear value in term field")
    public void clearTermValue(){
        moneyDebtLoanCompanyValidationPage.clearTermValue();
    }

    @When("I select insurance company and family office option in lender profile")
    public void selectInsuranceCompanyAndFamilyOffice(){
        moneyDebtLoanCompanyValidationPage.selectInsuranceCompanyAndFamilyOffice();
    }

    @When("I clear insurance company and family office option in lender profile")
    public void clearInsuranceCompanyAndFamilyOffice(){
        moneyDebtLoanCompanyValidationPage.clearInsuranceCompanyAndFamilyOffice();
    }

    @When("I select brokers and placement agents in route to lender field")
    public void selectBrokersAndPlacementAgents(){
        moneyDebtLoanCompanyValidationPage.selectBrokersAndPlacementAgents();
    }

    @When("I clear brokers and placement agents in route to lender field")
    public void clearBrokersAndPlacementAgents(){
        moneyDebtLoanCompanyValidationPage.clearBrokersAndPlacementAgents();
    }

    /*@When("I select any option in lender profile")
    public void selectAnyOption(){
        moneyDebtLoanCompanyValidationPage.selectAnyOption();
    }*/

    @When("I select mezz fund option in lender profile")
    public void selectMezzFund(){
        moneyDebtLoanCompanyValidationPage.selectMezzFund();
    }

    @When("I select institution option in lender profile")
    public void selectInstitution(){
        moneyDebtLoanCompanyValidationPage.selectInstitution();
    }

    @When("I select foundation option in lender profile")
    public void selectFoundation(){
        moneyDebtLoanCompanyValidationPage.selectFoundation();
    }

    @When("I select corporate investor option in lender profile")
    public void selectCorporateInvestor(){
        moneyDebtLoanCompanyValidationPage.selectCorporateInvestor();
    }

    @When("I select investment bank option in lender profile")
    public void selectInvestmentBank(){
        moneyDebtLoanCompanyValidationPage.selectInvestmentBank();
    }

    @When("I select pension fund option in lender profile")
    public void selectPensionFund(){
        moneyDebtLoanCompanyValidationPage.selectPensionFund();
    }

    @When("I select sovereign wealth fund option in lender profile")
    public void selectSovereignWealth(){
        moneyDebtLoanCompanyValidationPage.selectSovereignWealth();
    }

    @When("I select bank option in lender profile")
    public void selectBank(){
        moneyDebtLoanCompanyValidationPage.selectBank();
    }

    @When("I select private lender option in lender profile")
    public void selectPrivateLender(){
        moneyDebtLoanCompanyValidationPage.selectPrivateLender();
    }

    @When("I select individual option in lender profile")
    public void selectIndividual(){
        moneyDebtLoanCompanyValidationPage.selectIndividual();
    }
    @When("I select RE fund option in lender profile")
    public void selectREFund(){
        moneyDebtLoanCompanyValidationPage.selectREFund();
    }

    @When("I select government agency option in lender profile")
    public void selectGovernmentAgency(){
        moneyDebtLoanCompanyValidationPage.selectGovernmentAgency();
    }

    @When("I select insurance company option in lender profile field")
    public void selectInsuranceCompany_lender(){
        moneyDebtLoanCompanyValidationPage.selectInsuranceCompany_lender();
    }

    @When("I select private equity fund option in lender profile")
    public void selectPrivateEquity(){
        moneyDebtLoanCompanyValidationPage.selectPrivateEquity();
    }

    @When("I select endowment fund option in lender profile")
    public void selectEndowment(){
        moneyDebtLoanCompanyValidationPage.selectEndowment();
    }

    @When("I select all option in lender profile")
    public void selectAllOptionInLoan(){
        moneyDebtLoanCompanyValidationPage.selectAllOptionInLoan();
    }

    @When("I clear all option in lender profile")
    public void clearAllOptionInLoan(){
        moneyDebtLoanCompanyValidationPage.clearAllOptionInLoan();
    }

    @When("I select direct only option in route to lender")
    public void selectDirectOnlyOptionInRouteToLender(){
        moneyDebtLoanCompanyValidationPage.selectDirectOnlyOption();
    }

    @When("I select intermediary option in route to lender")
    public void selectIntermediaryInRouteToLender(){
        moneyDebtLoanCompanyValidationPage.selectIntermediaryOption();
    }

    @When("I select broker option in route to lender")
    public void selectBrokerInRouteToLender(){
        moneyDebtLoanCompanyValidationPage.selectBrokerOption();
    }

    @When("I select placement agent in route to lender")
    public void selectPlacementAgentInRouteToLender(){
        moneyDebtLoanCompanyValidationPage.selectPlacementAgentInRouteToLender();
    }

    @When("I select all option in route to lender")
    public void selectAllInRouteToLender(){
        moneyDebtLoanCompanyValidationPage.selectAllInRouteToLender();
    }

    @When("I clear all option in route to lender")
    public void clearAllInRouteToLender(){
       moneyDebtLoanCompanyValidationPage.clearAllInRouteToLender();
    }

}
