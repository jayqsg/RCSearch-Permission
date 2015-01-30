package test.steps;

import com.google.inject.Inject;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import test.pages.CompaniesOfDeveloperValidationPage;
import test.pages.PageFactory;

public class CompaniesOfDeveloperValidationSteps {

    private final CompaniesOfDeveloperValidationPage companiesOfDeveloperValidationPage;

    @Inject
    public CompaniesOfDeveloperValidationSteps(PageFactory thePageFactory) {
        companiesOfDeveloperValidationPage = thePageFactory.newCompaniesOfDeveloperValidationPage();
    }

    @Then("I verify developer company selected '$strSideSearch' option is displayed")
    public void verifyCompanyOfDealSponsor(@Named("strSideSearch") String strSideSearch){
        companiesOfDeveloperValidationPage.companyOfDeveloperIsDisplayed(2, strSideSearch);
    }

    @Then("I verify developer company selected '$strSideSearch' option is not displayed")
    public void companyNotDisplayed(@Named("strSideSearch") String strSideSearch){
        companiesOfDeveloperValidationPage.companyDeveloperNotDisplayed(strSideSearch);

    }

    @Then("I verify '$strCompanyName' company name is displayed in developers search")
    public void verifyCompanyNameIsDisplayed(@Named("strCompanyName") String strCompanyName){
        companiesOfDeveloperValidationPage.verifyCompanyNameIsDisplayed(strCompanyName);
    }

    @Then("I verify '$strCompanyName' company name is not displayed in developers search")
    public void verifyCompanyNameIsNotDisplayed(@Named("strCompanyName") String strCompanyName){
        companiesOfDeveloperValidationPage.verifyCompanyNameIsNotDisplayed(strCompanyName);
    }

    @When("I select placement agents and intermediary in route to sponsor field")
    public void selectOptionInRouteToSponsor(){
       companiesOfDeveloperValidationPage.selectOptionInRouteToSponsor();
    }

    @When("I clear options of route to sponsor")
    public void clearRouteSponsor(){
       companiesOfDeveloperValidationPage.clearRouteSponsor();
    }

    @Then("I verify developer company name of all search option is displayed")
    public void developerOfAllSearch(){
        companiesOfDeveloperValidationPage.developerOfAllSearch(1);
    }

    @When("I select solar and hotel option in developer search")
    public void selectSolarAndHotelOption(){
        companiesOfDeveloperValidationPage.selectSolarAndHotelOption();
    }

    @When("I clear options selected in asset type")
    public void clearAssetOptions(){
        companiesOfDeveloperValidationPage.clearAssetOptions();
    }

    @When("I select opportunistic and core plus in risk profile")
    public void selectOpportunisticAndCorePlus(){
        companiesOfDeveloperValidationPage.selectOpportunisticAndCorePlus();
    }

    @When("I clear risk profile field in developer search")
    public void clearRiskProfileOptions(){
        companiesOfDeveloperValidationPage.clearRiskProfileOptions();
    }

    @When("I select sales and leaseback and lease up strategy in drop down")
    public void clickSalesAndOperating(){
        companiesOfDeveloperValidationPage.clickSalesAndLeaseUp();
    }

    @When("I clear options selected in asset strategy field")
    public void clearAssetStrategy(){
        companiesOfDeveloperValidationPage.clearAssetStrategy();
    }
}
