package test.steps;

import com.google.inject.Inject;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import test.pages.JVPartnerPage;
import test.pages.PageFactory;

/**
 * Created with IntelliJ IDEA.
 * User: Bhavana
 * Date: 9/4/14
 * Time: 5:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class JVPartnerSteps {
    private final JVPartnerPage jVPartnerPage;

    @Inject
    public JVPartnerSteps(PageFactory thePageFactory) {
        jVPartnerPage = thePageFactory.newJVPartnerPage();
    }

    @Then("I should see 'JV Partners' as find in search option")
    public void verifyFindInSearch(){
        jVPartnerPage.verifyFindInSearch(1);
    }

    @Then("I should see 'Loan/Hard Money' as loan type in search option")
    public void verifyNewBusinessSearchOfLoanType(){
        jVPartnerPage.verifyNewBusinessSearchOfLoanType(1);
    }

    @Then("I should see 'Mezz' as loan type in search option")
    public void verifyNewBusinessSearchOfLoanTypeMezz(){
        jVPartnerPage.verifyNewBusinessSearchOfLoanType(2);
    }

    @Then("I should see 'Land' as looking for in search option")
    public void verifyLookingFor(){
        jVPartnerPage.verifyLookingFor(1);
    }

    @Then("I should see 'Project' as looking for in search option")
    public void verifyLookingForProject(){
        jVPartnerPage.verifyLookingFor(2);
    }

    @Then("I should see 'Equity' as looking for in search option")
    public void verifyLookingForEquity(){
        jVPartnerPage.verifyLookingFor(3);
    }

    @Then("I should see 'Services' as looking for in search option")
    public void verifyLookingForServices(){
        jVPartnerPage.verifyLookingFor(4);
    }

    @Then("I should see 'Other' as looking for in search option")
    public void verifyLookingForOther(){
        jVPartnerPage.verifyLookingFor(5);
    }

    @Then("I verify '$strDealSponsorFundName' deal sponsor fund name is displayed")
    public void verifyDealSponsorFundNameIsDisplayedName(@Named("strDealSponsorFundName") String strDealSponsorFundName){
        jVPartnerPage.verifyDealSponsorFundNameIsDisplayedName(strDealSponsorFundName);
    }

    @Then("I verify '$strDealSponsorFundName' deal sponsor fund name is not displayed")
    public void verifyDealSponsorFundNameIsNotDisplayedName(@Named("strDealSponsorFundName") String strDealSponsorFundName){
        jVPartnerPage.verifyDealSponsorFundNameIsNotDisplayedName(strDealSponsorFundName);
    }

    @Then("I verify '$strDealSponsorFundName' of deal sponsor fund name is displayed in jv partner project search")
    public void verifyDealSponsorFundNameIsDisplayedNameInProjectSearch(@Named("strDealSponsorFundName") String strDealSponsorFundName){
        jVPartnerPage.verifyDealSponsorFundNameIsDisplayedNameInProjectSearch(strDealSponsorFundName);
    }

    @Then("I verify '$strDealSponsorFundName' of deal sponsor fund name is displayed in jv partner service search")
    public void verifyDealSponsorFundNameIsDisplayedNameInServiceSearch(@Named("strDealSponsorFundName") String strDealSponsorFundName){
        jVPartnerPage.verifyDealSponsorFundNameIsDisplayedNameInServiceSearch(strDealSponsorFundName);
    }

    @Then("I verify '$strDealSponsorFundName' of deal sponsor fund name is displayed in jv partner other search")
    public void verifyDealSponsorFundNameIsDisplayedNameInOtherSearch(@Named("strDealSponsorFundName") String strDealSponsorFundName){
        jVPartnerPage.verifyDealSponsorFundNameIsDisplayedNameInOtherSearch(strDealSponsorFundName);
    }

    @Then("I verify '$strDealSponsorFundName' of deal sponsor fund name is displayed in jv partner equity search")
    public void verifyDealSponsorFundNameIsDisplayedNameInEquitySearch(@Named("strDealSponsorFundName") String strDealSponsorFundName){
        jVPartnerPage.verifyDealSponsorFundNameIsDisplayedNameInEquitySearch(strDealSponsorFundName);
    }

    @Then("I verify '$strDealSponsorFundName' of deal sponsor fund name is not displayed in jv partner project search")
    public void verifyDealSponsorFundNameIsNotDisplayedNameInProjectSearch(@Named("strDealSponsorFundName") String strDealSponsorFundName){
        jVPartnerPage.verifyDealSponsorFundNameIsNotDisplayedNameInProjectSearch(strDealSponsorFundName);
    }

    @Then("I verify '$strDealSponsorProjectName' of deal sponsor project name is displayed")
    public void verifyDealSponsorProjectNameIsDisplayedName(@Named("strDealSponsorProjectName") String strDealSponsorProjectName){
        jVPartnerPage.verifyDealSponsorProjectNameIsDisplayedName(strDealSponsorProjectName);
    }

    @Then("I verify '$strDealSponsorProjectName' of deal sponsor project name is not displayed")
    public void verifyDealSponsorProjectNameIsNotDisplayedName(@Named("strDealSponsorProjectName") String strDealSponsorProjectName){
        jVPartnerPage.verifyDealSponsorProjectNameIsNotDisplayedName(strDealSponsorProjectName);
    }

    @Then("I verify '$strDealSponsorProjectName' of deal sponsor project name is displayed in jv partner project search")
    public void verifyDealSponsorProjectNameIsDisplayedNameInProjectSearch(@Named("strDealSponsorProjectName") String strDealSponsorProjectName){
        jVPartnerPage.verifyDealSponsorProjectNameIsDisplayedNameInProjectSearch(strDealSponsorProjectName);
    }

    @Then("I verify '$strDealSponsorProjectName' of deal sponsor project name is displayed in jv partner equity search")
    public void verifyDealSponsorProjectNameIsDisplayedNameInEquitySearch(@Named("strDealSponsorProjectName") String strDealSponsorProjectName){
        jVPartnerPage.verifyDealSponsorProjectNameIsDisplayedNameInEquitySearch(strDealSponsorProjectName);
    }

    @Then("I verify '$strDealSponsorProjectName' of deal sponsor project name is displayed in jv partner service search")
    public void verifyDealSponsorProjectNameIsDisplayedNameInServiceSearch(@Named("strDealSponsorProjectName") String strDealSponsorProjectName){
        jVPartnerPage.verifyDealSponsorProjectNameIsDisplayedNameInServiceSearch(strDealSponsorProjectName);
    }

    @Then("I verify '$strDealSponsorProjectName' of deal sponsor project name is displayed in jv partner other search")
    public void verifyDealSponsorProjectNameIsDisplayedNameInOtherSearch(@Named("strDealSponsorProjectName") String strDealSponsorProjectName){
        jVPartnerPage.verifyDealSponsorProjectNameIsDisplayedNameInOtherSearch(strDealSponsorProjectName);
    }

    @Then("I verify '$strDealSponsorProjectName' of deal sponsor project name is not displayed in jv partner project search")
    public void verifyDealSponsorProjectNameIsNotDisplayedNameInProjectSearch(@Named("strDealSponsorProjectName") String strDealSponsorProjectName){
        jVPartnerPage.verifyDealSponsorProjectNameIsNotDisplayedNameInProjectSearch(strDealSponsorProjectName);
    }

    @Then("I verify '$strInvestorFundName' of investor fund name is displayed")
    public void verifyInvestorFundNameIsDisplayedName(@Named("strInvestorFundName") String strInvestorFundName){
        jVPartnerPage.verifyInvestorFundNameIsDisplayedName(strInvestorFundName);
    }

    @Then("I verify '$strInvestorFundName' of investor fund name is not displayed")
    public void verifyInvestorFundNameIsNotDisplayedName(@Named("strInvestorFundName") String strInvestorFundName){
        jVPartnerPage.verifyInvestorFundNameIsNotDisplayedName(strInvestorFundName);
    }

    @Then("I verify '$strInvestorFundName' of investor fund name is displayed in jv partner project search")
    public void verifyInvestorFundNameIsDisplayedNameInProjectSearch(@Named("strInvestorFundName") String strInvestorFundName){
        jVPartnerPage.verifyInvestorFundNameIsDisplayedNameInProjectSearch(strInvestorFundName);
    }

    @Then("I verify '$strInvestorFundName' of investor fund name is displayed in jv partner equity search")
    public void verifyInvestorFundNameIsDisplayedNameInEquitySearch(@Named("strInvestorFundName") String strInvestorFundName){
        jVPartnerPage.verifyInvestorFundNameIsDisplayedNameInEquitySearch(strInvestorFundName);
    }

    @Then("I verify '$strInvestorFundName' of investor fund name is displayed in jv partner service search")
    public void verifyInvestorFundNameIsDisplayedNameInServiceSearch(@Named("strInvestorFundName") String strInvestorFundName){
        jVPartnerPage.verifyInvestorFundNameIsDisplayedNameInServiceSearch(strInvestorFundName);
    }

    @Then("I verify '$strInvestorFundName' of investor fund name is displayed in jv partner other search")
    public void verifyInvestorFundNameIsDisplayedNameInOtherSearch(@Named("strInvestorFundName") String strInvestorFundName){
        jVPartnerPage.verifyInvestorFundNameIsDisplayedNameInOtherSearch(strInvestorFundName);
    }

    @Then("I verify '$strInvestorFundName' of investor fund name is not displayed in jv partner project search")
    public void verifyInvestorFundNameIsNotDisplayedNameInProjectSearch(@Named("strInvestorFundName") String strInvestorFundName){
        jVPartnerPage.verifyInvestorFundNameIsNotDisplayedNameInProjectSearch(strInvestorFundName);
    }

    @Then("I verify '$strLenderLoanName' of lender loan name is displayed")
    public void verifyLenderLoanNameIsDisplayedName(@Named("strLenderLoanName") String strLenderLoanName){
        jVPartnerPage.verifyLenderLoanNameIsDisplayedName(strLenderLoanName);
    }

    @Then("I verify '$strLenderLoanName' of lender loan name is not displayed")
    public void verifyLenderLoanNameIsNotDisplayedName(@Named("strLenderLoanName") String strLenderLoanName){
        jVPartnerPage.verifyLenderLoanNameIsNotDisplayedName(strLenderLoanName);
    }

    @Then("I verify '$strLenderLoanName' of lender loan name is displayed in jv partner project search")
    public void verifyLenderLoanNameIsDisplayedNameInProjectSearch(@Named("strLenderLoanName") String strLenderLoanName){
        jVPartnerPage.verifyLenderLoanNameIsDisplayedNameInProjectSearch(strLenderLoanName);
    }

    @Then("I verify '$strLenderLoanName' of lender loan name is displayed in jv partner equity search")
    public void verifyLenderLoanNameIsDisplayedNameInEquitySearch(@Named("strLenderLoanName") String strLenderLoanName){
        jVPartnerPage.verifyLenderLoanNameIsDisplayedNameInEquitySearch(strLenderLoanName);
    }

    @Then("I verify '$strLenderLoanName' of lender loan name is displayed in jv partner service search")
    public void verifyLenderLoanNameIsDisplayedNameInServiceSearch(@Named("strLenderLoanName") String strLenderLoanName){
        jVPartnerPage.verifyLenderLoanNameIsDisplayedNameInServiceSearch(strLenderLoanName);
    }

    @Then("I verify '$strLenderLoanName' of lender loan name is displayed in jv partner other search")
    public void verifyLenderLoanNameIsDisplayedNameInOtherSearch(@Named("strLenderLoanName") String strLenderLoanName){
        jVPartnerPage.verifyLenderLoanNameIsDisplayedNameInOtherSearch(strLenderLoanName);
    }

    @Then("I verify '$strLenderLoanName' of lender loan name is not displayed in jv partner project search")
    public void verifyLenderLoanNameIsNotDisplayedNameInProjectSearch(@Named("strLenderLoanName") String strLenderLoanName){
        jVPartnerPage.verifyLenderLoanNameIsNotDisplayedNameInProjectSearch(strLenderLoanName);
    }

    @Then("I verify '$strLenderMezzName' of lender mezz name is displayed")
    public void verifyLenderMezzNameIsDisplayedName(@Named("strLenderMezzName") String strLenderMezzName){
        jVPartnerPage.verifyLenderMezzNameIsDisplayedName(strLenderMezzName);
    }

    @Then("I verify '$strLenderMezzName' of lender mezz name is not displayed")
    public void verifyLenderMezzNameIsNotDisplayedName(@Named("strLenderMezzName") String strLenderMezzName){
        jVPartnerPage.verifyLenderMezzNameIsNotDisplayedName(strLenderMezzName);
    }

    @Then("I verify '$strLenderMezzName' of lender mezz name is displayed in jv partner project search")
    public void verifyLenderMezzNameIsDisplayedNameInProjectSearch(@Named("strLenderMezzName") String strLenderMezzName){
        jVPartnerPage.verifyLenderMezzNameIsDisplayedNameInProjectSearch(strLenderMezzName);
    }

    @Then("I verify '$strLenderMezzName' of lender mezz name is displayed in jv partner equity search")
    public void verifyLenderMezzNameIsDisplayedNameInEquitySearch(@Named("strLenderMezzName") String strLenderMezzName){
        jVPartnerPage.verifyLenderMezzNameIsDisplayedNameInEquitySearch(strLenderMezzName);
    }

    @Then("I verify '$strLenderMezzName' of lender mezz name is displayed in jv partner service search")
    public void verifyLenderMezzNameIsDisplayedNameInServiceSearch(@Named("strLenderMezzName") String strLenderMezzName){
        jVPartnerPage.verifyLenderMezzNameIsDisplayedNameInServiceSearch(strLenderMezzName);
    }

    @Then("I verify '$strLenderMezzName' of lender mezz name is displayed in jv partner other search")
    public void verifyLenderMezzNameIsDisplayedNameInOtherSearch(@Named("strLenderMezzName") String strLenderMezzName){
        jVPartnerPage.verifyLenderMezzNameIsDisplayedNameInOtherSearch(strLenderMezzName);
    }

    @Then("I verify '$strLenderMezzName' of lender mezz name is not displayed in jv partner project search")
    public void verifyLenderMezzNameIsNotDisplayedNameInProjectSearch(@Named("strLenderMezzName") String strLenderMezzName){
        jVPartnerPage.verifyLenderMezzNameIsNotDisplayedNameInProjectSearch(strLenderMezzName);
    }

    @Then("I verify '$strAdvisorListingName' of real estate advisor listing name is displayed")
    public void verifyAdvisorListingNameIsDisplayedName(@Named("strAdvisorListingName") String strAdvisorListingName){
        jVPartnerPage.verifyAdvisorListingNameIsDisplayedName(strAdvisorListingName);
    }

    @Then("I verify '$strAdvisorListingName' of real estate advisor listing name is not displayed")
    public void verifyAdvisorListingNameIsNotDisplayedName(@Named("strAdvisorListingName") String strAdvisorListingName){
        jVPartnerPage.verifyAdvisorListingNameIsNotDisplayedName(strAdvisorListingName);
    }

    @Then("I verify '$strAdvisorListingName' of real estate advisor listing name is displayed in jv partner project search")
    public void verifyAdvisorListingNameIsDisplayedNameInProjectSearch(@Named("strAdvisorListingName") String strAdvisorListingName){
        jVPartnerPage.verifyAdvisorListingNameIsDisplayedNameInProjectSearch(strAdvisorListingName);
    }

    @Then("I verify '$strAdvisorListingName' of real estate advisor listing name is displayed in jv partner equity search")
    public void verifyAdvisorListingNameIsDisplayedNameInEquitySearch(@Named("strAdvisorListingName") String strAdvisorListingName){
        jVPartnerPage.verifyAdvisorListingNameIsDisplayedNameInEquitySearch(strAdvisorListingName);
    }

    @Then("I verify '$strAdvisorListingName' of real estate advisor listing name is displayed in jv partner service search")
    public void verifyAdvisorListingNameIsDisplayedNameInServiceSearch(@Named("strAdvisorListingName") String strAdvisorListingName){
        jVPartnerPage.verifyAdvisorListingNameIsDisplayedNameInServiceSearch(strAdvisorListingName);
    }

    @Then("I verify '$strAdvisorListingName' of real estate advisor listing name is displayed in jv partner other search")
    public void verifyAdvisorListingNameIsDisplayedNameInOtherSearch(@Named("strAdvisorListingName") String strAdvisorListingName){
        jVPartnerPage.verifyAdvisorListingNameIsDisplayedNameInOtherSearch(strAdvisorListingName);
    }

    @Then("I verify '$strAdvisorListingName' of real estate advisor listing name is not displayed in jv partner project search")
    public void verifyAdvisorListingNameIsNotDisplayedNameInProjectSearch(@Named("strAdvisorListingName") String strAdvisorListingName){
        jVPartnerPage.verifyAdvisorListingNameIsNotDisplayedNameInProjectSearch(strAdvisorListingName);
    }

    @Then("I verify '$strAdvisorServiceName' of real estate advisor service name is displayed")
    public void verifyAdvisorServiceNameIsDisplayedName(@Named("strAdvisorServiceName") String strAdvisorServiceName){
        jVPartnerPage.verifyAdvisorServiceNameIsDisplayedName(strAdvisorServiceName);
    }

    @Then("I verify '$strAdvisorServiceName' of real estate advisor service name is not displayed")
    public void verifyAdvisorServiceNameIsNotDisplayedName(@Named("strAdvisorServiceName") String strAdvisorServiceName){
        jVPartnerPage.verifyAdvisorServiceNameIsNotDisplayedName(strAdvisorServiceName);
    }

    @Then("I verify '$strAdvisorServiceName' of real estate advisor service name is displayed in jv partner project search")
    public void verifyAdvisorServiceNameIsDisplayedInProjectSearch(@Named("strAdvisorServiceName") String strAdvisorServiceName){
        jVPartnerPage.verifyAdvisorServiceNameIsDisplayedInProjectSearch(strAdvisorServiceName);
    }

    @Then("I verify '$strAdvisorServiceName' of real estate advisor service name is displayed in jv partner equity search")
    public void verifyAdvisorServiceNameIsDisplayedInEquitySearch(@Named("strAdvisorServiceName") String strAdvisorServiceName){
        jVPartnerPage.verifyAdvisorServiceNameIsDisplayedInEquitySearch(strAdvisorServiceName);
    }

    @Then("I verify '$strAdvisorServiceName' of real estate advisor service name is displayed in jv partner service search")
    public void verifyAdvisorServiceNameIsDisplayedInServiceSearch(@Named("strAdvisorServiceName") String strAdvisorServiceName){
        jVPartnerPage.verifyAdvisorServiceNameIsDisplayedInServiceSearch(strAdvisorServiceName);
    }

    @Then("I verify '$strAdvisorServiceName' of real estate advisor service name is displayed in jv partner other search")
    public void verifyAdvisorServiceNameIsDisplayedInOtherSearch(@Named("strAdvisorServiceName") String strAdvisorServiceName){
        jVPartnerPage.verifyAdvisorServiceNameIsDisplayedInOtherSearch(strAdvisorServiceName);
    }

    @Then("I verify '$strAdvisorServiceName' of real estate advisor service name is not displayed in jv partner project search")
    public void verifyAdvisorServiceNameIsNotDisplayedInProjectSearch(@Named("strAdvisorServiceName") String strAdvisorServiceName){
        jVPartnerPage.verifyAdvisorServiceNameIsNotDisplayedInProjectSearch(strAdvisorServiceName);
    }

    @Then("I verify '$strInvestorFundName' fund name of user whose lighthouse is off are not displayed in jv partner search")
    public void verifyInvestorFundName_LightHouseOffIsNotDisplayed(@Named("strInvestorFundName") String strInvestorFundName){
        jVPartnerPage.verifyInvestorFundName_LightHouseOffIsNotDisplayed(strInvestorFundName);
    }

    @Then("I verify '$strInvestorFundName' fund name of user whose lighthouse is off are not displayed")
    public void verifyInvestorFundNameNotDisplayed_LightHouseOff(@Named("strInvestorFundName") String strInvestorFundName){
        jVPartnerPage.verifyInvestorFundNameNotDisplayed_LightHouseOff(strInvestorFundName);
    }

    @When("I click on fund and project tab")
    public void clickFundAndProjectTab(){
        jVPartnerPage.clickFundAndProjectTab();
    }

    @When("I click on service and listing tab")
    public void clickServiceAndListingTab(){
        jVPartnerPage.clickServiceAndListingTab();
    }

    @When("I click on fund tab in user profile")
    public void clickOnFundTab(){
        jVPartnerPage.clickOnFundTab();
    }

    @When("I click on product tab in user profile")
    public void clickOnProductTab(){
        jVPartnerPage.clickOnProductTab();
    }

    @When("I click on kelly fund of deal sponsor")
    public void clickFund(){
        jVPartnerPage.clickFund();
    }

    @When("I click on laven listing of real estate advisor")
    public void clickLavenListing(){
        jVPartnerPage.clickLavenListing();
    }

    @When("I click on lross fund of deal sponsor")
    public void clickLRossFund(){
        jVPartnerPage.clickLRossFund();
    }

    @When("I click on haris fund of investor")
    public void clickFundOfInvestor(){
        jVPartnerPage.clickFundOfInvestor();
    }

    @When("I click on SW fund of investor")
    public void clickInvestorFund(){
        jVPartnerPage.clickInvestorFund();
    }

    @When("I click on Dan loan of lender")
    public void clickLenderLoan(){
        jVPartnerPage.clickLenderLoan();
    }

    @When("I get the number of matches count")
    public void getNumberOfMatch(){
        jVPartnerPage.getNumberOfMatch();
    }

    @When("I click on matches")
    public void clickMatches(){
        jVPartnerPage.clickMatches();
    }

    @When("I get the number of matches in the search result")
    public void getNumberOfMatchesInResult(){
        jVPartnerPage.getNumberOfMatchesInResult();
    }

    @Then("I verify that land is selected in your contribution drop down")
    public void verifyLandIsSelected(){
        jVPartnerPage.verifyLandIsSelected();
    }

    @Then("I verify that project is selected in your contribution drop down")
    public void verifyProjectIsSelected(){
        jVPartnerPage.verifyProjectIsSelected();
    }

    @Then("I verify that equity is selected in your contribution drop down")
    public void verifyEquityIsSelected(){
        jVPartnerPage.verifyEquityIsSelected();
    }

    @Then("I verify that services is selected in your contribution drop down")
    public void verifyServicesIsSelected(){
        jVPartnerPage.verifyServicesIsSelected();
    }

    @Then("I verify that other is selected in your contribution drop down")
    public void verifyOtherIsSelected(){
        jVPartnerPage.verifyOtherIsSelected();
    }

    @Then("I verify the count of matches in search result and profile of user")
    public void verifyTheMatches(){
        jVPartnerPage.verifyTheMatches();
    }

    @When("I click on route to partnership drop down")
    public void clickRouteToPartner(){
        jVPartnerPage.clickRouteToPartner();
    }

    @When("I select principal option in route to partnership field")
    public void selectPrincipal(){
        jVPartnerPage.selectPrincipal();
    }

    @When("I select broker option in route to partnership field")
    public void selectBroker(){
        jVPartnerPage.selectBroker();
    }

    @When("I select intermediary option in route to partnership field")
    public void selectIntermediary(){
        jVPartnerPage.selectIntermediary();
    }

    @Then("I verify '$strDealSponsorFundName' of deal sponsor fund is displayed in jv partner result")
    public void verifyFundNameInSearchResultToFilterSelected(@Named("strDealSponsorFundName") String strDealSponsorFundName){
        jVPartnerPage.verifyFundNameInSearchResultToFilterSelected(strDealSponsorFundName);
    }

    @Then("I verify '$strDealSponsorFundName' of deal sponsor fund is displayed in jv partner result in jv partner project search")
    public void verifyFundNameIsDisplayedInSearchResultToFilterSelected_ProjectSearch(@Named("strDealSponsorFundName") String strDealSponsorFundName){
        jVPartnerPage.verifyFundNameIsDisplayedInSearchResultToFilterSelected_ProjectSearch(strDealSponsorFundName);
    }

    @Then("I verify '$strDealSponsorFundName' of deal sponsor fund is displayed in jv partner result in jv partner equity search")
    public void verifyFundNameIsDisplayedInSearchResultToFilterSelected_EquitySearch(@Named("strDealSponsorFundName") String strDealSponsorFundName){
        jVPartnerPage.verifyFundNameIsDisplayedInSearchResultToFilterSelected_EquitySearch(strDealSponsorFundName);
    }

    @Then("I verify '$strDealSponsorFundName' of deal sponsor fund is displayed in jv partner result in jv partner service search")
    public void verifyFundNameIsDisplayedInSearchResultToFilterSelected_ServiceSearch(@Named("strDealSponsorFundName") String strDealSponsorFundName){
        jVPartnerPage.verifyFundNameIsDisplayedInSearchResultToFilterSelected_ServiceSearch(strDealSponsorFundName);
    }

    @Then("I verify '$strDealSponsorFundName' of deal sponsor fund is displayed in jv partner result in jv partner other search")
    public void verifyFundNameIsDisplayedInSearchResultToFilterSelected_OtherSearch(@Named("strDealSponsorFundName") String strDealSponsorFundName){
        jVPartnerPage.verifyFundNameIsDisplayedInSearchResultToFilterSelected_OtherSearch(strDealSponsorFundName);
    }

    @Then("I verify '$strDealSponsorFundName' of deal sponsor fund is not displayed in jv partner result in jv partner project search")
    public void verifyFundNameIsNotDisplayedInSearchResultToFilterSelected_ProjectSearch(@Named("strDealSponsorFundName") String strDealSponsorFundName){
        jVPartnerPage.verifyFundNameIsNotDisplayedInSearchResultToFilterSelected_ProjectSearch(strDealSponsorFundName);
    }

    @Then("I verify '$strDealSponsorFundName' of deal sponsor fund is not displayed in jv partner result")
    public void verifyFundNameInSearchResultToFilterSelectedNotDisplayed(@Named("strDealSponsorFundName") String strDealSponsorFundName){
        jVPartnerPage.verifyFundNameInSearchResultToFilterSelectedNotDisplayed(strDealSponsorFundName);
    }

    @Then("I verify '$strDealSponsorProjectName' of deal sponsor project name is displayed in jv partner result")
    public void verifyProjectNameInSearchResultToFilterSelected(@Named("strDealSponsorProjectName") String strDealSponsorProjectName){
        jVPartnerPage.verifyProjectNameInSearchResultToFilterSelected(strDealSponsorProjectName);
    }

    @Then("I verify '$strDealSponsorProjectName' of deal sponsor project name is displayed in jv partner result in jv partner project search")
    public void verifyProjectNameIsDisplayedInSearchResultToFilterSelected_ProjectSearch(@Named("strDealSponsorProjectName") String strDealSponsorProjectName){
        jVPartnerPage.verifyProjectNameIsDisplayedInSearchResultToFilterSelected_ProjectSearch(strDealSponsorProjectName);
    }

    @Then("I verify '$strDealSponsorProjectName' of deal sponsor project name is displayed in jv partner result in jv partner equity search")
    public void verifyProjectNameIsDisplayedInSearchResultToFilterSelected_EquitySearch(@Named("strDealSponsorProjectName") String strDealSponsorProjectName){
        jVPartnerPage.verifyProjectNameIsDisplayedInSearchResultToFilterSelected_EquitySearch(strDealSponsorProjectName);
    }

    @Then("I verify '$strDealSponsorProjectName' of deal sponsor project name is displayed in jv partner result in jv partner service search")
    public void verifyProjectNameIsDisplayedInSearchResultToFilterSelected_ServiceSearch(@Named("strDealSponsorProjectName") String strDealSponsorProjectName){
        jVPartnerPage.verifyProjectNameIsDisplayedInSearchResultToFilterSelected_ServiceSearch(strDealSponsorProjectName);
    }

    @Then("I verify '$strDealSponsorProjectName' of deal sponsor project name is displayed in jv partner result in jv partner other search")
    public void verifyProjectNameIsDisplayedInSearchResultToFilterSelected_OtherSearch(@Named("strDealSponsorProjectName") String strDealSponsorProjectName){
        jVPartnerPage.verifyProjectNameIsDisplayedInSearchResultToFilterSelected_OtherSearch(strDealSponsorProjectName);
    }

    @Then("I verify '$strDealSponsorProjectName' of deal sponsor project name is not displayed in jv partner result in jv partner project search")
    public void verifyProjectNameIsNotDisplayedInSearchResultToFilterSelected_ProjectSearch(@Named("strDealSponsorProjectName") String strDealSponsorProjectName){
        jVPartnerPage.verifyProjectNameIsNotDisplayedInSearchResultToFilterSelected_ProjectSearch(strDealSponsorProjectName);
    }

    @Then("I verify '$strDealSponsorProjectName' of deal sponsor project name is not displayed in jv partner result")
    public void verifyProjectNameInSearchResultToFilterSelectedNotDisplayed(@Named("strDealSponsorProjectName") String strDealSponsorProjectName){
        jVPartnerPage.verifyProjectNameInSearchResultToFilterSelectedNotDisplayed(strDealSponsorProjectName);
    }

    @Then("I verify '$strInvestorFundName' of investor fund name is displayed in jv partner result")
    public void verifyInvestorFundNameInSearchResultToFilterSelected(@Named("strInvestorFundName") String strInvestorFundName){
        jVPartnerPage.verifyInvestorFundNameInSearchResultToFilterSelected(strInvestorFundName);
    }

    @Then("I verify '$strInvestorFundName' of investor fund name is displayed in jv partner result in jv partner project search")
    public void verifyInvestorFundNameIsDisplayedInSearchResultToFilterSelected_ProjectSearching(@Named("strInvestorFundName") String strInvestorFundName){
        jVPartnerPage.verifyInvestorFundNameIsDisplayedInSearchResultToFilterSelected_ProjectSearching(strInvestorFundName);
    }

    @Then("I verify '$strInvestorFundName' of investor fund name is displayed in jv partner result in jv partner equity search")
    public void verifyInvestorFundNameIsDisplayedInSearchResultToFilterSelected_EquitySearching(@Named("strInvestorFundName") String strInvestorFundName){
        jVPartnerPage.verifyInvestorFundNameIsDisplayedInSearchResultToFilterSelected_EquitySearching(strInvestorFundName);
    }

    @Then("I verify '$strInvestorFundName' of investor fund name is displayed in jv partner result in jv partner service search")
    public void verifyInvestorFundNameIsDisplayedInSearchResultToFilterSelected_ServiceSearching(@Named("strInvestorFundName") String strInvestorFundName){
        jVPartnerPage.verifyInvestorFundNameIsDisplayedInSearchResultToFilterSelected_ServiceSearching(strInvestorFundName);
    }

    @Then("I verify '$strInvestorFundName' of investor fund name is displayed in jv partner result in jv partner other search")
    public void verifyInvestorFundNameIsDisplayedInSearchResultToFilterSelected_OtherSearching(@Named("strInvestorFundName") String strInvestorFundName){
        jVPartnerPage.verifyInvestorFundNameIsDisplayedInSearchResultToFilterSelected_OtherSearching(strInvestorFundName);
    }

    @Then("I verify '$strInvestorFundName' of investor fund name is not displayed in jv partner result in jv partner project search")
    public void verifyInvestorFundNameIsNotDisplayedInSearchResultToFilterSelected_ProjectSearching(@Named("strInvestorFundName") String strInvestorFundName){
        jVPartnerPage.verifyInvestorFundNameIsNotDisplayedInSearchResultToFilterSelected_ProjectSearching(strInvestorFundName);
    }

    @Then("I verify '$strInvestorFundName' of investor fund name is not displayed in jv partner result")
    public void verifyInvestorFundNameInSearchResultToFilterSelectedNotDisplayed(@Named("strInvestorFundName") String strInvestorFundName){
        jVPartnerPage.verifyInvestorFundNameInSearchResultToFilterSelectedNotDisplayed(strInvestorFundName);
    }

    @Then("I verify '$strLenderLoanName' of lender loan name is displayed in jv partner result")
    public void verifyLenderLoanNameInSearchResultToFilterSelected(@Named("strLenderLoanName") String strLenderLoanName){
        jVPartnerPage.verifyLenderLoanNameInSearchResultToFilterSelected(strLenderLoanName);
    }

    @Then("I verify '$strLenderLoanName' of lender loan name is displayed in jv partner result in jv partner project search")
    public void verifyLenderLoanNameIsDisplayedInSearchResultToFilterSelected_ProjectSearch(@Named("strLenderLoanName") String strLenderLoanName){
        jVPartnerPage.verifyLenderLoanNameIsDisplayedInSearchResultToFilterSelected_ProjectSearch(strLenderLoanName);
    }

    @Then("I verify '$strLenderLoanName' of lender loan name is displayed in jv partner result in jv partner equity search")
    public void verifyLenderLoanNameIsDisplayedInSearchResultToFilterSelected_EquitySearch(@Named("strLenderLoanName") String strLenderLoanName){
        jVPartnerPage.verifyLenderLoanNameIsDisplayedInSearchResultToFilterSelected_EquitySearch(strLenderLoanName);
    }

    @Then("I verify '$strLenderLoanName' of lender loan name is displayed in jv partner result in jv partner service search")
    public void verifyLenderLoanNameIsDisplayedInSearchResultToFilterSelected_ServiceSearch(@Named("strLenderLoanName") String strLenderLoanName){
        jVPartnerPage.verifyLenderLoanNameIsDisplayedInSearchResultToFilterSelected_ServiceSearch(strLenderLoanName);
    }

    @Then("I verify '$strLenderLoanName' of lender loan name is displayed in jv partner result in jv partner other search")
    public void verifyLenderLoanNameIsDisplayedInSearchResultToFilterSelected_OtherSearch(@Named("strLenderLoanName") String strLenderLoanName){
        jVPartnerPage.verifyLenderLoanNameIsDisplayedInSearchResultToFilterSelected_OtherSearch(strLenderLoanName);
    }

    @Then("I verify '$strLenderLoanName' of lender loan name is not displayed in jv partner result in jv partner project search")
    public void verifyLenderLoanNameIsNotDisplayedInSearchResultToFilterSelected_ProjectSearch(@Named("strLenderLoanName") String strLenderLoanName){
        jVPartnerPage.verifyLenderLoanNameIsNotDisplayedInSearchResultToFilterSelected_ProjectSearch(strLenderLoanName);
    }

    @Then("I verify '$strLenderLoanName' of lender loan name is not displayed in jv partner result")
    public void verifyLenderLoanNameInSearchResultToFilterSelectedNotDisplayed(@Named("strLenderLoanName") String strLenderLoanName){
        jVPartnerPage.verifyLenderLoanNameInSearchResultToFilterSelectedNotDisplayed(strLenderLoanName);
    }

    @Then("I verify '$strLenderMezzName' of lender mezz name is displayed in jv partner result")
    public void verifyLenderMezzNameInSearchResultToFilterSelected(@Named("strLenderMezzName") String strLenderMezzName){
        jVPartnerPage.verifyLenderMezzNameInSearchResultToFilterSelected(strLenderMezzName);
    }

    @Then("I verify '$strLenderMezzName' of lender mezz name is displayed in jv partner result in jv partner project search")
    public void verifyLenderMezzNameIsDisplayedInSearchResultToFilterSelected_ProjectSearch(@Named("strLenderMezzName") String strLenderMezzName){
        jVPartnerPage.verifyLenderMezzNameIsDisplayedInSearchResultToFilterSelected_ProjectSearch(strLenderMezzName);
    }

    @Then("I verify '$strLenderMezzName' of lender mezz name is displayed in jv partner result in jv partner equity search")
     public void verifyLenderMezzNameIsDisplayedInSearchResultToFilterSelected_EquitySearch(@Named("strLenderMezzName") String strLenderMezzName){
        jVPartnerPage.verifyLenderMezzNameIsDisplayedInSearchResultToFilterSelected_EquitySearch(strLenderMezzName);
    }

    @Then("I verify '$strLenderMezzName' of lender mezz name is displayed in jv partner result in jv partner service search")
    public void verifyLenderMezzNameIsDisplayedInSearchResultToFilterSelected_ServiceSearch(@Named("strLenderMezzName") String strLenderMezzName){
        jVPartnerPage.verifyLenderMezzNameIsDisplayedInSearchResultToFilterSelected_ServiceSearch(strLenderMezzName);
    }

    @Then("I verify '$strLenderMezzName' of lender mezz name is displayed in jv partner result in jv partner other search")
    public void verifyLenderMezzNameIsDisplayedInSearchResultToFilterSelected_OtherSearch(@Named("strLenderMezzName") String strLenderMezzName){
        jVPartnerPage.verifyLenderMezzNameIsDisplayedInSearchResultToFilterSelected_OtherSearch(strLenderMezzName);
    }

    @Then("I verify '$strLenderMezzName' of lender mezz name is not displayed in jv partner result in jv partner project search")
    public void verifyLenderMezzNameIsNotDisplayedInSearchResultToFilterSelected_ProjectSearch(@Named("strLenderMezzName") String strLenderMezzName){
        jVPartnerPage.verifyLenderMezzNameIsNotDisplayedInSearchResultToFilterSelected_ProjectSearch(strLenderMezzName);
    }

    @Then("I verify '$strLenderMezzName' of lender mezz name is not displayed in jv partner result")
    public void verifyLenderMezzNameInSearchResultToFilterSelectedNotDisplayed(@Named("strLenderMezzName") String strLenderMezzName){
        jVPartnerPage.verifyLenderMezzNameInSearchResultToFilterSelectedNotDisplayed(strLenderMezzName);
    }

    @Then("I verify '$strAdvisorListingName' of real estate advisor listing name is displayed in jv partner result")
    public void verifyAdvisorListingNameInSearchResultToFilterSelected(@Named("strAdvisorListingName") String strAdvisorListingName){
        jVPartnerPage.verifyAdvisorListingNameInSearchResultToFilterSelected(strAdvisorListingName);
    }

    @Then("I verify '$strAdvisorListingName' of real estate advisor listing name is displayed in jv partner result in jv partner project search")
    public void verifyAdvisorListingNameIsDisplayedInSearchResultToFilterSelected_ProjectSearch(@Named("strAdvisorListingName") String strAdvisorListingName){
        jVPartnerPage.verifyAdvisorListingNameIsDisplayedInSearchResultToFilterSelected_ProjectSearch(strAdvisorListingName);
    }

    @Then("I verify '$strAdvisorListingName' of real estate advisor listing name is displayed in jv partner result in jv partner equity search")
    public void verifyAdvisorListingNameIsDisplayedInSearchResultToFilterSelected_EquitySearch(@Named("strAdvisorListingName") String strAdvisorListingName){
        jVPartnerPage.verifyAdvisorListingNameIsDisplayedInSearchResultToFilterSelected_EquitySearch(strAdvisorListingName);
    }

    @Then("I verify '$strAdvisorListingName' of real estate advisor listing name is displayed in jv partner result in jv partner service search")
    public void verifyAdvisorListingNameIsDisplayedInSearchResultToFilterSelected_ServiceSearch(@Named("strAdvisorListingName") String strAdvisorListingName){
        jVPartnerPage.verifyAdvisorListingNameIsDisplayedInSearchResultToFilterSelected_ServiceSearch(strAdvisorListingName);
    }

    @Then("I verify '$strAdvisorListingName' of real estate advisor listing name is displayed in jv partner result in jv partner other search")
    public void verifyAdvisorListingNameIsDisplayedInSearchResultToFilterSelected_OtherSearch(@Named("strAdvisorListingName") String strAdvisorListingName){
        jVPartnerPage.verifyAdvisorListingNameIsDisplayedInSearchResultToFilterSelected_OtherSearch(strAdvisorListingName);
    }

    @Then("I verify '$strAdvisorListingName' of real estate advisor listing name is not displayed in jv partner result in jv partner project search")
    public void verifyAdvisorListingNameIsNotDisplayedInSearchResultToFilterSelected_ProjectSearch(@Named("strAdvisorListingName") String strAdvisorListingName){
        jVPartnerPage.verifyAdvisorListingNameIsNotDisplayedInSearchResultToFilterSelected_ProjectSearch(strAdvisorListingName);
    }

    @Then("I verify '$strAdvisorListingName' of real estate advisor listing name is not displayed in jv partner result")
    public void verifyAdvisorListingNameInSearchResultToFilterSelectedNotDisplayed(@Named("strAdvisorListingName") String strAdvisorListingName){
        jVPartnerPage.verifyAdvisorListingNameInSearchResultToFilterSelectedNotDisplayed(strAdvisorListingName);
    }

    @Then("I verify '$strAdvisorServiceName' of real estate advisor service name is displayed in jv partner result")
    public void verifyAdvisorServiceNameInSearchResultToFilterSelected(@Named("strAdvisorServiceName") String strAdvisorServiceName){
        jVPartnerPage.verifyAdvisorServiceNameInSearchResultToFilterSelected(strAdvisorServiceName);
    }

    @Then("I verify '$strAdvisorServiceName' of real estate advisor service name is displayed in jv partner result in jv partner project search")
    public void verifyAdvisorServiceNameIsDisplayedInSearchResultToFilterSelected_ProjectSearch(@Named("strAdvisorServiceName") String strAdvisorServiceName){
        jVPartnerPage.verifyAdvisorServiceNameIsDisplayedInSearchResultToFilterSelected_ProjectSearch(strAdvisorServiceName);
    }

    @Then("I verify '$strAdvisorServiceName' of real estate advisor service name is displayed in jv partner result in jv partner equity search")
    public void verifyAdvisorServiceNameIsDisplayedInSearchResultToFilterSelected_EquitySearch(@Named("strAdvisorServiceName") String strAdvisorServiceName){
        jVPartnerPage.verifyAdvisorServiceNameIsDisplayedInSearchResultToFilterSelected_EquitySearch(strAdvisorServiceName);
    }

    @Then("I verify '$strAdvisorServiceName' of real estate advisor service name is displayed in jv partner result in jv partner service search")
    public void verifyAdvisorServiceNameIsDisplayedInSearchResultToFilterSelected_ServiceSearch(@Named("strAdvisorServiceName") String strAdvisorServiceName){
        jVPartnerPage.verifyAdvisorServiceNameIsDisplayedInSearchResultToFilterSelected_ServiceSearch(strAdvisorServiceName);
    }

    @Then("I verify '$strAdvisorServiceName' of real estate advisor service name is displayed in jv partner result in jv partner other search")
    public void verifyAdvisorServiceNameIsDisplayedInSearchResultToFilterSelected_OtherSearch(@Named("strAdvisorServiceName") String strAdvisorServiceName){
        jVPartnerPage.verifyAdvisorServiceNameIsDisplayedInSearchResultToFilterSelected_OtherSearch(strAdvisorServiceName);
    }

    @Then("I verify '$strAdvisorServiceName' of real estate advisor service name is not displayed in jv partner result in jv partner project search")
    public void verifyAdvisorServiceNameIsNotDisplayedInSearchResultToFilterSelected_ProjectSearch(@Named("strAdvisorServiceName") String strAdvisorServiceName){
        jVPartnerPage.verifyAdvisorServiceNameIsNotDisplayedInSearchResultToFilterSelected_ProjectSearch(strAdvisorServiceName);
    }

    @Then("I verify '$strAdvisorServiceName' of real estate advisor service name is not displayed in jv partner result")
    public void verifyAdvisorServiceNameInSearchResultToFilterSelectedNotDisplayed(@Named("strAdvisorServiceName") String strAdvisorServiceName){
        jVPartnerPage.verifyAdvisorServiceNameInSearchResultToFilterSelectedNotDisplayed(strAdvisorServiceName);
    }

    @Then("I verify '$strDealSponsorFundName' deal sponsor fund name is displayed in search result when click on matches")
    public void verifyFundNameInSearchResultWhenClickOnMatches(@Named("strDealSponsorFundName") String strDealSponsorFundName){
        jVPartnerPage.verifyFundNameInSearchResultWhenClickOnMatches(strDealSponsorFundName);
    }

    @Then("I verify '$strDealSponsorFundName' deal sponsor fund name is not displayed in search result when click on matches")
    public void verifyFundNameInSearchResultWhenClickOnMatchesNotDisplayed(@Named("strDealSponsorFundName") String strDealSponsorFundName){
        jVPartnerPage.verifyFundNameInSearchResultWhenClickOnMatchesNotDisplayed(strDealSponsorFundName);
    }

    @Then("I verify '$strDealSponsorFundName' deal sponsor fund name is displayed when click on matches of jv partner project search")
    public void verifyFundNameInSearchResultWhenClickOnMatchesDisplayedInProjectSearch(@Named("strDealSponsorFundName") String strDealSponsorFundName){
        jVPartnerPage.verifyFundNameInSearchResultWhenClickOnMatchesDisplayedInProjectSearch(strDealSponsorFundName);
    }

    @Then("I verify '$strDealSponsorFundName' deal sponsor fund name is displayed when click on matches of jv partner equity search")
    public void verifyFundNameInSearchResultWhenClickOnMatchesDisplayedInEquitySearch(@Named("strDealSponsorFundName") String strDealSponsorFundName){
        jVPartnerPage.verifyFundNameInSearchResultWhenClickOnMatchesDisplayedInEquitySearch(strDealSponsorFundName);
    }

    @Then("I verify '$strDealSponsorFundName' deal sponsor fund name is displayed when click on matches of jv partner service search")
    public void verifyFundNameInSearchResultWhenClickOnMatchesDisplayedInServiceSearch(@Named("strDealSponsorFundName") String strDealSponsorFundName){
        jVPartnerPage.verifyFundNameInSearchResultWhenClickOnMatchesDisplayedInServiceSearch(strDealSponsorFundName);
    }

    @Then("I verify '$strDealSponsorFundName' deal sponsor fund name is displayed when click on matches of jv partner other search")
    public void verifyFundNameInSearchResultWhenClickOnMatchesDisplayedInOtherSearch(@Named("strDealSponsorFundName") String strDealSponsorFundName){
        jVPartnerPage.verifyFundNameInSearchResultWhenClickOnMatchesDisplayedInOtherSearch(strDealSponsorFundName);
    }

    @Then("I verify '$strDealSponsorFundName' deal sponsor fund name is not displayed when click on matches of jv partner project search")
    public void verifyFundNameInSearchResultWhenClickOnMatchesNotDisplayedInProjectSearch(@Named("strDealSponsorFundName") String strDealSponsorFundName){
        jVPartnerPage.verifyFundNameInSearchResultWhenClickOnMatchesNotDisplayedInProjectSearch(strDealSponsorFundName);
    }

    @Then("I verify '$strDealSponsorProjectName' of deal sponsor project name is displayed in search result when click on matches")
    public void verifyProjectNameInSearchResultWhenClickOnMatches(@Named("strDealSponsorProjectName") String strDealSponsorProjectName){
        jVPartnerPage.verifyProjectNameInSearchResultWhenClickOnMatches(strDealSponsorProjectName);
    }

    @Then("I verify '$strDealSponsorProjectName' of deal sponsor project name is not displayed in search result when click on matches")
    public void verifyProjectNameInSearchResultWhenClickOnMatchesNotDisplayed(@Named("strDealSponsorProjectName") String strDealSponsorProjectName){
        jVPartnerPage.verifyProjectNameInSearchResultWhenClickOnMatchesNotDisplayed(strDealSponsorProjectName);
    }

    @Then("I verify '$strDealSponsorProjectName' of deal sponsor project name is displayed when click on matches of jv partner project search")
    public void verifyProjectNameInSearchResultWhenClickOnMatchesDisplayedInProjectSearch(@Named("strDealSponsorProjectName") String strDealSponsorProjectName){
        jVPartnerPage.verifyProjectNameInSearchResultWhenClickOnMatchesDisplayedInProjectSearch(strDealSponsorProjectName);
    }

    @Then("I verify '$strDealSponsorProjectName' of deal sponsor project name is displayed when click on matches of jv partner equity search")
    public void verifyProjectNameInSearchResultWhenClickOnMatchesDisplayedInEquitySearch(@Named("strDealSponsorProjectName") String strDealSponsorProjectName){
        jVPartnerPage.verifyProjectNameInSearchResultWhenClickOnMatchesDisplayedInEquitySearch(strDealSponsorProjectName);
    }

    @Then("I verify '$strDealSponsorProjectName' of deal sponsor project name is displayed when click on matches of jv partner services search")
    public void verifyProjectNameInSearchResultWhenClickOnMatchesDisplayedInServicesSearch(@Named("strDealSponsorProjectName") String strDealSponsorProjectName){
        jVPartnerPage.verifyProjectNameInSearchResultWhenClickOnMatchesDisplayedInServicesSearch(strDealSponsorProjectName);
    }

    @Then("I verify '$strDealSponsorProjectName' of deal sponsor project name is displayed when click on matches of jv partner other search")
    public void verifyProjectNameInSearchResultWhenClickOnMatchesDisplayedInOtherSearch(@Named("strDealSponsorProjectName") String strDealSponsorProjectName){
        jVPartnerPage.verifyProjectNameInSearchResultWhenClickOnMatchesDisplayedInOtherSearch(strDealSponsorProjectName);
    }

    @Then("I verify '$strDealSponsorProjectName' of deal sponsor project name is not displayed when click on matches of jv partner project search")
    public void verifyProjectNameInSearchResultWhenClickOnMatchesNotDisplayedInProjectSearch(@Named("strDealSponsorProjectName") String strDealSponsorProjectName){
        jVPartnerPage.verifyProjectNameInSearchResultWhenClickOnMatchesNotDisplayedInProjectSearch(strDealSponsorProjectName);
    }

    @Then("I verify '$strInvestorFundName' of investor fund name is displayed in search result when click on matches")
    public void verifyInvestorFundNameInSearchResultWhenClickOnMatches(@Named("strInvestorFundName") String strInvestorFundName){
        jVPartnerPage.verifyInvestorFundNameInSearchResultWhenClickOnMatches(strInvestorFundName);
    }

    @Then("I verify '$strInvestorFundName' of investor fund name is not displayed in search result when click on matches")
    public void verifyInvestorFundNameInSearchResultWhenClickOnMatchesNotDisplayed(@Named("strInvestorFundName") String strInvestorFundName){
        jVPartnerPage.verifyInvestorFundNameInSearchResultWhenClickOnMatchesNotDisplayed(strInvestorFundName);
    }

    @Then("I verify '$strInvestorFundName' of investor fund name is displayed when click on matches of jv partner project search")
    public void verifyInvestorFundNameInSearchResultWhenClickOnMatchesDisplayedInProjectSearch(@Named("strInvestorFundName") String strInvestorFundName){
        jVPartnerPage.verifyInvestorFundNameInSearchResultWhenClickOnMatchesDisplayedInProjectSearch(strInvestorFundName);
    }

    @Then("I verify '$strInvestorFundName' of investor fund name is displayed when click on matches of jv partner equity search")
    public void verifyInvestorFundNameInSearchResultWhenClickOnMatchesDisplayedInEquitySearch(@Named("strInvestorFundName") String strInvestorFundName){
        jVPartnerPage.verifyInvestorFundNameInSearchResultWhenClickOnMatchesDisplayedInEquitySearch(strInvestorFundName);
    }

    @Then("I verify '$strInvestorFundName' of investor fund name is displayed when click on matches of jv partner services search")
    public void verifyInvestorFundNameInSearchResultWhenClickOnMatchesDisplayedInServicesSearch(@Named("strInvestorFundName") String strInvestorFundName){
        jVPartnerPage.verifyInvestorFundNameInSearchResultWhenClickOnMatchesDisplayedInServicesSearch(strInvestorFundName);
    }

    @Then("I verify '$strInvestorFundName' of investor fund name is displayed when click on matches of jv partner other search")
    public void verifyInvestorFundNameInSearchResultWhenClickOnMatchesDisplayedInOtherSearch(@Named("strInvestorFundName") String strInvestorFundName){
        jVPartnerPage.verifyInvestorFundNameInSearchResultWhenClickOnMatchesDisplayedInOtherSearch(strInvestorFundName);
    }

    @Then("I verify '$strInvestorFundName' of investor fund name is not displayed when click on matches of jv partner project search")
    public void verifyInvestorFundNameInSearchResultWhenClickOnMatchesNotDisplayedInProjectSearch(@Named("strInvestorFundName") String strInvestorFundName){
        jVPartnerPage.verifyInvestorFundNameInSearchResultWhenClickOnMatchesNotDisplayedInProjectSearch(strInvestorFundName);
    }

    @Then("I verify '$strLenderLoanName' of lender loan name is displayed in search result when click on matches")
    public void verifyLenderLoanNameInSearchResultWhenClickOnMatches(@Named("strLenderLoanName") String strLenderLoanName){
        jVPartnerPage.verifyLenderLoanNameInSearchResultWhenClickOnMatches(strLenderLoanName);
    }

    @Then("I verify '$strLenderLoanName' of lender loan name is not displayed in search result when click on matches")
    public void verifyLenderLoanNameInSearchResultWhenClickOnMatchesNotDisplayed(@Named("strLenderLoanName") String strLenderLoanName){
        jVPartnerPage.verifyLenderLoanNameInSearchResultWhenClickOnMatchesNotDisplayed(strLenderLoanName);
    }

    @Then("I verify '$strLenderLoanName' of lender loan name is displayed when click on matches of jv partner project search")
    public void verifyLenderLoanNameInSearchResultWhenClickOnMatchesDisplayedInProjectSearch(@Named("strLenderLoanName") String strLenderLoanName){
        jVPartnerPage.verifyLenderLoanNameInSearchResultWhenClickOnMatchesDisplayedInProjectSearch(strLenderLoanName);
    }

    @Then("I verify '$strLenderLoanName' of lender loan name is displayed when click on matches of jv partner equity search")
    public void verifyLenderLoanNameInSearchResultWhenClickOnMatchesDisplayedInEquitySearch(@Named("strLenderLoanName") String strLenderLoanName){
        jVPartnerPage.verifyLenderLoanNameInSearchResultWhenClickOnMatchesDisplayedInEquitySearch(strLenderLoanName);
    }

    @Then("I verify '$strLenderLoanName' of lender loan name is displayed when click on matches of jv partner service search")
    public void verifyLenderLoanNameInSearchResultWhenClickOnMatchesDisplayedInServiceSearch(@Named("strLenderLoanName") String strLenderLoanName){
        jVPartnerPage.verifyLenderLoanNameInSearchResultWhenClickOnMatchesDisplayedInServiceSearch(strLenderLoanName);
    }

    @Then("I verify '$strLenderLoanName' of lender loan name is displayed when click on matches of jv partner other search")
    public void verifyLenderLoanNameInSearchResultWhenClickOnMatchesDisplayedInOtherSearch(@Named("strLenderLoanName") String strLenderLoanName){
        jVPartnerPage.verifyLenderLoanNameInSearchResultWhenClickOnMatchesDisplayedInOtherSearch(strLenderLoanName);
    }

    @Then("I verify '$strLenderLoanName' of lender loan name is not displayed when click on matches of jv partner project search")
    public void verifyLenderLoanNameInSearchResultWhenClickOnMatchesNotDisplayedInProjectSearch(@Named("strLenderLoanName") String strLenderLoanName){
        jVPartnerPage.verifyLenderLoanNameInSearchResultWhenClickOnMatchesNotDisplayedInProjectSearch(strLenderLoanName);
    }

    @Then("I verify '$strLenderMezzName' of lender mezz name is displayed in search result when click on matches")
    public void verifyLenderMezzNameInSearchResultWhenClickOnMatches(@Named("strLenderMezzName") String strLenderMezzName){
        jVPartnerPage.verifyLenderMezzNameInSearchResultWhenClickOnMatches(strLenderMezzName);
    }

    @Then("I verify '$strLenderMezzName' of lender mezz name is not displayed in search result when click on matches")
    public void verifyLenderMezzNameInSearchResultWhenClickOnMatchesNotDisplayed(@Named("strLenderMezzName") String strLenderMezzName){
        jVPartnerPage.verifyLenderMezzNameInSearchResultWhenClickOnMatchesNotDisplayed(strLenderMezzName);
    }

    @Then("I verify '$strLenderMezzName' of lender mezz name is displayed when click on matches of jv partner project search")
    public void verifyLenderMezzNameInSearchResultWhenClickOnMatchesDisplayedInProjectSearch(@Named("strLenderMezzName") String strLenderMezzName){
        jVPartnerPage.verifyLenderMezzNameInSearchResultWhenClickOnMatchesDisplayedInProjectSearch(strLenderMezzName);
    }

    @Then("I verify '$strLenderMezzName' of lender mezz name is displayed when click on matches of jv partner equity search")
    public void verifyLenderMezzNameInSearchResultWhenClickOnMatchesDisplayedInEquitySearch(@Named("strLenderMezzName") String strLenderMezzName){
        jVPartnerPage.verifyLenderMezzNameInSearchResultWhenClickOnMatchesDisplayedInEquitySearch(strLenderMezzName);
    }

    @Then("I verify '$strLenderMezzName' of lender mezz name is displayed when click on matches of jv partner service search")
    public void verifyLenderMezzNameInSearchResultWhenClickOnMatchesDisplayedInServiceSearch(@Named("strLenderMezzName") String strLenderMezzName){
        jVPartnerPage.verifyLenderMezzNameInSearchResultWhenClickOnMatchesDisplayedInServiceSearch(strLenderMezzName);
    }

    @Then("I verify '$strLenderMezzName' of lender mezz name is displayed when click on matches of jv partner other search")
    public void verifyLenderMezzNameInSearchResultWhenClickOnMatchesDisplayedInOtherSearch(@Named("strLenderMezzName") String strLenderMezzName){
        jVPartnerPage.verifyLenderMezzNameInSearchResultWhenClickOnMatchesDisplayedInOtherSearch(strLenderMezzName);
    }

    @Then("I verify '$strLenderMezzName' of lender mezz name is not displayed when click on matches of jv partner project search")
    public void verifyLenderMezzNameInSearchResultWhenClickOnMatchesNotDisplayedInProjectSearch(@Named("strLenderMezzName") String strLenderMezzName){
        jVPartnerPage.verifyLenderMezzNameInSearchResultWhenClickOnMatchesNotDisplayedInProjectSearch(strLenderMezzName);
    }

    @Then("I verify '$strAdvisorListingName' of real estate advisor listing name is displayed in search result when click on matches")
    public void verifyAdvisorListingNameInSearchResultWhenClickOnMatches(@Named("strAdvisorListingName") String strAdvisorListingName){
        jVPartnerPage.verifyAdvisorListingNameInSearchResultWhenClickOnMatches(strAdvisorListingName);
    }

    @Then("I verify '$strAdvisorListingName' of real estate advisor listing name is not displayed in search result when click on matches")
    public void verifyAdvisorListingNameInSearchResultWhenClickOnMatchesNotDisplayed(@Named("strAdvisorListingName") String strAdvisorListingName){
        jVPartnerPage.verifyAdvisorListingNameInSearchResultWhenClickOnMatchesNotDisplayed(strAdvisorListingName);
    }

    @Then("I verify '$strAdvisorListingName' of real estate advisor listing name is displayed when click on matches of jv partner project search")
    public void verifyAdvisorListingNameInSearchResultWhenClickOnMatchesDisplayedInProjectSearch(@Named("strAdvisorListingName") String strAdvisorListingName){
        jVPartnerPage.verifyAdvisorListingNameInSearchResultWhenClickOnMatchesDisplayedInProjectSearch(strAdvisorListingName);
    }

    @Then("I verify '$strAdvisorListingName' of real estate advisor listing name is displayed when click on matches of jv partner equity search")
    public void verifyAdvisorListingNameInSearchResultWhenClickOnMatchesDisplayedInEquitySearch(@Named("strAdvisorListingName") String strAdvisorListingName){
        jVPartnerPage.verifyAdvisorListingNameInSearchResultWhenClickOnMatchesDisplayedInEquitySearch(strAdvisorListingName);
    }

    @Then("I verify '$strAdvisorListingName' of real estate advisor listing name is displayed when click on matches of jv partner service search")
    public void verifyAdvisorListingNameInSearchResultWhenClickOnMatchesDisplayedInServiceSearch(@Named("strAdvisorListingName") String strAdvisorListingName){
        jVPartnerPage.verifyAdvisorListingNameInSearchResultWhenClickOnMatchesDisplayedInServiceSearch(strAdvisorListingName);
    }

    @Then("I verify '$strAdvisorListingName' of real estate advisor listing name is displayed when click on matches of jv partner other search")
    public void verifyAdvisorListingNameInSearchResultWhenClickOnMatchesDisplayedInOtherSearch(@Named("strAdvisorListingName") String strAdvisorListingName){
        jVPartnerPage.verifyAdvisorListingNameInSearchResultWhenClickOnMatchesDisplayedInOtherSearch(strAdvisorListingName);
    }

    @Then("I verify '$strAdvisorListingName' of real estate advisor listing name is not displayed when click on matches of jv partner project search")
    public void verifyAdvisorListingNameInSearchResultWhenClickOnMatchesNotDisplayedInProjectSearch(@Named("strAdvisorListingName") String strAdvisorListingName){
        jVPartnerPage.verifyAdvisorListingNameInSearchResultWhenClickOnMatchesNotDisplayedInProjectSearch(strAdvisorListingName);
    }

    @Then("I verify '$strAdvisorServiceName' of real estate advisor service name is displayed in search result when click on matches")
       public void verifyAdvisorServiceNameInSearchResultWhenClickOnMatches(@Named("strAdvisorServiceName") String strAdvisorServiceName){
        jVPartnerPage.verifyAdvisorServiceNameInSearchResultWhenClickOnMatches(strAdvisorServiceName);
    }

    @Then("I verify '$strAdvisorServiceName' of real estate advisor service name is not displayed in search result when click on matches")
    public void verifyAdvisorServiceNameInSearchResultWhenClickOnMatchesNotDisplayed(@Named("strAdvisorServiceName") String strAdvisorServiceName){
        jVPartnerPage.verifyAdvisorServiceNameInSearchResultWhenClickOnMatchesNotDisplayed(strAdvisorServiceName);
    }

    @Then("I verify '$strAdvisorServiceName' of real estate advisor service name is displayed when click on matches of jv partner project search")
    public void verifyAdvisorServiceNameInSearchResultWhenClickOnMatchesDisplayedInProjectSearch(@Named("strAdvisorServiceName") String strAdvisorServiceName){
        jVPartnerPage.verifyAdvisorServiceNameInSearchResultWhenClickOnMatchesDisplayedInProjectSearch(strAdvisorServiceName);
    }

    @Then("I verify '$strAdvisorServiceName' of real estate advisor service name is displayed when click on matches of jv partner equity search")
    public void verifyAdvisorServiceNameInSearchResultWhenClickOnMatchesDisplayedInEquitySearch(@Named("strAdvisorServiceName") String strAdvisorServiceName){
        jVPartnerPage.verifyAdvisorServiceNameInSearchResultWhenClickOnMatchesDisplayedInEquitySearch(strAdvisorServiceName);
    }

    @Then("I verify '$strAdvisorServiceName' of real estate advisor service name is displayed when click on matches of jv partner service search")
    public void verifyAdvisorServiceNameInSearchResultWhenClickOnMatchesDisplayedInServiceSearch(@Named("strAdvisorServiceName") String strAdvisorServiceName){
        jVPartnerPage.verifyAdvisorServiceNameInSearchResultWhenClickOnMatchesDisplayedInServiceSearch(strAdvisorServiceName);
    }

    @Then("I verify '$strAdvisorServiceName' of real estate advisor service name is displayed when click on matches of jv partner other search")
    public void verifyAdvisorServiceNameInSearchResultWhenClickOnMatchesDisplayedInOtherSearch(@Named("strAdvisorServiceName") String strAdvisorServiceName){
        jVPartnerPage.verifyAdvisorServiceNameInSearchResultWhenClickOnMatchesDisplayedInOtherSearch(strAdvisorServiceName);
    }

    @Then("I verify '$strAdvisorServiceName' of real estate advisor service name is not displayed when click on matches of jv partner project search")
    public void verifyAdvisorServiceNameInSearchResultWhenClickOnMatchesNotDisplayedInProjectSearch(@Named("strAdvisorServiceName") String strAdvisorServiceName){
        jVPartnerPage.verifyAdvisorServiceNameInSearchResultWhenClickOnMatchesNotDisplayedInProjectSearch(strAdvisorServiceName);
    }

    @Then("I verify '$strInvestorFundName' fund name is not displayed in search result when click on matches")
    public void verifyInvestorFundNameWhenClickOnMatchesNotDisplayed(@Named("strInvestorFundName") String strInvestorFundName){
        jVPartnerPage.verifyInvestorFundNameWhenClickOnMatchesNotDisplayed(strInvestorFundName);
    }

    @When("I clear principal option in route to partnership field")
    public void clearPrincipal(){
        jVPartnerPage.clearPrincipal();
    }

    @When("I clear broker option in route to partnership field")
    public void clearBroker(){
        jVPartnerPage.clearBroker();
    }

    @When("I clear intermediary option in route to partnership field")
    public void clearIntermediary(){
        jVPartnerPage.clearIntermediary();
    }

    @When("I click on your contribution drop down")
    public void clickYourContribution(){
        jVPartnerPage.clickYourContribution();
    }

    @When("I select land option in your contribution field")
    public void selectLandOption(){
        jVPartnerPage.selectLandOption();
    }

    @When("I select service option in your contribution field")
    public void selectServiceOption(){
        jVPartnerPage.selectServiceOption();
    }

    @When("I select other option in your contribution field")
    public void selectOtherOption(){
        jVPartnerPage.selectOtherOption();
    }

    @When("I select project option in your contribution field")
    public void selectProjectOption(){
        jVPartnerPage.selectProjectOption();
    }

    @When("I select equity option in your contribution field")
    public void selectEquityOption(){
        jVPartnerPage.selectEquityOption();
    }

    @When("I clear land option in your contribution field")
    public void clearLandOption(){
        jVPartnerPage.clearLandOption();
    }

    @When("I clear project option in your contribution field")
    public void clearProjectOption(){
        jVPartnerPage.clearProjectOption();
    }

    @When("I clear equity option in your contribution field")
    public void clearEquityOption(){
        jVPartnerPage.clearEquityOption();
    }

    @When("I clear service option in your contribution field")
    public void clearServiceOption(){
        jVPartnerPage.clearServiceOption();
    }

    @When("I clear other option in your contribution field")
    public void clearOtherOption(){
        jVPartnerPage.clearOtherOption();
    }

    @When("I enter the location of the deal sponsor field")
    public void selectLocationOfUser(){
        jVPartnerPage.selectLocationOfUser();
    }

    @When("I enter the location in location field of project search")
    public void selectLocationInProjectSearch(){
        jVPartnerPage.selectLocationInProjectSearch();
    }

    @When("I enter the location in location field of equity search")
    public void selectLocationInEquitySearch(){
        jVPartnerPage.selectLocationInEquitySearch();
    }

    @When("I enter the location in location field of service search")
    public void selectLocationInServiceSearch(){
        jVPartnerPage.selectLocationInServiceSearch();
    }

    @When("I enter the location in location field of other search")
    public void selectLocationInOtherSearch(){
        jVPartnerPage.selectLocationInOtherSearch();
    }

    @When("I clear the location of the deal sponsor field")
    public void clearLocation(){
        jVPartnerPage.clearLocation();
    }

    @When("I click on asset type drop down")
    public void clickAssetTypeDropDown_JVPartner(){
        jVPartnerPage.clickAssetTypeDropDown_JVPartner();
    }

    @When("I select office option in asset type drop down")
    public void selectOfficeInAssetType(){
        jVPartnerPage.selectOfficeInAssetType();
    }

    @When("I select multi family option in asset type drop down")
    public void selectMultiFamilyInAssetType(){
        jVPartnerPage.selectMultiFamilyInAssetType();
    }

    @When("I select hotel option in asset type drop down")
    public void selectHotelInAssetType(){
        jVPartnerPage.selectHotelInAssetType();
    }

    @When("I select health care option in asset type drop down of jv partner search")
    public void selectHealthCareInAssetType(){
        jVPartnerPage.selectHealthCareInAssetType();
    }

    @When("I select mixed use option in asset type drop down of jv partner search")
    public void selectMixedUseInAssetType(){
        jVPartnerPage.selectMixedUseInAssetType();
    }

    @When("I clear office option in asset type drop down")
    public void clearOfficeInAssetType(){
        jVPartnerPage.clearOfficeInAssetType();
    }

    @When("I clear multi family option in asset type drop down")
    public void clearMultiFamilyInAssetType(){
        jVPartnerPage.clearMultiFamilyInAssetType();
    }

    @When("I clear hotel option in asset type drop down")
    public void clearHotelInAssetType(){
        jVPartnerPage.clearHotelInAssetType();
    }

    @When("I clear health care option in asset type drop down")
    public void clearHealthCareInAssetType(){
        jVPartnerPage.clearHealthCareInAssetType();
    }

    @When("I clear mixed use option in asset type drop down")
    public void clearMixedUseInAssetType(){
        jVPartnerPage.clearMixedUseInAssetType();
    }

    @When("I click on risk profile drop down")
    public void clickRiskProfileDropDown_JVPartner(){
        jVPartnerPage.clickRiskProfileDropDown_JVPartner();
    }

    @When("I select core option in risk profile drop down field")
    public void selectCoreOptionInRiskProfile_JVPartner(){
        jVPartnerPage.selectCoreOptionInRiskProfile_JVPartner();
    }

    @When("I select core plus option in risk profile drop down field")
    public void selectCorePlusOptionInRiskProfile_JVPartner(){
        jVPartnerPage.selectCorePlusOptionInRiskProfile_JVPartner();
    }

    @When("I select value add option in risk profile drop down field")
    public void selectValueAddOptionInRiskProfile_JVPartner(){
        jVPartnerPage.selectValueAddOptionInRiskProfile_JVPartner();
    }

    @When("I select development option in risk profile drop down field")
    public void selectDevelopmentOptionInRiskProfile_JVPartner(){
        jVPartnerPage.selectDevelopmentOptionInRiskProfile_JVPartner();
    }

    @When("I select opportunistic option in risk profile drop down field")
    public void selectOpportunisticOptionInRiskProfile_JVPartner(){
        jVPartnerPage.selectOpportunisticOptionInRiskProfile_JVPartner();
    }

    @When("I clear core option in risk profile drop down field")
    public void clearCoreOptionInRiskProfile_JVPartner(){
        jVPartnerPage.clearCoreOptionInRiskProfile_JVPartner();
    }

    @When("I clear core plus option in risk profile drop down field")
    public void clearCorePlusOptionInRiskProfile_JVPartner(){
        jVPartnerPage.clearCorePlusOptionInRiskProfile_JVPartner();
    }

    @When("I clear value add option in risk profile drop down field")
    public void clearValueAddOptionInRiskProfile_JVPartner(){
        jVPartnerPage.clearValueAddOptionInRiskProfile_JVPartner();
    }

    @When("I clear development option in risk profile drop down field")
    public void clearDevelopmentOptionInRiskProfile_JVPartner(){
        jVPartnerPage.clearDevelopmentOptionInRiskProfile_JVPartner();
    }

    @When("I clear opportunistic option in risk profile drop down field")
    public void clearOpportunisticOptionInRiskProfile_JVPartner(){
        jVPartnerPage.clearOpportunisticOptionInRiskProfile_JVPartner();
    }

    /*@When("I click on deal stage drop down")
    public void clickDealStageDropDown_JVPartner(){
        jVPartnerPage.clickDealStageDropDown_JVPartner();
    }*/

    @When("I select owned option in deal stage drop down of jv partner search")
    public void selectOwnedOptionInDealStage_JVPartner(){
        jVPartnerPage.selectOwnedOptionInDealStage_JVPartner();
    }

    @When("I select under contract option in deal stage drop down of jv partner search")
    public void selectUnderContractOptionInDealStage_JVPartner(){
        jVPartnerPage.selectUnderContractOptionInDealStage_JVPartner();
    }

    @When("I select concept option in deal stage drop down of jv partner search")
    public void selectConceptOptionInDealStage_JVPartner(){
        jVPartnerPage.selectConceptOptionInDealStage_JVPartner();
    }

    @When("I select plans approved option in deal stage drop down of jv partner search")
    public void selectPlanApprovedOptionInDealStage_JVPartner(){
        jVPartnerPage.selectPlanApprovedOptionInDealStage_JVPartner();
    }

    @When("I select permitted option in deal stage drop down of jv partner search")
    public void selectPermittedOptionInDealStage_JVPartner(){
        jVPartnerPage.selectPermittedOptionInDealStage_JVPartner();
    }

    @When("I clear owned option in deal stage drop down of jv partner search")
    public void ClearOwnedOptionInDealStage_JVPartner(){
        jVPartnerPage.ClearOwnedOptionInDealStage_JVPartner();
    }

    @When("I clear under contract option in deal stage drop down of jv partner search")
    public void clearUnderContractOptionInDealStage_JVPartner(){
        jVPartnerPage.clearUnderContractOptionInDealStage_JVPartner();
    }

    @When("I clear concept option in deal stage drop down of jv partner search")
    public void clearConceptOptionInDealStage_JVPartner(){
        jVPartnerPage.clearConceptOptionInDealStage_JVPartner();
    }

    @When("I clear plans approved option in deal stage drop down of jv partner search")
    public void clearPlanApprovedOptionInDealStage_JVPartner(){
        jVPartnerPage.clearPlanApprovedOptionInDealStage_JVPartner();
    }

    @When("I clear permitted option in deal stage drop down of jv partner search")
    public void clearPermittedOptionInDealStage_JVPartner(){
        jVPartnerPage.clearPermittedOptionInDealStage_JVPartner();
    }

    @When("I click on current asset status drop down")
    public void clickCurrentAssetStatusDropDown_JVPartner(){
        jVPartnerPage.clickCurrentAssetStatusDropDown_JVPartner();
    }

    @When("I select fully rented option in current asset status drop down")
    public void selectFullyRentedOptionInCurrentAssetStatus_JVPartner(){
        jVPartnerPage.selectFullyRentedOptionInCurrentAssetStatus_JVPartner();
    }

    @When("I select reo option in current asset status drop down")
    public void selectREOOptionInCurrentAssetStatus_JVPartner(){
        jVPartnerPage.selectREOOptionInCurrentAssetStatus_JVPartner();
    }

    @When("I select partially stabilized option in current asset status drop down")
    public void selectPartiallyStabilizedOptionInCurrentAssetStatus_JVPartner(){
        jVPartnerPage.selectPartiallyStabilizedOptionInCurrentAssetStatus_JVPartner();
    }

    @When("I select vacant structure option in current asset status drop down")
    public void selectVacantStructureOptionInCurrentAssetStatus_JVPartner(){
        jVPartnerPage.selectVacantStructureOptionInCurrentAssetStatus_JVPartner();
    }

    @When("I select partially rented option in current asset status drop down")
    public void selectPartiallyRentedOptionInCurrentAssetStatus_JVPartner(){
        jVPartnerPage.selectPartiallyRentedOptionInCurrentAssetStatus_JVPartner();
    }

    @When("I clear fully rented option in current asset status drop down")
    public void clearFullyRentedOptionInCurrentAssetStatus_JVPartner(){
        jVPartnerPage.clearFullyRentedOptionInCurrentAssetStatus_JVPartner();
    }

    @When("I clear reo option in current asset status drop down")
    public void clearREOOptionInCurrentAssetStatus_JVPartner(){
        jVPartnerPage.clearREOOptionInCurrentAssetStatus_JVPartner();
    }

    @When("I clear partially stabilized option in current asset status drop down")
    public void clearPartiallyStablilizedOptionInCurrentAssetStatus_JVPartner(){
        jVPartnerPage.clearPartiallyStablilizedOptionInCurrentAssetStatus_JVPartner();
    }

    @When("I clear vacant structure option in current asset status drop down")
    public void clearVacantStructureOptionInCurrentAssetStatus_JVPartner(){
        jVPartnerPage.clearVacantStructureOptionInCurrentAssetStatus_JVPartner();
    }

    @When("I clear partially rented option in current asset status drop down")
    public void clearPartiallyRentedOptionInCurrentAssetStatus_JVPartner(){
        jVPartnerPage.clearPartiallyRentedOptionInCurrentAssetStatus_JVPartner();
    }

    @When("I select asset strategy drop down")
    public void selectAssetStrategy_JVPartner(){
        jVPartnerPage.selectAssetStrategy_JVPartner();
    }

    @When("I select acquisition option in asset strategy drop down")
    public void selectAcquisitionOptionInAssetStrategy_JVPartner(){
        jVPartnerPage.selectAcquisitionOptionInAssetStrategy_JVPartner();
    }

    @When("I select platform build option in asset strategy drop down")
    public void selectPlatFormBuildOptionInAssetStrategy_JVPartner(){
        jVPartnerPage.selectPlatFormBuildOptionInAssetStrategy_JVPartner();
    }

    @When("I select sales leaseback option in asset strategy drop down")
    public void selectSalesAndLeaseBackOptionInAssetStrategy_JVPartner(){
        jVPartnerPage.selectSalesAndLeaseBackOptionInAssetStrategy_JVPartner();
    }

    @When("I select stable income producing option in asset strategy drop down")
    public void selectStableIncomeProducingOptionInAssetStrategy_JVPartner(){
        jVPartnerPage.selectStableIncomeProducingOptionInAssetStrategy_JVPartner();
    }

    @When("I clear acquisition option in asset strategy drop down")
    public void clearAcquisitionOptionInAssetStrategy_JVPartner(){
        jVPartnerPage.clearAcquisitionOptionInAssetStrategy_JVPartner();
    }

    @When("I clear platform build option in asset strategy drop down")
    public void clearPlatformBuildOptionInAssetStrategy_JVPartner(){
        jVPartnerPage.clearPlatformBuildOptionInAssetStrategy_JVPartner();
    }

    @When("I clear sales leaseback option in asset strategy drop down")
    public void clearSalesLeaseBackOptionInAssetStrategy_JVPartner(){
        jVPartnerPage.clearSalesLeaseBackOptionInAssetStrategy_JVPartner();
    }

    @When("I select pursuit option in asset strategy drop down")
    public void selectPursuitOptionInAssetStrategy_JVPartner(){
        jVPartnerPage.selectPursuitOptionInAssetStrategy_JVPartner();
    }

    @When("I clear pursuit option in asset strategy drop down")
    public void clearPursuitOptionInAssetStrategy_JVPartner(){
        jVPartnerPage.clearPursuitOptionInAssetStrategy_JVPartner();
    }

    @When("I clear stable income producing option in asset strategy drop down")
    public void clearStableIncomeProducingOptionInAssetStrategy_JVPartner(){
        jVPartnerPage.clearStableIncomeProducingOptionInAssetStrategy_JVPartner();
    }

    @When("I click on post to market place link")
    public void clickMarketPlaceLinkInCompanyTabOfUserProfile(){
        jVPartnerPage.clickMarketPlaceLinkInCompanyTabOfUserProfile();
    }

}
