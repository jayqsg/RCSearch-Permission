package test.steps;

import com.google.inject.Inject;
import org.jbehave.core.annotations.Then;
import test.pages.DeveloperDealAndFundSponsorPage;
import test.pages.PageFactory;

public class DeveloperDealAndFundSponsorSteps {

    private final DeveloperDealAndFundSponsorPage developerDealAndFundSponsorPage;

    @Inject
    public DeveloperDealAndFundSponsorSteps(PageFactory thePageFactory) {
        developerDealAndFundSponsorPage = thePageFactory.newDeveloperDealAndFundSponsorPage();
    }

    @Then("I should see 'Developers, Deal Sponsors' as find in search option")
    public void verifyFindSearch(){
        developerDealAndFundSponsorPage.verifyFindSearch(1);
    }

    @Then("I should see 'Developer, Deal Sponsor' as sub role in search option")
    public void verifySubRoleSearch(){
        developerDealAndFundSponsorPage.verifySubRoleSearch(1);
    }

    @Then("I verify the developer name is displayed")
    public void verifyDeveloperNameInSearch(){
       developerDealAndFundSponsorPage.verifyDeveloperNameInSearch(1);
    }
}



