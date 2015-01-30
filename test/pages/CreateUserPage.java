package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import test.Support.ReadData;
import test.Support.ReasonsInResultSheet;
import test.steps.VerificationStatements;
import java.io.IOException;
import java.util.ArrayList;
import org.openqa.selenium.NoSuchElementException;


/**
 * Created with IntelliJ IDEA.
 * User: Bhavana
 * Date: 6/25/14
 * Time: 12:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class CreateUserPage extends FluentWebDriverPage {

    String gStrEmailId = "", gStrFieldName = "", gStrServiceReqName = "", gStrInvPostingName = "";
    public static String gStrDsPostingName = "";
    public static String gStrListingPostingName = "";
    public static String gStrServicePostingName = "";
    public CreateUserPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void clickNotAMemberLink(){
         //wait until element is visible
        WaitUtil.simpleSleep(1000);
        try{
            findElement(By.cssSelector("a.sign")).click();
        }catch(NoSuchElementException n){
            System.out.println(n);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Sign up Link cannot be clicked\n";
        } catch (WebDriverException e){
            System.out.println(e);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Sign up Link cannot be clicked\n";
        }

    }

    public void enterEmailIdOfUserRoles(){
        gStrFieldName = findElement(By.xpath("//input[@id='UserEmail']")).getAttribute("placeholder");
        gStrEmailId = "Auto"+System.currentTimeMillis()+"@yopmail.com";
        WaitUtil.simpleSleep(5000);
        ReasonsInResultSheet.enterDataToTextField(getDriverProvider().get(),By.id("UserEmail"), gStrEmailId, gStrFieldName, LoginRealConnexPage.gStrReason);
    }

    public void enterEmailIdOfUserRoles_Mailinator(){
        gStrFieldName = findElement(By.xpath("//input[@id='UserEmail']")).getAttribute("placeholder");
        gStrEmailId = "Auto"+System.currentTimeMillis()+"@mailinator.com";
        WaitUtil.simpleSleep(5000);
        ReasonsInResultSheet.enterDataToTextField(getDriverProvider().get(),By.id("UserEmail"), gStrEmailId, gStrFieldName, LoginRealConnexPage.gStrReason);
    }

    public void enterFirstName(){
        gStrFieldName = findElement(By.xpath("//input[@id='UserFirstName']")).getAttribute("placeholder");
        String lStrFirstName = "Auto";
        ReasonsInResultSheet.enterDataToTextField(getDriverProvider().get(),By.id("UserFirstName"), lStrFirstName, gStrFieldName, LoginRealConnexPage.gStrReason);
    }

    public void enterLastName(){
        gStrFieldName = findElement(By.xpath("//input[@id='UserLastName']")).getAttribute("placeholder");
        String lStrLastName = ""+System.currentTimeMillis();
        ReasonsInResultSheet.enterDataToTextField(getDriverProvider().get(),By.id("UserLastName"), lStrLastName, gStrFieldName, LoginRealConnexPage.gStrReason);
    }

    public void enterPassword(int intRowIndex) throws Exception {
        gStrFieldName = findElement(By.xpath("//input[@id='UserPassword']")).getAttribute("placeholder");
        String lStrPassword = ReadData.readDataExcel("LoginRealConnex", intRowIndex, "Password");
        ReasonsInResultSheet.enterDataToTextField(getDriverProvider().get(),By.id("UserPassword"), lStrPassword, gStrFieldName, LoginRealConnexPage.gStrReason);
    }

    public void reEnterPassword(int intRowIndex) throws Exception {
        gStrFieldName = findElement(By.xpath("//input[@id='UserConfirmPass']")).getAttribute("placeholder");
        String lStrReEnterPassword = ReadData.readDataExcel("LoginRealConnex",intRowIndex,"Password");
        ReasonsInResultSheet.enterDataToTextField(getDriverProvider().get(),By.id("UserConfirmPass"), lStrReEnterPassword, gStrFieldName, LoginRealConnexPage.gStrReason);
    }

    public void clickSelectRoleDropDown(){
         //wait until element is visible
        WaitUtil.simpleSleep(3000);
        try{
            gStrFieldName = findElement(By.xpath("//form[@id='UserHomeForm']/fieldset/div[4]/span/div[1]/div")).getText();
            findElement(By.cssSelector("#UserHomeForm > fieldset > div.row > span.selectbox > div.select > div.text")).click();
        } catch (NoSuchElementException e){
           System.out.println(e);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+gStrFieldName+"\nReason of Error:"+"Select Role Element is not found\n";
        }
    }

    public void selectInvestorOption(){
        //wait until element is visible
        WaitUtil.simpleSleep(3000);
        findElement(By.xpath("//form[@id='UserHomeForm']/fieldset/div/span/div/ul/li[contains(text(),'Investor')]")).click();
    }

    public void selectDealSponsorDeveloperAndFundMangerOption(){
         //wait until element is visible
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//form[@id='UserHomeForm']/fieldset/div/span/div/ul/li[text()='Developer / Sponsor']")).click();
    }

    public void selectRealEstateAdvisorBrokerOption(){
         //wait until element is visible
        WaitUtil.simpleSleep(1000);
        try{
        gStrFieldName = findElement(By.xpath("//form[@id='UserHomeForm']/fieldset/div/span/div/ul/li[5]")).getText();
        findElement(By.xpath("//form[@id='UserHomeForm']/fieldset/div/span/div/ul/li[text()='Real Estate Advisor']")).click();
        } catch (NoSuchElementException e){
            System.out.println(e);

        }
    }

    public void selectLenderOption(){
         //wait until element is visible
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//form[@id='UserHomeForm']/fieldset/div/span/div/ul/li[text()='Lender']")).click();
    }

    public void verifyTextInRoleSelectedDropDown(String lStrSelectedOptionInDropDown){
        String lStrRoleSelectedActual = findElement(By.cssSelector("#UserHomeForm > fieldset > div.row > span.selectbox > div.select > div.text")).getText();
        Assert.assertEquals(lStrSelectedOptionInDropDown,lStrRoleSelectedActual);
    }

    public void clickCertifyAccreditedInvestorCheckBox(){
        //wait until element is visible
        WaitUtil.simpleSleep(1000);
        findElement(By.id("agreeAccredit")).click();
    }

    public void clickRegisterButton(){
         //wait until element is visible
        WaitUtil.simpleSleep(1000);
        findElement(By.cssSelector("#UserHomeForm > fieldset > div.row > input.sbm")).sendKeys(Keys.ENTER);
         //wait until element is visible
        WaitUtil.simpleSleep(10000);
    }

    public void verifyConfirmationMessage(String lStrConfirmationMessage){
         //wait until page load
        WaitUtil.simpleSleep(5000);
        try{
            String lStrMessage = findElement(By.xpath("//div[@id='registerSuccess']/div[1]/strong")).getText();
            Assert.assertEquals(lStrMessage, lStrConfirmationMessage);
            //wait until page load
             WaitUtil.simpleSleep(7000);
        } catch (AssertionError e){
            System.out.println(e);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Almost Done Confirmation message not displayed\n";
        }
    }

    public void clickClose(){
        try{
         //wait until page load
        WaitUtil.simpleSleep(5000);
        findElement(By.cssSelector("a.fancybox-item.fancybox-close")).click();
         //wait until page load
        WaitUtil.simpleSleep(1000);
        } catch (NoSuchElementException n){
            System.out.println(n);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Close button of registration is not clickable\n";
        } catch (WebDriverException W){
            System.out.println(W);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Close button of registration is not clickable\n";
        }
    }

    public void launchYopMail(){
        get("http://www.yopmail.com");
    }

    public void enterYopMailId(){
         //wait until page load
        WaitUtil.simpleSleep(5000);
        findElement(By.id("login")).clear();
        findElement(By.id("login")).sendKeys(gStrEmailId);
        System.out.println(gStrEmailId);
        VerificationStatements.VerifyInputValue(getDriverProvider().get(), By.id("login"), gStrEmailId);
    }

    public void enterCreatedEmailId() throws IOException {
        //wait until page load
        WaitUtil.simpleSleep(5000);
        System.out.println("Email ID:"+gStrEmailId);
        findElement(By.id("UserLoginPopupEmail")).clear();
        findElement(By.id("UserLoginPopupEmail")).sendKeys(gStrEmailId);
        VerificationStatements.VerifyInputValue(getDriverProvider().get(), By.id("UserLoginPopupEmail"), gStrEmailId);
    }

    public void clickCheckInboxButton() throws IOException {
        //wait until page load
        WaitUtil.simpleSleep(1000);
        Runtime.getRuntime().exec("D:\\RealConnex\\AutoIt\\yopmailpopup.exe");
        findElement(By.xpath("//input[@value='Check Inbox']")).click();
         //wait until page load
        WaitUtil.simpleSleep(3000);
    }

    public void clickCheckInboxButtonInYopmail(){
        //wait until page load
        WaitUtil.simpleSleep(7000);
        findElement(By.xpath("//input[@value='Check Inbox']")).click();
        //wait until page load
        WaitUtil.simpleSleep(3000);
    }

    public void switchToYopMailTab(){
        //wait until page load
        WaitUtil.simpleSleep(5000);
        ArrayList<String> tabs = new ArrayList<String> (getWindowHandles());
        int lStrTabSize = tabs.size();
        if(lStrTabSize == 2){
        switchTo().window(tabs.get(1));
        close();
        switchTo().window(tabs.get(0));
        }
    }

    public void clickRealConnexMail(){
         //wait until page load
        WaitUtil.simpleSleep(10000);
        try{
        switchTo().frame("ifinbox");
        findElement(By.xpath("//div[@id='m1']/div/a/span[@class='lmfd']/span[contains(text(),'RealConnex')]")).click();
        switchTo().defaultContent();
        } catch (NoSuchElementException n){
            System.out.println(n);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"RealConnex Mail in inbox is not clicked\n";
        }
    }

    public void clickOnClickHereLink(){
        try{
         //wait until page load
        WaitUtil.simpleSleep(1000);
        //move to the frame
        switchTo().frame("ifmail");
         // click on click here link
        findElement(By.xpath("//div[@id='mailmillieu']/div[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/span")).click();
        WaitUtil.simpleSleep(12000);
        } catch (NoSuchElementException N){
            System.out.println(N);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Click Here link of RealConnex Mail in inbox is not clicked\n";
        }
    }

    public void switchToRealConnexTab(){
        ArrayList<String> tabs2 = new ArrayList<String> (getWindowHandles());
        switchTo().window(tabs2.get(0));
        close();
        switchTo().window(tabs2.get(1));
        //wait until page load
        WaitUtil.simpleSleep(10000);
    }

    public void verifyRealConnexPage(){
         //wait until page load
        WaitUtil.simpleSleep(100);
        Assert.assertTrue(WaitUtil.isElementPresent(By.cssSelector("h1"),getDriverProvider().get()));
    }

    public void clickSkipTour(){
         //wait until page load
        WaitUtil.simpleSleep(10000);
        findElement(By.cssSelector("a.skip")).click();
         //wait until page load
        WaitUtil.simpleSleep(500);
    }

    public void getUserName(){
        //wait until page load
        WaitUtil.simpleSleep(500);
        LoginRealConnexPage.lStrNewCreatedUserName = findElement(By.xpath("//section[@id='content']/div[@class='top-title']/h1")).getText();
    }

    public void launchMailInator(){
        get("http://www.mailinator.com");
    }

    public void enterMailInatorId(){
        //wait until page load
        WaitUtil.simpleSleep(5000);
        findElement(By.id("inboxfield")).clear();
        findElement(By.id("inboxfield")).sendKeys(gStrEmailId);
        System.out.println(gStrEmailId);
        VerificationStatements.VerifyInputValue(getDriverProvider().get(), By.id("inboxfield"), gStrEmailId);
    }

    public void clickCheckItButton(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//btn[@onclick='changeInbox();']")).click();
    }

    public void clickRealConnexMailInMailinator(){
        //wait until page load
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//ul[@id='mailcontainer']/li/a/div[@class='from ng-binding']")).click();
        switchTo().defaultContent();
    }

    public void clickClickHereLinkInInbox(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        switchTo().frame("rendermail");
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//tbody/tr[4]/td/table/tbody/tr/td[2]")).click();
        //wait until page load
        WaitUtil.simpleSleep(10000);
        switchTo().defaultContent();
    }

    public void verifyYourPostingsIsDisplayedInHeader(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//section[@id='content']/div/h1[contains(text(),'Your Postings')]"), getDriverProvider().get()));
    }

    public void clickOnPostNewButton(){
        try{
            WaitUtil.simpleSleep(5000);
            findElement(By.xpath("//section[@id='content']/div[2]/div[1]/a[contains(text(),'Post New')]")).click();
        }catch(NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"UnAble to click on 'Post New' button in posting tab\n";
        }
    }

    public void clickOnAFundToCreateNewFund_DealSponsor(){
        try{
            //wait until page load
            WaitUtil.simpleSleep(5000);
            findElement(By.xpath("//section[@id='content']/div/div/div/div/a[contains(text(),'A Fund')]")).click();
            WaitUtil.simpleSleep(5000);
        } catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"UnAble to click on 'A Fund' button in posting tab\n";
        }
    }

    public void enterFundName_DealSponsor(){
        try{
            //wait until page load
            WaitUtil.simpleSleep(10000);
            gStrDsPostingName = "DS Fund"+System.currentTimeMillis();
            findElement(By.cssSelector("#ProjectTitle")).clear();
            findElement(By.cssSelector("#ProjectTitle")).sendKeys(gStrDsPostingName);
            VerificationStatements.VerifyInputValue(getDriverProvider().get(),By.cssSelector("#ProjectTitle"),gStrDsPostingName);
            System.out.println(gStrDsPostingName);
        } catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"UnAble enter name of postings in posting tab\n";
        } catch (AssertionError A){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Posting name entered does not match with the name in the posting field\n";
        }
    }

    public void clickSaveButton_Postings(){
        try{
            //wait until page load
            WaitUtil.simpleSleep(5000);
            findElement(By.xpath("//input[@value='Save']")).click();
            WaitUtil.simpleSleep(10000);
        } catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"UnAble click on 'Save' button in posting tab\n";
        }
    }

    public void clickCreateNewRequirement(){
        try{
            WaitUtil.simpleSleep(1000);
            executeScript("scroll(150,0)");
            findElement(By.cssSelector("span.sbm")).click();
            //wait until page load
            WaitUtil.simpleSleep(5000);
        } catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"UnAble click on 'Create Requirement' button in posting tab\n";
        }
    }

    public void clickServiceLinkInRequirement(){
        try{
            WaitUtil.simpleSleep(5000);
            findElement(By.linkText("Service")).click();
            WaitUtil.simpleSleep(10000);
        } catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"UnAble click on 'Service' link of 'Create Requirement' in posting tab\n";
        }
    }

    public void enterNameOfServiceRequirement(){
        try{
            WaitUtil.simpleSleep(5000);
            gStrServiceReqName = "REA"+System.currentTimeMillis();
            findElement(By.cssSelector("#ServiceRequirementTitle")).clear();
            findElement(By.cssSelector("#ServiceRequirementTitle")).sendKeys(gStrServiceReqName);
            VerificationStatements.VerifyInputValue(getDriverProvider().get(),By.cssSelector("#ServiceRequirementTitle"),gStrServiceReqName);
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"UnAble enter service name in 'Service Requirement' of posting tab\n";
        }  catch (AssertionError A){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Entered service name in 'Service Requirement' does not match with the service name\n";
        }
    }

    public void clickProfessionalRequirementField(){
        try{
            WaitUtil.simpleSleep(5000);
            findElement(By.xpath("//div[@id='subRoleSelect']/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        } catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"UnAble to click on professional requirement field in 'Service requirement' of posting tab\n";
        }
    }

    public void clickCommercialBrokerOptionInProfessionalRequirementField(){
        try{
            WaitUtil.simpleSleep(5000);
            findElement(By.cssSelector("#SubroleId_checkbox_61")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.cssSelector("#SubroleId_checkbox_61"));
            findElement(By.xpath("//div[@id='subRoleSelect']/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
            WaitUtil.simpleSleep(5000);
        } catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"UnAble to select commercial broker field in professional requirement of 'Service requirement' in posting tab\n";
        } catch (AssertionError A){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Commercial broker option is not selected in professional requirement field of 'Service requirement' in posting tab\n";
        }
    }

    public void clickServiceFieldInServiceRequirement(){
        try{
            WaitUtil.simpleSleep(10000);
            findElement(By.xpath("//div[@id='assetStrategySelect']/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"UnAble to service field in 'Service requirement' of posting tab\n";
        }
    }

    public void clickAcquisitionsOptionInServiceField(){
        try{
            WaitUtil.simpleSleep(10000);
            findElement(By.cssSelector("#AssetstrategyId_checkbox_97")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.cssSelector("#AssetstrategyId_checkbox_97"));
            findElement(By.xpath("//div[@id='assetStrategySelect']/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"UnAble to service field in 'Service requirement' of posting tab\n";
        }  catch (AssertionError A){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Acquisitions option is not selected in service field of 'Service requirement' in posting tab\n";
        }
    }

    public void clickCreateButtonOfServiceRequirement(){
        try{
            WaitUtil.simpleSleep(5000);
            findElement(By.cssSelector("div.btn-holder.clearfix > input.sbm")).click();
            WaitUtil.simpleSleep(5000);
        } catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"UnAble to click on 'Create' button of 'Service requirement' in posting tab\n";
        }
    }

    public void enterFundName_Investor(){
        try{
            //wait until page load
            WaitUtil.simpleSleep(10000);
            gStrInvPostingName = "INV Fund"+System.currentTimeMillis();
            findElement(By.cssSelector("#ProjectTitle")).clear();
            findElement(By.cssSelector("#ProjectTitle")).sendKeys(gStrInvPostingName);
            VerificationStatements.VerifyInputValue(getDriverProvider().get(),By.cssSelector("#ProjectTitle"),gStrInvPostingName);
        } catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"UnAble enter name of postings in posting tab\n";
        } catch (AssertionError A){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Posting name entered does not match with the name in the posting field\n";
        }
    }

    public void enterServiceName_REA(){
        try{
            //wait until page load
            WaitUtil.simpleSleep(10000);
            gStrServicePostingName = "Service"+System.currentTimeMillis();
            findElement(By.cssSelector("#ProjectTitle")).clear();
            findElement(By.cssSelector("#ProjectTitle")).sendKeys(gStrServicePostingName);
            VerificationStatements.VerifyInputValue(getDriverProvider().get(),By.cssSelector("#ProjectTitle"),gStrServicePostingName);
            System.out.println(gStrServicePostingName);
        } catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"UnAble enter name of service in posting tab\n";
        } catch (AssertionError A){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Service name entered does not match with the name in the posting name field\n";
        }
    }

    public void enterListingName_REA(){
        try{
            //wait until page load
            WaitUtil.simpleSleep(10000);
            gStrListingPostingName = "Listing"+System.currentTimeMillis();
            findElement(By.cssSelector("#ProjectTitle")).clear();
            findElement(By.cssSelector("#ProjectTitle")).sendKeys(gStrListingPostingName);
            VerificationStatements.VerifyInputValue(getDriverProvider().get(),By.cssSelector("#ProjectTitle"),gStrListingPostingName);
            System.out.println(gStrListingPostingName);
        } catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"UnAble enter name of listing in posting tab\n";
        } catch (AssertionError A){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Listing name entered does not match with the name in the posting name field\n";
        }
    }

    public void enterListingNameToCheckMatches_REA(){
        try{
            //wait until page load
            WaitUtil.simpleSleep(10000);
            String lStrListingPostingName = "Listing"+System.currentTimeMillis();
            findElement(By.cssSelector("#ProjectTitle")).clear();
            findElement(By.cssSelector("#ProjectTitle")).sendKeys(lStrListingPostingName);
            VerificationStatements.VerifyInputValue(getDriverProvider().get(),By.cssSelector("#ProjectTitle"),lStrListingPostingName);
            System.out.println(lStrListingPostingName);
        } catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"UnAble enter name of listing in posting tab\n";
        } catch (AssertionError A){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Listing name entered does not match with the name in the posting name field\n";
        }
    }

    public void enterServiceNameToCheckMatches_REA(){
        try{
            //wait until page load
            WaitUtil.simpleSleep(10000);
            String lStrServicePostingName = "Listing"+System.currentTimeMillis();
            findElement(By.cssSelector("#ProjectTitle")).clear();
            findElement(By.cssSelector("#ProjectTitle")).sendKeys(lStrServicePostingName);
            VerificationStatements.VerifyInputValue(getDriverProvider().get(),By.cssSelector("#ProjectTitle"),lStrServicePostingName);
            System.out.println(lStrServicePostingName);
        } catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"UnAble enter name of listing in posting tab\n";
        } catch (AssertionError A){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Service name entered does not match with the name in the posting name field\n";
        }
    }

    public void clickResidentialBrokerOptionInProfessionalRequirementField(){
        try{
            WaitUtil.simpleSleep(5000);
            findElement(By.cssSelector("#SubroleId_checkbox_60")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.cssSelector("#SubroleId_checkbox_60"));
            findElement(By.xpath("//div[@id='subRoleSelect']/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
            WaitUtil.simpleSleep(5000);
        } catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"UnAble to select commercial broker field in professional requirement of 'Service requirement' in posting tab\n";
        } catch (AssertionError A){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Commercial broker option is not selected in professional requirement field of 'Service requirement' in posting tab\n";
        }
    }


    public void returnToSearchedPage(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(1000);
        navigate().back();
    }

    public void clickInvestmentBankerOptionInProfessionalRequirementField(){
        try{
            WaitUtil.simpleSleep(5000);
            findElement(By.cssSelector("#SubroleId_checkbox_59")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.cssSelector("#SubroleId_checkbox_59"));
            findElement(By.xpath("//div[@id='subRoleSelect']/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
            WaitUtil.simpleSleep(5000);
        } catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"UnAble to select commercial broker field in professional requirement of 'Service requirement' in posting tab\n";
        } catch (AssertionError A){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Investment banker option is not selected in professional requirement field of 'Service requirement' in posting tab\n";
        }
    }

    public void clickCapitalRaisingOptionInServiceField(){
        try{
            WaitUtil.simpleSleep(10000);
            findElement(By.cssSelector("#AssetstrategyId_checkbox_90")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.cssSelector("#AssetstrategyId_checkbox_90"));
            findElement(By.xpath("//div[@id='assetStrategySelect']/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"UnAble to service field in 'Service requirement' of posting tab\n";
        }  catch (AssertionError A){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Capitial Raising option is not selected in service field of 'Service requirement' in posting tab\n";
        }
    }


}
