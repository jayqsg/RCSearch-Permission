package test.pages;


import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import test.Support.ReadData;
import test.steps.VerificationStatements;

import java.util.List;

public class CompanyOfBrokerPage extends FluentWebDriverPage {
    ReadData ReadData = new ReadData();
    public CompanyOfBrokerPage(WebDriverProvider driverProvider){
        super(driverProvider);
    }

    public void verifySubRoleOfBroker(){
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//div[@id='searchFilters']/div[1]/span[contains(text(),'Subrole: ')]/strong[contains(text(),'Brokers & Agencies')]"),getDriverProvider().get()));
    }

    public void verifyStrategy(){
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//div[@id='searchFilters']/div[1]/span[contains(text(),'Strategy:')]/strong[contains(text(),'Acquisitions')]"),getDriverProvider().get()));
    }

    public void verifyOffPlanSalesIsDisplayedInStrategy(){
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//div[@id='searchFilters']/div[1]/span[contains(text(),'Strategy:')]/strong[contains(text(),'Off Plan Sales')]"),getDriverProvider().get()));
    }

    public void clickOnBrokerCompanyName(int RowIndex){
        try{
            String strBrokerCompany = ReadData.readDataExcel("RealEstateDetails", RowIndex, "BrokerCompanyName");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strBrokerCompany+"')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void clickOnServiceOfBroker(int RowIndex){
        try{
            String strBrokerService = ReadData.readDataExcel("RealEstateDetails", RowIndex, "VerifyProject");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/img[@alt='Service']/parent::a/strong[contains(text(),'"+strBrokerService+"')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void verifyBrokerCompany(int RowIndex){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        try{
            String strBrokerCompanyName = ReadData.readDataExcel("RealEstateDetails", RowIndex, "BrokerCompanyName");
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strBrokerCompanyName+"')]"), getDriverProvider().get()));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void selectSolarOption(){
        //wait until asset experience drop down appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_16")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_16"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Asset Experience:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clearSolarOption(){
        //wait until asset experience drop down appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_16")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_16"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Asset Experience:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void selectInDdOption() {

        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_10")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("DealstageId_checkbox_10"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clearInDdOption() {

        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_10")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("DealstageId_checkbox_10"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickWest(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Regions:')]/parent::div/div/multi-selectbox/div/div/div[@class='row']/div/div/div[@class='col-md-9']/label[contains(text(),'West')]")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Regions:')]/parent::div/div/multi-selectbox/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickCaliforniaState(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Select States:')]/parent::div/div/multi-selectbox/div/div/div/div/div/div[@class='col-md-9']/label[contains(text(),'California')]")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Select States:')]/parent::div/div/multi-selectbox/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void enterAndSelectNapaCity(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Cities:')]/parent::div/div/multi-selectbox/div/div/div/input")).sendKeys("Napa");
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Cities:')]/parent::div/div/multi-selectbox/div/div/div/div/div/div[@class='col-md-9']/label[contains(text(),'Napa (California)')]")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Cities:')]/parent::div/div/multi-selectbox/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

}
