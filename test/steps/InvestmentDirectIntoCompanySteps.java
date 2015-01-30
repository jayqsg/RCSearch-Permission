package test.steps;


import com.google.inject.Inject;
import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.When;
import test.pages.InvestmentDirectIntoCompanyPage;
import test.pages.PageFactory;

public class InvestmentDirectIntoCompanySteps {
    private final InvestmentDirectIntoCompanyPage investmentDirectIntoCompanyPage;

    @Inject
    public InvestmentDirectIntoCompanySteps(PageFactory thePageFactory) {
        investmentDirectIntoCompanyPage = thePageFactory.newInvestmentDirectIntoCompanyPage();
    }

    @When("I select the value in deal size")
    public void selectValueInDealSize(){
        investmentDirectIntoCompanyPage.selectValueInDealSize();
    }

    @When("I clear value in deal size")
    public void clearValueInDealSize(){
        investmentDirectIntoCompanyPage.clearValueInDealSize();
    }

    @When("I click on investor type field")
    public void clickInvestorType(){
        investmentDirectIntoCompanyPage.clickInvestorType();
    }

    @When("I select advisor option in investor type field")
    public void selectAdvisorOption(){
        investmentDirectIntoCompanyPage.selectAdvisorOption();
    }

    @When("I clear advisor option in investor type field")
    public void clearAdvisorOption(){
        investmentDirectIntoCompanyPage.selectAdvisorOption();
    }

    @When("I click route to sponsor field")
    public void clickRouteToSponsorField(){
        investmentDirectIntoCompanyPage.clickRouteToSponsorField();
    }

    @When("I select direct only option in route to sponsor drop down")
    public void selectDirectOnlyInRouteToSponsor(){
        investmentDirectIntoCompanyPage.selectDirectOnlyInRouteToSponsor();
    }

    @When("I clear direct only option in route to sponsor drop down")
    public void clearDirectOnly(){
        investmentDirectIntoCompanyPage.selectDirectOnlyInRouteToSponsor();
    }

    @When("I click on asset interest")
    public void clickAssetInterest(){
        investmentDirectIntoCompanyPage.clickAssetInterest();
    }

    @When("I click on asset type field in investment direct into search")
    public void clickAssetTypeOfInvestmentDirectInto(){
        investmentDirectIntoCompanyPage.clickAssetTypeOfInvestmentDirectInto();
    }

    @When("I select a asset type office in investment direct into search")
    public void selectOfficeAssetType(){
        investmentDirectIntoCompanyPage.selectOfficeAssetType_InvestmentDirectInto();
    }

    @When("I clear asset type drop down in investment direct into search")
    public void clearProjectField(){
        investmentDirectIntoCompanyPage.clearAssetFieldDropDown_InvestmentDirectInto();
    }

    @When("I click on multifamily option in asset type of investment direct into search")
    public void clickMultiFamily(){
        investmentDirectIntoCompanyPage.clickMultiFamily_InvestmentDirectInto();
    }

    @When("I click on hotel option in asset type of investment direct into search")
    public void clickHotel(){
        investmentDirectIntoCompanyPage.clickHotel_InvestmentDirectInto();
    }

    @When("I click on sports option in asset type of investment direct into search")
    public void clickSports(){
        investmentDirectIntoCompanyPage.clickSports_InvestmentDirectInto();
    }

    @When("I click on health care option in asset type of investment direct into search")
    public void clickHealthCare(){
        investmentDirectIntoCompanyPage.clickHealthCare_InvestmentDirectInto();
    }
    @When("I click on storage option in asset type of investment direct into search")
    public void clickStorage(){
        investmentDirectIntoCompanyPage.clickStorage_InvestmentDirectInto();
    }

    @When("I click on other option in asset type of investment direct into search")
    public void clickOther(){
        investmentDirectIntoCompanyPage.clickOther_InvestmentDirectInto();
    }

    @When("I click on retail option in asset type of investment direct into search")
    public void clickRetail(){
        investmentDirectIntoCompanyPage.clickRetail_InvestmentDirectInto();
    }

    @When("I click on industrial option in asset type of investment direct into search")
    public void clickIndustrial(){
        investmentDirectIntoCompanyPage.clickIndustrial_InvestmentDirectInto();
    }

    @When("I click on residential option in asset type of investment direct into search")
    public void clickResidential(){
        investmentDirectIntoCompanyPage.clickResidential_InvestmentDirectInto();
    }

    @When("I click on single option in asset type of investment direct into search")
    public void clickSingle(){
        investmentDirectIntoCompanyPage.clickSingle_InvestmentDirectInto();
    }

