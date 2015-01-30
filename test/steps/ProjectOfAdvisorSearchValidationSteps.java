package test.steps;


import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import test.pages.PageFactory;
import test.pages.ProjectOfAdvisorSearchValidationPage;

import javax.inject.Inject;

public class ProjectOfAdvisorSearchValidationSteps {
    private final ProjectOfAdvisorSearchValidationPage projectOfAdvisorSearchValidationPage;

    @Inject
    public ProjectOfAdvisorSearchValidationSteps(PageFactory thePageFactory) {
        projectOfAdvisorSearchValidationPage = thePageFactory.newProjectOfAdvisorSearchValidationPage();
    }

    @Then("I verify '$strServiceName' service name of advisor is displayed")
    public void verifyServiceNameOfAdvisorIsDisplayed(@Named("strServiceName") String strServiceName){
        projectOfAdvisorSearchValidationPage.verifyServiceNameOfAdvisorIsDisplayed(strServiceName);
    }

    @Then("I verify '$strServiceNameNotDisplayed' service name of advisor is not displayed")
    public void  verifyServiceNameOfAdvisorNotDisplayed(@Named("strServiceNameNotDisplayed") String strServiceNameNotDisplayed){
        projectOfAdvisorSearchValidationPage.verifyServiceNameOfAdvisorNotDisplayed(strServiceNameNotDisplayed);
    }

    @Then("I verify service name of advisor selected '$strSideSearch' option is displayed")
    public void serviceOfAdvisorIsDisplayed(@Named("strSideSearch") String strSideSearch){
        projectOfAdvisorSearchValidationPage.serviceOfAdvisorIsDisplayed(3, strSideSearch);
    }

    @Then("I verify service name of advisor selected '$strSideSearch' option is not displayed")
    public void serviceOfAdvisorNotDisplayed(@Named("strSideSearch") String strSideSearch){
        boolean status = projectOfAdvisorSearchValidationPage.serviceOfAdvisorNotDisplayed(3,strSideSearch);
        Assert.assertTrue("The Searched String is found in the List", status);
    }

    @Then("I verify service name of advisor selected all search option is displayed")
    public void verifyAllOptions(){
        projectOfAdvisorSearchValidationPage.verifyAllOptionsOfAdvisorService(3);
    }

    @When("I set values of project slider")
    public void setProjectSliderValue(){
        projectOfAdvisorSearchValidationPage.setProjectSliderValue();
    }

    @When("I clear values of project slider")
    public void clearProjectSliderValue(){
        projectOfAdvisorSearchValidationPage.clearProjectSliderValue();
    }


}
