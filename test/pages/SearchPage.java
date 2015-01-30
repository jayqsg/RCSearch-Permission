package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.*;


public class SearchPage extends FluentWebDriverPage {
    public SearchPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void peopleCompaniesLinkClick(){
        try{
        findElement(By.xpath("//div[@id='mainSearchItems']/ul/li/label/span[contains(text(),'People, Companies & Associations')]")).click();
        } catch (NoSuchElementException e){
            System.out.println(e);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click People Companies and Association link\n";
        }
    }

    public void peopleClick(){
        try{
            WaitUtil.simpleSleep(5000);
            findElement(By.xpath("//div[@id='secondSearchItems']/ul/li/label/strong/span[contains(text(),'People')]")).click();
            WaitUtil.simpleSleep(10000);
        } catch (NoSuchElementException e){
            System.out.println(e);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click on People link\n";
        } catch (WebDriverException W){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click on People link\n";
        }
    }

    public void companiesClick(){
        try{
            WaitUtil.simpleSleep(5000);
            findElement(By.xpath("//div[@id='secondSearchItems']/ul/li/label/strong/span[contains(text(),'Companies / Associations')]")).click();
            WaitUtil.simpleSleep(15000);
        } catch (NoSuchElementException e){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click on Companies Link\n";
        }  catch (WebDriverException W){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click on Companies Link\n";
        }
    }

    public void dealSponsorClick(){
        findElement(By.xpath("//div[@id='mainSearchItems']/ul/li/label/span[contains(text(),'Developers, Deal Sponsors')]")).click();
    }

    public void selectDealSponsor(){
        findElement(By.xpath("//div[@id='secondSearchItems']/ul/li[2]/label/strong/span")).click();
    }