    @When("I click on retirement option in asset type of investment direct into search")
    public void clickRetirement(){
        investmentDirectIntoCompanyPage.clickRetirement_InvestmentDirectInto();
    }

    @When("I click on student option in asset type of investment direct into search")
    public void clickStudent(){
        investmentDirectIntoCompanyPage.clickStudent_InvestmentDirectInto();
    }

    @When("I click on other housing option in asset type of investment direct into search")
    public void clickOtherHousing(){
        investmentDirectIntoCompanyPage.clickOtherHousing_InvestmentDirectInto();
    }

    @When("I click on residential multi family option in asset type of investment direct into search")
    public void clickResidentialMultiFamily(){
        investmentDirectIntoCompanyPage.clickResidentialMultiFamily_InvestmentDirectInto();
    }

    @When("I clear residential of asset field of investment direct into search")
    public void clearResidential(){
        investmentDirectIntoCompanyPage.clearResidential_InvestmentDirectInto();
    }

    @When("I click on mixed use option in asset type of investment direct into search")
    public void clickMixedUse(){
        investmentDirectIntoCompanyPage.clickMixedUse_InvestmentDirectInto();
    }

    @When("I click on commercial option in asset type of investment direct into search")
    public void clickCommercial(){
        investmentDirectIntoCompanyPage.clickCommercial_InvestmentDirectInto();
    }

    @When("I click on solar option in asset type of investment direct into search")
    public void clickSolar(){
        investmentDirectIntoCompanyPage.clickSolar_InvestmentDirectInto();
    }

    @When("I click on all option in asset type of investment direct into search")
    public void clickAllOptionOfAssetType(){
        investmentDirectIntoCompanyPage.clickAllOptionOfAssetType_InvestmentDirectInto();
    }

    @When("I clear all option in asset type of investment direct into search")
    public void clearProject(){
        investmentDirectIntoCompanyPage.clearAllOptionOfAssetType_InvestmentDirectInto();
    }

    @When("I click on 'RiskProfile' drop down field in investment direct into project")
    public void clickRiskProfile(){
        investmentDirectIntoCompanyPage.clickRiskProfile_InvestmentDirectInto();
    }

    @When("I select core option in risk profile drop down of investment direct into project")
    public void selectRisk(){
        investmentDirectIntoCompanyPage.selectRisk_InvestmentDirectInto();
    }

    @When("I clear core in risk profile drop down of investment direct into project")
    public void clearRiskProfile(){
        investmentDirectIntoCompanyPage.clearRiskProfile_InvestmentDirectInto();
    }

    @When("I click on core plus risk profile type of investment direct into project")
    public void clickCorePlus(){
        investmentDirectIntoCompanyPage.clickCorePlus_InvestmentDirectInto();
    }

    @When("I click on value add risk profile type of investment direct into project")
    public void clickValueAdd(){
        investmentDirectIntoCompanyPage.clickValueAdd_InvestmentDirectInto();
    }

    @When("I click on development risk profile type of investment direct into project")
    public void clickDevelopment(){
        investmentDirectIntoCompanyPage.clickDevelopment_InvestmentDirectInto();
    }

    @When("I click on opportunistic risk profile type of investment direct into project")
    public void clickOpportunistic(){
        investmentDirectIntoCompanyPage.clickOpportunistic_InvestmentDirectInto();
    }

    @When("I click on other option of risk profile type of investment direct into project")
    public void clickOtherRiskProfile(){
        investmentDirectIntoCompanyPage.clickOtherRiskProfile_InvestmentDirectInto();
    }

    @When("I click all option in risk profile type of investment direct into project")
    public void clickAllOptionOfRiskProfile(){
        investmentDirectIntoCompanyPage.clickAllOptionOfRiskProfile_InvestmentDirectInto();
    }

    @When("I clear risk profile of investment direct into project")
    public void clearRisk(){
        investmentDirectIntoCompanyPage.clearRisk_InvestmentDirectInto();
    }

    @When("I click on deal stage drop down field")
    public void clickDealStage(){
        investmentDirectIntoCompanyPage.clickDealStage();
    }

    @When("I select owned option in deal stage drop down field")
    public void selectOwnedOption(){
        investmentDirectIntoCompanyPage.selectOwnedOption();
    }

    @When("I clear owned option in deal stage drop down field")
    public void clearOwnedOption(){
        investmentDirectIntoCompanyPage.clearOwnedOption();
    }

