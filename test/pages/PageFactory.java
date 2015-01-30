package test.pages;

import com.google.inject.Inject;
import org.jbehave.web.selenium.WebDriverProvider;
import test.Support.ReasonsInResultSheet;


public class PageFactory {

    private final WebDriverProvider webDriverProvider;

    @Inject
    public PageFactory(WebDriverProvider webDriverProvider) {
        this.webDriverProvider = webDriverProvider;
    }

    public WindowHandling newWindowHandling() {
        return new WindowHandling(webDriverProvider);
    }



   /* public  BrowserPage newBrowserPage() {
        return new BrowserPage(webDriverProvider);
    }*/

    public LoginRealConnexPage newLoginRealConnexPage () {
        return new LoginRealConnexPage(webDriverProvider);
    }

    public UserProfilePage newUserProfilePage () {
        return new UserProfilePage(webDriverProvider);
    }

    public SearchPage newSearchPage () {
        return new SearchPage(webDriverProvider);
    }

    public PeopleSearchPage newPeopleSearchPage () {
        return new PeopleSearchPage(webDriverProvider);
    }

    public PeopleSearchValidationPage newPeopleSearchValidationPage(){
        return new PeopleSearchValidationPage(webDriverProvider);
    }

    public ResultHandlingPage newResultHandlingPage () {
        return new ResultHandlingPage(webDriverProvider);
    }

    public CompaniesSearchPage newCompaniesSearchPage () {
        return new CompaniesSearchPage(webDriverProvider);
    }

    public CompaniesSearchValidationPage newCompaniesSearchValidationPage(){
        return new CompaniesSearchValidationPage(webDriverProvider);
    }

    public DealSponsorPage newDealSponsorPage(){
        return new DealSponsorPage(webDriverProvider);
    }

    public DealSponsorValidationPage newDealSponsorValidationPage(){
        return new DealSponsorValidationPage(webDriverProvider);
    }
    public DeveloperSearchPage newDeveloperSearchPage(){
        return new DeveloperSearchPage(webDriverProvider);
    }

    public DeveloperSearchValidationPage newDeveloperSearchValidationPage(){
        return new DeveloperSearchValidationPage(webDriverProvider);
    }

    public FundSponsorPage newFundSponsorPage(){
        return new FundSponsorPage(webDriverProvider);
    }

    public FundSponsorValidationPage newFundSponsorValidationPage(){
        return new FundSponsorValidationPage(webDriverProvider);
    }

    public DeveloperDealAndFundSponsorPage newDeveloperDealAndFundSponsorPage(){
        return new DeveloperDealAndFundSponsorPage(webDriverProvider);
    }

    public CombinationOfDealSponsorValidationPage newCombinationOfDealSponsorValidationPage(){
        return new CombinationOfDealSponsorValidationPage(webDriverProvider);
    }

    public CompaniesOfDealSponsorPage newCompaniesOfDealSponsorPage(){
        return new CompaniesOfDealSponsorPage(webDriverProvider);
    }

    public CompaniesOfDealSponsorValidationPage newCompaniesOfDealSponsorValidationPage(){
        return new CompaniesOfDealSponsorValidationPage(webDriverProvider);
    }

    public CompaniesOfDeveloperPage newCompaniesOfDeveloperPage(){
        return new CompaniesOfDeveloperPage(webDriverProvider);
    }


    public CompaniesOfFundSponsorPage newCompaniesOfFundSponsorPage(){
        return new CompaniesOfFundSponsorPage(webDriverProvider);
    }

    public CompaniesOfFundSponsorValidationPage newCompaniesOfFundSponsorValidationPage(){
        return new CompaniesOfFundSponsorValidationPage(webDriverProvider);
    }

    public  CompaniesOfDealDeveloperFundPage newCompaniesOfDealDeveloperFundPage(){
        return new  CompaniesOfDealDeveloperFundPage(webDriverProvider);
    }

    public ProjectOfAdvisorSearchPage newProjectOfAdvisorSearchPage(){
        return new ProjectOfAdvisorSearchPage(webDriverProvider);
    }

    public ProjectOfAdvisorSearchValidationPage newProjectOfAdvisorSearchValidationPage(){
        return new ProjectOfAdvisorSearchValidationPage(webDriverProvider);
    }

    public ProjectOfBrokerSearchPage newProjectOfBrokerSearchPage(){
        return new ProjectOfBrokerSearchPage(webDriverProvider);
    }

    public ProjectOfBrokerSearchValidationPage newProjectOfBrokerSearchValidationPage(){
        return new ProjectOfBrokerSearchValidationPage(webDriverProvider);
    }

    public ProjectOfInvestmentBankerSearchPage newProjectOfInvestmentBankerSearchPage(){
        return new ProjectOfInvestmentBankerSearchPage(webDriverProvider);
    }

    public ProjectOfInvestmentBankerSearchValidationPage newProjectOfInvestmentBankerSearchValidationPage(){
        return new ProjectOfInvestmentBankerSearchValidationPage(webDriverProvider);
    }

    public  CompanyOfAdvisorSearchPage newCompanyOfAdvisorSearchPage(){
        return new  CompanyOfAdvisorSearchPage(webDriverProvider);
    }

    public CompanyOfAdvisorValidationPage newCompanyOfAdvisorValidationPage(){
        return  new CompanyOfAdvisorValidationPage(webDriverProvider);
    }

    public  CompanyOfBrokerPage newCompanyOfBrokerPage(){
        return new CompanyOfBrokerPage(webDriverProvider);
    }

    public CompanyOfBrokerValidationPage newCompanyOfBrokerValidationPage(){
        return new CompanyOfBrokerValidationPage(webDriverProvider);
    }

