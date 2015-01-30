package test.steps;


import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import test.pages.InvestmentFundProjectPage;
import test.pages.PageFactory;

public class InvestmentFundProjectSteps {
    private final InvestmentFundProjectPage investmentFundProjectPage;

    @Inject
    public InvestmentFundProjectSteps(PageFactory thePageFactory) {
        investmentFundProjectPage = thePageFactory.newInvestmentFundProjectPage();
    }

    @Then("I verify Fund Of Deal Sponsor")
    public void verifyFundOfDealSponsor(){
       investmentFundProjectPage.verifyFundOfDealSponsor(1);
    }

    @Then("I verify Fund Of Investor")
    public void verifyFundOfInvestor(){
        investmentFundProjectPage.verifyFundOfInvestor(1);
    }

    @When("I set the values for fund size")
    public void setValuesOfFundSize() {
        investmentFundProjectPage.setValuesOfFundSize();
    }

    @When("I clear the values for fund size")
    public void clearValuesOfFundSize() {
        investmentFundProjectPage.clearValuesOfFundSize();
    }

    @When("I set the value of investment amount field")
    public void setInvestmentAmount(){
        investmentFundProjectPage.setInvestmentAmount();
    }

    @When("I clear the value of investment amount field")
    public void clearInvestmentAmount(){
        investmentFundProjectPage.clearInvestmentAmount();
    }

    @When("I select In House Sponsors")
    public void selectInHouseSponsors(){
        investmentFundProjectPage.selectInHouseSponsors();
    }

    @When("I clear In House Sponsors")
    public void clearInHouseSponsors(){
        investmentFundProjectPage.selectInHouseSponsors();
    }

    @When("I select Co-Invest with Operating Partners")
    public void selectCoInvestWithOperatingPartners(){
        investmentFundProjectPage.selectCoInvestWithOperatingPartners();
    }

    @When("I clear Co-Invest with Operating Partners")
    public void clearCoInvestWithOperatingPartners(){
        investmentFundProjectPage.selectCoInvestWithOperatingPartners();
    }

    @When("I click on fund experience")
    public void clickFundExperience(){
        investmentFundProjectPage.clickFundExperience();
    }

    @When("I set value for manager’s experience")
    public void setManagerExperience(){
        investmentFundProjectPage.setManagerExperience();
    }

    @When("I clear value for manager’s experience")
    public void clearManagerExperience(){
        investmentFundProjectPage.clearManagerExperience();
    }

    @When("I set value for average returns over 1 year")
    public void setAverageReturn1Year(){
        investmentFundProjectPage.setAverageReturn1Year();
    }

    @When("I clear value for average returns over 1 year")
    public void clearAverageReturn1Year(){
        investmentFundProjectPage.clearAverageReturn1Year();
    }

    @When("I set value for average returns over 3 year")
    public void setAverageReturnValue3Year(){
        investmentFundProjectPage.setAverageReturnValue3Year();
    }

    @When("I clear value for average returns over 3 year")
    public void clearAverageReturnValue3Year(){
        investmentFundProjectPage.clearAverageReturnValue3Year();
    }

    @When("I set value for average returns over 5 year")
    public void setAverageReturnValue5Year(){
        investmentFundProjectPage.setAverageReturnValue5Year();
    }

    @When("I clear value for average returns over 5 year")
    public void clearAverageReturnValue5Year(){
        investmentFundProjectPage.clearAverageReturnValue5Year();
    }

    @Then("I verify '$strDealSponsorFund' of investment fund is displayed")
    public void verifyFundOfInvestmentIsDisplayed(@Named("strDealSponsorFund") String strDealSponsorFund){
        investmentFundProjectPage.verifyFundOfInvestmentIsDisplayed(strDealSponsorFund);
    }

    @When("I select COC Percent value in return profile in investment fund search")
        @Alias("I select COC Percent value in return profile of money search")
    public void selectCocPercent(){
        investmentFundProjectPage.selectCocPercent_InvestmentFund();
    }

    @When("I clear COC Percent value in return profile in investment fund search")
    @Alias("I clear COC Percent value in return profile of money search")
    public void clearCocPercent(){
        investmentFundProjectPage.clearCocPercent_InvestmentFund();
    }

    @When("I select IRR Percent value in return profile in investment fund search")
    @Alias("I select IRR Percent value in return profile of money search")
    public void selectIrrPercent(){
        investmentFundProjectPage.selectIrrPercent_InvestmentFund();
    }

    @When("I clear IRR Percent value in return profile in investment fund search")
    @Alias("I clear IRR Percent value in return profile of money search")
    public void clearIrrPercent(){
        investmentFundProjectPage.clearIrrPercent_InvestmentFund();
    }

    @When("I select ROE Percent value in return profile in investment fund search")
    @Alias("I select ROE Percent value in return profile of money search")
    public void selectRoePercent(){
        investmentFundProjectPage.selectRoePercent_InvestmentFund();
    }

    @When("I clear ROE Percent value in return profile in investment fund search")
    @Alias("I clear ROE Percent value in return profile of money search")
    public void clearRoePercent(){
        investmentFundProjectPage.clearRoePercent_InvestmentFund();
    }

    @When("I select CAP Percent value in return profile in investment fund search")
    @Alias("I select CAP Percent value in return profile of money search")
    public void selectCapPercent(){
        investmentFundProjectPage.selectCapPercent_InvestmentFund();
    }

    @When("I clear CAP Percent value in return profile in investment fund search")
    @Alias("I clear CAP Percent value in return profile of money search")
    public void clearCapPercent(){
        investmentFundProjectPage.clearCapPercent_InvestmentFund();
    }

    @When("I select holding min value in return profile in investment fund search")
    @Alias("I select holding min value in return profile of money search")
    public void selectHoldingMin(){
        investmentFundProjectPage.selectHoldingMin_InvestmentFund();
    }

    @When("I clear holding min value in return profile in investment fund search")
    @Alias("I clear holding min value in return profile of money search")
    public void clearHoldingMin(){
        investmentFundProjectPage.clearHoldingMin_InvestmentFund();
    }

    @When("I select holding max value in return profile in investment fund search")
    @Alias("I select holding max value in return profile of money search")
    public void selectHoldingMax(){
        investmentFundProjectPage.selectHoldingMax_InvestmentFund();
    }

    @When("I clear holding max value in return profile in investment fund search")
    @Alias("I clear holding max value in return profile of money search")
    public void clearHoldingMax(){
        investmentFundProjectPage.clearHoldingMax_InvestmentFund();
    }
}