    public void clickViewSearchResults(){
        try{
            findElement(By.cssSelector("#stepCounterHolder > a")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click on the Go link\n";
        }
        WaitUtil.simpleSleep(5000);
    }

    public void selectDeveloper(){
        findElement(By.xpath("//div[@id='secondSearchItems']/ul/li[1]/label/strong/span")).click();
    }

    public void selectFundSponsor(){
        findElement(By.xpath("//div[@id='secondSearchItems']/ul/li[3]/label/strong/span")).click();
    }

    public void clickUsers(){
        findElement(By.xpath("//div[@id='secondSearchItems']/ul/li[2]/label/strong/span")).click();
        findElement(By.xpath("//div[@id='secondSearchItems']/ul/li[1]/label/strong/span")).click();
    }

    public void clickRealEstateLink(){
        WaitUtil.simpleSleep(10000);
        findElement(By.xpath("//div[@id='mainSearchItems']/ul/li/label/span[contains(text(),'RE Advisors')]")).click();
    }


    public void clickProjectManagementLink(){
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//div[@id='secondSearchItems']/ul/li/label/strong/span[contains(text(),'Project Management')]")).click();
    }

    public void clickAdvisorLink(){
        findElement(By.xpath("//div[@id='secondSearchItems']/ul/li/label/strong/span[contains(text(),'Advisor')]")).click();
    }

    public void clickAppraisalLink(){
        findElement(By.xpath("//div[@id='thirdSearchItems']/ul/li[3]/label/strong/span")).click();
    }

    public void clickBroker(){
        findElement(By.xpath("//div[@id='mainSearchItems']/ul/li/label/span[text()='Brokers & Agencies']")).click();
    }

    public void clickResidential(){
        findElement(By.xpath("//div[@id='secondSearchItems']/ul/li/label/strong/span[contains(text(),'Residential')]")).click();
    }

    public void clickAcquisitions(){
        findElement(By.xpath("//div[@id='fourthSearchItems']/ul/li/label/strong/span")).click();
    }

    public void clickOffPlanSales(){
        findElement(By.xpath("//div[@id='thirdSearchItems']/ul/li/label/strong/span[contains(text(),'Off Plan Sales')]")).click();
    }                         //div[@id='thirdSearchItems']/ul/li/label/strong/span[contains(text(),'Owner Representative')]

    public void clickInvestmentBanker(){
        findElement(By.xpath("//div[@id='mainSearchItems']/ul/li/label/span[text()='Investment Banker / Capital Markets']")).click();
    }

    public void clickCapitalRaising(){
        findElement(By.xpath(" findElement(By.xpath(\"//div[@id='secondSearchItems']/ul/li/label/strong/span[text()='Capital Raising']\")).click();")).click();
    }
    public void clickInvestments(){
        try{
        findElement(By.xpath("//div[@id='mainSearchItems']/ul/li/label/span[contains(text(),'Investments')]")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click on Investments link\n";
        }
    }

    public void clickDirectIntoProject(){
        try{
            WaitUtil.simpleSleep(5000);
            findElement(By.xpath("//div[@id='secondSearchItems']/ul/li/label/strong/span[contains(text(),'Direct Into Project')]")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click on Direct Into Project link\n";

        }
    }

    public void clickCore(){
        try{
        findElement(By.xpath("//div[@id='thirdSearchItems']/ul/li[1]/label/strong/span[contains(text(),'Core')]")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click on Core link\n";
        }
    }

    public void clickOpportunistic(){
        findElement(By.xpath("//div[@id='thirdSearchItems']/ul/li/label/strong/span[contains(text(),'Opportunistic')]")).click();
    }

    public void clickFund(){
        try{
        findElement(By.xpath("//div[@id='secondSearchItems']/ul/li[2]/label/strong")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click on Fund link\n";
        }
    }

    public void clickCoreOfFund(){
        try{
        findElement(By.xpath("//div[@id='thirdSearchItems']/ul/li/label/strong")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click on Core link in Fund Search\n";

        }
    }

    public void clickMoney(){
        try{
            WaitUtil.simpleSleep(10000);
            findElement(By.xpath("//div[@id='mainSearchItems']/ul/li/label/span[contains(text(),'Money')]")).click();
        } catch (NoSuchElementException e){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click on Money link\n";
        }
    }

    public void clickEquity(){
        try{
        findElement(By.xpath("//div[@id='secondSearchItems']/ul/li/label/strong/span[contains(text(),'Equity')]")).click();
        } catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click on Equity link\n";
        }
    }

    public void clickMezz(){
        findElement(By.xpath("//div[@id='thirdSearchItems']/ul/li/label/strong/span[contains(text(),'Mezz')]")).click();
    }

    public void clickDirectIntoProjectLink(){
        findElement(By.xpath("//div[@id='thirdSearchItems']/ul/li/label/strong/span[contains(text(),'Direct Into Project')]")).click();
//        findElement(By.xpath("//div[@id='fourthSearchItems']/ul/li/label/strong/span[contains(text(),'Direct Into Project')]")).click();
    }

    public void clickFundLink(){
        findElement(By.xpath("//div[@id='fourthSearchItems']/ul/li/label[@class='hold selected']/strong/span[contains(text(),'Fund')]")).click();
    }

    public void clickDebt(){
        try{
        findElement(By.xpath("//div[@id='secondSearchItems']/ul/li/label/strong/span[contains(text(),'Debt')]")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click on Debt link\n";
        }
    }

    public void clickLoans(){
        try{
        findElement(By.xpath("//div[@id='thirdSearchItems']/ul/li/label/strong/span[contains(text(),'Loans')]")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click on Loans link\n";
        }
    }

    public void clickLandLoan(){
        try{
        findElement(By.xpath("//div[@id='fourthSearchItems']/ul/li/label/strong/span[contains(text(),'Land Loan')]")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click on Land Loan link\n";
        }
    }

    public void clickIncomeOrCore(){
        findElement(By.xpath("//div[@id='fourthSearchItems']/ul/li/label/strong/span[contains(text(),'Income / Core')]")).click();
    }

    public void clickPreferred(){
        try{
        findElement(By.xpath("//div[@id='thirdSearchItems']/ul/li/label/strong/span[contains(text(),'Preferred')]")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click on Preferred link\n";

        }
    }

    public void clickFundOfMoney(){
        findElement(By.xpath("//div[@id='thirdSearchItems']/ul/li/label/strong/span[contains(text(),'Fund')]")).click();
        //findElement(By.xpath("//div[@id='fourthSearchItems']/ul/li[2]/label/strong/span[contains(text(),'Fund')]")).click();
    }

    public void clickHardMoney(){
       findElement(By.xpath("//div[@id='thirdSearchItems']/ul/li/label/strong/span[contains(text(),'Hard Money')]")).click();
    }

    public void clickSearchRealConnexMarketPlaceLink(){
        WaitUtil.simpleSleep(20000);
        findElement(By.xpath("//div[@id='showTree']/span/div[@class='select']/b/i")).click();
        WaitUtil.simpleSleep(1000);
    }

    public void jvPartnerLinkClick(){
       findElement(By.xpath("//div[@id='mainSearchItems']/ul/li/label/span[contains(text(),'JV Partners')]")).click();
    }

    public void clickNewBusinessLinkClick(){
        WaitUtil.simpleSleep(10000);
        findElement(By.xpath("//div[@id='mainSearchItems']/ul/li/label/span[contains(text(),'New Business')]")).click();
        WaitUtil.simpleSleep(5000);
    }

    public void landLinkClick(){
        findElement(By.xpath("//div[@id='secondSearchItems']/ul/li/label/strong/span[contains(text(),'Land')]")).click();
    }

    public void clickOnLoansInNewBusinessSearch(){
        findElement(By.xpath("//div[@id='secondSearchItems']/ul/li/label/strong/span[contains(text(),'Loans')]")).click();
    }

    public void clickLoansOrHardMoneyLink(){
       findElement(By.xpath("//div[@id='thirdSearchItems']/ul/li/label/strong/span[contains(text(),'Loans/Hard Money')]")).click();
    }

    public void clickMezzOfNewBusinessSearch(){
        findElement(By.xpath("//div[@id='thirdSearchItems']/ul/li/label/strong/span[contains(text(),'Mezz')]")).click();
    }

    public void clickProject(){
        findElement(By.xpath("//div[@id='secondSearchItems']/ul/li/label/strong/span[contains(text(),'Project')]")).click();
    }

    public void clickEquity_JVPartner(){
        findElement(By.xpath("//div[@id='secondSearchItems']/ul/li/label/strong/span[contains(text(),'Project')]")).click();
    }

    public void clickService(){
        findElement(By.xpath("//div[@id='secondSearchItems']/ul/li/label/strong/span[contains(text(),'Services')]")).click();
    }

    public void clickOther(){
        findElement(By.xpath("//div[@id='secondSearchItems']/ul/li/label/strong/span[contains(text(),'Other')]")).click();
    }

    public void clickCorporateFinance(){
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='secondSearchItems']/ul/li/label/strong/span[contains(text(),'Corporate Finance')]")).click();
    }

    public void clickResidentialBrokerLink() {
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='secondSearchItems']/ul/li/label/strong/span[contains(text(),'Residential Broker')]")).click();
    }

    public void clickCommercialBrokerLink(){
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='secondSearchItems']/ul/li/label/strong/span[contains(text(),'Commercial Broker')]")).click();
    }

    public void clickAcquisitionLink_NewBusiness(){
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='thirdSearchItems']/ul/li/label/strong/span[contains(text(),'Acquisition')]")).click();
    }

    public void clickDesignBuildEngineerLink(){
        WaitUtil.simpleSleep(10000);
        findElement(By.xpath("//div[@id='mainSearchItems']/ul/li/label/span[contains(text(),'Design Build & Engineering')]")).click();
    }

    public void clickArchitectLink(){
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='secondSearchItems']/ul/li/label/strong/span[contains(text(),'Architect')]")).click();
    }

    public void clickDesignerLink(){
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='secondSearchItems']/ul/li/label/strong/span[contains(text(),'Designer')]")).click();
    }

    public void clickContractorLink(){
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='secondSearchItems']/ul/li/label/strong/span[text()='Contractor']")).click();
    }

    public void clickSubContractorLink(){
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='secondSearchItems']/ul/li/label/strong/span[text()='Sub Contractor']")).click();
    }

    public void clickOnEngineerLink(){
        try{
            WaitUtil.simpleSleep(1000);
            findElement(By.xpath("//div[@id='secondSearchItems']/ul/li/label/strong/span[text()='Engineer']")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Unable to click on 'Engineer' link in search page\n";
        }
    }

    public void clickOnCivilEngineerLink(){
        try{
            WaitUtil.simpleSleep(1000);
            findElement(By.xpath("//div[@id='thirdSearchItems']/ul/li/label/strong/span[text()='Civil Engineer']")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Unable to click on 'Civil Engineer' link in search page\n";
        }
    }

    public void clickOnMechanicalEngineerLink(){
        try{
            WaitUtil.simpleSleep(1000);
            findElement(By.xpath("//div[@id='thirdSearchItems']/ul/li/label/strong/span[text()='Mechanical Engineer']")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Unable to click on 'Mechanical Engineer' link in search page\n";
        }
    }

    public void clickOnElectricalEngineerLink(){
        try{
            WaitUtil.simpleSleep(1000);
            findElement(By.xpath("//div[@id='thirdSearchItems']/ul/li/label/strong/span[text()='Electrical Engineer']")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Unable to click on 'Electrical Engineer' link in search page\n";
        }
    }

    public void clickOnEnvironmentalEngineerLink(){
        try{
            WaitUtil.simpleSleep(1000);
            findElement(By.xpath("//div[@id='thirdSearchItems']/ul/li/label/strong/span[text()='Environmental Engineer']")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Unable to click on 'Environmental Engineer' link in search page\n";
        }
    }

    public void clickOnStructuralEngineerLink(){
        try{
            WaitUtil.simpleSleep(1000);
            findElement(By.xpath("//div[@id='thirdSearchItems']/ul/li/label/strong/span[text()='Structural Engineer']")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Unable to click on 'Structural Engineer' link in search page\n";
        }
    }

    public void clickHealthAndSafetyEngineerLink(){
        try{
            WaitUtil.simpleSleep(1000);
            findElement(By.xpath("//div[@id='thirdSearchItems']/ul/li/label/strong/span[text()='Health & Safety Engineer']")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Unable to click on 'Health & Safety Engineer' link in search page\n";
        }
    }
}
