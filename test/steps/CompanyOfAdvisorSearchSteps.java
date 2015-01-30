package test.steps;


import com.google.inject.Inject;
import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import test.Support.ReadData;
import test.pages.CompanyOfAdvisorSearchPage;
import test.pages.PageFactory;

public class CompanyOfAdvisorSearchSteps {
    private final CompanyOfAdvisorSearchPage companyOfAdvisorSearchPage;
    ReadData ReadData = new ReadData();

    @Inject
    public CompanyOfAdvisorSearchSteps(PageFactory thePageFactory) {
        companyOfAdvisorSearchPage = thePageFactory.newCompanyOfAdvisorSearchPage();
    }

    @Then("I should see 'RE Advisors' as find in search option")
    public void verifyFindOfAdvisor(){
        companyOfAdvisorSearchPage.verifyFindOfAdvisor();
    }

    @Then("I should see 'Advisor' as subrole in search option")
    public void verifySubroleOfAdvisor(){
        companyOfAdvisorSearchPage.verifySubroleOfAdvisor();
    }

    @Then("I should see 'Appraisal' as strategy in search option")
    public void verifyStrategy(){
        companyOfAdvisorSearchPage.verifyStrategy();
    }

    @Then("I should see 'Project Management' as strategy in search option")
    public void verifyProjectManagementInStrategy(){
        companyOfAdvisorSearchPage.verifyProjectManagementInStrategy();
    }

    @When("I click on company of user")
    public void clickAppraisalUser(){
        companyOfAdvisorSearchPage.clickAdvisorCompany(1);
    }

    @When("I click on service of user")
    public void clickServiceUser(){
        companyOfAdvisorSearchPage.clickServiceUser(3);
    }

    @When("I select asset experience drop down field")
    public void selectAssetExperienceDropDown(){
        companyOfAdvisorSearchPage.selectAssetExperienceDropDown();
    }

    @When("I select office option in asset experience drop down")
    public void selectOfficeAssetExperience(){
        companyOfAdvisorSearchPage.selectOfficeAssetExperience();
    }

    @Then("I verify company of advisor is displayed")
    public void verifyAdvisorCompany() throws Exception {
        companyOfAdvisorSearchPage.verifyAdvisorCompany(1);
    }

    @When("I clear office option of asset experience drop down")
    public void clearOfficeAssetExperience(){
        companyOfAdvisorSearchPage.selectOfficeAssetExperience();
    }

    @When("I click on deal stage drop down")
        @Alias("I click on deal stage drop down in search")
    public void clickDealStage(){
        companyOfAdvisorSearchPage.clickDealStage();
    }

    @When("I select owned option in deal stage drop down")
    public void selectOwnedOptionInDealStage(){
        companyOfAdvisorSearchPage.selectOwnedOptionInDealStage();
    }

    @When("I clear owned option in deal stage drop down")
    public void clearOwnedOptionInDealStage(){
        companyOfAdvisorSearchPage.selectOwnedOptionInDealStage();
    }

    @When("I click on Missouri state")
    public void clickMissouriState(){
        companyOfAdvisorSearchPage.clickMissouriState();
    }

    @When("I enter and select Ink city")
    public void enterAndSelectInlCity(){
        companyOfAdvisorSearchPage.enterAndSelectInkCity();
    }


}
