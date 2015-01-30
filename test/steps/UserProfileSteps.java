package test.steps;

import com.google.inject.Inject;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import test.pages.PageFactory;
import test.pages.UserProfilePage;

public class UserProfileSteps {
    private final UserProfilePage userProfilePage;

    @Inject
    public UserProfileSteps(PageFactory thePageFactory) {
        userProfilePage = thePageFactory.newUserProfilePage();
    }

    @Then("I should see 'RCMP MarketPlace' image")
    public void rCMPMarketPlaceImg(){
        userProfilePage.rCMPMarketPlaceImg();
    }

    @When("I click on 'RCMP MarketPlace' button")
    public void clickRCMPMarketPlaceButton(){
        userProfilePage.clickRCMPMarketPlaceButton();
    }
}
