package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.Support.ReadData;
import java.util.List;

public class DealSponsorValidationPage extends FluentWebDriverPage{

    ReadData ReadData = new ReadData();

    public DealSponsorValidationPage(WebDriverProvider driverProvider){
        super(driverProvider);
    }

    public void verifyUser(int RowIndex,String strColumnName){
        String strUser = null;
        try {
            strUser = ReadData.readDataExcel("ValidationDetails", RowIndex, strColumnName);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'" + strUser + "')]"), getDriverProvider().get()));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void otherUsers(int RowIndex, String strColumnName){
        try {
            WaitUtil.simpleSleep(10000);
            String strOtherUser = ReadData.readDataExcel("ValidationDetails", RowIndex, strColumnName);
            Assert.assertFalse(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'" + strOtherUser + "')]"), getDriverProvider().get()));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void userOfAllSearchOption(int RowIndex) {
        try {
            String strDealSponsorUser = ReadData.readDataExcel("DealSponsorDeveloperFund", RowIndex, "UserOfAllSearchOption");
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDealSponsorUser+"')]"),getDriverProvider().get()));
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void selectSecondStrategy(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_6")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(15000);
    }

    public void clearStrategy(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstrategyId_checkbox_1")).click();
        findElement(By.id("AssetstrategyId_checkbox_6")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clickSaleLeaseback(){
          //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_3")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clickStableIncomeProducing(){
         //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstrategyId_checkbox_3")).click();
        findElement(By.id("AssetstrategyId_checkbox_5")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clickQuickFlip(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_5")).click();
        findElement(By.id("AssetstrategyId_checkbox_7")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clickRestructuring(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_7")).click();
        findElement(By.id("AssetstrategyId_checkbox_9")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clickRecapitalization(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_9")).click();
        findElement(By.id("AssetstrategyId_checkbox_11")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void clickLandBank(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_11")).click();
        findElement(By.id("AssetstrategyId_checkbox_13")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void clickChangeOfUse(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_13")).click();
        findElement(By.id("AssetstrategyId_checkbox_15")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void clickDevelopment(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_15")).click();
        findElement(By.id("AssetstrategyId_checkbox_17")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void clickPlatformBuild(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_17")).click();
        findElement(By.id("AssetstrategyId_checkbox_2")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void clickPursuit(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.id("AssetstrategyId_checkbox_2")).click();
        findElement(By.id("AssetstrategyId_checkbox_4")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void clickLeaseUp(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.id("AssetstrategyId_checkbox_4")).click();
        findElement(By.id("AssetstrategyId_checkbox_6")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void clickWorkOut(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.id("AssetstrategyId_checkbox_6")).click();
        findElement(By.id("AssetstrategyId_checkbox_8")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void clickRestructuringCorporate(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_8")).click();
        findElement(By.id("AssetstrategyId_checkbox_10")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void clickPublicToPrivate(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_10")).click();
        findElement(By.id("AssetstrategyId_checkbox_12")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clickRezoning(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_12")).click();
        findElement(By.id("AssetstrategyId_checkbox_14")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clickRenovation(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_14")).click();
        findElement(By.id("AssetstrategyId_checkbox_16")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clickForwardCommitment(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_16")).click();
        findElement(By.id("AssetstrategyId_checkbox_18")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clickOther(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_19")).click();
        findElement(By.id("AssetstrategyId_checkbox_18")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        executeScript("scrollTo(0,900)");
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clickAllOptionOfAssetStrategy(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_19")).click();
        findElement(By.id("AssetstrategyId_checkbox_-1")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        executeScript("scrollTo(0,900)");
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearAllOptionOfAssetStrategy(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_-1")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }
}
