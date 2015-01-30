package test.pages;


import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.*;
import test.Support.ReadData;
import test.steps.VerificationStatements;

import java.util.List;

public class CompanyOfInvestmentBankerPage extends FluentWebDriverPage {
    ReadData ReadData = new ReadData();
    public CompanyOfInvestmentBankerPage(WebDriverProvider driverProvider){
        super(driverProvider);
    }

    public void verifySubRoleOfBanker(){
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//div[@id='searchFilters']/div/span[contains(text(),'Subrole:')]/strong[contains(text(),'Investment Banker')]"),getDriverProvider().get()));
    }

    public void verifyStrategyOfBanker(){
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//div[@id='searchFilters']/div/span[contains(text(),'Strategy:')]/strong[contains(text(),'Capital Raising')]"),getDriverProvider().get()));
    }

    public void clickOnCompanyName(int RowIndex){
        try{
            String strCompany = ReadData.readDataExcel("RealEstateDetails", RowIndex, "InvestmentBankerCompanyName");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strCompany+"')]")).click();
        }catch (Exception e) {
            System.out.println(e);
        }
    }

    public void clickOnProject(int RowIndex){
        try{
            String strProject = ReadData.readDataExcel("RealEstateDetails", RowIndex, "VerifyProject");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strProject+"')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void setSlider(){
        executeScript("scroll(150,0)");
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<10;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/div/div[2]/a[2]"));
        for(int i=0;i<60;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
        //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void verifyInvestmentBankerCompany(int RowIndex){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        try{
            String strInvestmentBankerCompanyName = ReadData.readDataExcel("RealEstateDetails", RowIndex, "InvestmentBankerCompanyName");
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strInvestmentBankerCompanyName+"')]"), getDriverProvider().get()));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void clearSlider(){
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<10;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/div/div[2]/a[2]"));
        for(int i=40;i<=100;i++){
            sliderRight.sendKeys(Keys.ARROW_RIGHT);
            WaitUtil.simpleSleep(100);
        }
        //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void selectHealthCareOption()throws ElementNotVisibleException {
        boolean bnlFound = false;
        int intCount = 0;
        while (!bnlFound && intCount <= 5){
            try{
                findElement(By.id("AssettypeId_checkbox_13")).click();
                VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_13"));
                findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Asset Experience:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
                bnlFound= true;
            }catch(ElementNotVisibleException e){
                WaitUtil.simpleSleep(1000);
                intCount = intCount+1;
            }
        }
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clearHealthCareOption(){
         //wait until page gets loaded
        WaitUtil.simpleSleep(100);
        findElement(By.id("AssettypeId_checkbox_13")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_13"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Asset Experience:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void selectPermittedOption(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
        findElement(By.id("DealstageId_checkbox_5")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("DealstageId_checkbox_5"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clearPermittedOption(){

        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_5")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("DealstageId_checkbox_5"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickProfileAndExperienceField(){
        //wait until profile field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("ui-accordion-1-header-1")).click();
    }

    public void selectNoOfOfficeField(){
        //wait until profile field appears
        WaitUtil.simpleSleep(500);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<55;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        //wait until profile field appears
        WaitUtil.simpleSleep(10000);
    }

    public void clearNoOfOfficeField(){
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<55;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        //wait until page gets loaded
        WaitUtil.simpleSleep(1000);
    }

    public void selectNoOfProfessionals(){
        //wait until profile field appears
        WaitUtil.simpleSleep(500);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<60;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        //wait until profile field appears
        WaitUtil.simpleSleep(10000);
    }

    public void clearNoOfProfessionals(){
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<60;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        //wait until page gets loaded
        WaitUtil.simpleSleep(1000);
    }

    public void selectValueOfTransactionCompleted(){
        //wait until profile field appears
        WaitUtil.simpleSleep(500);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div[3]/div/div[2]/a[1]"));
        for(int i=0;i<40;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        //wait until profile field appears
        WaitUtil.simpleSleep(10000);
    }

    public void clearValueOfTransactionCompleted(){
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div[3]/div/div[2]/a[1]"));
        for(int i=0;i<40;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void selectNumberOfTransactionCompleted(){
        //wait until profile field appears
        WaitUtil.simpleSleep(500);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div[4]/div/div[2]/a[1]"));
        for(int i=0;i<40;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        //wait until profile field appears
        WaitUtil.simpleSleep(5000);
    }

    public void clearNumberOfTransactionCompleted(){
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div[4]/div/div[2]/a[1]"));
        for(int i=0;i<40;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        //wait until page gets loaded
        WaitUtil.simpleSleep(1000);
    }

    public void clickWisconsinState(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        JavascriptExecutor jse = (JavascriptExecutor)getDriverProvider().get();
        jse.executeScript("window.scrollBy(0,500)", "");
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Select States:')]/parent::div/div/multi-selectbox/div/div/div/div/div/div[@class='col-md-9']/label[contains(text(),'Wisconsin')]")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Select States:')]/parent::div/div/multi-selectbox/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void enterAndSelectEdenCity(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Cities:')]/parent::div/div/multi-selectbox/div/div/div/input")).sendKeys("Eden");
        WaitUtil.simpleSleep(1000);
        executeScript("scroll(150,0)");
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Cities:')]/parent::div/div/multi-selectbox/div/div/div/div/div/div[@class='col-md-9']/label[contains(text(),'Eden (Wisconsin)')]")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Cities:')]/parent::div/div/multi-selectbox/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        WaitUtil.simpleSleep(1000);
    }

}
