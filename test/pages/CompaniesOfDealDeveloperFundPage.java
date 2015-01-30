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

public class CompaniesOfDealDeveloperFundPage extends FluentWebDriverPage {
    ReadData ReadData = new ReadData();
    public CompaniesOfDealDeveloperFundPage(WebDriverProvider driverProvider){
        super(driverProvider);
    }

    public void verifyDealSponsorCompanyName(int intRowIndex) throws Exception {
        String strDealSponsorCompanyName = ReadData.readDataExcel("CompaniesOfDealDeveloperFund", intRowIndex, "VerifyDealCompanyName");
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'" + strDealSponsorCompanyName + "')]"),getDriverProvider().get()));
    }

    public void clickDealSponsorCompany(int intRowIndex) throws Exception {
        String strClickCompanyName = ReadData.readDataExcel("CompaniesOfDealDeveloperFund", intRowIndex, "VerifyDealCompanyName");
        findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strClickCompanyName+"')]")).click();
    }

    public void clickDeveloperCompanyName(int intRowIndex) throws Exception {
        String strClickDeveloperCompanyName = ReadData.readDataExcel("CompaniesOfDealDeveloperFund", intRowIndex, "VerifyDeveloperCompanyName");
        findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strClickDeveloperCompanyName+"')]")).click();
    }

    public void verifyFundSponsorCompanyName(int intRowIndex) throws Exception {
        String strFundSponsorCompanyName = ReadData.readDataExcel("CompaniesOfDealDeveloperFund", intRowIndex, "VerifyFundSponsorCompanyName");
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strFundSponsorCompanyName+"')]"),getDriverProvider().get()));
    }

    public void clickFundSponsorCompanyName(int intRowIndex) throws Exception {
        String strFundSponsorCompanyName = ReadData.readDataExcel("CompaniesOfDealDeveloperFund", intRowIndex, "VerifyFundSponsorCompanyName");
        findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strFundSponsorCompanyName+"')]")).click();
    }
}
