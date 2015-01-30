package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import test.Support.ReadData;
import test.steps.VerificationStatements;

/**
 * Created with IntelliJ IDEA.
 * User: Bhavana
 * Date: 6/25/14
 * Time: 12:25 PM
 * To change this template use File | Settings | File Templates.
 */

public class CompaniesOfDealSponsorValidationPage extends FluentWebDriverPage {

    ReadData ReadData = new ReadData();

    public CompaniesOfDealSponsorValidationPage(WebDriverProvider driverProvider){
        super(driverProvider);
    }

    public void selectOfficeAssetType(){
         //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
        executeScript("scroll(150,0)");
        findElement(By.id("AssettypeId_checkbox_1")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.id("AssettypeId_checkbox_1"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void selectSecondOption(){
         //wait until page gets loaded
        WaitUtil.simpleSleep(100);
        findElement(By.id("AssettypeId_checkbox_5")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.id("AssettypeId_checkbox_5"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clearAssetField(){
         //wait until page gets loaded
        WaitUtil.simpleSleep(100);
        findElement(By.id("AssettypeId_checkbox_1")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("AssettypeId_checkbox_1"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("AssettypeId_checkbox_5")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("AssettypeId_checkbox_5"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickMultiFamily(){
         //wait until page load
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_1")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("AssettypeId_checkbox_1"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("AssettypeId_checkbox_3")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.id("AssettypeId_checkbox_3"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickHotel(){
         //wait until page load
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_3")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("AssettypeId_checkbox_3"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("AssettypeId_checkbox_5")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.id("AssettypeId_checkbox_5"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickSports(){
         //wait until page load
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_5")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("AssettypeId_checkbox_5"));
        WaitUtil.simpleSleep(5000);
        WaitUtil.isElementPresent(By.id("AssettypeId_checkbox_11"), getDriverProvider().get());
        findElement(By.id("AssettypeId_checkbox_11")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.id("AssettypeId_checkbox_11"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickHealthCare(){
         //wait until page is loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_11")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("AssettypeId_checkbox_11"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("AssettypeId_checkbox_13")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.id("AssettypeId_checkbox_13"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
    }

    public void clickStorage()throws ElementNotVisibleException{
        boolean bnlFound = false;
        int intCount = 0;
        while (!bnlFound && intCount <= 5){
            try{
                findElement(By.id("AssettypeId_checkbox_13")).click();
                VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("AssettypeId_checkbox_13"));
                WaitUtil.simpleSleep(5000);
                WaitUtil.isElementPresent(By.id("AssettypeId_checkbox_15"),getDriverProvider().get());
                findElement(By.id("AssettypeId_checkbox_15")).click();
                VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_15"));
                findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
                bnlFound= true;
            }catch(ElementNotVisibleException e){
                WaitUtil.simpleSleep(1000);
                intCount = intCount+1;
            }
        }
    }

    public void clickOther(){
         //wait until page is loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_15")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("AssettypeId_checkbox_15"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("AssettypeId_checkbox_17")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.id("AssettypeId_checkbox_17"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickRetail(){
         //wait until page is loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_17")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_17"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("AssettypeId_checkbox_2")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_2"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickIndustrial(){
         //wait until project dropdown appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_2")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_2"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("AssettypeId_checkbox_4")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_4"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickResidential(){
        findElement(By.id("AssettypeId_checkbox_4")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_4"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("AssettypeId_checkbox_6")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_6"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickSingle(){
         //wait until page is loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_6")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("AssettypeId_checkbox_6"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("AssettypeId_checkbox_7")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_7"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickRetirement(){
         //wait until page is loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_6")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_6"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("AssettypeId_checkbox_8")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_8"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickStudent(){
         //wait until page is loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_6")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_6"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("AssettypeId_checkbox_9")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_9"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickOtherHousing() {
         findElement(By.id("AssettypeId_checkbox_6")).click();
         VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_6"));
         WaitUtil.simpleSleep(5000);
         findElement(By.id("AssettypeId_checkbox_10")).click();
         VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_10"));
         findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickResidentialMultiFamily(){
         //wait until page is loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_6")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_6"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("AssettypeId_checkbox_18")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_18"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        WebElement myLink = findElement(By.id("AssettypeId_checkbox_4"));
        Actions action = new Actions(getDriverProvider().get());
        action.moveToElement(myLink).build().perform();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clearResidential(){
         //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_6")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_6"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickMixedUse(){
         //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_12")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_12"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickCommercial(){
         //wait until project dropdown appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_12")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_12"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("AssettypeId_checkbox_14")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_14"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickSolar(){
         //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_14")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_14"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("AssettypeId_checkbox_16")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_16"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickAllOptionOfAssetType(){
         //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        executeScript("scroll(550,0)");
        findElement(By.id("AssettypeId_checkbox_16")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_16"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("AssettypeId_checkbox_-1")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_-1"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clearAllOptionOfAssetType(){
         //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_-1")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_-1"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void selectRisk(){
         //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_1")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_1"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void selectSecondRiskProfile(){
         //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_2")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_2"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clearRiskProfile(){
         //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_1")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_1"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("RiskprofileId_checkbox_2")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("RiskprofileId_checkbox_2"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickCorePlus(){
         //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_1")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_1"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("RiskprofileId_checkbox_2")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.id("RiskprofileId_checkbox_2"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickValueAdd(){
         //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_2")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_2"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("RiskprofileId_checkbox_3")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_3"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickDevelopment(){
         //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_3")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_3"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("RiskprofileId_checkbox_4")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_4"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickOpportunistic(){
         //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_4")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_4"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("RiskprofileId_checkbox_5")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_5"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickOtherRiskProfile(){
         //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_5")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_5"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("RiskprofileId_checkbox_6")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_6"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickAllOptionOfRiskProfile(){
         //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_6")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_6"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("RiskprofileId_checkbox_-1")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_-1"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clearRisk(){
         //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_-1")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_-1"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void selectInvestment(){
         //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_7")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_7"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void selectSecondInvestment(){
         //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_9")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_9"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clearInvestment(){
         //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_7")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_7"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("InvestortypeId_checkbox_9")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_9"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickEB5(){
         //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_8")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_8"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickCrowdFunded(){
         //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_8")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_8"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("InvestortypeId_checkbox_9")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_9"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickSingleInvestor(){
         //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_9")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_9"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("InvestortypeId_checkbox_10")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_10"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickFamilyOffice(){
         //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_10")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_10"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("InvestortypeId_checkbox_11")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_11"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickInstitution(){
         //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_11")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_11"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_12"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickAssetManager(){
         //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_12"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("InvestortypeId_checkbox_13")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_13"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickBrokerOrIntermediary(){
         //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_12"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("InvestortypeId_checkbox_14")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_14"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickConsultant(){
         //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_12"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("InvestortypeId_checkbox_15")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_15"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickConstruction(){
         //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_12"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("InvestortypeId_checkbox_16")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_16"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickEndowment(){
         //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_12"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("InvestortypeId_checkbox_17")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_17"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickFundOfFunds(){
         //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_12"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("InvestortypeId_checkbox_18")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_18"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickGovernmentAgency(){
         //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_12"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("InvestortypeId_checkbox_19")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_19"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickHedgeFund(){
         //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_12"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("InvestortypeId_checkbox_20")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_20"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickHighNet(){
         //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_12"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("InvestortypeId_checkbox_21")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_21"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickIndividualInvestor(){
         //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_12"));
        findElement(By.id("InvestortypeId_checkbox_22")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_22"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickInsuranceCompany(){
         //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_12"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("InvestortypeId_checkbox_23")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_23"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickOtherInstitutionalInvestor(){
         //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_12"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("InvestortypeId_checkbox_24")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_24"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickOwnerOperator(){
         //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_12"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("InvestortypeId_checkbox_25")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_25"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickNCREIF(){
         //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_12"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("InvestortypeId_checkbox_26")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_26"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickSeniorLender(){
         //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_12"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("InvestortypeId_checkbox_27")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_27"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickMezzanine(){
         //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_12"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("InvestortypeId_checkbox_28")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_28"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickJuniorLender(){
         //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_12"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("InvestortypeId_checkbox_29")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_29"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickPrivateEquity(){
         //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_12"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("InvestortypeId_checkbox_30")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_30"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickPrivateREIT(){
         //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_12"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("InvestortypeId_checkbox_31")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_31"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickPublicREIT(){
         //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_12"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("InvestortypeId_checkbox_32")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_32"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickSovereign(){
         //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_12"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("InvestortypeId_checkbox_33")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_33"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickSpecial(){
         //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_12"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("InvestortypeId_checkbox_34")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_34"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clearInvestmentMethod(){
         //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_12"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void selectRoute(){
         //wait until Route to development field appears
        WaitUtil.simpleSleep(500);
        WaitUtil.isElementPresent(By.id("RouteId_checkbox_1"),getDriverProvider().get());
        findElement(By.id("RouteId_checkbox_1")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("RouteId_checkbox_1"));
        findElement(By.xpath("//div[@class='field clearfix']/label[contains(text(),'Route to Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(15000);
    }

    public void selectSecondRoute(){
         //wait until Route to development field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_2")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("RouteId_checkbox_1"));
        findElement(By.xpath("//div[@class='field clearfix']/label[contains(text(),'Route to Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clearRoute(){
         //wait until Route to development field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_1")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("RouteId_checkbox_1"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("RouteId_checkbox_2")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("RouteId_checkbox_2"));
        findElement(By.xpath("//div[@class='field clearfix']/label[contains(text(),'Route to Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickIntermediary(){
         //wait until Route to development field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_1")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("RouteId_checkbox_1"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("RouteId_checkbox_2")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("RouteId_checkbox_2"));
        findElement(By.xpath("//div[@class='field clearfix']/label[contains(text(),'Route to Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickBrokers(){
         //wait until Route to development field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_2")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("RouteId_checkbox_2"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("RouteId_checkbox_3")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("RouteId_checkbox_3"));
        findElement(By.xpath("//div[@class='field clearfix']/label[contains(text(),'Route to Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickPlacementAgents(){
        //wait until Route to development field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_3")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("RouteId_checkbox_3"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("RouteId_checkbox_4")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("RouteId_checkbox_4"));
        findElement(By.xpath("//div[@class='field clearfix']/label[contains(text(),'Route to Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void selectAllInRouteSponsor(){
         //wait until Route to sponsor field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_4")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("RouteId_checkbox_4"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("RouteId_checkbox_-1")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("RouteId_checkbox_-1"));
        findElement(By.xpath("//div[@class='field clearfix']/label[contains(text(),'Route to Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(15000);
    }

    public void clearRouteToSponsor(){
         //wait until Route to sponsor field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_-1")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("RouteId_checkbox_-1"));
        findElement(By.xpath("//div[@class='field clearfix']/label[contains(text(),'Route to Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page is loaded
        WaitUtil.simpleSleep(10000);
    }

    public void verifyAllOptions(int RowIndex) throws Exception {
         //wait until page loads
        WaitUtil.simpleSleep(1000);
        String strAllCompanyName = ReadData.readDataExcel("CompaniesOfDealDeveloperFund", RowIndex, "DealSponsorAllSearch");
         //wait until page loads
         WaitUtil.simpleSleep(5000);
         Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAllCompanyName+"')]"), getDriverProvider().get()));
    }

    public void selectStrategy(){
         //wait until strategy field appears
        WaitUtil.simpleSleep(100);
        findElement(By.id("AssetstrategyId_checkbox_33")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssetstrategyId_checkbox_33"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page is loaded
        WaitUtil.simpleSleep(500);
    }

    public void companyNotDisplayed(int intRowIndex,String strColumnName)throws Exception{
        String strCompany = ReadData.readDataExcel("ValidationDetails", intRowIndex, strColumnName);
        Assert.assertFalse(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strCompany+"')]"), getDriverProvider().get()));
         //wait until page gets loaded
        WaitUtil.simpleSleep(500);
    }

    public void companyIsDisplayed(int intRowIndex,String strColumnName)throws Exception{
        String strCompany = ReadData.readDataExcel("ValidationDetails", intRowIndex, strColumnName);
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strCompany+"')]"), getDriverProvider().get()));
         //wait until page gets loaded
        WaitUtil.simpleSleep(500);
    }

    public void clickAsset(){
         //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_34")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssetstrategyId_checkbox_34"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page gets loaded
        WaitUtil.simpleSleep(500);
    }

    public void verifyCompanyNameIsDisplayed(String strCompanyName){
         //wait util page load
        WaitUtil.simpleSleep(1000);
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strCompanyName+"')]"), getDriverProvider().get()));
         //wait util page load
        WaitUtil.simpleSleep(1000);
    }

    public void verifyCompanyNameIsNotDisplayed(String strCompanyName){
         //wait util page load
        WaitUtil.simpleSleep(5000);
        Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strCompanyName+"')]"), getDriverProvider().get()));
    }

    public void setValueForDealSize(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
            //wait until page loads
            WaitUtil.simpleSleep(500);
        }
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearValueForDealSize(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
         //wait until page loads
        WaitUtil.simpleSleep(20000);
    }

    public void setValueForYearInBusiness(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
            //wait until page loads
            WaitUtil.simpleSleep(600);
        }
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearValueForYearInBusiness(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void setValueForNumberOfProfessionals(){
         //wait until page loads
        WaitUtil.simpleSleep(7000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
            //wait until page loads
            WaitUtil.simpleSleep(500);
        }
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearValueForNumberOfProfessionals(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
         //wait until page loads
        WaitUtil.simpleSleep(20000);
    }

    public void setValueForProjectCompleted(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[4]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
            //wait until page loads
            WaitUtil.simpleSleep(500);
        }
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearValueForProjectCompleted(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[4]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
         //wait until page loads
        WaitUtil.simpleSleep(20000);
    }

    public void setValueForSqFt(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[5]/div/div[2]/a[1]"));
        for(int i=0;i<200;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
            //wait until page loads
            WaitUtil.simpleSleep(500);
        }
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearValueForSqFt(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[5]/div/div[2]/a[1]"));
        for(int i=0;i<200;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
         //wait until page loads
        WaitUtil.simpleSleep(20000);
    }

    public void setValueOfDealsCompletedField(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[6]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
            //wait until page loads
            WaitUtil.simpleSleep(800);
        }
         //wait until page loads
         WaitUtil.simpleSleep(10000);
    }

    public void clearValueOfDealsCompletedField(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[6]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
          //wait until page loads
        WaitUtil.simpleSleep(20000);
    }

    public void selectPortfolio(){
          //wait until page loads
        WaitUtil.simpleSleep(5000);
        //executeScript("scrollTo(0,250)");
        findElement(By.id("is_portfolio_1")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("is_portfolio_1"));
        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void selectSingle(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("is_portfolio_0")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("is_portfolio_0"));
    }
}
