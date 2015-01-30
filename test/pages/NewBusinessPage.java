package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.junit.ComparisonFailure;
import org.openqa.selenium.*;
import test.Support.ReadData;
import test.steps.VerificationStatements;

/**
 * Created with IntelliJ IDEA.
 * User: Bhavana
 * Date: 9/18/14
 * Time: 12:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class NewBusinessPage extends FluentWebDriverPage {

    String gStrMatchCountInProfile="",gStrMatchCountInSearchResult="",gStrLocationFieldName="";
    public static String gStrFieldName = "";

    public NewBusinessPage(WebDriverProvider driverProvider) {
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
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDealSponsorFundName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RDavis Fund Is Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RDavis Fund Is Displayed in the Search Result\n";
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

    public void verifyDealSponsorProjectNameIsDisplayedNameInNewBusinessSearch(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDealSponsorProjectName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RDavis Fund Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RDavis Fund Is Not Displayed in the Search Result\n";
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

    public void verifyDealSponsorProjectNameIsNotDisplayedNameInNewBusinessMezzSearch(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDealSponsorProjectName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RDavis Project Is Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RDavis Project Is Displayed in the Search Result\n";
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

    public void verifyDealSponsorProjectIsDisplayedNameInNewBusinessLoanSearch(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strDealSponsorProjectName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RDavis Project Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RDavis Project Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyDealSponsorFundNameIsDisplayedNameInNewBusinessMezzSearch(String strDealSponsorFundName){
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


    public void verifyDealSponsorFundNameIsDisplayedNameInNewBusinessAdvisorSearch(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDealSponsorFundName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"CM Fund Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"CM Fund Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyDealSponsorProjectNameIsDisplayedNameInNewBusinessAdvisorSearch(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDealSponsorProjectName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"CM Project Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"CM Project Is Not Displayed in the Search Result\n";
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

    public void verifyInvestorFundNameIsNotDisplayedNameInNewBusinessMezzSearch(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strInvestorFundName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"BLee Fund Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"BLee Fund Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyInvestorFundNameIsDisplayedNameInNewBusinessAdvisorSearch(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strInvestorFundName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"MTen Fund Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"MTen Fund Is Not Displayed in the Search Result\n";
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

    public void verifyLenderLoanNameIsDisplayedNameInNewBusinessAdvisorSearch(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strLenderLoanName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"CarTen Loan Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"CarTen Loan Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyLenderLoanNameIsNotDisplayedNameInNewBusinessMezzSearch(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strLenderLoanName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JHall Loan Is Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JHall Loan Is Displayed in the Search Result\n";
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

    public void verifyLenderMezzNameIsDisplayedNameInNewBusinessAdvisorSearch(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strLenderMezzName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"CarTen Mezz Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"CarTen Mezz Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyLenderMezzNameIsNotDisplayedNameInNewBusinessMezzSearch(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strLenderMezzName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JHall Mezz Is Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JHall Mezz Is Displayed in the Search Result\n";
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

    public void verifyAdvisorListingNameIsDisplayedNameInNewBusinessAdvisorSearch(String strAdvisorListingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strAdvisorListingName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Kov Listing Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Kov Listing Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyAdvisorListingNameIsNotDisplayedNameInNewBusinessMezzSearch(String strAdvisorListingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strAdvisorListingName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"KWin Listing Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"KWin Listing Is Not Displayed in the Search Result\n";
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

    public void verifyAdvisorServiceNameIsDisplayedInNewBusinessAdvisorSearch(String strAdvisorServiceName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strAdvisorServiceName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Kov Service Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Kov Service Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyAdvisorServiceNameIsNotDisplayedInNewBusinessMezzSearch(String strAdvisorServiceName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strAdvisorServiceName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"KWin Service Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"KWin Service Is Not Displayed in the Search Result\n";
        }
    }

    public void clickDSProjectNameOfNewBusinessLoanSearch(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//section[@id='content']/div[2]/div[2]/ng-include/div/table/tbody/tr[4]/td[1]/a/span")).click();
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

    public void verifyFundNameIsDisplayedInSearchResultToFilterSelected_NewBusinessAdvisorSearch(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDealSponsorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"CM Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"CM Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyFundNameIsNotDisplayedInSearchResultToFilterSelected_NewBusinessMezzSearch(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDealSponsorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RDavis Fund Is Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RDavis Fund Is Displayed in the Search Result when Side Filters are performed\n";
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

    public void verifyProjectNameIsDisplayedInSearchResultToFilterSelected_NewBusinessAdvisorSearch(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDealSponsorProjectName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"CM Project Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"CM Project Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyProjectNameIsNotDisplayedInSearchResultToFilterSelected_NewBusinessMezzSearch(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDealSponsorProjectName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RDavis Project Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RDavis Project Is Not Displayed in the Search Result when Side Filters are performed\n";
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

    public void verifyInvestorFundNameIsDisplayedInSearchResultToFilterSelected_ProjectSearchingInNewBusinessAdvisor(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strInvestorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"MTen Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"MTen Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyInvestorFundNameIsNotDisplayedInSearchResultToFilterSelected_ProjectSearchingInNewBusinessMezz(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strInvestorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"BLee Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"BLee Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
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

    public void verifyLenderLoanNameIsDisplayedInSearchResultToFilterSelected_ProjectSearchInNewBusinessAdvisor(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strLenderLoanName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"CarTen Loan Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"CarTen Loan Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyLenderLoanNameIsNotDisplayedInSearchResultToFilterSelected_ProjectSearchInNewBusinessMezz(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strLenderLoanName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JHall Loan Is Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JHall Loan Is Displayed in the Search Result when Side Filters are performed\n";
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

    public void verifyLenderMezzNameIsDisplayedInSearchResultToFilterSelected_ProjectSearchInNewBusinessAdvisor(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strLenderMezzName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"CarTen Mezz Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"CarTen Mezz Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyLenderMezzNameIsNotDisplayedInSearchResultToFilterSelected_ProjectSearchInNewBusinessMezz(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strLenderMezzName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JHall Mezz Is Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JHall Mezz Is Displayed in the Search Result when Side Filters are performed\n";
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

    public void verifyAdvisorListingNameIsDisplayedInSearchResultToFilterSelected_NewBusinessAdvisorSearch(String strAdvisorListingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAdvisorListingName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Kov Listing Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Kov Listing Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyAdvisorListingNameIsNotDisplayedInSearchResultToFilterSelected_NewBusinessMezzSearch(String strAdvisorListingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAdvisorListingName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"KWin Listing Is Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"KWin Listing Is Displayed in the Search Result when Side Filters are performed\n";
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

    public void verifyAdvisorServiceNameIsDisplayedInSearchResultToFilterSelected_NewBusinessAdvisorSearch(String strAdvisorServiceName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAdvisorServiceName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Kov Service Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Kov Service Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyAdvisorServiceNameIsNotDisplayedInSearchResultToFilterSelected_NewBusinessMezzSearch(String strAdvisorServiceName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAdvisorServiceName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"KWin Service Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"KWin Service Is Not Displayed in the Search Result when Side Filters are performed\n";
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
            VerificationStatements.VerifyInputValue(getDriverProvider().get(), By.cssSelector("LocationInputSearch"), lStrLocation1);
        }catch (NoSuchElementException e){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+gStrLocationFieldName+"\nReason of Error:"+"Element is not clicked\n";
        }
    }

    public void setLoanAmount_NewBusinessSearch(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<5;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
            WaitUtil.simpleSleep(100);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[2]"));
        for(int i=0;i<94;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
            WaitUtil.simpleSleep(100);
        }
        //wait until page loads
        WaitUtil.simpleSleep(1000);
    }

    public void setLoanTerm_NewBusinessSearch(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/div/div[2]/a[1]"));
        for(int i=0;i<3;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
            WaitUtil.simpleSleep(100);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/div/div[2]/a[2]"));
        for(int i=0;i<96;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
            WaitUtil.simpleSleep(100);
        }
        //wait until page loads
        WaitUtil.simpleSleep(1000);
    }

    public void clearLoanAmount_NewBusinessSearch(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/strong[1]")).getText();
            WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
            for(int i=0;i<5;i++){
                sliderLeft.sendKeys(Keys.ARROW_LEFT);
                WaitUtil.simpleSleep(100);
            }
            WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[2]"));
            for(int i=6;i<100;i++){
                sliderRight.sendKeys(Keys.ARROW_RIGHT);
                WaitUtil.simpleSleep(100);
            }
            //wait until page loads
            WaitUtil.simpleSleep(1000);
        }catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Loan Amount field not found\n";
        }
    }

    public void clearLoanTerm_NewBusinessSearch(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/strong[2]")).getText();
            WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/div/div[2]/a[1]"));
            for(int i=0;i<3;i++){
                sliderLeft.sendKeys(Keys.ARROW_LEFT);
                WaitUtil.simpleSleep(100);
            }
            WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/div/div[2]/a[2]"));
            for(int i=4;i<100;i++){
                sliderRight.sendKeys(Keys.ARROW_RIGHT);
                WaitUtil.simpleSleep(100);
            }
            //wait until page loads
            WaitUtil.simpleSleep(1000);
        } catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Loan term field not found\n";
        }
    }

    public void verifyInvestorFundNameNotDisplayedInNewBusinessLoanSearch_LightHouseOff(String strInvestorFundName){
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

    public void verifyInvestorFundNameIsNotDisplayedInNewBusinessLoanSearchWhereLightHouseOff(String strInvestorFundName){
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

    public void selectLoanUse_NewBusinessSearch(){
        try{
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/label")).getText();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Loan Use')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element loan use\n";
        }
    }

    public void selectAssetProfile_NewBusinessMezz(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/label")).getText();
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Asset Profile')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element asset profile\n";
        }
    }

    public void selectSeniorOrPermanentOption(){
        try{
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/label")).getText();
        findElement(By.id("LoanuseId_checkbox_1")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("LoanuseId_checkbox_1"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Loan Use')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        } catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Senior or permanent check box is unchecked\n";
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element senior or permanent check box\n";
        }
    }

    public void selectCoreInAssetProfileOfNewBusinessMezz(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(3000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/label")).getText();
            findElement(By.id("RiskprofileId_checkbox_1")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_1"));
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Asset Profile')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        } catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Core check box in asset profile is unchecked\n";
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element core in asset profile check box\n";
        }
    }

    public void clearCoreInAssetProfileOfNewBusinessMezz(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/label")).getText();
            findElement(By.id("RiskprofileId_checkbox_1")).click();
            VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_1"));
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Asset Profile')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        } catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Core check box in asset profile is not unchecked\n";
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element core in asset profile check box\n";
        }
    }

    public void clearSeniorOrPermanentOption(){
        try{
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/label")).getText();
            findElement(By.id("LoanuseId_checkbox_1")).click();
            VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("LoanuseId_checkbox_1"));
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Loan Use')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
            //wait until page loads
            WaitUtil.simpleSleep(10000);
        } catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Senior or permanent check box is not unchecked\n";
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element senior or permanent check box\n";
        }
    }

    public void clickRouteToBrowser(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[4]/label")).getText();
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Route To Borrower')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element route to browser\n";
        }
    }

    public void selectDirectOnlyOptionInRouteToBrowser(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[4]/label")).getText();
            findElement(By.id("RouteId_checkbox_1")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("RouteId_checkbox_1"));
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Route To Borrower')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element route to browser\n";
        }  catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Direct only check box is not clicked\n";
        }
        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void clearDirectOnlyOptionInRouteToBrowser(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[4]/label")).getText();
            findElement(By.id("RouteId_checkbox_1")).click();
            VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("RouteId_checkbox_1"));
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Route To Borrower')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element route to browser\n";
        }  catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Direct only check box is not un clicked\n";
        }
        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void selectCollateralDropDown_NewBusinessMezz(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Collateral')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element asset profile\n";
        }
    }

    public void selectTheAssetOptionInCollateralField(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.id("CollateralId_checkbox_1")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("CollateralId_checkbox_1"));
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Collateral')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element collateral\n";
        }  catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"The asset check box is not clicked\n";
        }
    }

    public void clearTheAssetOptionInCollateralField(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.id("CollateralId_checkbox_1")).click();
            VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("CollateralId_checkbox_1"));
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Collateral')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element collateral\n";
        }  catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"The asset check box is not un clicked\n";
        }
    }

    public void selectIdealCustomerDropDown(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Ideal Customer')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element ideal customer\n";
        }
    }

    public void selectDealSponsorInIdealCustomerField(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.id("OwnerroleId_checkbox_1")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("OwnerroleId_checkbox_1"));
            WaitUtil.simpleSleep(5000);
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Ideal Customer')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element ideal customer\n";
        }  catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"The deal sponsor check box is not clicked\n";
        }
    }

    public void selectDeveloperInIdealCustomerField(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.xpath("//div[@id='subRoleSelect2']/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
            findElement(By.id("OwnerSubRoleId_checkbox_1")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("OwnerSubRoleId_checkbox_1"));
            WaitUtil.simpleSleep(6000);
            findElement(By.xpath("//div[@id='subRoleSelect2']/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element ideal customer\n";
        }  catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"The developer check box is not clicked\n";
        }
    }

    public void clearDealSponsorInIdealCustomerField(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.id("OwnerroleId_checkbox_1")).click();
            VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("OwnerroleId_checkbox_1"));
            WaitUtil.simpleSleep(7000);
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Ideal Customer')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element ideal customer\n";
        }  catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"The deal sponsor check box is not un clicked\n";
        }
    }

    public void selectLenderInIdealCustomerField(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.id("OwnerroleId_checkbox_3")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("OwnerroleId_checkbox_3"));
            WaitUtil.simpleSleep(5000);
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Ideal Customer')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element ideal customer\n";
        }  catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"The lender check box is not clicked\n";
        }
    }

    public void selectFamilyOfficeOptionInIdealCustomerField(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.xpath("//div[@id='subRoleSelect2']/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
            findElement(By.id("OwnerSubRoleId_checkbox_39")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("OwnerSubRoleId_checkbox_39"));
            WaitUtil.simpleSleep(5000);
            findElement(By.xpath("//div[@id='subRoleSelect2']/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element ideal customer\n";
        }  catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"The family office check box is not clicked\n";
        }
    }

    public void clearLenderInIdealCustomerField(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.id("OwnerroleId_checkbox_3")).click();
            VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("OwnerroleId_checkbox_3"));
            WaitUtil.simpleSleep(7000);
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Ideal Customer')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element ideal customer\n";
        }  catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"The lender check box is not un clicked\n";
        }
    }

    public void selectInvestorInIdealCustomerField(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.id("OwnerroleId_checkbox_2")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("OwnerroleId_checkbox_2"));
            WaitUtil.simpleSleep(5000);
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Ideal Customer')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element ideal customer\n";
        }  catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"The investor check box is not clicked\n";
        }
    }

    public void selectAdvisorOptionInIdealCustomerField(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.xpath("//div[@id='subRoleSelect2']/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
            findElement(By.id("OwnerSubRoleId_checkbox_18")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("OwnerSubRoleId_checkbox_18"));
            WaitUtil.simpleSleep(5000);
            findElement(By.xpath("//div[@id='subRoleSelect2']/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element ideal customer\n";
        }  catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"The advisor check box is not clicked\n";
        }
    }

    public void clearInvestorInIdealCustomerField(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.id("OwnerroleId_checkbox_2")).click();
            VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("OwnerroleId_checkbox_2"));
            WaitUtil.simpleSleep(10000);
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Ideal Customer')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element ideal customer\n";
        }  catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"The investor check box is not un clicked\n";
        }
    }

    public void selectRealEstateAdvisorInIdealCustomerField(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.id("OwnerroleId_checkbox_4")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("OwnerroleId_checkbox_4"));
            WaitUtil.simpleSleep(5000);
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Ideal Customer')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element ideal customer\n";
        }  catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"The real estate advisor check box is not clicked\n";
        }
    }

    public void selectAdvisorOptionOfREAInIdealCustomerField(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.xpath("//div[@id='subRoleSelect2']/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
            findElement(By.id("OwnerSubRoleId_checkbox_57")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("OwnerSubRoleId_checkbox_57"));
            WaitUtil.simpleSleep(5000);
            findElement(By.xpath("//div[@id='subRoleSelect2']/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element ideal customer\n";
        }  catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"The advisor of rea check box is not clicked\n";
        }
    }

    public void clearRealEstateAdvisorInIdealCustomerField(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.id("OwnerroleId_checkbox_4")).click();
            VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("OwnerroleId_checkbox_4"));
            WaitUtil.simpleSleep(7000);
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Ideal Customer')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element ideal customer\n";
        }  catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"The real estate advisor check box is not un clicked\n";
        }
    }

    public void clickRouteToSponsorOfDealSponsor_NewBusiness(){
        //wait until page load
        WaitUtil.simpleSleep(500);
        executeScript("scroll(150,0)");
        findElement(By.xpath("//div[@class='field clearfix']/label[contains(text(),'Route to Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page load
        WaitUtil.simpleSleep(1000);
    }

    public void selectNoOfProfessionals(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[5]/div/div[2]/a[1]"));
        for(int i=0;i<10;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void clearNoOfProfessionals(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[5]/div/div[2]/a[1]"));
        for(int i=0;i<10;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clickNorthEast(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Regions:')]/parent::div/div/multi-selectbox/div/div/div[@class='row']/div/div/div[@class='col-md-9']/label[contains(text(),'Northeast')]")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Regions:')]/parent::div/div/multi-selectbox/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void enterAndSelectIraCity(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Cities:')]/parent::div/div/multi-selectbox/div/div/div/input")).sendKeys("Ira");
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Cities:')]/parent::div/div/multi-selectbox/div/div/div/div/div/div[@class='col-md-9']/label[contains(text(),'Ira (New York)')]")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Cities:')]/parent::div/div/multi-selectbox/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void enterAndSelectEraCity(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Cities:')]/parent::div/div/multi-selectbox/div/div/div/input")).sendKeys("Era");
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Cities:')]/parent::div/div/multi-selectbox/div/div/div/div/div/div[@class='col-md-9']/label[contains(text(),'Era (Texas)')]")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Cities:')]/parent::div/div/multi-selectbox/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void verifyCorporateFinance(int RowIndex){
        try{
            String strVerifySubRole= ReadData.readDataExcel("JVPartner and NewBusiness", RowIndex, "VerifySubRoleType");
            Assert.assertEquals(strVerifySubRole, findElement(By.xpath("//div[@id='searchFilters']/div/span[contains(text(),'Subrole:')]/strong")).getText());
        } catch (AssertionError A) {
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Verification of subrole field in search failed";
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

    public void verifyDealSponsorFundNameIsDisplayedNameInNewBusinessCorporateSearch(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDealSponsorFundName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Moore Fund Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Moore Fund Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyDealSponsorProjectNameIsDisplayedNameInNewBusinessCorporateSearch(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDealSponsorProjectName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Moore Project Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Moore Project Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyInvestorFundNameIsDisplayedNameInNewBusinessCorporateSearch(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strInvestorFundName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Luke Fund Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Luke Fund Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyLenderLoanNameIsDisplayedNameInNewBusinessCorporateSearch(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strLenderLoanName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Henry Loan Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Henry Loan Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyLenderMezzNameIsDisplayedNameInNewBusinessCorporateSearch(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strLenderMezzName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Henry Mezz Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Henry Mezz Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyAdvisorServiceNameIsDisplayedInNewBusinessCorporateSearch(String strAdvisorServiceName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strAdvisorServiceName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Gavin Service Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Gavin Service Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyAdvisorListingNameIsDisplayedNameInNewBusinessCorporateSearch(String strAdvisorListingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strAdvisorListingName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Gavin Listing Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Gavin Listing Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyFundNameIsDisplayedInSearchResultToFilterSelected_NewBusinessCorporateSearch(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDealSponsorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Moore Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Moore Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyInvestorFundNameIsDisplayedInSearchResultToFilterSelected_ProjectSearchingInNewBusinessCorporate(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strInvestorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Luke Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Luke Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyProjectNameIsDisplayedInSearchResultToFilterSelected_NewBusinessCorporateSearch(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDealSponsorProjectName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Moore Project Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Moore Project Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyLenderLoanNameIsDisplayedInSearchResultToFilterSelected_ProjectSearchInNewBusinessCorporate(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strLenderLoanName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Henry Loan Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Henry Loan Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyLenderMezzNameIsDisplayedInSearchResultToFilterSelected_ProjectSearchInNewBusinessCorporate(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strLenderMezzName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Henry Mezz Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Henry Mezz Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyAdvisorServiceNameIsDisplayedInSearchResultToFilterSelected_NewBusinessCorporateSearch(String strAdvisorServiceName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAdvisorServiceName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Gavin Service Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Gavin Service Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyAdvisorListingNameIsDisplayedInSearchResultToFilterSelected_NewBusinessCorporateSearch(String strAdvisorListingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAdvisorListingName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Gavin Listing Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Gavin Listing Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyInvestmentBanker_NewBusiness(int RowIndex){
        try{
            String strVerifySubRole= ReadData.readDataExcel("JVPartner and NewBusiness", RowIndex, "VerifySubRoleType");
            Assert.assertEquals(strVerifySubRole, findElement(By.xpath("//div[@id='searchFilters']/div/span[contains(text(),'Subrole:')]/strong")).getText());
        } catch (AssertionError A) {
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Verification of subrole field in search failed";
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

    public void verifyDealSponsorFundNameIsDisplayedNameInNewBusinessInvBankerSearch(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDealSponsorFundName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Ethan Fund Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Ethan Fund Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyDealSponsorProjectNameIsDisplayedNameInNewBusinessInvBankerSearch(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDealSponsorProjectName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Ethan Project Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Ethan Project Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyInvestorFundNameIsDisplayedNameInNewBusinessInvBankerSearch(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strInvestorFundName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Lewin Fund Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Lewin Fund Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyLenderLoanNameIsDisplayedNameInNewBusinessInvBankerSearch(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strLenderLoanName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Chris Loan Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Chris Loan Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyLenderMezzNameIsDisplayedNameInNewBusinessInvBankerSearch(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strLenderMezzName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Chris Mezz Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Chris Mezz Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyAdvisorServiceNameIsDisplayedInNewBusinessInvBankerSearch(String strAdvisorServiceName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strAdvisorServiceName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"SM Service Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"SM Service Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyAdvisorListingNameIsDisplayedNameInNewBusinessInvBankerSearch(String strAdvisorListingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strAdvisorListingName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"SW Listing Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"SW Listing Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyFundNameIsDisplayedInSearchResultToFilterSelected_NewBusinessInvBankerSearch(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDealSponsorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Ethan Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Ethan Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyInvestorFundNameIsDisplayedInSearchResultToFilterSelected_ProjectSearchingInNewBusinessInvBanker(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strInvestorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Lewin Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Lewin Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyProjectNameIsDisplayedInSearchResultToFilterSelected_NewBusinessInvBankerSearch(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDealSponsorProjectName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Ethan Project Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Ethan Project Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyLenderLoanNameIsDisplayedInSearchResultToFilterSelected_ProjectSearchInNewBusinessInvBanker(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strLenderLoanName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Chris Loan Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Chris Loan Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyLenderMezzNameIsDisplayedInSearchResultToFilterSelected_ProjectSearchInNewBusinessInvBanker(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strLenderMezzName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Chris Mezz Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Chris Mezz Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyAdvisorServiceNameIsDisplayedInSearchResultToFilterSelected_NewBusinessInvBankerSearch(String strAdvisorServiceName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAdvisorServiceName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"SM Service Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"SM Service Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyAdvisorListingNameIsDisplayedInSearchResultToFilterSelected_NewBusinessInvBankerSearch(String strAdvisorListingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAdvisorListingName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"SM Listing Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"SM Listing Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyResidentialBroker_NewBusiness(int RowIndex){
        try{
            String strVerifySubRole= ReadData.readDataExcel("JVPartner and NewBusiness", RowIndex, "VerifySubRoleType");
            Assert.assertEquals(strVerifySubRole, findElement(By.xpath("//div[@id='searchFilters']/div/span[contains(text(),'Subrole:')]/strong")).getText());
        } catch (AssertionError A) {
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Verification of subrole field in search failed";
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

    public void verifyCommercialBroker_NewBusiness(int RowIndex){
        try{
            String strVerifySubRole= ReadData.readDataExcel("JVPartner and NewBusiness", RowIndex, "VerifySubRoleType");
            Assert.assertEquals(strVerifySubRole, findElement(By.xpath("//div[@id='searchFilters']/div/span[contains(text(),'Subrole:')]/strong")).getText());
        } catch (AssertionError A) {
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Verifying commercial broker in subrole field of search failed";
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

    public void verifyDealSponsorFundNameIsDisplayedNameInNewBusinessResidentialSearch(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDealSponsorFundName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Glick Fund Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Glick Fund Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyDealSponsorProjectNameIsDisplayedNameInNewBusinessResidentialSearch(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDealSponsorProjectName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Glick Project Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Glick Project Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyInvestorFundNameIsDisplayedNameInNewBusinessResidentialSearch(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strInvestorFundName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"ChrisL Fund Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"ChrisL Fund Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyLenderLoanNameIsDisplayedNameInNewBusinessResidentialSearch(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strLenderLoanName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Jerry Loan Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Jerry Loan Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyLenderMezzNameIsDisplayedNameInNewBusinessResidentialSearch(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strLenderMezzName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Jerry Mezz Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Jerry Mezz Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyAdvisorServiceNameIsDisplayedInNewBusinessResidentialSearch(String strAdvisorServiceName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strAdvisorServiceName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Evans Service Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Evans Service Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyAdvisorListingNameIsDisplayedNameInNewBusinessResidentialSearch(String strAdvisorListingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strAdvisorListingName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Evans Listing Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Evans Listing Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyFundNameIsDisplayedInSearchResultToFilterSelected_NewBusinessResidentialSearch(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDealSponsorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Glick Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Glick Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyInvestorFundNameIsDisplayedInSearchResultToFilterSelected_ProjectSearchingInNewResidentialBroker(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strInvestorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"ChrisL Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"ChrisL Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyProjectNameIsDisplayedInSearchResultToFilterSelected_NewBusinessResidentialSearch(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDealSponsorProjectName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Glick Project Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Glick Project Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyLenderLoanNameIsDisplayedInSearchResultToFilterSelected_ProjectSearchInNewBusinessResidential(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strLenderLoanName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Jerry Loan Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Jerry Loan Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyLenderMezzNameIsDisplayedInSearchResultToFilterSelected_ProjectSearchInNewBusinessResidential(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strLenderMezzName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Jerry Mezz Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Jerry Mezz Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyAdvisorServiceNameIsDisplayedInSearchResultToFilterSelected_NewBusinessResidentialSearch(String strAdvisorService){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAdvisorService+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Evans Service Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Evans Service Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyAdvisorListingNameIsDisplayedInSearchResultToFilterSelected_NewBusinessResidentialSearch(String strAdvisorListing){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAdvisorListing+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Evans Listing Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Evans Listing Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyDealSponsorFundNameIsDisplayedNameInNewBusinessCommercialSearch(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDealSponsorFundName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"ClarkD Fund Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"ClarkD Fund Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyDealSponsorProjectNameIsDisplayedNameInNewBusinessCommercialSearch(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDealSponsorProjectName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"ClarkD Project Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"ClarkD Project Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyInvestorFundNameIsDisplayedNameInNewBusinessCommercialSearch(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strInvestorFundName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"VHall Fund Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"VHall Fund Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyLenderLoanNameIsDisplayedNameInNewBusinessCommercialSearch(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strLenderLoanName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Logan Loan Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Logan Loan Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyLenderMezzNameIsDisplayedNameInNewBusinessCommercialSearch(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strLenderMezzName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Logan Mezz Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Logan Mezz Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyAdvisorServiceNameIsDisplayedInNewBusinessCommercialSearch(String strAdvisorServiceName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strAdvisorServiceName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Aiden Service Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Aiden Service Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyAdvisorListingNameIsDisplayedNameInNewBusinessCommercialSearch(String strAdvisorListingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strAdvisorListingName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Aiden Listing Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Aiden Listing Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyFundNameIsDisplayedInSearchResultToFilterSelected_NewBusinessCommercialSearch(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDealSponsorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"ClarkD Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"ClarkD Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyInvestorFundNameIsDisplayedInSearchResultToFilterSelected_ProjectSearchingInNewCommercialBroker(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strInvestorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"VHall Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"VHall Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyProjectNameIsDisplayedInSearchResultToFilterSelected_NewBusinessCommercialSearch(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDealSponsorProjectName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"ClarkD Project Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"ClarkD Project Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyLenderLoanNameIsDisplayedInSearchResultToFilterSelected_ProjectSearchInNewBusinessCommercial(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strLenderLoanName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Logan Loan Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Logan Loan Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyLenderMezzNameIsDisplayedInSearchResultToFilterSelected_ProjectSearchInNewBusinessCommercial(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strLenderMezzName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Logan Mezz Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Logan Mezz Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyAdvisorServiceNameIsDisplayedInSearchResultToFilterSelected_NewBusinessCommercialSearch(String strAdvisorService){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAdvisorService+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Aiden Service Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Aiden Service Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyAdvisorListingNameIsDisplayedInSearchResultToFilterSelected_NewBusinessCommercialSearch(String strAdvisorListing){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAdvisorListing+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Aiden Listing Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Aiden Listing Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyPostingOfCommercialBrokerRequirement(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+CreateUserPage.gStrDsPostingName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            //LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+""'+strDsPostingName+'"\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            //LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Aiden Listing Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyWhatDoYouWantToPostInMarketPlace(){
        try{
        //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//div[@id='post']/div/span[contains(text(),'What do you want to post to the marketplace?')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"What do you wnat to post in market place is not displayed\n";
        }
    }

    public void clickFundButtonInMarketPlace(){
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//div[@id='post']/div/div/div/ul/li/div/a[text()='Fund']")).sendKeys(Keys.ENTER);
        WaitUtil.simpleSleep(10000);
    }

    public void clickEquityButtonInMarketPlace(){
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//div[@id='post']/ul/li/div/a[contains(text(),'Equity')]")).sendKeys(Keys.ENTER);
        WaitUtil.simpleSleep(10000);
    }

    public void clickListingButtonInMarketPlace(){
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//div[@id='post']/ul/li/div/a[contains(text(),'Listing')]")).sendKeys(Keys.ENTER);
        WaitUtil.simpleSleep(10000);
    }

    public void clickServiceButtonInMarketPlace(){
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//div[@id='post']/div/div/div/ul/li/div/a[text()='Service']")).sendKeys(Keys.ENTER);
        WaitUtil.simpleSleep(10000);
    }

    public void verifyREAServicePostingOfCommercialBrokerRequirement(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+CreateUserPage.gStrServicePostingName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            //LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+""'+strDsPostingName+'"\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            //LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Aiden Listing Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyREAListingPostingOfCommercialBrokerRequirement(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+CreateUserPage.gStrListingPostingName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            //LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+""'+strDsPostingName+'"\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            //LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Aiden Listing Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void clickReturnToYourPostings(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.cssSelector("a.next.is_edit")).click();
    }

    public void verifyLenderMezzOfFinancialRequirement(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strLenderMezzName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"MSmi Mezz name is not displayed in the count of matches\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            //LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Aiden Listing Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyInvestorEquityOfFinancialRequirement(String strEquityName){
        try{
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strEquityName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"GC Equity name is not displayed in the count of matches\n";
        }

    }

    public void verifyLoanFieldInSearch(String strLoanFieldName){
        WaitUtil.simpleSleep(1000);
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//div[@id='searchFilters']/div/span[contains(text(),'Loan:')]/strong[contains(text(),'"+strLoanFieldName+"')]"),getDriverProvider().get()));
    }

    public void clickEditButtonOfAboutThisFund(){
        try{
            findElement(By.xpath("//h3[text()='About this Fund']/parent::div/a[text()='Edit']")).click();
        } catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Unable to click 'About thid Fund' field in Fund Posting";
        }
    }

    public void clickFundInvestInAndSelectDirectIntoProjectOption(){
        try{
            findElement(By.xpath("//dl/dt[contains(text(),'Fund Invests In')]/parent::dl/dd/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
            findElement(By.cssSelector("#InvesttargetId_checkbox_1")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.cssSelector("#InvesttargetId_checkbox_1"));
            findElement(By.xpath("//dl/dt[contains(text(),'Fund Invests In')]/parent::dl/dd/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Unable to click 'Fund Invests In' field in Fund Posting";
        }  catch (AssertionError A){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Direct Into Project option is not clicked in 'Fund Invests In' field of Fund Posting";
        }
    }

    public void clickRiskProfileAndSelectCoreOption(){
        try{
            findElement(By.xpath("//dl/dt[contains(text(),'Risk Profile')]/parent::dl/dd/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
            findElement(By.cssSelector("#RiskprofileId_checkbox_1")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.cssSelector("#RiskprofileId_checkbox_1"));
            findElement(By.xpath("//dl/dt[contains(text(),'Risk Profile')]/parent::dl/dd/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Unable to click 'Risk Profile' field in Fund Posting";
        }  catch (AssertionError A){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Core option is not clicked in 'Risk Profile' field of Fund Posting";
        }
    }

    public void clickSaveButtonInAboutThisFund(){
        try{
            WaitUtil.simpleSleep(1000);
            findElement(By.xpath("//form[@id='ProjectEditSectionForm']/div/input[@value='Save']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Unable to click 'Save' button in 'About this Fund' section in Fund Posting";
        }
    }

    public void clickAndVerifyDebtRequirement(){
        try{
            findElement(By.xpath("//a/span/em[text()='Debt Requirement']")).click();
            WaitUtil.simpleSleep(2000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//div[@id='financial-requirement']/div[1]/span[text()='Debt Requirement']"),getDriverProvider().get()));
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Unable to click 'Debt Requirement' in Fund Posting";
        }
    }

    public void enterFinancialDebtRequirementName(){
        try{
            findElement(By.cssSelector("#DebtRequirementTitle")).click();
            WaitUtil.simpleSleep(1000);
        } catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Unable to click lpan option of 'Debt Requirement' in Fund Posting";
        }
    }

    public void selectMezzOptionInDebtRequirement(){
        try{
            findElement(By.xpath("//form[@id='DebtRequirementEditSectionForm']/fieldset/div[2]/span/div[1]/b/i")).click();
            findElement(By.xpath("//form[@id='DebtRequirementEditSectionForm']/fieldset/div[2]/span/div[2]/ul/li[3]")).click();
            findElement(By.xpath("//form[@id='DebtRequirementEditSectionForm']/fieldset/div[2]/span/div[1]/b/i")).click();
            WaitUtil.simpleSleep(1000);
        } catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Unable to click mezz option of 'Debt Requirement' in Fund Posting";
        }
    }

    public void selectLoanOptionInDebtRequirement(){
        try{
            findElement(By.xpath("//form[@id='DebtRequirementEditSectionForm']/fieldset/div[2]/span/div[1]/b/i")).click();
            findElement(By.xpath("//form[@id='DebtRequirementEditSectionForm']/fieldset/div[2]/span/div[2]/ul/li[2]")).click();
            findElement(By.xpath("//form[@id='DebtRequirementEditSectionForm']/fieldset/div[2]/span/div[1]/b/i")).click();
            WaitUtil.simpleSleep(1000);
        } catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Unable to enter name of 'Debt Requirement' in Fund Posting";
        }
    }

    public void clickOnClickHereOfLightHousePosting(){
        try{
            WaitUtil.simpleSleep(1000);
            findElement(By.xpath("//div[@id='post-off-notice']/span/a")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Unable to click here link to ON light house in posting";
        }
    }

    public void clickAndVerifyREAdvisorRequirement(){
        try{
            findElement(By.xpath("//a/span/em[text()='Re Advisor']")).click();
            WaitUtil.simpleSleep(2000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//div[@id='service-requirement']/div[1]/span[text()='Re Advisor Requirement']"),getDriverProvider().get()));
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Unable to click 'RE Advisor Requirement' in Posting";
        }
    }
}
