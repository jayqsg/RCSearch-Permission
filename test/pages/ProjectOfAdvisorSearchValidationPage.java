package test.pages;


import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import test.Support.ReadData;

import java.util.List;

public class ProjectOfAdvisorSearchValidationPage extends FluentWebDriverPage {
    ReadData ReadData = new ReadData();
    public ProjectOfAdvisorSearchValidationPage(WebDriverProvider driverProvider){
        super(driverProvider);
    }

    public void verifyServiceNameOfAdvisorIsDisplayed(String strServiceName) throws StaleElementReferenceException {
        //wait until page loads
        try{
            WaitUtil.simpleSleep(3000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'" + strServiceName + "')]"), getDriverProvider().get()));
        } catch (StaleElementReferenceException e){
            WaitUtil.simpleSleep(3000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'" + strServiceName + "')]"), getDriverProvider().get()));
        }
    }

    public void verifyServiceNameOfAdvisorNotDisplayed(String strServiceNameNotDisplayed){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        Assert.assertFalse(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[@data-role='title'][text()='"+strServiceNameNotDisplayed+"']"), getDriverProvider().get()));
    }

    public void verifyAllOptionsOfAdvisorService(int RowIndex){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        try {
            String strAllCompanyName = ReadData.readDataExcel("ValidationDetails", RowIndex, "RealEstateAdvisor");
            //wait until page loads
            WaitUtil.simpleSleep(5000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAllCompanyName+"')]"), getDriverProvider().get()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean serviceOfAdvisorNotDisplayed(int RowIndex, String strColumnName){
        boolean status = false;
        try{
            List<WebElement> links;
            //wait until page gets loaded
            WaitUtil.simpleSleep(6000);
            links =  findElements(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span"));
            int linksCount = links.size();
            linksCount = linksCount/2;
            for(int i=1;i<=linksCount;i++){
                String strCompanyName = ReadData.readDataExcel("ValidationDetails", RowIndex, strColumnName);
                //wait until page gets loaded
                WaitUtil.simpleSleep(1000);
                String strName = findElement(By.xpath("//tbody[@id='searchResults']/tr["+i+"]/td/a/strong/span")).getText();
                if(strName.equals(strCompanyName))
                {
                    status = false;
                    break;
                } else {
                    status = true;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }


    public void serviceOfAdvisorIsDisplayed(int RowIndex,String strColumnName){
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

    public void setProjectSliderValue(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        executeScript("scroll(150,0)");
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
            //wait until page loads
            WaitUtil.simpleSleep(500);
        }
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearProjectSliderValue(){
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
         //wait until page loads
        WaitUtil.simpleSleep(20000);
    }





}
