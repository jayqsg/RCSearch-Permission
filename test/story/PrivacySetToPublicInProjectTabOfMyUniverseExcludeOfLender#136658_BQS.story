Meta:
@storyType BQS

Narrative:
As a user
I Verify that only projects of Lender users excluded from My Universe are invisible when the privacy is set to "Exclude the following from my universe" in "Project Privacy" tab.

Scenario: 136658 : Verify that lender users exclude from my universe are invisible when privacy is set to exclude in project tab
When I update TestCaseId 136658
When I update TestCaseName Verify that only projects of Lender users excluded from My Universe are invisible when the privacy is set to "Exclude the following from my universe" in "Project Privacy" tab.
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
When I click on my universe radio button
And I click on exclude radio button
And I select public option in drop down
And I select lender check box in my universe exclude
And I select sub role field of lender in my universe exclude
And I select family office sub role option in my universe exclude
And I set the value in deal/fund size field of lender in my universe exclude
And I select country of the user in my universe exclude
And I select regions of the user in my universe exclude
And I select states of the user in my universe exclude
And I select cities of the user in my universe exclude
And I click on save button in my universe page of PROJECT tab
Then I verify 'Privacy successfully saved' message is displayed
When I click on loan of the lender whose privacy is set in my universe include
Then I verify that public option is selected
And I verify lender check box is selected
And I verify family office subrole is selected
When I return back to the searched page
And I click on mezz of the lender whose privacy is set in my universe include
And I click on public button of project tab
And I click on save button in my universe page of PROJECT tab
And I click on mezz of the lender whose privacy is set in my universe include
And I click on my universe radio button
And I click on exclude radio button
And I select public option in drop down
And I select lender check box in my universe exclude
And I select sub role field of lender in my universe exclude
And I select family office sub role option in my universe exclude
And I set the value in deal/fund size field of lender in my universe exclude
And I select country of the user in my universe exclude
And I select regions of the user in my universe exclude
And I select states of the user in my universe exclude
And I select cities of the user in my universe exclude
And I click on save button in my universe page of PROJECT tab
Then I verify 'Privacy successfully saved' message is displayed
When I click on mezz of the lender whose privacy is set in my universe include
Then I verify that public option is selected
And I verify lender check box is selected
And I verify family office subrole is selected
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
And I verify lender loan whose profile is set public in exclude of my universe is not displayed
When I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Debt' link
And I click on 'Mezz' link
And I click on 'Income/Core' link
And I click on 'View Search Results' button
Then I should see 'Money' in find of search option
And I should see 'Core' in risk of search option
And I verify lender mezz whose profile is set in exclude of my universe is not displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter lender email ID with subrole private lender
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
When I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Debt' link
And I click on 'Mezz' link
And I click on 'Income/Core' link
And I click on 'View Search Results' button
Then I should see 'Money' in find of search option
And I should see 'Core' in risk of search option
And I verify 'CY Mezz' lender mezz name who has set privacy in include of my universe is displayed
When I click 'CY Mezz' lender mezz name who has set privacy in include of my universe
When I click on 'RCMP MarketPlace' button
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter lender email ID with different deal/fund size
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
When I click on 'RCMP MarketPlace' button
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
And I enter lender email ID with different location
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
When I click on 'RCMP MarketPlace' button
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
