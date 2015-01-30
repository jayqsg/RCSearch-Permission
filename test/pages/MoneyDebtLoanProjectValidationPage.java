package test.pages;


import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import test.Support.ReadData;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MoneyDebtLoanProjectValidationPage extends FluentWebDriverPage{
    ReadData ReadData = new test.Support.ReadData();

    public MoneyDebtLoanProjectValidationPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void verifyProjectNameOfDebtLoanNotDisplayed(String strProjectNameOfDebtLoan){
        //wait util page load
        WaitUtil.simpleSleep(100);
        Assert.assertFalse(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strProjectNameOfDebtLoan+"')]"), getDriverProvider().get()));
    }

    public void setAssetBuildValue(){
        //wait util page load
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<60;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
            WaitUtil.simpleSleep(100);
        }
        //wait util page load
        WaitUtil.simpleSleep(10000);
    }

    public void clearAssetBuildValue(){
        //wait util page load
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<60;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        //wait util page load
        WaitUtil.simpleSleep(5000);
    }

    public void projectNameNotDisplayed(int RowIndex, String strColumnName){
        try {
            String strCompanyName = ReadData.readDataExcel("Money", RowIndex, strColumnName);
            Assert.assertFalse(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strCompanyName+"')]"),getDriverProvider().get()));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void projectNameIsDisplayed(int RowIndex,String strColumnName){
        //wait until page gets loaded
        WaitUtil.simpleSleep(1000);
        try {
            String strOtherUser = ReadData.readDataExcel("Money", RowIndex, strColumnName);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'" + strOtherUser + "')]"), getDriverProvider().get()));
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    public void selectInterestOnlyAndFixedRate(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("InterestoptionId_checkbox_2")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Interest:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void clearInterestOnlyAndFixedRate(){
        findElement(By.id("InterestoptionId_checkbox_1")).click();
        findElement(By.id("InterestoptionId_checkbox_2")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Interest:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void setValueOfInterestRate(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[6]/div/div[2]/a[1]"));
        for(int i=0;i<60;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        //wait until page loads
        WaitUtil.simpleSleep(9000);
    }

    public void clearValueOfInterestRate(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[6]/div/div[2]/a[1]"));
        for(int i=0;i<60;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        //wait until page loads
        WaitUtil.simpleSleep(20000);
    }

    public void clickRecourse(){
        //wait until page loads
        WaitUtil.simpleSleep(100);
        findElement(By.id("recourse_1")).click();
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectTheAssetAndCd(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("CollateralId_checkbox_3")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Collateral:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(500);
    }

    public void clearTheAssetAndCd(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("CollateralId_checkbox_1")).click();
        findElement(By.id("CollateralId_checkbox_3")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Collateral:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(500);
    }

    public void selectCommercialAndIndustrial(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_4")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Types:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(500);
    }

    public void clearCommercialAndIndustrial(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_14")).click();
        findElement(By.id("AssettypeId_checkbox_4")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Types:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(500);
    }

    public void selectDevelopmentAndOpportunistic(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_5")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(500);
    }

    public void clearDevelopmentAndOpportunistic(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_4")).click();
        findElement(By.id("RiskprofileId_checkbox_5")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(500);
    }

    public void selectConceptAndUnderContract(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_2")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(500);
    }

    public void clearUnderContract(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_2")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(500);
    }

    public void clearConceptAndUnderContract(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_2")).click();
        findElement(By.id("DealstageId_checkbox_3")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(500);
    }

    public void selectFixedRate(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("InterestoptionId_checkbox_2")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Interest:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectFloatingRate(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("InterestoptionId_checkbox_2")).click();
        findElement(By.id("InterestoptionId_checkbox_3")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Interest:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectPIK(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("InterestoptionId_checkbox_3")).click();
        findElement(By.id("InterestoptionId_checkbox_4")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Interest:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearPIK(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("InterestoptionId_checkbox_4")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Interest:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void setValueOfLVT(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        //wait until page loads
        WaitUtil.simpleSleep(20000);
    }

    public void clearValueOfLVT(){

        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void setValueOfTermField(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[4]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        //wait until page loads
        WaitUtil.simpleSleep(20000);

    }

    public void clearValueOfTermField(){

        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[4]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }


}
