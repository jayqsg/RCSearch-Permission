package test.steps;


import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import test.pages.DealSponsorPage;
import test.pages.PageFactory;

import javax.inject.Inject;

public class DealSponsorSteps {

    public final DealSponsorPage dealSponsorPage;

    @Inject
    public DealSponsorSteps(PageFactory thePageFactory) {
        dealSponsorPage = thePageFactory.newDealSponsorPage();
    }

    @Then("I should see '$nameOfFindInSearchOption' in find of search option")
    public void verifyFindInSearchOption(@Named("nameOfFindInSearchOption") String strNameOfFindInSearchOption){
        String lStrNameOfFindInSearchOption = dealSponsorPage.verifyFindInSearchOption();
        Assert.assertTrue(strNameOfFindInSearchOption.contains(lStrNameOfFindInSearchOption));
    }

    @Then("I should see sub role as '$nameOSubRole'")
    public void verifySearchOption(@Named("nameOSubRole") String strSubRole){
        String lStrSubRole = dealSponsorPage.verifySearchOption();
        Assert.assertTrue(strSubRole.contains(lStrSubRole));
    }

    @When("I click on 'Project' field")
    public void clickProject(){
        dealSponsorPage.clickProject();
    }

    @When("I click on 'Asset Strategy' drop down field")
    public void clickStrategy(){
        dealSponsorPage.clickAssetStrategy();
    }

    @When("I select acquisition option in a strategy field of drop down list")
    public void selectAcquisitionField(){
        dealSponsorPage.selectAcquisitionField();
    }

    @When("I clear acquisition option in a strategy field of drop down list")
    public void clearAcquisitionField(){
        dealSponsorPage.clearAcquisitionField();
    }

    @When("I click on asset experience")
    public void clickAssetExperience(){
        dealSponsorPage.clickAssetExperience();
    }

    @When("I click on asset experience field")
    public void clickAssetExperienceField_CompanySearch(){
        dealSponsorPage.clickAssetExperienceField_CompanySearch();
    }

}

