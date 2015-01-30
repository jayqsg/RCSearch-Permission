package test.steps;

import com.google.inject.Inject;
import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Aliases;
import org.jbehave.core.annotations.When;
import test.pages.CompaniesOfDealSponsorPage;
import test.pages.PageFactory;

public class CompaniesOfDealSponsorSteps {

    private final CompaniesOfDealSponsorPage companiesOfDealSponsorPage;

    @Inject
    public CompaniesOfDealSponsorSteps(PageFactory thePageFactory) {
        companiesOfDealSponsorPage = thePageFactory.newCompaniesOfDealSponsorPage();
    }

    @When("I select office in the asset type drop down list")
    public void selectProject(){
        companiesOfDealSponsorPage.selectOffice();
    }

    @When("I clear asset type drop down")
    public void clearProjectField(){
        companiesOfDealSponsorPage.clearAssetFieldDropDown();
    }

    @When("I click on 'RiskProfile' drop down field")
    public void clickRiskProfile(){
        companiesOfDealSponsorPage.clickRiskProfile();
    }

    @When("I select core option in risk profile drop down")
    public void selectRisk(){
        companiesOfDealSponsorPage.selectRisk();
    }

    @When("I clear core in risk profile drop down")
    public void clearRiskProfile(){
        companiesOfDealSponsorPage.clearRiskProfile();
    }

    @When("I click on 'Investor and Sponsor' drop down field")
    public void clickInvestorSponsor(){
        companiesOfDealSponsorPage.clickInvestorSponsor();
    }

    @When("I click on 'Investment Method' drop down field")
    public void clickInvestmentMethod(){
        companiesOfDealSponsorPage.clickInvestmentMethod();
    }

    @When("I select advisor option in investment method drop down list")
    public void selectInvestment(){
        companiesOfDealSponsorPage.selectInvestment();
    }

    @When("I clear investment field of investor and sponsor drop down")
    public void clearInvestment(){
        companiesOfDealSponsorPage.clearInvestment();
    }

    @When("I click on 'Route to Sponsor' drop down field")
    public void clickRouteToDeveloper(){
        companiesOfDealSponsorPage.clickRouteToSponsorOfDealSponsor();
    }

    @When("I select direct only option in route to sponsor drop down list")
    public void selectRoute(){
        companiesOfDealSponsorPage.selectRoute();
    }

    @When("I clear route to sponsor drop down")
    public void clearRoute(){
        companiesOfDealSponsorPage.clearRoute();
    }

    @When("I click on asset type field of deal sponsor search")
        @Aliases(values = {"I click on asset type field of money search","I click on asset type field of investment fund search"})
    public void clickAssetTypeOfDealSponsor(){
        companiesOfDealSponsorPage.clickAssetTypeOfDealSponsor();
    }

    @When("I click on asset type field in asset experience")
    public void clickAssetTypeOfDealSponsor_AssetExperience(){
        companiesOfDealSponsorPage.clickAssetTypeOfDealSponsor_AssetExperience();
    }

    @When("I click on about field in deal sponsor company search")
    public void clickAbout(){
        companiesOfDealSponsorPage.clickAbout();
    }

    @When("I set value for average deal size")
    public void setAverageDealSize(){
        companiesOfDealSponsorPage.setAverageDealSize();
    }

    @When("I clear value for average deal size")
    public void clearAverageDealSize(){
        companiesOfDealSponsorPage.clearAverageDealSize();
    }

    @When("I set value for year in business")
    public void  setYearInBusiness(){
        companiesOfDealSponsorPage.setYearInBusiness();
    }

    @When("I clear value for year in business")
    public void  clearYearInBusiness(){
        companiesOfDealSponsorPage.clearYearInBusiness();
    }

    @When("I set value for number of professionals")
    public void setNumberOfProfessionals(){
        companiesOfDealSponsorPage.setNumberOfProfessionals();
    }

    @When("I clear value for number of professionals")
    public void clearNumberOfProfessionals(){
        companiesOfDealSponsorPage.clearNumberOfProfessionals();
    }

    @When("I set value for project completed")
    public void setProjectCompleted(){
        companiesOfDealSponsorPage.setProjectCompleted();
    }

    @When("I clear value for project completed")
    public void clearProjectCompleted(){
        companiesOfDealSponsorPage.clearProjectCompleted();
    }

    @When("I set value for sq ft developed")
    public void setSqFtDeveloped(){
        companiesOfDealSponsorPage.setSqFtDeveloped();
    }

    @When("I clear value for sq ft developed")
    public void clearSqFtDeveloped(){
        companiesOfDealSponsorPage.clearSqFtDeveloped();
    }

    @When("I set value of deals completed")
    public void setValueOfDealsCompleted(){
        companiesOfDealSponsorPage.setValueOfDealsCompleted();
    }

    @When("I clear value of deals completed")
    public void clearValueOfDealsCompleted(){
        companiesOfDealSponsorPage.clearValueOfDealsCompleted();
    }

    @When("I click on Syndicate check box")
    public void checkSyndicate(){
        companiesOfDealSponsorPage.checkSyndicate();
    }

    @When("I un check Syndicate check box")
    public void unCheckSyndicate(){
        companiesOfDealSponsorPage.unCheckSyndicate();
    }
}
