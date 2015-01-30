Meta:
@storyType BQS

Narrative:
As a user
Select “Deal Sponsor” role + "Location" and verify that only the user with Deal sponsor role with Specified location can access “Posting” profile.

Scenario: 147648 : Verify that only user with deal sponsor role and location can access project when deal sponsor user is included in my universe
When I update TestCaseId 147648
When I update TestCaseName Select “Deal Sponsor” role + "Location" and verify that only the user with Deal sponsor role with Specified location can access “Posting” profile.
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter deal sponsor email ID of user who set the privacy in my universe include as public in project tab
And I enter Password
And I click on login button
Then I should see Privacy button
When I click on Privacy button
Then I verify that privacy page is displayed
When I click on POSTINGS tab
And I click on projects of the deal sponsor in my universe include
And I click on public button of project tab
And I click on save button in my universe page of PROJECT tab
Then I verify 'Privacy successfully saved' message is displayed
When I click on projects of the deal sponsor in my universe include
And I click on my universe radio button
And I click on include radio button
And I select deal sponsor check box
And I select public radio button of deal sponsor
And I select country of the user in posting tab of my universe include
And I select regions of the user in posting tab of my universe include
And I select states of the user in posting tab of my universe include
And I select cities of the user in posting tab of my universe include
And I click on save button in my universe page of PROJECT tab
Then I verify 'Privacy successfully saved' message is displayed
When I click on funds of the deal sponsor in my universe include
And I click on public button of project tab
And I click on save button in my universe page of PROJECT tab
Then I verify 'Privacy successfully saved' message is displayed
When I click on funds of the deal sponsor in my universe include
And I click on my universe radio button
And I click on include radio button
And I select deal sponsor check box
And I select public radio button of deal sponsor
And I select country of the user in posting tab of my universe include
And I select regions of the user in posting tab of my universe include
And I select states of the user in posting tab of my universe include
And I select cities of the user in posting tab of my universe include
And I click on save button in my universe page of PROJECT tab
Then I verify 'Privacy successfully saved' message is displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter email ID of user with same location
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Investments' link
And I click on 'Direct Into Project' link
And I click on 'Core' link
And I click on 'View Search Results' button
Then I should see 'Investments' in find of search option
And I verify kind in search option
And I verify risk in search option
When I click investing as drop down field
And I select limited partner option in investing as drop down field
And I select value in investment amount slider of deal sponsor whose privacy is set to private
Then I verify 'Sharon Project' deal sponsor project name who has set privacy in my universe is displayed
When I click 'Sharon Project' deal sponsor project name who has set privacy in my universe
When I click on 'RCMP MarketPlace' button
And I click on 'Investments' link
And I click on 'Fund' link
And I click on 'Core' in fund link
And I click on 'View Search Results' button
Then I should see 'Investments' in find of search option
And I verify kind of search option in fund search
And I verify risk of search option in fund search
When I select value in investment amount slider of deal sponsor fund whose privacy is set to private in my universe include
Then I verify 'Ross Fund' deal sponsor fund name who has set privacy in my universe is displayed
When I click 'Ross Fund' deal sponsor fund name who has set privacy in my universe
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter deal sponsor email ID with different location
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Investments' link
And I click on 'Direct Into Project' link
And I click on 'Core' link
And I click on 'View Search Results' button
Then I should see 'Investments' in find of search option
And I verify kind in search option
And I verify risk in search option
When I click investing as drop down field
And I select limited partner option in investing as drop down field
And I select value in investment amount slider of deal sponsor whose privacy is set to private
Then I verify deal sponsor project whose profile is set in my universe is not displayed
When I click on 'RCMP MarketPlace' button
And I click on 'Investments' link
And I click on 'Fund' link
And I click on 'Core' in fund link
And I click on 'View Search Results' button
Then I should see 'Investments' in find of search option
And I verify kind of search option in fund search
And I verify risk of search option in fund search
When I select value in investment amount slider of deal sponsor fund whose privacy is set to private in my universe include
Then I verify deal sponsor fund whose profile is set in my universe is not displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter investor with different location
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Investments' link
And I click on 'Direct Into Project' link
And I click on 'Core' link
And I click on 'View Search Results' button
Then I should see 'Investments' in find of search option
And I verify kind in search option
And I verify risk in search option
When I click investing as drop down field
And I select limited partner option in investing as drop down field
And I select value in investment amount slider of deal sponsor whose privacy is set to private
Then I verify deal sponsor project whose profile is set in my universe is not displayed
When I click on 'RCMP MarketPlace' button
And I click on 'Investments' link
And I click on 'Fund' link
And I click on 'Core' in fund link
And I click on 'View Search Results' button
Then I should see 'Investments' in find of search option
And I verify kind of search option in fund search
And I verify risk of search option in fund search
When I select value in investment amount slider of deal sponsor fund whose privacy is set to private in my universe include
Then I verify deal sponsor fund whose profile is set in my universe is not displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter lender email ID with different location
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Investments' link
And I click on 'Direct Into Project' link
And I click on 'Core' link
And I click on 'View Search Results' button
Then I should see 'Investments' in find of search option
And I verify kind in search option
And I verify risk in search option
When I click investing as drop down field
And I select limited partner option in investing as drop down field
And I select value in investment amount slider of deal sponsor whose privacy is set to private
Then I verify deal sponsor project whose profile is set in my universe is not displayed
When I click on 'RCMP MarketPlace' button
And I click on 'Investments' link
And I click on 'Fund' link
And I click on 'Core' in fund link
And I click on 'View Search Results' button
Then I should see 'Investments' in find of search option
And I verify kind of search option in fund search
And I verify risk of search option in fund search
When I select value in investment amount slider of deal sponsor fund whose privacy is set to private in my universe include
Then I verify deal sponsor fund whose profile is set in my universe is not displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter real estate advisor with different location
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Investments' link
And I click on 'Direct Into Project' link
And I click on 'Core' link
And I click on 'View Search Results' button
Then I should see 'Investments' in find of search option
And I verify kind in search option
And I verify risk in search option
When I click investing as drop down field
And I select limited partner option in investing as drop down field
And I select value in investment amount slider of deal sponsor whose privacy is set to private
Then I verify deal sponsor project whose profile is set in my universe is not displayed
When I click on 'RCMP MarketPlace' button
And I click on 'Investments' link
And I click on 'Fund' link
And I click on 'Core' in fund link
And I click on 'View Search Results' button
Then I should see 'Investments' in find of search option
And I verify kind of search option in fund search
And I verify risk of search option in fund search
When I select value in investment amount slider of deal sponsor fund whose privacy is set to private in my universe include
Then I verify deal sponsor fund whose profile is set in my universe is not displayed
When I logout RealConnex application








