package test.steps;

import com.google.inject.Inject;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import test.pages.PageFactory;
import test.pages.PeopleSearchPage;

public class PeopleSearchSteps {
    private final PeopleSearchPage peopleSearchPage;

    @Inject
    public PeopleSearchSteps(PageFactory thePageFactory) {
        peopleSearchPage = thePageFactory.newPeopleSearchPage();
    }

    @Then("I should see 'People, Companies & Associations' as find in search option")
    public void verifyFind(){
        peopleSearchPage.verifyFind(1);
    }

    @Then("I should see '$strDealSponsorUserName' deal sponsor user name is displayed")
    public void verifyDealSponsorUserName(@Named("strDealSponsorUserName") String strDealSponsorUserName){
        peopleSearchPage.verifyDealSponsorUserName(strDealSponsorUserName);
    }

    @Then("I verify '$strDealSponsorUserName' deal sponsor user name is displayed")
    public void verifyDealSponsorUserIsDisplayedName(@Named("strDealSponsorUserName") String strDealSponsorUserName){
        peopleSearchPage.verifyDealSponsorUserIsDisplayedName(strDealSponsorUserName);
    }

    @When("I click on verified deal sponsor user name")
    public void clickVerifiedDealSponsorUser(){
        peopleSearchPage.clickVerifiedDealSponsorUser(1);
    }

    @Then("I should see '$strInvestorUserName' investor user name is displayed")
    public void verifyInvestorUserName(@Named("strInvestorUserName") String strInvestorUserName){
       peopleSearchPage.verifyInvestorUserName(strInvestorUserName);
    }

    @When("I click on verified investor user name")
    public void clickVerifiedInvestorUser(){
        peopleSearchPage.clickVerifiedInvestorUser(1);
    }

    @Then("I should see '$strLenderUserName' lender user name is displayed")
    public void verifyLenderUserName(@Named("strLenderUserName") String strLenderUserName){
        peopleSearchPage.verifyLenderUserName(strLenderUserName);
    }

    @When("I click on verified lender user name")
    public void clickVerifiedLenderUser(){
        peopleSearchPage.clickVerifiedLenderUser(1);
    }

    @Then("I verify '$strServiceProviderUserName' service provider user name is displayed")
    public void verifyServiceProviderUserName(@Named("strServiceProviderUserName") String strServiceProviderUserName){
        peopleSearchPage.verifyServiceProviderUserName(strServiceProviderUserName);
    }

    @When("I click on verified property service provider user name")
    public void clickVerifiedServiceProvider(){
        peopleSearchPage.clickVerifiedServiceProvider(1);
    }

    @When("I enter user title in name search option")
    public void enterUserTitle() throws Exception {
        peopleSearchPage.enterUserTitle(1);
    }

    @When("I enter user job title in title search option")
    public void enterUserJobTitle() {
        peopleSearchPage.enterUserJobTitle(1);
    }

    @When("I enter location in location search option")
    public void enterLocation() {
        peopleSearchPage.enterLocation(1);
    }

    @When("I select location in the drop down")
    public void clickLocation(){
        peopleSearchPage.clickLocation(1);
    }

    @When("I enter user company name in company search option")
    public void enterCompanyName() {
        peopleSearchPage.enterCompanyName(1);
    }

    @When("I clear title field in search option")
    public void clearTitle(){
        peopleSearchPage.clearTitle();
    }

    @When("I clear job title field in search option")
    public void clearJobTitle(){
        peopleSearchPage.clearJobTitle();
    }

    @When("I clear Location")
    public void clearLocation(){
        peopleSearchPage.clearLocation();
    }

    @When("I clear Company Field")
    public void clearCompanyField(){
        peopleSearchPage.clearCompanyField();
    }

    @When("I click on geographical coverage field")
    public void clickGeographicalCoverage(){
        peopleSearchPage.clickGeographicalCoverage();
    }

    @When("I click on countries field")
    public void clickOnCountries(){
        peopleSearchPage.clickOnCountries();
    }

    @When("I select United States checkbox in countries field")
    public void selectUnitedStatesCheckBox(){
        peopleSearchPage.selectUnitedStatesCheckBox();
    }

    @When("I click on region field")
    public void clickRegionField(){
        peopleSearchPage.clickRegionField();
    }

    @When("I click on Southwest region")
    public void clickSouthWest(){
        peopleSearchPage.clickSouthWest();
    }

    @When("I click on states field")
    public void clickStatesField(){
        peopleSearchPage.clickStatesField();
    }

    @When("I click on Texas state")
    public void clickTexasState(){
        peopleSearchPage.clickTexasState();
    }

    @When("I click on cities field")
    public void clickCitiesField(){
        peopleSearchPage.clickCitiesField();
    }

    @When("I enter and select Massa city")
    public void enterAndSelectMassaCity(){
        peopleSearchPage.enterAndSelectMassaCity();
    }

}