    @When("I click on asset strategy drop down")
    public void clickAssetStrategyField(){
        investmentDirectIntoCompanyPage.clickAssetStrategyField();
    }

    @When("I select acquisition option in asset strategy field")
    public void selectAcquisitionOption(){
        investmentDirectIntoCompanyPage.selectAcquisitionOption();
    }

    @When("I clear acquisition option in asset strategy field")
    public void clearAcquisitionOption(){
        investmentDirectIntoCompanyPage.clearAcquisitionOption();
    }

    @When("I check the syndicating check field")
    public void selectSyndicating(){
        investmentDirectIntoCompanyPage.selectSyndicating();
    }

    @When("I un check the syndicating check field")
    public void unCheckSyndicating(){
        investmentDirectIntoCompanyPage.selectSyndicating();
    }

    @When("I select broker or intermediary option in investor type")
    public void selectBrokerOrIntermediary(){
        investmentDirectIntoCompanyPage.selectBrokerOrIntermediary();
    }

    @When("I select consultant option in investor type")
    public void selectConsultant(){
        investmentDirectIntoCompanyPage.selectConsultant();
    }

    @When("I select EB5 program option in investor type")
    public void selectEB5Program(){
        investmentDirectIntoCompanyPage.selectEB5Program();
    }

    @When("I select family office option in investor type")
    public void selectFamilyOffice(){
        investmentDirectIntoCompanyPage.selectFamilyOffice();
    }

    @When("I select fund of funds option in investor type")
    public void selectFundOfFunds(){
        investmentDirectIntoCompanyPage.selectFundOfFunds();
    }

    @When("I select hedge fund option in investor type")
    public void selectHedgeFund(){
        investmentDirectIntoCompanyPage.selectHedgeFund();
    }

    @When("I select individual investor option in investor type")
    public void selectIndividualInvestor(){
        investmentDirectIntoCompanyPage.selectIndividualInvestor();
    }

    @When("I select investment manager option in investor type")
    public void selectInvestmentManager(){
        investmentDirectIntoCompanyPage.selectInvestmentManager();
    }

    @When("I select NCREIF style trust or fund option in investor type")
    public void selectNCREIFStyleTrust(){
        investmentDirectIntoCompanyPage.selectNCREIFStyleTrust();
    }

    @When("I select owner operator option in investor type")
    public void selectOwnerOperator(){
        investmentDirectIntoCompanyPage.selectOwnerOperator();
    }

    @When("I select private equity real estate fund option in investor type")
    public void selectPrivateEquityRealEstateFund(){
        investmentDirectIntoCompanyPage.selectPrivateEquityRealEstateFund();
    }

    @When("I select public REIT option in investor type")
    public void selectPublicREIT(){
        investmentDirectIntoCompanyPage.selectPublicREIT();
    }

    @When("I select sovereign wealth fund option in investor type")
    public void selectSovereignWealthFund(){
        investmentDirectIntoCompanyPage.selectSovereignWealthFund();
    }

    @When("I select bank option in investor type")
    public void selectBank(){
        investmentDirectIntoCompanyPage.selectBank();
    }

    @When("I select construction lender or purchaser option in investor type")
    public void selectConstructionLender(){
        investmentDirectIntoCompanyPage.selectConstructionLender();
    }

    @When("I select crowd funding platform option in investor type")
    public void selectCrowdFundingPlatform(){
        investmentDirectIntoCompanyPage.selectCrowdFundingPlatform();
    }

    @When("I select endowment and foundation option in investor type")
    public void selectEndowmentAndFoundation(){
        investmentDirectIntoCompanyPage.selectEndowmentAndFoundation();
    }

    @When("I select fund option in investor type")
    public void selectFund(){
        investmentDirectIntoCompanyPage.selectFund();
    }

    @When("I select government agency option in investor type")
    public void selectGovernmentAgency(){
        investmentDirectIntoCompanyPage.selectGovernmentAgency();
    }

    @When("I select high net worth investor option in investor type")
    public void selectHighNet(){
        investmentDirectIntoCompanyPage.selectHighNet();
    }

    @When("I select insurance company option in investor type")
    public void selectInsuranceCompany(){
        investmentDirectIntoCompanyPage.selectInsuranceCompany();
    }

    @When("I select mezzanine option in investor type")
    public void selectMezzanine(){
        investmentDirectIntoCompanyPage.selectMezzanine();
    }

    @When("I select other institutional investor option in investor type")
    public void selectOtherInstitutional(){
        investmentDirectIntoCompanyPage.selectOtherInstitutional();
    }

