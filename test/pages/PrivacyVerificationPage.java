package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import test.Support.ReadData;

/**
 * Created with IntelliJ IDEA.
 * User: Bhavana
 * Date: 6/23/14
 * Time: 12:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class PrivacyVerificationPage extends FluentWebDriverPage {
    public PrivacyVerificationPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void verifyUserName(String lStrUserName){
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrUserName+"')]"),getDriverProvider().get()));
    }

    public void clickDealSponsorUserName(String lStrUserName){
        findElement(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrUserName+"')]")).click();
    }

    public void verifyCompanyName(String lStrCompanyName){
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrCompanyName+"')]"),getDriverProvider().get()));
    }

    public void verifyCompanyName_Private(String lStrCompanyName){
        try{
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong/span[contains(text(),'"+lStrCompanyName+"')]"),getDriverProvider().get()));
        } catch (AssertionError e){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Failed to verify the company name\n";
        }
    }

    public void clickCompanyName(String lStrCompanyName){
        findElement(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrCompanyName+"')]")).click();
    }

    public void clickCompanyName_Private(String lStrCompanyName){
        try{
        findElement(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong/span[contains(text(),'"+lStrCompanyName+"')]")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click the company name\n";
        }
    }

    public void verifyProjectName(String lStrProjectName){
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrProjectName+"')]"),getDriverProvider().get()));
    }

    public void verifyFundName(String lStrFundName){
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrFundName+"')]"),getDriverProvider().get()));
    }

    public void verifyLoanName(String lStrLoanName){
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrLoanName+"')]"),getDriverProvider().get()));
    }

    public void clickDealSponsorProjectName(String lStrProjectName){
        findElement(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrProjectName+"')]")).click();
    }

    public void clickAllRolesProjectsFundLoanName(String lStrFundName){
        findElement(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrFundName+"')]")).click();
    }

    public void verifyUserProfileNotDisplayed(int intRowIndex) throws Exception {
        String lStrUserName = ReadData.readDataExcel("Privacy", intRowIndex ,"NamesOfDifferentRoles");
        Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrUserName+"')]"),getDriverProvider().get()));
    }

    public void verifyUserProfileSetToIncludeNotDisplayed(int intRowIndex) {
        try{
            String lStrUserName = ReadData.readDataExcel("Privacy", intRowIndex ,"NamesOfDifferentRoles");
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong/span[contains(text(),'"+lStrUserName+"')]"),getDriverProvider().get()));
           // Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a[contains(text(),'here')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Emilly Hill user name is displayed in the search\n";
        } catch (NullPointerException N) {
            System.out.println(N);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Not able to read excel\n";
        } catch (Exception e) {
            System.out.println(e);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Error In Fetching Data From Excel\n";
        }
    }

    public void verifyCompanyProfileSetToIncludeNotDisplayed(int intRowIndex)  {
        try {
            String lStrCompanyName = ReadData.readDataExcel("Privacy", intRowIndex, "CompanyNameOfDifferentRoles");
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong/span[contains(text(),'"+lStrCompanyName+"')]"),getDriverProvider().get()));
           // Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a[contains(text(),'here')]"),getDriverProvider().get()));
        } catch (AssertionError A) {
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Company name is displayed in the search result\n";
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void verifyCompanyProfileSetToExcludeNotDisplayed(int intRowIndex) {
        try {
            String lStrCompanyName = ReadData.readDataExcel("Privacy", intRowIndex, "CompanyNameOfDifferentRoles");
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong/span[contains(text(),'" + lStrCompanyName + "')]"), getDriverProvider().get()));
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a[contains(text(),'here')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"EH Company name is retrieved in search result\n";
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void verifyCompanyProfileNotDisplayed(int intRowIndex) throws Exception {
        String lStrCompanyName = ReadData.readDataExcel("Privacy", intRowIndex ,"CompanyNameOfDifferentRoles");
        Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrCompanyName+"')]"),getDriverProvider().get()));
    }

    public void verifyLenderCompanyNotDisplayed_Private(int intRowIndex){
        try{
        String lStrCompanyName = ReadData.readDataExcel("Privacy", intRowIndex ,"CompanyNameOfDifferentRoles");
        Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong/span[contains(text(),'"+lStrCompanyName+"')]"),getDriverProvider().get()));
        } catch (AssertionError a){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Failed in comparing the user the user\n";
        } catch (Exception e){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Data is not read from excel\n";
        }
    }

    public void verifyProjectNotDisplayed(int intRowIndex) {
        try {
            String lStrPrivateProjectName = ReadData.readDataExcel("Privacy", intRowIndex, "ProjectsOfAllRoles");
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrPrivateProjectName+"')]"),getDriverProvider().get()));
            //Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a[contains(text(),'here')]"),getDriverProvider().get()));
        } catch (AssertionError A) {
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Sharon Project is retrieved in search result\n";
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void verifyProjectNotDisplayedInSearch(int intRowIndex) {
        try {
            String lStrPrivateProjectName = ReadData.readDataExcel("Privacy", intRowIndex, "ProjectsOfAllRoles");
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong/span[contains(text(),'"+lStrPrivateProjectName+"')]"),getDriverProvider().get()));
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a[contains(text(),'here')]"),getDriverProvider().get()));
        } catch (AssertionError A) {
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Sharon Project is retrieved in search result\n";
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void verifyFundNotDisplayed(int intRowIndex){
        try {
            String lStrPrivateFundName = ReadData.readDataExcel("Privacy", intRowIndex, "FundOfAllRoles");
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrPrivateFundName+"')]"),getDriverProvider().get()));
            //Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a[contains(text(),'here')]"),getDriverProvider().get()));
        } catch (AssertionError A) {
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Ross Fund is retrieved in search result\n";
        }  catch (Exception e) {
            System.out.println(e);
        }
    }

    public void verifyFundNotDisplayedInSearch(int intRowIndex){
        try {
            String lStrPrivateFundName = ReadData.readDataExcel("Privacy", intRowIndex, "FundOfAllRoles");
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong/span[contains(text(),'"+lStrPrivateFundName+"')]"),getDriverProvider().get()));
            //Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a[contains(text(),'here')]"),getDriverProvider().get()));
        } catch (AssertionError A) {
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Ross Fund is retrieved in search result\n";
        }  catch (Exception e) {
            System.out.println(e);
        }
    }

    public void verifyFundOfInvestorSetToIncludeNotDisplayed_Private(int intRowIndex)  {
        try {
            String lStrPrivateFundName = ReadData.readDataExcel("Privacy", intRowIndex, "FundOfAllRoles");
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong/span[contains(text(),'"+lStrPrivateFundName+"')]"),getDriverProvider().get()));
        } catch (Exception e) {
            System.out.println(e);
        } catch (AssertionError AE) {
            System.out.println(AE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"LY Fund name is retrieved in the search result\n";
        }
     }

    public void verifyLoanNotDisplayed(int intRowIndex){
        String lStrPrivateLoanName = null;
        try {
            lStrPrivateLoanName = ReadData.readDataExcel("Privacy", intRowIndex, "LoanOfAllRoles");
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrPrivateLoanName+"')]"),getDriverProvider().get()));
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a[contains(text(),'here')]"),getDriverProvider().get()));
        } catch (Exception e) {
            System.out.println(e);
        }  catch (AssertionError A) {
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"CY Loan name is retrieved in the search result\n";
        }
    }

    public void verifyLenderLoanNotDisplayedInMyUniverse(int intRowIndex){
        String lStrPrivateLoanName = null;
        try {
            lStrPrivateLoanName = ReadData.readDataExcel("Privacy", intRowIndex, "LoanOfAllRoles");
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong/span[contains(text(),'"+lStrPrivateLoanName+"')]"),getDriverProvider().get()));
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a[contains(text(),'here')]"),getDriverProvider().get()));
        } catch (Exception e) {
            System.out.println(e);
        }  catch (AssertionError A) {
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"CY Loan name is retrieved in the search result\n";
        }
    }

    public void verifyPropertyServiceProviderServiceNotDisplayed(int intRowIndex)throws Exception {
        String lStrPrivateServiceName = ReadData.readDataExcel("Privacy", intRowIndex,"ServiceOfAllRoles");
        Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrPrivateServiceName+"')]"),getDriverProvider().get()));
    }

    public void verifyPropertyServiceProviderListingNotDisplayed(int intRowIndex) throws Exception {
        String lStrPrivateListingName = ReadData.readDataExcel("Privacy", intRowIndex,"ListingOfAllRoles");
        Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrPrivateListingName+"')]"),getDriverProvider().get()));
    }

    public void verifyMezzNotDisplayed(int intRowIndex){
        String lStrPrivateMezzName = null;
        try {
            lStrPrivateMezzName = ReadData.readDataExcel("Privacy", intRowIndex, "MezzOfAllRoles");
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrPrivateMezzName+"')]"),getDriverProvider().get()));
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a[contains(text(),'here')]"),getDriverProvider().get()));
        } catch (Exception e) {
            System.out.println(e);
        }  catch (AssertionError A) {
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"CY Mezz name is retrieved in the search result\n";

        }
    }

    public void verifyLenderMezzNotDisplayedInMyUniverse(int intRowIndex){
        String lStrPrivateMezzName = null;
        try {
            lStrPrivateMezzName = ReadData.readDataExcel("Privacy", intRowIndex, "MezzOfAllRoles");
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong/span[contains(text(),'"+lStrPrivateMezzName+"')]"),getDriverProvider().get()));
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a[contains(text(),'here')]"),getDriverProvider().get()));
        } catch (Exception e) {
            System.out.println(e);
        }  catch (AssertionError A) {
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"CY Mezz name is retrieved in the search result\n";

        }
    }

    public void verifyProjectOfServiceProviderName(String lStrProjectOfServiceProviderName){
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrProjectOfServiceProviderName+"')]"),getDriverProvider().get()));
    }
}
