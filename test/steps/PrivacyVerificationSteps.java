package test.steps;

import com.google.inject.Inject;
import org.jbehave.core.annotations.*;
import test.pages.PageFactory;
import test.pages.PrivacyVerificationPage;

/**
 * Created with IntelliJ IDEA.
 * User: Bhavana
 * Date: 6/23/14
 * Time: 12:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class PrivacyVerificationSteps {
    private final PrivacyVerificationPage privacyVerificationPage;

    @Inject
    public PrivacyVerificationSteps(PageFactory thePageFactory) {
        privacyVerificationPage = thePageFactory.newSearchResultsPage();
    }

    @Then("I verify '$lStrUserName' deal sponsor user name is displayed in search result")
        @Aliases(values={"I verify '$lStrUserName' investor user name is displayed in search result",
                         "I verify '$lStrUserName' lender user name is displayed in search result",
                         "I verify '$lStrUserName' real estate advisor,broker user name is displayed in search result"})
    public void verifyUserName(@Named("lStrUserName") String lStrUserName){
        privacyVerificationPage.verifyUserName(lStrUserName);
    }

    @When("I click on '$lStrUserName' deal sponsor user name in search result")
        @Aliases(values={"I click on '$lStrUserName' investor user name in search result",
                         "I click on '$lStrUserName' lender user name in search result",
                         "I click on '$lStrUserName' real estate advisor,broker user name in search result"})
    public void clickDealSponsorUserName(@Named("lStrUserName") String lStrUserName){
        privacyVerificationPage.clickDealSponsorUserName(lStrUserName);
    }

    @Then("I verify '$lStrCompanyName' deal sponsor company name is displayed in search result")
        @Aliases(values = {"I verify '$lStrCompanyName' investor company name is displayed in search result",
                            "I verify '$lStrCompanyName' lender company name is displayed in search result",
                            "I verify '$lStrCompanyName' real estate advisor company name is displayed in search result"})
    public void verifyCompanyName(@Named("lStrCompanyName") String lStrCompanyName){
        privacyVerificationPage.verifyCompanyName(lStrCompanyName);
    }

    @Then("I verify '$lStrCompanyName' deal sponsor company name who set profile to private is displayed in search result")
    @Aliases(values = {"I verify '$lStrCompanyName' investor company name who set profile to private is displayed in search result",
            "I verify '$lStrCompanyName' lender company name who set profile to private is displayed in search result",
            "I verify '$lStrCompanyName' real estate advisor company name who set profile to private is displayed in search result"})
    public void verifyCompanyName_Private(@Named("lStrCompanyName") String lStrCompanyName){
        privacyVerificationPage.verifyCompanyName_Private(lStrCompanyName);
    }

    @When("I click on '$lStrCompanyName' deal sponsor company name in search result")
        @Aliases(values = {"I click on '$lStrCompanyName' investor company name in search result",
                            "I click on '$lStrCompanyName' lender company name in search result",
                            "I click on '$lStrCompanyName' real estate advisor company name in search result"})
    public void clickCompanyName(@Named("lStrCompanyName") String lStrCompanyName){
        privacyVerificationPage.clickCompanyName(lStrCompanyName);
    }

    @When("I click on '$lStrCompanyName' deal sponsor company name who set profile to private in search result")
    @Aliases(values = {"I click on '$lStrCompanyName' investor company name who set profile to private in search result",
            "I click on '$lStrCompanyName' lender company name who set profile to private in search result",
            "I click on '$lStrCompanyName' real estate advisor company name who set profile to private in search result"})
    public void clickCompanyName_Private(@Named("lStrCompanyName") String lStrCompanyName){
        privacyVerificationPage.clickCompanyName_Private(lStrCompanyName);
    }

    @Then("I verify '$lStrProjectName' deal sponsor project name is displayed in search result")
    public void verifyProjectName(@Named("lStrProjectName") String lStrProjectName){
        privacyVerificationPage.verifyProjectName(lStrProjectName);
    }

    @Then("I verify '$lStrFundName' deal sponsor fund name is displayed in search result")
        @Aliases(values = {"I verify '$lStrFundName' investor fund name is displayed in search result"})
    public void verifyFundName(@Named("lStrFundName") String lStrFundName){
        privacyVerificationPage.verifyFundName(lStrFundName);
    }

    @Then("I verify '$lStrLoanName' lender loan name is displayed in search result")
    @Alias("I verify '$lStrLoanName' lender mezz name is displayed in search result")
    public void verifyLoanName(@Named("lStrLoanName") String lStrLoanName){
        privacyVerificationPage.verifyLoanName(lStrLoanName);
    }

    @When("I click on '$lStrProjectName' deal sponsor project name in search result")
    public void clickDealSponsorProjectName(@Named("lStrProjectName") String lStrProjectName){
        privacyVerificationPage.clickDealSponsorProjectName(lStrProjectName);
    }

    @When("I click on '$lStrFundName' deal sponsor fund name in search result")
        @Aliases(values = {"I click on '$lStrFundName' investor fund name in search result"})
    public void clickDealSponsorFundName(@Named("lStrFundName") String lStrFundName){
        privacyVerificationPage.clickAllRolesProjectsFundLoanName(lStrFundName);
    }

    @When("I click on '$lStrLoanName' lender loan name in search result")
    @Alias("I click on '$lStrLoanName' lender mezz name in search result")
    public void clickLenderLoanName(@Named("lStrLoanName") String lStrLoanName){
        privacyVerificationPage.clickAllRolesProjectsFundLoanName(lStrLoanName);
    }

    @Then("I verify deal sponsor user whose profile is set private is not displayed")
    public void verifyDealSponsorProfileNotDisplayed() throws Exception {
        privacyVerificationPage.verifyUserProfileNotDisplayed(1);
    }

    @Then("I verify user whose profile is set to include in my universe is not displayed")
        @Alias("I verify user whose profile is set to exclude in my universe is not displayed")
    public void verifyUserProfileSetToIncludeNotDisplayed() throws Exception {
        privacyVerificationPage.verifyUserProfileSetToIncludeNotDisplayed(5);
    }

    @Then("I verify deal sponsor project whose profile is set public in include of my universe is not displayed")
        @Alias("I verify deal sponsor project whose profile is set public in exclude of my universe is not displayed")
    public void verifyProjectOfDealSponsorSetToIncludeNotDisplayed() {
        privacyVerificationPage.verifyProjectNotDisplayed(3);
    }

    @Then("I verify deal sponsor project whose profile is set in my universe is not displayed")
    public void verifyProjectOfDealSponsorNotDisplayed() {
        privacyVerificationPage.verifyProjectNotDisplayedInSearch(3);
    }

    @Then("I verify investor fund whose profile privacy is set in include of my universe is not displayed")
    public void verifyFundOfInvestorSetToIncludeNotDisplayed() throws Exception {
        privacyVerificationPage.verifyFundNotDisplayed(5);
    }

    @Then("I verify investor fund whose profile privacy is set to private in include of my universe is not displayed")
        @Alias("I verify investor fund whose profile privacy is set to exclude of my universe is not displayed")
    public void verifyFundOfInvestorSetToIncludeNotDisplayed_Private()  {
        privacyVerificationPage.verifyFundOfInvestorSetToIncludeNotDisplayed_Private(5);
    }

    @Then("I verify deal sponsor fund whose profile is set public in include of my universe is not displayed")
    public void verifyFundOfDealSponsorSetToIncludeNotDisplayed() {
        privacyVerificationPage.verifyFundNotDisplayed(4);
    }

    @Then("I verify deal sponsor fund whose profile is set in my universe is not displayed")
    public void verifyFundOfDealSponsorNotDisplayed() {
        privacyVerificationPage.verifyFundNotDisplayedInSearch(4);
    }

    @Then("I verify company whose profile is set to include in my universe is not displayed")
    public void verifyCompanyProfileSetToIncludeNotDisplayed() throws Exception {
        privacyVerificationPage.verifyCompanyProfileSetToIncludeNotDisplayed(5);
    }

    @Then("I verify company whose profile is set to exclude in my universe is not displayed")
    public void verifyCompanyProfileSetToExcludeNotDisplayed() {
        privacyVerificationPage.verifyCompanyProfileSetToExcludeNotDisplayed(5);
    }

    @Then("I verify investor company whose profile is set private in include of my universe is not displayed")
    public void verifyInvestorCompanyProfileSetToIncludeNotDisplayed() throws Exception {
        privacyVerificationPage.verifyCompanyProfileSetToIncludeNotDisplayed(6);
    }

    @Then("I verify investor company whose profile is set private in exclude of my universe is not displayed")
    public void verifyInvestorCompanyProfileSetToExcludeNotDisplayed() throws Exception {
        privacyVerificationPage.verifyCompanyProfileSetToIncludeNotDisplayed(6);
    }

    @Then("I verify deal sponsor company whose profile is set private in include of my universe is not displayed")
    public void verifyDealSponsorCompanyProfileSetToIncludeNotDisplayed() throws Exception {
        privacyVerificationPage.verifyCompanyProfileSetToIncludeNotDisplayed(7);
    }

    @Then("I verify real estate advisor company whose profile is set private in include of my universe is not displayed")
    public void verifyRealEstateAdvisorCompanyProfileSetToIncludeNotDisplayed() throws Exception {
        privacyVerificationPage.verifyCompanyProfileSetToIncludeNotDisplayed(8);
    }

    @Then("I verify lender company whose profile is set private in include of my universe is not displayed")
    public void verifyLenderCompanyProfileSetToIncludeNotDisplayed() throws Exception {
        privacyVerificationPage.verifyCompanyProfileSetToIncludeNotDisplayed(9);
    }

    @Then("I verify user whose profile is set to private in me tab of include in my universe is not displayed")
     public void verifyInvestorUserProfileSetToPrivateIncludeNotDisplayed() throws Exception {
        privacyVerificationPage.verifyUserProfileSetToIncludeNotDisplayed(6);
    }

    @Then("I verify deal sponsor user whose profile is set to private in me tab of include in my universe is not displayed")
    public void verifyDealSponsorUserProfileSetToPrivateIncludeNotDisplayed() throws Exception {
        privacyVerificationPage.verifyUserProfileSetToIncludeNotDisplayed(7);
    }

    @Then("I verify real estate advisor user whose profile is set to private in me tab of include in my universe is not displayed")
    public void verifyRealEstateAdvisorUserProfileSetToPrivateIncludeNotDisplayed() throws Exception {
        privacyVerificationPage.verifyUserProfileSetToIncludeNotDisplayed(8);
    }

    @Then("I verify lender user whose profile is set to private in me tab of include in my universe is not displayed")
    public void verifyLenderUserProfileSetToPrivateIncludeNotDisplayed() throws Exception {
        privacyVerificationPage.verifyUserProfileSetToIncludeNotDisplayed(9);
    }

    @Then("I verify investor user whose profile is set private is not displayed")
    public void verifyInvestorProfileNotDisplayed() throws Exception {
        privacyVerificationPage.verifyUserProfileNotDisplayed(2);
    }

    @Then("I verify lender user whose profile is set private is not displayed")
    public void verifyLenderProfileNotDisplayed() throws Exception {
        privacyVerificationPage.verifyUserProfileNotDisplayed(3);
    }

    @Then("I verify real estate advisor,broker user whose profile is set private is not displayed")
    public void verifyRealEstateAdvisorBrokerProfileNotDisplayed() throws Exception {
        privacyVerificationPage.verifyUserProfileNotDisplayed(4);
    }

    @Then("I verify deal sponsor company whose profile is set private is not displayed")
    public void verifyDealSponsorCompanyNotDisplayed() throws Exception {
        privacyVerificationPage.verifyCompanyProfileNotDisplayed(1);
    }

    @Then("I verify investor company whose profile is set private is not displayed")
    public void verifyInvestorCompanyNotDisplayed() throws Exception {
        privacyVerificationPage.verifyCompanyProfileNotDisplayed(2);
    }

    @Then("I verify lender company whose profile is set private is not displayed")
    public void verifyLenderCompanyNotDisplayed() throws Exception {
        privacyVerificationPage.verifyCompanyProfileNotDisplayed(3);
    }


    @Then("I verify lender company name whose profile is set private is not displayed")
    public void verifyLenderCompanyNotDisplayed_Private(){
        privacyVerificationPage.verifyLenderCompanyNotDisplayed_Private(3);
    }

    @Then("I verify real estate advisor company whose profile is set private is not displayed")
    public void verifyRealEstateAdvisorCompanyNotDisplayed() throws Exception {
        privacyVerificationPage.verifyCompanyProfileNotDisplayed(4);
    }

    @Then("I verify deal sponsor project profile is set to private is not displayed")
    public void verifyDealSponsorProjectNotDisplayed()throws Exception {
        privacyVerificationPage.verifyProjectNotDisplayed(1);
    }

    @Then("I verify deal sponsor fund profile is set to private is not displayed")
    public void verifyDealSponsorFundNotDisplayed()throws Exception {
        privacyVerificationPage.verifyFundNotDisplayed(1);
    }

    @Then("I verify investor fund profile is set to private is not displayed")
    public void verifyInvestorFundNotDisplayed()throws Exception {
        privacyVerificationPage.verifyFundNotDisplayed(2);
    }

    @Then("I verify lender loan profile is set to private is not displayed")
    public void verifyLenderLoanNotDisplayed()throws Exception {
        privacyVerificationPage.verifyLoanNotDisplayed(1);
    }

    @Then("I verify lender loan whose profile is set public in include of my universe is not displayed")
        @Aliases(values = {"I verify lender loan whose privacy is set in include of my universe is not displayed",
                "I verify lender loan whose profile is set public in exclude of my universe is not displayed"})
    public void verifyLenderLoanNotDisplayed_MyUniverse() {
        privacyVerificationPage.verifyLoanNotDisplayed(2);
    }

    @Then("I verify lender loan whose profile is set my universe is not displayed")
    public void verifyLenderLoanNotDisplayedInMyUniverse() {
        privacyVerificationPage.verifyLenderLoanNotDisplayedInMyUniverse(2);
    }

    @Then("I verify property service provider service profile is set to private is not displayed")
    public void verifyPropertyServiceProviderServiceNotDisplayed()throws Exception {
        privacyVerificationPage.verifyPropertyServiceProviderServiceNotDisplayed(1);
    }

    @Then("I verify property service provider service profile whose privacy is set to my universe include is not displayed")
    public void verifyPropertyServiceProviderServiceInMyUniverseNotDisplayed()throws Exception {
        privacyVerificationPage.verifyPropertyServiceProviderServiceNotDisplayed(2);
    }

    @Then("I verify lender mezz profile is set to private is not displayed")
    public void verifyLenderMezzNotDisplayed()throws Exception {
        privacyVerificationPage.verifyMezzNotDisplayed(1);
    }

    @Then("I verify lender mezz whose profile is set public in include of my universe is not displayed")
    @Alias("I verify lender mezz whose profile is set in exclude of my universe is not displayed")
    public void verifyLenderMezzNotDisplayed_MyUniverse(){
        privacyVerificationPage.verifyMezzNotDisplayed(2);
    }

    @Then("I verify lender mezz whose profile is set in my universe is not displayed")
    public void verifyLenderMezzNotDisplayedInMyUniverse(){
        privacyVerificationPage.verifyLenderMezzNotDisplayedInMyUniverse(2);
    }

    @Then("I verify property service provide listing profile is set to private is not displayed")
    public void verifyPropertyServiceProviderListingNotDisplayed()throws Exception {
        privacyVerificationPage.verifyPropertyServiceProviderListingNotDisplayed(1);
    }

    @Then("I verify property service provider listing profile whose privacy is set to my universe include is not displayed")
    public void verifyPropertyServiceProviderListingInMyUniverseIncludeNotDisplayed()throws Exception {
        privacyVerificationPage.verifyPropertyServiceProviderListingNotDisplayed(2);
    }

    @Then("I verify '$lStrProjectOfServiceProviderName' property service provider service name is displayed in search result")
     @Alias("I verify '$lStrProjectOfServiceProviderName' property service provider listing name is displayed in search result")
    public void verifyProjectOfServiceProviderName(@Named("$lStrProjectOfServiceProviderName") String lStrProjectOfServiceProviderName){
        privacyVerificationPage.verifyProjectOfServiceProviderName(lStrProjectOfServiceProviderName);
    }

    @When("I click on '$lStrLoanName' property service provider service name in search result")
     @Alias("I click on '$lStrLoanName' property service provider listing name in search result")
    public void clickProjectOfServiceProviderName(@Named("lStrLoanName") String lStrLoanName){
        privacyVerificationPage.clickAllRolesProjectsFundLoanName(lStrLoanName);
    }
}
