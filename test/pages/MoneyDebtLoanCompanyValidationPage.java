package test.pages;

/**
 * Created with IntelliJ IDEA.
 * User: Bhavana
 * Date: 6/17/14
 * Time: 12:42 PM
 * To change this template use File | Settings | File Templates.
 */

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import test.Support.ReadData;
import test.steps.VerificationStatements;


public class MoneyDebtLoanCompanyValidationPage extends FluentWebDriverPage {
    ReadData ReadData = new test.Support.ReadData();

    public MoneyDebtLoanCompanyValidationPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

  /*  public void verifyCompanyNameOfDebtLoan(String strCompanyNameOfDebtLoan){
        //wait util page load
        WaitUtil.simpleSleep(100);
        Assert.assertFalse(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'" + strCompanyNameOfDebtLoan + "')]"), getDriverProvider().get()));
    }*/

    public void companyNameOfDebtLoanNotDisplayed(int RowIndex, String strColumnName){
         //wait util page load
        WaitUtil.simpleSleep(100);
        try {
            String strCompanyName = ReadData.readDataExcel("Money", RowIndex, strColumnName);
            Assert.assertFalse(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strCompanyName+"')]"), getDriverProvider().get()));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void companyNameOfDebtLoanIsDisplayed(int RowIndex,String strColumnName){
         //wait until page gets loaded
        WaitUtil.simpleSleep(1000);
        try {
            String strOtherUser = ReadData.readDataExcel("Money", RowIndex, strColumnName);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'" + strOtherUser + "')]"), getDriverProvider().get()));
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    public void setValueInLoanAmount(){
         //wait util page load
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<60;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
            //wait util page load
            WaitUtil.simpleSleep(500);
        }
         //wait util page load
        WaitUtil.simpleSleep(20000);
    }

    public void clearValueInLoanAmount(){
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<60;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
         //wait util page load
        WaitUtil.simpleSleep(10000);
    }

    public void setTermValue(){
         //wait util page load
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[4]/div/div[2]/a[1]"));
        for(int i=0;i<60;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
         //wait util page load
        WaitUtil.simpleSleep(20000);
    }

    public void clearTermValue(){
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[4]/div/div[2]/a[1]"));
        for(int i=0;i<60;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
         //wait util page load
        WaitUtil.simpleSleep(10000);
    }

    public void selectInsuranceCompanyAndFamilyOffice(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_39")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.id("SubroleId_checkbox_39"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Lender Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearInsuranceCompanyAndFamilyOffice(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_48")).click();
        findElement(By.id("SubroleId_checkbox_39")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Lender Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectBrokersAndPlacementAgents(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_4")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Route To Lender:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearBrokersAndPlacementAgents(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_3")).click();
        findElement(By.id("RouteId_checkbox_4")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Route To Lender:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    /*public void selectAnyOption(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_37")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("SubroleId_checkbox_37"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Lender Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }*/

    public void selectMezzFund(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_41")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("SubroleId_checkbox_41"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Lender Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectInstitution(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_41")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("SubroleId_checkbox_41"));
        findElement(By.id("SubroleId_checkbox_43")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("SubroleId_checkbox_43"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Lender Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectFoundation(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_43")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("SubroleId_checkbox_43"));
        findElement(By.id("SubroleId_checkbox_45")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("SubroleId_checkbox_45"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Lender Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectCorporateInvestor(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_45")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("SubroleId_checkbox_45"));
        findElement(By.id("SubroleId_checkbox_47")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("SubroleId_checkbox_47"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Lender Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectInvestmentBank(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_47")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("SubroleId_checkbox_47"));
        findElement(By.id("SubroleId_checkbox_49")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("SubroleId_checkbox_49"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Lender Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectPensionFund(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_49")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("SubroleId_checkbox_49"));
        findElement(By.id("SubroleId_checkbox_51")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("SubroleId_checkbox_51"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Lender Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectSovereignWealth(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_53")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("SubroleId_checkbox_53"));
        findElement(By.id("SubroleId_checkbox_51")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("SubroleId_checkbox_51"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Lender Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectBank(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_53")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("SubroleId_checkbox_53"));
        findElement(By.id("SubroleId_checkbox_38")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("SubroleId_checkbox_38"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Lender Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectPrivateLender(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_40")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("SubroleId_checkbox_40"));
        findElement(By.id("SubroleId_checkbox_38")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("SubroleId_checkbox_38"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Lender Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectIndividual(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_40")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("SubroleId_checkbox_40"));
        findElement(By.id("SubroleId_checkbox_42")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("SubroleId_checkbox_42"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Lender Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectREFund(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_44")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("SubroleId_checkbox_44"));
        findElement(By.id("SubroleId_checkbox_42")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("SubroleId_checkbox_42"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Lender Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectGovernmentAgency(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_44")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("SubroleId_checkbox_44"));
        findElement(By.cssSelector("#SubroleId_checkbox_46")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.cssSelector("#SubroleId_checkbox_46"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Lender Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectInsuranceCompany_lender(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.cssSelector("#SubroleId_checkbox_46")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.cssSelector("#SubroleId_checkbox_46"));
        findElement(By.id("SubroleId_checkbox_48")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("SubroleId_checkbox_48"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Lender Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page loads
        WaitUtil.simpleSleep(10000);
     }

    public void selectPrivateEquity(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_50")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("SubroleId_checkbox_50"));
        findElement(By.id("SubroleId_checkbox_48")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("SubroleId_checkbox_48"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Lender Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectEndowment(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_50")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("SubroleId_checkbox_50"));
        findElement(By.id("SubroleId_checkbox_52")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("SubroleId_checkbox_52"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Lender Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectAllOptionInLoan(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        executeScript("scrollTo(0,500)");
        findElement(By.id("SubroleId_checkbox_-3")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("SubroleId_checkbox_-3"));
        findElement(By.id("SubroleId_checkbox_52")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("SubroleId_checkbox_52"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Lender Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearAllOptionInLoan(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("SubroleId_checkbox_-3")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("SubroleId_checkbox_-3"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Lender Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectDirectOnlyOption(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_1")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("RouteId_checkbox_1"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Route To Lender:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectIntermediaryOption(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_1")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("RouteId_checkbox_1"));
        findElement(By.id("RouteId_checkbox_2")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("RouteId_checkbox_2"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Route To Lender:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectBrokerOption(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_2")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("RouteId_checkbox_2"));
        findElement(By.id("RouteId_checkbox_3")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("RouteId_checkbox_3"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Route To Lender:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectPlacementAgentInRouteToLender(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_3")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("RouteId_checkbox_3"));
        findElement(By.id("RouteId_checkbox_4")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("RouteId_checkbox_4"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Route To Lender:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectAllInRouteToLender(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_4")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("RouteId_checkbox_4"));
        findElement(By.id("RouteId_checkbox_-1")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("RouteId_checkbox_-1"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Route To Lender:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clearAllInRouteToLender(){
         //wait until page loads
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_-1")).click();
        VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("RouteId_checkbox_-1"));
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Route To Lender:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }


}
