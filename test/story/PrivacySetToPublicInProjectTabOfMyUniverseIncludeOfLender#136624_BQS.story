Meta:
@storyType BQS

Narrative:
As a user
I Verify that only Lender user can view Project when Lender user is included in My Universe.

Scenario: 136624 : Verify that only lender user can view project when lender user is included in my universe
When I update TestCaseId 136624
When I update TestCaseName Verify that only Lender user can view Project when Lender user is included in My Universe.
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter lender email ID of user who set the privacy in my universe include
And I enter Password
And I click on login button
Then I should see Privacy button
When I click on Privacy button
Then I verify that privacy page is displayed
When I click on POSTINGS tab
And I click on loan of the lender whose privacy is set in my universe include
And I click on public button of project tab
And I click on save button in my universe page of PROJECT tab
And I click on loan of the lender whose privacy is set in my universe include
And I click on my universe radio button
And I click on include radio button
And I select lender check box
And I select sub role field of lender
And I select family office sub role option
And I set the value in deal/fund size field of lender
And I select public radio button of lender
And I select country of the user in posting tab of my universe include
And I select regions of the user in posting tab of my universe include
And I select states of the user in posting tab of my universe include
And I select cities of the user in posting tab of my universe include
And I click on save button in my universe page of PROJECT tab
Then I verify 'Privacy successfully saved' message is displayed
When I click on mezz of the lender whose privacy is set in my universe include
And I click on public button of project tab
And I click on save button in my universe page of PROJECT tab
When I click on mezz of the lender whose privacy is set in my universe include
And I click on my universe radio button
And I click on include radio button
And I select lender check box
And I select sub role field of lender
And I select family office sub role option
And I set the value in deal/fund size field of lender
And I select public radio button of lender
And I select country of the user in posting tab of my universe include
And I select regions of the user in posting tab of my universe include
And I select states of the user in posting tab of my universe include
And I select cities of the user in posting tab of my universe include
And I click on save button in my universe page of PROJECT tab
Then I verify 'Privacy successfully saved' message is displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter email ID of user with role as lender and sub role as family office
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Debt' link
And I click on 'Loans' link
And I click on 'Land Loan' link
And I click on 'View Search Results' button
Then I should see 'Money' in find of money search
And I should see 'Land Loan' in loan of money debt loan search
And I verify 'CY Loan' lender loan name who has set privacy in include of my universe is displayed
When I click 'CY Loan' lender loan name who has set privacy in include of my universe
And I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Debt' link
And I click on 'Mezz' link
And I click on 'Income/Core' link
And I click on 'View Search Results' button
Then I should see 'Money' in find of search option
And I should see 'Core' in risk of search option
And I verify 'CY Mezz' lender mezz name who has set privacy in include of my universe is displayed
When I click 'CY Mezz' lender mezz name who has set privacy in include of my universe
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter lender email ID whose privacy set to private
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Debt' link
And I click on 'Loans' link
And I click on 'Land Loan' link
And I click on 'View Search Results' button
Then I should see 'Money' in find of money search
And I should see 'Land Loan' in loan of money debt loan search
And I verify lender loan whose profile is set public in include of my universe is not displayed
When I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Debt' link
And I click on 'Mezz' link
And I click on 'Income/Core' link
And I click on 'View Search Results' button
Then I should see 'Money' in find of search option
And I should see 'Core' in risk of search option
And I verify lender mezz whose profile is set public in include of my universe is not displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter deal sponsor email ID for login
And I enter password of user
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Debt' link
And I click on 'Loans' link
And I click on 'Land Loan' link
And I click on 'View Search Results' button
Then I should see 'Money' in find of money search
And I should see 'Land Loan' in loan of money debt loan search
And I verify lender loan whose profile is set public in include of my universe is not displayed
When I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Debt' link
And I click on 'Mezz' link
And I click on 'Income/Core' link
And I click on 'View Search Results' button
Then I should see 'Money' in find of search option
And I should see 'Core' in risk of search option
And I verify lender mezz whose profile is set public in include of my universe is not displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter investor email ID for login
And I enter password of user
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Debt' link
And I click on 'Loans' link
And I click on 'Land Loan' link
And I click on 'View Search Results' button
Then I should see 'Money' in find of money search
And I should see 'Land Loan' in loan of money debt loan search
And I verify lender loan whose profile is set public in include of my universe is not displayed
When I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Debt' link
And I click on 'Mezz' link
And I click on 'Income/Core' link
And I click on 'View Search Results' button
Then I should see 'Money' in find of search option
And I should see 'Core' in risk of search option
And I verify lender mezz whose profile is set public in include of my universe is not displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter lender email ID for login
And I enter password of user
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Debt' link
And I click on 'Loans' link
And I click on 'Land Loan' link
And I click on 'View Search Results' button
Then I should see 'Money' in find of money search
And I should see 'Land Loan' in loan of money debt loan search
And I verify lender loan whose profile is set public in include of my universe is not displayed
When I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Debt' link
And I click on 'Mezz' link
And I click on 'Income/Core' link
And I click on 'View Search Results' button
Then I should see 'Money' in find of search option
And I should see 'Core' in risk of search option
And I verify lender mezz whose profile is set public in include of my universe is not displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter real estate advisor email ID for login
And I enter password of user
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Debt' link
And I click on 'Loans' link
And I click on 'Land Loan' link
And I click on 'View Search Results' button
Then I should see 'Money' in find of money search
And I should see 'Land Loan' in loan of money debt loan search
And I verify lender loan whose profile is set public in include of my universe is not displayed
When I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Debt' link
And I click on 'Mezz' link
And I click on 'Income/Core' link
And I click on 'View Search Results' button
Then I should see 'Money' in find of search option
And I should see 'Core' in risk of search option
And I verify lender mezz whose profile is set public in include of my universe is not displayed
When I logout RealConnex application
