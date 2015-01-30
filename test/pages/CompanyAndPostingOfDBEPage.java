package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import test.steps.VerificationStatements;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created with IntelliJ IDEA.
 * User: Bhavana
 * Date: 12/3/14
 * Time: 3:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class CompanyAndPostingOfDBEPage extends FluentWebDriverPage {

    public CompanyAndPostingOfDBEPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void verifyFindInSearchOptionOfDBE(){
        try{
            WaitUtil.simpleSleep(1000);
            executeScript("scroll(550,0)");
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//div[@id='searchFilters']/div/span[contains(text(),'Find:')]/strong[contains(text(),'Design Build & Engineering')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Design Build and Engineering is not displayed in Find of search option\n";
        }
    }

    public void verifyProviderInSearchOptionOfDBE(String lStrProvider){
        try{
            WaitUtil.simpleSleep(500);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//div[@id='searchFilters']/div/span[contains(text(),'Provider:')]/strong[contains(text(),'"+lStrProvider+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+""+lStrProvider+" is not displayed in Provider of search option\n";
        }
    }

    public void verifyProviderAsDesignerInSearchOptionOfDBE(){
        try{
            WaitUtil.simpleSleep(500);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//div[@id='searchFilters']/div/span[contains(text(),'Provider:')]/strong[contains(text(),'Designer')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Designer is not displayed in Provider of search option\n";
        }
    }

    public void selectServiceDropDownField(){
        try{
            executeScript("window.scrollBy(-350,0)", "");
            WaitUtil.simpleSleep(1000);
            LoginRealConnexPage.gStrFieldName = "";
            LoginRealConnexPage.gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/label")).getText();
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Service')]/parent::div/div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        } catch (NoSuchElementException N){
            System.out.println(N);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Service field is not clicked in side filter\n";
        }
    }

    public void selectArchitecturalDesignOption(){
        try{
            WaitUtil.simpleSleep(1000);
            findElement(By.cssSelector("#AssetstrategyId_checkbox_114")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.cssSelector("#AssetstrategyId_checkbox_114"));
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Service')]/parent::div/div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        } catch (NoSuchElementException N){
            System.out.println(N);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Service field is not clicked in side filter\n";
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Architect option is not selected in service field\n";
        }
    }

    public void clearArchitecturalDesignOption(){
        try{
            WaitUtil.simpleSleep(1000);
            findElement(By.cssSelector("#AssetstrategyId_checkbox_114")).click();
            VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.cssSelector("#AssetstrategyId_checkbox_114"));
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Service')]/parent::div/div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
            WaitUtil.simpleSleep(1000);
        } catch (NoSuchElementException N){
            System.out.println(N);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Service field is not clicked in side filter\n";
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Architect option is not de-selected in service field\n";
        }
    }

    public void clickAssetFocusDropDown(){
        try{
            //Horizontal scroll - left by 95 pixels
            executeScript("window.scrollBy(-350,0)", "");
            WaitUtil.simpleSleep(1000);
            LoginRealConnexPage.gStrFieldName = "";
            LoginRealConnexPage.gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Asset Focus:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        } catch (NoSuchElementException N){
            System.out.println(N);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Asset Focus field is not clicked in side filter\n";
        }
    }

    public void selectOfficeOptionInAssetFocus(){
        try{
            WaitUtil.simpleSleep(1000);
            findElement(By.cssSelector("#AssettypeId_checkbox_66")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.cssSelector("#AssettypeId_checkbox_66"));
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Asset Focus:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
            WaitUtil.simpleSleep(1000);
        } catch (NoSuchElementException N){
            System.out.println(N);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Asset Focus field is not clicked in side filter\n";
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Office option is not selected in asset focus field\n";
        }
    }

    public void clearOfficeOptionInAssetFocus(){
        try{
            WaitUtil.simpleSleep(1000);
            findElement(By.cssSelector("#AssettypeId_checkbox_66")).click();
            VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.cssSelector("#AssettypeId_checkbox_66"));
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Asset Focus:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
            WaitUtil.simpleSleep(1000);
        } catch (NoSuchElementException N){
            System.out.println(N);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Asset Focus field is not clicked in side filter\n";
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Office option is not de-selected in asset focus field\n";
        }
    }

    public void clickEngagementStageDropDown(){
        try{
            WaitUtil.simpleSleep(1000);
            LoginRealConnexPage.gStrFieldName = "";
            LoginRealConnexPage.gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[4]/label")).getText();
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Engagement Stage')]/parent::div/div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        } catch (NoSuchElementException N){
            System.out.println(N);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Engagement Stage field is not clicked in side filter\n";
        }
    }

    public void selectPlanningOptionInEngagementStageField(){
        try{
            WaitUtil.simpleSleep(1000);
            findElement(By.cssSelector("#DealstageId_checkbox_11")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.cssSelector("#DealstageId_checkbox_11"));
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Engagement Stage')]/parent::div/div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
            WaitUtil.simpleSleep(1000);
        } catch (NoSuchElementException N){
            System.out.println(N);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Engagement Stage field is not clicked in side filter\n";
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Planning option is not selected in engagement stage field\n";
        }
    }

    public void clearPlanningOptionInEngagementStageField(){
        try{
            WaitUtil.simpleSleep(1000);
            findElement(By.cssSelector("#DealstageId_checkbox_11")).click();
            VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.cssSelector("#DealstageId_checkbox_11"));
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Engagement Stage')]/parent::div/div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
            WaitUtil.simpleSleep(1000);
        } catch (NoSuchElementException N){
            System.out.println(N);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Engagement Stage field is not clicked in side filter\n";
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Planning option is not de-selected in engagement stage field\n";
        }
    }

    public void setValueOfProjectSizeInDBESearch() {
        WaitUtil.simpleSleep(5000);

       /* Actions dragger = new Actions(getDriverProvider().get());
        WebElement draggablePartOfScrollBar = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        int numberOfPixelsToDragTheScrollBarDown = 10000;
        dragger.moveToElement(draggablePartOfScrollBar).clickAndHold().moveByOffset(0,numberOfPixelsToDragTheScrollBarDown).release().perform();
*/
        WaitUtil.simpleSleep(5000);
       /* WebElement Slider = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]"));
        int getHeight = Slider.getSize().height;
        int getWidth = (Slider.getSize().width)/2;


        Actions moveSlider = new Actions(getDriverProvider().get());
        moveSlider.clickAndHold(Slider);
        moveSlider.moveByOffset(10,0).build().perform();*/

        /*Action action = moveSlider.dragAndDropBy(Slider,getWidth , 0).build();
        action.perform();*/

        /* String ctrlF = Keys.chord(Keys.CONTROL,"f");
        findElement(By.tagName("html")).sendKeys(ctrlF);*/


       /* String sliderCount = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/div")).getAttribute("style");
        System.out.println(sliderCount);


        String[] sliderCountArray = sliderCount.split(";");

        String sliderValue = sliderCountArray[1];

        System.out.println(sliderValue);

        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));

        if(!sliderValue.contains("50%")){

            sliderLeft.sendKeys(Keys.ARROW_UP);

        }*/


        String sliderCount = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/div")).getAttribute("style");
        System.out.println(sliderCount);

        String[] sliderCountArray = sliderCount.split(";");
        String sliderValue = sliderCountArray[1];
        System.out.println(sliderValue);

        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<50000;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[2]"));
        for(int i=0;i<60000;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
        }
        WaitUtil.simpleSleep(10000);
    }

    public void clearValueOfProjectSizeInDBESearch(){
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<50000;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[2]"));
        for(int i=40000;i<100000;i++){
            sliderRight.sendKeys(Keys.ARROW_RIGHT);
        }
        WaitUtil.simpleSleep(10000);
    }


    public void setValueOfYearInBusinessInDBESearch(){
        WaitUtil.simpleSleep(5000);
        LoginRealConnexPage.gStrFieldName = "";
        LoginRealConnexPage.gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/strong[2]")).getText();
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[5]/div/div[2]/a[1]"));
        for(int i=1;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WaitUtil.simpleSleep(10000);
    }

    public void clearValueOfYearInBusinessDBESearch(){
        WaitUtil.simpleSleep(5000);
        LoginRealConnexPage.gStrFieldName = "";
        LoginRealConnexPage.gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/strong[2]")).getText();
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[5]/div/div[2]/a[1]"));
        for(int i=1;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WaitUtil.simpleSleep(10000);
    }

    public void setValueOfAverageProjectValueInDBESearch(){
        WaitUtil.simpleSleep(5000);
        LoginRealConnexPage.gStrFieldName = "";
        LoginRealConnexPage.gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/strong[3]")).getText();
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[6]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WaitUtil.simpleSleep(10000);
    }

    public void clearValueOfAverageProjectValueInDBESearch(){
        WaitUtil.simpleSleep(5000);
        LoginRealConnexPage.gStrFieldName = "";
        LoginRealConnexPage.gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/strong[3]")).getText();
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[6]/div/div[2]/a[1]"));
        for(int i=0;i<50;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WaitUtil.simpleSleep(10000);
    }

    public void verifyCompanyNameInDBESearch(String strCompanyName){
        try{
            WaitUtil.simpleSleep(2000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strCompanyName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+""+strCompanyName+" is not displayed in the search result\n";
            //LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+""+strCompanyName+" is not displayed in the search result\n";
        }
    }

    public void verifyCompanyNameIsNotDisplayedInDBESearch(String strCompanyName){
        try{
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strCompanyName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+""+strCompanyName+" is not displayed in the search result\n";
        }
    }

    public void verifyPostingNameIsDisplayedInDBESearch(String strPostingName){
        try{
            WaitUtil.simpleSleep(2000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strPostingName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+""+strPostingName+" is not displayed in the search result\n";
        }
    }

    public void verifyPostingNameIsNotDisplayedInDBESearch(String strPostingName){
        try{
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'" + strPostingName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Affected Field:"+LoginRealConnexPage.gStrFieldName+""+strPostingName+" is displayed in the search result\n";
        }
    }

    public void verifyProviderAsContractorInSearchOptionOfDBE(){
        try{
            WaitUtil.simpleSleep(500);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//div[@id='searchFilters']/div/span[contains(text(),'Provider:')]/strong[contains(text(),'Contractor')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Contractor is not displayed in Provider of search option\n";
        }
    }

    public void selectSolarOptionInAssetFocus(){
        try{
            WaitUtil.simpleSleep(1000);
            findElement(By.cssSelector("#AssettypeId_checkbox_72")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.cssSelector("#AssettypeId_checkbox_72"));
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Asset Focus:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
            WaitUtil.simpleSleep(1000);
        } catch (NoSuchElementException N){
            System.out.println(N);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Asset Focus field is not clicked in side filter\n";
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Solar option is not selected in asset focus field\n";
        }
    }

    public void clearSolarOptionInAssetFocus(){
        try{
            WaitUtil.simpleSleep(1000);
            findElement(By.cssSelector("#AssettypeId_checkbox_72")).click();
            VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.cssSelector("#AssettypeId_checkbox_72"));
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Asset Focus:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
            WaitUtil.simpleSleep(1000);
        } catch (NoSuchElementException N){
            System.out.println(N);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Asset Focus field is not clicked in side filter\n";
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Solar option is not de-selected in asset focus field\n";
        }
    }

    public void selectDesignOptionInEngagementStageField(){
        try{
            WaitUtil.simpleSleep(1000);
            findElement(By.cssSelector("#DealstageId_checkbox_12")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.cssSelector("#DealstageId_checkbox_12"));
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Engagement Stage')]/parent::div/div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
            WaitUtil.simpleSleep(1000);
        } catch (NoSuchElementException N){
            System.out.println(N);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Engagement Stage field is not clicked in side filter\n";
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Design option is not selected in engagement stage field\n";
        }
    }

    public void clearDesignOptionInEngagementStageField(){
        try{
            WaitUtil.simpleSleep(1000);
            findElement(By.cssSelector("#DealstageId_checkbox_12")).click();
            VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.cssSelector("#DealstageId_checkbox_12"));
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Engagement Stage')]/parent::div/div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
            WaitUtil.simpleSleep(1000);
        } catch (NoSuchElementException N){
            System.out.println(N);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Engagement Stage field is not clicked in side filter\n";
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Design option is not de-selected in engagement stage field\n";
        }
    }

    public void verifyProviderAsSubContractorInSearchOptionOfDBE(){
        try{
            WaitUtil.simpleSleep(500);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//div[@id='searchFilters']/div/span[contains(text(),'Provider:')]/strong[contains(text(),'Sub Contractor')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Sub Contractor is not displayed in Provider of search option\n";
        }
    }

    public void selectConstructionAndDevelopmentOptionInService(){
        try{
            WaitUtil.simpleSleep(1000);
            findElement(By.cssSelector("#AssetstrategyId_checkbox_241")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.cssSelector("#AssetstrategyId_checkbox_241"));
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Service')]/parent::div/div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        } catch (NoSuchElementException N){
            System.out.println(N);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Construction and Development option is not selected in service side filter\n";
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Construction and Development option is not selected in service side field\n";
        }
    }

    public void clearConstructionAndDevelopmentOptionInService(){
        try{
            WaitUtil.simpleSleep(1000);
            findElement(By.cssSelector("#AssetstrategyId_checkbox_241")).click();
            VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.cssSelector("#AssetstrategyId_checkbox_241"));
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Service')]/parent::div/div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
            WaitUtil.simpleSleep(1000);
        } catch (NoSuchElementException N){
            System.out.println(N);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Construction and Development option is not de-selected in service side filter\n";
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Construction and Development option is not de-selected in service side field\n";
        }
    }

    public void selectSolidWasteFacilitiesOption(){
        try{
            WaitUtil.simpleSleep(1000);
            findElement(By.cssSelector("#AssetstrategyId_checkbox_150")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.cssSelector("#AssetstrategyId_checkbox_150"));
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Service')]/parent::div/div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        } catch (NoSuchElementException N){
            System.out.println(N);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Solid Waste Facilities option is not selected in service side filter\n";
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Solid Waste Facilities option is not selected in service side field\n";
        }
    }

    public void clearSolidWasteFacilitiesOption(){
        try{
            WaitUtil.simpleSleep(1000);
            findElement(By.cssSelector("#AssetstrategyId_checkbox_150")).click();
            VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.cssSelector("#AssetstrategyId_checkbox_150"));
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Service')]/parent::div/div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
            WaitUtil.simpleSleep(1000);
        } catch (NoSuchElementException N){
            System.out.println(N);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Solid Waste Facilities option is not de-selected in service side filter\n";
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Solid Waste Facilities option is not de-selected in service side field\n";
        }
    }

    public void selectDecommissioningAndClosureOptionInService(){
        try{
            WaitUtil.simpleSleep(1000);
            findElement(By.cssSelector("#AssetstrategyId_checkbox_242")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.cssSelector("#AssetstrategyId_checkbox_242"));
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Service')]/parent::div/div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        } catch (NoSuchElementException N){
            System.out.println(N);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Decommissioning And Closure option is not selected in service side filter\n";
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Decommissioning And Closure option is not selected in service side field\n";
        }
    }

    public void clearDecommissioningAndClosureOptionInService(){
        try{
            WaitUtil.simpleSleep(1000);
            findElement(By.cssSelector("#AssetstrategyId_checkbox_242")).click();
            VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.cssSelector("#AssetstrategyId_checkbox_242"));
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Service')]/parent::div/div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
            WaitUtil.simpleSleep(1000);
        } catch (NoSuchElementException N){
            System.out.println(N);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Decommissioning And Closure option is not de-selected in service side filter\n";
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Decommissioning And Closure option is not de-selected in service side field\n";
        }
    }

    public void selectCogenerationOption(){
        try{
            WaitUtil.simpleSleep(1000);
            findElement(By.cssSelector("#AssetstrategyId_checkbox_166")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.cssSelector("#AssetstrategyId_checkbox_166"));
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Service')]/parent::div/div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        } catch (NoSuchElementException N){
            System.out.println(N);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Cogeneration option is not selected in service side filter\n";
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Cogeneration option is not selected in service side field\n";
        }
    }

    public void clearCogenerationOption(){
        try{
            WaitUtil.simpleSleep(1000);
            findElement(By.cssSelector("#AssetstrategyId_checkbox_166")).click();
            VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.cssSelector("#AssetstrategyId_checkbox_166"));
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Service')]/parent::div/div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
            WaitUtil.simpleSleep(1000);
        } catch (NoSuchElementException N){
            System.out.println(N);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Cogeneration option is not de-selected in service side filter\n";
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Cogeneration option is not de-selected in service side field\n";
        }
    }

    public void setValueOfAverageProjectValueFieldInDBESearch(){
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[6]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        WaitUtil.simpleSleep(10000);
    }

    public void clearValueOfAverageProjectValueFieldInDBESearch(){
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[6]/div/div[2]/a[1]"));
        for(int i=0;i<80;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        WaitUtil.simpleSleep(10000);
    }

    public void selectLightingOption(){
        try{
            WaitUtil.simpleSleep(1000);
            findElement(By.cssSelector("#AssetstrategyId_checkbox_192")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.cssSelector("#AssetstrategyId_checkbox_192"));
            executeScript("scroll(150,0)");
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Service')]/parent::div/div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        } catch (NoSuchElementException N){
            System.out.println(N);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Lighting option is not selected in service side filter\n";
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Lighting option is not selected in service side field\n";
        }
    }

    public void clearLightingOption(){
        try{
            WaitUtil.simpleSleep(1000);
            findElement(By.cssSelector("#AssetstrategyId_checkbox_192")).click();
            VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.cssSelector("#AssetstrategyId_checkbox_192"));
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Service')]/parent::div/div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
            WaitUtil.simpleSleep(1000);
        } catch (NoSuchElementException N){
            System.out.println(N);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Lighting option is not de-selected in service side filter\n";
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Lighting option is not de-selected in service side field\n";
        }
    }

    public void selectEnergyConservationOption(){
        try{
            WaitUtil.simpleSleep(1000);
            findElement(By.cssSelector("#AssetstrategyId_checkbox_205")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.cssSelector("#AssetstrategyId_checkbox_205"));
            executeScript("scroll(150,0)");
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Service')]/parent::div/div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        } catch (NoSuchElementException N){
            System.out.println(N);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Energy Conservation option is not selected in service side filter\n";
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Energy Conservation option is not selected in service side field\n";
        }
    }

    public void clearEnergyConservationOption(){
        try{
            WaitUtil.simpleSleep(1000);
            findElement(By.cssSelector("#AssetstrategyId_checkbox_205")).click();
            VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.cssSelector("#AssetstrategyId_checkbox_205"));
            executeScript("scroll(150,0)");
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Service')]/parent::div/div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
            WaitUtil.simpleSleep(1000);
        } catch (NoSuchElementException N){
            System.out.println(N);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Energy Conservation option is not de-selected in service side filter\n";
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Energy Conservation option is not de-selected in service side field\n";
        }
    }

    public void selectFoundationDesignOption(){
        try{
            WaitUtil.simpleSleep(1000);
            findElement(By.cssSelector("#AssetstrategyId_checkbox_211")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.cssSelector("#AssetstrategyId_checkbox_211"));
            executeScript("scroll(150,0)");
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Service')]/parent::div/div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        } catch (NoSuchElementException N){
            System.out.println(N);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Foundation Design option is not selected in service side filter\n";
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Foundation Design option is not selected in service side field\n";
        }
    }

    public void clearFoundationDesignOption(){
        try{
            WaitUtil.simpleSleep(1000);
            findElement(By.cssSelector("#AssetstrategyId_checkbox_211")).click();
            VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.cssSelector("#AssetstrategyId_checkbox_211"));
            executeScript("scroll(150,0)");
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Service')]/parent::div/div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
            WaitUtil.simpleSleep(1000);
        } catch (NoSuchElementException N){
            System.out.println(N);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Foundation Design option is not de-selected in service side filter\n";
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Foundation Design option is not de-selected in service side field\n";
        }
    }

    public void selectCorporateSafetyOptionInService(){
        try{
            WaitUtil.simpleSleep(1000);
            findElement(By.cssSelector("#AssetstrategyId_checkbox_220")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(), By.cssSelector("#AssetstrategyId_checkbox_220"));
            executeScript("scroll(150,0)");
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Service')]/parent::div/div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        } catch (NoSuchElementException N){
            System.out.println(N);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Corporate Safety option is not selected in service side filter\n";
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Corporate Safety option is not selected in service side field\n";
        }
    }

    public void clearCorporateSafetyOptionInService(){
        try{
            WaitUtil.simpleSleep(1000);
            findElement(By.cssSelector("#AssetstrategyId_checkbox_220")).click();
            VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.cssSelector("#AssetstrategyId_checkbox_220"));
            executeScript("scroll(150,0)");
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Service')]/parent::div/div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
            WaitUtil.simpleSleep(1000);
        } catch (NoSuchElementException N){
            System.out.println(N);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Corporate Safety option is not de-selected in service side filter\n";
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Corporate Safetyoption is not de-selected in service side field\n";
        }
    }

}
