package test.steps;

import com.google.inject.Inject;
import org.jbehave.core.annotations.*;
import test.pages.MyUniversePage;
import test.pages.PageFactory;

/**
 * Created with IntelliJ IDEA.
 * User: Bhavana
 * Date: 7/3/14
 * Time: 4:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyUniverseSteps {
    private final MyUniversePage myUniversePage;

    @Inject
    public MyUniverseSteps(PageFactory thePageFactory) {
        myUniversePage = thePageFactory.newMyUniversePage();
    }

    @When("I click on close tutorial field")
    public void clickCloseTutorialField(){
        myUniversePage.clickCloseTutorialField();
    }

    @When("I click on my universe radio button")
    public void clickMyUniverseRadioButton(){
        myUniversePage.clickMyUniverseRadioButton();
    }

    @When("I click on include radio button")
    public void clickIncludeRadioButton(){
       myUniversePage.clickIncludeRadioButton();
    }

    @When("I click on exclude radio button")
    public void clickExcludeRadioButton(){
        myUniversePage.clickExcludeRadioButton();
    }

    @When("I select deal sponsor check box")
    public void selectDealSponsorCheckBox(){
        myUniversePage.selectDealSponsorCheckBox();
    }

    @When("I select deal sponsor check box in my universe exclude")
    public void selectDealSponsorCheckBoxInExclude(){
        myUniversePage.selectDealSponsorCheckBoxInExclude();
    }

    @When("I select investor check box in my universe exclude")
    public void selectInvestorCheckBoxInExclude(){
        myUniversePage.selectInvestorCheckBoxInExclude();
    }

    @When("I select lender check box in my universe exclude")
    public void selectLenderCheckBoxInExclude(){
        myUniversePage.selectLenderCheckBoxInExclude();
    }

    @When("I select real estate advisor check box in my universe exclude")
    public void selectRealEstateAdvisorCheckBoxInExclude(){
        myUniversePage.selectRealEstateAdvisorCheckBoxInExclude();
    }

    @When("I select investor check box")
    public void selectInvestorCheckBox(){
        myUniversePage.selectInvestorCheckBox();
    }

    @When("I select lender check box")
    public void selectLenderCheckBox(){
        myUniversePage.selectLenderCheckBox();
    }

    @When("I select real estate advisor check box")
    public void selectRealEstateAdvisorCheckBox(){
        myUniversePage.selectRealEstateAdvisorCheckBox();
    }

    @When("I clear deal sponsor check box")
    public void clearDealSponsorCheckBox(){
        myUniversePage.clearDealSponsorCheckBox();
    }

    @When("I clear investor check box")
    public void clearInvestorCheckBox(){
        myUniversePage.clearInvestorCheckBox();
    }

    @When("I clear lender check box")
    public void clearLenderCheckBox(){
        myUniversePage.clearLenderCheckBox();
    }

    @When("I clear real estate advisor check box")
    public void clearRealEstateAdvisorCheckBox(){
        myUniversePage.clearRealEstateAdvisorCheckBox();
    }

    @When("I select sub role field of deal sponsor")
    public void selectSubRoleField_DealSponsor(){
        myUniversePage.selectSubRoleField_DealSponsor();
    }

    @When("I select sub role field of deal sponsor in my universe exclude")
    public void selectSubRoleField_DealSponsorInMyUniverseExclude(){
        myUniversePage.selectSubRoleField_DealSponsorInMyUniverseExclude();
    }

    @When("I select sub role field of investor in my universe exclude")
    public void selectSubRoleField_InvestorInMyUniverseExclude(){
        myUniversePage.selectSubRoleField_InvestorInMyUniverseExclude();
    }

    @When("I select sub role field of lender in my universe exclude")
    public void selectSubRoleField_LenderInMyUniverseExclude(){
        myUniversePage.selectSubRoleField_LenderInMyUniverseExclude();
    }

    @When("I select sub role field of real estate advisor in my universe exclude")
    public void selectSubRoleField_RealEstateAdvisorInMyUniverseExclude(){
        myUniversePage.selectSubRoleField_RealEstateAdvisorInMyUniverseExclude();
    }

    @When("I select sub role field of investor")
    public void selectSubRoleField_Investor(){
        myUniversePage.selectSubRoleField_Investor();
    }

    @When("I select sub role field of lender")
    public void selectSubRoleField_Lender(){
        myUniversePage.selectSubRoleField_Lender();
    }

    @When("I select sub role field of real estate advisor")
    public void selectSubRoleField_RealEstateAdvisor(){
        myUniversePage.selectSubRoleField_RealEstateAdvisor();
    }

    @When("I select developer sub role option")
    public void selectDeveloperOption(){
        myUniversePage.selectDeveloperOption();
    }

    @When("I select developer sub role option in my universe exclude")
    public void selectDeveloperOptionInMyUniverseExclude(){
        myUniversePage.selectDeveloperOptionInMyUniverseExclude();
    }

    @When("I select advisor sub role option in my universe exclude")
    public void selectAdvisorOptionInMyUniverseExclude(){
        myUniversePage.selectAdvisorOptionInMyUniverseExclude();
    }

    @When("I select family office sub role option in my universe exclude")
    public void selectFamilyOfficeOptionInMyUniverseExclude(){
        myUniversePage.selectFamilyOfficeOptionInMyUniverseExclude();
    }

    @When("I select advisor sub role option in my universe exclude of real estate advisor")
    public void selectAdvisorOptionInMyUniverseExclude_RealEstateAdvisor(){
        myUniversePage.selectAdvisorOptionInMyUniverseExclude_RealEstateAdvisor();
    }

    @When("I select advisor sub role option")
    public void selectAdvisorOption(){
        myUniversePage.selectAdvisorOption();
    }

    @When("I select family office sub role option")
    public void selectFamilyOfficeOption(){
        myUniversePage.selectFamilyOfficeOption();
    }

    @When("I select advisor sub role option in real estate advisor")
    public void selectAdvisorOption_RealEstateAdvisor(){
        myUniversePage.selectAdvisorOption_RealEstateAdvisor();
    }

    @When("I clear advisor sub role option")
    public void clearAdvisorOption(){
        myUniversePage.clearAdvisorOption();
    }

    @When("I clear family office sub role option")
    public void clearFamilyOfficeOption(){
        myUniversePage.clearFamilyOfficeOption();
    }

    @When("I clear advisor sub role option of real estate advisor")
    public void clearRealEstateAdvisorAdvisorOption(){
        myUniversePage.clearRealEstateAdvisorAdvisorOption();
    }

    @When("I clear developer sub role option")
    public void clearDeveloperOption(){
        myUniversePage.clearDeveloperOption();
    }

    @When("I set the value in deal/fund size field of deal sponsor")
    public void setDealFundSize_DealSponsor(){
        myUniversePage.setDealFundSize_DealSponsor();
    }

    @When("I set the value in deal/fund size field of deal sponsor in my universe exclude")
    public void setDealFundSize_DealSponsorInMyUniverseExclude(){
        myUniversePage.setDealFundSize_DealSponsorInMyUniverseExclude();
    }

    @When("I set the value in deal/fund size field of investor in my universe exclude")
    public void setDealFundSize_InvestorInMyUniverseExclude(){
        myUniversePage.setDealFundSize_InvestorInMyUniverseExclude();
    }

    @When("I set the value in deal/fund size field of lender in my universe exclude")
    public void setDealFundSize_LenderInMyUniverseExclude(){
        myUniversePage.setDealFundSize_LenderInMyUniverseExclude();
    }

    @When("I set the value in deal/fund size field of real estate advisor in my universe exclude")
    public void setDealFundSize_RealEstateAdvisorInMyUniverseExclude(){
        myUniversePage.setDealFundSize_RealEstateAdvisorInMyUniverseExclude();
    }

    @When("I set the value in deal/fund size field of investor")
    public void setDealFundSize_Investor(){
        myUniversePage.setDealFundSize_Investor();
    }

    @When("I set the value in deal/fund size field of lender")
    public void setDealFundSize_Lender(){
        myUniversePage.setDealFundSize_Lender();
    }

    @When("I set the value in deal/fund size field of real estate advisor")
    public void setDealFundSize_RealEstateAdvisor(){
        myUniversePage.setDealFundSize_RealEstateAdvisor();
    }

    @When("I clear the value in deal/fund size field of deal sponsor")
    public void clearDealFundSize(){
        myUniversePage.clearDealFundSize_DealSponsor();
    }

    @When("I clear the value in deal/fund size field of investor")
    public void clearDealFundSize_Investor(){
        myUniversePage.clearDealFundSize_Investor();
    }

    @When("I clear the value in deal/fund size field of lender")
    public void clearDealFundSize_Lender(){
        myUniversePage.clearDealFundSize_Lender();
    }

    @When("I clear the value in deal/fund size field of real estate advisor")
    public void clearDealFundSize_RealEstateAdvisor(){
        myUniversePage.clearDealFundSize_RealEstateAdvisor();
    }

    @When("I select public radio button of deal sponsor")
    public void selectPublicRadioButton_DealSponsor(){
        myUniversePage.selectPublicRadioButton_DealSponsor();
    }

    @Then("I verify public radio button of deal sponsor")
    public void verifyPublicRadioButton_DealSponsor(){
        myUniversePage.verifyPublicRadioButton_DealSponsor();
    }

    @When("I select public option in drop down")
    public void selectPublicOption(){
        myUniversePage.selectPublicOption();
    }

    @When("I select private option in drop down")
    public void selectPrivateOption(){
        myUniversePage.selectPrivateOption();
    }

    @When("I select public radio button of investor")
    public void selectPublicRadioButton_Investor(){
        myUniversePage.selectPublicRadioButton_Investor();
    }

    @When("I select public radio button of lender")
    public void selectPublicRadioButton_Lender(){
        myUniversePage.selectPublicRadioButton_Lender();
    }

    @When("I select public radio button of real estate advisor")
    public void selectPublicRadioButton_RealEstateAdvisor(){
        myUniversePage.selectPublicRadioButton_RealEstateAdvisor();
    }

    @When("I select private radio button of deal sponsor")
    public void selectPrivateRadioButton_DealSponsor(){
        myUniversePage.selectPrivateRadioButton_DealSponsor();
    }

    @When("I select private radio button of investor")
    public void selectPrivateRadioButton_Investor(){
        myUniversePage.selectPrivateRadioButton_Investor();
    }

    @When("I select private radio button of lender")
    public void selectPrivateRadioButton_Lender(){
        myUniversePage.selectPrivateRadioButton_Lender();
    }

    @When("I select private radio button of real estate advisor")
    public void selectPrivateRadioButton_RealEstateAdvisor(){
        myUniversePage.selectPrivateRadioButton_RealEstateAdvisor();
    }

    @When("I click on location field")
    public void clickLocationField(){
        myUniversePage.clickLocationField();
    }

    @When("I click on location field in my universe exclude")
    public void clickLocationFieldOfMyUniverseExclude(){
        myUniversePage.clickLocationFieldOfMyUniverseExclude();
    }

    @When("I clear on location field")
    public void clearLocationField(){
        myUniversePage.clearLocationField();
    }

    @When("I select the location of the user")
    public void selectLocation(){
        myUniversePage.selectLocation();
    }

    @Then("I verify the data in location field")
    public void verifyLocationField(){
        myUniversePage.verifyLocationField();
    }

    @Then("I verify the data in location field of my universe exclude")
    public void verifyLocationFieldInExclude(){
        myUniversePage.verifyLocationFieldInExclude();
    }

    @Then("I verify the data in location field of my universe exclude in company tab")
    public void verifyLocationFieldInExcludeCompanyTab(){
        myUniversePage.verifyLocationFieldInExcludeCompanyTab();
    }

    @Then("I verify real estate advisor check box is selected")
    public void verifyCheckBoxRealEstateAdvisor(){
        myUniversePage.verifyCheckBoxRealEstateAdvisor();
    }

    @Then("I verify deal sponsor check box is selected")
    public void verifyCheckBoxDealSponsor(){
        myUniversePage.verifyCheckBoxDealSponsor();
    }

    @Then("I verify investor check box is selected")
    public void verifyCheckBoxInvestor(){
        myUniversePage.verifyCheckBoxInvestor();
    }

    @Then("I verify lender check box is selected")
    public void verifyCheckBoxLender(){
        myUniversePage.verifyCheckBoxLender();
    }

    @Then("I verify that public option is selected")
    public void verifyPublicOptionIsSelected(){
        myUniversePage.verifyPublicOptionIsSelected();
    }

    @Then("I verify that private option is selected")
    public void verifyPrivateOptionIsSelected(){
        myUniversePage.verifyPrivateOptionIsSelected();
    }

    @Then("I verify real estate advisor subrole is selected")
    public void verifySubRoleOfRealEstateAdvisor(){
        myUniversePage.verifySubRoleOfRealEstateAdvisor();
    }

    @Then("I verify deal sponsor subrole is selected")
    public void verifySubRoleOfDealSponsor(){
        myUniversePage.verifySubRoleOfDealSponsor();
    }

    @Then("I verify advisor subrole is selected")
    public void verifySubRoleOfAdvisor(){
        myUniversePage.verifySubRoleOfAdvisor();
    }

    @Then("I verify family office subrole is selected")
    public void verifySubRoleOfFamilyOffice(){
        myUniversePage.verifySubRoleOfFamilyOffice();
    }

    @Then("I verify advisor subrole is selected in real estate advisor")
    public void verifyAdvisorSubRoleOfRealEstateAdvisor(){
        myUniversePage.verifyAdvisorSubRoleOfRealEstateAdvisor();
    }

    @Then("I verify deal/fund size of the investor i.e $lStrDealSizeFrom to $lStrDealSizeTo is set")
    public void verifyDealFundSizeOfInvestor(@Named("lStrDealSizeFrom") String lStrDealSizeFrom , @Named("lStrDealSizeTo") String lStrDealSizeTo){
        myUniversePage.verifyDealFundSizeOfInvestor(lStrDealSizeFrom,lStrDealSizeTo);
    }

    @Then("I verify deal/fund size of the lender i.e $lStrDealSizeFrom to $lStrDealSizeTo is set")
    public void verifyDealFundSizeOfLender(@Named("lStrDealSizeFrom") String lStrDealSizeFrom , @Named("lStrDealSizeTo") String lStrDealSizeTo){
        myUniversePage.verifyDealFundSizeOfLender(lStrDealSizeFrom,lStrDealSizeTo);
    }

    @Then("I verify deal/fund size of the real estate advisor i.e $lStrDealSizeFrom to $lStrDealSizeTo is set")
    public void verifyDealFundSizeOfRealEstateAdvisor(@Named("lStrDealSizeFrom") String lStrDealSizeFrom , @Named("lStrDealSizeTo") String lStrDealSizeTo){
        myUniversePage.verifyDealFundSizeOfRealEstateAdvisor(lStrDealSizeFrom,lStrDealSizeTo);
    }

    @Then("I verify deal/fund size of the deal sponsor i.e $lStrDealSizeFrom to $lStrDealSizeTo is set")
    public void verifyDealFundSizeOfDealSponsor(@Named("lStrDealSizeFrom") String lStrDealSizeFrom , @Named("lStrDealSizeTo") String lStrDealSizeTo){
        myUniversePage.verifyDealFundSizeOfDealSponsor(lStrDealSizeFrom,lStrDealSizeTo);
    }

    @When("I select the location of the user in my universe exclude")
    public void selectLocationInMyUniverseExclude(){
        myUniversePage.selectLocationInMyUniverseExclude();
    }

    @When("I select the location of the user in my universe exclude of company tab")
    public void selectLocationInMyUniverseExcludeOfCompanyTab(){
        myUniversePage.selectLocationInMyUniverseExcludeOfCompanyTab();
    }

    @When("I select country of the user in my universe exclude")
    public void selectCountryInMyUniverseExcludeOfCompanyTab(){
        myUniversePage.selectCountryInMyUniverseExcludeOfCompanyTab();
    }

    @When("I select country of the user in my universe include")
    public void selectCountryInMyUniverseInclude(){
        myUniversePage.selectCountryInMyUniverseInclude();
    }

    @When("I select country of the user in me tab of my universe include")
    public void selectCountryInMeTabOfMyUniverseInclude(){
        myUniversePage.selectCountryInMeTabOfMyUniverseInclude();
    }

    @When("I select country of the user in posting tab of my universe include")
    public void selectCountryInPostingTabOfMyUniverseInclude(){
        myUniversePage.selectCountryInPostingTabOfMyUniverseInclude();
    }

    @When("I select regions of the user in my universe exclude")
    public void selectRegionInMyUniverseExcludeOfCompanyTab(){
        myUniversePage.selectRegionInMyUniverseExcludeOfCompanyTab();
    }

    @When("I select regions of the user in my universe include")
    public void selectRegionInMyUniverseInclude(){
        myUniversePage.selectRegionInMyUniverseInclude();
    }

    @When("I select regions of the user in me tab of my universe include")
    public void selectRegionInMeTabMyUniverseInclude(){
        myUniversePage.selectRegionInMeTabMyUniverseInclude();
    }

    @When("I select regions of the user in posting tab of my universe include")
    public void selectRegionInProjectTabMyUniverseInclude(){
        myUniversePage.selectRegionInProjectTabMyUniverseInclude();
    }

    @When("I select states of the user in my universe exclude")
    public void selectStatesInMyUniverseExcludeOfCompanyTab(){
        myUniversePage.selectStatesInMyUniverseExcludeOfCompanyTab();
    }

    @When("I select states of the user in my universe include")
    public void selectStatesInMyUniverseInclude(){
        myUniversePage.selectStatesInMyUniverseInclude();
    }

    @When("I select states of the user in me tab of my universe include")
    public void selectStatesInMeTabMyUniverseInclude(){
        myUniversePage.selectStatesInMeTabMyUniverseInclude();
    }

    @When("I select states of the user in posting tab of my universe include")
    public void selectStatesInPostingTabMyUniverseInclude(){
        myUniversePage.selectStatesInPostingTabMyUniverseInclude();
    }

    @When("I select cities of the user in my universe exclude")
    public void selectCitiesInMyUniverseExcludeOfCompanyTab(){
        myUniversePage.selectCitiesInMyUniverseExcludeOfCompanyTab();
    }

    @When("I select cities of the user in my universe include")
    public void selectCitiesInMyUniverseInclude(){
        myUniversePage.selectCitiesInMyUniverseInclude();
    }

    @When("I select cities of the user in me tab of my universe include")
    public void selectCitiesInMeTabMyUniverseInclude(){
        myUniversePage.selectCitiesInMeTabMyUniverseInclude();
    }

    @When("I select cities of the user in posting tab of my universe include")
    public void selectCitiesInPostingTabMyUniverseInclude(){
        myUniversePage.selectCitiesInPostingTabMyUniverseInclude();
    }

    @When("I click on save button in my universe page of ME tab")
    public void clickSaveButton(){
        myUniversePage.clickSaveButton();
    }

    @When("I click on save button in my universe page of COMPANY tab")
    public void clickSaveButton_Company(){
        myUniversePage.clickSaveButton_Company();
    }

    @When("I click on save button in my universe page of PROJECT tab")
    public void clickSaveButton_Project(){
        myUniversePage.clickSaveButton_Project();
    }

    @Then("I verify '$lStrUserName' user name who has set privacy include in my universe is displayed")
        @Alias("I verify '$lStrUserName' user name who has set privacy exclude in my universe is displayed")
    public void verifyUserName_Universe(@Named("lStrUserName") String lStrUserName){
        myUniversePage.verifyUserName_Universe(lStrUserName);
    }

    @Then("I verify '$lStrCompanyName' company name who has set privacy include in my universe is displayed")
        @Alias("I verify '$lStrUserName' company name who has set privacy exclude in my universe is displayed")
    public void verifyCompanyName_Universe(@Named("lStrCompanyName") String lStrCompanyName){
        myUniversePage.verifyCompanyName_Universe(lStrCompanyName);
    }

    @Then("I verify '$lStrCompanyName' company name who has set privacy to exclude in my universe is displayed")
    public void verifyCompanyName_MyUniverse(@Named("lStrCompanyName") String lStrCompanyName){
        myUniversePage.verifyCompanyName_MyUniverse(lStrCompanyName);
    }

    @Then("I verify '$lStrProjectName' deal sponsor project name who has set privacy to public in include of my universe is displayed")
        @Aliases(values = {"I verify '$lStrFundName' deal sponsor fund name who has set privacy to public in include of my universe is displayed",
                            "I verify '$lStrFundName' investor fund name who has set privacy in include of my universe is displayed"})
    public void verifyProjectName_Universe(@Named("lStrCompanyName") String lStrCompanyName){
        myUniversePage.verifyProjectName_Universe(lStrCompanyName);
    }

    @Then("I verify '$lStrProjectName' deal sponsor project name who has set privacy in my universe is displayed")
    @Aliases(values = {"I verify '$lStrFundName' deal sponsor fund name who has set privacy in my universe is displayed",
            "I verify '$lStrFundName' investor fund name who has set privacy in my universe is displayed"})
    public void verifyProjectName_UniverseInclude(@Named("lStrCompanyName") String lStrCompanyName){
        myUniversePage.verifyProjectName_UniverseExclude(lStrCompanyName);
    }

    @Then("I verify '$lStrProjectName' of deal sponsor project name who has set privacy to public in exclude of my universe is displayed")
    @Aliases(values = {"I verify '$lStrFundName' of deal sponsor fund name who has set privacy to public in exclude of my universe is displayed",
            "I verify '$lStrFundName' of investor fund name who has set privacy in exclude of my universe is displayed",
            "I verify '$lStrProjectName' of deal sponsor project name who has set privacy in my universe is displayed","I verify '$lStrFundName' of deal sponsor fund name who has set privacy in my universe is displayed"})
    public void verifyProjectName_UniverseExclude(@Named("lStrCompanyName") String lStrCompanyName){
        myUniversePage.verifyProjectName_UniverseExclude(lStrCompanyName);
    }

    @Then("I verify '$lStrLoanName' lender loan name who has set privacy in include of my universe is displayed")
    @Alias("I verify '$lStrLoanName' lender mezz name who has set privacy in include of my universe is displayed")
    public void verifyLoanName_Universe(@Named("lStrLoanName") String lStrLoanName){
        myUniversePage.verifyLoanName_Universe(lStrLoanName);
    }

    @When("I click '$lStrUserName' user name who has set privacy include in my universe")
        @Alias("I click '$lStrUserName' user name who has set privacy exclude in my universe")
    public void clickUserName_Universe(@Named("lStrUserName")String lStrUserName){
        myUniversePage.clickUserName_Universe(lStrUserName);
    }

    @When("I click '$lStrCompanyName' company name who has set privacy include in my universe")
        @Alias("I click '$lStrCompanyName' company name who has set privacy exclude in my universe is displayed")
    public void clickCompanyName_Universe(@Named("lStrCompanyName")String lStrCompanyName){
        myUniversePage.clickCompanyName_Universe(lStrCompanyName);
    }

    @When("I click '$lStrCompanyName' on company name who has set privacy to exclude in my universe is displayed")
    public void clickCompanyName_MyUniverse(@Named("lStrCompanyName")String lStrCompanyName){
        myUniversePage.clickCompanyName_MyUniverse(lStrCompanyName);
    }

    @When("I click '$lStrProjectName' deal sponsor project name who has set privacy to public in include of my universe")
        @Aliases(values = {"I click '$lStrFundName' deal sponsor fund name who has set privacy to public in include of my universe",
                            "I click '$lStrFundName' investor fund name who has set privacy in include of my universe"})
    public void clickProjectName_Universe(@Named("lStrUserName")String lStrUserName){
        myUniversePage.clickProjectName_Universe(lStrUserName);
    }

    @When("I click '$lStrProjectName' deal sponsor project name who has set privacy in my universe")
    @Aliases(values = {"I click '$lStrFundName' deal sponsor fund name who has set privacy in my universe",
            "I click '$lStrFundName' investor fund name who has set privacy in my universe"})
    public void clickProjectName_UniverseInclude(@Named("lStrUserName")String lStrUserName){
        myUniversePage.clickProjectName_UniverseExclude(lStrUserName);
    }

    @When("I click '$lStrProjectName' of deal sponsor project name who has set privacy to public in exclude of my universe")
    @Aliases(values = {"I click '$lStrFundName' of deal sponsor fund name who has set privacy to public in exclude of my universe",
            "I click '$lStrFundName' of investor fund name who has set privacy in exclude of my universe",
            "I click '$lStrProjectName' of deal sponsor project name who has set privacy in my universe","I click '$lStrFundName' on deal sponsor fund name who has set privacy in my universe"})
    public void clickProjectName_UniverseExclude(@Named("lStrUserName")String lStrUserName){
        myUniversePage.clickProjectName_UniverseExclude(lStrUserName);
    }

    @When("I click '$lStrLoanName' lender loan name who has set privacy in include of my universe")
        @Alias("I click '$lStrLoanName' lender mezz name who has set privacy in include of my universe")
    public void clickLoanName_Universe(@Named("lStrLoanName") String lStrLoanName){
        myUniversePage.clickLoanName_Universe(lStrLoanName);
    }

    @When("I click on Edit Profile link")
    public void clickProfileButton(){
        myUniversePage.clickProfileLink();
    }

    @When("I click on edit button of the profile")
    public void clickEditButton(){
        myUniversePage.clickEditButton();
    }

    @When("I select developer option in I am a field")
    public void selectDeveloperOptionInIAmAField(){
        myUniversePage.selectDeveloperOptionInIAmAField();
    }

    @When("I select deal sponsor option in I am a field")
    public void selectDealSponsorOptionInIAmAField(){
        myUniversePage.selectDealSponsorOptionInIAmAField();
    }

    @When("I select advisor option in I am a field")
    public void selectAdvisorOptionInIAmAField(){
        myUniversePage.selectAdvisorOptionInIAmAField();
    }

    @When("I select bank option in I am a field")
    public void selectBankOptionInIAmAField(){
        myUniversePage.selectBankOptionInIAmAField();
    }

    @When("I select same as my personal details check box in company tab")
    public void selectSameAsMyPersonalDetailsCheckBox(){
        myUniversePage.selectSameAsMyPersonalDetailsCheckBox();
    }

    @When("I enter the location of the newly created user")
    public void enterLocationOfNewlyCreatedUser(){
        myUniversePage.enterLocationOfNewlyCreatedUser();
    }

    @When("I click on dashboard")
    public void clickOnDashboard(){
        myUniversePage.clickOnDashboard();
    }

    @When("I select family office option in I am a field")
    public void selectFamilyOfficeOptionInIAmAField(){
        myUniversePage.selectFamilyOfficeOptionInIAmAField();
    }

    @When("I select private lender option in I am a field")
    public void selectPrivateLenderOptionInIAmAField(){
        myUniversePage.selectPrivateLenderOptionInIAmAField();
    }

    @When("I select advisor option in I am a field of real estate advisor profile")
    public void selectAdvisorOptionInIAmAField_RealEstateAdvisor(){
        myUniversePage.selectAdvisorOptionInIAmAField_RealEstateAdvisor();
    }

    @When("I select corporate finance option in I am a field of real estate advisor profile")
    public void selectCorporateFinanceOptionInIAmAField(){
        myUniversePage.selectCorporateFinanceOptionInIAmAField();
    }

    @When("I click on save button in user profile page")
    public void clickOnSaveButtonInUserProfilePage(){
        myUniversePage.clickOnSaveButtonInUserProfilePage();
    }

    @When("I click on company tab in user profile")
    public void clickCompanyTabInUserProfile(){
        myUniversePage.clickCompanyTabInUserProfile();
    }

    @When("I click on edit in strategy field")
    public void clickEditOfStrategyField(){
        myUniversePage.clickEditOfStrategyField();
    }

    @When("I click on edit in investment strategy field")
    public void clickEditOfInvestmentStrategyField(){
        myUniversePage.clickEditOfInvestmentStrategyField();
    }

    @When("I click on edit in strategy field of lender profile")
    public void clickEditOfInvestmentStrategyField_Lender(){
        myUniversePage.clickEditOfInvestmentStrategyField_Lender();
    }

    @When("I click on edit in about field")
    public void clickEditOfAboutField(){
        myUniversePage.clickEditOfAboutField();
    }

    @When("I set the value of average deal size in user profile")
    public void setValueOfAverageDealSizeInUserProfile(){
        myUniversePage.setValueOfAverageDealSizeInUserProfile();
    }

    @When("I set the value of preferred deal size in user profile")
    public void setValueOfPreferredDealSizeInUserProfile(){
        myUniversePage.setValueOfPreferredDealSizeInUserProfile();
    }

    @When("I set the value of average loan amount in user profile")
    public void setValueOfAverageLoanAmount(){
        myUniversePage.setValueOfAverageLoanAmount();
    }

    @When("I set the value of average transaction size in user profile")
    public void setValueOfAverageTransactionSize(){
        myUniversePage.setValueOfAverageTransactionSize();
    }

    @When("I click on save button in strategy field")
    public void clickSaveButtonInStrategyField(){
        myUniversePage.clickSaveButtonInStrategyField();
    }

    @When("I click on save button in about field")
    public void clickSaveButtonInAboutField(){
        myUniversePage.clickSaveButtonInAboutField();
    }

    @When("I click on edit company field")
    public void clickOnEditCompanyField(){
        myUniversePage.clickOnEditCompanyField();
    }

    @When("I enter company name")
    public void enterCompanyName(){
        myUniversePage.enterCompanyName();
    }

    @When("I select developer option in We are a field")
    public void selectDeveloperInWeAreAField(){
        myUniversePage.selectDeveloperInWeAreAField();
    }

    @When("I select advisor option in We are a field")
    public void selectAdvisorInWeAreAField(){
        myUniversePage.selectAdvisorInWeAreAField();
    }

    @When("I select family office option in We are a field")
    public void selectFamilyOfficeInWeAreAField(){
        myUniversePage.selectFamilyOfficeInWeAreAField();
    }

    @When("I select advisor option in We are a field of real estate advisor profile")
    public void selectAdvisorOfRealEstateAdvisorProfileInWeAreAField(){
        myUniversePage.selectAdvisorOfRealEstateAdvisorProfileInWeAreAField();
    }

    @When("I click on save button of company profile")
    public void clickSaveButtonOfCompanyProfile(){
        myUniversePage.clickSaveButtonOfCompanyProfile();
    }

    @When("I select value in investment amount slider of investor fund whose privacy is set to private in my universe include")
    public void setInvestmentAmountOfInvestor_Private(){
        myUniversePage.setInvestmentAmountOfInvestorProjectIsSetToPrivate();
    }

    @When("I click on loan of the lender whose privacy is set in my universe include")
    public void clickLoanOfLenderMyUniverse(){
        myUniversePage.clickLoanOfLenderMyUniverse();
    }

    @When("I click on mezz of the lender whose privacy is set in my universe include")
    public void clickMezzOfLenderMyUniverse(){
        myUniversePage.clickMezzOfLenderMyUniverse();
    }

    @When("I click on service project of the real estate advisor who set privacy in my universe include")
    public void clickServiceProjectMyUniverseInclude(){
        myUniversePage.clickServiceProjectMyUniverseInclude();
    }

    @When("I click on listing project of the real estate advisor who set privacy in my universe include")
    public void clickListingProjectMyUniverseInclude(){
        myUniversePage.clickListingProjectMyUniverseInclude();
    }

    @Then("I verify '$lStrProjectOfServiceProviderName' property service provider service name who set privacy in my universe include is displayed")
        @Alias("I verify '$lStrProjectOfServiceProviderName' property service provider listing name who set privacy in my universe include is displayed")
    public void verifyProjectOfServiceProviderNameMyUniverseInclude(@Named("$lStrProjectOfServiceProviderName") String lStrProjectOfServiceProviderName){
        myUniversePage.verifyProjectOfServiceProviderNameMyUniverseInclude(lStrProjectOfServiceProviderName);
    }

    @Then("I verify '$lStrProjectOfServiceProviderName' property service provider service name who set privacy in my universe exclude is displayed")
    @Alias("I verify '$lStrProjectOfServiceProviderName' property service provider listing name who set privacy in my universe exclude is displayed")
    public void verifyProjectOfServiceProviderNameMyUniverseExclude(@Named("$lStrProjectOfServiceProviderName") String lStrProjectOfServiceProviderName){
        myUniversePage.verifyProjectOfServiceProviderNameMyUniverseExclude(lStrProjectOfServiceProviderName);
    }

    @When("I click on '$lStrLoanName' property service provider service name who set privacy in my universe include")
    @Alias("I click on '$lStrLoanName' property service provider listing name who set privacy in my universe include")
    public void clickProjectOfServiceProviderNameInMyUniverse(@Named("lStrLoanName") String lStrLoanName){
        myUniversePage.clickProjectOfServiceProviderNameInMyUniverse(lStrLoanName);
    }

    @When("I click on '$lStrLoanName' property service provider service name who set privacy in my universe exclude")
    @Alias("I click on '$lStrLoanName' property service provider listing name who set privacy in my universe exclude")
    public void clickProjectOfServiceProviderNameInMyUniverseExclude(@Named("lStrLoanName") String lStrLoanName){
        myUniversePage.clickProjectOfServiceProviderNameInMyUniverseExclude(lStrLoanName);
    }

    @Then("I verify '$lStrProjectOfLender' lender loan name who set privacy in my universe include is displayed")
    @Alias("I verify '$lStrProjectOfLender' lender mezz name who set privacy in my universe include is displayed")
    public void verifyProjectOfLenderNameMyUniverseInclude(@Named("$lStrProjectOfLender") String lStrProjectOfLender){
        myUniversePage.verifyProjectOfLenderNameMyUniverseInclude(lStrProjectOfLender);
    }

    @When("I click on '$lStrProjectOfLender' lender loan name who set privacy in my universe include")
    @Alias("I click on '$lStrProjectOfLender' lender mezz name who set privacy in my universe include")
    public void clickProjectOfLenderNameInMyUniverse(@Named("lStrProjectOfLender") String lStrProjectOfLender){
        myUniversePage.clickProjectOfLenderNameInMyUniverse(lStrProjectOfLender);
    }

    @When("I select the value of deal size who has set the profile to my universe exclude")
    public void selectValueInDealSize_Exclude(){
        myUniversePage.selectValueInDealSize_Exclude();
    }

    @When("I click on Activities in side pane")
    public void clickActivities(){
        myUniversePage.clickActivities();
    }

    @When("I click on your postings link")
    public void clickOnYourPosting(){
        myUniversePage.clickOnYourPosting();
    }

    @Then("I verify Activities is displayed in side pane")
    public void verifyActivities(){
        myUniversePage.verifyActivities();
    }
}
