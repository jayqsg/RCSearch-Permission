package test.configuration;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Scopes;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.embedder.Embedder;
import org.jbehave.core.embedder.StoryControls;
import org.jbehave.core.failures.PassingUponPendingStep;
import org.jbehave.core.failures.PendingStepStrategy;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.reporters.CrossReference;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.guice.GuiceStepsFactory;
import org.jbehave.web.selenium.*;
import test.steps.*;

import java.util.HashMap;

import static org.jbehave.core.reporters.Format.CONSOLE;
import static org.jbehave.web.selenium.WebDriverHtmlOutput.WEB_DRIVER_HTML;

public class StoryEmbedder extends Embedder {
    private SeleniumContext      seleniumContext     = new SeleniumContext();
    private PendingStepStrategy  pendingStepStrategy = new PassingUponPendingStep();
    private CrossReference       crossReference      = new CrossReference().withJsonOnly().withPendingStepStrategy(pendingStepStrategy)
            .withOutputAfterEachStory(true).excludingStoriesWithNoExecutedScenarios(true);
    private ContextView          contextView         = new LocalFrameContextView().sized(640, 120);
    private SeleniumStepMonitor  stepMonitor         = new SeleniumStepMonitor(contextView, seleniumContext,
            crossReference.getStepMonitor());
    private Format[]             formats             = new Format[]{new SeleniumContextOutput(seleniumContext), CONSOLE, WEB_DRIVER_HTML};
    private StoryReporterBuilder reporterBuilder     = new StoryReporterBuilder()
            .withFailureTrace(true)
            .withFailureTraceCompression(false).withDefaultFormats().withFormats(formats)
            .withCrossReference(crossReference);
    // Do this last, because it might override some of the settings above
    private Injector             injector            = createInjector();

    @Override
    public Configuration configuration() {
        return new SeleniumConfiguration()
                .useSeleniumContext(seleniumContext)
                .usePendingStepStrategy(pendingStepStrategy)
                .useStoryControls(new StoryControls().doResetStateBeforeScenario(true)).useStepMonitor(stepMonitor)
                .useStoryLoader(new LoadFromClasspath(Stories.class))
                .useStoryReporterBuilder(reporterBuilder);
    }

    @Override
    public InjectableStepsFactory stepsFactory() {
        return new GuiceStepsFactory(configuration(), injector);
    }

    private Injector createInjector() {
        Injector injector = Guice.createInjector(new SetupModule(reporterBuilder), new StepsModule());

        // Reset headless property for acceptance tests, the server sets it to true in PropertiesModule, but that would
        // make JBehave unhappy
        System.setProperty("java.awt.headless", "false");

        return injector;
    }

    public class SetupModule extends AbstractModule {
        private StoryReporterBuilder reporterBuilder;

        public SetupModule(StoryReporterBuilder theReporterBuilder) {
            reporterBuilder = theReporterBuilder;
        }

        @Override
        protected void configure() {
            WebDriverProvider driverProvider;
            if (System.getProperty("SAUCE_USERNAME") != null) {
                driverProvider = new RealConnexWebDriverProvider();

                // This isn't really entirely kosher, it's overwriting configuration of the containing class
                // and will only work if the injector is the last thing to be initialized as part of the
                // construction of the class
                formats = new Format[]{new SeleniumContextOutput(seleniumContext), CONSOLE, WEB_DRIVER_HTML};
                contextView = new SauceLabsContextView(driverProvider);
                crossReference.withThreadSafeDelegateFormat(new SauceContextOutput(driverProvider, seleniumContext,
                        new HashMap<String, String>()));

                reporterBuilder = new StoryReporterBuilder()
                        .withFailureTrace(true)
                        .withFailureTraceCompression(false).withDefaultFormats().withFormats(Format.STATS)
                        .withCrossReference(crossReference);
            }
            else {
                driverProvider = new PropertyWebDriverProvider();
            }
            bind(WebDriverProvider.class).toInstance(driverProvider);

            bind(WebDriverPageDumpOnFailure.class).toInstance(
                    new WebDriverPageDumpOnFailure(driverProvider, reporterBuilder));
            bind(WebDriverScreenshotOnFailure.class).toInstance(
                    new WebDriverScreenshotOnFailure(driverProvider, reporterBuilder));

            bind(PerStoryWebDriverConfiguration.class).toInstance(new PerStoryWebDriverConfiguration(driverProvider));
//            bind(LifecycleSteps.class).in(Scopes.SINGLETON);
        }
    }

