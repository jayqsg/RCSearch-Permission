package test.pages;


import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.*;
import test.Support.ReadData;
import test.steps.VerificationStatements;

public class MoneyDebtLoanCompanyPage extends FluentWebDriverPage{
    ReadData ReadData = new test.Support.ReadData();

    public MoneyDebtLoanCompanyPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void verifyFindInMoneyDebtLoan(int RowIndex){
        try {
            String strFindName = ReadData.readDataExcel("Money", RowIndex, "FindInSearchOption");
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//div[@id='searchFilters']/div/span/strong[contains(text(),'"+strFindName+"')]"), getDriverProvider().get()));
        } catch (ElementNotVisibleException EV){
            System.out.println(EV);
        } catch (Exception e) {
            e.printStackTrace();
        } catch (AssertionError A){
            System.out.println(A);
        }
    }

    public void verifyLoanInMoneyDebtLoan(int RowIndex){
        try {
            String strLoanName = ReadData.readDataExcel("Money", RowIndex, "LoanInSearchOption");
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//div[@id='searchFilters']/div/span/strong[contains(text(),'"+strLoanName+"')]"), getDriverProvider().get()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyCompanyNameDebtLoan(String strCompanyNameDebtLoan){
        try{
        //wait util page load
        WaitUtil.simpleSleep(100);
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strCompanyNameDebtLoan+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Angel Company is Not Retrieved in Search Result\n";
        }
    }

    public void verifyCompanyNameDebtLoanIsNotDisplayed(String strCompanyName){
        //wait util page load
        WaitUtil.simpleSleep(100);
        Assert.assertFalse(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'" + strCompanyName + "')]"), getDriverProvider().get()));
    }

    public void setLoanAmount(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<20;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
            //wait until page loads
            WaitUtil.simpleSleep(150);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[2]"));
        for(int i=0;i<50;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
            //wait until page loads
            WaitUtil.simpleSleep(150);
        }
        //wait until page loads
        WaitUtil.simpleSleep(15000);
    }

    public void clearLoanAmount(){
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<20;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[2]"));
        for(int i=50;i<100;i++){
            sliderRight.sendKeys(Keys.ARROW_RIGHT);
        }
        //wait until page loads
        WaitUtil.simpleSleep(15000);
    }

    public void setLTVField(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/div/div[2]/a[1]"));
        for(int i=0;i<12;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/div/div[2]/a[2]"));
        for(int i=0;i<20;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
        //wait until page loads
        WaitUtil.simpleSleep(15000);
    }

    public void clearLTVField(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/div/div[2]/a[1]"));
        for(int i=0;i<12;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/div/div[2]/a[2]"));
        for(int i=0;i<20;i++){
            sliderRight.sendKeys(Keys.ARROW_RIGHT);
        }
        //wait until page loads
        WaitUtil.simpleSleep(15000);
    }

    public void setTerm(){
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[4]/div/div[2]/a[1]"));
        for(int i=0;i<20;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[4]/div/div[2]/a[2]"));
        for(int i=0;i<50;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
        //wait until page loads
        WaitUtil.simpleSleep(15000);
    }

    public void clearTerm(){
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[4]/div/div[2]/a[1]"));
        for(int i=0;i<20;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[4]/div/div[2]/a[2]"));
        for(int i=50;i<100;i++){
            sliderRight.sendKeys(Keys.ARROW_RIGHT);
        }
        //wait until page loads
        WaitUtil.simpleSleep(15000);
    }

    public void selectInsuranceCompany(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_48")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("SubroleId_checkbox_48"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Lender Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearInsuranceCompany(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_48")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("SubroleId_checkbox_48"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Lender Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clickRouteToLender(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
      /*  WebElement footerElement = findElement(By.xpath("//div[@id='footer']"));
        Point position = footerElement.getLocation();
        executeScript("scrollTo(0," + position.getY() + ")");*/
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Route To Lender:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    /*public void clickRouteToLenderField(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
      *//*  WebElement footerElement = findElement(By.xpath("//div[@id='footer']"));
        Point position = footerElement.getLocation();
        executeScript("scrollTo(0," + position.getY() + ")");*//*
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Route To Lender:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }*/

    public void selectBrokerOption(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_3")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.id("RouteId_checkbox_3"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Route To Lender:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearBrokerOption(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_3")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("RouteId_checkbox_3"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Route To Lender:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clickPlatformBuild(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_2")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearPlatformBuild(){
        //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_2")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clickNewYorkState(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        JavascriptExecutor jse = (JavascriptExecutor)getDriverProvider().get();
        jse.executeScript("window.scrollBy(0,500)", "");
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Select States:')]/parent::div/div/multi-selectbox/div/div/div/div/div/div[@class='col-md-9']/label[contains(text(),'New York')]")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Select States:')]/parent::div/div/multi-selectbox/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void enterAndSelectBuffaloCity(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Cities:')]/parent::div/div/multi-selectbox/div/div/div/input")).sendKeys("Buffalo");
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Cities:')]/parent::div/div/multi-selectbox/div/div/div/div/div/div[@class='col-md-9']/label[contains(text(),'Buffalo (New York)')]")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Cities:')]/parent::div/div/multi-selectbox/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }
}
