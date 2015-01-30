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
public class CompaniesOfDeveloperPage extends FluentWebDriverPage {

   ReadData ReadData = new ReadData();

   public CompaniesOfDeveloperPage(WebDriverProvider driverProvider){
        super(driverProvider);
   }

   public void clickSolar(){
        //wait until project drop down appears
       WaitUtil.simpleSleep(500);
       findElement(By.id("AssettypeId_checkbox_16")).click();
       VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.id("AssettypeId_checkbox_16"));
       findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until project drop down appears
       WaitUtil.simpleSleep(20000);
   }

    public void clearSolar(){
        //wait until project drop down appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_16")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("AssettypeId_checkbox_16"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until project drop down appears
        WaitUtil.simpleSleep(1000);
    }

   public void clickSales(){
         //wait until strategy field appears
       WaitUtil.simpleSleep(500);
       findElement(By.id("AssetstrategyId_checkbox_3")).click();
       VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssetstrategyId_checkbox_3"));
       findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page uploads
       WaitUtil.simpleSleep(20000);
   }

   public void clearSales(){
        //wait until strategy field appears
       WaitUtil.simpleSleep(500);
       findElement(By.id("AssetstrategyId_checkbox_3")).click();
       VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("AssetstrategyId_checkbox_3"));
       findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
   }

   public void clickOpportunistic(){
        //wait until strategy field appears
       WaitUtil.simpleSleep(500);
       findElement(By.id("RiskprofileId_checkbox_5")).click();
       VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_5"));
       findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
       //wait until page load
       WaitUtil.simpleSleep(20000);
   }

   public void clearOpportunistic(){
        //wait until strategy field appears
       WaitUtil.simpleSleep(500);
       findElement(By.id("RiskprofileId_checkbox_5")).click();
       VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_5"));
       findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
   }

   public void clickFamilyOffice(){
        //wait until page is loaded
       WaitUtil.simpleSleep(500);
       findElement(By.id("InvestortypeId_checkbox_11")).click();
       VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_11"));
       findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
   }

   public void clearFamilyOffice(){
        //wait until page is loaded
       WaitUtil.simpleSleep(500);
       findElement(By.id("InvestortypeId_checkbox_11")).click();
       VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_5"));
       findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
   }

   public void clickPlacementAgents(){
       //wait until page is loaded
       WaitUtil.simpleSleep(500);
       findElement(By.id("RouteId_checkbox_4")).click();
       VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("RouteId_checkbox_4"));
       findElement(By.xpath("//div[@class='field clearfix']/label[contains(text(),'Route to Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
       //wait until page is loaded
       WaitUtil.simpleSleep(20000);
   }

   public void clearPlacementAgents(){
        //wait until page is loaded
       WaitUtil.simpleSleep(500);
       findElement(By.id("RouteId_checkbox_4")).click();
       VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("RouteId_checkbox_4"));
       findElement(By.xpath("//div[@class='field clearfix']/label[contains(text(),'Route to Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
   }

   public void developerCompanyName(int intRowIndex) throws Exception {
        //wait until page gets loaded
       WaitUtil.simpleSleep(500);
       String lStrDeveloperCompanyName = ReadData.readDataExcel("CompaniesOfDealDeveloperFund", intRowIndex, "VerifyDeveloperCompanyName");
       Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+lStrDeveloperCompanyName+"')]"), getDriverProvider().get()));
   }

   public void selectCoInvests(){
       //wait until page gets loaded
       WaitUtil.simpleSleep(500);
       findElement(By.id("coinvestpartners_")).click();
       VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("coinvestpartners_"));
       //wait until page gets loaded
       WaitUtil.simpleSleep(10000);
   }

    public void clearCoInvests(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("coinvestpartners_")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("coinvestpartners_"));
        //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }
}

