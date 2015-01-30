package test.steps;


import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import test.pages.PageFactory;
import test.pages.ProjectOfInvestmentDirectIntoValidationPage;

public class ProjectOfInvestmentDirectIntoValidationSteps {
    private final ProjectOfInvestmentDirectIntoValidationPage projectOfInvestmentDirectIntoValidationPage;

    @Inject
    public ProjectOfInvestmentDirectIntoValidationSteps(PageFactory thePageFactory) {
        projectOfInvestmentDirectIntoValidationPage = thePageFactory.newProjectOfInvestmentDirectIntoValidationPage();
    }

    @Then("I verify '$strProjectName' and '$strListingName' of investments is displayed")
    public void verifyProjectNameOfInvestmentIsDisplayed(@Named("strProjectName") String strProjectName,@Named("strListingName") String strListingName){
        projectOfInvestmentDirectIntoValidationPage.verifyProjectNameOfInvestmentsIsDisplayed(strProjectName, strListingName);
    }

    @Then("I verify '$strProject' and '$strListingProject' of investments is not displayed")
    public void  verifyProjectNameOfInvestmentNotDisplayed(@Named("strProject") String strProject,@Named("strListingProject") String strListingProject){
        projectOfInvestmentDirectIntoValidationPage.verifyProjectNameOfInvestmentsNotDisplayed(strProject, strListingProject);
    }

    @Then("I verify investments project name of '$strSideSearch' option is displayed")
    public void verifyProjectOfInvestmentsIsDisplayed(@Named("strSideSearch") String strSideSearch){
        projectOfInvestmentDirectIntoValidationPage.projectOfInvestmentsIsDisplayed(1, strSideSearch);
    }

    @Then("I verify investments listing name of '$strSideSearch' option is displayed")
    public void verifyListingOfInvestmentsIsDisplayed(@Named("strSideSearch") String strSideSearch){
        projectOfInvestmentDirectIntoValidationPage.projectOfInvestmentsIsDisplayed(2, strSideSearch);
    }

    @Then("I verify investments project name of '$strSideSearch' option is not displayed")
    public void projectOfInvestmentsNotDisplayed(@Named("strSideSearch") String strSideSearch){
        boolean status = projectOfInvestmentDirectIntoValidationPage.projectOfInvestmentsNotDisplayed(1, strSideSearch);
        Assert.assertTrue("The Searched String is found in the List", status);
    }

    @Then("I verify investments listing name of '$strSideSearch' option is not displayed")
    public void listingOfInvestmentsNotDisplayed(@Named("strSideSearch") String strSideSearch){
        boolean status = projectOfInvestmentDirectIntoValidationPage.projectOfInvestmentsNotDisplayed(2, strSideSearch);
        Assert.assertTrue("The Searched String is found in the List", status);
    }

    @When("I select value in investment amount slider field")
    public void selectInvestmentAmount(){
        projectOfInvestmentDirectIntoValidationPage.selectInvestmentAmount();
    }

    @When("I clear value in investment amount slider field")
    public void clearInvestmentAmount(){
        projectOfInvestmentDirectIntoValidationPage.clearInvestmentAmount();
    }

    @When("I select the value of deal size field")
    public void selectValueOfDealSize(){
        projectOfInvestmentDirectIntoValidationPage.selectValueOfDealSize();
    }

    @When("I clear the value of deal size field")
    public void clearValueOfDealSize(){
        projectOfInvestmentDirectIntoValidationPage.clearValueOfDealSize();
    }

    @When("I select general partner and limited partner option in investing as drop down field")
    public void selectGeneralAndLimited(){
        projectOfInvestmentDirectIntoValidationPage.selectGeneralAndLimited();
    }

    @When("I clear general partner and limited partner option in investing as drop down field")
    public void clearGeneralAndLimited(){
        projectOfInvestmentDirectIntoValidationPage.clearGeneralAndLimited();
    }

    @When("I select fully rented and reo option in current asset status field")
    public void selectFullyRentedAndReo(){
        projectOfInvestmentDirectIntoValidationPage.selectFullyRentedAndReo();
    }

    @When("I clear fully rented and reo option in current asset status field")
    public void clearFullyRentedAndReo(){
        projectOfInvestmentDirectIntoValidationPage.clearFullyRentedAndReo();
    }

