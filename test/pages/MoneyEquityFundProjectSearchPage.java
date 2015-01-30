package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import test.Support.ReadData;
import test.steps.VerificationStatements;

public class MoneyEquityFundProjectSearchPage extends FluentWebDriverPage{
    ReadData ReadData = new test.Support.ReadData();


    public MoneyEquityFundProjectSearchPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void verifyProjectNameOfEquityFund(String strProjectName){
        //wait util page load
        WaitUtil.simpleSleep(10000);
        WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strProjectName+"')]"),getDriverProvider().get());
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strProjectName+"')]"),getDriverProvider().get()));
    }

    public void clickInvestmentStatus(){
        //wait util page load
        WaitUtil.simpleSleep(500);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div/label[contains(text(),'Investment Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait util page load
        WaitUtil.simpleSleep(10000);
    }

    public void selectGeneralPartner(){
        //wait util page load
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_1")).click();
        //wait util page load
        WaitUtil.simpleSleep(2000);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div/label[contains(text(),'Investment Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait util page load
        WaitUtil.simpleSleep(20000);
    }

    public void clickRouteToInvestor(){
       //wait util page load
       WaitUtil.simpleSleep(500);
       findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div/label[contains(text(),'Route To Investor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectDirectOnly(){
        //wait util page load
        WaitUtil.simpleSleep(500);
        findElement(By.id("RoutetoinvestorId_checkbox_1")).click();
        //wait util page load
        WaitUtil.simpleSleep(2000);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div/label[contains(text(),'Route To Investor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait util page load
        WaitUtil.simpleSleep(20000);
    }

    public void setFundTerm(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/div/div[2]/a[1]"));
        for(int i=0;i<20;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/div/div[2]/a[2]"));
        for(int i=0;i<60;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearFundTerm(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/div/div[2]/a[1]"));
        for(int i=0;i<20;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/div/div[2]/a[2]"));
        for(int i=40;i<100;i++){
            sliderRight.sendKeys(Keys.ARROW_RIGHT);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearRiskProfile_Money(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_1")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("RiskprofileId_checkbox_1"));
        findElement(By.id("RiskprofileId_checkbox_2")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("RiskprofileId_checkbox_2"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }
}
