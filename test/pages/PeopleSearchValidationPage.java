package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import test.Support.ReadData;
import test.Support.ReasonsInResultSheet;


public class PeopleSearchValidationPage extends FluentWebDriverPage {

    ReadData ReadData = new ReadData();
    public PeopleSearchValidationPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void verifyInvestorUserNameNotDisplayed(String strInvestorUserName){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        ReasonsInResultSheet.assertStatementIfElementIsNotPresentAndFieldName(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strInvestorUserName+"')]"), getDriverProvider().get());
    }

    public void verifyInvestorUserNameIsDisplayed(String strInvestorUserName){
        //wait until page loads
        WaitUtil.simpleSleep(3000);
        ReasonsInResultSheet.assertStatementIfElementIsPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strInvestorUserName+"')]"), getDriverProvider().get());
    }

    public void verifyDealSponsorUserNameNotDisplayed(String strDealSponsorUserName){
        //wait until page loads
        WaitUtil.simpleSleep(3000);
        ReasonsInResultSheet.assertStatementIfElementIsNotPresentAndFieldName(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDealSponsorUserName+"')]"), getDriverProvider().get());
    }

    public void enterInvestorUserName(int RowIndex){
        try{
            //wait until text field is found
            WaitUtil.simpleSleep(1000);
            String strUserTitle = ReadData.readDataExcel("PeopleDetails", RowIndex, "InvestorUserName");
            LoginRealConnexPage.gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div/div[1]/label")).getText();
            ReasonsInResultSheet.enterDataToTextField(getDriverProvider().get(), By.id("UserTitle"), strUserTitle, LoginRealConnexPage.gStrFieldName, LoginRealConnexPage.gStrReason);
        } catch (Exception e) {
            System.out.println(e);
        }
        //wait until text field is found
        WaitUtil.simpleSleep(10000);
    }

    public void enterInvestorJobTitle(int RowIndex){
        try{
            String strUserJobTitle = ReadData.readDataExcel("PeopleDetails", RowIndex, "InvestorJobTitle");
            LoginRealConnexPage.gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div/div[2]/label")).getText();
            //wait until text field is found
            WaitUtil.simpleSleep(5000);
            ReasonsInResultSheet.enterDataToTextField(getDriverProvider().get(), By.id("UserJobTitle"), strUserJobTitle, LoginRealConnexPage.gStrFieldName, LoginRealConnexPage.gStrReason);
        } catch (Exception e) {
            System.out.println(e);
        }
        //wait until title field appear
        WaitUtil.simpleSleep(10000);
    }

    public void enterInvestorCompanyName(int RowIndex){
        try{
            String strCompanyName = ReadData.readDataExcel("PeopleDetails", RowIndex, "InvestorCompanyName");
            LoginRealConnexPage.gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            ReasonsInResultSheet.enterDataToTextField(getDriverProvider().get(), By.id("UserCompanyName"), strCompanyName, LoginRealConnexPage.gStrFieldName, LoginRealConnexPage.gStrReason);
        } catch (Exception e) {
            System.out.println(e);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

}