    @When("I select COC percent value in return profile field of investment direct into")
    public void selectCOC_InvestmentDirectInto(){
        projectOfInvestmentDirectIntoValidationPage.selectCOC_InvestmentDirectInto();
    }

    @When("I clear COC percent value in return profile field of investment direct into")
    public void clearCOC_InvestmentDirectInto(){
        projectOfInvestmentDirectIntoValidationPage.clearCOC_InvestmentDirectInto();
    }

    @When("I select IRR percent in return profile of investment direct into")
    public void selectIRR_InvestmentDirectInto(){
        projectOfInvestmentDirectIntoValidationPage.selectIRR_InvestmentDirectInto();
    }

    @When("I clear IRR percent in return profile of investment direct into")
    public void clearIRR_InvestmentDirectInto(){
        projectOfInvestmentDirectIntoValidationPage.clearIRR_InvestmentDirectInto();
    }

    @When("I select ROE percent in return profile of investment direct into")
    public void selectROE_InvestmentDirectInto(){
        projectOfInvestmentDirectIntoValidationPage.selectROE_InvestmentDirectInto();
    }

    @When("I clear ROE percent in return profile of investment direct into")
    public void clearROE_InvestmentDirectInto(){
        projectOfInvestmentDirectIntoValidationPage.clearROE_InvestmentDirectInto();
    }

    @When("I select CAP percent in return profile of investment direct into")
    public void selectCAP_InvestmentDirectInto(){
        projectOfInvestmentDirectIntoValidationPage.selectCAP_InvestmentDirectInto();
    }

    @When("I clear CAP percent in return profile of investment direct into")
    public void clearCAP_InvestmentDirectInto(){
        projectOfInvestmentDirectIntoValidationPage.clearCAP_InvestmentDirectInto();
    }

    @When("I select holding min in return profile of investment direct into")
    public void selectMin_InvestmentDirectInto(){
        projectOfInvestmentDirectIntoValidationPage.selectMin_InvestmentDirectInto();
    }

    @When("I clear holding min in return profile of investment direct into")
    public void clearMin_InvestmentDirectInto(){
        projectOfInvestmentDirectIntoValidationPage.clearMin_InvestmentDirectInto();
    }

    @When("I select holding max in return profile of investment direct into")
    public void selectMax_InvestmentDirectInto(){
        projectOfInvestmentDirectIntoValidationPage.selectMax_InvestmentDirectInto();
    }

    @When("I clear holding max in return profile of investment direct into")
    public void clearMax_InvestmentDirectInto(){
        projectOfInvestmentDirectIntoValidationPage.clearMax_InvestmentDirectInto();
    }

    @When("I select COC percent value in return profile field")
    public void selectCOC(){
        projectOfInvestmentDirectIntoValidationPage.selectCOC();
    }

    @When("I clear COC percent value in return profile field")
    public void clearCOC(){
        projectOfInvestmentDirectIntoValidationPage.clearCOC();
    }

    @When("I select IRR percent in return profile")
    public void selectIRR(){
        projectOfInvestmentDirectIntoValidationPage.selectIRR();
    }

    @When("I clear IRR percent in return profile")
    public void clearIRR(){
        projectOfInvestmentDirectIntoValidationPage.clearIRR();
    }

    @When("I select ROE percent in return profile")
    public void selectROE(){
        projectOfInvestmentDirectIntoValidationPage.selectROE();
    }

    @When("I clear ROE percent in return profile")
    public void clearROE(){
        projectOfInvestmentDirectIntoValidationPage.clearROE();
    }

    @When("I select CAP percent in return profile")
    public void selectCAP(){
        projectOfInvestmentDirectIntoValidationPage.selectCAP();
    }

    @When("I clear CAP percent in return profile")
    public void clearCAP(){
        projectOfInvestmentDirectIntoValidationPage.clearCAP();
    }

    @When("I select holding min in return profile")
    public void selectMin(){
        projectOfInvestmentDirectIntoValidationPage.selectMin();
    }

    @When("I clear holding min in return profile")
    public void clearMin(){
        projectOfInvestmentDirectIntoValidationPage.clearMin();
    }

    @When("I select holding max in return profile")
    public void selectMax(){
        projectOfInvestmentDirectIntoValidationPage.selectMax();
    }

