package test.pages;


import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.Support.ReadData;

import java.util.List;

public class CompanyOfBrokerValidationPage extends FluentWebDriverPage {
    ReadData ReadData = new ReadData();
    public CompanyOfBrokerValidationPage(WebDriverProvider driverProvider){
        super(driverProvider);
    }

    public void verifyCompanyNameOfBrokerIsDisplayed(String strServiceName){
        //wait until page loads
        WaitUtil.simpleSleep(3000);
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strServiceName+"')]"), getDriverProvider().get()));
    }

    public void verifyCompanyNameOfBrokerNotDisplayed(String strServiceNameNotDisplayed){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        Assert.assertFalse(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strServiceNameNotDisplayed+"')]"), getDriverProvider().get()));
        WaitUtil.simpleSleep(5000);
    }

    public void verifyAllOptionsOfBrokerCompany(int RowIndex){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        try {
            String strAllCompanyName = ReadData.readDataExcel("ValidationDetails", RowIndex, "BrokerOfAllOption");
            //wait until page loads
            WaitUtil.simpleSleep(5000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'" + strAllCompanyName + "')]"), getDriverProvider().get()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void companyOfBrokerNotDisplayed(int RowIndex, String strColumnName) {
        try {
            WaitUtil.simpleSleep(5000);
            String strOtherUser = ReadData.readDataExcel("ValidationDetails", RowIndex, strColumnName);
            Assert.assertFalse(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strOtherUser+"')]"),getDriverProvider().get()));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void companyOfBrokerIsDisplayed(int RowIndex,String strColumnName){
        try {
            String strOtherUser = ReadData.readDataExcel("ValidationDetails", RowIndex, strColumnName);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strOtherUser+"')]"), getDriverProvider().get()));
        }
        catch (Exception e) {
            System.out.println(e);
        }
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
    }

    public void selectSolarAndMultifamily(){
        //wait until drop down appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_3")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Asset Experience:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearSolarAndMultifamily(){
        //wait until drop down appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_16")).click();
        findElement(By.id("AssettypeId_checkbox_3")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Asset Experience:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectInDdAndOwnedOption(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_1")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearInDdAndOwnedOption(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_1")).click();
        findElement(By.id("DealstageId_checkbox_10")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

}
