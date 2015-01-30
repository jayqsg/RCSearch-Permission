package test.steps;


import org.jbehave.core.annotations.Then;
import test.pages.PageFactory;
import test.pages.ProjectOfBrokerSearchPage;


import javax.inject.Inject;

public class ProjectOfBrokerSearchSteps {
    private final ProjectOfBrokerSearchPage projectOfBrokerSearchPage;

    @Inject
    public ProjectOfBrokerSearchSteps(PageFactory thePageFactory) {
        projectOfBrokerSearchPage = thePageFactory.newProjectOfBrokerSearchPage();
    }

    @Then("I verify service project of broker is displayed")
    public void verifyServiceProjectOfAdvisor(){
        projectOfBrokerSearchPage.verifyServiceProjectOfBroker(1);
    }
}
