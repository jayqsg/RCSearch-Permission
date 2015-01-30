Meta:
@storyType BQS

Narrative:
As a user
I search for list of companies in Real Connex application

Scenario: TC 138209: Verify desired list of companies are retrieved from search result
When I update TestCaseId 138209
When I update TestCaseName Verify that desired list of companies of all 4 role users are retrieved as search result when people search is performed.
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
And I should see 'Sterling' company name of deal sponsor
When I click on company name of deal sponsor
And I return back to the searched page
Then I should see 'RC COm' company name of advisor
When I click on company of real estate advisor
And I return back to the searched page
Then I should see 'Philps' company name of investor
When I click on company name of investor
And I return back to the searched page
Then I should see 'Sonic' company name of lender
When I click on company name of lender
And I return back to the searched page
And I enter company name in search field
Then I verify 'Sterling' company name of deal sponsor is displayed
When I clear name field in search option
And I enter company type in search option
Then I verify 'Sterling' company name of deal sponsor is displayed
When I clear type field in search option
And I click on geographical coverage field
And I click on countries field
And I select United States checkbox in countries field
And I click on region field
And I click on Southwest region
And I click on states field
And I click on Texas state
And I click on cities field
And I enter and select Massa city
Then I verify 'Sterling' company name of deal sponsor is displayed
When I logout from RealConnex application
