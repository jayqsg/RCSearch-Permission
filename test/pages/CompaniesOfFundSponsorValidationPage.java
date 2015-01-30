package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.Support.ReadData;
import test.steps.VerificationStatements;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Bhavana
 * Date: 6/23/14
 * Time: 12:01 PM
 * To change this template use File | Settings | File Templates.
 */

public class CompaniesOfFundSponsorValidationPage extends FluentWebDriverPage{

    test.Support.ReadData ReadData = new ReadData();

    public CompaniesOfFundSponsorValidationPage(WebDriverProvider driverProvider){
        super(driverProvider);
    }

    public void companyOfFundSponsorIsDisplayed(int intRowIndex,String strColumnName) throws Exception {
        String strFundCompany = ReadData.readDataExcel("ValidationDetails", intRowIndex, strColumnName);
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strFundCompany+"')]"), getDriverProvider().get()));
         //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
    }

    public void companyOfFundSponsorNotDisplayed(int intRowIndex, String strColumnName) throws Exception {
        //wait util page load
        WaitUtil.simpleSleep(10000);
        String strOtherUser = ReadData.readDataExcel("ValidationDetails", intRowIndex, strColumnName);
        Assert.assertFalse(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'" + strOtherUser + "')]"), getDriverProvider().get()));
    }


    public void verifyCompanyNameIsDisplayed(String strCompanyName){
         //wait util page load
        WaitUtil.simpleSleep(100);
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strCompanyName+"')]"), getDriverProvider().get()));
         //wait util page load
        WaitUtil.simpleSleep(1000);
    }

    public void verifyCompanyNameIsNotDisplayed(String strCompanyName){
         //wait util page load
        WaitUtil.simpleSleep(100);
        Assert.assertFalse(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strCompanyName+"')]"), getDriverProvider().get()));
    }

    public void selectSecondOption(){
         //wait until page load
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_3")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.id("RouteId_checkbox_3"));
        findElement(By.xpath("//div[@class='field clearfix']/label[contains(text(),'Route to Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public boolean companyOfFundSponsorIsNotDisplayed(int RowIndex){
        boolean status = true;
        try{
            List<WebElement> links;
             //wait until page gets loaded
            WaitUtil.simpleSleep(5000);
            links =  findElements(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span"));
            int linksCount = links.size();
            linksCount = linksCount/2;
            for(int i=1;i<=linksCount;i++){
                String strOtherUser = ReadData.readDataExcel("CompaniesOfDealDeveloperFund", RowIndex, "VerifyFundSponsorCompanyName");
                 //wait until page gets loaded
                WaitUtil.simpleSleep(1000);
                String strName = findElement(By.xpath("//tbody[@id='searchResults']/tr["+i+"]/td/a/strong/span")).getText();
                if(strName.equals(strOtherUser))
                {
                    status = false;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public void fundSponsorOfAllSearch(int intRowIndex) throws Exception {
         //wait until page loads
        WaitUtil.simpleSleep(1000);
        String strAllCompanyName = ReadData.readDataExcel("CompaniesOfDealDeveloperFund", intRowIndex, "FundSponsorOfAllSearch");
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAllCompanyName+"')]"), getDriverProvider().get()));
    }

    public void selectHealthAndHotel(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_5")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.id("AssettypeId_checkbox_5"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearHealthAndHotel(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_13")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("AssettypeId_checkbox_13"));
        findElement(By.id("AssettypeId_checkbox_5")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("AssettypeId_checkbox_13"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectValueAddAndCorePlus(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_2")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.id("RiskprofileId_checkbox_2"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearValueAddAndCorePlus(){
         //wait until page load
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_3")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("RiskprofileId_checkbox_3"));
        findElement(By.id("RiskprofileId_checkbox_2")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("RiskprofileId_checkbox_2"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearLandBankAndLeaseUp(){
         //wait until page load
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_13")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("AssetstrategyId_checkbox_13"));
        findElement(By.id("AssetstrategyId_checkbox_6")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("AssetstrategyId_checkbox_6"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearRouteInFundSponsor(){
        //wait until page load
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_3")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("RouteId_checkbox_3"));
        findElement(By.id("RouteId_checkbox_2")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("RouteId_checkbox_2"));
        findElement(By.xpath("//div[@class='field clearfix']/label[contains(text(),'Route to Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }
}
