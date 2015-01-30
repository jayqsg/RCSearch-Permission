package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import test.Support.ReadData;

import java.util.List;


public class CompanyOfInvestmentBankerValidationPage extends FluentWebDriverPage {
    test.Support.ReadData ReadData = new ReadData();
    public CompanyOfInvestmentBankerValidationPage(WebDriverProvider driverProvider){
        super(driverProvider);
    }

    public void verifyCompanyNameOfInvestmentIsDisplayed(String strCompanyName){
        //wait until page loads
        WaitUtil.simpleSleep(3000);
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strCompanyName+"')]"), getDriverProvider().get()));
    }

    public void verifyCompanyNameOfInvestmentNotDisplayed(String strCompanyName){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        Assert.assertFalse(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strCompanyName+"')]"), getDriverProvider().get()));
    }

    public void setProjectSizeSlider(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        executeScript("scrollTo(150,0)");
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<30;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
            WaitUtil.simpleSleep(100);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/div/div[2]/a[2]"));
        for(int i=0;i<30;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
            WaitUtil.simpleSleep(100);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearProjectSizeSlider(){
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<30;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/div/div[2]/a[2]"));
        for(int i=70;i<100;i++){
            sliderRight.sendKeys(Keys.ARROW_RIGHT);
        }
        //wait until page loads
        WaitUtil.simpleSleep(25000);
    }

    public void verifyAllOptionsOfInvestmentBankerCompany(int RowIndex){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        try {
            String strAllCompanyName = ReadData.readDataExcel("ValidationDetails", RowIndex, "InvestmentBankerOfAllOption");
            //wait until page loads
            WaitUtil.simpleSleep(5000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAllCompanyName+"')]"), getDriverProvider().get()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void companyOfInvestmentBankerNotDisplayed(int RowIndex, String strColumnName){
        //wait until page loads
        WaitUtil.simpleSleep(10000);
        try {
            String strCompanyName = ReadData.readDataExcel("ValidationDetails", RowIndex, strColumnName);
            Assert.assertFalse(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strCompanyName+"')]"),getDriverProvider().get()));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void companyOfInvestmentBankerIsDisplayed(int RowIndex,String strColumnName){
        //wait until page gets loaded
        WaitUtil.simpleSleep(1000);
        try {
            String strOtherUser = ReadData.readDataExcel("ValidationDetails", RowIndex, strColumnName);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strOtherUser+"')]"), getDriverProvider().get()));
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    public void selectHealthCareAndStorage(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_15")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Asset Experience:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearHealthCareAndStorage(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_13")).click();
        findElement(By.id("AssettypeId_checkbox_15")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Asset Experience:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectPermittedAndPursuit(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_8")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearPermittedAndPursuit(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_5")).click();
        findElement(By.id("DealstageId_checkbox_8")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectNumberOfOffice(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
            //wait until page loads
            WaitUtil.simpleSleep(500);
        }
        //wait until page loads
        WaitUtil.simpleSleep(15000);
    }

    public void clearNumberOfOffice(){
         //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectNumberOfProfessionals(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
            //wait until page loads
            WaitUtil.simpleSleep(500);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearNumberOfProfessionals(){
         //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectNumberOfValueTransaction(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div[3]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
            //wait until page loads
            WaitUtil.simpleSleep(500);
        }
        //wait until page loads
        WaitUtil.simpleSleep(20000);
    }

    public void clearNumberOfValueTransaction(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div[3]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
    }

    public void selectNumOfTransactionCompleted(){
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div[4]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
            //wait until page loads
            WaitUtil.simpleSleep(500);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearNumOfTransactionCompleted(){
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div[4]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }
}
