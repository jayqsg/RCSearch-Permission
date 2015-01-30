package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.Support.ReadData;

public class DeveloperDealAndFundSponsorPage extends FluentWebDriverPage{

    ReadData ReadData = new ReadData();

    public DeveloperDealAndFundSponsorPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void verifyFindSearch(int RowIndex){
        try{
            String strFindText = ReadData.readDataExcel("DealSponsorDeveloperFund", RowIndex, "VerifyFindSearch");
            String strText = findElement(By.xpath("//div[@id='searchFilters']/div[1]/span[1]/strong")).getText();
            Assert.assertTrue(strFindText,strText.contains(strFindText));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void verifySubRoleSearch(int RowIndex){
        try{
            String strSubRoleText = ReadData.readDataExcel("DealSponsorDeveloperFund", RowIndex, "VerifySubRoleSearch");
            String strText = findElement(By.xpath("//div[@id='searchFilters']/div[1]/span[2]/strong")).getText();
            Assert.assertTrue(strSubRoleText,strText.contains(strSubRoleText));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void verifyDeveloperNameInSearch(int RowIndex){
        try{
            String strDeveloperName = ReadData.readDataExcel("DealSponsorDeveloperFund", RowIndex, "VerifyDeveloperName");
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDeveloperName+"')]"), getDriverProvider().get()));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}