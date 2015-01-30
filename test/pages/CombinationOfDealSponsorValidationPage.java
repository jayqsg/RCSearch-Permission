package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.Support.ReadData;

/**
 * Created with IntelliJ IDEA.
 * User: Bhavana
 * Date: 6/23/14
 * Time: 11:58 AM
 * To change this template use File | Settings | File Templates.
 */

public class CombinationOfDealSponsorValidationPage extends FluentWebDriverPage {

    ReadData ReadData = new ReadData();

    public CombinationOfDealSponsorValidationPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void verifyCompanyNameIsDisplayed(String strCompanyName){
        try{
         //wait util page load
        WaitUtil.simpleSleep(100);
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strCompanyName+"')]"), getDriverProvider().get()));
         //wait util page load
        WaitUtil.simpleSleep(1000);
        } catch (AssertionError A){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Camp co company name is not displayed in the search result\n";
        }
    }

    public void verifyCompanyNameIsNotDisplayed(String strCompanyName){
         //wait util page load
        WaitUtil.simpleSleep(6000);
       Assert.assertFalse(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strCompanyName+"')]"), getDriverProvider().get()));
    }
}
