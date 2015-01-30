package test.pages;


import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.Support.ReadData;

public class InvestmentFundCompanyPage extends FluentWebDriverPage{
    ReadData ReadData = new ReadData();

    public InvestmentFundCompanyPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void verifyKindInFund(int RowIndex){
        try {
            String strKindName = ReadData.readDataExcel("Investments", RowIndex, "KindInSearchOption");
            //findElement(By.xpath("//div[@id='searchFilters']/div/span/strong[contains(text(),'"+ strKindName+"')]")).isDisplayed();
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//div[@id='searchFilters']/div/span/strong[contains(text(),'"+strKindName+"')]"),getDriverProvider().get()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyRiskInFund(int RowIndex){
        try {
            //wait until page loads
            WaitUtil.simpleSleep(500);
            String strRiskName = ReadData.readDataExcel("Investments", RowIndex, "RiskInSearchOption");
            //findElement(By.xpath("//div[@id='searchFilters']/div/span/strong[contains(text(),'"+strRiskName+"')]")).isDisplayed();
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//div[@id='searchFilters']/div/span/strong[contains(text(),'"+strRiskName+"')]"),getDriverProvider().get()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickCompanyName(int RowIndex){
        try{
            String strCompany = ReadData.readDataExcel("Investments", RowIndex, "FundCompany");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strCompany+"')]")).click();
        }catch (Exception e) {
            System.out.println(e);
        }
    }

    public void clickOnFundOfInvestor(int RowIndex){
        try{
            String strFundOfInvestor = ReadData.readDataExcel("Investments", RowIndex, "FundOfInvestor");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strFundOfInvestor+"')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void clickOnFundOfDealSponsor(int RowIndex){
        try{
            String strFundOfDealSponsor = ReadData.readDataExcel("Investments", RowIndex, "FundOfDealSponsor");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strFundOfDealSponsor+"')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void selectCoDeveloper(){
        //wait until drop down appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_4")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Investing As:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until drop down appears
        WaitUtil.simpleSleep(10000);
    }

    public void verifyCompanyOfInvestmentFund(int RowIndex){
        try {
            String strCompanyNameOfFund = ReadData.readDataExcel("Investments", RowIndex, "FundCompany");
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strCompanyNameOfFund+"')]"),getDriverProvider().get()));
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void clickRouteToInvestment(){
        //wait until field appears
        WaitUtil.simpleSleep(500);
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Route to Investment:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectIntermediary(){

        //wait until drop down appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_2")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Route to Investment:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();

        //wait until drop down appears
        WaitUtil.simpleSleep(10000);
    }

    public void clickFundStrategy(){
        //wait until asset field appears
        WaitUtil.simpleSleep(1000);
        executeScript("scrollTo(0,150)");
        findElement(By.id("ui-accordion-1-header-1")).click();
    }

    public void clickAssetType(){
        //wait until asset field appears
        WaitUtil.simpleSleep(5000);
        executeScript("scroll(0,750)");
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Asset Type')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until asset field appears
        WaitUtil.simpleSleep(5000);
    }

    public void selectSolarAsset(){
        //wait until asset field is displayed
        WaitUtil.simpleSleep(1000);
        findElement(By.id("AssettypeId_checkbox_16")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Asset Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until asset field appears
        WaitUtil.simpleSleep(5000);
    }

    public void selectRezoning(){
        //wait until deal stage field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_14")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Asset Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until asset field appears
        WaitUtil.simpleSleep(10000);
    }

    public void checkSyndicators(){
        //wait until field is displayed
        WaitUtil.simpleSleep(500);
        findElement(By.id("syndications_")).click();
        //wait until page load
        WaitUtil.simpleSleep(20000);
    }

    public void enterAndSelectYerbaCity(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        executeScript("scroll(150,0)");
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Cities:')]/parent::div/div/multi-selectbox/div/div/div/input")).sendKeys("Yerba");
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Cities:')]/parent::div/div/multi-selectbox/div/div/div/div/div/div[@class='col-md-9']/label[contains(text(),'Yerba (West Virginia)')]")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Cities:')]/parent::div/div/multi-selectbox/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

}
