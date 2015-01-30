package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.Support.ReadData;
import java.util.List;

public class DeveloperSearchValidationPage extends FluentWebDriverPage {

    ReadData ReadData = new ReadData();

    public DeveloperSearchValidationPage(WebDriverProvider driverProvider){
        super(driverProvider);
    }

    public void selectStrategyType(){

        //wait until checkbox is found
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_6")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearStrategy(){

        //wait until strategy dropdown field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_3")).click();
        findElement(By.id("AssetstrategyId_checkbox_6")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickBuyLand(){

        //wait until checkbox is found
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_33")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void userOfAllSearchOption(int RowIndex) throws Exception {
        String lStrAllSearchUser = ReadData.readDataExcel("DealSponsorDeveloperFund", RowIndex, "DeveloperOfAllSearchOption");
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+lStrAllSearchUser+"')]"),getDriverProvider().get()));
    }

    public void clearStrategyField(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_64")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }
}
