package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.Support.ReadData;


public class CompaniesSearchPage extends FluentWebDriverPage {
    ReadData ReadData = new ReadData();
    public CompaniesSearchPage(WebDriverProvider driverProvider){
        super(driverProvider);
    }

    public void clickDealSponsorCompanyName(int RowIndex){
        try{
            WaitUtil.simpleSleep(1000);
            String strVerifyCompanyName = ReadData.readDataExcel("CompaniesFieldDetails", RowIndex, "VerifyCompanyName");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strVerifyCompanyName+"')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void verifyInvestorCompanyName(String strInvestorCompany){

        //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strInvestorCompany+"')]"), getDriverProvider().get()));
    }

    public void clickInvestorCompanyName(int RowIndex){
        try{
            String strVerifyCompanyName = ReadData.readDataExcel("CompaniesFieldDetails", RowIndex,"InvestorCompanyName");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strVerifyCompanyName+"')]")).click();
        } catch(Exception e) {
            System.out.println();
        }
    }

    public void verifyLenderCompanyName(String strLenderCompany){

        //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strLenderCompany+"')]"), getDriverProvider().get()));
    }

    public void clickLenderCompanyName(int RowIndex){
        try{
            String strVerifyCompanyName = ReadData.readDataExcel("CompaniesFieldDetails", RowIndex,"LenderCompanyName");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strVerifyCompanyName+"')]")).click();
        } catch(Exception e) {
            System.out.println();
        }
    }

    public void verifyAdvisorCompanyName(String strServiceCompany){

        //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strServiceCompany+"')]"), getDriverProvider().get()));
    }

    public void clickAdvisorCompanyName(int RowIndex){
        try{
            String strVerifyCompanyName = ReadData.readDataExcel("CompaniesFieldDetails", RowIndex,"RealEstateAdvisorCompany");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strVerifyCompanyName+"')]")).click();
        } catch(Exception e) {
            System.out.println();
        }
    }

    public void enterCompanyName(int RowIndex){
        try{
            String strCompanyName = ReadData.readDataExcel("CompaniesFieldDetails", RowIndex, "CompanyName");
            findElement(By.id("CompanyTitle")).clear();
            findElement(By.id("CompanyTitle")).click();
            findElement(By.id("CompanyTitle")).sendKeys(strCompanyName);
            //wait until page gets loaded
            WaitUtil.simpleSleep(9000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void enterTypeField(int RowIndex){
        try {
            String strSubRoleType = ReadData.readDataExcel("CompaniesFieldDetails", RowIndex, "SubRoleType");
            findElement(By.id("CompanySubrole")).click();
            //wait until page gets loaded
            WaitUtil.simpleSleep(10000);
            findElement(By.id("CompanySubrole")).sendKeys(strSubRoleType);
            //wait until page gets loaded
            WaitUtil.simpleSleep(10000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void verifyDealSponsorCompanyName(String strDealSponsorCompany){

        //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDealSponsorCompany+"')]"), getDriverProvider().get()));
    }

    public void verifyDealSponsorCompanyNameIsDisplayed(String strDealSponsorCompany){

        //wait until page gets loaded
        WaitUtil.simpleSleep(5000);
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDealSponsorCompany+"')]"), getDriverProvider().get()));
    }


    public void clearCompanyNameField(){
        int intCnt=0;
        boolean blnFound=false;
        while(!blnFound && intCnt<10){
            try{
                //wait until name field appears
                WaitUtil.simpleSleep(500);
                findElement(By.id("CompanyTitle")).clear();
                blnFound=true;
                WaitUtil.simpleSleep(1000);
            }catch(Exception e){
                WaitUtil.simpleSleep(20000);
                intCnt++;
            }
        }

    }

    public void clearTypeField(){
        //wait until name field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("CompanySubrole")).clear();
        //wait until name field appears
        WaitUtil.simpleSleep(20000);
    }
}

