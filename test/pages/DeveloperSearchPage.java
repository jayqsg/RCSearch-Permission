package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import test.Support.ReadData;

public class DeveloperSearchPage extends FluentWebDriverPage {

    ReadData ReadData = new ReadData();

    public DeveloperSearchPage(WebDriverProvider driverProvider){
        super(driverProvider);
    }

    public String verifySearchOption(){
        String strNameOfSubRole = findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/span[@class='opt']/strong")).getText();
        return strNameOfSubRole;
    }

    public void verifyDeveloperName(int RowIndex){
        try{
            executeScript("scrollTo(250,0)");
            String strDeveloperName = ReadData.readDataExcel("DealSponsorDeveloperFund", RowIndex, "VerifyDeveloperName");
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDeveloperName+"')]"), getDriverProvider().get()));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void verifyDeveloperNameIsDisplayed(int RowIndex){
        try{
            executeScript("scrollTo(250,0)");
            String strDeveloperName = ReadData.readDataExcel("DealSponsorDeveloperFund", RowIndex, "VerifyDeveloperName");
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDeveloperName+"')]"), getDriverProvider().get()));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void clickOnDeveloperName(int RowIndex){
        try{
            WaitUtil.simpleSleep(1000);
            String strDeveloperName = ReadData.readDataExcel("DealSponsorDeveloperFund", RowIndex, "VerifyDeveloperName");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDeveloperName+"')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void searchedDeveloperCompany(int RowIndex){

        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        try{
            String strDeveloperCompanyName = ReadData.readDataExcel("CompaniesOfDealDeveloperFund", RowIndex, "VerifyDeveloperCompanyName");
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDeveloperCompanyName+"')]"), getDriverProvider().get()));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void clickOnDeveloperCompany(int RowIndex){
        try{
            String strDeveloperCompanyName = ReadData.readDataExcel("CompaniesOfDealDeveloperFund", RowIndex, "VerifyDeveloperCompanyName");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+strDeveloperCompanyName+"')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void selectStrategy(){
        //wait until checkbox is found
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstrategyId_checkbox_3")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until checkbox is found
        WaitUtil.simpleSleep(10000);
    }

    public void clearStrategy(){
        //wait until strategy dropdown field appears
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstrategyId_checkbox_3")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        WaitUtil.simpleSleep(10000);
    }

    public void clickMidWest(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Regions:')]/parent::div/div/multi-selectbox/div/div/div[@class='row']/div/div/div[@class='col-md-9']/label[contains(text(),'Midwest')]")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Regions:')]/parent::div/div/multi-selectbox/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickWestVirginiaState(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        JavascriptExecutor jse = (JavascriptExecutor)getDriverProvider().get();
        jse.executeScript("window.scrollBy(0,500)", "");
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Select States:')]/parent::div/div/multi-selectbox/div/div/div/div/div/div[@class='col-md-9']/label[contains(text(),'West Virginia')]")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Select States:')]/parent::div/div/multi-selectbox/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void enterAndSelectHaloCity(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        executeScript("scrollBy(250,0)");
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Cities:')]/parent::div/div/multi-selectbox/div/div/div/input")).sendKeys("Halo");
        WaitUtil.simpleSleep(10000);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Cities:')]/parent::div/div/multi-selectbox/div/div/div/div/div/div[@class='col-md-9']/label[contains(text(),'Halo (West Virginia)')]")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Cities:')]/parent::div/div/multi-selectbox/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

}
