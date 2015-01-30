Meta:
@storyType BQS

Narrative:
As a user
I verify users other than desired user are not retrieved in people search

Scenario: TC 138336: Verify desired list of people are retrieved from search result
When I update TestCaseId 138336
When I update TestCaseName Verify users other than desired user are not retrieved in people search
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
When I enter user title in name search option
Then I verify 'Jiah Maten' investor user name is not displayed
When I clear title field in search option
And I enter 'Investor' user name
Then I verify 'Marylin Joe' deal sponsor user name is not displayed
When I clear title field in search option
And I enter user job title in title search option
Then I verify 'Jiah Maten' investor user name is not displayed
When I clear job title field in search option
And I enter 'Investor' job title
Then I verify 'Marylin Joe' deal sponsor user name is not displayed
When I clear job title field in search option
And I enter user company name in company search option
Then I verify 'Jiah Maten' investor user name is not displayed
When I clear Company Field
And I enter 'Investor' company name
Then I verify 'Marylin Joe' deal sponsor user name is not displayed
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
Then I verify 'Jiah Maten' investor user name is not displayed
When I logout from RealConnex application


