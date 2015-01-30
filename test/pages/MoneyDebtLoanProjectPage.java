package test.pages;

/**
 * Created with IntelliJ IDEA.
 * User: Bhavana
 * Date: 6/17/14
 * Time: 3:00 PM
 * To change this template use File | Settings | File Templates.
 */

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import test.Support.ReadData;
import test.steps.VerificationStatements;

import java.util.concurrent.TimeUnit;

public class MoneyDebtLoanProjectPage extends FluentWebDriverPage {
    ReadData ReadData = new test.Support.ReadData();

    public MoneyDebtLoanProjectPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void verifyProjectNameDebtLoan(String strProjectName){
        //wait util page load
        WaitUtil.simpleSleep(100);
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strProjectName+"')]"), getDriverProvider().get()));
    }

    public void setAssetOrBuild(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<20;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
            //wait until page loads
            WaitUtil.simpleSleep(200);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/div/div[2]/a[2]"));
        for(int i=0;i<60;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
        //wait until page loads
        WaitUtil.simpleSleep(15000);
    }

    public void clearAssetOrBuild(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<20;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/div/div[2]/a[2]"));
        for(int i=40;i<100;i++){
            sliderRight.sendKeys(Keys.ARROW_RIGHT);
        }
        //wait until page loads
        WaitUtil.simpleSleep(15000);
    }

    public void setLVT(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/div/div[2]/a[1]"));
        for(int i=0;i<20;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/div/div[2]/a[2]"));
        for(int i=0;i<60;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
        //wait until page loads
        WaitUtil.simpleSleep(15000);
    }

    public void clearLVT(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/div/div[2]/a[1]"));
        for(int i=0;i<20;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/div/div[2]/a[2]"));
        for(int i=40;i<100;i++){
            sliderRight.sendKeys(Keys.ARROW_RIGHT);
        }
        //wait until page loads
        WaitUtil.simpleSleep(15000);
    }

    public void clickOnInterest(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Interest:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectInterestOnlyOption(){
        findElement(By.id("InterestoptionId_checkbox_1")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.id("InterestoptionId_checkbox_1"));
        //wait until page loads
        WaitUtil.simpleSleep(7000);
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Interest:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(25000);
    }

    public void clearInterestOnlyOption(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("InterestoptionId_checkbox_1")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("InterestoptionId_checkbox_1"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Interest:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void setInterestRate(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[6]/div/div[2]/a[1]"));
        for(int i=0;i<10;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[6]/div/div[2]/a[2]"));
        for(int i=0;i<80;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearInterestRate(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[6]/div/div[2]/a[1]"));
        for(int i=0;i<10;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[6]/div/div[2]/a[2]"));
        for(int i=20;i<100;i++){
            sliderRight.sendKeys(Keys.ARROW_RIGHT);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectNonRecourse(){
        //wait until page loads
        WaitUtil.simpleSleep(9000);
        findElement(By.id("recourse_0")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("recourse_0"));
        //wait until page loads
        WaitUtil.simpleSleep(20000);
    }

    public void selectAny(){
        //wait until page loads
        WaitUtil.simpleSleep(100);
        findElement(By.id("recourse_")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("recourse_"));
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clickCollateral() {
        WebElement footerElement = findElement(By.xpath("//div[@id='footer']"));
        Point position = footerElement.getLocation();
        executeScript("scrollTo(0,"+position.getY()+")");
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Collateral:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectTheAssetOption(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("CollateralId_checkbox_1")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("CollateralId_checkbox_1"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Collateral:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearTheAssetOption(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("CollateralId_checkbox_1")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("CollateralId_checkbox_1"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Collateral:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void checkRequiresPointsInProject(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.xpath("//label[contains(text(),'Requires Points in Project')]/preceding-sibling::input[@id='proj_points_req_']")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.xpath("//label[contains(text(),'Requires Points in Project')]/preceding-sibling::input[@id='proj_points_req_']"));
        //wait until page loads
        WaitUtil.simpleSleep(15000);
    }

    public void unCheckRequiresPointsInProject(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.xpath("//label[contains(text(),'Requires Points in Project')]/preceding-sibling::input[@id='proj_points_req_']")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.xpath("//label[contains(text(),'Requires Points in Project')]/preceding-sibling::input[@id='proj_points_req_']"));
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clickLoanForField(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("ui-accordion-1-header-1")).click();
        executeScript("scroll(0,1000)");
    }

    public void clickLoanForFieldInDebtMezz(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("ui-accordion-1-header-1")).click();
        Point lStrPathOfVariable = findElement(By.id("ui-accordion-1-header-1")).getLocation();
        WaitUtil.simpleSleep(500);
        executeScript("scrollTo(0,"+lStrPathOfVariable.getY()+")");
    }

    public void clickAssetTypes(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Asset Types')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectCommercialOption(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_14")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_14"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Asset Types:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearCommercialOption(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_14")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssettypeId_checkbox_14"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Asset Types:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clickRiskProfileField(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectDevelopmentOption(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_4")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_4"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearDevelopmentOption(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_4")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_4"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clickDealStageField(){
       /* WebElement footerElement = findElement(By.xpath("//div[@id='footer']"));
        Point position = footerElement.getLocation();
        executeScript("scrollTo(0,"+position.getY()+")");*/
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectConceptOption(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_3")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("DealstageId_checkbox_3"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearConceptOption(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_3")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("DealstageId_checkbox_3"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clickCurrentAssetStatusField(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectPartiallyRentedOption(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstatusId_checkbox_6")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssetstatusId_checkbox_6"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearPartiallyRentedOption(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstatusId_checkbox_6")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssetstatusId_checkbox_6"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clickAssetStrategyField(){
        //WebElement footerElement = findElement(By.xpath("//div[@id='footer']/ul[2]/li[3]"));
        //wait until page loads
        WaitUtil.simpleSleep(500);
        //Point position = footerElement.getLocation();
        //wait until page loads
        WaitUtil.simpleSleep(500);
        executeScript("scroll(150,0)");
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Asset Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectLandBankOption(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_13")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssetstrategyId_checkbox_13"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Asset Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearLandBankOption(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_13")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssetstrategyId_checkbox_13"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Asset Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clickOnLenderCharacteristics(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.id("ui-accordion-1-header-2")).click();
    }

    public void clickLenderProfile(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
       /* WebElement footerElement = findElement(By.xpath("//div[@id='footer']"));
        Point position = footerElement.getLocation();
        executeScript("scrollTo(0,"+position.getY()+")");*/
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Lender Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickOnLenderProfile(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        executeScript("scrollTo(0,200)");
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Lender Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectMezzFund(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_41")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("SubroleId_checkbox_41"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Lender Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearMezzFund(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_41")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("SubroleId_checkbox_41"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Lender Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectCDOption(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("CollateralId_checkbox_3")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("CollateralId_checkbox_3"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Collateral:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectPGOption(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("CollateralId_checkbox_3")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("CollateralId_checkbox_3"));
        findElement(By.id("CollateralId_checkbox_4")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("CollateralId_checkbox_4"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Collateral:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectOtherOption(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("CollateralId_checkbox_4")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("CollateralId_checkbox_4"));
        findElement(By.id("CollateralId_checkbox_5")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("CollateralId_checkbox_5"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Collateral:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectAllOptionInCollateral(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("CollateralId_checkbox_5")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("CollateralId_checkbox_5"));
        findElement(By.id("CollateralId_checkbox_-1")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("CollateralId_checkbox_-1"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Collateral:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearAllOptionInCollateral(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("CollateralId_checkbox_-1")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("CollateralId_checkbox_-1"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Collateral:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void setPreLeasedValue(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div[6]/div/div[2]/a[1]"));
        for(int i=0;i<10;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void setPreLeasedValues(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div[6]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
            WaitUtil.simpleSleep(200);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearPreLeasedValue(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div[6]/div/div[2]/a[1]"));
        for(int i=0;i<10;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearPreLeasedValues(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div[6]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void setPreSoldValue(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div[7]/div/div[2]/a[1]"));
        for(int i=0;i<10;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void setPreSoldValues(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div[7]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearPreSoldValue(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div[7]/div/div[2]/a[1]"));
        for(int i=0;i<10;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearPreSoldValues(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div[7]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void setLVTValue(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/div/div[2]/a[1]"));
        for(int i=0;i<20;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/div/div[2]/a[2]"));
        for(int i=0;i<60;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
         //wait until page loads
        WaitUtil.simpleSleep(10000);

    }

    public void clearLVTValue(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/div/div[2]/a[1]"));
        for(int i=0;i<20;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/div/div[2]/a[2]"));
        for(int i=40;i<100;i++){
            sliderRight.sendKeys(Keys.ARROW_RIGHT);
        }
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void setTermField(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[4]/div/div[2]/a[1]"));
        for(int i=0;i<20;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[4]/div/div[2]/a[2]"));
        for(int i=0;i<60;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearTermField(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[4]/div/div[2]/a[1]"));
        for(int i=0;i<20;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[4]/div/div[2]/a[2]"));
        for(int i=40;i<100;i++){
            sliderRight.sendKeys(Keys.ARROW_RIGHT);
        }
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clickDealStage_MoneySearch(){
        //wait until deal stage field appears
        WaitUtil.simpleSleep(5000);
        executeScript("scrollTo(0,550)");
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        WaitUtil.simpleSleep(10000);
    }

    public void clickConcept_MoneySearch(){
        //wait until profile appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_3")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("DealstageId_checkbox_3"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until profile appears
        WaitUtil.simpleSleep(10000);
    }

    public void clickPermitted_MoneySearch(){
        //wait until profile appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_3")).click();
        findElement(By.id("DealstageId_checkbox_5")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until profile appears
        WaitUtil.simpleSleep(10000);
    }

    public void clickReady_MoneySearch(){
        //wait until profile appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_5")).click();
        findElement(By.id("DealstageId_checkbox_7")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until profile appears
        WaitUtil.simpleSleep(10000);
    }

    public void clickLOI_MoneySearch(){
        //wait until profile appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_7")).click();
        findElement(By.id("DealstageId_checkbox_9")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until profile appears
        WaitUtil.simpleSleep(10000);
    }

    public void clickUnderContract_MoneySearch(){
        //wait until profile appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_9")).click();
        findElement(By.id("DealstageId_checkbox_2")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until profile appears
        WaitUtil.simpleSleep(10000);
    }

    public void clickPlans_MoneySearch(){
        //wait until profile appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_2")).click();
        findElement(By.id("DealstageId_checkbox_4")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until profile appears
        WaitUtil.simpleSleep(10000);
    }

    public void clickUnderConstruction_MoneySearch(){
        //wait until profile appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_4")).click();
        findElement(By.id("DealstageId_checkbox_6")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until profile appears
        WaitUtil.simpleSleep(10000);
    }

    public void clickPursuit_MoneySearch(){
        //wait until profile appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_6")).click();
        findElement(By.id("DealstageId_checkbox_8")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until profile appears
        WaitUtil.simpleSleep(10000);
    }

    public void clickInDD_MoneySearch(){
        //wait until profile appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_8")).click();
        findElement(By.id("DealstageId_checkbox_10")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until profile appears
        WaitUtil.simpleSleep(10000);
    }

    public void selectAll_MoneySearch(){
        //wait until profile appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_10")).click();
        findElement(By.id("DealstageId_checkbox_-1")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until profile appears
        WaitUtil.simpleSleep(10000);
    }

    public void clearAll_MoneySearch(){
        //wait until profile appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_-1")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until profile appears
        WaitUtil.simpleSleep(10000);
    }

    public void clickOnCurrentAssetStatus_Money(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }


    public void selectPartiallyStabilized_Money(){

        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstatusId_checkbox_3")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(1000);
    }

    public void selectVacant_Money(){

        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstatusId_checkbox_3")).click();
        findElement(By.id("AssetstatusId_checkbox_5")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(1000);
    }

    public void selectUnderConstruction_Money(){

        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstatusId_checkbox_5")).click();
        findElement(By.id("AssetstatusId_checkbox_7")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(1000);
    }

    public void selectAll_Money(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstatusId_checkbox_7")).click();
        findElement(By.id("AssetstatusId_checkbox_-1")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page loads
        WaitUtil.simpleSleep(1000);
    }

    public void selectReo_Money(){

        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstatusId_checkbox_-1")).click();
        findElement(By.id("AssetstatusId_checkbox_2")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(1000);
    }

    public void selectVacantStructure_Money(){

        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstatusId_checkbox_2")).click();
        findElement(By.id("AssetstatusId_checkbox_4")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(1000);
    }

    public void selectPartiallyRented_Money(){

        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstatusId_checkbox_4")).click();
        findElement(By.id("AssetstatusId_checkbox_6")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(1000);
    }

    public void selectEntitled_Money(){

        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstatusId_checkbox_6")).click();
        findElement(By.id("AssetstatusId_checkbox_8")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(1000);
    }

    public void clearEntitled_Money(){

        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstatusId_checkbox_8")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(1000);
    }
}
