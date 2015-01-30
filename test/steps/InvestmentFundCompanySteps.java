package test.steps;


import com.google.inject.Inject;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import test.pages.InvestmentFundCompanyPage;
import test.pages.PageFactory;

public class InvestmentFundCompanySteps {
    private final InvestmentFundCompanyPage investmentFundCompanyPage;

    @Inject
    public InvestmentFundCompanySteps(PageFactory thePageFactory) {
        investmentFundCompanyPage = thePageFactory.newInvestmentFundCompanyPage();
    }

    @Then("I verify kind of search option in fund search")
    public void verifyKindInFundOfFund(){
        investmentFundCompanyPage.verifyKindInFund(2);
    }

    @Then("I verify risk of search option in fund search")
    public void verifyRiskInFundOfFund(){
        investmentFundCompanyPage.verifyRiskInFund(1);
    }

    @When("I click on company name of investment fund")
    public void clickCompanyName(){
        investmentFundCompanyPage.clickCompanyName(1);
    }

    @When("I click on fund of investor")
    public void clickOnFundOfInvestor(){
        investmentFundCompanyPage.clickOnFundOfInvestor(1);
    }

    @When("I click on fund of deal sponsor")
    public void clickOnFundOfDealSponsor(){
        investmentFundCompanyPage.clickOnFundOfDealSponsor(1);
    }

    @When("I select co developer option in investing as drop down field")
    public void selectCoDeveloper(){
        investmentFundCompanyPage.selectCoDeveloper();
    }

    @When("I clear co developer option in investing as drop down field")
    public void clearCoDeveloper(){
        investmentFundCompanyPage.selectCoDeveloper();
    }

    @Then("I verify company name of investment fund is displayed")
    public void verifyCompanyOfInvestmentFund(){
        investmentFundCompanyPage.verifyCompanyOfInvestmentFund(1);
    }

    @When("I click on route to investment field")
    public void clickRouteToInvestment(){
        investmentFundCompanyPage.clickRouteToInvestment();
    }

    @When("I select intermediary option in route to investment field")
    public void selectIntermediary(){
        investmentFundCompanyPage.selectIntermediary();
    }

    @When("I clear intermediary option in route to investment field")
    public void clearIntermediary(){
        investmentFundCompanyPage.selectIntermediary();
    }

    @When("I click on fund strategy")
    public void clickFundStrategy(){
        investmentFundCompanyPage.clickFundStrategy();
    }

    @When("I click on asset type field")
    public void clickAssetType(){
        investmentFundCompanyPage.clickAssetType();
    }

    @When("I select solar option of asset type")
    public void selectSolarAsset(){
        investmentFundCompanyPage.selectSolarAsset();
    }

    @When("I clear on solar option of asset type")
    public void clearSolarAsset(){
        investmentFundCompanyPage.selectSolarAsset();
    }

    @When("I select rezoning option in asset strategy")
    public void selectRezoning(){
        investmentFundCompanyPage.selectRezoning();
    }

    @When("I clear rezoning option in asset strategy")
    public void clearRezoning(){
        investmentFundCompanyPage.selectRezoning();
    }

    @When("I check syndicators type check box")
    public void checkSyndicators(){
        investmentFundCompanyPage.checkSyndicators();
    }

    @When("I un check syndicators type check box")
    public void unCheckSyndicators(){
        investmentFundCompanyPage.checkSyndicators();
    }

    @When("I enter and select Yerba city")
    public void enterAndSelectYerbaCity(){
        investmentFundCompanyPage.enterAndSelectYerbaCity();
    }
}
