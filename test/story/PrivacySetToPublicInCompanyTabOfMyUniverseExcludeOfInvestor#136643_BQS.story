Meta:
@storyType BQS

Narrative:
As a user
I Verify that only companies of Investor users excluded from My Universe are invisible when the privacy is set to "Exclude the following from my universe" in "Company >> Privacy" tab.

Scenario: 136643 : Verify that investor user exclude from my universe are invisible when privacy is set to exclude in company tab
When I update TestCaseId 136643
When I update TestCaseName Verify that only companies of Investor users excluded from My Universe are invisible when the privacy is set to "Exclude the following from my universe" in "Company >> Privacy" tab.
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter investor email ID of user who set the privacy in my universe exclude
And I enter Password
And I click on login button
Then I should see Privacy button
When I click on Privacy button
Then I verify that privacy page is displayed
When I click on COMPANIES tab
And I click on 'Young Company' company name to set the privacy
And I click on public button in COMPANY tab
And I click on save button in my universe page of COMPANY tab
Then I verify 'Privacy successfully saved' message is displayed
When I click on 'Young Company' company name to set the privacy
And I click on my universe radio button
And I click on exclude radio button
And I select public option in drop down
And I select investor check box in my universe exclude
And I select sub role field of investor in my universe exclude
And I select advisor sub role option in my universe exclude
And I set the value in deal/fund size field of investor in my universe exclude
And I select country of the user in my universe exclude
And I select regions of the user in my universe exclude
And I select states of the user in my universe exclude
And I select cities of the user in my universe exclude
And I click on save button in my universe page of COMPANY tab
Then I verify 'Privacy successfully saved' message is displayed
When I click on 'Young Company' company name to set the privacy
Then I verify that public option is selected
And I verify investor check box is selected
And I verify advisor subrole is selected
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter email ID of user with role as investor and sub role as advisor
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter investor company name who has set the profile in exclude of my universe
Then I verify investor company whose profile is set private in exclude of my universe is not displayed
When I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Fund' of money search
And I click on 'View Search Results' button
Then I verify investor company whose profile is set private in exclude of my universe is not displayed
When I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Direct Into Project' link in money search
And I click on 'View Search Results' button
Then I verify investor company whose profile is set private in exclude of my universe is not displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter investor email ID with subrole bank
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter investor company name who has set the profile in exclude of my universe
Then I verify 'Young Company' company name who has set privacy exclude in my universe is displayed
When I click 'Young Company' company name who has set privacy exclude in my universe is displayed
And I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Fund' of money search
And I click on 'View Search Results' button
Then I verify 'Young Company' company name who has set privacy to exclude in my universe is displayed
When I click 'Young Company' on company name who has set privacy to exclude in my universe is displayed
When I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Direct Into Project' link in money search
And I click on 'View Search Results' button
Then I verify 'Young Company' company name who has set privacy to exclude in my universe is displayed
When I click 'Young Company' on company name who has set privacy to exclude in my universe is displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter investor email Id with different deal/fund size
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter investor company name who has set the profile in exclude of my universe
Then I verify 'Young Company' company name who has set privacy exclude in my universe is displayed
When I click 'Young Company' company name who has set privacy exclude in my universe is displayed
And I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Fund' of money search
And I click on 'View Search Results' button
Then I verify 'Young Company' company name who has set privacy to exclude in my universe is displayed
When I click 'Young Company' on company name who has set privacy to exclude in my universe is displayed
When I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Direct Into Project' link in money search
And I click on 'View Search Results' button
Then I verify 'Young Company' company name who has set privacy to exclude in my universe is displayed
When I click 'Young Company' on company name who has set privacy to exclude in my universe is displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter investor with different location
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter investor company name who has set the profile in exclude of my universe
Then I verify 'Young Company' company name who has set privacy exclude in my universe is displayed
When I click 'Young Company' company name who has set privacy exclude in my universe is displayed
And I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Fund' of money search
And I click on 'View Search Results' button
Then I verify 'Young Company' company name who has set privacy to exclude in my universe is displayed
When I click 'Young Company' on company name who has set privacy to exclude in my universe is displayed
When I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Direct Into Project' link in money search
And I click on 'View Search Results' button
Then I verify 'Young Company' company name who has set privacy to exclude in my universe is displayed
When I click 'Young Company' on company name who has set privacy to exclude in my universe is displayed
When I logout RealConnex application
