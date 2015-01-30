package test.pages;


import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import test.Support.ReadData;

import java.util.List;

public class InvestmentFundProjectValidationPage extends FluentWebDriverPage{
    test.Support.ReadData ReadData = new ReadData();

    public InvestmentFundProjectValidationPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void verifyCompanyNameOfInvestmentsFundIsDisplayed(String strFundName){
        //wait until page loads
        WaitUtil.simpleSleep(3000);
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strFundName+"')]"), getDriverProvider().get()));
    }

    public void verifyCompanyNameOfInvestmentsFundNotDisplayed(String strFundName){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        Assert.assertFalse(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strFundName+"')]"), getDriverProvider().get()));
    }

    public void verifyFundOfInvestmentsNotDisplayed(String strDealSponsorFund){
       try{
        //wait until page loads
        WaitUtil.simpleSleep(10000);
        Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDealSponsorFund+"')]"), getDriverProvider().get()));
        //Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strInvestorFund+"')]"), getDriverProvider().get()));
        //wait until page loads
        WaitUtil.simpleSleep(10000);
       }catch (AssertionError A){
           System.out.println(A);
       }
    }



    public void setFundSize(){
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
            //wait until page loads
            WaitUtil.simpleSleep(500);
        }
        //wait until page loads
        WaitUtil.simpleSleep(20000);
    }

    public void clearFundSize(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        //wait until page loads
        WaitUtil.simpleSleep(9000);
    }

    public void setValueOfInvestmentAmount(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
            //wait until page loads
            WaitUtil.simpleSleep(500);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearValueOfInvestmentAmount(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        //wait until page loads
        WaitUtil.simpleSleep(9000);
    }

    public void selectCoDeveloperAndOtherInvestor(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("InvestortypeId_checkbox_6")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investing As:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearCoDeveloperAndOtherInvestor(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("InvestortypeId_checkbox_6")).click();
        findElement(By.id("InvestortypeId_checkbox_4")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investing As:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void setManagerExperienceField(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<40;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
            //wait until page loads
            WaitUtil.simpleSleep(500);
        }
        //wait until page loads
        WaitUtil.simpleSleep(20000);
    }

    public void clearManagerExperienceField(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<40;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
    }

    public void setAverageReturn1YearField(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<20;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        //wait until page loads
        WaitUtil.simpleSleep(15000);
    }

    public void clearAverageReturn1YearField(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<20;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void setAverageReturnValue3YearField(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div[3]/div/div[2]/a[1]"));
        for(int i=0;i<30;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        //wait until page loads
        WaitUtil.simpleSleep(15000);
    }

    public void clearAverageReturnValue3YearField(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div[3]/div/div[2]/a[1]"));
        for(int i=0;i<30;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void setAverageReturnValue5YearField(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div[4]/div/div[2]/a[1]"));
        for(int i=0;i<40;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        //wait until page loads
        WaitUtil.simpleSleep(15000);
    }

    public void clearAverageReturnValue5YearField(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div[4]/div/div[2]/a[1]"));
        for(int i=0;i<40;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectLimitedPartner(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
        findElement(By.id("InvestortypeId_checkbox_2")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investing As:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectDirectOnlyOption(){

        //wait until drop down appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_1")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Route to Investment:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until drop down appears
        WaitUtil.simpleSleep(10000);
    }

    public void selectIntermediaryOption(){

        //wait until drop down appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_1")).click();
        findElement(By.id("RouteId_checkbox_2")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Route to Investment:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until drop down appears
        WaitUtil.simpleSleep(10000);
    }

    public void selectBrokersOption(){

        //wait until drop down appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_2")).click();
        findElement(By.id("RouteId_checkbox_3")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Route to Investment:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until drop down appears
        WaitUtil.simpleSleep(10000);
    }

    public void selectPlacementAgentsOption(){

        //wait until drop down appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_3")).click();
        findElement(By.id("RouteId_checkbox_4")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Route to Investment:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until drop down appears
        WaitUtil.simpleSleep(10000);
    }

    public void selectAllOption(){

        //wait until drop down appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_4")).click();
        findElement(By.id("RouteId_checkbox_-1")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Route to Investment:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until drop down appears
        WaitUtil.simpleSleep(10000);
    }

    public void clearAllOption(){

        //wait until drop down appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_-1")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Route to Investment:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until drop down appears
        WaitUtil.simpleSleep(10000);
    }


}
