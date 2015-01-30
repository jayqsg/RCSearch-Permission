package test.steps;

import com.google.inject.Inject;
import org.jbehave.core.annotations.When;
import test.pages.PageFactory;
import test.pages.SearchPage;

public class SearchSteps {
    private final SearchPage searchPage;

    @Inject
    public SearchSteps(PageFactory thePageFactory) {
        searchPage = thePageFactory.newSearchPage();
    }

    @When("I click on 'People,companies and association' link")
    public void peopleCompaniesLinkClick(){
        searchPage.peopleCompaniesLinkClick();
    }

    @When("I click on 'People' link")
    public void peopleClick(){
        searchPage.peopleClick();
    }

    @When("I click on 'Companies/Associations' link")
    public void companiesClick(){
        searchPage.companiesClick();
    }

    @When("I click on 'Developer,Deal Sponsor' link")
    public void dealSponsorClick(){
        searchPage.dealSponsorClick();
    }

    @When("I click on 'Deal Sponsor' link")
    public void selectDealSponsor(){
        searchPage.selectDealSponsor();
    }

    @When("I click on 'View Search Results' button")
    public void clickViewSearchResults(){
        searchPage.clickViewSearchResults();
    }

    @When("I click on 'Developer' link")
    public void selectDeveloper(){
        searchPage.selectDeveloper();
    }

    @When("I select 'Fund Sponsor' link")
    public void selectFundSponsor(){
        searchPage.selectFundSponsor();
    }

    @When("I select 'Developer','DealSponsor' link")
    public void clickUsers(){
        searchPage.clickUsers();
    }


    @When("I click on 'RE Advisors' link")
    public void clickRealEstateLink(){
        searchPage.clickRealEstateLink();
    }

    @When("I click on 'Advisor' link")
    public void clickAdvisorLink(){
        searchPage.clickAdvisorLink();
    }

    @When("I click on 'Project Management' link")
    public void clickProjectManagementLink(){
        searchPage.clickProjectManagementLink();
    }

    @When("I click on 'Appraisal' link")
    public void clickAppraisalLink(){
        searchPage.clickAppraisalLink();
    }

    @When("I click on 'Brokers & Agencies' link")
    public void clickBroker(){
        searchPage.clickBroker();
    }

    @When("I click on 'Acquisitions' link")
    public void clickAcquisitions(){
        searchPage.clickAcquisitions();
    }

    @When("I click on 'Off Plan Sales' link")
    public void clickOffPlanSales(){
        searchPage.clickOffPlanSales();
    }

    @When("I click on 'Residential' link")
    public void clickResidential(){
        searchPage.clickResidential();
    }

    @When("I click on 'Investment Banker / Capital Markets' link")
    public void clickInvestmentBanker(){
        searchPage.clickInvestmentBanker();
    }

    @When("I click on 'Capital Raising' link")
    public void clickCapitalRaising(){
        searchPage.clickCapitalRaising();
    }

    @When("I click on 'Investments' link")
    public void clickInvestments(){
        searchPage.clickInvestments();
    }

    @When("I click on 'Direct Into Project' link")
    public void clickDirectIntoProject(){
        searchPage.clickDirectIntoProject();
    }

    @When("I click on 'Core' link")
    public void clickCore(){
        searchPage.clickCore();
    }

    @When("I click on 'Opportunistic' link")
    public void clickOpportunistic(){
        searchPage.clickOpportunistic();
    }

    @When("I click on 'Fund' link")
    public void clickFundOfFunds(){
        searchPage.clickFund();
    }

    @When("I click on 'Core' in fund link")
    public void clickCoreOfFund(){
        searchPage.clickCoreOfFund();
    }

    @When("I click on 'Money' link")
    public void clickMoney(){
        searchPage.clickMoney();
    }

    @When("I click on 'Equity' link")
    public void clickEquity(){
        searchPage.clickEquity();
    }

    @When("I click on 'Preferred' link")
    public void clickPreferred(){
        searchPage.clickPreferred();
    }

    @When("I click on 'Fund' of money search")
    public void clickFundOfMoney(){
        searchPage.clickFundOfMoney();
    }

    @When("I click on 'Mezz' link")
    public void clickMezz(){
        searchPage.clickMezz();
    }

    @When("I click on 'Direct Into Project' link in money search")
    public void clickDirectIntoProjectLink(){
        searchPage.clickDirectIntoProjectLink();
    }

    @When("I click on 'Fund' link in money search")
    public void clickFundLink(){
        searchPage.clickFundLink();
    }

