package test.steps;


import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.junit.Assert;
import test.pages.PageFactory;
import test.pages.ProjectOfBrokerSearchValidationPage;

import javax.inject.Inject;

public class ProjectOfBrokerSearchValidationSteps {
    private final ProjectOfBrokerSearchValidationPage projectOfBrokerSearchValidationPage;

    @Inject
    public ProjectOfBrokerSearchValidationSteps(PageFactory thePageFactory) {
        projectOfBrokerSearchValidationPage = thePageFactory.newProjectOfBrokerSearchValidationPage();
    }

    @Then("I verify '$strServiceNameIsDisplayed' service name of broker is displayed")
    public void verifyServiceNameOfBrokerIsDisplayed(@Named("strServiceNameIsDisplayed") String strServiceNameIsDisplayed){
        projectOfBrokerSearchValidationPage.verifyServiceNameOfBrokerIsDisplayed(strServiceNameIsDisplayed);
    }

    @Then("I verify '$strServiceNameIsNotDisplayed' service name of broker is not displayed")
    public void  verifyServiceNameOfBrokerNotDisplayed(@Named("strServiceNameIsNotDisplayed") String strServiceNameIsNotDisplayed){
        projectOfBrokerSearchValidationPage.verifyServiceNameOfBrokerNotDisplayed(strServiceNameIsNotDisplayed);
    }

    @Then("I verify service name of broker selected '$strSideSearch' option is displayed")
    public void serviceOfBrokerIsDisplayed(@Named("strSideSearch") String strSideSearch){
        projectOfBrokerSearchValidationPage.serviceOfBrokerIsDisplayed(3, strSideSearch);
    }

    @Then("I verify service name of broker selected '$strSideSearch' option is not displayed")
    public void serviceOfBrokerNotDisplayed(@Named("strSideSearch") String strSideSearch) throws Exception {
        projectOfBrokerSearchValidationPage.serviceOfBrokerNotDisplayed(3,strSideSearch);
    }

    @Then("I verify service name of broker selected all search option is displayed")
    public void verifyAllOptionsOfBrokerService(){
        projectOfBrokerSearchValidationPage.verifyAllOptionsOfBrokerService(3);
    }
}
