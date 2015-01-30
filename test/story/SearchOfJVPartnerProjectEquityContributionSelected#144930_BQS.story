Meta:
@storyType BQS

Narrative:
As a user
Perform "JV Partner >> Equity" search and Verify that projects which has "Equity" contribution selected in JV Partner requirement are retrieved.

Scenario: TC 144930: Verify that projects which has equity contribution selected in JV Partner requirement are retrieved in JV partner>>Equity search.
When I update TestCaseId 144930
When I update TestCaseName Perform "JV Partner >> Equity" search and Verify that projects which has "Equity" contribution selected in JV Partner requirement are retrieved.
When I launch RealConnex application
And I click on Log In button in RealConnex login page
When I enter deal sponsor email id for jv partner search
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'JV Partner' link
And I click on 'Equity' link in JV Partner search
And I click on 'View Search Results' button
Then I should see 'JV Partners' as find in search option
And I should see 'Equity' as looking for in search option
And I verify 'Joe Fund' of deal sponsor fund name is displayed in jv partner equity search
And I verify 'Joe Project' of deal sponsor project name is displayed in jv partner equity search
And I verify 'Miller Fund' of investor fund name is displayed in jv partner equity search
And I verify 'Dan Loan' of lender loan name is displayed in jv partner equity search
And I verify 'Dan Mezz' of lender mezz name is displayed in jv partner equity search
And I verify 'Kim Listing' of real estate advisor listing name is displayed in jv partner equity search
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter lender email id who has created the jv requirement
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on Activities in side pane
And I click on your postings link
And I click on Dan loan of lender
And I get the number of matches count
When I click on matches
Then I should see 'JV Partners' as find in search option
And I should see 'Equity' as looking for in search option
When I get the number of matches in the search result
Then I verify that equity is selected in your contribution drop down
And I verify 'Joe Fund' deal sponsor fund name is displayed when click on matches of jv partner equity search
And I verify 'Joe Project' of deal sponsor project name is displayed when click on matches of jv partner equity search
And I verify 'Miller Fund' of investor fund name is displayed when click on matches of jv partner equity search
And I verify 'Dan Loan' of lender loan name is displayed when click on matches of jv partner equity search
And I verify 'Dan Mezz' of lender mezz name is displayed when click on matches of jv partner equity search
And I verify 'Kim Listing' of real estate advisor listing name is displayed when click on matches of jv partner equity search
And I verify the count of matches in search result and profile of user
When I logout RealConnex application
And I click on Log In button in RealConnex login page
When I enter deal sponsor email id for jv partner search
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'JV Partner' link
And I click on 'Equity' link
And I click on 'View Search Results' button
Then I should see 'JV Partners' as find in search option
And I should see 'Equity' as looking for in search option
When I click on route to partnership drop down
And I select intermediary option in route to partnership field
Then I verify 'Joe Fund' of deal sponsor fund is displayed in jv partner result in jv partner equity search
And I verify 'Joe Project' of deal sponsor project name is displayed in jv partner result in jv partner equity search
And I verify 'Miller Fund' of investor fund name is displayed in jv partner result in jv partner equity search
And I verify 'Dan Loan' of lender loan name is displayed in jv partner result in jv partner equity search
And I verify 'Dan Mezz' of lender mezz name is displayed in jv partner result in jv partner equity search
And I verify 'Kim Listing' of real estate advisor listing name is displayed in jv partner result in jv partner equity search
When I click on route to partnership drop down
And I clear intermediary option in route to partnership field
And I click on your contribution drop down
And I select equity option in your contribution field
Then I verify 'Joe Fund' of deal sponsor fund is displayed in jv partner result in jv partner equity search
And I verify 'Joe Project' of deal sponsor project name is displayed in jv partner result in jv partner equity search
And I verify 'Miller Fund' of investor fund name is displayed in jv partner result in jv partner equity search
And I verify 'Dan Loan' of lender loan name is displayed in jv partner result in jv partner equity search
And I verify 'Dan Mezz' of lender mezz name is displayed in jv partner result in jv partner equity search
And I verify 'Kim Listing' of real estate advisor listing name is displayed in jv partner result in jv partner equity search
When I click on your contribution drop down
And I clear equity option in your contribution field
And I click on asset type drop down
And I select hotel option in asset type drop down
Then I verify 'Joe Fund' of deal sponsor fund is displayed in jv partner result in jv partner equity search
And I verify 'Joe Project' of deal sponsor project name is displayed in jv partner result in jv partner equity search
And I verify 'Miller Fund' of investor fund name is displayed in jv partner result in jv partner equity search
And I verify 'Dan Loan' of lender loan name is displayed in jv partner result in jv partner equity search
And I verify 'Dan Mezz' of lender mezz name is displayed in jv partner result in jv partner equity search
And I verify 'Kim Listing' of real estate advisor listing name is displayed in jv partner result in jv partner equity search
When I click on asset type drop down
And I clear hotel option in asset type drop down
And I click on risk profile drop down
And I select value add option in risk profile drop down field
Then I verify 'Joe Fund' of deal sponsor fund is displayed in jv partner result in jv partner equity search
And I verify 'Joe Project' of deal sponsor project name is displayed in jv partner result in jv partner equity search
And I verify 'Miller Fund' of investor fund name is displayed in jv partner result in jv partner equity search
And I verify 'Dan Loan' of lender loan name is displayed in jv partner result in jv partner equity search
And I verify 'Dan Mezz' of lender mezz name is displayed in jv partner result in jv partner equity search
And I verify 'Kim Listing' of real estate advisor listing name is displayed in jv partner result in jv partner equity search
When I click on risk profile drop down
And I clear value add option in risk profile drop down field
And I click on deal stage drop down in search
And I select concept option in deal stage drop down of jv partner search
Then I verify 'Joe Fund' of deal sponsor fund is displayed in jv partner result in jv partner equity search
And I verify 'Joe Project' of deal sponsor project name is displayed in jv partner result in jv partner equity search
And I verify 'Miller Fund' of investor fund name is displayed in jv partner result in jv partner equity search
And I verify 'Dan Loan' of lender loan name is displayed in jv partner result in jv partner equity search
And I verify 'Dan Mezz' of lender mezz name is displayed in jv partner result in jv partner equity search
And I verify 'Kim Listing' of real estate advisor listing name is displayed in jv partner result in jv partner equity search
When I click on deal stage drop down in search
And I clear concept option in deal stage drop down of jv partner search
And I click on current asset status drop down
And I select partially stabilized option in current asset status drop down
Then I verify 'Joe Fund' of deal sponsor fund is displayed in jv partner result in jv partner equity search
And I verify 'Joe Project' of deal sponsor project name is displayed in jv partner result in jv partner equity search
And I verify 'Miller Fund' of investor fund name is displayed in jv partner result in jv partner equity search
And I verify 'Dan Loan' of lender loan name is displayed in jv partner result in jv partner equity search
And I verify 'Dan Mezz' of lender mezz name is displayed in jv partner result in jv partner equity search
And I verify 'Kim Listing' of real estate advisor listing name is displayed in jv partner result in jv partner equity search
When I click on current asset status drop down
And I clear partially stabilized option in current asset status drop down
And I select asset strategy drop down
And I select sales leaseback option in asset strategy drop down
Then I verify 'Joe Fund' of deal sponsor fund is displayed in jv partner result in jv partner equity search
And I verify 'Joe Project' of deal sponsor project name is displayed in jv partner result in jv partner equity search
And I verify 'Miller Fund' of investor fund name is displayed in jv partner result in jv partner equity search
And I verify 'Dan Loan' of lender loan name is displayed in jv partner result in jv partner equity search
And I verify 'Dan Mezz' of lender mezz name is displayed in jv partner result in jv partner equity search
And I verify 'Kim Listing' of real estate advisor listing name is displayed in jv partner result in jv partner equity search
When I select asset strategy drop down
And I clear sales leaseback option in asset strategy drop down
And I click on geographical coverage field
And I click on countries field
And I select United States checkbox in countries field
And I click on region field
And I click on Southwest region
And I click on states field
And I click on Texas state
And I click on cities field
And I enter and select Massa city
And I click on geographical coverage field
Then I verify 'Joe Fund' of deal sponsor fund is displayed in jv partner result in jv partner equity search
And I verify 'Joe Project' of deal sponsor project name is displayed in jv partner result in jv partner equity search
And I verify 'Miller Fund' of investor fund name is displayed in jv partner result in jv partner equity search
And I verify 'Dan Loan' of lender loan name is displayed in jv partner result in jv partner equity search
And I verify 'Dan Mezz' of lender mezz name is displayed in jv partner result in jv partner equity search
And I verify 'Kim Listing' of real estate advisor listing name is displayed in jv partner result in jv partner equity search
When I logout RealConnex application


