package test.steps;

import com.google.inject.Inject;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import test.pages.CompaniesOfDealSponsorValidationPage;
import test.pages.PageFactory;

/**
 * Created with IntelliJ IDEA.
 * User: Bhavana
 * Date: 6/25/14
 * Time: 12:25 PM
 * To change this template use File | Settings | File Templates.
 */

public class CompaniesOfDealSponsorValidationSteps {
    private final CompaniesOfDealSponsorValidationPage companiesOfDealSponsorValidationPage;

    @Inject
    public CompaniesOfDealSponsorValidationSteps(PageFactory thePageFactory) {
        companiesOfDealSponsorValidationPage = thePageFactory.newCompaniesOfDealSponsorValidationPage();
    }

    @When("I select a asset type office in drop down list")
    public void selectOfficeAssetType(){
        companiesOfDealSponsorValidationPage.selectOfficeAssetType();
    }

    @When("I select office and hotel in asset drop down list")
    public void selectSecondOption(){
        companiesOfDealSponsorValidationPage.selectSecondOption();
    }

    @When("I clear asset type field")
    public void clearProjectField(){
        companiesOfDealSponsorValidationPage.clearAssetField();
    }

    @When("I click on multifamily option in asset type")
    public void clickMultiFamily(){
        companiesOfDealSponsorValidationPage.clickMultiFamily();
    }

    @When("I click on hotel option in asset type")
    public void clickHotel(){
        companiesOfDealSponsorValidationPage.clickHotel();
    }

    @When("I click on sports option in asset type")
    public void clickSports(){
        companiesOfDealSponsorValidationPage.clickSports();
    }

    @When("I click on health care option in asset type")
    public void clickHealthCare(){
        companiesOfDealSponsorValidationPage.clickHealthCare();
    }
    @When("I click on storage option in asset type")
    public void clickStorage(){
        companiesOfDealSponsorValidationPage.clickStorage();
    }

    @When("I click on other option in asset type")
    public void clickOther(){
        companiesOfDealSponsorValidationPage.clickOther();
    }

    @When("I click on retail option in asset type")
    public void clickRetail(){
        companiesOfDealSponsorValidationPage.clickRetail();
    }

    @When("I click on industrial option in asset type")
    public void clickIndustrial(){
        companiesOfDealSponsorValidationPage.clickIndustrial();
    }

    @When("I click on residential option in asset type")
    public void clickResidential(){
        companiesOfDealSponsorValidationPage.clickResidential();
    }

    @When("I click on single option in asset type")
    public void clickSingle(){
        companiesOfDealSponsorValidationPage.clickSingle();
    }

    @When("I click on retirement option in asset type")
    public void clickRetirement(){
        companiesOfDealSponsorValidationPage.clickRetirement();
    }

    @When("I click on student option in asset type")
    public void clickStudent(){
        companiesOfDealSponsorValidationPage.clickStudent();
    }

    @When("I click on other housing option in asset type")
    public void clickOtherHousing(){
        companiesOfDealSponsorValidationPage.clickOtherHousing();
    }

    @When("I click on residential multi family option in asset type")
    public void clickResidentialMultiFamily(){
        companiesOfDealSponsorValidationPage.clickResidentialMultiFamily();
    }

    @When("I clear residential of asset field")
    public void clearResidential(){
        companiesOfDealSponsorValidationPage.clearResidential();
    }

    @When("I click on mixed use option in asset type")
    public void clickMixedUse(){
        companiesOfDealSponsorValidationPage.clickMixedUse();
    }

    @When("I click on commercial option in asset type")
    public void clickCommercial(){
        companiesOfDealSponsorValidationPage.clickCommercial();
    }

    @When("I click on solar option in asset type")
    public void clickSolar(){
        companiesOfDealSponsorValidationPage.clickSolar();
    }

    @When("I click on all option in asset type")
    public void clickAllOptionOfAssetType(){
        companiesOfDealSponsorValidationPage.clickAllOptionOfAssetType();
    }

