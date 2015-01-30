package test.steps;


import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import test.pages.PageFactory;
import test.pages.ProjectOfInvestmentBankerSearchValidationPage;

import javax.inject.Inject;

public class ProjectOfInvestmentBankerSearchValidationSteps {
    private final ProjectOfInvestmentBankerSearchValidationPage projectOfInvestmentBankerSearchValidationPage;

    @Inject
    public ProjectOfInvestmentBankerSearchValidationSteps(PageFactory thePageFactory) {
        projectOfInvestmentBankerSearchValidationPage = thePageFactory.newProjectOfInvestmentBankerSearchValidationPage();
    }

    @Then("I verify '$strServiceNameIsDisplayed' service name of investment banker is displayed")
    public void verifyServiceNameOfInvestmentBankerIsDisplayed(@Named("strServiceNameIsDisplayed") String strServiceNameIsDisplayed){
        projectOfInvestmentBankerSearchValidationPage.verifyServiceNameOfInvestmentBankerIsDisplayed(strServiceNameIsDisplayed);
    }

    @Then("I verify '$strServiceNameIsNotDisplayed' service name of investment banker is not displayed")
    public void  verifyServiceNameOfInvestmentBankerNotDisplayed(@Named("strServiceNameIsNotDisplayed") String strServiceNameIsNotDisplayed){
        projectOfInvestmentBankerSearchValidationPage.verifyServiceNameOfInvestmentBankerNotDisplayed(strServiceNameIsNotDisplayed);
    }

    @Then("I verify service name of investment banker selected '$strSideSearch' option is displayed")
    public void serviceOfInvestmentBankerIsDisplayed(@Named("strSideSearch") String strSideSearch){
        projectOfInvestmentBankerSearchValidationPage.serviceOfInvestmentBankerIsDisplayed(3, strSideSearch);
    }

    @Then("I verify service name of investment banker selected '$strSideSearch' option is not displayed")
    public void serviceOfInvestmentBankerNotDisplayed(@Named("strSideSearch") String strSideSearch) throws Exception {
        projectOfInvestmentBankerSearchValidationPage.serviceOfInvestmentBankerNotDisplayed(3, strSideSearch);
    }

    @Then("I verify service name of investment banker selected all search option is displayed")
    public void verifyAllOptionsOfInvestmentBankerService(){
        projectOfInvestmentBankerSearchValidationPage.verifyAllOptionsOfInvestmentBankerService(3);
    }

}
