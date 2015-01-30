package test.pages;


import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import test.Support.ReadData;

public class InvestmentDirectIntoValidationPage extends FluentWebDriverPage {
    ReadData ReadData = new ReadData();
    public InvestmentDirectIntoValidationPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public boolean otherProject(int RowIndex, String strColumnName){
        boolean status = false;
        try {
            String strOtherUser = ReadData.readDataExcel("InvestmentBanker", RowIndex, strColumnName);
            //wait until page gets loaded
            WaitUtil.simpleSleep(500);
            //String strName = "//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strOtherUser+"')]";
            String strName = findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span")).getText();
            if(!strName.contains(strOtherUser))
            {
                status = true;
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return status;
    }

    public boolean otherListing(int RowIndex, String strColumnName){
        boolean status = false;
        try {
            String strOtherUser = ReadData.readDataExcel("InvestmentBanker", RowIndex, strColumnName);
            //wait until page gets loaded
            WaitUtil.simpleSleep(500);
            String strName = findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span")).getText();
            if(!strName.contains(strOtherUser))
            {
                status = true;
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public void verifyProject(int RowIndex,String strColumnName){
        try {
            String strOtherUser = ReadData.readDataExcel("InvestmentBanker", RowIndex, strColumnName);
            //wait until page gets loaded
            WaitUtil.simpleSleep(500);
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strOtherUser+"')]")).isDisplayed();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    public void verifyListing(int RowIndex,String strColumnName){
        try {
            String strOtherUser = ReadData.readDataExcel("InvestmentBanker", RowIndex, strColumnName);
            //wait until page gets loaded
            WaitUtil.simpleSleep(500);
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strOtherUser+"')]")).isDisplayed();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    public void selectMixedUse(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_12")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearMixedUse(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_12")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickRezonesChange(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_62")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearRezonesChange(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_62")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickHardMoney(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("EquitytypeId_checkbox_4")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Equity Type:')]/following-sibling::div/div/div/span[@class=\"arrow glyphicon glyphicon-chevron-down\"]")).click();
    }

    public void clearHardMoney(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("EquitytypeId_checkbox_4")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Equity Type:')]/following-sibling::div/div/div/span[@class=\"arrow glyphicon glyphicon-chevron-down\"]")).click();
    }

    public void clickReadyForPurchase(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_7")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class=\"arrow glyphicon glyphicon-chevron-down\"]")).click();
    }

    public void clearReadyForPurchase(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_7")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div/span[@class=\"arrow glyphicon glyphicon-chevron-down\"]")).click();
    }

    public void clickCoGp(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_3")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Structure:')]/following-sibling::div/div/div/span[@class=\"arrow glyphicon glyphicon-chevron-down\"]")).click();
    }

    public void clearCoGp(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_3")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Structure:')]/following-sibling::div/div/div/span[@class=\"arrow glyphicon glyphicon-chevron-down\"]")).click();
    }

    public void selectMezz(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("EquitytypeId_checkbox_3")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Equity Type:')]/following-sibling::div/div/div/span[@class=\"arrow glyphicon glyphicon-chevron-down\"]")).click();
    }

    public void selectPromoteEquity(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("EquitytypeId_checkbox_3")).click();
        findElement(By.id("EquitytypeId_checkbox_2")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Equity Type:')]/following-sibling::div/div/div/span[@class=\"arrow glyphicon glyphicon-chevron-down\"]")).click();
    }

    public void clearPromoteEquity(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("EquitytypeId_checkbox_2")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Equity Type:')]/following-sibling::div/div/div/span[@class=\"arrow glyphicon glyphicon-chevron-down\"]")).click();
    }

    public void enterDealSizeUser(int RowIndex){
        try{
            //wait until deal stage field appears
            WaitUtil.simpleSleep(500);
            String strProjectFrom = ReadData.readDataExcel("InvestmentBanker", RowIndex, "ProjectRangesFrom");
            String strProjectTo = ReadData.readDataExcel("InvestmentBanker", RowIndex, "ProjectRangesTo");
            //wait until deal stage field appears
            WaitUtil.simpleSleep(500);
            findElement(By.id("ProjectFromDealSize")).click();
            findElement(By.id("ProjectFromDealSize")).clear();
            findElement(By.id("ProjectFromDealSize")).sendKeys(strProjectFrom);
            findElement(By.id("ProjectToDealSize")).click();
            findElement(By.id("ProjectToDealSize")).clear();
            findElement(By.id("ProjectToDealSize")).sendKeys(strProjectTo);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void enterDealSizeRange(int RowIndex){
        try{
            //wait until deal stage field appears
            WaitUtil.simpleSleep(500);
            String strProjectFrom = ReadData.readDataExcel("InvestmentBanker", RowIndex, "ProjectRangesFrom");
            String strProjectTo = ReadData.readDataExcel("InvestmentBanker", RowIndex, "ProjectRangesTo");
            //wait until deal stage field appears
            WaitUtil.simpleSleep(500);
            findElement(By.id("ProjectFromDealSize")).click();
            findElement(By.id("ProjectFromDealSize")).clear();
            findElement(By.id("ProjectFromDealSize")).sendKeys(strProjectFrom);
            findElement(By.id("ProjectToDealSize")).click();
            findElement(By.id("ProjectToDealSize")).clear();
            findElement(By.id("ProjectToDealSize")).sendKeys(strProjectTo);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public boolean verifyProject(int RowIndex){
        boolean status = false;
        try {
            String strOtherUser = ReadData.readDataExcel("InvestmentBanker", RowIndex, "InvestmentBankerProject");
            //wait until page gets loaded
            WaitUtil.simpleSleep(5000);
            String strName = findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span")).getText();
            //wait until page gets loaded
            WaitUtil.simpleSleep(5000);
            if(!strName.contains(strOtherUser))
            {
                status = true;
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public boolean verifyListing(int RowIndex){
        boolean status = false;
        try {
            String strOtherUser = ReadData.readDataExcel("InvestmentBanker", RowIndex, "InvestmentBankerListing");
            //wait until page gets loaded
            WaitUtil.simpleSleep(5000);
            String strName = findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span")).getText();
            //wait until page gets loaded
            WaitUtil.simpleSleep(5000);
            if(!strName.contains(strOtherUser))
            {
                status = true;
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public void enterInvestmentsAmount(int RowIndex){
        try{
            //wait until investment field appears
            WaitUtil.simpleSleep(500);
            String strAmountFrom = ReadData.readDataExcel("InvestmentBanker", RowIndex, "ProjectRangesFrom");
            String strAmountTo = ReadData.readDataExcel("InvestmentBanker", RowIndex, "ProjectRangesTo");
            findElement(By.id("ProjectFromEquityRequired")).click();
            findElement(By.id("ProjectFromEquityRequired")).clear();
            findElement(By.id("ProjectFromEquityRequired")).sendKeys(strAmountFrom);
            findElement(By.id("ProjectToEquityRequired")).click();
            findElement(By.id("ProjectToEquityRequired")).clear();
            findElement(By.id("ProjectToEquityRequired")).sendKeys(strAmountTo);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void enterInvestmentAmountField(int RowIndex){
        try{
            //wait until investment field appears
            WaitUtil.simpleSleep(500);
            String strAmountFrom = ReadData.readDataExcel("InvestmentBanker", RowIndex, "ProjectRangesFrom");
            String strAmountTo = ReadData.readDataExcel("InvestmentBanker", RowIndex, "ProjectRangesTo");
            findElement(By.id("ProjectFromEquityRequired")).click();
            findElement(By.id("ProjectFromEquityRequired")).clear();
            findElement(By.id("ProjectFromEquityRequired")).sendKeys(strAmountFrom);
            findElement(By.id("ProjectToEquityRequired")).click();
            findElement(By.id("ProjectToEquityRequired")).clear();
            findElement(By.id("ProjectToEquityRequired")).sendKeys(strAmountTo);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void enterValueForCashOnCash(int RowIndex){
        try{
            //wait until cash on cash field is found
            WaitUtil.simpleSleep(500);
            String strCashOnCashFrom = ReadData.readDataExcel("InvestmentBanker", RowIndex, "ProjectRangesFrom");
            String strCashOnCashTo = ReadData.readDataExcel("InvestmentBanker", RowIndex, "ProjectRangesTo");
            findElement(By.id("ProjectFromCashOnCash")).click();
            findElement(By.id("ProjectFromCashOnCash")).clear();
            findElement(By.id("ProjectFromCashOnCash")).sendKeys(strCashOnCashFrom);
            findElement(By.id("ProjectToCashOnCash")).click();
            findElement(By.id("ProjectToCashOnCash")).clear();
            findElement(By.id("ProjectToCashOnCash")).sendKeys(strCashOnCashTo);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void enterValuesForCashOnCash(int RowIndex){
        try{
            //wait until cash on cash field is found
            WaitUtil.simpleSleep(500);
            String strCashOnCashFrom = ReadData.readDataExcel("InvestmentBanker", RowIndex, "ProjectRangesFrom");
            String strCashOnCashTo = ReadData.readDataExcel("InvestmentBanker", RowIndex, "ProjectRangesTo");
            findElement(By.id("ProjectFromCashOnCash")).click();
            findElement(By.id("ProjectFromCashOnCash")).clear();
            findElement(By.id("ProjectFromCashOnCash")).sendKeys(strCashOnCashFrom);
            findElement(By.id("ProjectToCashOnCash")).click();
            findElement(By.id("ProjectToCashOnCash")).clear();
            findElement(By.id("ProjectToCashOnCash")).sendKeys(strCashOnCashTo);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void enterCapitalReturnIrr(int RowIndex){
        try{
            //wait until capital return field is found
            WaitUtil.simpleSleep(500);
            String strCashOnCashFrom = ReadData.readDataExcel("InvestmentBanker", RowIndex, "ProjectRangesFrom");
            String strCashOnCashTo = ReadData.readDataExcel("InvestmentBanker", RowIndex, "ProjectRangesTo");
            findElement(By.id("ProjectFromCapitalReturnIrr")).click();
            findElement(By.id("ProjectFromCapitalReturnIrr")).clear();
            findElement(By.id("ProjectFromCapitalReturnIrr")).sendKeys(strCashOnCashFrom);
            findElement(By.id("ProjectToCapitalReturnIrr")).click();
            findElement(By.id("ProjectToCapitalReturnIrr")).clear();
            findElement(By.id("ProjectToCapitalReturnIrr")).sendKeys(strCashOnCashTo);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void enterCapitalReturnIRR(int RowIndex){
        try{
            //wait until capital return field is found
            WaitUtil.simpleSleep(500);
            String strCashOnCashFrom = ReadData.readDataExcel("InvestmentBanker", RowIndex, "ProjectRangesFrom");
            String strCashOnCashTo = ReadData.readDataExcel("InvestmentBanker", RowIndex, "ProjectRangesTo");
            findElement(By.id("ProjectFromCapitalReturnIrr")).click();
            findElement(By.id("ProjectFromCapitalReturnIrr")).clear();
            findElement(By.id("ProjectFromCapitalReturnIrr")).sendKeys(strCashOnCashFrom);
            findElement(By.id("ProjectToCapitalReturnIrr")).click();
            findElement(By.id("ProjectToCapitalReturnIrr")).clear();
            findElement(By.id("ProjectToCapitalReturnIrr")).sendKeys(strCashOnCashTo);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void enterCapitalReturnsROE(int RowIndex){
        try{
            //wait until capital return field is found
            WaitUtil.simpleSleep(500);
            String strCashOnCashFrom = ReadData.readDataExcel("InvestmentBanker",RowIndex, "ProjectRangesFrom");
            String strCashOnCashTo = ReadData.readDataExcel("InvestmentBanker",RowIndex, "ProjectRangesTo");
            findElement(By.id("ProjectFromCapitalReturnRoe")).click();
            findElement(By.id("ProjectFromCapitalReturnRoe")).clear();
            findElement(By.id("ProjectFromCapitalReturnRoe")).sendKeys(strCashOnCashFrom);
            findElement(By.id("ProjectToCapitalReturnRoe")).click();
            findElement(By.id("ProjectToCapitalReturnRoe")).clear();
            findElement(By.id("ProjectToCapitalReturnRoe")).sendKeys(strCashOnCashTo);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void enterCAP(int RowIndex){
        try{
            //wait until CAP field is found
            WaitUtil.simpleSleep(500);
            String strCAPFrom = ReadData.readDataExcel("InvestmentBanker", RowIndex, "ProjectRangesFrom");
            String strCAPTo = ReadData.readDataExcel("InvestmentBanker", RowIndex, "ProjectRangesTo");
            findElement(By.id("ProjectFromCap")).click();
            findElement(By.id("ProjectFromCap")).clear();
            findElement(By.id("ProjectFromCap")).sendKeys(strCAPFrom);
            findElement(By.id("ProjectToCap")).click();
            findElement(By.id("ProjectToCap")).clear();
            findElement(By.id("ProjectToCap")).sendKeys(strCAPTo);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void enterHoldingMin(int RowIndex){
        try{
            //wait until holding min field is found
            WaitUtil.simpleSleep(500);
            String strHoldingMinFrom = ReadData.readDataExcel("InvestmentBanker", RowIndex, "ProjectRangesFrom");
            String strHoldingMinTo = ReadData.readDataExcel("InvestmentBanker", RowIndex, "ProjectRangesTo");
            findElement(By.id("ProjectFromHoldingYearsMin")).click();
            findElement(By.id("ProjectFromHoldingYearsMin")).clear();
            findElement(By.id("ProjectFromHoldingYearsMin")).sendKeys(strHoldingMinFrom);
            findElement(By.id("ProjectToHoldingYearsMin")).click();
            findElement(By.id("ProjectToHoldingYearsMin")).clear();
            findElement(By.id("ProjectToHoldingYearsMin")).sendKeys(strHoldingMinTo);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void enterHoldingMax(int RowIndex){
        try{
            //wait until holding max field is found
            WaitUtil.simpleSleep(500);
            String strHoldingMaxFrom = ReadData.readDataExcel("InvestmentBanker", RowIndex, "ProjectRangesFrom");
            String strHoldingMaxTo = ReadData.readDataExcel("InvestmentBanker", RowIndex, "ProjectRangesTo");
            findElement(By.id("ProjectFromHoldingYearsMax")).click();
            findElement(By.id("ProjectFromHoldingYearsMax")).clear();
            findElement(By.id("ProjectFromHoldingYearsMax")).sendKeys(strHoldingMaxFrom);
            findElement(By.id("ProjectToHoldingYearsMax")).click();
            findElement(By.id("ProjectToHoldingYearsMax")).clear();
            findElement(By.id("ProjectToHoldingYearsMax")).sendKeys(strHoldingMaxTo);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

