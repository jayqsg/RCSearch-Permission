package test.steps;

import com.google.inject.Inject;
import org.jbehave.core.annotations.Then;
import org.junit.Assert;
import test.Support.ReadData;
import test.pages.CompanyProfilePage;
import test.pages.PageFactory;

public class CompanyProfileSteps {
    private final CompanyProfilePage companyProfilePage;
    test.Support.ReadData ReadData = new ReadData();

    @Inject
    public CompanyProfileSteps(PageFactory thePageFactory) {
        companyProfilePage = thePageFactory.newCompanyProfilePage();
    }

    @Then("I verify asset focus of company in result list")
    public void verifyAssetFocus(){
        Assert.assertTrue("Searched Results are not matching",companyProfilePage.verifyAssetFocus(1));
    }

    @Then("I verify focusing text in the searched company")
    public void verifyFocusingOn(){
        Assert.assertTrue("Searched Results are not matching",companyProfilePage.verifyFocusingOn(1));
    }

    @Then("I verify risk profile type of the company is displayed")
    public void verifyRiskProfile(){
        Assert.assertTrue("Searched Results are not matching",companyProfilePage.verifyRiskProfile(1));
    }
}