    @When("I click on 'Debt' link")
    public void clickDebt(){
        searchPage.clickDebt();
    }

    @When("I click on 'Loans' link")
    public void clickLoans() {
        searchPage.clickLoans();
    }

    @When("I click on 'Land Loan' link")
    public void clickLandLoan(){
        searchPage.clickLandLoan();
    }

    @When("I click on 'Income/Core' link")
    public void clickIncomeOrCore(){
        searchPage.clickIncomeOrCore();
    }

    @When("I click on 'Hard Money' link")
    public void clickHardMoney(){
        searchPage.clickHardMoney();
    }

    @When("")
    public void clickSearchRealConnexMarketPlaceLink(){
        searchPage.clickSearchRealConnexMarketPlaceLink();
    }

    @When("I click on 'JV Partner' link")
    public void jvPartnerLinkClick(){
        searchPage.jvPartnerLinkClick();
    }

    @When("I click on 'New Business' link")
    public void clickNewBusinessLinkClick(){
        searchPage.clickNewBusinessLinkClick();
    }

    @When("I click on 'Loans' link in new business search")
    public void clickOnLoansInNewBusinessSearch(){
        searchPage.clickOnLoansInNewBusinessSearch();
    }

    @When("I click on 'LoansOrHardMoney' link")
    public void clickLoansOrHardMoneyLink(){
        searchPage.clickLoansOrHardMoneyLink();
    }

    @When("I click on 'Mezz' link of new business search")
    public void clickMezzOfNewBusinessSearch(){
        searchPage.clickMezzOfNewBusinessSearch();
    }

    @When("I click on 'Land' link")
    public void landLinkClick(){
        searchPage.landLinkClick();
    }

    @When("I click on 'Project' link")
    public void clickProject(){
        searchPage.clickProject();
    }

    @When("I click on 'Equity' link in JV Partner search")
    public void clickEquity_JVPartner(){
        searchPage.clickEquity_JVPartner();
    }

    @When("I click on 'Services' link")
    public void clickService(){
        searchPage.clickService();
    }

    @When("I click on 'Other' link")
    public void clickOther(){
        searchPage.clickOther();
    }

    @When("I click on 'Corporate Finance' link")
    public void clickCorporateFinance(){
        searchPage.clickCorporateFinance();
    }

    @When("I click on 'Residential Broker' link")
    public void clickResidentialBrokerLink(){
        searchPage.clickResidentialBrokerLink();
    }

    @When("I click on 'Commercial Broker' link")
    public void clickCommercialBrokerLink(){
        searchPage.clickCommercialBrokerLink();
    }

    @When("I click on 'Acquisitions' link in new business search")
    public void clickAcquisitionLink_NewBusiness(){
        searchPage.clickAcquisitionLink_NewBusiness();
    }

    @When("I click on 'Design, Build & Engineering' link")
    public void clickDesignBuildEngineerLink(){
        searchPage.clickDesignBuildEngineerLink();
    }

    @When("I click on 'Architect' link")
    public void clickArchitectLink(){
        searchPage.clickArchitectLink();
    }

    @When("I click on 'Designer' link")
    public void clickDesignerLink(){
        searchPage.clickDesignerLink();
    }

    @When("I click on 'Contractor' link")
    public void clickContractorLink(){
        searchPage.clickContractorLink();
    }

    @When("I click on 'Sub Contractor' link")
    public void clickSubContractorLink(){
        searchPage.clickSubContractorLink();
    }

    @When("I click on 'Engineer' link")
    public void clickOnEngineerLink(){
        searchPage.clickOnEngineerLink();
    }

    @When("I click on 'Civil Engineer' link")
    public void clickOnCivilEngineerLink(){
        searchPage.clickOnCivilEngineerLink();
    }

    @When("I click on 'Mechanical Engineer' link")
    public void clickOnMechanicalEngineerLink(){
        searchPage.clickOnMechanicalEngineerLink();
    }

    @When("I click on 'Electrical Engineer' link")
    public void clickOnElectricalEngineerLink(){
        searchPage.clickOnElectricalEngineerLink();
    }

    @When("I click on 'Environmental Engineer' link")
    public void clickOnEnvironmentalEngineerLink(){
        searchPage.clickOnEnvironmentalEngineerLink();
    }

    @When("I click on 'Structural Engineer' link")
    public void clickOnStructuralEngineerLink(){
        searchPage.clickOnStructuralEngineerLink();
    }

    @When("I click on 'Health & Safety Engineer' link")
    public void clickHealthAndSafetyEngineerLink(){
        searchPage.clickHealthAndSafetyEngineerLink();
    }
}
