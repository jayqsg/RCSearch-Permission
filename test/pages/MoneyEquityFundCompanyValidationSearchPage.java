package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;


public class MoneyEquityFundCompanyValidationSearchPage extends FluentWebDriverPage{
    test.Support.ReadData ReadData = new test.Support.ReadData();


    public MoneyEquityFundCompanyValidationSearchPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void verifyCompanyNameNotDisplayedMoneyFund(String strCompanyNameMoneyFund){
        //wait util page load
        WaitUtil.simpleSleep(10000);
        Assert.assertFalse(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'" + strCompanyNameMoneyFund + "')]"), getDriverProvider().get()));
    }

    public void selectOfficeAndSolar(){
        //wait util page load
        WaitUtil.simpleSleep(100);
        findElement(By.id("AssettypeId_checkbox_16")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearOfficeAndSolar(){
        //wait util page load
        WaitUtil.simpleSleep(100);
        findElement(By.id("AssettypeId_checkbox_1")).click();
        findElement(By.id("AssettypeId_checkbox_16")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void scroll(){
        executeScript("scrollTo(150,0)");
    }

    public void clickAssetStrategyField(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        scroll();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectAdvisorAndSpecialServicer(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(10000);
        findElement(By.id("SubroleId_checkbox_71")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearAdvisorAndSpecialServicer(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_71")).click();
        findElement(By.id("SubroleId_checkbox_18")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectBrokerOrIntermediary(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_20")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectConsultant(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_20")).click();
        findElement(By.id("SubroleId_checkbox_22")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectEB5Program(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_22")).click();
        findElement(By.id("SubroleId_checkbox_24")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectFamilyOffice(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_24")).click();
        findElement(By.id("SubroleId_checkbox_26")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectFundOfFunds(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_26")).click();
        findElement(By.id("SubroleId_checkbox_28")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        WaitUtil.simpleSleep(10000);
    }

    public void selectHedgeFund(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_28")).click();
        findElement(By.id("SubroleId_checkbox_30")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        WaitUtil.simpleSleep(10000);
    }

    public void selectIndividualInvestor(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_30")).click();
        findElement(By.id("SubroleId_checkbox_32")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        WaitUtil.simpleSleep(10000);
    }

    public void selectInvestmentManager(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_32")).click();
        findElement(By.id("SubroleId_checkbox_34")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        WaitUtil.simpleSleep(10000);
    }

    public void selectNCREIFStyleTrust(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_34")).click();
        findElement(By.id("SubroleId_checkbox_36")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        WaitUtil.simpleSleep(10000);
    }

    public void selectOwnerOperator(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_36")).click();
        findElement(By.id("SubroleId_checkbox_64")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        WaitUtil.simpleSleep(10000);
    }

    public void selectPrivateEquityRealEstateFund(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_64")).click();
        findElement(By.id("SubroleId_checkbox_66")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        WaitUtil.simpleSleep(10000);

    }

    public void selectPublicREIT(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_66")).click();
        findElement(By.id("SubroleId_checkbox_68")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        WaitUtil.simpleSleep(10000);

    }

    public void selectSovereignWealthFund(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_68")).click();
        findElement(By.id("SubroleId_checkbox_70")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        WaitUtil.simpleSleep(10000);

    }

    public void selectBank(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_70")).click();
        findElement(By.id("SubroleId_checkbox_19")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        WaitUtil.simpleSleep(10000);

    }

    public void selectConstructionLender(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_19")).click();
        findElement(By.id("SubroleId_checkbox_21")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        WaitUtil.simpleSleep(10000);

    }

    public void selectCrowdFundingPlatform(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_21")).click();
        findElement(By.id("SubroleId_checkbox_23")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        WaitUtil.simpleSleep(10000);

    }

    public void selectEndowmentAndFoundation(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_23")).click();
        findElement(By.id("SubroleId_checkbox_25")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        WaitUtil.simpleSleep(10000);

    }

    public void selectFund(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_25")).click();
        findElement(By.id("SubroleId_checkbox_27")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        WaitUtil.simpleSleep(10000);
    }

    public void selectGovernmentAgency(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_27")).click();
        findElement(By.id("SubroleId_checkbox_29")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        WaitUtil.simpleSleep(10000);
    }

    public void selectHighNet(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_29")).click();
        findElement(By.id("SubroleId_checkbox_31")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        WaitUtil.simpleSleep(10000);
    }

    public void selectInsuranceCompany(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_31")).click();
        findElement(By.id("SubroleId_checkbox_33")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        WaitUtil.simpleSleep(10000);
    }

    public void selectMezzanine(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_33")).click();
        findElement(By.id("SubroleId_checkbox_35")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        WaitUtil.simpleSleep(10000);
    }

    public void selectOtherInstitutional(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_35")).click();
        findElement(By.id("SubroleId_checkbox_63")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        WaitUtil.simpleSleep(10000);
    }

    public void selectPensionFund(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_63")).click();
        findElement(By.id("SubroleId_checkbox_65")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        WaitUtil.simpleSleep(10000);
    }

    public void selectPrivateREIT(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_65")).click();
        findElement(By.id("SubroleId_checkbox_67")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        WaitUtil.simpleSleep(10000);
    }

    public void selectSeniorLender(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_67")).click();
        findElement(By.id("SubroleId_checkbox_69")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        WaitUtil.simpleSleep(10000);
    }

    public void selectSpecialServicer(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_69")).click();
        findElement(By.id("SubroleId_checkbox_71")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        WaitUtil.simpleSleep(10000);
    }

    public void clearSpecialServicer(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_71")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-3']/div/label[contains(text(),'Investor Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }




}
