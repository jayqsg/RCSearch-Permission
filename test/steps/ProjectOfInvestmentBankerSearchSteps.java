package test.steps;



import org.jbehave.core.annotations.Then;
import test.pages.PageFactory;
import test.pages.ProjectOfInvestmentBankerSearchPage;

import javax.inject.Inject;

public class ProjectOfInvestmentBankerSearchSteps {
    private final ProjectOfInvestmentBankerSearchPage projectOfInvestmentBankerSearchPage;

    @Inject
    public ProjectOfInvestmentBankerSearchSteps(PageFactory thePageFactory) {
        projectOfInvestmentBankerSearchPage = thePageFactory.newProjectOfInvestmentBankerSearchPage();
    }

    @Then("I verify service project of investment banker is displayed")
    public void verifyServiceProjectOfAdvisor(){
        projectOfInvestmentBankerSearchPage.verifyServiceProjectOfInvestmentBanker(2);
    }
}
