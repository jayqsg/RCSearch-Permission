package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import test.Support.ReadData;
import test.steps.VerificationStatements;

/**
 * Created with IntelliJ IDEA.
 * User: Bhavana
 * Date: 6/23/14
 * Time: 11:58 AM
 * To change this template use File | Settings | File Templates.
 */

public class CompaniesOfDealSponsorPage extends FluentWebDriverPage{

    ReadData ReadData = new ReadData();

    public CompaniesOfDealSponsorPage(WebDriverProvider driverProvider){
        super(driverProvider);
    }

    public void selectOffice(){
         //wait until page gets loaded
        WaitUtil.simpleSleep(1000);
        executeScript("scroll(550,0)");
        findElement(By.id("AssettypeId_checkbox_1")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_1"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Asset Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clearAssetFieldDropDown(){
         //wait until page gets loaded
        WaitUtil.simpleSleep(100);
        executeScript("scroll(150,0)");
        findElement(By.id("AssettypeId_checkbox_1")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_1"));
        //wait until page gets loaded
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Asset Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickRiskProfile(){
         //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        executeScript("scrollTo(0,550)");
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectRisk(){
         //wait until strategy field appears
        WaitUtil.simpleSleep(10000);
        findElement(By.id("RiskprofileId_checkbox_1")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_1"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until strategy field appears
        WaitUtil.simpleSleep(10000);
    }

    public void clearRiskProfile(){
         //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_1")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_1"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until strategy field appears
        WaitUtil.simpleSleep(10000);
    }

    public void clickInvestorSponsor(){
         //wait until Investor and Sponsor field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("ui-accordion-1-header-2")).click();
    }

    public void clickInvestmentMethod(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectInvestment(){
         //wait until Investor drop down appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_7")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_7"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearInvestment(){
         //wait until Investor drop down appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_7")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickRouteToSponsorOfDealSponsor(){
         //wait until page load
        WaitUtil.simpleSleep(500);
        executeScript("scrollTo(0,550)");
        findElement(By.xpath("//div[@class='field clearfix']/label[contains(text(),'Route to Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page load
        WaitUtil.simpleSleep(1000);
    }

    public void selectRoute(){
         //wait until Route to development field appears
        WaitUtil.simpleSleep(5000);
        findElement(By.id("RouteId_checkbox_1")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("RouteId_checkbox_1"));
        findElement(By.xpath("//div[@class='field clearfix']/label[contains(text(),'Route to Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until Route to development field appears
        WaitUtil.simpleSleep(15000);
    }

    public void clearRoute(){
         //wait until Route to development field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_1")).click();
        findElement(By.xpath("//div[@class='field clearfix']/label[contains(text(),'Route to Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickAbout(){
         //wait until about field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("ui-accordion-1-header-1")).click();
    }


    public void checkSyndicate(){
         //wait until field appears
        WaitUtil.simpleSleep(5000);
        findElement(By.id("syndications_")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.id("syndications_"));
         //wait until page load
        WaitUtil.simpleSleep(10000);
    }

    public void unCheckSyndicate(){
         //wait until field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("syndications_")).click();
        WaitUtil.simpleSleep(10000);
    }

    public void verifyCompanyOfDealSponsor(int RowIndex,String strColumnName) throws Exception {
            String strOtherUser = ReadData.readDataExcel("ValidationDetails", RowIndex, strColumnName);
             //wait until page gets loaded
            WaitUtil.simpleSleep(500);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'" + strOtherUser + "')]"), getDriverProvider().get()));
    }

    public void clickAssetTypeOfDealSponsor() throws ElementNotVisibleException {
        boolean bnlFound = false;
        int intCount = 0;
        while (!bnlFound && intCount <= 5){
            try{
                executeScript("scroll(0,550)");
                findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
                bnlFound= true;
            }catch(ElementNotVisibleException e){
                WaitUtil.simpleSleep(1000);
                intCount = intCount+1;
            }
        }
    }


    public void clickAssetTypeOfDealSponsor_AssetExperience(){
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void setAverageDealSize(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearAverageDealSize(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void setYearInBusiness(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearYearInBusiness(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void setNumberOfProfessionals(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearNumberOfProfessionals(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void setProjectCompleted(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[4]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearProjectCompleted(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[4]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void setSqFtDeveloped(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[5]/div/div[2]/a[1]"));
        for(int i=0;i<100;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearSqFtDeveloped(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[5]/div/div[2]/a[2]"));
        for(int i=0;i<100;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void setValueOfDealsCompleted(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[6]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
         //wait until page loads
        WaitUtil.simpleSleep(12000);
    }

    public void clearValueOfDealsCompleted(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[6]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }
}
