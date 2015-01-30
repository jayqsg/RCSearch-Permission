package test.steps;

import com.google.inject.Inject;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import test.pages.CombinationOfDealSponsorValidationPage;
import test.pages.PageFactory;

public class CombinationOfDealSponsorSearchValidationSteps {

    private final CombinationOfDealSponsorValidationPage combinationOfDealSponsorValidationPage;

    @Inject
    public CombinationOfDealSponsorSearchValidationSteps(PageFactory thePageFactory) {
        combinationOfDealSponsorValidationPage = thePageFactory.newCombinationOfDealSponsorValidationPage();
    }

    @Then("I verify '$strCompanyName' company name is displayed in search")
    public void verifyCompanyNameIsDisplayed(@Named("strCompanyName") String strCompanyName){
        combinationOfDealSponsorValidationPage.verifyCompanyNameIsDisplayed(strCompanyName);
    }

    @Then("I verify '$strCompanyName' company name is not displayed in search")
    public void verifyCompanyNameOfDebtLoan(@Named("strCompanyName") String strCompanyName){
        combinationOfDealSponsorValidationPage.verifyCompanyNameIsNotDisplayed(strCompanyName);
    }

}
