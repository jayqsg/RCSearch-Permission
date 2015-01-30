Meta:
@storyType BQS

Narrative:
As a user
I Verify that only Deal Sponsor users excluded from My Universe are invisible when the privacy is set to "Exclude the following from my universe" in "Me >> Privacy" page.

Scenario: 136628 : Verify that deal sponsor user exclude from my universe are invisible when privacy is set to exclude in ME tab
When I update TestCaseId 136628
When I update TestCaseName Verify that only Deal Sponsor users excluded from My Universe are invisible when the privacy is set to "Exclude the following from my universe" in "Me >> Privacy" page.
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
And I click on exclude radio button
And I select public option in drop down
And I select deal sponsor check box in my universe exclude
And I select sub role field of deal sponsor in my universe exclude
And I select developer sub role option in my universe exclude
And I set the value in deal/fund size field of deal sponsor in my universe exclude
And I select country of the user in my universe exclude
And I select regions of the user in my universe exclude
And I select states of the user in my universe exclude
And I select cities of the user in my universe exclude
And I click on save button in my universe page of ME tab
Then I verify 'Privacy successfully saved' message is displayed
And I verify that public option is selected
And I verify deal sponsor check box is selected
And I verify deal sponsor subrole is selected
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter email ID of user with role as deal sponsor and sub role as developer with deal/fund size
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'People,companies and association' link
And I click on 'People' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter user name who has set profile to exclude in my universe
Then I verify user whose profile is set to exclude in my universe is not displayed
When I click on 'RCMP MarketPlace' button
And I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter deal sponsor email ID with subrole as deal sponsor
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'People,companies and association' link
And I click on 'People' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter user name who has set the profile to include in my universe
Then I verify 'Emily Hill' user name who has set privacy exclude in my universe is displayed
When I click 'Emily Hill' user name who has set privacy exclude in my universe
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter deal sponsor email ID with different deal/fund size
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'People,companies and association' link
And I click on 'People' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter user name who has set the profile to include in my universe
Then I verify 'Emily Hill' user name who has set privacy exclude in my universe is displayed
When I click 'Emily Hill' user name who has set privacy exclude in my universe
When I logout RealConnex application
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
Then I verify 'Emily Hill' user name who has set privacy exclude in my universe is displayed
When I click 'Emily Hill' user name who has set privacy exclude in my universe
When I logout RealConnex application
