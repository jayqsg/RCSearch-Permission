package test.pages;


import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import test.Support.ReadData;

import java.util.List;

public class InvestmentFundProjectPage extends FluentWebDriverPage {
    ReadData ReadData = new ReadData();

    public InvestmentFundProjectPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void verifyFundOfDealSponsor(int RowIndex){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        try {
            String strFundOfDealSponsor = ReadData.readDataExcel("Investments", RowIndex, "FundOfDealSponsor");
            //findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strFundOfDealSponsor+"')]")).isDisplayed();
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strFundOfDealSponsor+"')]"), getDriverProvider().get()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyFundOfInvestor(int RowIndex){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        try {
            String strFundOfInvestor = ReadData.readDataExcel("Investments", RowIndex, "FundOfInvestor");
            //findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strFundOfInvestor+"')]")).isDisplayed();
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strFundOfInvestor+"')]"), getDriverProvider().get()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setValuesOfFundSize(){
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
            //wait until page loads
            WaitUtil.simpleSleep(100);
        }
         //wait until page loads
        WaitUtil.simpleSleep(20000);
    }

    public void clearValuesOfFundSize(){
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void setInvestmentAmount(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<20;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
            //wait until page loads
            WaitUtil.simpleSleep(500);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[2]"));
        for(int i=0;i<60;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
            //wait until page loads
            WaitUtil.simpleSleep(500);
        }
        //wait until page loads
        WaitUtil.simpleSleep(20000);
    }

    public void clearInvestmentAmount(){
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<20;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[2]"));
        for(int i=40;i<100;i++){
            sliderRight.sendKeys(Keys.ARROW_RIGHT);
        }

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectInHouseSponsors(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("in_house_sponsors_")).click();
        //wait until page loads
        WaitUtil.simpleSleep(25000);
    }

    public void selectCoInvestWithOperatingPartners(){

        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("coinvest_partner_")).click();

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clickFundExperience(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("ui-accordion-1-header-3")).click();
    }

    public void setManagerExperience(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<20;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
    }

    public void clearManagerExperience(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<20;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
    }

    public void setAverageReturn1Year(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<10;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
    }

    public void clearAverageReturn1Year(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<10;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
    }

    public void setAverageReturnValue3Year(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div[3]/div/div[2]/a[1]"));
        for(int i=0;i<20;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
    }

    public void clearAverageReturnValue3Year(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div[3]/div/div[2]/a[1]"));
        for(int i=0;i<20;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
    }

    public void setAverageReturnValue5Year(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div[4]/div/div[2]/a[1]"));
        for(int i=0;i<30;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
    }

    public void clearAverageReturnValue5Year(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div[4]/div/div[2]/a[1]"));
        for(int i=0;i<30;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
    }

    public void verifyFundOfInvestmentIsDisplayed(String strDealSponsorFund){
          //wait until page loads
        WaitUtil.simpleSleep(10000);
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDealSponsorFund+"')]"), getDriverProvider().get()));
    }

    public void selectCocPercent_InvestmentFund(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/ul/li[1]/div[1]/div/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearCocPercent_InvestmentFund(){

        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/ul/li[1]/div[1]/div/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectIrrPercent_InvestmentFund(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/ul/li[2]/div[1]/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearIrrPercent_InvestmentFund(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/ul/li[2]/div[1]/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectRoePercent_InvestmentFund(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/ul/li[2]/div[1]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearRoePercent_InvestmentFund(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/ul/li[2]/div[1]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectCapPercent_InvestmentFund(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/ul/li[3]/div[1]/div/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearCapPercent_InvestmentFund(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/ul/li[3]/div[1]/div/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectHoldingMin_InvestmentFund(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/ul/li[4]/div/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearHoldingMin_InvestmentFund(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/ul/li[4]/div/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
    }

    public void selectHoldingMax_InvestmentFund(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/ul/li[4]/div/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearHoldingMax_InvestmentFund(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/ul/li[4]/div/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }


}
