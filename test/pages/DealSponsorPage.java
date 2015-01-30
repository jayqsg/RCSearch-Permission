package test.pages;


import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import test.Support.ReadData;

public class DealSponsorPage extends FluentWebDriverPage {

    ReadData ReadData = new ReadData();

    public DealSponsorPage(WebDriverProvider driverProvider){
        super(driverProvider);
    }

    public String verifyFindInSearchOption(){
        WaitUtil.simpleSleep(1000);
        String strFindInSearchOption = findElement(By.xpath("//div[@id='searchFilters']/div/span[contains(text(),'Find:')]//following-sibling::strong")).getText();
        return strFindInSearchOption;
    }

    public String verifySearchOption(){
        String strNameOfSubRole = findElement(By.xpath("//div[@id='searchFilters']/div/span[contains(text(),'Subrole:')]//following-sibling::strong")).getText();
        return strNameOfSubRole;
    }

    public void clickProject(){
        //wait until project field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("ui-accordion-1-header-0")).click();
    }

    public void clickAssetStrategy(){

        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        executeScript("scrollTo(0,900)");
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Asset Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectAcquisitionField(){
        //wait until strategy drop down field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_1")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until strategy field appears
        WaitUtil.simpleSleep(12000);
    }

    public void clearAcquisitionField(){
        //wait until project field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_1")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-1']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        WaitUtil.simpleSleep(10000);
    }

    public void clickAssetExperience(){
        //wait until asset experience
        WaitUtil.simpleSleep(500);
        executeScript("scrollTo(0,500)");
        findElement(By.id("ui-accordion-1-header-1")).click();
        WaitUtil.simpleSleep(5000);
    }

    public void clickAssetExperienceField_CompanySearch(){
        //wait until asset experience
        WaitUtil.simpleSleep(500);
        Point lStrPathOfVariable = findElement(By.id("ui-accordion-1-header-0")).getLocation();
        executeScript("scrollTo(0,"+lStrPathOfVariable.getY()+")");
        executeScript("window.scrollBy(-300,0)", "");
        findElement(By.id("ui-accordion-1-header-1")).click();
        //wait until page load
        WaitUtil.simpleSleep(5000);
    }
}