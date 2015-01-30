package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.Point;
import org.openqa.selenium.internal.Locatable;
import test.Support.ReadData;
import test.steps.VerificationStatements;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: Bhavana
 * Date: 9/4/14
 * Time: 5:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class JVPartnerPage extends FluentWebDriverPage {

    String gStrMatchCountInProfile="",gStrMatchCountInSearchResult="",gStrLocationFieldName="";

    public JVPartnerPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void verifyFindInSearch(int RowIndex){
        try{
            String strVerifyLookingFor= ReadData.readDataExcel("JVPartner and NewBusiness", RowIndex, "VerifyFindInSearch");
            Assert.assertEquals(strVerifyLookingFor, findElement(By.xpath("//div[@id='searchFilters']/div[1]/span[1]/strong")).getText());
        } catch (AssertionError A) {
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Verification of find in search failed";
        } catch (NullPointerException NE) {
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Not Able to Find the Excel Sheet";
        } catch (NoSuchElementException N){
            System.out.println(N);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Not able to see find in search page\n";
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void verifyNewBusinessSearchOfLoanType(int RowIndex){
        try{
            String strVerifyLookingFor= ReadData.readDataExcel("JVPartner and NewBusiness", RowIndex, "VerifyLoanType");
            Assert.assertEquals(strVerifyLookingFor, findElement(By.xpath("//div[@id='searchFilters']/div[1]/span[2]/strong")).getText());
        } catch (AssertionError A) {
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Verification of Loan Type field failed";
        } catch (NullPointerException NE) {
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Not Able to Find the Excel Sheet";
        } catch (NoSuchElementException N){
            System.out.println(N);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Not able to see looking for in search page\n";
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void verifyLookingFor(int RowIndex){
        try{
            String strVerifyLookingFor= ReadData.readDataExcel("JVPartner and NewBusiness", RowIndex, "VerifyLookingFor");
            String strGetText =  findElement(By.xpath("//div[@id='searchFilters']/div[1]/span[2]/strong")).getText();
            Assert.assertEquals(strVerifyLookingFor, findElement(By.xpath("//div[@id='searchFilters']/div[1]/span[2]/strong")).getText());
        } catch (AssertionError A) {
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Verification of Looking for field failed";
        } catch (NullPointerException NE) {
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Not Able to Find the Excel Sheet";
        } catch (NoSuchElementException N){
            System.out.println(N);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Not able to see looking for in search page\n";
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void verifyDealSponsorFundNameIsDisplayedName(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDealSponsorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Kelly Fund Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Kelly Fund Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyDealSponsorFundNameIsDisplayedNameInOtherSearch(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strDealSponsorFundName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LRoss Fund Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LRoss Fund Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyDealSponsorProjectNameIsDisplayedNameInOtherSearch(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDealSponsorProjectName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LRoss Project Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LRoss Project Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyInvestorFundNameIsDisplayedNameInOtherSearch(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strInvestorFundName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Hill Fund Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Hill Fund Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyLenderLoanNameIsDisplayedNameInOtherSearch(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strLenderLoanName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"King Loan Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"King Loan Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyLenderMezzNameIsDisplayedNameInOtherSearch(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strLenderMezzName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Kings Mezz Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Kings Mezz Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyAdvisorListingNameIsDisplayedNameInOtherSearch(String strAdvisorListingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strAdvisorListingName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"SMid Listing Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"SMid Listing Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyAdvisorServiceNameIsDisplayedInOtherSearch(String strAdvisorServiceName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strAdvisorServiceName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"SMid Service Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"SMid Service Is Not Displayed in the Search Result\n";
        }
    }

    public void clickLRossFund(){
        int intCnt=0;
        boolean blnFound=false;
        while(!blnFound && intCnt<=5){
            try{
                //wait until page loads
                WaitUtil.simpleSleep(1000);
                Actions moveTo = new Actions(getDriverProvider().get());
                WaitUtil.simpleSleep(5000);
                executeScript("scroll(0,150)");
                WaitUtil.simpleSleep(5000);
                moveTo.moveToElement(findElement(By.xpath("//section[@id='content']/div/div/ng-include/section/div/div/div[@class='item cycle-slide ng-scope cycle-slide-active']/ul/li/div[@class='action-block']/preceding-sibling::div[@class='name-hold']/strong[contains(text(),'LRoss Fund')]"))).build().perform();
                if (!findElement(By.xpath("//section[@id='content']/div/div/ng-include/section/div/div/div[@class='item cycle-slide ng-scope cycle-slide-active']/ul/li/div[@class='action-block']/preceding-sibling::div[@class='name-hold']/strong[contains(text(),'LRoss Fund')]/parent::div/parent::li/div/a/i[@class=\"fa fa-pencil\"]")).isDisplayed()) {
                    moveTo.moveToElement(findElement(By.xpath("//section[@id='content']/div/div/ng-include/section/div/div/div[@class='item cycle-slide ng-scope cycle-slide-active']/ul/li/div[@class='action-block']/preceding-sibling::div[@class='name-hold']/strong[contains(text(),'LRoss Fund')]"))).build().perform();
                } else {
                    findElement(By.xpath("//section[@id='content']/div/div/ng-include/section/div/div/div[@class='item cycle-slide ng-scope cycle-slide-active']/ul/li/div[@class='action-block']/preceding-sibling::div[@class='name-hold']/strong[contains(text(),'LRoss Fund')]/parent::div/parent::li/div/a/i[@class=\"fa fa-pencil\"]")).click();
                    blnFound=true;
                }
            }catch (NoSuchElementException N){
                WaitUtil.simpleSleep(1000);
                LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Not Able to click on fund name in Your Postings\n";
                intCnt++;
            }
        }
    }

    public void verifyOtherIsSelected(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Your Contribution:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.id("PartnercontributionId_checkbox_5"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Your Contribution:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void verifyFundNameIsDisplayedInSearchResultToFilterSelected_OtherSearch(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDealSponsorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LRoss Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LRoss Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyProjectNameIsDisplayedInSearchResultToFilterSelected_OtherSearch(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDealSponsorProjectName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LRoss Project Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LRoss Project Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyInvestorFundNameIsDisplayedInSearchResultToFilterSelected_OtherSearching(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strInvestorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Hill Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Hill Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyLenderLoanNameIsDisplayedInSearchResultToFilterSelected_OtherSearch(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strLenderLoanName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Kings Loan Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Kings Loan Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyLenderMezzNameIsDisplayedInSearchResultToFilterSelected_OtherSearch(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strLenderMezzName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Kings Mezz Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Kings Mezz Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyAdvisorListingNameIsDisplayedInSearchResultToFilterSelected_OtherSearch(String strAdvisorListingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAdvisorListingName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"SMid Listing Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"SMid Listing Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyAdvisorServiceNameIsDisplayedInSearchResultToFilterSelected_OtherSearch(String strAdvisorServiceName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAdvisorServiceName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"SMid Service Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"SMid Service Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyFundNameInSearchResultWhenClickOnMatchesDisplayedInOtherSearch(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strDealSponsorFundName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LRoss Fund Is Not Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LRoss Fund Is Not Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyProjectNameInSearchResultWhenClickOnMatchesDisplayedInOtherSearch(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDealSponsorProjectName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LRoss Project Is Not Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LRoss Project Is Not Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyInvestorFundNameInSearchResultWhenClickOnMatchesDisplayedInOtherSearch(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strInvestorFundName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Hill Fund Is Not Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Hill Fund Is Not Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyLenderLoanNameInSearchResultWhenClickOnMatchesDisplayedInOtherSearch(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strLenderLoanName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Kings Loan Is Not Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Kings Loan Is Not Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyLenderMezzNameInSearchResultWhenClickOnMatchesDisplayedInOtherSearch(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strLenderMezzName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Kings Mezz Is Not Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Kings Mezz Is Not Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyAdvisorListingNameInSearchResultWhenClickOnMatchesDisplayedInOtherSearch(String strAdvisorListingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strAdvisorListingName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"SMid Listing Is Not Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"SMid Listing Is Not Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyAdvisorServiceNameInSearchResultWhenClickOnMatchesDisplayedInOtherSearch(String strAdvisorServiceName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strAdvisorServiceName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"SMid Service Is Not Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"SMid Service Is Not Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void selectOtherOption(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("PartnercontributionId_checkbox_5")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("PartnercontributionId_checkbox_5"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Your Contribution:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearOtherOption(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("PartnercontributionId_checkbox_5")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("PartnercontributionId_checkbox_5"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Your Contribution:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectLocationInOtherSearch(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        try{
            gStrLocationFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.id("LocationInputSearch")).click();
            String lStrLocation1 = "Sara, Washington, United States";
            String lStrLocation = "Sara";
            findElement(By.id("LocationInputSearch")).sendKeys(lStrLocation);
            findElement(By.xpath("//a[contains(text(),'Sara, Washington, United States')]")).click();
            VerificationStatements.VerifyInputValue(getDriverProvider().get(),By.cssSelector("LocationInputSearch"),lStrLocation1);
        }catch (NoSuchElementException e){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+gStrLocationFieldName+"\nReason of Error:"+"Element is not clicked\n";
        }
    }

    public void selectMixedUseInAssetType(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssettypeId_checkbox_12")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_12"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Asset Types:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearMixedUseInAssetType(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssettypeId_checkbox_12")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_12"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Asset Types:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectOpportunisticOptionInRiskProfile_JVPartner(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("RiskprofileId_checkbox_5")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_5"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearOpportunisticOptionInRiskProfile_JVPartner(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("RiskprofileId_checkbox_5")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_5"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectPermittedOptionInDealStage_JVPartner(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("DealstageId_checkbox_5")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("DealstageId_checkbox_5"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearPermittedOptionInDealStage_JVPartner(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("DealstageId_checkbox_5")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("DealstageId_checkbox_5"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectPartiallyRentedOptionInCurrentAssetStatus_JVPartner(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstatusId_checkbox_6")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssetstatusId_checkbox_6"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearPartiallyRentedOptionInCurrentAssetStatus_JVPartner(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstatusId_checkbox_6")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssetstatusId_checkbox_6"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectStableIncomeProducingOptionInAssetStrategy_JVPartner(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstrategyId_checkbox_5")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssetstrategyId_checkbox_5"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Asset Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearStableIncomeProducingOptionInAssetStrategy_JVPartner(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstrategyId_checkbox_5")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssetstrategyId_checkbox_5"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Asset Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void verifyDealSponsorFundNameIsNotDisplayedName(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strDealSponsorFundName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JP Fund Is Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JP Fund Is Displayed in the Search Result\n";
        }
    }

    public void verifyDealSponsorFundNameIsDisplayedNameInProjectSearch(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strDealSponsorFundName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JP Fund Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JP Fund Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyDealSponsorFundNameIsDisplayedNameInServiceSearch(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strDealSponsorFundName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Marten Fund Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Marten Fund Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyDealSponsorFundNameIsDisplayedNameInNewBusinessLoanSearch(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDealSponsorFundName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RDavis Fund Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RDavis Fund Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyDealSponsorFundNameIsNotDisplayedNameInNewBusinessMezzSearch(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDealSponsorFundName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"ROld Fund Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"ROld Fund Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyDealSponsorFundNameIsDisplayedNameInEquitySearch(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDealSponsorFundName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Joe Fund Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Joe Fund Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyDealSponsorFundNameIsNotDisplayedNameInProjectSearch(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strDealSponsorFundName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Kelly Fund Is Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Kelly Fund Is Displayed in the Search Result\n";
        }
    }

    public void verifyDealSponsorFundNameIsNotDisplayedNameInNewBusinessSearch(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strDealSponsorFundName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"ROld Fund Is Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"ROld Fund Is Displayed in the Search Result\n";
        }
    }

    public void verifyDealSponsorProjectNameIsDisplayedName(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDealSponsorProjectName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Brown Project Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Brown Project Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyDealSponsorProjectNameIsNotDisplayedName(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strDealSponsorProjectName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JP Project Is Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JP Project Is Displayed in the Search Result\n";
        }
    }

    public void verifyDealSponsorProjectNameIsDisplayedNameInProjectSearch(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strDealSponsorProjectName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JP Project Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JP Project Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyDealSponsorProjectNameIsDisplayedNameInEquitySearch(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDealSponsorProjectName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Joe Project Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Joe Project Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyDealSponsorProjectNameIsDisplayedNameInServiceSearch(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDealSponsorProjectName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Marten Project Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Marten Project Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyDealSponsorProjectNameIsDisplayedNameInNewBusinessLoanSearch(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDealSponsorProjectName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RDavis Project Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RDavis Project Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyDealSponsorProjectNameIsNotDisplayedNameInProjectSearch(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strDealSponsorProjectName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Brown Project Is Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Brown Project Is Displayed in the Search Result\n";
        }
    }

    public void verifyDealSponsorProjectNameIsNotDisplayedNameInNewBusinessSearch(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strDealSponsorProjectName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"ROld Project Is Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"ROld Project Is Displayed in the Search Result\n";
        }
    }

    public void verifyDealSponsorProjectNameIsDisplayedNameInNewBusinessMezzSearch(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strDealSponsorProjectName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"ROld Project Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"ROld Project Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyInvestorFundNameIsDisplayedName(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strInvestorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Amira Fund Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Amira Fund Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyInvestorFundNameIsNotDisplayedName(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strInvestorFundName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"SW Fund Is Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"SW Fund Is Displayed in the Search Result\n";
        }
    }

    public void verifyInvestorFundNameIsDisplayedNameInProjectSearch(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strInvestorFundName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"SW Fund Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"SW Fund Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyInvestorFundNameIsDisplayedNameInEquitySearch(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strInvestorFundName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Miller Fund Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Miller Fund Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyInvestorFundNameIsDisplayedNameInServiceSearch(String strInvestorFundName) {
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strInvestorFundName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Wilson Fund Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Wilson Fund Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyInvestorFundNameIsDisplayedNameInNewBusinessLoanSearch(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strInvestorFundName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"BLee Fund Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"BLee Fund Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyInvestorFundNameIsNotDisplayedNameInProjectSearch(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strInvestorFundName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Amira Fund Is Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Amira Fund Is Displayed in the Search Result\n";
        }
    }

    public void verifyInvestorFundNameIsNotDisplayedNameInNewBusinessLoanSearch(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strInvestorFundName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LBrian Fund Is Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LBrian Fund Is Displayed in the Search Result\n";
        }
    }

    public void verifyInvestorFundNameIsDisplayedNameInNewBusinessMezzSearch(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strInvestorFundName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LBrian Fund Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LBrian Fund Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyLenderLoanNameIsDisplayedName(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strLenderLoanName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LR Loan Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LR Loan Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyLenderLoanNameIsNotDisplayedName(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strLenderLoanName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"BL Loan Is Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"BL Loan Is Displayed in the Search Result\n";
        }
    }

    public void verifyLenderLoanNameIsDisplayedNameInProjectSearch(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strLenderLoanName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"BL Loan Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"BL Loan Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyLenderLoanNameIsDisplayedNameInEquitySearch(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strLenderLoanName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Dan Loan Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Dan Loan Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyLenderLoanNameIsDisplayedNameInServiceSearch(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strLenderLoanName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JOne Loan Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JOne Loan Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyLenderLoanNameIsDisplayedNameInNewBusinessLoanSearch(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strLenderLoanName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JHall Loan Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JHall Loan Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyLenderLoanNameIsNotDisplayedNameInProjectSearch(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strLenderLoanName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LR Loan Is Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LR Loan Is Displayed in the Search Result\n";
        }
    }

    public void verifyLenderLoanNameIsNotDisplayedNameInNewBusinessLoanSearch(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strLenderLoanName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"HJeff Loan Is Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"HJeff Loan Is Displayed in the Search Result\n";
        }
    }

    public void verifyLenderLoanNameIsDisplayedNameInNewBusinessMezzSearch(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strLenderLoanName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"HJeff Loan Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"HJeff Loan Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyLenderMezzNameIsDisplayedName(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strLenderMezzName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LR Mezz Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LR Mezz Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyLenderMezzNameIsNotDisplayedName(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strLenderMezzName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"BL Mezz Is Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"BL Mezz Is Displayed in the Search Result\n";
        }
    }

    public void verifyLenderMezzNameIsDisplayedNameInProjectSearch(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strLenderMezzName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"BL Mezz Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"BL Mezz Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyLenderMezzNameIsDisplayedNameInEquitySearch(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strLenderMezzName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Dan Mezz Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Dan Mezz Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyLenderMezzNameIsDisplayedNameInServiceSearch(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strLenderMezzName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JOne Mezz Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JOne Mezz Is Not Displayed in the Search Result\n";
        }
    }


    public void verifyLenderMezzNameIsDisplayedNameInNewBusinessLoanSearch(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strLenderMezzName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JHall Mezz Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JHall Mezz Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyLenderMezzNameIsNotDisplayedNameInProjectSearch(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strLenderMezzName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LR Mezz Is Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LR Mezz Is Displayed in the Search Result\n";
        }
    }

    public void verifyLenderMezzNameIsNotDisplayedNameInNewBusinessLoanSearch(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strLenderMezzName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"HJeff Mezz Is Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"HJeff Mezz Is Displayed in the Search Result\n";
        }
    }

    public void verifyLenderMezzNameIsDisplayedNameInNewBusinessMezzSearch(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strLenderMezzName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"HJeff Mezz Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"HJeff Mezz Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyAdvisorListingNameIsDisplayedName(String strAdvisorListingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strAdvisorListingName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Taylor Listing Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Taylor Listing Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyAdvisorListingNameIsNotDisplayedName(String strAdvisorListingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strAdvisorListingName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RL Listing Is Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RL Listing Is Displayed in the Search Result\n";
        }
    }

    public void verifyAdvisorListingNameIsDisplayedNameInProjectSearch(String strAdvisorListingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strAdvisorListingName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RL Listing Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RL Listing Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyAdvisorListingNameIsDisplayedNameInEquitySearch(String strAdvisorListingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strAdvisorListingName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Kim Listing Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Kim Listing Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyAdvisorListingNameIsDisplayedNameInServiceSearch(String strAdvisorListingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strAdvisorListingName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Laven Listing Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Laven Listing Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyAdvisorListingNameIsDisplayedNameInNewBusinessLoanSearch(String strAdvisorListingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strAdvisorListingName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"KWin Listing Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"KWin Listing Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyAdvisorListingNameIsNotDisplayedNameInProjectSearch(String strAdvisorListingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strAdvisorListingName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Taylor Listing Is Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Taylor Listing Is Displayed in the Search Result\n";
        }
    }

    public void verifyAdvisorListingNameIsNotDisplayedNameInNewBusinessLoanSearch(String strAdvisorListingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strAdvisorListingName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"NSun Listing Is Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"NSun Listing Is Displayed in the Search Result\n";
        }
    }

    public void verifyAdvisorListingNameIsDisplayedNameInNewBusinessMezzSearch(String strAdvisorListingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strAdvisorListingName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"NSun Listing Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"NSun Listing Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyAdvisorServiceNameIsDisplayedName(String strAdvisorServiceName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strAdvisorServiceName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Taylor Service Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Taylor Service Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyAdvisorServiceNameIsNotDisplayedName(String strAdvisorServiceName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strAdvisorServiceName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RL Service Is Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RL Service Is Displayed in the Search Result\n";
        }
    }

    public void verifyAdvisorServiceNameIsDisplayedInProjectSearch(String strAdvisorServiceName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strAdvisorServiceName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RL Service Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RL Service Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyAdvisorServiceNameIsDisplayedInEquitySearch(String strAdvisorServiceName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strAdvisorServiceName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Kim Service Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Kim Service Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyAdvisorServiceNameIsDisplayedInServiceSearch(String strAdvisorServiceName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strAdvisorServiceName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Laven Service Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Laven Service Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyAdvisorServiceNameIsDisplayedInNewBusinessLoanSearch(String strAdvisorServiceName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strAdvisorServiceName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"KWin Service Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"KWin Service Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyAdvisorServiceNameIsNotDisplayedInProjectSearch(String strAdvisorServiceName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strAdvisorServiceName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Taylor Service Is Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Taylor Service Is Displayed in the Search Result\n";
        }
    }

    public void verifyAdvisorServiceNameIsNotDisplayedInNewBusinessLoanSearch(String strAdvisorServiceName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strAdvisorServiceName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"NSun Service Is Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"NSun Service Is Displayed in the Search Result\n";
        }
    }

    public void verifyAdvisorServiceNameIsDisplayedInNewBusinessMezzSearch(String strAdvisorServiceName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strAdvisorServiceName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"NSun Service Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"NSun Service Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyInvestorFundNameNotDisplayed_LightHouseOff(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strInvestorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Haris Fund Is Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Haris Fund Is Displayed in the Search Result\n";
        }
    }

    public void verifyInvestorFundName_LightHouseOffIsNotDisplayed(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strInvestorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Haris Fund Is Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Haris Fund Is Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void clickFundAndProjectTab(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//section[@id='content']/nav/ul/li/a[contains(text(),'Funds & Projects')]")).click();
    }

    public void clickServiceAndListingTab(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//section[@id='content']/nav/ul/li/a[contains(text(),'Services & Listings')]")).click();
    }

    public void clickOnFundTab(){
        //wait until page loads
        WaitUtil.simpleSleep(2000);
        findElement(By.xpath("//section[@id='content']/nav/ul/li/a[contains(text(),'Funds')]")).click();
    }

    public void clickOnProductTab(){
        //wait until page loads
        WaitUtil.simpleSleep(2000);
        findElement(By.xpath("//section[@id='content']/nav/ul/li/a[contains(text(),'Products')]")).click();
    }

    public void clickFund(){
        int intCnt=0;
        boolean blnFound=false;
        while(!blnFound && intCnt<=5){
            try{
                //wait until page loads
                WaitUtil.simpleSleep(1000);
                Actions moveTo = new Actions(getDriverProvider().get());
                WaitUtil.simpleSleep(5000);
                executeScript("scroll(0,150)");
                WaitUtil.simpleSleep(5000);
                moveTo.moveToElement(findElement(By.xpath("//section[@id='content']/div/div/ng-include/section/div/div/div[@class='item cycle-slide ng-scope']/ul/li/div/strong[contains(text(),'Kelly Fund')]"))).build().perform();
                if (!findElement(By.xpath("//section[@id='content']/div/div/ng-include/section/div/div/div[@class='item cycle-slide ng-scope']/ul/li/div[@class='action-block']/a/i[@class='fa fa-pencil']")).isDisplayed()) {
                    moveTo.moveToElement(findElement(By.xpath("//section[@id='content']/div/div/ng-include/section/div/div/div[@class='item cycle-slide ng-scope']/ul/li/div/strong[contains(text(),'Kelly Fund')]"))).build().perform();
                } else {
                    findElement(By.xpath("//section[@id='content']/div/div/ng-include/section/div/div/div[@class='item cycle-slide ng-scope']/ul/li/div[@class='action-block']/a/i[@class='fa fa-pencil']")).click();
                    blnFound=true;
                }
            }catch (NoSuchElementException N){
                WaitUtil.simpleSleep(1000);
                LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Not Able to click on fund name in Your Postings\n";
                intCnt++;
            }
        }
    }

    public void clickLavenListing(){
        int intCnt=0;
        boolean blnFound=false;
        while(!blnFound && intCnt<=5){
            try{
                //wait until page loads
                WaitUtil.simpleSleep(1000);
                Actions moveTo = new Actions(getDriverProvider().get());
                WaitUtil.simpleSleep(5000);
                executeScript("scroll(0,150)");
                WaitUtil.simpleSleep(5000);
                moveTo.moveToElement(findElement(By.xpath("//section[@id='content']/div/div/ng-include/section/div/div/div[@class='item cycle-slide ng-scope cycle-slide-active']/ul/li/div[@class='action-block']/preceding-sibling::div[@class='name-hold']/strong[contains(text(),'Laven Listing')]"))).build().perform();
                if (!findElement(By.xpath("//section[@id='content']/div/div/ng-include/section/div/div/div[@class='item cycle-slide ng-scope cycle-slide-active']/ul/li/div[@class='action-block']/preceding-sibling::div[@class='name-hold']/strong[contains(text(),'Laven Listing')]/parent::div/parent::li/div/a/i[@class=\"fa fa-pencil\"]")).isDisplayed()) {
                    moveTo.moveToElement(findElement(By.xpath("//section[@id='content']/div/div/ng-include/section/div/div/div[@class='item cycle-slide ng-scope cycle-slide-active']/ul/li/div[@class='action-block']/preceding-sibling::div[@class='name-hold']/strong[contains(text(),'Laven Listing')]"))).build().perform();
                } else {
                    findElement(By.xpath("//section[@id='content']/div/div/ng-include/section/div/div/div[@class='item cycle-slide ng-scope cycle-slide-active']/ul/li/div[@class='action-block']/preceding-sibling::div[@class='name-hold']/strong[contains(text(),'Laven Listing')]/parent::div/parent::li/div/a/i[@class=\"fa fa-pencil\"]")).click();
                    blnFound=true;
                }
            }catch (NoSuchElementException N){
                WaitUtil.simpleSleep(1000);
                LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Not Able to click on fund name in Your Postings\n";
                intCnt++;
            }
        }
    }

    public void clickDSProjectNameOfNewBusinessLoanSearch(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//section[@id='content']/div[2]/div[2]/ng-include/div/table/tbody/tr[4]/td[1]/a/span")).click();
    }

    public void clickFundOfInvestor(){
        int intCnt=0;
        boolean blnFound=false;
        while(!blnFound && intCnt<=5){
            try{
                //wait until page loads
                WaitUtil.simpleSleep(1000);
                Actions moveTo = new Actions(getDriverProvider().get());
                WaitUtil.simpleSleep(5000);
                executeScript("scroll(0,150)");
                WaitUtil.simpleSleep(5000);
                moveTo.moveToElement(findElement(By.xpath("//section[@id='content']/div/div/ng-include/section/div/div/div[@class='item cycle-slide ng-scope cycle-slide-active']/ul/li/div[@class='action-block']/preceding-sibling::div[@class='name-hold']/strong[contains(text(),'Haris Fund')]"))).build().perform();
                if (!findElement(By.xpath("//section[@id='content']/div/div/ng-include/section/div/div/div[@class='item cycle-slide ng-scope cycle-slide-active']/ul/li/div[@class='action-block']/preceding-sibling::div[@class='name-hold']/strong[contains(text(),'Haris Fund')]/parent::div/parent::li/div/a/i[@class=\"fa fa-pencil\"]")).isDisplayed()) {
                    moveTo.moveToElement(findElement(By.xpath("//section[@id='content']/div/div/ng-include/section/div/div/div[@class='item cycle-slide ng-scope cycle-slide-active']/ul/li/div[@class='action-block']/preceding-sibling::div[@class='name-hold']/strong[contains(text(),'Haris Fund')]"))).build().perform();
                } else {
                    findElement(By.xpath("//section[@id='content']/div/div/ng-include/section/div/div/div[@class='item cycle-slide ng-scope cycle-slide-active']/ul/li/div[@class='action-block']/preceding-sibling::div[@class='name-hold']/strong[contains(text(),'Haris Fund')]/parent::div/parent::li/div/a/i[@class=\"fa fa-pencil\"]")).click();
                    blnFound=true;
                }
            }catch (NoSuchElementException N){
                WaitUtil.simpleSleep(1000);
                LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Not Able to click on fund name in Your Postings\n";
                intCnt++;
            }
        }
    }

    public void clickInvestorFund(){
        int intCnt=0;
        boolean blnFound=false;
        while(!blnFound && intCnt<=5){
            try{
                //wait until page loads
                WaitUtil.simpleSleep(1000);
                Actions moveTo = new Actions(getDriverProvider().get());
                WaitUtil.simpleSleep(5000);
                executeScript("scroll(0,150)");
                WaitUtil.simpleSleep(10000);
                moveTo.moveToElement(findElement(By.xpath("//section[@id='content']/div/div/ng-include/section/div/div/div[@class='item cycle-slide ng-scope cycle-slide-active']/ul/li/div[@class='action-block']/preceding-sibling::div[@class='name-hold']/strong[contains(text(),'SW Fund')]"))).build().perform();
                if (!findElement(By.xpath("//section[@id='content']/div/div/ng-include/section/div/div/div[@class='item cycle-slide ng-scope cycle-slide-active']/ul/li/div[@class='action-block']/preceding-sibling::div[@class='name-hold']/strong[contains(text(),'SW Fund')]/parent::div/parent::li/div/a/i[@class=\"fa fa-pencil\"]")).isDisplayed()) {
                    moveTo.moveToElement(findElement(By.xpath("//section[@id='content']/div/div/ng-include/section/div/div/div[@class='item cycle-slide ng-scope cycle-slide-active']/ul/li/div[@class='action-block']/preceding-sibling::div[@class='name-hold']/strong[contains(text(),'SW Fund')]"))).build().perform();
                } else {
                    findElement(By.xpath("//section[@id='content']/div/div/ng-include/section/div/div/div[@class='item cycle-slide ng-scope cycle-slide-active']/ul/li/div[@class='action-block']/preceding-sibling::div[@class='name-hold']/strong[contains(text(),'SW Fund')]/parent::div/parent::li/div/a/i[@class=\"fa fa-pencil\"]")).click();
                    blnFound=true;
                }
            }catch (NoSuchElementException N){
                WaitUtil.simpleSleep(1000);
                LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Not Able to click on fund name in Your Postings\n";
                intCnt++;
            }
        }
    }

    public void clickLenderLoan(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        Actions moveTo = new Actions(getDriverProvider().get());
        WaitUtil.simpleSleep(5000);
        executeScript("scroll(0,150)");
        WaitUtil.simpleSleep(5000);
        moveTo.moveToElement(findElement(By.xpath("//section[@id='content']/div/div/ng-include/section/div/div/div/ul/li/div/strong[text()='Dan Loan'] "))).build().perform();
        findElement(By.xpath("//section[@id='content']/div/div/ng-include/section/div/div/div/ul/li/strong[text()='Loan']/parent::li/div/a/i[@class=\"fa fa-pencil\"]")).click();
        /*int intCnt=0;
        boolean blnFound=false;
        while(!blnFound && intCnt<=5){
            try{
                //wait until page loads
                WaitUtil.simpleSleep(1000);
                Actions moveTo = new Actions(getDriverProvider().get());
                WaitUtil.simpleSleep(5000);
                executeScript("scroll(0,150)");
                WaitUtil.simpleSleep(5000);
                moveTo.moveToElement(findElement(By.xpath("//section[@id='content']/div/div/ng-include/section/div/div/div[@class='item cycle-slide ng-scope cycle-slide-active']/ul/li/div[@class='action-block']/preceding-sibling::div[@class='name-hold']/strong[contains(text(),'Dan Loan')]"))).build().perform();
                if (!findElement(By.xpath("//section[@id='content']/div/div/ng-include/section/div/div/div/ul/li/div[@class='action-block']/a/i[@class='fa fa-pencil']")).isDisplayed()) {
                    moveTo.moveToElement(findElement(By.xpath("//section[@id='content']/div/div/ng-include/section/div/div/div[@class='item cycle-slide ng-scope cycle-slide-active']/ul/li/div[@class='action-block']/preceding-sibling::div[@class='name-hold']/strong[contains(text(),'Dan Loan')]"))).build().perform();
                } else {
                    findElement(By.xpath("//section[@id='content']/div/div/ng-include/section/div/div/div/ul/li/div[@class='action-block']/a/i[@class='fa fa-pencil']")).click();
                    blnFound=true;
                }
            }catch (NoSuchElementException N){
                WaitUtil.simpleSleep(1000);
                LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Not Able to click on fund name in Your Postings\n";
                intCnt++;
            }
        }*/
    }

    public void getNumberOfMatch(){
        try{
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        gStrMatchCountInProfile = findElement(By.xpath("//tr[@class='ng-scope']/td[6]/strong/a")).getText();
        System.out.println(gStrMatchCountInProfile);
        } catch (NoSuchElementException N){
            System.out.println(N);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Not Able to get the count of matches\n";
        }
    }

    public void clickMatches(){
        try{
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//tr[@class='ng-scope']/td[6]/strong/a")).click();
        } catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Not Able to click on matches\n";
        }

    }

    public void getNumberOfMatchesInResult(){
        try{
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        gStrMatchCountInSearchResult = findElement(By.id("resultsCount")).getText();
        System.out.println(gStrMatchCountInSearchResult);
        } catch (NoSuchElementException N){
            System.out.println(N);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Not Able to find number of matches in results\n";
        }
    }

    public void verifyLandIsSelected(){
        try{
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Your Contribution:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.id("PartnercontributionId_checkbox_1"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Your Contribution:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }catch (NoSuchElementException N){
            System.out.println(N);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Your Contribution field cannot be able to find\n";
        }
    }

    public void verifyProjectIsSelected(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Your Contribution:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.id("PartnercontributionId_checkbox_2"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Your Contribution:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void verifyEquityIsSelected(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Your Contribution:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.id("PartnercontributionId_checkbox_3"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Your Contribution:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void verifyServicesIsSelected(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Your Contribution:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.id("PartnercontributionId_checkbox_4"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Your Contribution:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void verifyTheMatches(){
        try{
        Assert.assertEquals(gStrMatchCountInSearchResult,gStrMatchCountInProfile);
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Count of the matches in search result and in profile does not match";
        } catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Count of the matches in search result and in profile does not match";
        }
    }

    public void clickRouteToPartner(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Route to Partnership:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectPrincipal(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("PartnershiproutesId_checkbox_1")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.id("PartnershiproutesId_checkbox_1"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Route to Partnership:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectBroker(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("PartnershiproutesId_checkbox_2")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.id("PartnershiproutesId_checkbox_2"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Route to Partnership:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectIntermediary(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("PartnershiproutesId_checkbox_3")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.id("PartnershiproutesId_checkbox_3"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Route to Partnership:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

    }

    public void verifyFundNameInSearchResultToFilterSelected(String strDealSponsorFundName){
        try{
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDealSponsorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Kelly Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Kelly Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyFundNameIsDisplayedInSearchResultToFilterSelected_ProjectSearch(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDealSponsorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JP Fund Is Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JP Fund Is Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyFundNameIsDisplayedInSearchResultToFilterSelected_EquitySearch(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDealSponsorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Joe Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Joe Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyFundNameIsDisplayedInSearchResultToFilterSelected_ServiceSearch(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDealSponsorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Marten Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Marten Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyFundNameIsDisplayedInSearchResultToFilterSelected_NewBusinessLoanSearch(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDealSponsorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RDavis Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RDavis Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyFundNameIsNotDisplayedInSearchResultToFilterSelected_ProjectSearch(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDealSponsorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Kelly Fund Is Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Kelly Fund Is Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyFundNameIsNotDisplayedInSearchResultToFilterSelected_NewBusinessLoanSearch(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDealSponsorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"ROld Fund Is Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"ROld Fund Is Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyFundNameIsDisplayedInSearchResultToFilterSelected_NewBusinessMezzSearch(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDealSponsorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"ROld Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"ROld Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyFundNameInSearchResultToFilterSelectedNotDisplayed(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'" + strDealSponsorFundName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JP Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JP Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyProjectNameInSearchResultToFilterSelected(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDealSponsorProjectName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Brown Project Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Brown Project Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyProjectNameIsDisplayedInSearchResultToFilterSelected_ProjectSearch(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDealSponsorProjectName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JP Project Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JP Project Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyProjectNameIsDisplayedInSearchResultToFilterSelected_EquitySearch(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDealSponsorProjectName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Joe Project Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Joe Project Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyProjectNameIsDisplayedInSearchResultToFilterSelected_ServiceSearch(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDealSponsorProjectName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Marten Project Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Marten Project Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyProjectNameIsDisplayedInSearchResultToFilterSelected_NewBusinessLoanSearch(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDealSponsorProjectName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RDavis Project Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RDavis Project Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyProjectNameIsNotDisplayedInSearchResultToFilterSelected_ProjectSearch(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDealSponsorProjectName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Brown Project Is Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Brown Project Is Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyProjectNameIsNotDisplayedInSearchResultToFilterSelected_NewBusinessLoanSearch(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDealSponsorProjectName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"ROld Project Is Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"ROld Project Is Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyProjectNameIsDisplayedInSearchResultToFilterSelected_NewBusinessMezzSearch(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDealSponsorProjectName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"ROld Project Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"ROld Project Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyProjectNameInSearchResultToFilterSelectedNotDisplayed(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'" + strDealSponsorProjectName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JP Project Is Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JP Project Is Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyInvestorFundNameInSearchResultToFilterSelected(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strInvestorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Amira Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Amira Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyInvestorFundNameIsDisplayedInSearchResultToFilterSelected_ProjectSearching(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strInvestorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"SW Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"SW Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyInvestorFundNameIsDisplayedInSearchResultToFilterSelected_EquitySearching(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strInvestorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Miller Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Miller Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyInvestorFundNameIsDisplayedInSearchResultToFilterSelected_ServiceSearching(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strInvestorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Wilson Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Wilson Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyInvestorFundNameIsDisplayedInSearchResultToFilterSelected_NewBusinessLoanSearch(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strInvestorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"BLee Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"BLee Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyInvestorFundNameIsNotDisplayedInSearchResultToFilterSelected_ProjectSearching(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strInvestorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Amira Fund Is Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Amira Fund Is Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyInvestorFundNameIsNotDisplayedInSearchResultToFilterSelected_ProjectSearchingInNewBusinessLoan(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strInvestorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LBrian Fund Is Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LBrian Fund Is Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyInvestorFundNameIsDisplayedInSearchResultToFilterSelected_ProjectSearchingInNewBusinessMezz(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strInvestorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LBrian Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LBrian Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyInvestorFundNameInSearchResultToFilterSelectedNotDisplayed(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'" + strInvestorFundName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"SW Fund Is Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"SW Fund Is Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyLenderLoanNameInSearchResultToFilterSelected(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strLenderLoanName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LR Loan Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LR Loan Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyLenderLoanNameIsDisplayedInSearchResultToFilterSelected_ProjectSearch(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strLenderLoanName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"BL Loan Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"BL Loan Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyLenderLoanNameIsDisplayedInSearchResultToFilterSelected_EquitySearch(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strLenderLoanName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Dan Loan Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Dan Loan Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyLenderLoanNameIsDisplayedInSearchResultToFilterSelected_ServiceSearch(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strLenderLoanName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JOne Loan Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JOne Loan Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyLenderLoanNameIsDisplayedInSearchResultToFilterSelected_NewBusinessLoanSearch(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strLenderLoanName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JHall Loan Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JHall Loan Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyLenderLoanNameIsNotDisplayedInSearchResultToFilterSelected_ProjectSearch(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strLenderLoanName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LR Loan Is Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LR Loan Is Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyLenderLoanNameIsNotDisplayedInSearchResultToFilterSelected_ProjectSearchInNewBusinessLoan(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strLenderLoanName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"HJeff Loan Is Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"HJeff Loan Is Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyLenderLoanNameIsDisplayedInSearchResultToFilterSelected_ProjectSearchInNewBusinessMezz(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strLenderLoanName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"HJeff Loan Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"HJeff Loan Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyLenderLoanNameInSearchResultToFilterSelectedNotDisplayed(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'" + strLenderLoanName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"BL Loan Is Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"BL Loan Is Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyLenderMezzNameInSearchResultToFilterSelected(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strLenderMezzName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LR Mezz Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LR Mezz Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyLenderMezzNameIsDisplayedInSearchResultToFilterSelected_ProjectSearch(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strLenderMezzName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"BL Mezz Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"BL Mezz Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyLenderMezzNameIsDisplayedInSearchResultToFilterSelected_EquitySearch(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strLenderMezzName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Dan Mezz Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Dan Mezz Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyLenderMezzNameIsDisplayedInSearchResultToFilterSelected_ServiceSearch(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strLenderMezzName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JOne Mezz Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JOne Mezz Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyLenderMezzNameIsDisplayedInSearchResultToFilterSelected_NewBusinessLoanSearch(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strLenderMezzName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JHall Mezz Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JHall Mezz Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyLenderMezzNameIsNotDisplayedInSearchResultToFilterSelected_ProjectSearch(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strLenderMezzName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LR Mezz Is Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LR Mezz Is Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyLenderMezzNameIsNotDisplayedInSearchResultToFilterSelected_ProjectSearchInNewBusinessLoan(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strLenderMezzName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"HJeff Mezz Is Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"HJeff Mezz Is Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyLenderMezzNameIsDisplayedInSearchResultToFilterSelected_ProjectSearchInNewBusinessMezz(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strLenderMezzName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"HJeff Mezz Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"HJeff Mezz Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyLenderMezzNameInSearchResultToFilterSelectedNotDisplayed(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'" + strLenderMezzName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"BL Mezz Is Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"BL Mezz Is Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyAdvisorListingNameInSearchResultToFilterSelected(String strAdvisorListingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAdvisorListingName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Taylor Listing Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Taylor Listing Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyAdvisorListingNameIsDisplayedInSearchResultToFilterSelected_ProjectSearch(String strAdvisorListingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAdvisorListingName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RL Listing Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RL Listing Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyAdvisorListingNameIsDisplayedInSearchResultToFilterSelected_EquitySearch(String strAdvisorListingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAdvisorListingName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Kim Listing Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Kim Listing Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyAdvisorListingNameIsDisplayedInSearchResultToFilterSelected_ServiceSearch(String strAdvisorListingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAdvisorListingName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Laven Listing Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Laven Listing Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyAdvisorListingNameIsDisplayedInSearchResultToFilterSelected_NewBusinessLoanSearch(String strAdvisorListingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAdvisorListingName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"KWin Listing Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"KWin Listing Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyAdvisorListingNameIsNotDisplayedInSearchResultToFilterSelected_ProjectSearch(String strAdvisorListingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAdvisorListingName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Taylor Listing Is Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Taylor Listing Is Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyAdvisorListingNameIsNotDisplayedInSearchResultToFilterSelected_NewBusinessLoanSearch(String strAdvisorListingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAdvisorListingName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"NSun Listing Is Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"NSun Listing Is Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyAdvisorListingNameIsDisplayedInSearchResultToFilterSelected_NewBusinessMezzSearch(String strAdvisorListingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAdvisorListingName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"NSun Listing Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"NSun Listing Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyAdvisorListingNameInSearchResultToFilterSelectedNotDisplayed(String strAdvisorListingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'" + strAdvisorListingName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RL Listing Is Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RL Listing Is Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyAdvisorServiceNameInSearchResultToFilterSelected(String strAdvisorServiceName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAdvisorServiceName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Taylor Service Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Taylor Service Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyAdvisorServiceNameIsDisplayedInSearchResultToFilterSelected_ProjectSearch(String strAdvisorServiceName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAdvisorServiceName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RL Service Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RL Service Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyAdvisorServiceNameIsDisplayedInSearchResultToFilterSelected_EquitySearch(String strAdvisorServiceName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAdvisorServiceName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RL Service Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RL Service Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyAdvisorServiceNameIsDisplayedInSearchResultToFilterSelected_ServiceSearch(String strAdvisorServiceName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAdvisorServiceName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Laven Service Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Laven Service Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyAdvisorServiceNameIsDisplayedInSearchResultToFilterSelected_NewBusinessLoanSearch(String strAdvisorServiceName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAdvisorServiceName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"KWin Service Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"KWin Service Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyAdvisorServiceNameIsNotDisplayedInSearchResultToFilterSelected_ProjectSearch(String strAdvisorServiceName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAdvisorServiceName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Taylor Service Is Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Taylor Service Is Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyAdvisorServiceNameIsNotDisplayedInSearchResultToFilterSelected_NewBusinessLoanSearch(String strAdvisorServiceName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAdvisorServiceName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"NSun Service Is Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"NSun Service Is Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyAdvisorServiceNameIsDisplayedInSearchResultToFilterSelected_NewBusinessMezzSearch(String strAdvisorServiceName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAdvisorServiceName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"NSun Service Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"NSun Service Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyAdvisorServiceNameInSearchResultToFilterSelectedNotDisplayed(String strAdvisorServiceName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'" + strAdvisorServiceName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RL Service Is Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RL Service Is Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyFundNameInSearchResultWhenClickOnMatches(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDealSponsorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Kelly Fund Is Not Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Kelly Fund Is Not Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyFundNameInSearchResultWhenClickOnMatchesNotDisplayed(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strDealSponsorFundName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JP Fund Is Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JP Fund Is Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyFundNameInSearchResultWhenClickOnMatchesDisplayedInProjectSearch(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strDealSponsorFundName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JP Fund Is Not Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JP Fund Is Not Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyFundNameInSearchResultWhenClickOnMatchesDisplayedInEquitySearch(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strDealSponsorFundName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Joe Fund Is Not Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Joe Fund Is Not Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyFundNameInSearchResultWhenClickOnMatchesDisplayedInServiceSearch(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strDealSponsorFundName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Marten Fund Is Not Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Marten Fund Is Not Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyFundNameInSearchResultWhenClickOnMatchesDisplayedInNewBusinessLoanSearch(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDealSponsorFundName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RDavis Fund Is Not Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RDavis Fund Is Not Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyFundNameInSearchResultWhenClickOnMatchesNotDisplayedInProjectSearch(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strDealSponsorFundName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Kelly Fund Is Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Kelly Fund Is Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyProjectNameInSearchResultWhenClickOnMatches(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDealSponsorProjectName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Brown Project Is Not Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Brown Project Is Not Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyProjectNameInSearchResultWhenClickOnMatchesNotDisplayed(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strDealSponsorProjectName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JP Project Is Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JP Project Is Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyProjectNameInSearchResultWhenClickOnMatchesDisplayedInProjectSearch(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strDealSponsorProjectName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JP Project Is Not Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JP Project Is Not Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyProjectNameInSearchResultWhenClickOnMatchesDisplayedInEquitySearch(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDealSponsorProjectName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Joe Project Is Not Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Joe Project Is Not Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyProjectNameInSearchResultWhenClickOnMatchesDisplayedInServicesSearch(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDealSponsorProjectName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Marten Project Is Not Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Marten Project Is Not Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyProjectNameInSearchResultWhenClickOnMatchesDisplayedInNewBusinessLoanSearch(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDealSponsorProjectName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RDavis Project Is Not Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RDavis Project Is Not Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyProjectNameInSearchResultWhenClickOnMatchesNotDisplayedInProjectSearch(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strDealSponsorProjectName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Brown Project Is Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Brown Project Is Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyInvestorFundNameInSearchResultWhenClickOnMatches(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strInvestorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Amira Fund Is Not Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Amira Fund Is Not Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyInvestorFundNameInSearchResultWhenClickOnMatchesNotDisplayed(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strInvestorFundName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"SW Fund Is Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"SW Fund Is Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyInvestorFundNameInSearchResultWhenClickOnMatchesDisplayedInProjectSearch(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strInvestorFundName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"SW Fund Is Not Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"SW Fund Is Not Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyInvestorFundNameInSearchResultWhenClickOnMatchesDisplayedInEquitySearch(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strInvestorFundName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Miller Fund Is Not Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Miller Fund Is Not Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyInvestorFundNameInSearchResultWhenClickOnMatchesDisplayedInServicesSearch(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strInvestorFundName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Wilson Fund Is Not Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Wilson Fund Is Not Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyInvestorFundNameInSearchResultWhenClickOnMatchesNotDisplayedInProjectSearch(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strInvestorFundName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Amira Fund Is Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Amira Fund Is Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyLenderLoanNameInSearchResultWhenClickOnMatches(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strLenderLoanName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LR Loan Is Not Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LR Loan Is Not Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyLenderLoanNameInSearchResultWhenClickOnMatchesNotDisplayed(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strLenderLoanName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"BL Loan Is Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"BL Loan Is Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyLenderLoanNameInSearchResultWhenClickOnMatchesDisplayedInProjectSearch(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strLenderLoanName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"BL Loan Is Not Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"BL Loan Is Not Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyLenderLoanNameInSearchResultWhenClickOnMatchesDisplayedInEquitySearch(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strLenderLoanName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Dan Loan Is Not Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Dan Loan Is Not Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyLenderLoanNameInSearchResultWhenClickOnMatchesDisplayedInServiceSearch(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strLenderLoanName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JOne Loan Is Not Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JOne Loan Is Not Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyLenderLoanNameInSearchResultWhenClickOnMatchesNotDisplayedInProjectSearch(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strLenderLoanName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LR Loan Is Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LR Loan Is Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyLenderMezzNameInSearchResultWhenClickOnMatches(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strLenderMezzName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LR Mezz Is Not Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LR Mezz Is Not Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyLenderMezzNameInSearchResultWhenClickOnMatchesNotDisplayed(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strLenderMezzName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"BL Mezz Is Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"BL Mezz Is Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyLenderMezzNameInSearchResultWhenClickOnMatchesDisplayedInProjectSearch(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strLenderMezzName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"BL Mezz Is Not Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"BL Mezz Is Not Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyLenderMezzNameInSearchResultWhenClickOnMatchesDisplayedInEquitySearch(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strLenderMezzName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Dan Mezz Is Not Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Dan Mezz Is Not Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyLenderMezzNameInSearchResultWhenClickOnMatchesDisplayedInServiceSearch(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strLenderMezzName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JOne Mezz Is Not Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JOne Mezz Is Not Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyLenderMezzNameInSearchResultWhenClickOnMatchesNotDisplayedInProjectSearch(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strLenderMezzName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LR Mezz Is Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LR Mezz Is Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyAdvisorListingNameInSearchResultWhenClickOnMatches(String strAdvisorListingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strAdvisorListingName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Taylor Listing Is Not Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Taylor Listing Is Not Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyAdvisorListingNameInSearchResultWhenClickOnMatchesNotDisplayed(String strAdvisorListingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strAdvisorListingName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RL Listing Is Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RL Listing Is Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyAdvisorListingNameInSearchResultWhenClickOnMatchesDisplayedInProjectSearch(String strAdvisorListingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strAdvisorListingName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RL Listing Is Not Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RL Listing Is Not Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyAdvisorListingNameInSearchResultWhenClickOnMatchesDisplayedInEquitySearch(String strAdvisorListingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strAdvisorListingName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Kim Listing Is Not Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Kim Listing Is Not Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyAdvisorListingNameInSearchResultWhenClickOnMatchesDisplayedInServiceSearch(String strAdvisorListingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strAdvisorListingName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Laven Listing Is Not Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Laven Listing Is Not Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyAdvisorListingNameInSearchResultWhenClickOnMatchesNotDisplayedInProjectSearch(String strAdvisorListingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strAdvisorListingName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Taylor Listing Is Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Taylor Listing Is Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyAdvisorServiceNameInSearchResultWhenClickOnMatches(String strAdvisorServiceName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strAdvisorServiceName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Taylor Service Is Not Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Taylor Service Is Not Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyAdvisorServiceNameInSearchResultWhenClickOnMatchesNotDisplayed(String strAdvisorServiceName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strAdvisorServiceName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RL Service Is Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RL Service Is Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyAdvisorServiceNameInSearchResultWhenClickOnMatchesDisplayedInProjectSearch(String strAdvisorServiceName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strAdvisorServiceName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RL Service Is Not Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RL Service Is Not Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyAdvisorServiceNameInSearchResultWhenClickOnMatchesDisplayedInEquitySearch(String strAdvisorServiceName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strAdvisorServiceName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Kim Service Is Not Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Kim Service Is Not Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyAdvisorServiceNameInSearchResultWhenClickOnMatchesDisplayedInServiceSearch(String strAdvisorServiceName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strAdvisorServiceName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Laven Service Is Not Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Laven Service Is Not Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyAdvisorServiceNameInSearchResultWhenClickOnMatchesNotDisplayedInProjectSearch(String strAdvisorServiceName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strAdvisorServiceName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Taylor Service Is Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Taylor Service Is Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void verifyInvestorFundNameWhenClickOnMatchesNotDisplayed(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strInvestorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Haris Fund Is Displayed in the Search Result When Click on Matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Haris Fund Is Displayed in the Search Result When Click on Matches\n";
        }
    }

    public void clearPrincipal(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("PartnershiproutesId_checkbox_1")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("PartnershiproutesId_checkbox_1"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Route to Partnership:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearBroker(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("PartnershiproutesId_checkbox_2")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("PartnershiproutesId_checkbox_2"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Route to Partnership:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearIntermediary(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("PartnershiproutesId_checkbox_3")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("PartnershiproutesId_checkbox_3"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Route to Partnership:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickYourContribution(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Your Contribution:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectLandOption(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("PartnercontributionId_checkbox_1")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("PartnercontributionId_checkbox_1"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Your Contribution:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectServiceOption(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("PartnercontributionId_checkbox_4")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("PartnercontributionId_checkbox_4"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Your Contribution:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

    }

    public void selectProjectOption(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("PartnercontributionId_checkbox_2")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("PartnercontributionId_checkbox_2"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Your Contribution:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectEquityOption(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("PartnercontributionId_checkbox_3")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("PartnercontributionId_checkbox_3"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Your Contribution:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearLandOption(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("PartnercontributionId_checkbox_1")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("PartnercontributionId_checkbox_1"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Your Contribution:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearProjectOption(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("PartnercontributionId_checkbox_2")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("PartnercontributionId_checkbox_2"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Your Contribution:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearEquityOption(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("PartnercontributionId_checkbox_3")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("PartnercontributionId_checkbox_3"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Your Contribution:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearServiceOption(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("PartnercontributionId_checkbox_4")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("PartnercontributionId_checkbox_4"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Your Contribution:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

    }

    public void selectLocationOfUser(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        try{
            gStrLocationFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.id("LocationInputSearch")).click();
            String lStrLocation1 = "Newt, Kentucky, United States";
            String lStrLocation = "Newt";
            findElement(By.id("LocationInputSearch")).sendKeys(lStrLocation);
            findElement(By.xpath("//a[contains(text(),'Newt, Kentucky, United States')]")).click();
            VerificationStatements.VerifyInputValue(getDriverProvider().get(),By.cssSelector("LocationInputSearch"),lStrLocation1);
        }catch (NoSuchElementException e){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+gStrLocationFieldName+"\nReason of Error:"+"Element is not clicked\n";
        }
    }

    public void selectLocationInProjectSearch(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        try{
            gStrLocationFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.id("LocationInputSearch")).click();
            String lStrLocation1 = "Washington, Washington, D.C., United States";
            String lStrLocation = "Washington";
            findElement(By.id("LocationInputSearch")).sendKeys(lStrLocation);
            findElement(By.xpath("//a[contains(text(),'Washington, Washington, D.C., United States')]")).click();
            VerificationStatements.VerifyInputValue(getDriverProvider().get(),By.cssSelector("LocationInputSearch"),lStrLocation1);
        }catch (NoSuchElementException e){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+gStrLocationFieldName+"\nReason of Error:"+"Element is not clicked\n";
        }
    }

    public void selectLocationInEquitySearch(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        try{
            gStrLocationFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.id("LocationInputSearch")).click();
            String lStrLocation1 = "Derry, New Hampshire, United States";
            String lStrLocation = "Derry";
            findElement(By.id("LocationInputSearch")).sendKeys(lStrLocation);
            findElement(By.xpath("//a[contains(text(),'Derry, New Hampshire, United States')]")).click();
            VerificationStatements.VerifyInputValue(getDriverProvider().get(),By.cssSelector("LocationInputSearch"),lStrLocation1);
        }catch (NoSuchElementException e){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+gStrLocationFieldName+"\nReason of Error:"+"Element is not clicked\n";
        }
    }

    public void selectLocationInServiceSearch(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        try{
            gStrLocationFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.id("LocationInputSearch")).click();
            String lStrLocation1 = "Bay, Arkansas, United States";
            String lStrLocation = "Bay";
            findElement(By.id("LocationInputSearch")).sendKeys(lStrLocation);
            findElement(By.xpath("//a[contains(text(),'Bay, Arkansas, United States')]")).click();
            VerificationStatements.VerifyInputValue(getDriverProvider().get(),By.cssSelector("LocationInputSearch"),lStrLocation1);
        }catch (NoSuchElementException e){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+gStrLocationFieldName+"\nReason of Error:"+"Element is not clicked\n";
        }
    }

    public void selectLocationInNewBusinessLoanSearch(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        try{
            gStrLocationFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.id("LocationInputSearch")).click();
            String lStrLocation1 = "Cuney, Texas, United States";
            String lStrLocation = "Cuney";
            findElement(By.id("LocationInputSearch")).sendKeys(lStrLocation);
            findElement(By.xpath("//a[contains(text(),'Cuney, Texas, United States')]")).click();
            VerificationStatements.VerifyInputValue(getDriverProvider().get(),By.cssSelector("LocationInputSearch"),lStrLocation1);
        }catch (NoSuchElementException e){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+gStrLocationFieldName+"\nReason of Error:"+"Element is not clicked\n";
        }
    }

    public void clearLocation(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("LocationInputSearch")).click();
        findElement(By.id("LocationInputSearch")).clear();
    }

    public void clickAssetTypeDropDown_JVPartner(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Asset Types:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectOfficeInAssetType(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        executeScript("scroll(550,0)");
        findElement(By.id("AssettypeId_checkbox_1")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_1"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Asset Types:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectMultiFamilyInAssetType(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssettypeId_checkbox_3")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_3"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Asset Types:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectHotelInAssetType(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssettypeId_checkbox_5")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_5"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Asset Types:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectHealthCareInAssetType(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.id("AssettypeId_checkbox_13")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_13"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Asset Types:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        WaitUtil.simpleSleep(5000);

    }

    public void clearOfficeInAssetType(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssettypeId_checkbox_1")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_1"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Asset Types:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearMultiFamilyInAssetType(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssettypeId_checkbox_3")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_3"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Asset Types:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearHotelInAssetType(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssettypeId_checkbox_5")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_5"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Asset Types:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearHealthCareInAssetType(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssettypeId_checkbox_13")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_13"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Asset Types:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

    }

    public void clickRiskProfileDropDown_JVPartner(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectCoreOptionInRiskProfile_JVPartner(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("RiskprofileId_checkbox_1")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_1"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectCorePlusOptionInRiskProfile_JVPartner(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("RiskprofileId_checkbox_2")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_2"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectValueAddOptionInRiskProfile_JVPartner(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("RiskprofileId_checkbox_3")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_3"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectDevelopmentOptionInRiskProfile_JVPartner(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("RiskprofileId_checkbox_4")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_4"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

    }

    public void clearCoreOptionInRiskProfile_JVPartner(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("RiskprofileId_checkbox_1")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_1"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearCorePlusOptionInRiskProfile_JVPartner(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("RiskprofileId_checkbox_2")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_2"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearValueAddOptionInRiskProfile_JVPartner(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("RiskprofileId_checkbox_3")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_3"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearDevelopmentOptionInRiskProfile_JVPartner(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("RiskprofileId_checkbox_4")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_4"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

    }

   /* public void clickDealStageDropDown_JVPartner(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }*/

    public void selectOwnedOptionInDealStage_JVPartner(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("DealstageId_checkbox_1")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("DealstageId_checkbox_1"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectUnderContractOptionInDealStage_JVPartner(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("DealstageId_checkbox_2")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("DealstageId_checkbox_2"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectConceptOptionInDealStage_JVPartner(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("DealstageId_checkbox_3")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("DealstageId_checkbox_3"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectPlanApprovedOptionInDealStage_JVPartner(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("DealstageId_checkbox_4")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("DealstageId_checkbox_4"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void ClearOwnedOptionInDealStage_JVPartner(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("DealstageId_checkbox_1")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("DealstageId_checkbox_1"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearUnderContractOptionInDealStage_JVPartner(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("DealstageId_checkbox_2")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("DealstageId_checkbox_2"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearConceptOptionInDealStage_JVPartner(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("DealstageId_checkbox_3")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("DealstageId_checkbox_3"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearPlanApprovedOptionInDealStage_JVPartner(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("DealstageId_checkbox_4")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("DealstageId_checkbox_4"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

    }

    public void clickCurrentAssetStatusDropDown_JVPartner(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectFullyRentedOptionInCurrentAssetStatus_JVPartner(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstatusId_checkbox_1")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssetstatusId_checkbox_1"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectREOOptionInCurrentAssetStatus_JVPartner(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstatusId_checkbox_2")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssetstatusId_checkbox_2"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectPartiallyStabilizedOptionInCurrentAssetStatus_JVPartner(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstatusId_checkbox_3")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssetstatusId_checkbox_3"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectVacantStructureOptionInCurrentAssetStatus_JVPartner(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstatusId_checkbox_4")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssetstatusId_checkbox_4"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

    }

    public void clearFullyRentedOptionInCurrentAssetStatus_JVPartner(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstatusId_checkbox_1")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssetstatusId_checkbox_1"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearREOOptionInCurrentAssetStatus_JVPartner(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstatusId_checkbox_2")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssetstatusId_checkbox_2"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearPartiallyStablilizedOptionInCurrentAssetStatus_JVPartner(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstatusId_checkbox_3")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssetstatusId_checkbox_3"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

    }

    public void clearVacantStructureOptionInCurrentAssetStatus_JVPartner(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstatusId_checkbox_4")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssetstatusId_checkbox_4"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

    }

    public void selectAssetStrategy_JVPartner(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Asset Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectAcquisitionOptionInAssetStrategy_JVPartner(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstrategyId_checkbox_1")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssetstrategyId_checkbox_1"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Asset Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectPlatFormBuildOptionInAssetStrategy_JVPartner(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstrategyId_checkbox_2")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssetstrategyId_checkbox_2"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Asset Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectSalesAndLeaseBackOptionInAssetStrategy_JVPartner(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstrategyId_checkbox_3")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssetstrategyId_checkbox_3"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Asset Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

    }

    public void selectPursuitOptionInAssetStrategy_JVPartner(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstrategyId_checkbox_4")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssetstrategyId_checkbox_4"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Asset Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

    }

    public void clearAcquisitionOptionInAssetStrategy_JVPartner(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstrategyId_checkbox_1")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssetstrategyId_checkbox_1"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Asset Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearPlatformBuildOptionInAssetStrategy_JVPartner(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstrategyId_checkbox_2")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssetstrategyId_checkbox_2"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Asset Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearSalesLeaseBackOptionInAssetStrategy_JVPartner(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstrategyId_checkbox_3")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssetstrategyId_checkbox_3"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Asset Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearPursuitOptionInAssetStrategy_JVPartner(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstrategyId_checkbox_4")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssetstrategyId_checkbox_4"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Asset Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

    }

    public void setLoanAmount_NewBusinessSearch(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<5;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[2]"));
        for(int i=0;i<94;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
            //wait until page loads
            WaitUtil.simpleSleep(150);
        }
        //wait until page loads
        WaitUtil.simpleSleep(15000);
    }

    public void setLoanTerm_NewBusinessSearch(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/div/div[2]/a[1]"));
        for(int i=0;i<3;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/div/div[2]/a[2]"));
        for(int i=0;i<96;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
            //wait until page loads
            WaitUtil.simpleSleep(150);
        }
        //wait until page loads
        WaitUtil.simpleSleep(15000);
    }

    public void clearLoanAmount_NewBusinessSearch(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<5;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[2]"));
        for(int i=6;i<100;i++){
            sliderRight.sendKeys(Keys.ARROW_RIGHT);
        }
        //wait until page loads
        WaitUtil.simpleSleep(15000);
    }

    public void clearLoanTerm_NewBusinessSearch(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/div/div[2]/a[1]"));
        for(int i=0;i<3;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/div/div[2]/a[2]"));
        for(int i=4;i<100;i++){
            sliderRight.sendKeys(Keys.ARROW_RIGHT);
        }
        //wait until page loads
        WaitUtil.simpleSleep(15000);
    }

    public void selectLoanUse_NewBusinessSearch(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Loan Use')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectSeniorOrPermanentOption(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("LoanuseId_checkbox_1")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("LoanuseId_checkbox_1"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Loan Use')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearSeniorOrPermanentOption(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("LoanuseId_checkbox_1")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("LoanuseId_checkbox_1"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Loan Use')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickMarketPlaceLinkInCompanyTabOfUserProfile(){
        //wait until page load
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//section[@id='content']/div[@class='progress-popup']/ul/li/a/span/strong[contains(text(),'Step 3:')]")).click();
        //wait until page load
        WaitUtil.simpleSleep(5000);
    }



}
