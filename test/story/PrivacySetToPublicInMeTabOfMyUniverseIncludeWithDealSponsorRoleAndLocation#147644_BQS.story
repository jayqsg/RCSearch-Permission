Meta:
@storyType BQS

Narrative:
As a user
Select “Deal Sponsor” role + "Location" and verify that only the user with Deal sponsor role with Specified location can access “Me” profile.

Scenario: 147644 : Verify that only user with deal sponsor role and matching location can access me profile in my universe include
When I update TestCaseId 147644
When I update TestCaseName Select “Deal Sponsor” role + "Location" and verify that only the user with Deal sponsor role with Specified location can access “Me” profile.
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter email ID of user who set the privacy in my universe exclude
And I enter Password
And I click on login button
Then I should see Privacy button
When I click on Privacy button
Then I verify that privacy page is displayed
When I click on ME tab
And I click on public button in ME tab
And I click on save button in my universe page of ME tab
Then I verify 'Privacy successfully saved' message is displayed
When I click on my universe radio button
And I click on include radio button
And I select deal sponsor check box
And I select public radio button of deal sponsor
And I select country of the user in me tab of my universe include
And I select regions of the user in me tab of my universe include
And I select states of the user in me tab of my universe include
And I select cities of the user in me tab of my universe include
And I click on save button in my universe page of ME tab
Then I verify 'Privacy successfully saved' message is displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter email ID of user with same location
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'People,companies and association' link
And I click on 'People' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter user name who has set profile to exclude in my universe
Then I verify 'Emily Hill' user name who has set privacy exclude in my universe is displayed
When I click 'Emily Hill' user name who has set privacy exclude in my universe
When I click on 'RCMP MarketPlace' button
And I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter deal sponsor email ID with different location
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'People,companies and association' link
And I click on 'People' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter user name who has set the profile to include in my universe
Then I verify user whose profile is set to exclude in my universe is not displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter investor with different location
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'People,companies and association' link
And I click on 'People' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter user name who has set the profile to include in my universe
Then I verify user whose profile is set to exclude in my universe is not displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter lender email ID with different location
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'People,companies and association' link
And I click on 'People' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter user name who has set the profile to include in my universe
Then I verify user whose profile is set to exclude in my universe is not displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter real estate advisor with different location
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'People,companies and association' link
And I click on 'People' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter user name who has set the profile to include in my universe
Then I verify user whose profile is set to exclude in my universe is not displayed
When I logout RealConnex application