    public  CompanyOfInvestmentBankerPage newCompanyOfInvestmentBankerPage(){
        return new CompanyOfInvestmentBankerPage(webDriverProvider);
    }

    public CompanyOfInvestmentBankerValidationPage newCompanyOfInvestmentBankerValidationPage(){
        return new CompanyOfInvestmentBankerValidationPage(webDriverProvider);
    }

    public  CompanyProfilePage newCompanyProfilePage(){
        return new CompanyProfilePage(webDriverProvider);
    }

    public LogoutPage newLogoutPage() {
        return new LogoutPage(webDriverProvider);
    }

    public ProjectOfInvestmentDirectIntoPage newProjectOfInvestmentDirectIntoPage() {
        return new ProjectOfInvestmentDirectIntoPage(webDriverProvider);
    }

    public ProjectOfInvestmentDirectIntoValidationPage newProjectOfInvestmentDirectIntoValidationPage(){
        return new ProjectOfInvestmentDirectIntoValidationPage(webDriverProvider);
    }

    public InvestmentDirectIntoValidationPage newInvestmentDirectIntoValidationPage(){
        return new InvestmentDirectIntoValidationPage(webDriverProvider);
    }

    public InvestmentDirectIntoCompanyPage newInvestmentDirectIntoCompanyPage(){
        return new InvestmentDirectIntoCompanyPage(webDriverProvider);
    }

    public InvestmentDirectIntoCompanyValidationPage newInvestmentDirectIntoCompanyValidationPage(){
        return new InvestmentDirectIntoCompanyValidationPage(webDriverProvider);
    }

    public InvestmentFundCompanyPage newInvestmentFundCompanyPage(){
        return new InvestmentFundCompanyPage(webDriverProvider);
    }

    public InvestmentFundCompanyValidationPage newInvestmentFundCompanyValidationPage(){
        return new InvestmentFundCompanyValidationPage(webDriverProvider);
    }

    public InvestmentFundProjectPage newInvestmentFundProjectPage(){
        return new InvestmentFundProjectPage(webDriverProvider);
    }

    public InvestmentFundProjectValidationPage newInvestmentFundProjectValidationPage(){
        return new InvestmentFundProjectValidationPage(webDriverProvider);
    }

    public CompaniesOfDeveloperValidationPage newCompaniesOfDeveloperValidationPage() {
        return new CompaniesOfDeveloperValidationPage(webDriverProvider);
    }

    public MoneyDebtMezzProjectSearchPage newMoneyDebtMezzProjectSearchPage (){
        return new MoneyDebtMezzProjectSearchPage(webDriverProvider);
    }

    public MoneyDebtLoanCompanyPage newMoneyDebtLoanCompanyPage(){
        return new MoneyDebtLoanCompanyPage(webDriverProvider);
    }

    public MoneyDebtLoanCompanyValidationPage newMoneyDebtLoanCompanyValidationPage(){
        return new MoneyDebtLoanCompanyValidationPage(webDriverProvider);
    }

    public MoneyDebtLoanProjectPage newMoneyDebtLoanProjectPage(){
        return new MoneyDebtLoanProjectPage(webDriverProvider);
    }

    public MoneyDebtLoanProjectValidationPage newMoneyDebtLoanProjectValidationPage() {
        return new MoneyDebtLoanProjectValidationPage(webDriverProvider);
    }

    public MoneyDebtMezzProjectValidationPage newMoneyDebtMezzProjectValidationPage(){
        return new MoneyDebtMezzProjectValidationPage(webDriverProvider);
    }

    public MoneyEquityFundCompanySearchPage newMoneyEquityFundCompanySearchPage(){
        return new MoneyEquityFundCompanySearchPage(webDriverProvider);
    }

    public MoneyEquityFundProjectSearchPage newMoneyEquityFundProjectSearchPage(){
        return new MoneyEquityFundProjectSearchPage(webDriverProvider);
    }

    public MoneyEquityFundCompanyValidationSearchPage newMoneyEquityFundCompanyValidationSearchPage(){
        return new MoneyEquityFundCompanyValidationSearchPage(webDriverProvider);
    }

    public MoneyEquityFundProjectValidationSearchPage newMoneyEquityFundProjectValidationSearchPage(){
        return new MoneyEquityFundProjectValidationSearchPage(webDriverProvider);
    }

    public MoneyDebtMezzCompanySearchPage newMoneyDebtMezzCompanySearchPage(){
        return new MoneyDebtMezzCompanySearchPage(webDriverProvider);
    }

    public PrivacySetToPublicPage newPrivacySetToPublicPage() {
        return new PrivacySetToPublicPage(webDriverProvider);
    }

    public PrivacyVerificationPage newSearchResultsPage() {
        return new PrivacyVerificationPage(webDriverProvider);
    }

    public PrivacySetToPrivatePage newPrivacySetToPrivatePage(){
        return new PrivacySetToPrivatePage(webDriverProvider);
    }

    public CreateUserPage newCreateUserPage() {
        return new CreateUserPage(webDriverProvider);
    }

    public MyUniversePage newMyUniversePage(){
        return new MyUniversePage(webDriverProvider);
    }

    public JVPartnerPage newJVPartnerPage(){
        return new JVPartnerPage(webDriverProvider);
    }

    public NewBusinessPage newNewBusinessPage(){
        return new NewBusinessPage(webDriverProvider);
    }

    public CompanyAndPostingOfDBEPage newCompanyAndPostingOfDBEPage() {
        return new CompanyAndPostingOfDBEPage(webDriverProvider);
    }
}