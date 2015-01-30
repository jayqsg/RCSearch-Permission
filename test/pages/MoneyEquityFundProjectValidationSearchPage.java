package test.pages;


import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import test.Support.ReadData;
import test.steps.VerificationStatements;

public class MoneyEquityFundProjectValidationSearchPage extends FluentWebDriverPage{
    ReadData ReadData = new test.Support.ReadData();


    public MoneyEquityFundProjectValidationSearchPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void verifyProjectNameOfEquityFundNotDisplayed(String strProjectName){
        //wait util page load
        WaitUtil.simpleSleep(5000);
        Assert.assertFalse(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'" + strProjectName + "')]"), getDriverProvider().get()));
    }

    public void setValueForFundTerm(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
            //wait until page loads
            WaitUtil.simpleSleep(500);
        }
        //wait until page loads
        WaitUtil.simpleSleep(15000);
    }

    public void clearValueForFundTerm(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectGeneralPartnerAndOtherInvestor(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("InvestmentstructureId_checkbox_6")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait util page load
        WaitUtil.simpleSleep(10000);
    }

    public void clearGeneralPartnerAndOtherInvestor(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("InvestmentstructureId_checkbox_1")).click();
        findElement(By.id("InvestmentstructureId_checkbox_6")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait util page load
        WaitUtil.simpleSleep(10000);
    }

    public void selectLimitedPartner(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("InvestortypeId_checkbox_2")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div/label[contains(text(),'Investment Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait util page load
        WaitUtil.simpleSleep(10000);
    }

    public void selectCoGP(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("InvestortypeId_checkbox_2")).click();
        findElement(By.id("InvestortypeId_checkbox_3")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div/label[contains(text(),'Investment Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait util page load
        WaitUtil.simpleSleep(10000);
    }

    public void selectCoDeveloper(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("InvestortypeId_checkbox_3")).click();
        findElement(By.id("InvestortypeId_checkbox_4")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div/label[contains(text(),'Investment Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait util page load
        WaitUtil.simpleSleep(10000);
    }

    public void selectCoLead(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        executeScript("scrollTo(0,500)");
        findElement(By.id("InvestortypeId_checkbox_4")).click();
        findElement(By.id("InvestortypeId_checkbox_5")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div/label[contains(text(),'Investment Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait util page load
        WaitUtil.simpleSleep(10000);
    }

    public void clearCoLead(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("InvestortypeId_checkbox_5")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div/label[contains(text(),'Investment Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait util page load
        WaitUtil.simpleSleep(10000);

    }

    public void selectDirectOnlyAndPlacementAgent(){
        //wait util page load
        WaitUtil.simpleSleep(500);
        findElement(By.id("RoutetoinvestorId_checkbox_4")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Route To Investor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait util page load
        WaitUtil.simpleSleep(10000);
    }

    public void clearDirectOnlyAndPlacementAgent(){
        //wait util page load
        WaitUtil.simpleSleep(500);
        findElement(By.id("RoutetoinvestorId_checkbox_1")).click();
        findElement(By.id("RoutetoinvestorId_checkbox_4")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Route To Investor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectIntermediary(){
        //wait util page load
        WaitUtil.simpleSleep(500);
        findElement(By.id("RoutetoinvestorId_checkbox_2")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div/label[contains(text(),'Route To Investor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait util page load
        WaitUtil.simpleSleep(10000);
    }

    public void selectBrokers(){
        //wait util page load
        WaitUtil.simpleSleep(500);
        findElement(By.id("RoutetoinvestorId_checkbox_2")).click();
        findElement(By.id("RoutetoinvestorId_checkbox_3")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div/label[contains(text(),'Route To Investor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait util page load
        WaitUtil.simpleSleep(10000);
    }

    public void clearBrokers(){
        //wait util page load
        WaitUtil.simpleSleep(500);
        findElement(By.id("RoutetoinvestorId_checkbox_3")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div/label[contains(text(),'Route To Investor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectPlacementAgent_Money(){
        //wait until page load
        WaitUtil.simpleSleep(500);
        findElement(By.id("RoutetoinvestorId_checkbox_4")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("RoutetoinvestorId_checkbox_4"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div/label[contains(text(),'Route To Investor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait util page load
        WaitUtil.simpleSleep(10000);
    }

    public void clearPlacementAgent_Money(){
        //wait until page load
        WaitUtil.simpleSleep(500);
        findElement(By.id("RoutetoinvestorId_checkbox_4")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("RoutetoinvestorId_checkbox_4"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div/label[contains(text(),'Route To Investor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait util page load
        WaitUtil.simpleSleep(10000);
    }

    public void selectAllOption_Money(){
         //wait until page load
        WaitUtil.simpleSleep(500);
        findElement(By.id("RoutetoinvestorId_checkbox_-1")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("RoutetoinvestorId_checkbox_-1"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div/label[contains(text(),'Route To Investor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait util page load
        WaitUtil.simpleSleep(10000);

    }

    public void clearAllOption_Money(){
        //wait until page load
        WaitUtil.simpleSleep(500);
        findElement(By.id("RoutetoinvestorId_checkbox_-1")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("RoutetoinvestorId_checkbox_-1"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div/label[contains(text(),'Route To Investor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait util page load
        WaitUtil.simpleSleep(10000);

    }
}