    @When("I clear holding max in return profile")
    public void clearMax(){
        projectOfInvestmentDirectIntoValidationPage.clearMax();
    }

    @When("I select co gp option in investing drop down")
    public void selectCoGpOption(){
        projectOfInvestmentDirectIntoValidationPage.selectCoGpOption();
    }

    @When("I select co lead option in investing drop down")
    public void selectCoLeadOption(){
        projectOfInvestmentDirectIntoValidationPage.selectCoLeadOption();
    }

    @When("I select co developer in investing drop down")
    public void selectCoDeveloper(){
        projectOfInvestmentDirectIntoValidationPage.selectCoDeveloper();
    }

    @When("I select other investor option in investing drop down")
    public void selectOtherInvestor(){
        projectOfInvestmentDirectIntoValidationPage.selectOtherInvestor();
    }

    @When("I select all option in investing drop down")
    public void selectAllOptionOfInvestingAs(){
        projectOfInvestmentDirectIntoValidationPage.selectAllOptionOfInvestingAs();
    }

    @When("I clear all option in investing drop down")
    public void clearAllOptionOfInvestingAs(){
        projectOfInvestmentDirectIntoValidationPage.clearAllOptionOfInvestingAs();
    }

    @When("I select partially stabilized option in current asset status field")
    public void selectPartiallyStabilized(){
        projectOfInvestmentDirectIntoValidationPage.selectPartiallyStabilized();
    }

    @When("I select vacant option in current asset status field")
    public void selectVacant(){
        projectOfInvestmentDirectIntoValidationPage.selectVacant();
    }

    @When("I select under construction option in current asset status field")
    public void selectUnderConstruction(){
        projectOfInvestmentDirectIntoValidationPage.selectUnderConstruction();
    }

    @When("I select all option in current asset status field")
    public void selectAll(){
        projectOfInvestmentDirectIntoValidationPage.selectAll();
    }

    @When("I select reo option in current asset status field")
    public void selectReo(){
        projectOfInvestmentDirectIntoValidationPage.selectReo();
    }

    @When("I select vacant structure option in current asset status field")
    public void selectVacantStructure(){
        projectOfInvestmentDirectIntoValidationPage.selectVacantStructure();
    }

    @When("I select partially rented option in current asset status field")
    public void selectPartiallyRented(){
        projectOfInvestmentDirectIntoValidationPage.selectPartiallyRented();
    }

    @When("I select entitled option in current asset status field")
    public void selectEntitled(){
        projectOfInvestmentDirectIntoValidationPage.selectEntitled();
    }

    @When("I clear entitled option in current asset status field")
    public void clearEntitled(){
        projectOfInvestmentDirectIntoValidationPage.clearEntitled();
    }

    @When("I click on geographical coverage field in investment search")
    public void clickGeographicalCoverage(){
        projectOfInvestmentDirectIntoValidationPage.clickGeographicalCoverage_Investment();
    }

    @When("I click on countries field in investment search")
    public void clickOnCountries(){
        projectOfInvestmentDirectIntoValidationPage.clickOnCountries_Investment();
    }

    @When("I select United States checkbox in countries field of investment search")
    public void selectUnitedStatesCheckBox(){
        projectOfInvestmentDirectIntoValidationPage.selectUnitedStatesCheckBox_Investment();
    }

    @When("I click on region field in investment search")
    public void clickRegionField(){
        projectOfInvestmentDirectIntoValidationPage.clickRegionField_Investment();
    }

    @When("I click on NorthEast region in investment search")
    public void clickNorthEast(){
        projectOfInvestmentDirectIntoValidationPage.clickNorthEast_Investment();
    }

    @When("I click on New Jersey state in investment search")
    public void clickNewJerseyState(){
        projectOfInvestmentDirectIntoValidationPage.clickNewJerseyState();
    }

    @When("I click on states field in investment search")
    public void clickStatesField(){
        projectOfInvestmentDirectIntoValidationPage.clickStatesField_Investment();
    }

    @When("I click on cities field in investment search")
    public void clickCitiesField(){
        projectOfInvestmentDirectIntoValidationPage.clickCitiesField_Investment();
    }

    @When("I enter and select Kearny city in investment search")
    public void enterAndSelectKearnyCity(){
        projectOfInvestmentDirectIntoValidationPage.enterAndSelectKearnyCity();
    }

}