    @When("I clear all option in asset type")
    public void clearProject(){
        companiesOfDealSponsorValidationPage.clearAllOptionOfAssetType();
    }

    @When("I select a risk profile in drop down list")
    public void selectRisk(){
        companiesOfDealSponsorValidationPage.selectRisk();
    }

    @When("I select core and core plus in risk profile")
    public void selectSecondRiskProfile(){
        companiesOfDealSponsorValidationPage.selectSecondRiskProfile();
    }

    @When("I clear risk profile field")
    public void clearRiskProfile(){
        companiesOfDealSponsorValidationPage.clearRiskProfile();
    }

    @When("I click on core plus risk profile type")
    public void clickCorePlus(){
        companiesOfDealSponsorValidationPage.clickCorePlus();
    }

    @When("I click on value add risk profile type")
    public void clickValueAdd(){
        companiesOfDealSponsorValidationPage.clickValueAdd();
    }

    @When("I click on development risk profile type")
    public void clickDevelopment(){
        companiesOfDealSponsorValidationPage.clickDevelopment();
    }

    @When("I click on opportunistic risk profile type")
    public void clickOpportunistic(){
        companiesOfDealSponsorValidationPage.clickOpportunistic();
    }

    @When("I click on other option of risk profile type")
    public void clickOtherRiskProfile(){
        companiesOfDealSponsorValidationPage.clickOtherRiskProfile();
    }

    @When("I click all option in risk profile type")
    public void clickAllOptionOfRiskProfile(){
        companiesOfDealSponsorValidationPage.clickAllOptionOfRiskProfile();
    }

    @When("I clear risk profile")
    public void clearRisk(){
        companiesOfDealSponsorValidationPage.clearRisk();
    }

    @When("I select a investment method in drop down list")
    public void selectInvestment(){
        companiesOfDealSponsorValidationPage.selectInvestment();
    }

    @When("I select advisor and crowd fund in investment method")
    public void selectSecondInvestment(){
        companiesOfDealSponsorValidationPage.selectSecondInvestment();
    }

    @When("I clear Investment field")
    public void clearInvestment(){
        companiesOfDealSponsorValidationPage.clearInvestment();
    }

    @When("I click on EB5 option in investment method")
    public void clickEB5(){
        companiesOfDealSponsorValidationPage.clickEB5();
    }

    @When("I click on crowd funded option in investment method")
    public void clickCrowdFunded(){
        companiesOfDealSponsorValidationPage.clickCrowdFunded();
    }

    @When("I click on single investor option in investment method")
    public void clickSingleInvestor(){
        companiesOfDealSponsorValidationPage.clickSingleInvestor();
    }

    @When("I click on family office option in investment method")
    public void clickFamilyOffice(){
        companiesOfDealSponsorValidationPage.clickFamilyOffice();
    }

    @When("I click on institution option in investment method")
    public void clickInstitution(){
        companiesOfDealSponsorValidationPage.clickInstitution();
    }

    @When("I click on asset manager option in institute of investment method")
    public void clickAssetManager(){
        companiesOfDealSponsorValidationPage.clickAssetManager();
    }

    @When("I click broker or intermediary option in institute of investment method")
    public void clickBrokerOrIntermediary(){
        companiesOfDealSponsorValidationPage.clickBrokerOrIntermediary();
    }

    @When("I click consultant option in institute of investment method")
    public void clickConsultant(){
        companiesOfDealSponsorValidationPage.clickConsultant();
    }

    @When("I click construction option in institute of investment method")
    public void clickConstruction(){
        companiesOfDealSponsorValidationPage.clickConstruction();
    }

    @When("I click endowment option in institute of investment method")
    public void clickEndowment(){
        companiesOfDealSponsorValidationPage.clickEndowment();
    }

    @When("I click fund of funds option in institute of investment method")
    public void clickFundOfFunds(){
        companiesOfDealSponsorValidationPage.clickFundOfFunds();
    }

