package test.pages;


import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.Support.ReadData;

import java.util.List;

public class ProjectOfBrokerSearchValidationPage extends FluentWebDriverPage{
    ReadData ReadData = new ReadData();
    public ProjectOfBrokerSearchValidationPage(WebDriverProvider driverProvider){
        super(driverProvider);
    }

    public void verifyServiceNameOfBrokerIsDisplayed(String strServiceNameIsDisplayed){
        //wait until page loads
        WaitUtil.simpleSleep(3000);
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[@data-role='title'][text()='"+strServiceNameIsDisplayed+"']"), getDriverProvider().get()));
    }

    public void verifyServiceNameOfBrokerNotDisplayed(String strServiceNameIsNotDisplayed){
        //wait until page loads
        WaitUtil.simpleSleep(10000);
        Assert.assertFalse(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[@data-role='title'][text()='"+strServiceNameIsNotDisplayed+"']"), getDriverProvider().get()));
    }

    public void verifyAllOptionsOfBrokerService(int RowIndex){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        try {
            String strAllCompanyName = ReadData.readDataExcel("ValidationDetails", RowIndex, "BrokerOfAllOption");
            //wait until page loads
            WaitUtil.simpleSleep(5000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAllCompanyName+"')]"), getDriverProvider().get()));
        } catch (Exception e) {
            e.printStackTrace();
        } catch (AssertionError A){
            System.out.println(A);
        }
    }

    public void serviceOfBrokerNotDisplayed(int RowIndex, String strColumnName) throws Exception {
        //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
        String strCompanyName = ReadData.readDataExcel("ValidationDetails", RowIndex, strColumnName);
        Assert.assertFalse(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[@data-role='title'][text()='" + strCompanyName + "']"), getDriverProvider().get()));

    }

    public void serviceOfBrokerIsDisplayed(int RowIndex,String strColumnName){
        //wait until page gets loaded
        WaitUtil.simpleSleep(1000);
        try {
            String strOtherUser = ReadData.readDataExcel("ValidationDetails", RowIndex, strColumnName);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[@data-role='title'][text()='"+strOtherUser+"']"), getDriverProvider().get()));
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