    public static class StepsModule extends AbstractModule {
        @Override
        protected void configure() {

           // bind(OpenBrowserSteps.class).in(Scopes.SINGLETON);
           // bind(UserAsDealSponsorSteps.class).in(Scopes.SINGLETON);
            bind(ResultHandlingSteps.class).in(Scopes.SINGLETON);
            bind(LoginRealConnexSteps.class).in(Scopes.SINGLETON);
            bind(UserProfileSteps.class).in(Scopes.SINGLETON);
            bind(SearchSteps.class).in(Scopes.SINGLETON);
            bind(PeopleSearchSteps.class).in(Scopes.SINGLETON);
            bind(PeopleSearchValidationSteps.class).in(Scopes.SINGLETON);
            bind(CompaniesSearchSteps.class).in(Scopes.SINGLETON);
            bind(CompaniesSearchValidationSteps.class).in(Scopes.SINGLETON);
            bind(DealSponsorSteps.class).in(Scopes.SINGLETON);
            bind(DealSponsorValidationSteps.class).in(Scopes.SINGLETON);
            bind(DeveloperSearchSteps.class).in(Scopes.SINGLETON);
            bind(DeveloperSearchValidationSteps.class).in(Scopes.SINGLETON);
            bind(FundSponsorSteps.class).in(Scopes.SINGLETON);
            bind(FundSponsorValidationSteps.class).in(Scopes.SINGLETON);
            bind(DeveloperDealAndFundSponsorSteps.class).in(Scopes.SINGLETON);
            bind(CombinationOfDealSponsorSearchValidationSteps.class).in(Scopes.SINGLETON);
            bind(CompaniesOfDealSponsorSteps.class).in(Scopes.SINGLETON);
            bind(CompaniesOfDealSponsorValidationSteps.class).in(Scopes.SINGLETON);
            bind(CompaniesOfDeveloperSteps.class).in(Scopes.SINGLETON);
            bind(CompaniesOfDeveloperValidationSteps.class).in(Scopes.SINGLETON);
            bind(CompaniesOfDealDeveloperFundSteps.class).in(Scopes.SINGLETON);
            bind(CompaniesOfFundSponsorSteps.class).in(Scopes.SINGLETON);
            bind(CompaniesOfFundSponsorValidationSteps.class).in(Scopes.SINGLETON);
            bind(ProjectOfAdvisorSearchSteps.class).in(Scopes.SINGLETON);
            bind(ProjectOfAdvisorSearchValidationSteps.class).in(Scopes.SINGLETON);
            bind(ProjectOfBrokerSearchSteps.class).in(Scopes.SINGLETON);
            bind(ProjectOfBrokerSearchValidationSteps.class).in(Scopes.SINGLETON);
            bind(ProjectOfInvestmentBankerSearchSteps.class).in(Scopes.SINGLETON);
            bind(ProjectOfInvestmentBankerSearchValidationSteps.class).in(Scopes.SINGLETON);
            bind(CompanyOfAdvisorSearchSteps.class).in(Scopes.SINGLETON);
            bind(CompanyOfAdvisorValidationSteps.class).in(Scopes.SINGLETON);
            bind(CompanyOfBrokerSteps.class).in(Scopes.SINGLETON);
            bind(CompanyOfBrokerValidationSteps.class).in(Scopes.SINGLETON);
            bind(CompanyOfInvestmentBankerSteps.class).in(Scopes.SINGLETON);
            bind(CompanyOfInvestmentBankerValidationSteps.class).in(Scopes.SINGLETON);
            bind(ProjectOfInvestmentDirectIntoSteps.class).in(Scopes.SINGLETON);
            bind(ProjectOfInvestmentDirectIntoValidationSteps.class).in(Scopes.SINGLETON);
            bind(InvestmentDirectIntoValidationSteps.class).in(Scopes.SINGLETON);
            bind(InvestmentDirectIntoCompanySteps.class).in(Scopes.SINGLETON);
            bind(InvestmentDirectIntoCompanyValidationSteps.class).in(Scopes.SINGLETON);
            bind(InvestmentFundCompanySteps.class).in(Scopes.SINGLETON);
            bind(InvestmentFundCompanyValidationSteps.class).in(Scopes.SINGLETON);
            bind(InvestmentFundProjectSteps.class).in(Scopes.SINGLETON);
            bind(InvestmentFundProjectValidationSteps.class).in(Scopes.SINGLETON);
            bind(MoneyDebtMezzProjectSearchSteps.class).in(Scopes.SINGLETON);
            bind(MoneyDebtLoanCompanySteps.class).in(Scopes.SINGLETON);
            bind(MoneyDebtLoanCompanyValidationSteps.class).in(Scopes.SINGLETON);
            bind(MoneyDebtLoanProjectSteps.class).in(Scopes.SINGLETON);
            bind(MoneyDebtLoanProjectValidationSteps.class).in(Scopes.SINGLETON);
            bind(MoneyDebtMezzProjectValidationSteps.class).in(Scopes.SINGLETON);
            bind(MoneyEquityFundCompanySearchSteps.class).in(Scopes.SINGLETON);
            bind(MoneyEquityFundProjectSearchSteps.class).in(Scopes.SINGLETON);
            bind(MoneyEquityFundCompanyValidationSearchSteps.class).in(Scopes.SINGLETON);
            bind(MoneyEquityFundProjectValidationSearchSteps.class).in(Scopes.SINGLETON);
            bind(MoneyDebtMezzCompanySearchSteps.class).in(Scopes.SINGLETON);
            bind(PrivacySetToPublicSteps.class).in(Scopes.SINGLETON);
            bind(PrivacyVerificationSteps.class).in(Scopes.SINGLETON);
            bind(PrivacySetToPrivateSteps.class).in(Scopes.SINGLETON);
            bind(CreateUserSteps.class).in(Scopes.SINGLETON);
            bind(MyUniverseSteps.class).in(Scopes.SINGLETON);
            bind(LogoutSteps.class).in(Scopes.SINGLETON);
            bind(JVPartnerSteps.class).in(Scopes.SINGLETON);
            bind(NewBusinessSteps.class).in(Scopes.SINGLETON);
            bind(CompanyAndPostingOfDBESteps.class).in(Scopes.SINGLETON);   
        }
    }
}
