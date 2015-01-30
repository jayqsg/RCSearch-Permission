package test.steps;

import org.jbehave.core.annotations.Then;
import test.pages.PageFactory;
import test.pages.ProjectOfAdvisorSearchPage;

import javax.inject.Inject;

public class ProjectOfAdvisorSearchSteps {
    private final ProjectOfAdvisorSearchPage projectOfAdvisorSearchPage;

    @Inject
    public ProjectOfAdvisorSearchSteps(PageFactory thePageFactory) {
        projectOfAdvisorSearchPage = thePageFactory.newProjectOfAdvisorSearchPage();
    }

    @Then("I verify service project of advisor is displayed")
    public void verifyServiceProjectOfAdvisor(){
        projectOfAdvisorSearchPage.verifyServiceProjectOfAdvisor(3);
    }


}
