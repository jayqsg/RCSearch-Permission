package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.Support.ReadData;

import java.util.List;

public class CompaniesSearchValidationPage extends FluentWebDriverPage{
    test.Support.ReadData ReadData = new ReadData();
    public CompaniesSearchValidationPage(WebDriverProvider driverProvider){
        super(driverProvider);
    }

    public void verifyDealSponsorCompanyNameNotDisplayed(String strDealSponsorCompany){

        //wait until page loads
        WaitUtil.simpleSleep(3000);
        Assert.assertFalse(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDealSponsorCompany+"')]"), getDriverProvider().get()));
    }

    public void verifyDeveloperCompanyNameIsDisplayed(String strDeveloperCompany){

        //wait until page loads
        WaitUtil.simpleSleep(3000);
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDeveloperCompany+"')]"), getDriverProvider().get()));
    }

    public void verifyDeveloperCompanyNameNotDisplayed(String strDeveloperCompany){

        //wait until page loads
        WaitUtil.simpleSleep(3000);
        Assert.assertFalse(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDeveloperCompany+"')]"), getDriverProvider().get()));
    }

    public void enterDeveloperCompanyTitle(int RowIndex){
        try{

            //wait until company name appear
            WaitUtil.simpleSleep(500);
            String strCompanyName = ReadData.readDataExcel("CompaniesFieldDetails", RowIndex, "CompanyNameOfDeveloper");
            findElement(By.id("CompanyTitle")).click();
            findElement(By.id("CompanyTitle")).sendKeys(strCompanyName);
        } catch (Exception e) {
            System.out.println(e);
        }

        //wait until company name appear
        WaitUtil.simpleSleep(15000);
    }

    public void clearInvestorCompanyTitle(){

        //wait until company name appear
        WaitUtil.simpleSleep(500);
        findElement(By.id("CompanyTitle")).clear();
        findElement(By.id("CompanyTitle")).clear();
    }

    public void enterDeveloperType(int RowIndex){
        try{
            //wait until company name appear
            WaitUtil.simpleSleep(500);
            String strSubRoleType = ReadData.readDataExcel("CompaniesFieldDetails", RowIndex, "SubRole");
            findElement(By.id("CompanySubrole")).click();
            findElement(By.id("CompanySubrole")).sendKeys(strSubRoleType);
            findElement(By.id("CompanySubrole")).click();
            //wait until company name appear
            WaitUtil.simpleSleep(5000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

