Meta:
@storyType BQS

Narrative:
As a user
I search for list of companies in Real Connex application

Scenario: TC 138338: Verify desired list of companies are retrieved from search result
When I update TestCaseId 138338
When I update TestCaseName Verify that companies other than desired company are not retrieved when company search is performed
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
When I enter company name in search field
Then I verify 'Steele' company name of developer is not displayed
When I clear name field in search option
And I enter developer Company Title
Then I verify 'Sterling' company name of deal sponsor is not displayed
When I clear name field in search option
And I enter company type in search option
Then I verify 'Steele' company name of developer is not displayed
When I clear type field in search option
And I enter developer company type in search option
Then I verify 'Sterling' company name of deal sponsor is not displayed
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
Then I verify 'Steele' company name of developer is not displayed
When I logout from RealConnex application




