Meta:
@storyType BQS

Narrative:
As a user
I Verify that only Investor user can view Project when Investor user is included in My Universe.

Scenario: 136622 : Verify that only investor user can view project when investor user is included in my universe
When I update TestCaseId 136622
When I update TestCaseName Verify that only Investor user can view Project when Investor user is included in My Universe.
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter investor email ID of user who set the privacy in my universe include in project tab
And I enter Password
And I click on login button
Then I should see Privacy button
When I click on Privacy button
Then I verify that privacy page is displayed
When I click on POSTINGS tab
And I click on funds of the investor in my universe include
And I click on public button of project tab
And I click on save button in my universe page of PROJECT tab
And I click on funds of the investor in my universe include
And I click on my universe radio button
And I click on include radio button
And I select investor check box
And I select sub role field of investor
And I select advisor sub role option
And I set the value in deal/fund size field of investor
And I select public radio button of investor
And I select country of the user in posting tab of my universe include
And I select regions of the user in posting tab of my universe include
And I select states of the user in posting tab of my universe include
And I select cities of the user in posting tab of my universe include
And I click on save button in my universe page of PROJECT tab
Then I verify 'Privacy successfully saved' message is displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter email ID of user with role as investor and sub role as advisor
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Investments' link
And I click on 'Fund' link
And I click on 'Core' in fund link
And I click on 'View Search Results' button
Then I should see 'Investments' in find of search option
And I verify kind of search option in fund search
And I verify risk of search option in fund search
And I verify 'LY Fund' investor fund name who has set privacy in include of my universe is displayed
When I click 'LY Fund' investor fund name who has set privacy in include of my universe
And I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Direct Into Project' link in money search
And I click on 'View Search Results' button
Then I should see 'Money' in find of money search
And I verify 'LY Fund' investor fund name who has set privacy in include of my universe is displayed
When I click 'LY Fund' investor fund name who has set privacy in include of my universe
And I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Fund' of money search
And I click on 'View Search Results' button
Then I should see 'Money' in find of money search
And I should see 'Fund' in kind of money search
And I verify 'LY Fund' investor fund name who has set privacy in include of my universe is displayed
When I click 'LY Fund' investor fund name who has set privacy in include of my universe
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter investor email ID where privacy is set
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Investments' link
And I click on 'Fund' link
And I click on 'Core' in fund link
And I click on 'View Search Results' button
Then I should see 'Investments' in find of search option
And I verify kind of search option in fund search
And I verify risk of search option in fund search
And I verify investor fund whose profile privacy is set in include of my universe is not displayed
When I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Direct Into Project' link in money search
And I click on 'View Search Results' button
Then I should see 'Money' in find of money search
And I verify investor fund whose profile privacy is set in include of my universe is not displayed
When I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Fund' of money search
And I click on 'View Search Results' button
Then I should see 'Money' in find of money search
And I should see 'Fund' in kind of money search
And I verify investor fund whose profile privacy is set in include of my universe is not displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter deal sponsor email ID for login
And I enter password of user
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Investments' link
And I click on 'Fund' link
And I click on 'Core' in fund link
And I click on 'View Search Results' button
Then I should see 'Investments' in find of search option
And I verify kind of search option in fund search
And I verify risk of search option in fund search
And I verify investor fund whose profile privacy is set in include of my universe is not displayed
When I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Direct Into Project' link in money search
And I click on 'View Search Results' button
Then I should see 'Money' in find of money search
And I verify investor fund whose profile privacy is set in include of my universe is not displayed
When I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Fund' of money search
And I click on 'View Search Results' button
Then I should see 'Money' in find of money search
And I should see 'Fund' in kind of money search
And I verify investor fund whose profile privacy is set in include of my universe is not displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter lender email ID for login
And I enter password of user
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Investments' link
And I click on 'Fund' link
And I click on 'Core' in fund link
And I click on 'View Search Results' button
Then I should see 'Investments' in find of search option
And I verify kind of search option in fund search
And I verify risk of search option in fund search
And I verify investor fund whose profile privacy is set in include of my universe is not displayed
When I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Direct Into Project' link in money search
And I click on 'View Search Results' button
Then I should see 'Money' in find of money search
And I verify investor fund whose profile privacy is set in include of my universe is not displayed
When I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Fund' of money search
And I click on 'View Search Results' button
Then I should see 'Money' in find of money search
And I should see 'Fund' in kind of money search
And I verify investor fund whose profile privacy is set in include of my universe is not displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter real estate advisor email ID for login
And I enter password of user
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Investments' link
And I click on 'Fund' link
And I click on 'Core' in fund link
And I click on 'View Search Results' button
Then I should see 'Investments' in find of search option
And I verify kind of search option in fund search
And I verify risk of search option in fund search
And I verify investor fund whose profile privacy is set in include of my universe is not displayed
When I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Direct Into Project' link in money search
And I click on 'View Search Results' button
Then I should see 'Money' in find of money search
And I verify investor fund whose profile privacy is set in include of my universe is not displayed
When I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Fund' of money search
And I click on 'View Search Results' button
Then I should see 'Money' in find of money search
And I should see 'Fund' in kind of money search
And I verify investor fund whose profile privacy is set in include of my universe is not displayed
When I logout RealConnex application
