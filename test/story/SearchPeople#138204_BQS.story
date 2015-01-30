Meta:
@storyType BQS

Narrative:
As a user
I Verify that desired list of all the 4 roles users are retrieved as search result when people search is performed.

Scenario: TC 138204: Verify desired list of people are retrieved from search result
When I update TestCaseId 138204
When I update TestCaseName Verify that desired list of all the 4 roles users are retrieved as search result when people search is performed.
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'People,companies and association' link
And I click on 'People' link
Then I should see 'People, Companies & Associations' as find in search option
And I should see 'Marylin Joe' deal sponsor user name is displayed
When I click on verified deal sponsor user name
And I return back to the searched page
Then I verify 'Barbara Taylor' service provider user name is displayed
When I click on verified property service provider user name
And I return back to the searched page
Then I should see 'Jiah Maten' investor user name is displayed
When I click on verified investor user name
And I return back to the searched page
Then I should see 'Julin Marten' lender user name is displayed
When I click on verified lender user name
And I return back to the searched page
And I enter user title in name search option
Then I verify 'Marylin Joe' deal sponsor user name is displayed
When I clear title field in search option
And I enter user job title in title search option
Then I verify 'Marylin Joe' deal sponsor user name is displayed
When I clear job title field in search option
And I enter user company name in company search option
Then I verify 'Marylin Joe' deal sponsor user name is displayed
When I clear Company Field
And I click on geographical coverage field
And I click on countries field
And I select United States checkbox in countries field
And I click on region field
And I click on Southwest region
And I click on states field
And I click on Texas state
And I click on cities field
And I enter and select Massa city
Then I verify 'Marylin Joe' deal sponsor user name is displayed
When I logout from RealConnex application

