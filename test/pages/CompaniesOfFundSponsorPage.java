package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.Support.ReadData;
import test.steps.VerificationStatements;

/**
 * Created with IntelliJ IDEA.
 * User: Bhavana
 * Date: 6/23/14
 * Time: 12:01 PM
 * To change this template use File | Settings | File Templates.
 */

public class CompaniesOfFundSponsorPage extends FluentWebDriverPage {
    ReadData ReadData = new ReadData();
    public CompaniesOfFundSponsorPage(WebDriverProvider driverProvider){
        super(driverProvider);
    }

    public void verifyFundSponsorCompany(int intRowIndex) throws Exception {
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        String strFundSponsorCompany = ReadData.readDataExcel("CompaniesOfDealDeveloperFund", intRowIndex, "VerifyFundSponsorCompanyName");
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strFundSponsorCompany+"')]"), getDriverProvider().get()));
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectHealthCare(){
         //wait until page load
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_13")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_13"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Asset Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until project type drop down appears
        WaitUtil.simpleSleep(10000);
    }

    public void clearHealthCare(){
         //wait until page load
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_13")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_13"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Asset Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectPortfolioAcquisitions(){
         //wait until page load
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_13")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_13"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearPortfolioAcquisitions(){
         //wait until page load
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_13")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssetstrategyId_checkbox_13"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectValueAdd(){
        //wait until page load
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_3")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_3"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page load
        WaitUtil.simpleSleep(10000);
    }

    public void clearValueAdd(){
         //wait until page load
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_3")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_3"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        WaitUtil.simpleSleep(10000);
    }

    public void clickAboutField(){
         //wait until about field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("ui-accordion-1-header-1")).click();
    }

    public void selectIntermediaryOption(){
         //wait until page load
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_2")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("RouteId_checkbox_2"));
        findElement(By.xpath("//div[@class='field clearfix']/label[contains(text(),'Route to Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page load
        WaitUtil.simpleSleep(10000);
    }

    public void clearIntermediaryOption(){
         //wait until page load
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_2")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("RouteId_checkbox_2"));
        findElement(By.xpath("//div[@class='field clearfix']/label[contains(text(),'Route to Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page load
        WaitUtil.simpleSleep(1000);
    }
}