    @When("I click government agency in institute of investment method")
    public void clickGovernmentAgency(){
        companiesOfDealSponsorValidationPage.clickGovernmentAgency();
    }

    @When("I click hedge fund in institute of investment method")
    public void clickHedgeFund(){
        companiesOfDealSponsorValidationPage.clickHedgeFund();
    }

    @When("I click high net in institute of investment method")
    public void clickHighNet(){
        companiesOfDealSponsorValidationPage.clickHighNet();
    }

    @When("I click individual investor in institute of investment method")
    public void clickIndividualInvestor(){
        companiesOfDealSponsorValidationPage.clickIndividualInvestor();
    }

    @When("I click insurance company in institute of investment method")
    public void clickInsuranceCompany(){
        companiesOfDealSponsorValidationPage.clickInsuranceCompany();
    }

    @When("I click other institutional investor in institute of investment method")
    public void clickOtherInstitutionalInvestor(){
        companiesOfDealSponsorValidationPage.clickOtherInstitutionalInvestor();
    }

    @When("I click owner operator in institute of investment method")
    public void clickOwnerOperator(){
        companiesOfDealSponsorValidationPage.clickOwnerOperator();
    }

    @When("I click NCREIF option in institute of investment method")
    public void clickNCREIF(){
        companiesOfDealSponsorValidationPage.clickNCREIF();
    }

    @When("I click senior lender option in institute of investment method")
    public void clickSeniorLender(){
        companiesOfDealSponsorValidationPage.clickSeniorLender();
    }

    @When("I click mezzanine option in institute of investment method")
    public void clickMezzanine(){
        companiesOfDealSponsorValidationPage.clickMezzanine();
    }

    @When("I click junior lender option in institute of investment method")
    public void clickJuniorLender(){
        companiesOfDealSponsorValidationPage.clickJuniorLender();
    }

    @When("I click private equity option in institute of investment method")
    public void clickPrivateEquity(){
        companiesOfDealSponsorValidationPage.clickPrivateEquity();
    }

    @When("I click private REIT option in institute of investment method")
    public void clickPrivateREIT(){
        companiesOfDealSponsorValidationPage.clickPrivateREIT();
    }

    @When("I click public REIT option in institute of investment method")
    public void clickPublicREIT(){
        companiesOfDealSponsorValidationPage.clickPublicREIT();
    }

    @When("I click sovereign option in institute of investment method")
    public void clickSovereign(){
        companiesOfDealSponsorValidationPage.clickSovereign();
    }

    @When("I click special option in institute of investment method")
    public void clickSpecial(){
        companiesOfDealSponsorValidationPage.clickSpecial();
    }

    @When("I clear investment method option")
    public void clearInvestmentMethod(){
        companiesOfDealSponsorValidationPage.clearInvestmentMethod();
    }

    @When("I select a route to sponsor in drop down list")
    public void selectRoute(){
        companiesOfDealSponsorValidationPage.selectRoute();
    }

    @When("I select direct only and intermediary in route to sponsor method")
    public void selectSecondRoute(){
        companiesOfDealSponsorValidationPage.selectSecondRoute();
    }

    @When("I clear route field")
    public void clearRoute(){
        companiesOfDealSponsorValidationPage.clearRoute();
    }

    @When("I click on intermediary option in route to sponsor")
    public void clickIntermediary(){
        companiesOfDealSponsorValidationPage.clickIntermediary();
    }

    @When("I click on brokers option in route to sponsor")
    public void clickBrokers(){
        companiesOfDealSponsorValidationPage.clickBrokers();
    }

    @When("I click on placement agents option in route to sponsor")
    public void clickPlacementAgents(){
        companiesOfDealSponsorValidationPage.clickPlacementAgents();
    }

    @When("I select all option in route to sponsor")
    public void selectAllInRouteSponsor(){
        companiesOfDealSponsorValidationPage.selectAllInRouteSponsor();
    }

    @When("I clear route to sponsor option")
    public void clearRouteToDeveloper(){
        companiesOfDealSponsorValidationPage.clearRouteToSponsor();
    }

