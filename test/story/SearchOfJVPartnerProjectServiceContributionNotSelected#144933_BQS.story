Meta:
@storyType BQS

Narrative:
As a user
Perform "JV Partner >> Services" search and Verify that projects which does not have "Services" contribution selected in JV Partner requirement are not retrieved.

Scenario: TC 144933: Verify that projects which does not have service contribution selected in JV Partner requirement are not retrieved.
When I update TestCaseId 144933
When I update TestCaseName Perform "JV Partner >> Services" search and Verify that projects which does not have "Services" contribution selected in JV Partner requirement are not retrieved.
When I launch RealConnex application
And I click on Log In button in RealConnex login page
When I enter deal sponsor email id for jv partner search
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'JV Partner' link
And I click on 'Services' link
And I click on 'View Search Results' button
Then I should see 'JV Partners' as find in search option
And I should see 'Services' as looking for in search option
And I verify 'Kelly Fund' of deal sponsor fund name is not displayed in jv partner project search
And I verify 'Brown Project' of deal sponsor project name is not displayed in jv partner project search
And I verify 'Amira Fund' of investor fund name is not displayed in jv partner project search
And I verify 'LR Loan' of lender loan name is not displayed in jv partner project search
And I verify 'LR Mezz' of lender mezz name is not displayed in jv partner project search
And I verify 'Taylor Listing' of real estate advisor listing name is not displayed in jv partner project search
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter real estate user email id who has created the jv requirement
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on Activities in side pane
And I click on your postings link
And I click on laven listing of real estate advisor
And I get the number of matches count
When I click on matches
Then I should see 'JV Partners' as find in search option
And I should see 'Services' as looking for in search option
When I get the number of matches in the search result
Then I verify that services is selected in your contribution drop down
And I verify 'Kelly Fund' deal sponsor fund name is not displayed when click on matches of jv partner project search
And I verify 'Brown Project' of deal sponsor project name is not displayed when click on matches of jv partner project search
And I verify 'Amira Fund' of investor fund name is not displayed when click on matches of jv partner project search
And I verify 'LR Loan' of lender loan name is not displayed when click on matches of jv partner project search
And I verify 'LR Mezz' of lender mezz name is not displayed when click on matches of jv partner project search
And I verify 'Taylor Listing' of real estate advisor listing name is not displayed when click on matches of jv partner project search
And I verify the count of matches in search result and profile of user
When I logout RealConnex application
And I click on Log In button in RealConnex login page
When I enter deal sponsor email id for jv partner search
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'JV Partner' link
And I click on 'Land' link
And I click on 'View Search Results' button
Then I should see 'JV Partners' as find in search option
And I should see 'Land' as looking for in search option
When I click on route to partnership drop down
And I select principal option in route to partnership field
Then I verify 'Kelly Fund' of deal sponsor fund is not displayed in jv partner result in jv partner project search
And I verify 'Brown Project' of deal sponsor project name is not displayed in jv partner result in jv partner project search
And I verify 'Amira Fund' of investor fund name is not displayed in jv partner result in jv partner project search
And I verify 'LR Loan' of lender loan name is not displayed in jv partner result in jv partner project search
And I verify 'LR Mezz' of lender mezz name is not displayed in jv partner result in jv partner project search
And I verify 'Taylor Listing' of real estate advisor listing name is not displayed in jv partner result in jv partner project search
When I click on route to partnership drop down
And I clear principal option in route to partnership field
And I click on your contribution drop down
And I select service option in your contribution field
Then I verify 'Kelly Fund' of deal sponsor fund is not displayed in jv partner result in jv partner project search
And I verify 'Brown Project' of deal sponsor project name is not displayed in jv partner result in jv partner project search
And I verify 'Amira Fund' of investor fund name is not displayed in jv partner result in jv partner project search
And I verify 'LR Loan' of lender loan name is not displayed in jv partner result in jv partner project search
And I verify 'LR Mezz' of lender mezz name is not displayed in jv partner result in jv partner project search
And I verify 'Taylor Listing' of real estate advisor listing name is not displayed in jv partner result in jv partner project search
When I click on your contribution drop down
And I clear service option in your contribution field
And I click on asset type drop down
And I select health care option in asset type drop down
Then I verify 'Kelly Fund' of deal sponsor fund is not displayed in jv partner result in jv partner project search
And I verify 'Brown Project' of deal sponsor project name is not displayed in jv partner result in jv partner project search
And I verify 'Amira Fund' of investor fund name is not displayed in jv partner result in jv partner project search
And I verify 'LR Loan' of lender loan name is not displayed in jv partner result in jv partner project search
And I verify 'LR Mezz' of lender mezz name is not displayed in jv partner result in jv partner project search
And I verify 'Taylor Listing' of real estate advisor listing name is not displayed in jv partner result in jv partner project search
When I click on asset type drop down
And I clear health care option in asset type drop down
And I click on risk profile drop down
And I select development option in risk profile drop down field
Then I verify 'Kelly Fund' of deal sponsor fund is not displayed in jv partner result in jv partner project search
And I verify 'Brown Project' of deal sponsor project name is not displayed in jv partner result in jv partner project search
And I verify 'Amira Fund' of investor fund name is not displayed in jv partner result in jv partner project search
And I verify 'LR Loan' of lender loan name is not displayed in jv partner result in jv partner project search
And I verify 'LR Mezz' of lender mezz name is not displayed in jv partner result in jv partner project search
And I verify 'Taylor Listing' of real estate advisor listing name is not displayed in jv partner result in jv partner project search
When I click on risk profile drop down
And I clear development option in risk profile drop down field
And I click on deal stage drop down in search
And I select plans approved option in deal stage drop down of jv partner search
Then I verify 'Kelly Fund' of deal sponsor fund is not displayed in jv partner result in jv partner project search
And I verify 'Brown Project' of deal sponsor project name is not displayed in jv partner result in jv partner project search
And I verify 'Amira Fund' of investor fund name is not displayed in jv partner result in jv partner project search
And I verify 'LR Loan' of lender loan name is not displayed in jv partner result in jv partner project search
And I verify 'LR Mezz' of lender mezz name is not displayed in jv partner result in jv partner project search
And I verify 'Taylor Listing' of real estate advisor listing name is not displayed in jv partner result in jv partner project search
When I click on deal stage drop down in search
And I clear plans approved option in deal stage drop down of jv partner search
And I click on current asset status drop down
And I select vacant structure option in current asset status drop down
Then I verify 'Kelly Fund' of deal sponsor fund is not displayed in jv partner result in jv partner project search
And I verify 'Brown Project' of deal sponsor project name is not displayed in jv partner result in jv partner project search
And I verify 'Amira Fund' of investor fund name is not displayed in jv partner result in jv partner project search
And I verify 'LR Loan' of lender loan name is not displayed in jv partner result in jv partner project search
And I verify 'LR Mezz' of lender mezz name is not displayed in jv partner result in jv partner project search
And I verify 'Taylor Listing' of real estate advisor listing name is not displayed in jv partner result in jv partner project search
When I click on current asset status drop down
And I clear vacant structure option in current asset status drop down
And I select asset strategy drop down
And I select pursuit option in asset strategy drop down
Then I verify 'Kelly Fund' of deal sponsor fund is not displayed in jv partner result in jv partner project search
And I verify 'Brown Project' of deal sponsor project name is not displayed in jv partner result in jv partner project search
And I verify 'Amira Fund' of investor fund name is not displayed in jv partner result in jv partner project search
And I verify 'LR Loan' of lender loan name is not displayed in jv partner result in jv partner project search
And I verify 'LR Mezz' of lender mezz name is not displayed in jv partner result in jv partner project search
And I verify 'Taylor Listing' of real estate advisor listing name is not displayed in jv partner result in jv partner project search
When I select asset strategy drop down
And I clear pursuit option in asset strategy drop down
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
Then I verify 'Kelly Fund' of deal sponsor fund is not displayed in jv partner result in jv partner project search
And I verify 'Brown Project' of deal sponsor project name is not displayed in jv partner result in jv partner project search
And I verify 'Amira Fund' of investor fund name is not displayed in jv partner result in jv partner project search
And I verify 'LR Loan' of lender loan name is not displayed in jv partner result in jv partner project search
And I verify 'LR Mezz' of lender mezz name is not displayed in jv partner result in jv partner project search
And I verify 'Taylor Listing' of real estate advisor listing name is not displayed in jv partner result in jv partner project search
When I logout RealConnex application


