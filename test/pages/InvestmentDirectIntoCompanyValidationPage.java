package test.pages;


import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import test.Support.ReadData;
import test.steps.VerificationStatements;

import java.util.List;

public class InvestmentDirectIntoCompanyValidationPage extends FluentWebDriverPage {
    ReadData ReadData = new ReadData();

    public InvestmentDirectIntoCompanyValidationPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void verifyCompanyNameOfInvestmentsIsDisplayed(String strCompanyName){
        //wait until page loads
        WaitUtil.simpleSleep(3000);
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strCompanyName+"')]"), getDriverProvider().get()));
    }

    public void verifyCompanyNameOfInvestmentsNotDisplayed(String strCompanyName){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        Assert.assertFalse(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strCompanyName+"')]"), getDriverProvider().get()));
    }

    public void companyOfInvestmentsNotDisplayed(int RowIndex, String strColumnName){
        try {
            WaitUtil.simpleSleep(10000);
            String strCompanyName = ReadData.readDataExcel("Investments", RowIndex, strColumnName);
            Assert.assertFalse(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'" + strCompanyName + "')]"), getDriverProvider().get()));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void companyOfInvestmentsIsDisplayed(int RowIndex,String strColumnName){
        //wait until page gets loaded
        WaitUtil.simpleSleep(1000);
        try {
            String strOtherUser = ReadData.readDataExcel("Investments", RowIndex, strColumnName);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strOtherUser+"')]"), getDriverProvider().get()));
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    public void selectAdvisorAndFamilyOffice(){
        WaitUtil.isElementPresent(By.id("InvestortypeId_checkbox_15"),getDriverProvider().get());
        findElement(By.id("InvestortypeId_checkbox_15")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearAdvisorAndFamilyOffice(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
        findElement(By.id("InvestortypeId_checkbox_15")).click();
        findElement(By.id("InvestortypeId_checkbox_7")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectDirectOnlyAndBrokers(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
        findElement(By.id("RouteId_checkbox_3")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Route To Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearDirectOnlyAndBrokers(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
        findElement(By.id("RouteId_checkbox_1")).click();
        findElement(By.id("RouteId_checkbox_3")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Route To Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectOfficeAndMixedUse(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_12")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearOfficeAndMixedUse(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
        findElement(By.id("AssettypeId_checkbox_1")).click();
        findElement(By.id("AssettypeId_checkbox_12")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectCorePlus(){

        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_2")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clearCorePlus(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_2")).click();
        //findElement(By.id("RiskprofileId_checkbox_1")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(20000);
    }

    public void selectOwnedAndReadyForPurchase(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_7")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearOwnedAndReadyForPurchase(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
        findElement(By.id("DealstageId_checkbox_1")).click();
        findElement(By.id("DealstageId_checkbox_7")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

    }

    public void selectAcquisitionAndSales(){
        //wait until deal stage field appears
        WaitUtil.simpleSleep(5000);
        findElement(By.id("AssetstrategyId_checkbox_3")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until profile appears
        WaitUtil.simpleSleep(10000);
    }

    public void clearAcquisitionAndSales(){
        //wait until deal stage field appears
        WaitUtil.simpleSleep(5000);
        findElement(By.id("AssetstrategyId_checkbox_1")).click();
        findElement(By.id("AssetstrategyId_checkbox_3")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until profile appears
        WaitUtil.simpleSleep(10000);
    }

    public void selectIntermediary(){
        //wait until deal stage field appears
        WaitUtil.simpleSleep(5000);
        findElement(By.id("RouteId_checkbox_2")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Route To Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until profile appears
        WaitUtil.simpleSleep(10000);
    }

    public void selectPlacementAgent(){
        //wait until deal stage field appears
        WaitUtil.simpleSleep(5000);
        findElement(By.id("RouteId_checkbox_2")).click();
        findElement(By.id("RouteId_checkbox_4")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Route To Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until profile appears
        WaitUtil.simpleSleep(10000);
    }

    public void selectAllOptionOfRouteToSponsor(){

        //wait until deal stage field appears
        WaitUtil.simpleSleep(5000);
        findElement(By.id("RouteId_checkbox_4")).click();
        findElement(By.id("RouteId_checkbox_-1")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Route To Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until profile appears
        WaitUtil.simpleSleep(10000);
    }

    public void clearAllOptionOfRouteToSponsor(){
        //wait until deal stage field appears
        WaitUtil.simpleSleep(5000);
        findElement(By.id("RouteId_checkbox_-1")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Route To Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until profile appears
        WaitUtil.simpleSleep(10000);
    }

    public void clickConcept(){
        //wait until profile appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_3")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("DealstageId_checkbox_3"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until profile appears
        WaitUtil.simpleSleep(10000);
    }

    public void clickPermitted(){
        //wait until profile appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_3")).click();
        findElement(By.id("DealstageId_checkbox_5")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until profile appears
        WaitUtil.simpleSleep(10000);
    }

    public void clickReady(){
        //wait until profile appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_5")).click();
        findElement(By.id("DealstageId_checkbox_7")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until profile appears
        WaitUtil.simpleSleep(10000);
    }

    public void clickLOI(){
        //wait until profile appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_7")).click();
        findElement(By.id("DealstageId_checkbox_9")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until profile appears
        WaitUtil.simpleSleep(10000);
    }

    public void clickUnderContract(){
        //wait until profile appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_9")).click();
        findElement(By.id("DealstageId_checkbox_2")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until profile appears
        WaitUtil.simpleSleep(10000);
    }

    public void clickPlans(){
        //wait until profile appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_2")).click();
        findElement(By.id("DealstageId_checkbox_4")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until profile appears
        WaitUtil.simpleSleep(10000);
    }

    public void clickUnderConstruction(){
        //wait until profile appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_4")).click();
        findElement(By.id("DealstageId_checkbox_6")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until profile appears
        WaitUtil.simpleSleep(10000);
    }

    public void clickPursuit(){
        //wait until profile appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_6")).click();
        findElement(By.id("DealstageId_checkbox_8")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until profile appears
        WaitUtil.simpleSleep(10000);
    }

    public void clickInDD(){
        //wait until profile appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_8")).click();
        findElement(By.id("DealstageId_checkbox_10")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until profile appears
        WaitUtil.simpleSleep(10000);
    }

    public void selectAll(){
        //wait until profile appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_10")).click();
        findElement(By.id("DealstageId_checkbox_-1")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until profile appears
        WaitUtil.simpleSleep(10000);
    }

    public void clearAll(){
        //wait until profile appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_-1")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until profile appears
        WaitUtil.simpleSleep(10000);
    }

    public void selectValueOfDealSize(){
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }

        //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clearValueOfDealSize(){
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }

        //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }





}

