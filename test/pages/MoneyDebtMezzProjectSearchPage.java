package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import test.Support.ReadData;

public class MoneyDebtMezzProjectSearchPage extends FluentWebDriverPage{
    ReadData ReadData = new test.Support.ReadData();

    public MoneyDebtMezzProjectSearchPage (WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void verifyFindInSearchOptionOfMoney(int RowIndex){
        try {
            String strFindName = ReadData.readDataExcel("Money", RowIndex, "FindInSearchOption");
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//div[@id='searchFilters']/div/span[contains(text(),'Find:')]/strong[contains(text(),'"+strFindName+"')]"), getDriverProvider().get()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyRiskInSearchOptionOfMoney(int RowIndex){
        try {
            String strRiskName = ReadData.readDataExcel("Money", RowIndex, "RiskInSearchOption");
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//div[@id='searchFilters']/div/span[contains(text(),'Risk:')]/strong[contains(text(),'"+strRiskName+"')]"),getDriverProvider().get()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyProjectNameDebtMezz(String strProjectName){
        //wait util page load
        WaitUtil.simpleSleep(100);
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strProjectName+"')]"), getDriverProvider().get()));

    }

    public void setMezzAmount(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<20;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/div/div[2]/a[2]"));
        for(int i=0;i<40;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearMezzAmount(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<20;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/div/div[2]/a[2]"));
        for(int i=60;i<100;i++){
            sliderRight.sendKeys(Keys.ARROW_RIGHT);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void setEquity(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<20;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[2]"));
        for(int i=0;i<40;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearEquity(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<20;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[2]"));
        for(int i=60;i<100;i++){
            sliderRight.sendKeys(Keys.ARROW_RIGHT);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void setDebt(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/div/div[2]/a[1]"));
        for(int i=0;i<20;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/div/div[2]/a[2]"));
        for(int i=0;i<40;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearDebt(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/div/div[2]/a[1]"));
        for(int i=0;i<20;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/div/div[2]/a[2]"));
        for(int i=60;i<100;i++){
            sliderRight.sendKeys(Keys.ARROW_RIGHT);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void setTerm(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[4]/div/div[2]/a[1]"));
        for(int i=0;i<20;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[4]/div/div[2]/a[2]"));
        for(int i=0;i<40;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearTerm(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[4]/div/div[2]/a[1]"));
        for(int i=0;i<20;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[4]/div/div[2]/a[2]"));
        for(int i=60;i<100;i++){
            sliderRight.sendKeys(Keys.ARROW_RIGHT);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void setInterestRate(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[5]/div/div[2]/a[1]"));
        for(int i=0;i<20;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[5]/div/div[2]/a[2]"));
        for(int i=0;i<40;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearInterestRate(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[5]/div/div[2]/a[1]"));
        for(int i=0;i<20;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[5]/div/div[2]/a[2]"));
        for(int i=60;i<100;i++){
            sliderRight.sendKeys(Keys.ARROW_RIGHT);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectQuickFlip(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.id("AssetstrategyId_checkbox_7")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Asset Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clickCollateral(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Collateral:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectCrossCollateralized(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("CollateralId_checkbox_2")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Collateral:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clickAssetTypes(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        //executeScript("scrollTo(0,500)");
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Types:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectRetailOption(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_2")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Asset Types:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectValueAdd(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_3")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectPlansApproved(){
        //wait until deal stage field appears
        WaitUtil.simpleSleep(100);
        findElement(By.id("DealstageId_checkbox_4")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectREOOption(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
        findElement(By.id("AssetstatusId_checkbox_2")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectBank(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
        findElement(By.id("SubroleId_checkbox_38")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Lender Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }


}