    @Then("I verify company name of deal sponsor of all search option is displayed")
    public void verifyAllOptions()throws Exception{
        companiesOfDealSponsorValidationPage.verifyAllOptions(1);
    }

    @When("I select a strategy in drop down list")
    public void selectStrategy(){
        companiesOfDealSponsorValidationPage.selectStrategy();
    }

    @Then("I verify deal sponsor company selected '$strSideSearch' option is displayed")
    public void verifyCompanyOfDealSponsor(@Named("strSideSearch") String strSideSearch) throws Exception{
        companiesOfDealSponsorValidationPage.companyIsDisplayed(2,strSideSearch);
    }

    @Then("I verify deal sponsor company selected '$strSideSearch' option is not displayed")
    public void companyNotDisplayed(@Named("strSideSearch") String strSideSearch)throws Exception{
       companiesOfDealSponsorValidationPage.companyNotDisplayed(2,strSideSearch);
    }

    @When("I click on asset")
    public void clickAsset(){
        companiesOfDealSponsorValidationPage.clickAsset();
    }

    @Then("I verify '$strCompanyName' company name is displayed in deal sponsors developers search")
    public void verifyCompanyNameIsDisplayed(@Named("strCompanyName") String strCompanyName){
        companiesOfDealSponsorValidationPage.verifyCompanyNameIsDisplayed(strCompanyName);
    }

    @Then("I verify '$strCompanyName' company name is not displayed in deal sponsors developers search")
    public void verifyCompanyNameIsNotDisplayed(@Named("strCompanyName") String strCompanyName){
        companiesOfDealSponsorValidationPage.verifyCompanyNameIsNotDisplayed(strCompanyName);
    }

    @When("I set value for average deal size field")
    public void setValueForDealSize(){
        companiesOfDealSponsorValidationPage.setValueForDealSize();
    }

    @When("I clear value for average deal size field")
    public void clearValueForDealSize(){
        companiesOfDealSponsorValidationPage.clearValueForDealSize();
    }

    @When("I set value for year in business field")
    public void setValueForYearInBusiness(){
        companiesOfDealSponsorValidationPage.setValueForYearInBusiness();
    }

    @When("I clear value for year in business field")
    public void clearValueForYearInBusiness(){
        companiesOfDealSponsorValidationPage.clearValueForYearInBusiness();
    }

    @When("I set value for number of professionals field")
    public void setValueForNumberOfProfessionals(){
        companiesOfDealSponsorValidationPage.setValueForNumberOfProfessionals();
    }

    @When("I clear value for number of professionals field")
    public void clearValueForNumberOfProfessionals(){
        companiesOfDealSponsorValidationPage.clearValueForNumberOfProfessionals();
    }

    @When("I set value for project completed field")
    public void setValueForProjectCompleted(){
        companiesOfDealSponsorValidationPage.setValueForProjectCompleted();
    }

    @When("I clear value for project completed field")
    public void clearValueForProjectCompleted(){
        companiesOfDealSponsorValidationPage.clearValueForProjectCompleted();
    }

    @When("I set value for sq ft developed field")
    public void setValueForSqFt(){
        companiesOfDealSponsorValidationPage.setValueForSqFt();
    }

    @When("I clear value for sq ft developed field")
    public void clearValueForSqFt(){
        companiesOfDealSponsorValidationPage.clearValueForSqFt();
    }

    @When("I set value of deals completed field")
    public void setValueOfDealsCompleted(){
        companiesOfDealSponsorValidationPage.setValueOfDealsCompletedField();
    }

    @When("I clear value of deals completed field")
    public void clearValueOfDealsCompleted(){
        companiesOfDealSponsorValidationPage.clearValueOfDealsCompletedField();
    }

    @When("I select portfolio radio button")
    public void selectPortfolio(){
        companiesOfDealSponsorValidationPage.selectPortfolio();
    }

    @When("I select single radio button")
    public void selectSingle(){
        companiesOfDealSponsorValidationPage.selectSingle();
    }
}
