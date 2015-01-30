package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import test.Support.ReadData;


public class CompanyOfAdvisorSearchPage extends FluentWebDriverPage {
    ReadData ReadData = new ReadData();
    public CompanyOfAdvisorSearchPage(WebDriverProvider driverProvider){
        super(driverProvider);

    }

    public void verifyFindOfAdvisor(){
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//div[@id='searchFilters']/div/span[contains(text(),'Find:')]/strong[contains(text(),'RE Advisors')]"),getDriverProvider().get()));
    }

    public void verifySubroleOfAdvisor(){
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//div[@id='searchFilters']/div/span[contains(text(),'Subrole:')]/strong[contains(text(),'Advisor')]"),getDriverProvider().get()));
    }

    public void verifyStrategy(){
        executeScript("scroll(550,0)");
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//div[@id='searchFilters']/div/span[contains(text(),'Strategy:')]/strong[contains(text(),'Appraisals')]"),getDriverProvider().get()));
    }

    public void verifyProjectManagementInStrategy(){
        executeScript("scroll(550,0)");
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//div[@id='searchFilters']/div/span[contains(text(),'Strategy:')]/strong[contains(text(),'Project Management')]"),getDriverProvider().get()));
    }

    public void clickAdvisorCompany(int RowIndex){
        try{
            WaitUtil.simpleSleep(3000);
            String strAppraisalCompany = ReadData.readDataExcel("RealEstateDetails", RowIndex, "AdvisorCompany");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strAppraisalCompany+"')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void clickServiceUser(int RowIndex){
        try{
            String strServiceUser = ReadData.readDataExcel("RealEstateDetails", RowIndex, "VerifyProject");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strServiceUser+"')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void selectAssetExperienceDropDown(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
        executeScript("scroll(0,250)");
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Asset Experience:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void verifyAdvisorCompany(int RowIndex) throws Exception {
         //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        String strAdvisorCompanyName = ReadData.readDataExcel("RealEstateDetails", RowIndex, "AdvisorCompany");
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAdvisorCompanyName+"')]"), getDriverProvider().get()));
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectOfficeAssetExperience(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        executeScript("scroll(550,0)");
        findElement(By.id("AssettypeId_checkbox_1")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Asset Experience:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clickDealStage(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectOwnedOptionInDealStage(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_1")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clickMissouriState(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Select States:')]/parent::div/div/multi-selectbox/div/div/div/div/div/div[@class='col-md-9']/label[contains(text(),'Missouri')]")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Select States:')]/parent::div/div/multi-selectbox/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void enterAndSelectInkCity(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Cities:')]/parent::div/div/multi-selectbox/div/div/div/input")).sendKeys("Ink");
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Cities:')]/parent::div/div/multi-selectbox/div/div/div/div/div/div[@class='col-md-9']/label[contains(text(),'Ink (Missouri)')]")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Cities:')]/parent::div/div/multi-selectbox/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        WaitUtil.simpleSleep(5000);
    }
}

























































    /*public void clickProfile(){
        findElement(By.id("ui-accordion-1-header-0")).click();
    }

    public void numOfOffice(int RowIndex){
        try{
            String strFromOffice = ReadData.readDataExcel("RealEstateDetails", RowIndex, "FromOffice");
            String strToOffice = ReadData.readDataExcel("RealEstateDetails", RowIndex, "ToOffice");
            findElement(By.id("ProjectFromOffices")).sendKeys(strFromOffice);
            findElement(By.id("ProjectToOffices")).sendKeys(strToOffice);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void numOfProfessional(int RowIndex){
        try{
            String strFromEmployee = ReadData.readDataExcel("RealEstateDetails", RowIndex, "FromEmployee");
            String strToEmployee = ReadData.readDataExcel("RealEstateDetails", RowIndex, "ToEmployee");
            findElement(By.id("ProjectFromNumberOfEmployees")).sendKeys(strFromEmployee);
            findElement(By.id("ProjectToNumberOfEmployees")).sendKeys(strToEmployee);
        } catch (Exception e) {
            System.out.println(e);
        }
        executeScript("scrollTo(250,0)");
    } */