    @When("I select pension fund option in investor type")
    public void selectPensionFund(){
        investmentDirectIntoCompanyPage.selectPensionFund();
    }

    @When("I select private REIT option in investor type")
    public void selectPrivateREIT(){
        investmentDirectIntoCompanyPage.selectPrivateREIT();
    }

    @When("I select senior lender option in investor type")
    public void selectSeniorLender(){
        investmentDirectIntoCompanyPage.selectSeniorLender();
    }

    @When("I select special servicer option in investor type")
    public void selectSpecialServicer(){
        investmentDirectIntoCompanyPage.selectSpecialServicer();
    }

    @When("I select all option in investor type")
    public void selectAllOptionOfInvestorType(){
        investmentDirectIntoCompanyPage.selectAllOptionOfInvestorType();
    }

    @When("I clear all option in investor type")
    public void clearSpecialServicer(){
        investmentDirectIntoCompanyPage.clearAllOptionOfInvestorType();
    }

    @When("I click on sale leaseback option in strategy of investment direct into search")
    public void clickSaleLeaseback(){
        investmentDirectIntoCompanyPage.clickSaleLeaseback();
    }

    @When("I click on stable income producing option in strategy of investment direct into search")
    public void clickStableIncomeProducing(){
        investmentDirectIntoCompanyPage.clickStableIncomeProducing();
    }

    @When("I click on quick flip option in strategy of investment direct into search")
    public void clickQuickFlip(){
        investmentDirectIntoCompanyPage.clickQuickFlip();
    }

    @When("I click on restructuring option in strategy of investment direct into search")
    public void clickRestructuring(){
        investmentDirectIntoCompanyPage.clickRestructuring();
    }

    @When("I click on recapitalization option in strategy of investment direct into search")
    public void clickRecapitalization(){
        investmentDirectIntoCompanyPage.clickRecapitalization();
    }

    @When("I click on land bank option in strategy of investment direct into search")
    public void clickLandBank(){
        investmentDirectIntoCompanyPage.clickLandBank();
    }

    @When("I click on change of use option in strategy of investment direct into search")
    public void clickChangeOfUse(){
        investmentDirectIntoCompanyPage.clickChangeOfUse();
    }

    @When("I click on development option in strategy of investment direct into search")
    public void clickDevelopmentOfStrategy(){
        investmentDirectIntoCompanyPage.clickDevelopmentOfStrategy();
    }

    @When("I click on platform build option in strategy of investment direct into search")
    public void clickPlatformBuild(){
        investmentDirectIntoCompanyPage.clickPlatformBuild();
    }

    @When("I click on pursuit option in strategy of investment direct into search")
    public void clickPursuit(){
        investmentDirectIntoCompanyPage.clickPursuit();
    }

    @When("I click on lease up option in strategy of investment direct into search")
    public void clickLeaseUp(){
        investmentDirectIntoCompanyPage.clickLeaseUp();
    }

    @When("I click on work out option in strategy of investment direct into search")
    public void clickWorkOut(){
        investmentDirectIntoCompanyPage.clickWorkOut();
    }

    @When("I click on restructuring corporate option in strategy of investment direct into search")
    public void clickRestructuringCorporate(){
        investmentDirectIntoCompanyPage.clickRestructuringCorporate();
    }

    @When("I click on public to private option in strategy of investment direct into search")
    public void clickPublicToPrivate(){
        investmentDirectIntoCompanyPage.clickPublicToPrivate();
    }

    @When("I click on rezoning option in strategy of investment direct into search")
    public void clickRezoning(){
        investmentDirectIntoCompanyPage.clickRezoning();
    }

    @When("I click on renovation option in strategy of investment direct into search")
    public void clickRenovation(){
        investmentDirectIntoCompanyPage.clickRenovation();
    }

    @When("I click on forward commitment option in strategy of investment direct into search")
    public void clickForwardCommitment(){
        investmentDirectIntoCompanyPage.clickForwardCommitment();
    }

    @When("I click on others option in strategy of investment direct into search")
    public void clickOtherInStrategy(){
        investmentDirectIntoCompanyPage.clickOtherInStrategy();
    }

    @When("I click on all option in strategy of investment direct into search")
    public void clickAllOptionOfAssetStrategy(){
        investmentDirectIntoCompanyPage.clickAllOptionOfAssetStrategy();
    }

    @When("I clear all option in strategy of investment direct into search")
    public void clearForwardCommitment(){
        investmentDirectIntoCompanyPage.clearAllOptionOfAssetStrategy();
    }
}
