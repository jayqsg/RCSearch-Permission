Meta:
@storyType BQS

Narrative:
As a user
I Verify that only Deal Sponsor user can view Company Profile when Deal Sponsor user is included in My Universe.

Scenario: 136664 : Verify that deal sponsor user can view company profile when deal sponsor user is included in my universe
When I update TestCaseId 136664
When I update TestCaseName Privacy Set To Public In Company Tab Of My Universe Include Of Deal Sponsor
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter email ID of user who set the privacy in my universe include
And I enter Password
And I click on login button
Then I should see Privacy button
When I click on Privacy button
Then I verify that privacy page is displayed
When I click on COMPANIES tab
And I click on 'EH Company' company name to set the privacy
And I click on public button in COMPANY tab
And I click on save button in COMPANY tab
Then I verify 'Privacy successfully saved' message is displayed
When I click on 'EH Company' company name to set the privacy
And I click on my universe radio button
And I click on include radio button
And I select deal sponsor check box
And I select sub role field of deal sponsor
And I select developer sub role option
And I set the value in deal/fund size field of deal sponsor
And I select public radio button of deal sponsor
And I select country of the user in my universe include
And I select regions of the user in my universe include
And I select states of the user in my universe include
And I select cities of the user in my universe include
And I click on save button in my universe page of COMPANY tab
Then I verify 'Privacy successfully saved' message is displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter email id of user with deal sponsor role and developer subrole
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter company name who has set the profile to include in my universe
Then I verify 'EH Company' company name who has set privacy include in my universe is displayed
When I click 'EH Company' company name who has set privacy include in my universe
And I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter deal sponsor email ID where privacy is set
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter company name who has set the profile to include in my universe
Then I verify company whose profile is set to include in my universe is not displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter deal sponsor email ID for login
And I enter password of user
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter company name who has set the profile to include in my universe
Then I verify company whose profile is set to include in my universe is not displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter investor email ID for login
And I enter password of user
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter company name who has set the profile to include in my universe
Then I verify company whose profile is set to include in my universe is not displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter lender email ID for login
And I enter password of user
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter company name who has set the profile to include in my universe
Then I verify company whose profile is set to include in my universe is not displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter real estate advisor email ID for login
And I enter password of user
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter company name who has set the profile to include in my universe
Then I verify company whose profile is set to include in my universe is not displayed
When I logout RealConnex application
