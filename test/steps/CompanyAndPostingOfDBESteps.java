package test.steps;

import com.google.inject.Inject;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import test.pages.CompanyAndPostingOfDBEPage;
import test.pages.PageFactory;

/**
 * Created with IntelliJ IDEA.
 * User: Bhavana
 * Date: 12/3/14
 * Time: 3:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class CompanyAndPostingOfDBESteps {
    private final CompanyAndPostingOfDBEPage companyAndPostingOfDBEPage;

    @Inject
    public CompanyAndPostingOfDBESteps(PageFactory thePageFactory) {
        companyAndPostingOfDBEPage = thePageFactory.newCompanyAndPostingOfDBEPage();
    }

    @Then("I verify 'Design Build & Engineering' is displayed in find of search option")
    public void verifyFindInSearchOptionOfDBE(){
        companyAndPostingOfDBEPage.verifyFindInSearchOptionOfDBE();
    }

    @Then("I verify '$lStrProvider' is displayed in provider of search option")
    public void verifyProviderInSearchOptionOfDBE(@Named("lStrProvider") String lStrProvider){
        companyAndPostingOfDBEPage.verifyProviderInSearchOptionOfDBE(lStrProvider);
    }

    @Then("I verify 'Designer' is displayed in provider of search option")
    public void verifyProviderAsDesignerInSearchOptionOfDBE(){
        companyAndPostingOfDBEPage.verifyProviderAsDesignerInSearchOptionOfDBE();
    }

    @When("I click on service drop down field")
    public void selectServiceDropDownField(){
        companyAndPostingOfDBEPage.selectServiceDropDownField();
    }

    @When("I select architectural design option in service drop down field")
    public void selectArchitecturalDesignOption(){
        companyAndPostingOfDBEPage.selectArchitecturalDesignOption();
    }

    @When("I clear architectural design option in service drop down field")
    public void clearArchitecturalDesignOption(){
        companyAndPostingOfDBEPage.clearArchitecturalDesignOption();
    }

    @When("I click on asset focus drop down")
    public void clickAssetFocusDropDown(){
        companyAndPostingOfDBEPage.clickAssetFocusDropDown();
    }

    @When("I select office option in asset focus drop down")
    public void selectOfficeOptionInAssetFocus(){
        companyAndPostingOfDBEPage.selectOfficeOptionInAssetFocus();
    }

    @When("I clear office option in asset focus drop down")
    public void clearOfficeOptionInAssetFocus(){
        companyAndPostingOfDBEPage.clearOfficeOptionInAssetFocus();
    }

    @When("I click on engagement stage drop down")
    public void clickEngagementStageDropDown(){
        companyAndPostingOfDBEPage.clickEngagementStageDropDown();
    }

    @When("I select planning option in engagement stage drop down field")
    public void selectPlanningOptionInEngagementStageField(){
        companyAndPostingOfDBEPage.selectPlanningOptionInEngagementStageField();
    }

    @When("I clear planning option in engagement stage drop down field")
    public void clearPlanningOptionInEngagementStageField(){
        companyAndPostingOfDBEPage.clearPlanningOptionInEngagementStageField();
    }

    @When("I set the value for project size field in DBE search")
    public void setValueOfProjectSizeInDBESearch(){
        companyAndPostingOfDBEPage.setValueOfProjectSizeInDBESearch();
    }

    @When("I clear the value for project size field in DBE search")
    public void clearValueOfProjectSizeInDBESearch(){
        companyAndPostingOfDBEPage.clearValueOfProjectSizeInDBESearch();
    }

    @When("I set the value for year in business field in DBE search")
    public void setValueOfYearInBusinessInDBESearch(){
        companyAndPostingOfDBEPage.setValueOfYearInBusinessInDBESearch();
    }

    @When("I clear the value for year in business field in DBE search")
    public void clearValueOfYearInBusinessDBESearch(){
        companyAndPostingOfDBEPage.clearValueOfYearInBusinessDBESearch();
    }

    @When("I set the value for average project value field in DBE search")
    public void setValueOfAverageProjectValueInDBESearch(){
        companyAndPostingOfDBEPage.setValueOfAverageProjectValueInDBESearch();
    }

    @When("I clear the value for average project value field in DBE search")
    public void clearValueOfAverageProjectValueInDBESearch(){
        companyAndPostingOfDBEPage.clearValueOfAverageProjectValueInDBESearch();
    }

    @Then("I verify '$strCompanyName' is displayed in search result of DBE search")
    public void verifyCompanyNameInDBESearch(@Named("strCompanyName") String strCompanyName){
        companyAndPostingOfDBEPage.verifyCompanyNameInDBESearch(strCompanyName);
    }

    @Then("I verify '$strCompanyName' is not displayed in search result of DBE search")
    public void verifyCompanyNameIsNotDisplayedInDBESearch(@Named("strCompanyName") String strCompanyName){
        companyAndPostingOfDBEPage.verifyCompanyNameIsNotDisplayedInDBESearch(strCompanyName);
    }

    @Then("I verify '$strPostingName' posting is displayed in search result of DBE search")
    public void verifyPostingNameIsDisplayedInDBESearch(@Named("strPostingName") String strPostingName){
        companyAndPostingOfDBEPage.verifyPostingNameIsDisplayedInDBESearch(strPostingName);
    }

    @Then("I verify '$strPostingName' posting is not displayed in search result of DBE search")
    public void verifyPostingNameIsNotDisplayedInDBESearch(@Named("strPostingName") String strPostingName){
        companyAndPostingOfDBEPage.verifyPostingNameIsNotDisplayedInDBESearch(strPostingName);
    }

    @Then("I verify 'Contractor' is displayed in provider of search option")
    public void verifyProviderAsContractorInSearchOptionOfDBE(){
        companyAndPostingOfDBEPage.verifyProviderAsContractorInSearchOptionOfDBE();
    }

    @When("I select solar option in asset focus drop down")
    public void selectSolarOptionInAssetFocus(){
        companyAndPostingOfDBEPage.selectSolarOptionInAssetFocus();
    }

    @When("I clear solar option in asset focus drop down")
    public void clearSolarOptionInAssetFocus(){
        companyAndPostingOfDBEPage.clearSolarOptionInAssetFocus();
    }

    @When("I select design option in engagement stage drop down field")
    public void selectDesignOptionInEngagementStageField(){
        companyAndPostingOfDBEPage.selectDesignOptionInEngagementStageField();
    }

    @When("I clear design option in engagement stage drop down field")
    public void clearDesignOptionInEngagementStageField(){
        companyAndPostingOfDBEPage.clearDesignOptionInEngagementStageField();
    }

    @Then("I verify 'Sub Contractor' is displayed in provider of search option")
    public void verifyProviderAsSubContractorInSearchOptionOfDBE(){
        companyAndPostingOfDBEPage.verifyProviderAsSubContractorInSearchOptionOfDBE();
    }

    @When("I select construction and development option in service drop down")
    public void selectConstructionAndDevelopmentOptionInService(){
        companyAndPostingOfDBEPage.selectConstructionAndDevelopmentOptionInService();
    }

    @When("I clear construction and development option in service drop down")
    public void clearConstructionAndDevelopmentOptionInService(){
        companyAndPostingOfDBEPage.clearConstructionAndDevelopmentOptionInService();
    }

    @When("I select solid waste facilities option in service drop down field")
    public void selectSolidWasteFacilitiesOption(){
        companyAndPostingOfDBEPage.selectSolidWasteFacilitiesOption();
    }

    @When("I clear solid waste facilities option in service drop down field")
    public void clearSolidWasteFacilitiesOption(){
        companyAndPostingOfDBEPage.clearSolidWasteFacilitiesOption();
    }

    @When("I select decommissioning and closure option in service drop down field")
    public void selectDecommissioningAndClosureOptionInService(){
        companyAndPostingOfDBEPage.selectDecommissioningAndClosureOptionInService();
    }

    @When("I clear decommissioning and closure option in service drop down field")
    public void clearDecommissioningAndClosureOptionInService(){
        companyAndPostingOfDBEPage.clearDecommissioningAndClosureOptionInService();
    }

    @When("I select cogeneration option in service drop down field")
    public void selectCogenerationOption(){
        companyAndPostingOfDBEPage.selectCogenerationOption();
    }

    @When("I clear cogeneration option in service drop down field")
    public void clearCogenerationOption(){
        companyAndPostingOfDBEPage.clearCogenerationOption();
    }

    @When("I set value of average project value field in DBE search")
    public void setValueOfAverageProjectValueFieldInDBESearch(){
        companyAndPostingOfDBEPage.setValueOfAverageProjectValueFieldInDBESearch();
    }

    @When("I clear value of average project value field in DBE search")
    public void clearValueOfAverageProjectValueFieldInDBESearch(){
        companyAndPostingOfDBEPage.clearValueOfAverageProjectValueFieldInDBESearch();
    }

    @When("I select lighting option in service drop down field")
    public void selectLightingOption(){
        companyAndPostingOfDBEPage.selectLightingOption();
    }

    @When("I clear lighting option in service drop down field")
    public void clearLightingOption(){
        companyAndPostingOfDBEPage.clearLightingOption();
    }

    @When("I select energy conservation option in service drop down field")
    public void selectEnergyConservationOption(){
        companyAndPostingOfDBEPage.selectEnergyConservationOption();
    }

    @When("I clear energy conservation option in service drop down field")
    public void clearEnergyConservationOption(){
        companyAndPostingOfDBEPage.clearEnergyConservationOption();
    }

    @When("I select foundation design option in service drop down field")
    public void selectFoundationDesignOption(){
        companyAndPostingOfDBEPage.selectFoundationDesignOption();
    }

    @When("I clear foundation design option in service drop down field")
    public void clearFoundationDesignOption(){
        companyAndPostingOfDBEPage.clearFoundationDesignOption();
    }

    @When("I select corporate safety option in service drop down")
    public void selectCorporateSafetyOptionInService(){
        companyAndPostingOfDBEPage.selectCorporateSafetyOptionInService();
    }

    @When("I clear corporate safety option in service drop down")
    public void clearCorporateSafetyOptionInService(){
        companyAndPostingOfDBEPage.clearCorporateSafetyOptionInService();
    }
}
