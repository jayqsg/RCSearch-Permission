package test.pages;


import org.apache.commons.io.filefilter.FalseFileFilter;
import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import test.Support.ReadData;
import test.steps.VerificationStatements;

public class InvestmentDirectIntoCompanyPage extends FluentWebDriverPage{
    ReadData ReadData = new ReadData();

    public InvestmentDirectIntoCompanyPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void selectValueInDealSize(){
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<20;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[2]"));
        for(int i=0;i<60;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }

        //wait until page gets loaded
        WaitUtil.simpleSleep(20000);
    }

    public void clearValueInDealSize(){
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<20;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[2]"));
        for(int i=40;i<=100;i++){
            sliderRight.sendKeys(Keys.ARROW_RIGHT);
        }
       //wait until page gets loaded
        WaitUtil.simpleSleep(20000);
    }

    public void clickInvestorType(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectAdvisorOption(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_7")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(20000);
    }

    public void clickRouteToSponsorField()throws WebDriverException {
        boolean bnlFound = false;
        int intCount = 0;
        while (!bnlFound && intCount <= 5){
            try{
                findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Route To Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
                bnlFound= true;
            }catch(WebDriverException e){
                WaitUtil.simpleSleep(1000);
                intCount = intCount+1;
            }
        }
    }

    public void selectDirectOnlyInRouteToSponsor(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
        findElement(By.id("RouteId_checkbox_1")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Route To Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
    }

    public void clickAssetInterest(){
       //wait until asset interest field appears
       WaitUtil.simpleSleep(100);
       findElement(By.id("ui-accordion-1-header-0")).click();
    }

    public void clickAssetTypeOfInvestmentDirectInto() throws ElementNotVisibleException {
        boolean bnlFound = false;
        int intCount = 0;
        while (!bnlFound && intCount <= 5){
            try{
                executeScript("scrollTo(0,550)");
                findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
                bnlFound= true;
            }catch(ElementNotVisibleException e){
                WaitUtil.simpleSleep(1000);
                intCount = intCount+1;
            }
        }
    }

    public void selectOfficeAssetType_InvestmentDirectInto(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(1000);
        executeScript("scroll(550,0)");
        WaitUtil.isElementPresent(By.id("AssettypeId_checkbox_1"), getDriverProvider().get());
        findElement(By.id("AssettypeId_checkbox_1")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.id("AssettypeId_checkbox_1"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
    }

    public void clearAssetFieldDropDown_InvestmentDirectInto(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
        findElement(By.id("AssettypeId_checkbox_1")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_1"));
        //wait until page gets loaded
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickMultiFamily_InvestmentDirectInto(){
        //wait until page load
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_1")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("AssettypeId_checkbox_1"));
        findElement(By.id("AssettypeId_checkbox_3")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.id("AssettypeId_checkbox_3"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
    }

    public void clickHotel_InvestmentDirectInto(){
        //wait until page load
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_3")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("AssettypeId_checkbox_3"));
        findElement(By.id("AssettypeId_checkbox_5")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.id("AssettypeId_checkbox_5"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
    }

    public void clickSports_InvestmentDirectInto(){
        //wait until page load
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_5")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("AssettypeId_checkbox_5"));
        WaitUtil.isElementPresent(By.id("AssettypeId_checkbox_11"), getDriverProvider().get());
        findElement(By.id("AssettypeId_checkbox_11")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.id("AssettypeId_checkbox_11"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
    }

    public void clickHealthCare_InvestmentDirectInto(){
        //wait until page is loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_11")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("AssettypeId_checkbox_11"));
        findElement(By.id("AssettypeId_checkbox_13")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.id("AssettypeId_checkbox_13"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
    }

    public void clickStorage_InvestmentDirectInto()throws ElementNotVisibleException{
        boolean bnlFound = false;
        int intCount = 0;
        while (!bnlFound && intCount <= 5){
            try{
                findElement(By.id("AssettypeId_checkbox_13")).click();
                VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("AssettypeId_checkbox_13"));
                WaitUtil.isElementPresent(By.id("AssettypeId_checkbox_15"),getDriverProvider().get());
                findElement(By.id("AssettypeId_checkbox_15")).click();
                VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_15"));
                findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
                bnlFound= true;
            }catch(ElementNotVisibleException e){
                WaitUtil.simpleSleep(1000);
                intCount = intCount+1;
            }
        }
    }

    public void clickOther_InvestmentDirectInto(){
        //wait until page is loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_15")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("AssettypeId_checkbox_15"));
        findElement(By.id("AssettypeId_checkbox_17")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.id("AssettypeId_checkbox_17"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
    }

    public void clickRetail_InvestmentDirectInto(){
        //wait until page is loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_17")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_17"));
        findElement(By.id("AssettypeId_checkbox_2")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_2"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
    }

    public void clickIndustrial_InvestmentDirectInto(){
        //wait until project dropdown appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_2")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_2"));
        findElement(By.id("AssettypeId_checkbox_4")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_4"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
    }

    public void clickResidential_InvestmentDirectInto(){
        //wait until page is loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_4")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_4"));
        findElement(By.id("AssettypeId_checkbox_6")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_6"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
    }

    public void clickSingle_InvestmentDirectInto(){
        //wait until page is loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_6")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("AssettypeId_checkbox_6"));
        findElement(By.id("AssettypeId_checkbox_7")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_7"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(20000);
    }

    public void clickRetirement_InvestmentDirectInto(){
        //wait until page is loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_6")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_6"));
        findElement(By.id("AssettypeId_checkbox_8")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_8"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickStudent_InvestmentDirectInto(){
        //wait until page is loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_6")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_6"));
        findElement(By.id("AssettypeId_checkbox_9")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_9"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
    }

    public void clickOtherHousing_InvestmentDirectInto() {
        findElement(By.id("AssettypeId_checkbox_6")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_6"));
        findElement(By.id("AssettypeId_checkbox_10")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_10"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        WaitUtil.simpleSleep(5000);
    }

    public void clickResidentialMultiFamily_InvestmentDirectInto(){
        //wait until page is loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_6")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_6"));
        findElement(By.id("AssettypeId_checkbox_18")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_18"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        WebElement myLink = findElement(By.id("AssettypeId_checkbox_4"));
        Actions action = new Actions(getDriverProvider().get());
        action.moveToElement(myLink).build().perform();
        //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
    }

    public void clearResidential_InvestmentDirectInto(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_6")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_6"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
    }

    public void clickMixedUse_InvestmentDirectInto(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_12")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_12"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickCommercial_InvestmentDirectInto(){
        //wait until project dropdown appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_12")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_12"));
        findElement(By.id("AssettypeId_checkbox_14")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_14"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
    }

    public void clickSolar_InvestmentDirectInto(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_14")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_14"));
        findElement(By.id("AssettypeId_checkbox_16")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_16"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
    }

    public void clickAllOptionOfAssetType_InvestmentDirectInto(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_16")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_16"));
        findElement(By.id("AssettypeId_checkbox_-1")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_-1"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
    }

    public void clearAllOptionOfAssetType_InvestmentDirectInto(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_-1")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_-1"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
    }

    public void clickRiskProfile_InvestmentDirectInto(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        executeScript("scrollTo(0,550)");
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectRisk_InvestmentDirectInto(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(5000);
        findElement(By.id("RiskprofileId_checkbox_1")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_1"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until strategy field appears
        WaitUtil.simpleSleep(10000);
    }

    public void clearRiskProfile_InvestmentDirectInto(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_1")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_1"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until strategy field appears
        WaitUtil.simpleSleep(5000);
    }

    public void clickCorePlus_InvestmentDirectInto(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_1")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_1"));
        findElement(By.id("RiskprofileId_checkbox_2")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.id("RiskprofileId_checkbox_2"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
    }

    public void clickValueAdd_InvestmentDirectInto(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_2")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_2"));
        findElement(By.id("RiskprofileId_checkbox_3")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_3"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
    }

    public void clickDevelopment_InvestmentDirectInto(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_3")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_3"));
        findElement(By.id("RiskprofileId_checkbox_4")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_4"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
    }

    public void clickOpportunistic_InvestmentDirectInto(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_4")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_4"));
        findElement(By.id("RiskprofileId_checkbox_5")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_5"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
    }

    public void clickOtherRiskProfile_InvestmentDirectInto(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_5")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_5"));
        findElement(By.id("RiskprofileId_checkbox_6")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_6"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
    }

    public void clickAllOptionOfRiskProfile_InvestmentDirectInto(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_6")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_6"));
        findElement(By.id("RiskprofileId_checkbox_-1")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_-1"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
    }

    public void clearRisk_InvestmentDirectInto(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_-1")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_-1"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
    }

    public void clickDealStage(){
        //wait until deal stage field appears
        WaitUtil.simpleSleep(5000);
        executeScript("scrollTo(0,550)");
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        WaitUtil.simpleSleep(5000);
    }

    public void selectOwnedOption(){
        //wait until deal stage field appears
        WaitUtil.simpleSleep(7000);
        findElement(By.id("DealstageId_checkbox_1")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("DealstageId_checkbox_1"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page load
        WaitUtil.simpleSleep(5000);
    }

    public void clearOwnedOption(){
        //wait until deal stage field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_1")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("DealstageId_checkbox_1"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        WaitUtil.simpleSleep(5000);
    }

    public void clickAssetStrategyField(){

        //wait until page loads
        WaitUtil.simpleSleep(100);
        executeScript("scrollTo(0,550)");

        //wait until element is visible
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectAcquisitionOption(){
         //wait until deal stage field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_1")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssetstrategyId_checkbox_1"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until deal stage field appears
        WaitUtil.simpleSleep(15000);
    }

    public void clearAcquisitionOption(){
        //wait until deal stage field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_1")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssetstrategyId_checkbox_1"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until deal stage field appears
        WaitUtil.simpleSleep(5000);
    }

    public void selectSyndicating(){
        //wait until deal stage field appears
        WaitUtil.simpleSleep(10000);
        findElement(By.id("syndications_")).click();
        //wait until deal stage field appears
        WaitUtil.simpleSleep(20000);
    }

    public void selectBrokerOrIntermediary(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_9")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void selectConsultant(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_9")).click();
        findElement(By.id("InvestortypeId_checkbox_11")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void selectEB5Program(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_11")).click();
        findElement(By.id("InvestortypeId_checkbox_13")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void selectFamilyOffice(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_13")).click();
        findElement(By.id("InvestortypeId_checkbox_15")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void selectFundOfFunds(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_15")).click();
        findElement(By.id("InvestortypeId_checkbox_17")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void selectHedgeFund(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_17")).click();
        findElement(By.id("InvestortypeId_checkbox_19")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void selectIndividualInvestor(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_19")).click();
        findElement(By.id("InvestortypeId_checkbox_21")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void selectInvestmentManager(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_21")).click();
        findElement(By.id("InvestortypeId_checkbox_23")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void selectNCREIFStyleTrust(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_23")).click();
        findElement(By.id("InvestortypeId_checkbox_25")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void selectOwnerOperator(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_25")).click();
        findElement(By.id("InvestortypeId_checkbox_27")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void selectPrivateEquityRealEstateFund(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_27")).click();
        findElement(By.id("InvestortypeId_checkbox_29")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void selectPublicREIT(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_29")).click();
        findElement(By.id("InvestortypeId_checkbox_31")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void selectSovereignWealthFund(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_31")).click();
        findElement(By.id("InvestortypeId_checkbox_33")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void selectBank(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_33")).click();
        findElement(By.id("InvestortypeId_checkbox_8")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void selectConstructionLender(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_8")).click();
        findElement(By.id("InvestortypeId_checkbox_10")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void selectCrowdFundingPlatform(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_10")).click();
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void selectEndowmentAndFoundation(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        findElement(By.id("InvestortypeId_checkbox_14")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void selectFund(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_14")).click();
        findElement(By.id("InvestortypeId_checkbox_16")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void selectGovernmentAgency(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_16")).click();
        findElement(By.id("InvestortypeId_checkbox_18")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void selectHighNet(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_18")).click();
        findElement(By.id("InvestortypeId_checkbox_20")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void selectInsuranceCompany(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_20")).click();
        findElement(By.id("InvestortypeId_checkbox_22")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void selectMezzanine(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_22")).click();
        findElement(By.id("InvestortypeId_checkbox_24")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void selectOtherInstitutional(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_24")).click();
        findElement(By.id("InvestortypeId_checkbox_26")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void selectPensionFund(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_26")).click();
        findElement(By.id("InvestortypeId_checkbox_28")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void selectPrivateREIT(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_28")).click();
        findElement(By.id("InvestortypeId_checkbox_30")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        WaitUtil.simpleSleep(5000);
    }

    public void selectSeniorLender(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_30")).click();
        findElement(By.id("InvestortypeId_checkbox_32")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void selectSpecialServicer(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_32")).click();
        findElement(By.id("InvestortypeId_checkbox_34")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void selectAllOptionOfInvestorType(){

        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_34")).click();
        findElement(By.id("InvestortypeId_checkbox_-2")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void clearAllOptionOfInvestorType(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_-2")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void clickSaleLeaseback(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_3")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void clickStableIncomeProducing(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstrategyId_checkbox_3")).click();
        findElement(By.id("AssetstrategyId_checkbox_5")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void clickQuickFlip(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_5")).click();
        findElement(By.id("AssetstrategyId_checkbox_7")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void clickRestructuring(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_7")).click();
        findElement(By.id("AssetstrategyId_checkbox_9")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void clickRecapitalization(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_9")).click();
        findElement(By.id("AssetstrategyId_checkbox_11")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void clickLandBank(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_11")).click();
        findElement(By.id("AssetstrategyId_checkbox_13")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void clickChangeOfUse(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_13")).click();
        findElement(By.id("AssetstrategyId_checkbox_15")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void clickDevelopmentOfStrategy(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_15")).click();
        findElement(By.id("AssetstrategyId_checkbox_17")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void clickPlatformBuild(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_17")).click();
        findElement(By.id("AssetstrategyId_checkbox_2")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void clickPursuit(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.id("AssetstrategyId_checkbox_2")).click();
        findElement(By.id("AssetstrategyId_checkbox_4")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void clickLeaseUp(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.id("AssetstrategyId_checkbox_4")).click();
        findElement(By.id("AssetstrategyId_checkbox_6")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void clickWorkOut(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.id("AssetstrategyId_checkbox_6")).click();
        findElement(By.id("AssetstrategyId_checkbox_8")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void clickRestructuringCorporate(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_8")).click();
        findElement(By.id("AssetstrategyId_checkbox_10")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void clickPublicToPrivate(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_10")).click();
        findElement(By.id("AssetstrategyId_checkbox_12")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clickRezoning(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_12")).click();
        findElement(By.id("AssetstrategyId_checkbox_14")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clickRenovation(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_14")).click();
        findElement(By.id("AssetstrategyId_checkbox_16")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clickForwardCommitment(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_16")).click();
        findElement(By.id("AssetstrategyId_checkbox_18")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void clickOtherInStrategy(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_19")).click();
        findElement(By.id("AssetstrategyId_checkbox_18")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        executeScript("scrollTo(0,900)");
        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void clickAllOptionOfAssetStrategy(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_19")).click();
        findElement(By.id("AssetstrategyId_checkbox_-1")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        executeScript("scrollTo(0,900)");
        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void clearAllOptionOfAssetStrategy(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_-1")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

}
