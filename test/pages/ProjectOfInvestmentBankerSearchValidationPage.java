package test.pages;


import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.Support.ReadData;

import java.util.List;

public class ProjectOfInvestmentBankerSearchValidationPage extends FluentWebDriverPage {
    ReadData ReadData = new ReadData();
    public ProjectOfInvestmentBankerSearchValidationPage(WebDriverProvider driverProvider){
        super(driverProvider);
    }

    public void verifyServiceNameOfInvestmentBankerIsDisplayed(String strServiceNameIsDisplayed){
        //wait until page loads
        WaitUtil.simpleSleep(3000);
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'" + strServiceNameIsDisplayed + "')]"), getDriverProvider().get()));
    }

    public void verifyServiceNameOfInvestmentBankerNotDisplayed(String strServiceNameIsNotDisplayed){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        Assert.assertFalse(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strServiceNameIsNotDisplayed+"')]"), getDriverProvider().get()));
    }

    public void verifyAllOptionsOfInvestmentBankerService(int RowIndex){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        try {
            String strAllServiceName = ReadData.readDataExcel("ValidationDetails", RowIndex, "InvestmentBankerOfAllOption");
            //wait until page loads
            WaitUtil.simpleSleep(5000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAllServiceName+"')]"), getDriverProvider().get()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void serviceOfInvestmentBankerNotDisplayed(int RowIndex, String strColumnName) throws Exception {
        //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
        String strCompanyName = ReadData.readDataExcel("ValidationDetails", RowIndex, strColumnName);
        Assert.assertFalse(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strCompanyName+"')]"),getDriverProvider().get()));
    }

    public void serviceOfInvestmentBankerIsDisplayed(int RowIndex,String strColumnName){
        //wait until page gets loaded
        WaitUtil.simpleSleep(1000);
        try {
            String strOtherUser = ReadData.readDataExcel("ValidationDetails", RowIndex, strColumnName);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strOtherUser+"')]"), getDriverProvider().get()));
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

}
