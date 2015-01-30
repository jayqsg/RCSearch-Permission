package test.steps;

import com.google.inject.Inject;
import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import test.pages.PageFactory;
import test.pages.ProjectOfInvestmentDirectIntoPage;


public class ProjectOfInvestmentDirectIntoSteps {
    private final ProjectOfInvestmentDirectIntoPage projectOfInvestmentBankerDirectIntoPage;

    @Inject
    public ProjectOfInvestmentDirectIntoSteps(PageFactory thePageFactory) {
        projectOfInvestmentBankerDirectIntoPage = thePageFactory.newProjectOfInvestmentDirectIntoPage();
    }

    @Then("I should see '$nameOfFind' in find field of search option")
    public void verifyFindInSearchOption(@Named("nameOfFind") String strTextInFind){
        String lStrTextInFind = projectOfInvestmentBankerDirectIntoPage.verifyFindInSearchOption();
        Assert.assertTrue(strTextInFind.contains(lStrTextInFind));
    }

    @Then("I verify kind in search option")
    public void verifyKindInSearchOption(){
        projectOfInvestmentBankerDirectIntoPage.verifyKindInSearchOption(1);
    }

    @Then("I verify risk in search option")
    public void verifyRiskInSearchOption(){
        projectOfInvestmentBankerDirectIntoPage.verifyRiskInSearchOption(1);
    }

    @When("I click on investment direct into company")
    public void clickCompanyOfBanker(){
        projectOfInvestmentBankerDirectIntoPage.clickCompanyOfBanker(1);
    }

    @When("I click on investment direct into service project")
    public void clickProjectOfBanker(){
        projectOfInvestmentBankerDirectIntoPage.clickProjectOfBanker(1);
    }

    @When("I click on investment direct into listing project")
    public void clickListingOfBanker(){
        projectOfInvestmentBankerDirectIntoPage.clickListingOfBanker(1);
    }

    @Then("I verify the company name of investment direct into is displayed")
    public void verifyCompanyOfBanker(){
        projectOfInvestmentBankerDirectIntoPage.verifyCompanyOfBanker(1);
    }

    @Then("I verify service project of investments is displayed")
    public void verifyProjectOfInvestmentBanker(){
        projectOfInvestmentBankerDirectIntoPage.verifyProjectOfInvestmentBanker(1);
    }

    @Then("I verify listing project of investments is displayed")
    public void verifyListingOfInvestmentBanker(){
        projectOfInvestmentBankerDirectIntoPage.verifyListingOfInvestmentBanker(1);
    }

    @When("I select value in investment amount slider")
    public void selectInvestmentAmount(){
        projectOfInvestmentBankerDirectIntoPage.selectInvestmentAmount();
    }

    @When("I clear value in investment amount slider")
    public void clearInvestmentAmount(){
        projectOfInvestmentBankerDirectIntoPage.clearInvestmentAmount();
    }

    @When("I select the value of deal size")
    public void selectValueOfDealSize(){
        projectOfInvestmentBankerDirectIntoPage.selectValueOfDealSize();
    }

    @When("I clear the value of deal size")
    public void clearValueOfDealSize(){
        projectOfInvestmentBankerDirectIntoPage.clearValueOfDealSize();
    }

    @When("I click investing as drop down field")
    public void clickInvestingAs(){
        projectOfInvestmentBankerDirectIntoPage.clickInvestingAs();
    }

    @When("I select general partner option in investing as drop down field")
    public void selectGeneralPartner(){
        projectOfInvestmentBankerDirectIntoPage.selectGeneralPartner();
    }

    @When("I clear general partner option in investing as drop down field")
    public void clearGeneralPartner(){
        projectOfInvestmentBankerDirectIntoPage.clearGeneralPartner();
    }

    @When("I click on current asset status drop down field")
    public void clickOnCurrentAssetStatus(){
        projectOfInvestmentBankerDirectIntoPage.clickOnCurrentAssetStatus();
    }

    @When("I select fully rented option in current asset status field")
    public void selectFullyRented(){
        projectOfInvestmentBankerDirectIntoPage.selectFullyRented();
    }

    @When("I clear fully rented option in current asset status field")
    public void clearFullyRented(){
        projectOfInvestmentBankerDirectIntoPage.clearFullyRented();
    }

    @When("I click on return profile")
        @Alias("I click on target return")
    public void clickReturnProfile(){
        projectOfInvestmentBankerDirectIntoPage.clickReturnProfile();
    }

    @When("I click on return profile in investment direct into")
    public void clickReturnProfile_InvestmentDirectInto(){
        projectOfInvestmentBankerDirectIntoPage.clickReturnProfile_InvestmentDirectInto();
    }

    @When("I select COC Percent value in return profile")
    public void selectCocPercent(){
        projectOfInvestmentBankerDirectIntoPage.selectCocPercent();
    }

    @When("I clear COC Percent value in return profile")
    public void clearCocPercent(){
        projectOfInvestmentBankerDirectIntoPage.clearCocPercent();
    }

    @When("I click Leveraged check box")
    public void clickLeveraged(){
        projectOfInvestmentBankerDirectIntoPage.clickLeveraged();
    }

    @When("I clear Leveraged check box")
    public void clearLeveraged(){
        projectOfInvestmentBankerDirectIntoPage.clearLeveraged();
    }

    @When("I select IRR Percent value in return profile")
    public void selectIrrPercent(){
        projectOfInvestmentBankerDirectIntoPage.selectIrrPercent();
    }

    @When("I clear IRR Percent value in return profile")
    public void clearIrrPercent(){
        projectOfInvestmentBankerDirectIntoPage.clearIrrPercent();
    }

    @When("I select ROE Percent value in return profile")
    public void selectRoePercent(){
        projectOfInvestmentBankerDirectIntoPage.selectRoePercent();
    }

    @When("I clear ROE Percent value in return profile")
    public void clearRoePercent(){
        projectOfInvestmentBankerDirectIntoPage.clearRoePercent();
    }

    @When("I click Actual check box")
    public void clickActual(){
        projectOfInvestmentBankerDirectIntoPage.clickActual();
    }

    @When("I clear Actual check box")
    public void clearActual(){
        projectOfInvestmentBankerDirectIntoPage.clearActual();
    }

    @When("I select CAP Percent value in return profile")
    public void selectCapPercent(){
        projectOfInvestmentBankerDirectIntoPage.selectCapPercent();
    }

    @When("I clear CAP Percent value in return profile")
    public void clearCapPercent(){
        projectOfInvestmentBankerDirectIntoPage.clearCapPercent();
    }

    @When("I click Pro Forma check box")
    public void clickProForma(){
        projectOfInvestmentBankerDirectIntoPage.clickProForma();
    }

    @When("I clear Pro Forma check box")
    public void clearProForma(){
        projectOfInvestmentBankerDirectIntoPage.clearProForma();
    }

    @When("I select holding min value in return profile")
    public void selectHoldingMin(){
        projectOfInvestmentBankerDirectIntoPage.selectHoldingMin();
    }

    @When("I clear holding min value in return profile")
    public void clearHoldingMin(){
        projectOfInvestmentBankerDirectIntoPage.clearHoldingMin();
    }

    @When("I select holding max value in return profile")
    public void selectHoldingMax(){
        projectOfInvestmentBankerDirectIntoPage.selectHoldingMax();
    }

    @When("I clear holding max value in return profile")
    public void clearHoldingMax(){
        projectOfInvestmentBankerDirectIntoPage.clearHoldingMax();
    }
}
