package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.junit.ComparisonFailure;
import org.openqa.selenium.*;
import test.Support.ReadData;
import test.Support.ReasonsInResultSheet;
import test.steps.VerificationStatements;

/**
 * Created with IntelliJ IDEA.
 * User: Bhavana
 * Date: 6/24/14
 * Time: 5:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class PrivacySetToPrivatePage extends FluentWebDriverPage {
    String gStrFieldName = "";
    public PrivacySetToPrivatePage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void clickMeTab(){
         //wait until page is loaded
        WaitUtil.simpleSleep(1000);
        try{
            gStrFieldName = findElement(By.xpath("//section[@id='content']/nav/ul/li[1]/a")).getText();
            findElement(By.xpath("//a[contains(text(),'Me')]")).click();
        } catch (NoSuchElementException e){
            System.out.println(e);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+gStrFieldName+"\nReason of Error:"+"Failed to click on the tab\n";
        }
    }

    public void selectPrivateButton(){
         //wait until page is loaded
        WaitUtil.simpleSleep(10000);
        try{
            gStrFieldName = findElement(By.xpath("//input[@id='PrivacyStatus2']/parent::li/label/strong")).getText();
            findElement(By.id("PrivacyStatus2")).click();
        } catch(NoSuchElementException n){
            System.out.println(n);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+gStrFieldName+"\nReason of Error:"+"Element was not found\n";
        } catch(WebDriverException e){
            System.out.println(e);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+gStrFieldName+"\nReason of Error:"+"Element not clickable at that point\n";
        }
    }

    public void enterUserName(int intRowIndex) throws Exception {
         //wait until page is loaded
        WaitUtil.simpleSleep(1000);
        gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div/div[1]/label")).getText();
        String lStrDealSponsorName = ReadData.readDataExcel("Privacy", intRowIndex,"NamesOfDifferentRoles");
        ReasonsInResultSheet.enterDataToTextField(getDriverProvider().get(),By.id("UserTitle"), lStrDealSponsorName, gStrFieldName, LoginRealConnexPage.gStrReason);
        //wait until page is loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickHereOfPrivateUser(){
        int intCnt=0;
        boolean blnFound=false;
        while(!blnFound && intCnt<=10){
            try{
                //wait until page is loaded
                WaitUtil.simpleSleep(10000);
                findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a[text()='here']")).click();
                Assert.assertEquals("Request a Viewing", findElement(By.linkText("Request a Viewing")).getText());
                blnFound=true;
            } catch (ElementNotVisibleException EV) {
                WaitUtil.simpleSleep(5000);
                LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Click Here link cannot be clicked\n";
                intCnt++;
            } catch (AssertionError A) {
                WaitUtil.simpleSleep(5000);
                LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Click Here link cannot be clicked and Request a Viewing is not displayed\n";
                intCnt++;
            }  catch (StaleElementReferenceException SR){
                WaitUtil.simpleSleep(5000);
                LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Click Here link cannot be clicked and Request a Viewing is not displayed\n";
                intCnt++;
            }
        }
    }

    public void verifyHereOfPrivateUser(){
        try{
            //wait until page is loaded
            WaitUtil.simpleSleep(5000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//a[contains(text(),'here')]"), getDriverProvider().get()));
            //wait until page is loaded
            WaitUtil.simpleSleep(5000);
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Failed to verify private user link in search result\n";
        }
    }

    public void verifyHereOfPrivateUserInSearchResult(){
        try{
            //wait until page is loaded
            WaitUtil.simpleSleep(5000);
            Assert.assertEquals("This user’s contact details are private.\n" +
                    "Click here to view their profile and request more information.", findElement(By.xpath("//tbody[@id='searchResults']/tr/td[2]")).getText());
            //Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//a[contains(text(),'here')]"), getDriverProvider().get()));
            //wait until page is loaded
            WaitUtil.simpleSleep(5000);
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Failed to verify private user link in search result\n";
        } catch (NoSuchElementException A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Click here link is not displayed in search result\n";
        }
    }

    public void verifyHereOfPrivateCompany(){
        try{
            //wait until page is loaded
            WaitUtil.simpleSleep(5000);
            String lStrMessage = findElement(By.xpath("//tbody[@id='searchResults']/tr/td[2]")).getText();
            System.out.println(lStrMessage);
            Assert.assertEquals("This Company’s contact details are private.\n" +
                    "Click here to view their profile and request more information.", findElement(By.xpath("//tbody[@id='searchResults']/tr/td[2]")).getText());
            //Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//a[contains(text(),'here')]"), getDriverProvider().get()));
            //wait until page is loaded
            WaitUtil.simpleSleep(5000);
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Failed to verify private company link in search result\n";
        } catch (StaleElementReferenceException S){
            System.out.println(S);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Element is not attached to the page document\n";

        }
    }

    public void verifyHereOfPrivateCompanyInCompanySearch(){
        try{
            //wait until page is loaded
            WaitUtil.simpleSleep(5000);
            String lStrMessage = findElement(By.xpath("//tbody[@id='searchResults']/tr/td[2]")).getText();
            System.out.println(lStrMessage);
            Assert.assertEquals("This company’s contact details are private.\n" +
                    "Click here to view their profile and request more information.", findElement(By.xpath("//tbody[@id='searchResults']/tr/td[2]")).getText());
            //Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//a[contains(text(),'here')]"), getDriverProvider().get()));
            //wait until page is loaded
            WaitUtil.simpleSleep(5000);
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Failed to verify private company link in search result\n";
        } catch (StaleElementReferenceException S){
            System.out.println(S);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Element is not attached to the page document\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"No such element click here is displayed when comapny search is performed\n";
        }
    }

    public void verifyHereOfFundInSearch(){
        try{
            //wait until page is loaded
            WaitUtil.simpleSleep(5000);
            String lStrMessage = findElement(By.xpath("//tbody[@id='searchResults']/tr/td[2]")).getText();
            System.out.println(lStrMessage);
            Assert.assertEquals("This Fund’s contact details are private.\n" +
                    "Click here to view their profile and request more information.", findElement(By.xpath("//tbody[@id='searchResults']/tr/td[2]")).getText());
            //wait until page is loaded
            WaitUtil.simpleSleep(5000);
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Failed to verify private user link in search result\n";
        } catch (StaleElementReferenceException S){
            System.out.println(S);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Element is not attached to the page document\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"No such element click here is displayed when company search is performed\n";
        }
    }

    public void verifyHereOfLoanInSearch(){
        try{
            //wait until page is loaded
            WaitUtil.simpleSleep(5000);
            String lStrMessage = findElement(By.xpath("//tbody[@id='searchResults']/tr/td[2]")).getText();
            System.out.println(lStrMessage);
            Assert.assertEquals("This Loan’s contact details are private.\n" +
                    "Click here to view their profile and request more information.", findElement(By.xpath("//tbody[@id='searchResults']/tr/td[2]")).getText());
            //wait until page is loaded
            WaitUtil.simpleSleep(5000);
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Failed to verify private user link in search result\n";
        } catch (StaleElementReferenceException S){
            System.out.println(S);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Element is not attached to the page document\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"No such element click here is displayed when comapny search is performed\n";
        }
    }

    public void verifyHereOfServiceInSearch(){
        try{
            //wait until page is loaded
            WaitUtil.simpleSleep(5000);
            String lStrMessage = findElement(By.xpath("//tbody[@id='searchResults']/tr/td[2]")).getText();
            System.out.println(lStrMessage);
            Assert.assertEquals("This Service’s contact details are private.\n" +
                    "Click here to view their profile and request more information.", findElement(By.xpath("//tbody[@id='searchResults']/tr/td[2]")).getText());
            //wait until page is loaded
            WaitUtil.simpleSleep(5000);
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Failed to verify private user link in search result\n";
        } catch (StaleElementReferenceException S){
            System.out.println(S);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Element is not attached to the page document\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"No such element click here is displayed when comapny search is performed\n";
        }
    }

    public void verifyHereOfMezzInSearch(){
        try{
            //wait until page is loaded
            WaitUtil.simpleSleep(5000);
            String lStrMessage = findElement(By.xpath("//tbody[@id='searchResults']/tr/td[2]")).getText();
            System.out.println(lStrMessage);
            Assert.assertEquals("This Mezz’s contact details are private.\n" +
                    "Click here to view their profile and request more information.", findElement(By.xpath("//tbody[@id='searchResults']/tr/td[2]")).getText());
            //wait until page is loaded
            WaitUtil.simpleSleep(5000);
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Failed to verify private user link in search result\n";
        } catch (StaleElementReferenceException S){
            System.out.println(S);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Element is not attached to the page document\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"No such element click here is displayed when comapny search is performed\n";
        }
    }

    public void clickRequestAView(){
         //wait until page is loaded
        WaitUtil.simpleSleep(2000);
        findElement(By.cssSelector("a.request-btn")).click();
        WaitUtil.simpleSleep(5000);
    }

    public void verifyMessageDisplayedForClickOnRequestAView(){
        try{
         //wait until page is loaded
        WaitUtil.simpleSleep(5000);
        Assert.assertEquals("Your request has been sent to the owner of this profile. You will be e-mailed when you have been granted access.", findElement(By.cssSelector("div.ui-pnotify-text")).getText());
        } catch (ComparisonFailure C){
            System.out.println(C);
        }  catch (NoSuchElementException N){
            System.out.println(N);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Message is not displayed after clicking on request viewing\n";
        }
    }

    public void enterYopMailId(int intRowIndex) throws Exception {
        //wait until page load
        WaitUtil.simpleSleep(1000);
        String lStrDealSponsorName = ReadData.readDataExcel("LoginRealConnex",intRowIndex,"EmailId");
        findElement(By.id("login")).clear();
        findElement(By.id("login")).sendKeys(lStrDealSponsorName);
    }

    public void enterMailInatorId_Lender(int intRowIndex) throws Exception {
        //wait until page load
        WaitUtil.simpleSleep(1000);
        String lStrDealSponsorName = ReadData.readDataExcel("LoginRealConnex",intRowIndex,"EmailId");
        findElement(By.id("inboxfield")).clear();
        findElement(By.id("inboxfield")).sendKeys(lStrDealSponsorName);
    }

    public void clickAcceptLink(){
        //wait until page load
        WaitUtil.simpleSleep(500);
        switchTo().frame("ifmail");
        findElement(By.linkText("Accept")).click();
        //wait until page load
        WaitUtil.simpleSleep(10000);
    }

    public void verifyMessage(){
         //wait until page load
        WaitUtil.simpleSleep(5000);
        Assert.assertEquals("Access successfully updated", findElement(By.cssSelector("div.ui-pnotify-text")).getText());
        //wait until page load
        WaitUtil.simpleSleep(5000);
    }

    public void enterCompanyName(int intRowIndex) throws Exception {
        //wait until page is loaded
        WaitUtil.simpleSleep(1000);
        String lStrDealSponsorCompanyName = ReadData.readDataExcel("Privacy", intRowIndex,"CompanyNameOfDifferentRoles");
        findElement(By.id("CompanyTitle")).clear();
        findElement(By.id("CompanyTitle")).sendKeys(lStrDealSponsorCompanyName);
        VerificationStatements.VerifyInputValue(getDriverProvider().get(), By.id("CompanyTitle"), lStrDealSponsorCompanyName);
        //wait until page is loaded
        WaitUtil.simpleSleep(10000);
    }

    public void clickGrantedPermissionLink(){
        //wait until page load
        WaitUtil.simpleSleep(10000);
        switchTo().frame("ifmail");
        String lStrString = findElement(By.xpath("//div[@id='mailmillieu']/div[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td[2]/table/tbody/tr/td[2]/span/strong")).getText();
        Assert.assertEquals("You now have access to "+lStrString+". Please click View Profile button to view them.", findElement(By.xpath("//div[@id='mailmillieu']/div[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td[2]/table/tbody/tr/td[2]/span")).getText());
        findElement(By.xpath("//div[@id='mailmillieu']/div/table/tbody/tr/td/table/tbody/tr/td/a[contains(text(),'View Profile')]")).click();
        WaitUtil.simpleSleep(10000);
    }

    public void selectSliderValue(){
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/div/div[2]/a[2]"));
        for(int i=0;i<99;i++){
            sliderLeft.sendKeys(Keys.ARROW_DOWN);
        }
         //wait until page loads
        WaitUtil.simpleSleep(15000);
    }

    public void selectInvestmentAmountValueForListingProject(){
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/div/div[2]/a[2]"));
        for(int i=0;i<95;i++){
            sliderLeft.sendKeys(Keys.ARROW_DOWN);
        }
        //wait until page loads
        WaitUtil.simpleSleep(15000);
    }

    public void selectInvestmentAmountValueForListingProjectInMyUniverse(){
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/div/div[2]/a[2]"));
        for(int i=0;i<96;i++){
            sliderLeft.sendKeys(Keys.ARROW_DOWN);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void verifyAccessUpdatedMessage(){
        try{
        Assert.assertEquals("Access successfully updated", findElement(By.cssSelector("div.ui-pnotify-text")).getText());
        } catch (NoSuchElementException e) {
            System.out.println(e);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Access Successfully Updated message is not displayed\n";
        }  catch (AssertionError a){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Access Successfully Updated message is not displayed\n";
        }
    }

    public void verifyNotificationInHeader(){
        try{
        findElement(By.xpath("//header[@id='header']/div[@class='note']/img")).click();
        //wait until the element appear
        WaitUtil.simpleSleep(5000);
        String lStrUserName = findElement(By.xpath("//div/ul/li[1]/div/p/strong[1]/a")).getText();
        String lStrProfileSetPrivateName = findElement(By.xpath("//div/ul/li[1]/div/p/strong[2]")).getText();
        Assert.assertEquals(""+lStrUserName+" User want to see your project "+lStrProfileSetPrivateName+". Please click here to allow this request.", findElement(By.cssSelector("p")).getText());
        } catch (NoSuchElementException n){
            System.out.println(n);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Element is not found\n";
        } catch (AssertionError e){
            System.out.println(e);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Comparing the text failed\n";
        }
    }

    public void verifyNotificationInHeaderOfPrivacy(){
        try{
            findElement(By.xpath("//header[@id='header']/div[2]/i")).click();
            //wait until the element appear
            WaitUtil.simpleSleep(1000);
            String lStrUserName = findElement(By.xpath("//header[@id='header']/div[2]/div/ul/li[1]/div/p/strong[1]/a")).getText();
            String lStrCompanyName = findElement(By.xpath("//header[@id='header']/div[2]/div/ul/li[1]/div/p/strong[2]")).getText();
            Assert.assertEquals(""+lStrUserName+" User want to see your company "+lStrCompanyName+". Please click here to allow this request.", findElement(By.cssSelector("p")).getText());
        } catch (NoSuchElementException n){
            System.out.println(n);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Element is not found\n";
        } catch (AssertionError e){
            System.out.println(e);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Failed to display company name in notification field\n";
        }
    }

    public void verifyNotificationOfTheRequestedUser(){
        try{
        findElement(By.xpath("//header[@id='header']/div[@class='note']/img")).click();
        //wait until the element appear
        WaitUtil.simpleSleep(5000);
        String lStrUserName = findElement(By.xpath("//div[@class='note']/div/ul/li/div/p/strong/a")).getText();
        String lStrProfileSetPrivateName = findElement(By.xpath("//div/ul/li/div/p/strong[2]")).getText();
        Assert.assertEquals(""+lStrUserName+" User allow you to view his project "+lStrProfileSetPrivateName+"", findElement(By.cssSelector("p")).getText());
        } catch (AssertionError e){
            System.out.println(e);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Comparing the text failed\n";
        }   catch (NoSuchElementException n){
            System.out.println(n);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Element is not found\n";

        }
    }

    public void verifyNotificationOfTheRequestedUserOfPrivacy(){
        try{
            findElement(By.xpath("//header[@id='header']/div[@class='note']/img")).click();
            //wait until the element appear
            WaitUtil.simpleSleep(5000);
            String lStrUserName = findElement(By.xpath("//div[@class='note']/div/ul/li/div/p/strong/a")).getText();
            String lStrCompanyName = findElement(By.xpath("//header[@id='header']/div[2]/div/ul/li/div/p/strong[2]")).getText();
            Assert.assertEquals(""+lStrUserName+" User allow you to view his company "+lStrCompanyName+"", findElement(By.cssSelector("p")).getText());
        } catch (AssertionError e){
            System.out.println(e);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Failed to display company name in notification\n";
        }   catch (NoSuchElementException n){
            System.out.println(n);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Element is not found\n";

        }
    }

    public void verifyTheUserProfileOfRequestedUser(){
        try{
            findElement(By.xpath("//header[@id='header']/div[@class='note']/img")).click();
            //wait until the element appear
            WaitUtil.simpleSleep(5000);
            String lStrUserName = findElement(By.xpath("//div[@class='note']/div/ul/li/div/p/strong/a")).getText();
            Assert.assertEquals(""+lStrUserName+" User allow you to view profile", findElement(By.cssSelector("p")).getText());
        } catch (AssertionError e){
            System.out.println(e);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Failed to display company name in notification\n";
        }   catch (NoSuchElementException n){
            System.out.println(n);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Element is not found\n";
        }
    }

    public void verifyTheCompanyProfileOfRequestedUser(){
        try{
            findElement(By.xpath("//header[@id='header']/div[@class='note']/img")).click();
            //wait until the element appear
            WaitUtil.simpleSleep(5000);
            String lStrUserName = findElement(By.xpath("//div[@class='note']/div/ul/li/div/p/strong/a")).getText();
            String lStrCompanyName = findElement(By.xpath("//header[@id='header']/div[2]/div/ul/li/div/p/strong[2]")).getText();
            Assert.assertEquals(""+lStrUserName+" User allow you to view his company "+lStrCompanyName+"", findElement(By.cssSelector("p")).getText());
        } catch (AssertionError e){
            System.out.println(e);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Failed to display company name in notification\n";
        }   catch (NoSuchElementException n){
            System.out.println(n);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Element is not found\n";
        }
    }

    public void  verifyTheUserProfileOfPermissionGrantedUser(){
        try{
            findElement(By.xpath("//header[@id='header']/div[@class='note']/img")).click();
            //wait until the element appear
            WaitUtil.simpleSleep(5000);
            String lStrUserName = findElement(By.xpath("//div[@class='note']/div/ul/li/div/p/strong/a")).getText();
            String lStrCompanyName = findElement(By.xpath("//header[@id='header']/div[2]/div/ul/li/div/p/strong[2]")).getText();
            Assert.assertEquals(""+lStrUserName+" User want to see your profile. Please click here to allow this request." , findElement(By.cssSelector("p")).getText());
        } catch (AssertionError e){
            System.out.println(e);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Failed to display company name in notification\n";
        }   catch (NoSuchElementException n){
            System.out.println(n);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Element is not found\n";

        }
    }

    public void verifyTheCompanyProfileOfPermissionGrantedUser(){
        try{
            findElement(By.xpath("//header[@id='header']/div[@class='note']/img")).click();
            //wait until the element appear
            WaitUtil.simpleSleep(5000);
            String lStrUserName = findElement(By.xpath("//div[@class='note']/div/ul/li/div/p/strong/a")).getText();
            String lStrCompanyName = findElement(By.xpath("//header[@id='header']/div[2]/div/ul/li/div/p/strong[2]")).getText();
            Assert.assertEquals(""+lStrUserName+" User allow you to view his company "+lStrCompanyName+"" , findElement(By.cssSelector("p")).getText());
        } catch (AssertionError e){
            System.out.println(e);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Failed to display the notifiaction of the user who grant the permission\n";
        }   catch (NoSuchElementException n){
            System.out.println(n);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Element is not found\n";

        }
    }

    public void verifyNotificationInHeaderOfPrivacyOfProject(){
        try{
            WaitUtil.simpleSleep(1000);
            findElement(By.xpath("//header[@id='header']/div[@class='note']/img")).click();
            //wait until the element appear
            WaitUtil.simpleSleep(5000);
            String lStrUserName = findElement(By.xpath("//div/ul/li[1]/div/p/strong[1]/a")).getText();
            String lStrCompanyName = findElement(By.xpath("//header[@id='header']/div[2]/div/ul/li/div/p/strong[2]")).getText();
            Assert.assertEquals(""+lStrUserName+" User want to see your project "+lStrCompanyName+". Please click here to allow this request.", findElement(By.cssSelector("p")).getText());
        } catch (NoSuchElementException n){
            System.out.println(n);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Element is not found\n";
        } catch (AssertionError e){
            System.out.println(e);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Failed to display project name in notification field\n";
        }
    }

    public void verifyNotificationOfTheRequestedUserOfPrivacyOfProject(){
        try{
            findElement(By.xpath("//header[@id='header']/div[@class='note']/img")).click();
            //wait until the element appear
            WaitUtil.simpleSleep(5000);
            String lStrUserName = findElement(By.xpath("//div[@class='note']/div/ul/li/div/p/strong/a")).getText();
            String lStrCompanyName = findElement(By.xpath("//header[@id='header']/div[2]/div/ul/li/div/p/strong[2]")).getText();
            Assert.assertEquals(""+lStrUserName+" User allow you to view his project "+lStrCompanyName+"", findElement(By.cssSelector("p")).getText());
        } catch (AssertionError e){
            System.out.println(e);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Failed to display project name in notification\n";
        }   catch (NoSuchElementException n){
            System.out.println(n);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Element is not found\n";

        }
    }

    public void verifyPrivateUserName(int intRowIndex)  {
        try{
         //wait until page loads
        WaitUtil.simpleSleep(10000);
        String lStrPrivateUserName = ReadData.readDataExcel("Privacy", intRowIndex,"NamesOfDifferentRoles");
        Assert.assertEquals(lStrPrivateUserName, findElement(By.cssSelector("h1")).getText());
        } catch (ComparisonFailure CF){
            System.out.println(CF);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"EH Company is not displayed\n";
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"EH Company is not displayed\n";
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void verifyPrivateCompanyName(int intRowIndex)  {
        try{
         //wait until page loads
        WaitUtil.simpleSleep(10000);
        String lStrPrivateCompanyName = ReadData.readDataExcel("Privacy", intRowIndex,"CompanyNameOfDifferentRoles");
        //Assert.assertEquals(lStrPrivateCompanyName, findElement(By.cssSelector("h1")).getText());
        } catch (AssertionError a){
            System.out.println(a);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Company name is not retrieved\n";
        } catch (Exception e){
            System.out.println(e);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Not Able to find the element\n";
        }
    }

    public void verifyPrivateProjectName(int intRowIndex) throws Exception {
         //wait until page loads
        WaitUtil.simpleSleep(10000);
        String lStrPrivateProjectName = ReadData.readDataExcel("Privacy", intRowIndex,"ProjectsOfAllRoles");
        Assert.assertEquals(lStrPrivateProjectName, findElement(By.cssSelector("h1")).getText());
    }

    public void verifyPrivateFundName(int intRowIndex) throws Exception {
         //wait until page loads
        WaitUtil.simpleSleep(10000);
        String lStrPrivateFundName = ReadData.readDataExcel("Privacy", intRowIndex,"FundOfAllRoles");
        Assert.assertEquals(lStrPrivateFundName, findElement(By.cssSelector("h1")).getText());
    }

    public void verifyPrivateLoanName(int intRowIndex) {
        try{
        //wait until page loads
        WaitUtil.simpleSleep(10000);
        String lStrPrivateFundName = ReadData.readDataExcel("Privacy", intRowIndex,"LoanOfAllRoles");
        Assert.assertEquals(lStrPrivateFundName, findElement(By.cssSelector("h1")).getText());
        } catch (ComparisonFailure C){
            System.out.println(C);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"CY Mezz Name is not siaplyed in the header\n";
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"CY Mezz Name is not siaplyed in the header\n";
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void verifyPrivateMezzName(int intRowIndex) throws Exception {
        try{
        //wait until page loads
        WaitUtil.simpleSleep(10000);
        String lStrPrivateFundName = ReadData.readDataExcel("Privacy", intRowIndex,"MezzOfAllRoles");
        Assert.assertEquals(lStrPrivateFundName, findElement(By.cssSelector("h1")).getText());
        }catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"CY Mezz is not displayed\n";
        }
    }

    public void setInvestmentAmount_Private(){
         //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<1;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[2]"));
        for(int i=0;i<98;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
         //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void setInvestmentAmount_PrivateOfDealSponsor(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<2;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[2]"));
        for(int i=0;i<97;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
            //wait until page loads
            WaitUtil.simpleSleep(500);
        }
        //wait until page loads
        WaitUtil.simpleSleep(20000);
    }

    public void setInvestmentAmountOfInvestor_Private(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<5;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[2]"));
        for(int i=0;i<94;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
        //wait until page loads
        WaitUtil.simpleSleep(20000);
    }

    public void setLoanAmount_Private(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<6;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[2]"));
        for(int i=0;i<93;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
            WaitUtil.simpleSleep(200);
        }
        //wait until page loads
        WaitUtil.simpleSleep(15000);
    }

    public void setEquity_Private(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<6;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[2]"));
        for(int i=0;i<93;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
        //wait until page loads
        WaitUtil.simpleSleep(15000);
    }

    public void setProjectSize_Private(){
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[2]"));
        for(int i=0;i<99;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
        //wait until page loads
        WaitUtil.simpleSleep(15000);
    }

    public void verifyPropertyServiceProviderServiceProfile(int intRowIndex) {
        //wait until page loads
        WaitUtil.simpleSleep(10000);
        String lStrPrivateFundName = null;
        try {
            lStrPrivateFundName = ReadData.readDataExcel("Privacy", intRowIndex, "ServiceOfAllRoles");
            Assert.assertEquals(lStrPrivateFundName, findElement(By.cssSelector("h1")).getText());
        } catch (Exception e) {
            System.out.println(e);
        } catch (ComparisonFailure CF) {
            System.out.println(CF);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"El Service is not displayed\n";
        } catch (AssertionError A) {
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"El Service is not displayed\n";
        }

    }

    public void verifyPropertyServiceProviderListingProfile(int intRowIndex) {
        //wait until page loads
        WaitUtil.simpleSleep(10000);
        String lStrPrivateFundName = null;
        try {
            lStrPrivateFundName = ReadData.readDataExcel("Privacy", intRowIndex, "ListingOfAllRoles");
            Assert.assertEquals(lStrPrivateFundName, findElement(By.cssSelector("h1")).getText());
        } catch (Exception e) {
            System.out.println(e);
        } catch (ComparisonFailure CF) {
            System.out.println(CF);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"El Listing is not displayed\n";
        } catch (AssertionError A) {
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"El Listing is not displayed\n";
        }

    }

    public void setLoanAmount_PrivateMyUniverseInclude(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<8;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[2]"));
        for(int i=0;i<91;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
            //wait until page loads
            WaitUtil.simpleSleep(500);
        }
        //wait until page loads
        WaitUtil.simpleSleep(20000);
    }

    public void setEquity_PrivateInMyUniverse(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<7;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[2]"));
        for(int i=0;i<92;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
            //wait until page loads
            WaitUtil.simpleSleep(500);
        }
        //wait until page loads
        WaitUtil.simpleSleep(1000);
    }

    public void setProjectSize_PrivateInMyUniverse(){
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[2]"));
        for(int i=0;i<99;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void setLoanAmountOfLenderCompany(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<2;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
            //wait until page loads
            WaitUtil.simpleSleep(200);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[2]"));
        for(int i=0;i<97;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
            //wait until page loads
            WaitUtil.simpleSleep(200);
        }
        //wait until page loads
        WaitUtil.simpleSleep(1000);
    }

    public void clickUserProfileTab(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        //findElement(By.linkText("Funds")).click();
        findElement(By.xpath("//section[@id='content']/nav/ul/li[@class='active']/a")).click();
    }

    public void verifyTextInFundTab(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertEquals("This Fund’s contact details are private. Click here to view their profile and request more information.", findElement(By.xpath("//section[@id='content']/div[3]/div/table/tbody/tr[2]/td[2]")).getText());
        } catch (AssertionError A) {
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Private Message of the Fund Profile Is Not Displayed\n";
        }
    }

    public void clickLoanLink(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.linkText("Loans")).click();
    }

    public void clickServicesLink(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.linkText("Services")).click();
    }

    public void clickListingLink(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.linkText("Listings")).click();
    }

    public void clickMezzLink(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.linkText("Mezzs")).click();
    }

    public void clickFundsLink(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.linkText("Funds")).click();
    }

    public void clickProjectsLink(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.linkText("Projects")).click();
    }

    public void clickViewProfileLink(){
        //wait until page load
        WaitUtil.simpleSleep(10000);
        switchTo().frame("rendermail");
        String lStrString = findElement(By.xpath("//table/tbody/tr[4]/td[2]/table/tbody/tr/td[2]/span/font/strong")).getText();
        Assert.assertEquals("You now have access to "+lStrString+". Please click View Profile button to view them.", findElement(By.xpath("//table/tbody/tr/td[2]/table/tbody/tr[4]/td[2]/table/tbody/tr/td[2]/span/font")).getText());
        findElement(By.xpath("//table/tbody/tr/td/a/font[contains(text(),'View Profile')]")).click();
        WaitUtil.simpleSleep(10000);
    }

}
