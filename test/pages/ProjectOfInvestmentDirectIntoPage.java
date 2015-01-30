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


public class ProjectOfInvestmentDirectIntoPage extends FluentWebDriverPage {

    public ProjectOfInvestmentDirectIntoPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public String verifyFindInSearchOption(){
        String strFind = findElement(By.cssSelector("span.opt > strong")).getText();
        return strFind;
    }

    public void verifyKindInSearchOption(int RowIndex){
        try {
            String strKindName = ReadData.readDataExcel("Investments", RowIndex, "KindInSearchOption");
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//div[@id='searchFilters']/div/span/strong[contains(text(),'"+strKindName+"')]"),getDriverProvider().get()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyRiskInSearchOption(int RowIndex){
        try {
            String strRiskName = ReadData.readDataExcel("Investments", RowIndex, "RiskInSearchOption");
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//div[@id='searchFilters']/div/span/strong[contains(text(),'"+strRiskName+"')]"),getDriverProvider().get()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickCompanyOfBanker(int RowIndex){
        try {
            //wait until all companies appears
            WaitUtil.simpleSleep(500);
            String strCompanyName = ReadData.readDataExcel("Investments", RowIndex, "InvestmentBankerCompany");
            WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strCompanyName+"')]"),getDriverProvider().get());
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strCompanyName + "')]")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickProjectOfBanker(int RowIndex){
        try {
             String strProjectName = ReadData.readDataExcel("Investments", RowIndex, "InvestmentBankerProject");
             findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strProjectName + "')]")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickListingOfBanker(int RowIndex){
        try {
            String strListingName = ReadData.readDataExcel("Investments", RowIndex, "InvestmentBankerListing");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strListingName + "')]")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyCompanyOfBanker(int RowIndex){
        try {
            //wait until companies appears in search
            WaitUtil.simpleSleep(5000);
            String strCompanyName = ReadData.readDataExcel("Investments", RowIndex, "InvestmentBankerCompany");
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strCompanyName+"')]"),getDriverProvider().get()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyProjectOfInvestmentBanker(int RowIndex){
        try {
            //wait until companies appears in search
            WaitUtil.simpleSleep(15000);
            String strProject = ReadData.readDataExcel("Investments", RowIndex, "InvestmentBankerProject");
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strProject+"')]"),getDriverProvider().get()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void verifyListingOfInvestmentBanker(int RowIndex){
        try {

            //wait until companies appears in search
            WaitUtil.simpleSleep(5000);
            String strListing = ReadData.readDataExcel("Investments", RowIndex, "InvestmentBankerListing");
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strListing+"')]"),getDriverProvider().get()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectInvestmentAmount(){
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<40;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
            //wait until page loads
            WaitUtil.simpleSleep(600);
        }
        //wait until page loads
        WaitUtil.simpleSleep(20000);
    }

    public void clearInvestmentAmount(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<40;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectValueOfDealSize(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<40;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearValueOfDealSize(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<40;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clickInvestingAs(){
        executeScript("scrollTo(550,0)");
        //Horizontal scroll - left by 95 pixels
        executeScript("window.scrollBy(-300,0)", "");
        WaitUtil.simpleSleep(500);
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investing As:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectGeneralPartner(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_1")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_1"));
        //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investing As:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearGeneralPartner(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_1")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_1"));
        //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investing As:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectSingleRadioButton(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
        findElement(By.id("single_lp_fund_0")).click();
    }

    public void clickOnCurrentAssetStatus(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectFullyRented(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
        findElement(By.id("AssetstatusId_checkbox_1")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssetstatusId_checkbox_1"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearFullyRented(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
        findElement(By.id("AssetstatusId_checkbox_1")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssetstatusId_checkbox_1"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickReturnProfile(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
        findElement(By.id("ui-accordion-1-header-2")).click();
    }

    public void clickReturnProfile_InvestmentDirectInto(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
        executeScript("scroll(100,0)");
        findElement(By.id("ui-accordion-1-header-1")).click();
    }

    public void selectCocPercent(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[1]/div[1]/div/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearCocPercent(){

        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[1]/div[1]/div/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clickLeveraged(){
        //wait until checkbox is found
        WaitUtil.simpleSleep(5000);
        findElement(By.id("cocLeverrage")).click();
        //wait until checkbox is found
        WaitUtil.simpleSleep(500);
    }

    public void clearLeveraged(){
        //wait until checkbox is found
        WaitUtil.simpleSleep(500);
        findElement(By.id("cocLeverrage")).click();
    }

    public void selectIrrPercent(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[2]/div[1]/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearIrrPercent(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[2]/div[1]/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectRoePercent(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[2]/div[1]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearRoePercent(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[2]/div[1]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clickActual(){
        //wait until checkbox is found
        WaitUtil.simpleSleep(500);
        findElement(By.id("capRetAct")).click();
        //wait until checkbox is found
        WaitUtil.simpleSleep(500);
    }

    public void clearActual(){
        //wait until checkbox is found
        WaitUtil.simpleSleep(500);
        findElement(By.id("capRetAct")).click();
    }

    public void selectCapPercent(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[3]/div[1]/div/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearCapPercent(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[3]/div[1]/div/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clickProForma(){
        //wait until checkbox is found
        WaitUtil.simpleSleep(500);
        findElement(By.id("CapProForm")).click();
        //wait until checkbox is found
        WaitUtil.simpleSleep(500);
    }

    public void clearProForma(){
        //wait until checkbox is found
        WaitUtil.simpleSleep(500);
        findElement(By.id("CapProForm")).click();
    }

    public void selectHoldingMin(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[4]/div/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearHoldingMin(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[4]/div/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
    }

    public void selectHoldingMax(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[4]/div/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearHoldingMax(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[4]/div/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }


}
