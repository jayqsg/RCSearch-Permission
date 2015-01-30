package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.Support.ReadData;

public class FundSponsorValidationPage extends FluentWebDriverPage{

    test.Support.ReadData ReadData = new ReadData();

    public FundSponsorValidationPage(WebDriverProvider driverProvider){
        super(driverProvider);
    }

    public void selectTwoStrategyOption(){
         //wait until page load
        WaitUtil.simpleSleep(100);
        findElement(By.id("AssetstrategyId_checkbox_6")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page load
        WaitUtil.simpleSleep(10000);
    }

    public void clearStrategy(){

        //wait until checkbox is found
        WaitUtil.simpleSleep(100);
        findElement(By.id("AssetstrategyId_checkbox_13")).click();
        findElement(By.id("AssetstrategyId_checkbox_6")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void userOfAllSearchOption(int RowIndex){
        try {
            String strFundSponsorUser = ReadData.readDataExcel("DealSponsorDeveloperFund", RowIndex, "FundSponsorOfAllSearchOption");
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'" + strFundSponsorUser + "')]"),getDriverProvider().get()));
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void clearStrategyField(){

        //wait until project field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_64")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }
}
