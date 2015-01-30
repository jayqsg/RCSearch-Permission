package test.steps;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import test.pages.InvestmentDirectIntoCompanyValidationPage;
import test.pages.PageFactory;

public class InvestmentDirectIntoCompanyValidationSteps {
    private final InvestmentDirectIntoCompanyValidationPage investmentDirectIntoCompanyValidationPage;

    @Inject
    public InvestmentDirectIntoCompanyValidationSteps(PageFactory thePageFactory) {
        investmentDirectIntoCompanyValidationPage = thePageFactory.newInvestmentDirectIntoCompanyValidationPage();
    }

    @Then("I verify '$strCompanyName' company name of investments is displayed")
    public void verifyCompanyNameOfInvestmentIsDisplayed(@Named("strCompanyName") String strCompanyName){
        investmentDirectIntoCompanyValidationPage.verifyCompanyNameOfInvestmentsIsDisplayed(strCompanyName);
    }

    @Then("I verify '$strCompanyName' company name of investments is not displayed")
    public void  verifyCompanyNameOfInvestmentNotDisplayed(@Named("strCompanyName") String strCompanyName){
        investmentDirectIntoCompanyValidationPage.verifyCompanyNameOfInvestmentsNotDisplayed(strCompanyName);
    }

    @Then("I verify investments company name of '$strSideSearch' option is displayed")
    public void verifyCompanyOfDealSponsor(@Named("strSideSearch") String strSideSearch){
        investmentDirectIntoCompanyValidationPage.companyOfInvestmentsIsDisplayed(3, strSideSearch);
    }

    @Then("I verify investments company name of '$strSideSearch' option is not displayed")
    public void companyNotDisplayed(@Named("strSideSearch") String strSideSearch){
        investmentDirectIntoCompanyValidationPage.companyOfInvestmentsNotDisplayed(3,strSideSearch);

    }

    @When("I select advisor and family office option in investor type field")
    public void selectAdvisorAndFamilyOffice(){
        investmentDirectIntoCompanyValidationPage.selectAdvisorAndFamilyOffice();
    }

    @When("I clear advisor and family office option in investor type field")
    public void clearAdvisorAndFamilyOffice(){
        investmentDirectIntoCompanyValidationPage.clearAdvisorAndFamilyOffice();
    }

    @When("I select direct only and brokers option in route to sponsor drop down")
    public void selectDirectOnlyAndBrokers(){
        investmentDirectIntoCompanyValidationPage.selectDirectOnlyAndBrokers();
    }

    @When("I clear direct only and brokers option in route to sponsor drop down")
    public void clearDirectOnlyAndBrokers(){
        investmentDirectIntoCompanyValidationPage.clearDirectOnlyAndBrokers();
    }

    @When("I select office and mixed use option in asset type drop down")
    public void selectOfficeAndMixedUse(){
        investmentDirectIntoCompanyValidationPage.selectOfficeAndMixedUse();
    }

    @When("I clear office and mixed use option in asset type drop down")
    public void clearOfficeAndMixedUse(){
        investmentDirectIntoCompanyValidationPage.clearOfficeAndMixedUse();
    }

    @When("I select core plus option in risk profile")
    public void selectCorePlus(){
        investmentDirectIntoCompanyValidationPage.selectCorePlus();
    }

    @When("I clear core plus option in risk profile")
    public void clearCorePlus(){
        investmentDirectIntoCompanyValidationPage.clearCorePlus();
    }

    @When("I select owned and ready for purchase option in deal stage field")
    public void selectOwnedAndReadyForPurchase(){
        investmentDirectIntoCompanyValidationPage.selectOwnedAndReadyForPurchase();
    }

    @When("I clear owned and ready for purchase option in deal stage field")
    public void clearOwnedAndReadyForPurchase(){
        investmentDirectIntoCompanyValidationPage.clearOwnedAndReadyForPurchase();
    }

    @When("I select acquisition and sales leaseback option in asset strategy field")
    public void selectAcquisitionAndSales(){
        investmentDirectIntoCompanyValidationPage.selectAcquisitionAndSales();
    }

    @When("I clear acquisition and sales leaseback option in asset strategy field")
    public void clearAcquisitionAndSales(){
        investmentDirectIntoCompanyValidationPage.clearAcquisitionAndSales();
    }

    @When("I select intermediary option in route to sponsor")
    public void selectIntermediary(){
        investmentDirectIntoCompanyValidationPage.selectIntermediary();
    }

    @When("I select placement agent option in route to sponsor")
    public void selectPlacementAgent(){
        investmentDirectIntoCompanyValidationPage.selectPlacementAgent();
    }

    @When("I select all option in route to sponsor of investment search")
    public void selectAllOptionOfRouteToSponsor(){
        investmentDirectIntoCompanyValidationPage.selectAllOptionOfRouteToSponsor();
    }

    @When("I clear all option option in route to sponsor")
    public void clearPlacementAgent(){
        investmentDirectIntoCompanyValidationPage.clearAllOptionOfRouteToSponsor();
    }

    @When("I click on concept option in deal stage drop down")
    public void clickConcept(){
        investmentDirectIntoCompanyValidationPage.clickConcept();
    }

    @When("I click on permitted option in deal stage drop down")
    public void clickPermitted(){
        investmentDirectIntoCompanyValidationPage.clickPermitted();
    }

    @When("I click on ready for purchase option in deal stage drop down")
    public void clickReady(){
        investmentDirectIntoCompanyValidationPage.clickReady();
    }

    @When("I click on LOI option in deal stage drop down")
    public void clickLOI(){
        investmentDirectIntoCompanyValidationPage.clickLOI();
    }

    @When("I click on under contract option in deal stage drop down")
    public void clickUnderContract(){
        investmentDirectIntoCompanyValidationPage.clickUnderContract();
    }

    @When("I click on plans option in deal stage drop down")
    public void clickPlans(){
        investmentDirectIntoCompanyValidationPage.clickPlans();
    }

    @When("I click on under construction option in deal stage drop down")
    public void clickUnderConstruction(){
        investmentDirectIntoCompanyValidationPage.clickUnderConstruction();
    }

    @When("I click on pursuit option in deal stage drop down")
    public void clickPursuit(){
        investmentDirectIntoCompanyValidationPage.clickPursuit();
    }

    @When("I click on in DD option in deal stage drop down")
    public void clickInDD(){
        investmentDirectIntoCompanyValidationPage.clickInDD();
    }

    @When("I select all option in deal stage drop down")
    public void selectAll(){
        investmentDirectIntoCompanyValidationPage.selectAll();
    }

    @When("I clear all field in deal stage")
    public void clearDealStage(){
        investmentDirectIntoCompanyValidationPage.clearAll();
    }

    @When("I select the value for deal size")
    public void selectValueOfDealSize(){
        investmentDirectIntoCompanyValidationPage.selectValueOfDealSize();
    }

    @When("I clear the value for deal size")
    public void clearValueOfDealSize(){
        investmentDirectIntoCompanyValidationPage.clearValueOfDealSize();
    }

}
