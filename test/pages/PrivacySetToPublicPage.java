package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import test.Support.ReadData;
import test.steps.VerificationStatements;


/**
 * Created with IntelliJ IDEA.
 * User: Bhavana
 * Date: 6/23/14
 * Time: 12:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class PrivacySetToPublicPage extends FluentWebDriverPage {
    String gStrFieldName = "";
    public PrivacySetToPublicPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void verifyPrivacyButton(){
        try{
            WaitUtil.simpleSleep(5000);
            gStrFieldName = findElement(By.cssSelector("a.privacy > em.ico > img")).getText();
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//nav[@id='nav']/ul/li[3]/a/em/img"), getDriverProvider().get()));
        } catch (AssertionError e){
            System.out.println(e);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+gStrFieldName+"\nReason of Error:"+"Failed to find the element\n";
        }
    }

    public void clickPrivacyButton(){
        try{
            WaitUtil.simpleSleep(5000);
            gStrFieldName = findElement(By.cssSelector("a.privacy > em.ico > img")).getText();
            findElement(By.xpath("//nav[@id='nav']/ul/li[3]/a/em/img")).click();
        } catch(NoSuchElementException e){
            System.out.println(e);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+gStrFieldName+"\nReason of Error:"+"Not able to click on the field\n";
        }
    }

    public void verifyPrivacyPage(){
        try{
            gStrFieldName = findElement(By.cssSelector("h1")).getText();
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//section[@id='content']/div[@class='top-title']/h1[text()='Privacy']"), getDriverProvider().get()));
        } catch (AssertionError e){
            System.out.println(e);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+gStrFieldName+"\nReason of Error:"+"Failed in verifying the text\n";
        }
    }

    public void selectPublicButton(){
        executeScript("scrollTo(100,0)");
        try{
            gStrFieldName = "";
            WaitUtil.simpleSleep(5000);
            gStrFieldName = findElement(By.xpath("//input[@id='PrivacyStatus1']/parent::li/label/strong")).getText();
            findElement(By.id("PrivacyStatus1")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.id("PrivacyStatus1"));
        } catch (NoSuchElementException e){
            System.out.println(e);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+gStrFieldName+"\nReason of Error:"+"Failed to select the radio button\n";
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+gStrFieldName+"\nReason of Error:"+"Radio button is not selected\n";
        }
    }

    public void clickSaveButton_Me(){
         //wait util page load
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//form[@id='UserMePrivacyForm']/div[@class='clearfix']/input[@class='sbm']")).click();
    }

    public void clickSaveButton_Company(){
        //wait util page load
        WaitUtil.simpleSleep(5000);
        try{
            gStrFieldName = findElement(By.xpath("//form[@id='UserCompanyPrivacyForm']/div/input[@type='submit']")).getAttribute("value");
            findElement(By.xpath("//form[@id='UserCompanyPrivacyForm']/div/input[@class='sbm']")).click();
        } catch (NoSuchElementException n){
            System.out.println(n);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+gStrFieldName+"\nReason of Error:"+"Cannot find the element\n";
        } catch (WebDriverException e){
            System.out.println(e);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+gStrFieldName+"\nReason of Error:"+"Element is not clickable at this point\n";
        }
    }

    public void clickSaveButton_Project(){
         //wait until page load
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//form[@id='UserProjectsPrivacyForm']/div[@class='clearfix']/input")).click();
    }

    public void verifyMessage(String lStrMessage){
        try{
            //WaitUtil.simpleSleep(10000);
            String lStrMessageFromApplication = findElement(By.cssSelector("div.ui-pnotify-text")).getText();
            Assert.assertEquals(lStrMessage,lStrMessageFromApplication);
        } catch (AssertionError e){
            System.out.println(e);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Privacy successfully saved Message is not displayed\n";
        }  catch (NoSuchElementException N) {
            System.out.println(N);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Privacy successfully saved Message is not displayed\n";
        }  catch (StaleElementReferenceException S){
            System.out.println(S);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Privacy successfully saved Message is not displayed\n";
        } catch (NullPointerException NP){
            System.out.println(NP);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Privacy successfully saved Message is not displayed\n";
        }
    }

    public void clickCompanyTab(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        try{
            gStrFieldName = findElement(By.xpath("//section[@id='content']/nav/ul/li[2]/a")).getText();
            findElement(By.xpath("//section[@id='content']/nav/ul/li/a[text()='Companies']")).click();
        } catch (NoSuchElementException e){
            System.out.println(e);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+gStrFieldName+"\nReason of Error:"+"Failed to click on the tab\n";
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void clickProjectsTab(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        //findElement(By.xpath("//section[@id='content']/nav/ul/li/a[contains(text(),'PROJECTS')]")).click();
        findElement(By.xpath("//section[@id='content']/nav/ul/li/a[contains(text(),'Postings')]")).click();
    }

    public void clickFundsTab(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//section[@id='content']/nav/ul/li/a[contains(text(),'Funds')]")).click();
    }

    public void clickProductsTab(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//section[@id='content']/nav/ul/li/a[contains(text(),'PRODUCTS')]")).click();
    }

    public void clickProjectOfDealSponsor(int intRowIndex) throws Exception {
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        String lStrProjectName = ReadData.readDataExcel("Privacy", intRowIndex,"ProjectsOfAllRoles");
        findElement(By.xpath("//span[contains(text(),'"+lStrProjectName+"')]")).click();
    }

    public void clickFundOfDealSponsor(int intRowIndex) throws Exception {
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        String lStrFundName = ReadData.readDataExcel("Privacy", intRowIndex,"FundOfAllRoles");
        findElement(By.xpath("//span[contains(text(),'"+lStrFundName+"')]")).click();
    }

    public void clickProjectOfDealSponsor_Private(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//span[contains(text(),'JS Project')]")).click();
    }

    public void clickFundOfDealSponsor_Private(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//span[contains(text(),'JS Fund')]")).click();
    }

    public void clickFundOfInvestor_Private(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//span[contains(text(),'KP Fund')]")).click();
    }

    public void clickLoanOfLender_Private(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//span[contains(text(),'LT Loan')]")).click();
    }

    public void clickMezzOfLender_Private(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//span[contains(text(),'LT Mezz')]")).click();
    }

    public void clickServiceProject_Private(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//span[contains(text(),'EL Services')]")).click();
    }

    public void clickListingProject_Private(){
         //wait until page loads
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//span[contains(text(),'EL Listing')]")).click();
    }

    public void clickCompanyNameToSetPrivacyForTheCompany(String strCompanyName){
        try{
            gStrFieldName = "";
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//tbody/tr/td/a/span")).getText();
            findElement(By.xpath("//tbody/tr/td/a/span[contains(text(),'"+strCompanyName+"')]")).click();
        } catch (NoSuchElementException N){
            System.out.println(N);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+gStrFieldName+"\nReason of Error:"+"Unable to click on "+strCompanyName+" \n";
        }
    }

}
