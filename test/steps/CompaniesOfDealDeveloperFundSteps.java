package test.steps;

import com.google.inject.Inject;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import test.pages.CompaniesOfDealDeveloperFundPage;
import test.pages.PageFactory;

/**
 * Created with IntelliJ IDEA.
 * User: Bhavana
 * Date: 6/23/14
 * Time: 12:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class CompaniesOfDealDeveloperFundSteps {
    private final CompaniesOfDealDeveloperFundPage companiesOfDealDeveloperFundPage;

    @Inject
    public CompaniesOfDealDeveloperFundSteps(PageFactory thePageFactory) {
        companiesOfDealDeveloperFundPage = thePageFactory.newCompaniesOfDealDeveloperFundPage();
    }

    @When("I click on verified deal sponsor company name")
    public void clickDealSponsorCompany() throws Exception {
        companiesOfDealDeveloperFundPage.clickDealSponsorCompany(1);
    }

    @When("I click on verified developer company name")
    public void clickDeveloperCompanyName() throws Exception {
        companiesOfDealDeveloperFundPage.clickDeveloperCompanyName(1);
    }

    @Then("I verify 'Fund Sponsor' company name is displayed")
    public void verifyFundSponsorCompanyName() throws Exception {
        companiesOfDealDeveloperFundPage.verifyFundSponsorCompanyName(1);
    }

    @When("I click on verified fund sponsor company name")
    public void clickFundSponsorCompanyName() throws Exception {
        companiesOfDealDeveloperFundPage.clickFundSponsorCompanyName(1);
    }

    @Then("I verify company name of deal sponsor")
    public void verifyDealSponsorCompany() throws Exception {
        companiesOfDealDeveloperFundPage.verifyDealSponsorCompanyName(1);
    }
}
