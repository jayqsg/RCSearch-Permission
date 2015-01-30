package test.steps;

import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import test.pages.DealSponsorValidationPage;
import test.pages.PageFactory;
import javax.inject.Inject;

public class DealSponsorValidationSteps {

    public final DealSponsorValidationPage dealSponsorValidationPage;

    @Inject
    public DealSponsorValidationSteps(PageFactory thePageFactory) {
        dealSponsorValidationPage = thePageFactory.newDealSponsorValidationPage();
    }

    @Then("I verify user selected '$strSideSearch' option is displayed")
    public void verifyUser(@Named("strSideSearch") String strSideSearch){
        dealSponsorValidationPage.verifyUser(1,strSideSearch);
    }

    @Then("I verify user selected '$strSideSearch' option is not displayed")
    public void otherUser(@Named("$strSideSearch") String strSideSearch){
        dealSponsorValidationPage.otherUsers(1,strSideSearch);
    }

    @Then("I verify deal sponsor user of all option is displayed")
    public void userOfAllSearchOption(){
        dealSponsorValidationPage.userOfAllSearchOption(1);
    }

    @When("I select acquisition and lease-up strategy in drop down")
    public void selectSecondStrategy(){
        dealSponsorValidationPage.selectSecondStrategy();
    }

    @When("I clear strategy field")
    public void clearStrategy(){
        dealSponsorValidationPage.clearStrategy();
    }

    @When("I click on sale leaseback option in strategy")
    public void clickSaleLeaseback(){
        dealSponsorValidationPage.clickSaleLeaseback();
    }

    @When("I click on stable income producing option in strategy")
    public void clickStableIncomeProducing(){
        dealSponsorValidationPage.clickStableIncomeProducing();
    }

    @When("I click on quick flip option in strategy")
    public void clickQuickFlip(){
        dealSponsorValidationPage.clickQuickFlip();
    }

    @When("I click on restructuring option in strategy")
    public void clickRestructuring(){
        dealSponsorValidationPage.clickRestructuring();
    }

    @When("I click on recapitalization option in strategy")
    public void clickRecapitalization(){
        dealSponsorValidationPage.clickRecapitalization();
    }

    @When("I click on land bank option in strategy")
    public void clickLandBank(){
        dealSponsorValidationPage.clickLandBank();
    }

    @When("I click on change of use option in strategy")
    public void clickChangeOfUse(){
        dealSponsorValidationPage.clickChangeOfUse();
    }

    @When("I click on development option in strategy")
    public void clickDevelopment(){
        dealSponsorValidationPage.clickDevelopment();
    }

    @When("I click on platform build option in strategy")
    public void clickPlatformBuild(){
        dealSponsorValidationPage.clickPlatformBuild();
    }

    @When("I click on pursuit option in strategy")
    public void clickPursuit(){
        dealSponsorValidationPage.clickPursuit();
    }

    @When("I click on lease up option in strategy")
    public void clickLeaseUp(){
        dealSponsorValidationPage.clickLeaseUp();
    }

    @When("I click on work out option in strategy")
    public void clickWorkOut(){
        dealSponsorValidationPage.clickWorkOut();
    }

    @When("I click on restructuring corporate option in strategy")
    public void clickRestructuringCorporate(){
        dealSponsorValidationPage.clickRestructuringCorporate();
    }

    @When("I click on public to private option in strategy")
    public void clickPublicToPrivate(){
        dealSponsorValidationPage.clickPublicToPrivate();
    }

    @When("I click on rezoning option in strategy")
    public void clickRezoning(){
        dealSponsorValidationPage.clickRezoning();
    }

    @When("I click on renovation option in strategy")
    public void clickRenovation(){
        dealSponsorValidationPage.clickRenovation();
    }

    @When("I click on forward commitment option in strategy")
    public void clickForwardCommitment(){
        dealSponsorValidationPage.clickForwardCommitment();
    }

    @When("I click on others option in strategy")
    public void clickOther(){
        dealSponsorValidationPage.clickOther();
    }

    @When("I click on all option in strategy")
    public void clickAllOptionOfAssetStrategy(){
        dealSponsorValidationPage.clickAllOptionOfAssetStrategy();
    }

    @When("I clear all option in strategy")
    public void clearForwardCommitment(){
        dealSponsorValidationPage.clearAllOptionOfAssetStrategy();
    }


}
