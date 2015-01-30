Meta:
@storyType BQS

Narrative:
As a user
I Verify that projects of other role users except Deal Sponsors can be viewed.

Scenario: 136654 : Verify that other role user except deal sponsor can view project profile
When I update TestCaseId 136654
When I update TestCaseName Verify that projects of other role users except Deal Sponsors can be viewed.
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
And I click on save button in my universe page of PROJECT tab
Then I verify 'Privacy successfully saved' message is displayed
When I click on projects of the deal sponsor in my universe include
Then I verify that public option is selected
And I verify deal sponsor check box is selected
And I verify deal sponsor subrole is selected
When I return back to the searched page
And I click on funds of the deal sponsor in my universe include
And I click on public button of project tab
And I click on save button in my universe page of PROJECT tab
Then I verify 'Privacy successfully saved' message is displayed
When I click on funds of the deal sponsor in my universe include
And I click on my universe radio button
And I click on exclude radio button
And I select public option in drop down
And I select deal sponsor check box in my universe exclude
And I select sub role field of deal sponsor in my universe exclude
And I select developer sub role option in my universe exclude
And I set the value in deal/fund size field of deal sponsor in my universe exclude
And I click on save button in my universe page of PROJECT tab
Then I verify 'Privacy successfully saved' message is displayed
When I click on funds of the deal sponsor in my universe include
Then I verify that public option is selected
And I verify deal sponsor check box is selected
And I verify deal sponsor subrole is selected
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter email id of user with deal sponsor role and developer subrole
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
Then I verify deal sponsor project whose profile is set public in include of my universe is not displayed
When I click on 'RCMP MarketPlace' button
And I click on 'Investments' link
And I click on 'Fund' link
And I click on 'Core' in fund link
And I click on 'View Search Results' button
Then I should see 'Investments' in find of search option
And I verify kind of search option in fund search
And I verify risk of search option in fund search
When I select value in investment amount slider of deal sponsor fund whose privacy is set to private in my universe include
Then I verify deal sponsor fund whose profile is set public in include of my universe is not displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter lender email ID for login
And I enter password of user
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
Then I verify 'Sharon Project' of deal sponsor project name who has set privacy to public in exclude of my universe is displayed
When I click 'Sharon Project' of deal sponsor project name who has set privacy to public in exclude of my universe
When I click on 'RCMP MarketPlace' button
And I click on 'Investments' link
And I click on 'Fund' link
And I click on 'Core' in fund link
And I click on 'View Search Results' button
Then I should see 'Investments' in find of search option
And I verify kind of search option in fund search
And I verify risk of search option in fund search
When I select value in investment amount slider of deal sponsor fund whose privacy is set to private in my universe include
Then I verify 'Ross Fund' of deal sponsor fund name who has set privacy to public in exclude of my universe is displayed
When I click 'Ross Fund' of deal sponsor fund name who has set privacy to public in exclude of my universe
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter investor email ID for login
And I enter password of user
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
Then I verify 'Sharon Project' of deal sponsor project name who has set privacy to public in exclude of my universe is displayed
When I click 'Sharon Project' of deal sponsor project name who has set privacy to public in exclude of my universe
When I click on 'RCMP MarketPlace' button
And I click on 'Investments' link
And I click on 'Fund' link
And I click on 'Core' in fund link
And I click on 'View Search Results' button
Then I should see 'Investments' in find of search option
And I verify kind of search option in fund search
And I verify risk of search option in fund search
When I select value in investment amount slider of deal sponsor fund whose privacy is set to private in my universe include
Then I verify 'Ross Fund' of deal sponsor fund name who has set privacy to public in exclude of my universe is displayed
When I click 'Ross Fund' of deal sponsor fund name who has set privacy to public in exclude of my universe
And I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter real estate advisor email ID for login
And I enter password of user
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
Then I verify 'Sharon Project' of deal sponsor project name who has set privacy to public in exclude of my universe is displayed
When I click 'Sharon Project' of deal sponsor project name who has set privacy to public in exclude of my universe
When I click on 'RCMP MarketPlace' button
And I click on 'Investments' link
And I click on 'Fund' link
And I click on 'Core' in fund link
And I click on 'View Search Results' button
Then I should see 'Investments' in find of search option
And I verify kind of search option in fund search
And I verify risk of search option in fund search
When I select value in investment amount slider of deal sponsor fund whose privacy is set to private in my universe include
Then I verify 'Ross Fund' of deal sponsor fund name who has set privacy to public in exclude of my universe is displayed
When I click 'Ross Fund' of deal sponsor fund name who has set privacy to public in exclude of my universe
When I logout RealConnex application
