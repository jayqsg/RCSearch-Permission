Meta:
@storyType BQS

Narrative:
As a user
I Verify that when privacy is set to "Public" in "Me >> Privacy" page, users can view Me profile.

Scenario: 141179 : Verify that when privacy is set to "Public" in "Me" page, all users can view Me profile.
When I update TestCaseId 141179
When I update TestCaseName Privacy Set To Public In Me Tab
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter deal sponsor email ID for privacy set to public
And I enter Password
And I click on login button
Then I should see Privacy button
When I click on Privacy button
Then I verify that privacy page is displayed
When I click on public button in ME tab
And I click on save button in ME tab
Then I verify 'Privacy successfully saved' message is displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter deal sponsor email ID for login
And I enter password of user
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'People,companies and association' link
And I click on 'People' link
Then I should see 'People, Companies & Associations' as find in search option
And I verify 'Sophia Anna' deal sponsor user name is displayed in search result
When I click on 'Sophia Anna' deal sponsor user name in search result
And I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter investor email ID for login
And I enter password of user
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'People,companies and association' link
And I click on 'People' link
Then I should see 'People, Companies & Associations' as find in search option
And I verify 'Sophia Anna' deal sponsor user name is displayed in search result
When I click on 'Sophia Anna' deal sponsor user name in search result
And I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter lender email ID for login
And I enter password of user
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'People,companies and association' link
And I click on 'People' link
Then I should see 'People, Companies & Associations' as find in search option
And I verify 'Sophia Anna' deal sponsor user name is displayed in search result
When I click on 'Sophia Anna' deal sponsor user name in search result
And I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter real estate advisor email ID for login
And I enter password of user
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'People,companies and association' link
And I click on 'People' link
Then I should see 'People, Companies & Associations' as find in search option
And I verify 'Sophia Anna' deal sponsor user name is displayed in search result
When I click on 'Sophia Anna' deal sponsor user name in search result
And I logout RealConnex application

