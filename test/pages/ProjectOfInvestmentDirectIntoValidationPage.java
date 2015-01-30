package test.pages;


import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.*;
import test.Support.ReadData;
import test.steps.VerificationStatements;

import java.util.List;

public class ProjectOfInvestmentDirectIntoValidationPage extends FluentWebDriverPage{
    ReadData ReadData = new ReadData();

    public ProjectOfInvestmentDirectIntoValidationPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void verifyProjectNameOfInvestmentsIsDisplayed(String strProjectName,String strListingName){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strProjectName+"')]"), getDriverProvider().get()));
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strListingName+"')]"), getDriverProvider().get()));
    }

    public void verifyProjectNameOfInvestmentsNotDisplayed(String strProject, String strListingProject){
        try{
        //wait until page loads
        WaitUtil.simpleSleep(10000);
        Assert.assertFalse(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strProject+"')]"), getDriverProvider().get()));
        Assert.assertFalse(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strListingProject+"')]"), getDriverProvider().get()));
        } catch(AssertionError A){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Project Deal and List Project Is displayed in search Or ProjectD and ProjectL1 is displayed in the list\n";
        }
    }

    public void selectInvestmentAmount(){
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<60;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
            //wait until page loads
            WaitUtil.simpleSleep(700);
        }
        //wait until page loads
        WaitUtil.simpleSleep(20000);
    }

    public void clearInvestmentAmount(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<60;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
            //wait until page loads
            WaitUtil.simpleSleep(500);
        }
        //wait until page loads
        WaitUtil.simpleSleep(20000);
    }

    public void selectValueOfDealSize(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<60;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
            //wait until page loads
            WaitUtil.simpleSleep(200);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[2]"));
        for(int i=0;i<30;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
            //wait until page loads
            WaitUtil.simpleSleep(200);
        }
        //wait until page loads
        WaitUtil.simpleSleep(20000);
    }

    public void clearValueOfDealSize(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<60;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
            //wait until page loads
            WaitUtil.simpleSleep(200);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[2]"));
        for(int i=70;i<100;i++){
            sliderRight.sendKeys(Keys.ARROW_RIGHT);
            //wait until page loads
            WaitUtil.simpleSleep(200);
        }
        //wait until page loads
        WaitUtil.simpleSleep(20000);
    }


    public boolean projectOfInvestmentsNotDisplayed(int RowIndex, String strColumnName){
        //wait until page gets loaded
        WaitUtil.simpleSleep(10000);
        executeScript("scrollTo(0,550)");
        boolean status = false;
        try{
            List<WebElement> links;
            links =  findElements(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span"));
            int linksCount = links.size();
            linksCount = linksCount/2;
            for(int i=1;i<=linksCount;i++){
                String strCompanyName = ReadData.readDataExcel("Investments", RowIndex, strColumnName);
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


    public void projectOfInvestmentsIsDisplayed(int RowIndex,String strColumnName){
        //wait until page gets loaded
        WaitUtil.simpleSleep(6000);
        executeScript("scrollTo(0,550)");
        try {
            String strOtherUser = ReadData.readDataExcel("Investments", RowIndex, strColumnName);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strOtherUser+"')]"), getDriverProvider().get()));
        }
        catch (Exception e) {
            System.out.println(e);
        }
        executeScript("scrollTo(0,550)");
    }

    public void selectGeneralAndLimited(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
        findElement(By.id("InvestortypeId_checkbox_2")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investing As:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearGeneralAndLimited(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
        findElement(By.id("InvestortypeId_checkbox_1")).click();
        findElement(By.id("InvestortypeId_checkbox_2")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investing As:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectFullyRentedAndReo(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
        findElement(By.id("AssetstatusId_checkbox_2")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearFullyRentedAndReo(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
        findElement(By.id("AssetstatusId_checkbox_1")).click();
        findElement(By.id("AssetstatusId_checkbox_2")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectCOC_InvestmentDirectInto(){
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[1]/div[1]/div/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
            //wait until page loads
            WaitUtil.simpleSleep(700);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[1]/div[1]/div/div/div[2]/a[2]"));
        for(int i=0;i<10;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
            //wait until page loads
            WaitUtil.simpleSleep(700);
        }
        //wait until page loads
        WaitUtil.simpleSleep(20000);
    }

    public void clearCOC_InvestmentDirectInto(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[1]/div[1]/div/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[1]/div[1]/div/div/div[2]/a[2]"));
        for(int i=90;i<100;i++){
            sliderRight.sendKeys(Keys.ARROW_RIGHT);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectIRR_InvestmentDirectInto(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[2]/div[1]/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
            //wait until page loads
            WaitUtil.simpleSleep(700);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[2]/div[1]/div[1]/div/div[2]/a[2]"));
        for(int i=0;i<10;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
        //wait until page loads
        WaitUtil.simpleSleep(20000);
    }

    public void clearIRR_InvestmentDirectInto(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[2]/div[1]/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[2]/div[1]/div[1]/div/div[2]/a[2]"));
        for(int i=90;i<100;i++){
            sliderRight.sendKeys(Keys.ARROW_RIGHT);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectROE_InvestmentDirectInto(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[2]/div[1]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
            //wait until page loads
            WaitUtil.simpleSleep(700);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[2]/div[1]/div[2]/div/div[2]/a[2]"));
        for(int i=0;i<10;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
        //wait until page loads
        WaitUtil.simpleSleep(20000);
    }

    public void clearROE_InvestmentDirectInto(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[2]/div[1]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[2]/div[1]/div[2]/div/div[2]/a[2]"));
        for(int i=90;i<100;i++){
            sliderRight.sendKeys(Keys.ARROW_RIGHT);
        }
        //wait until page loads
        WaitUtil.simpleSleep(20000);
    }

    public void selectCAP_InvestmentDirectInto(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[3]/div[1]/div/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
            //wait until page loads
            WaitUtil.simpleSleep(600);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[3]/div[1]/div/div/div[2]/a[2]"));
        for(int i=0;i<10;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
            //wait until page loads
            WaitUtil.simpleSleep(600);
        }
        //wait until page loads
        WaitUtil.simpleSleep(20000);
    }

    public void clearCAP_InvestmentDirectInto(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[3]/div[1]/div/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[3]/div[1]/div/div/div[2]/a[2]"));
        for(int i=90;i<100;i++){
            sliderRight.sendKeys(Keys.ARROW_RIGHT);
        }

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectMin_InvestmentDirectInto(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[4]/div/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
            //wait until page loads
            WaitUtil.simpleSleep(500);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[4]/div/div[1]/div/div[2]/a[2]"));
        for(int i=0;i<10;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);

        }
        //wait until page loads
        WaitUtil.simpleSleep(20000);
    }

    public void clearMin_InvestmentDirectInto(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[4]/div/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[4]/div/div[1]/div/div[2]/a[2]"));
        for(int i=90;i<100;i++){
            sliderRight.sendKeys(Keys.ARROW_RIGHT);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectMax_InvestmentDirectInto(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[4]/div/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
            //wait until page loads
            WaitUtil.simpleSleep(500);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[4]/div/div[2]/div/div[2]/a[2]"));
        for(int i=0;i<10;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
        //wait until page loads
        WaitUtil.simpleSleep(20000);
    }

    public void clearMax_InvestmentDirectInto(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[4]/div/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/ul/li[4]/div/div[2]/div/div[2]/a[2]"));
        for(int i=90;i<100;i++){
            sliderRight.sendKeys(Keys.ARROW_RIGHT);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }


    public void selectCOC(){
         WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/ul/li[1]/div[1]/div/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
            //wait until page loads
            WaitUtil.simpleSleep(700);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/ul/li[1]/div[1]/div/div/div[2]/a[2]"));
        for(int i=0;i<10;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
            //wait until page loads
            WaitUtil.simpleSleep(700);
        }
        //wait until page loads
        WaitUtil.simpleSleep(20000);
    }

    public void clearCOC(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/ul/li[1]/div[1]/div/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/ul/li[1]/div[1]/div/div/div[2]/a[2]"));
        for(int i=90;i<100;i++){
            sliderRight.sendKeys(Keys.ARROW_RIGHT);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectIRR(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/ul/li[2]/div[1]/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
            //wait until page loads
            WaitUtil.simpleSleep(700);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/ul/li[2]/div[1]/div[1]/div/div[2]/a[2]"));
        for(int i=0;i<10;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
        //wait until page loads
        WaitUtil.simpleSleep(20000);
    }

    public void clearIRR(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/ul/li[2]/div[1]/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/ul/li[2]/div[1]/div[1]/div/div[2]/a[2]"));
        for(int i=90;i<100;i++){
            sliderRight.sendKeys(Keys.ARROW_RIGHT);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectROE(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/ul/li[2]/div[1]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
            //wait until page loads
            WaitUtil.simpleSleep(700);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/ul/li[2]/div[1]/div[2]/div/div[2]/a[2]"));
        for(int i=0;i<10;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
        //wait until page loads
        WaitUtil.simpleSleep(20000);
    }

    public void clearROE(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/ul/li[2]/div[1]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/ul/li[2]/div[1]/div[2]/div/div[2]/a[2]"));
        for(int i=90;i<100;i++){
            sliderRight.sendKeys(Keys.ARROW_RIGHT);
        }
        //wait until page loads
        WaitUtil.simpleSleep(20000);
    }

    public void selectCAP(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/ul/li[3]/div[1]/div/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
            //wait until page loads
            WaitUtil.simpleSleep(600);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/ul/li[3]/div[1]/div/div/div[2]/a[2]"));
        for(int i=0;i<10;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
            //wait until page loads
            WaitUtil.simpleSleep(600);
        }
        //wait until page loads
        WaitUtil.simpleSleep(20000);
    }

    public void clearCAP(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/ul/li[3]/div[1]/div/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/ul/li[3]/div[1]/div/div/div[2]/a[2]"));
        for(int i=90;i<100;i++){
            sliderRight.sendKeys(Keys.ARROW_RIGHT);
        }

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectMin(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/ul/li[4]/div/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
            //wait until page loads
            WaitUtil.simpleSleep(500);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/ul/li[4]/div/div[1]/div/div[2]/a[2]"));
        for(int i=0;i<10;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);

        }
        //wait until page loads
        WaitUtil.simpleSleep(20000);
    }

    public void clearMin(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/ul/li[4]/div/div[1]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/ul/li[4]/div/div[1]/div/div[2]/a[2]"));
        for(int i=90;i<100;i++){
            sliderRight.sendKeys(Keys.ARROW_RIGHT);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectMax(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/ul/li[4]/div/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
            //wait until page loads
            WaitUtil.simpleSleep(500);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/ul/li[4]/div/div[2]/div/div[2]/a[2]"));
        for(int i=0;i<10;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
        //wait until page loads
        WaitUtil.simpleSleep(20000);
    }

    public void clearMax(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/ul/li[4]/div/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/ul/li[4]/div/div[2]/div/div[2]/a[2]"));
        for(int i=90;i<100;i++){
            sliderRight.sendKeys(Keys.ARROW_RIGHT);
        }

        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectCoGpOption(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.id("InvestortypeId_checkbox_3")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_3"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investing As:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectCoLeadOption(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("InvestortypeId_checkbox_3")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("InvestortypeId_checkbox_3"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("InvestortypeId_checkbox_5")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_5"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investing As:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(1000);
    }

    public void selectCoDeveloper(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("InvestortypeId_checkbox_5")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("InvestortypeId_checkbox_5"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("InvestortypeId_checkbox_4")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_4"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investing As:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(1000);
    }

    public void selectOtherInvestor()throws ElementNotVisibleException {
        boolean bnlFound = false;
        int intCount = 0;
        while (!bnlFound && intCount <= 5){
            try{
                findElement(By.id("InvestortypeId_checkbox_4")).click();
                VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("InvestortypeId_checkbox_4"));
                WaitUtil.simpleSleep(5000);
                findElement(By.id("InvestortypeId_checkbox_6")).click();
                VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_6"));
                findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investing As:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
                bnlFound= true;
            }catch(ElementNotVisibleException e){
                WaitUtil.simpleSleep(1000);
                intCount = intCount+1;
            }
        }
    }

    public void selectAllOptionOfInvestingAs(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("InvestortypeId_checkbox_6")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("InvestortypeId_checkbox_6"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("InvestortypeId_checkbox_-1")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("InvestortypeId_checkbox_-1"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investing As:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearAllOptionOfInvestingAs(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("InvestortypeId_checkbox_-1")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investing As:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectPartiallyStabilized(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.id("AssetstatusId_checkbox_3")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssetstatusId_checkbox_3"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(1000);
    }

    public void selectVacant(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstatusId_checkbox_3")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("AssetstatusId_checkbox_3"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("AssetstatusId_checkbox_5")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssetstatusId_checkbox_5"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(1000);
    }

    public void selectUnderConstruction(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstatusId_checkbox_5")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("AssetstatusId_checkbox_5"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("AssetstatusId_checkbox_7")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.id("AssetstatusId_checkbox_7"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(1000);
    }

    public void selectAll(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstatusId_checkbox_7")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("AssetstatusId_checkbox_7"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("AssetstatusId_checkbox_-1")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.id("AssetstatusId_checkbox_-1"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(1000);
    }

    public void selectReo(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstatusId_checkbox_-1")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("AssetstatusId_checkbox_-1"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("AssetstatusId_checkbox_2")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.id("AssetstatusId_checkbox_2"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(1000);
    }

    public void selectVacantStructure(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstatusId_checkbox_2")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("AssetstatusId_checkbox_2"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("AssetstatusId_checkbox_4")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.id("AssetstatusId_checkbox_4"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(1000);
    }

    public void selectPartiallyRented(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstatusId_checkbox_4")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("AssetstatusId_checkbox_4"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("AssetstatusId_checkbox_6")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.id("AssetstatusId_checkbox_6"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(1000);
    }

    public void selectEntitled(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstatusId_checkbox_6")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("AssetstatusId_checkbox_6"));
        WaitUtil.simpleSleep(5000);
        findElement(By.id("AssetstatusId_checkbox_8")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("AssetstatusId_checkbox_8"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(1000);
    }

    public void clearEntitled(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssetstatusId_checkbox_8")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("AssetstatusId_checkbox_8"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Current Asset Status:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(1000);
    }


    public void clickGeographicalCoverage_Investment(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        findElement(By.id("ui-accordion-1-header-2")).click();
        WaitUtil.simpleSleep(1000);
    }

    public void clickOnCountries_Investment(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        executeScript("scroll(150,0)");
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/div/div/div/strong[contains(text(),'Countries:')]/parent::div/div/multi-selectbox/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        WaitUtil.simpleSleep(1000);
    }

    public void selectUnitedStatesCheckBox_Investment(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/div/div/div/strong[contains(text(),'Countries:')]/parent::div/div/multi-selectbox/div/div/div/div/div/div[@class='col-md-9']/label[contains(text(),'United States')]")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/div/div/div/strong[contains(text(),'Countries:')]/parent::div/div/multi-selectbox/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        WaitUtil.simpleSleep(1000);
    }

    public void clickRegionField_Investment(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/div/div/div/strong[contains(text(),'Regions:')]/parent::div/div/multi-selectbox/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        WaitUtil.simpleSleep(1000);
    }

    public void clickNorthEast_Investment(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/div/div/div/strong[contains(text(),'Regions:')]/parent::div/div/multi-selectbox/div/div/div[@class='row']/div/div/div[@class='col-md-9']/label[contains(text(),'Northeast')]")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/div/div/div/strong[contains(text(),'Regions:')]/parent::div/div/multi-selectbox/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        WaitUtil.simpleSleep(1000);
    }

    public void clickNewJerseyState(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        JavascriptExecutor jse = (JavascriptExecutor)getDriverProvider().get();
        jse.executeScript("window.scrollBy(0,500)", "");
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/div/div/div/strong[contains(text(),'Select States:')]/parent::div/div/multi-selectbox/div/div/div/div/div/div[@class='col-md-9']/label[contains(text(),'New Jersey')]")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/div/div/div/strong[contains(text(),'Select States:')]/parent::div/div/multi-selectbox/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        WaitUtil.simpleSleep(1000);
    }

    public void clickStatesField_Investment(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/div/div/div/strong[contains(text(),'Select States:')]/parent::div/div/multi-selectbox/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        WaitUtil.simpleSleep(1000);
    }

    public void clickCitiesField_Investment(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/div/div/div/strong[contains(text(),'Cities:')]/parent::div/div/multi-selectbox/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        WaitUtil.simpleSleep(1000);
    }

    public void enterAndSelectKearnyCity(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        executeScript("scroll(150,0)");
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/div/div/div/strong[contains(text(),'Cities:')]/parent::div/div/multi-selectbox/div/div/div/input")).sendKeys("Kearny");
        WaitUtil.simpleSleep(3000);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/div/div/div/strong[contains(text(),'Cities:')]/parent::div/div/multi-selectbox/div/div/div/div/div/div[@class='col-md-9']/label[contains(text(),'Kearny (New Jersey)')]")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/div/div/div/strong[contains(text(),'Cities:')]/parent::div/div/multi-selectbox/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        WaitUtil.simpleSleep(1000);
    }
}
