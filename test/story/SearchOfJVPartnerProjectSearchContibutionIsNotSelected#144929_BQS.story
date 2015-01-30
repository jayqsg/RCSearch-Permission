Meta:
@storyType BQS

Narrative:
As a user
Perform "JV Partner >> Project" search and Verify that projects which does not have "Project" contribution selected in JV Partner requirement are not retrieved.

Scenario: TC 144929: Verify that projects which has contribution selected in JV Partner requirement are retrieved in JV partner>>Project search.
When I update TestCaseId 144929
When I update TestCaseName Perform "JV Partner >> Project" search and Verify that projects which does not have "Project" contribution selected in JV Partner requirement are not retrieved.
When I launch RealConnex application
And I click on Log In button in RealConnex login page
When I enter deal sponsor email id for jv partner search
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'JV Partner' link
And I click on 'Project' link
And I click on 'View Search Results' button
Then I should see 'JV Partners' as find in search option
And I should see 'Project' as looking for in search option
And I verify 'Kelly Fund' of deal sponsor fund name is not displayed in jv partner project search
And I verify 'Brown Project' of deal sponsor project name is not displayed in jv partner project search
And I verify 'Amira Fund' of investor fund name is not displayed in jv partner project search
And I verify 'LR Loan' of lender loan name is not displayed in jv partner project search
And I verify 'LR Mezz' of lender mezz name is not displayed in jv partner project search
And I verify 'Taylor Listing' of real estate advisor listing name is not displayed in jv partner project search
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter investor email id who has created the jv requirement in project
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on Activities in side pane
And I click on your postings link
And I click on SW fund of investor
And I get the number of matches count
When I click on matches
Then I should see 'JV Partners' as find in search option
And I should see 'Project' as looking for in search option
When I get the number of matches in the search result
Then I verify that project is selected in your contribution drop down
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
And I click on 'Project' link
And I click on 'View Search Results' button
Then I should see 'JV Partners' as find in search option
And I should see 'Project' as looking for in search option
When I click on route to partnership drop down
And I select broker option in route to partnership field
Then I verify 'Kelly Fund' of deal sponsor fund is not displayed in jv partner result in jv partner project search
And I verify 'Brown Project' of deal sponsor project name is not displayed in jv partner result in jv partner project search
And I verify 'Amira Fund' of investor fund name is not displayed in jv partner result in jv partner project search
And I verify 'LR Loan' of lender loan name is not displayed in jv partner result in jv partner project search
And I verify 'LR Mezz' of lender mezz name is not displayed in jv partner result in jv partner project search
And I verify 'Taylor Listing' of real estate advisor listing name is not displayed in jv partner result in jv partner project search
When I click on route to partnership drop down
And I clear broker option in route to partnership field
And I click on your contribution drop down
And I select project option in your contribution field
Then I verify 'Kelly Fund' of deal sponsor fund is not displayed in jv partner result in jv partner project search
And I verify 'Brown Project' of deal sponsor project name is not displayed in jv partner result in jv partner project search
And I verify 'Amira Fund' of investor fund name is not displayed in jv partner result in jv partner project search
And I verify 'LR Loan' of lender loan name is not displayed in jv partner result in jv partner project search
And I verify 'LR Mezz' of lender mezz name is not displayed in jv partner result in jv partner project search
And I verify 'Taylor Listing' of real estate advisor listing name is not displayed in jv partner result in jv partner project search
When I click on your contribution drop down
And I clear project option in your contribution field
And I click on asset type drop down
And I select multi family option in asset type drop down
Then I verify 'Kelly Fund' of deal sponsor fund is not displayed in jv partner result in jv partner project search
And I verify 'Brown Project' of deal sponsor project name is not displayed in jv partner result in jv partner project search
And I verify 'Amira Fund' of investor fund name is not displayed in jv partner result in jv partner project search
And I verify 'LR Loan' of lender loan name is not displayed in jv partner result in jv partner project search
And I verify 'LR Mezz' of lender mezz name is not displayed in jv partner result in jv partner project search
And I verify 'Taylor Listing' of real estate advisor listing name is not displayed in jv partner result in jv partner project search
When I click on asset type drop down
And I clear multi family option in asset type drop down
And I click on risk profile drop down
And I select core plus option in risk profile drop down field
Then I verify 'Kelly Fund' of deal sponsor fund is not displayed in jv partner result in jv partner project search
And I verify 'Brown Project' of deal sponsor project name is not displayed in jv partner result in jv partner project search
And I verify 'Amira Fund' of investor fund name is not displayed in jv partner result in jv partner project search
And I verify 'LR Loan' of lender loan name is not displayed in jv partner result in jv partner project search
And I verify 'LR Mezz' of lender mezz name is not displayed in jv partner result in jv partner project search
And I verify 'Taylor Listing' of real estate advisor listing name is not displayed in jv partner result in jv partner project search
When I click on risk profile drop down
And I clear core plus option in risk profile drop down field
And I click on deal stage drop down in search
And I select under contract option in deal stage drop down of jv partner search
Then I verify 'Kelly Fund' of deal sponsor fund is not displayed in jv partner result in jv partner project search
And I verify 'Brown Project' of deal sponsor project name is not displayed in jv partner result in jv partner project search
And I verify 'Amira Fund' of investor fund name is not displayed in jv partner result in jv partner project search
And I verify 'LR Loan' of lender loan name is not displayed in jv partner result in jv partner project search
And I verify 'LR Mezz' of lender mezz name is not displayed in jv partner result in jv partner project search
And I verify 'Taylor Listing' of real estate advisor listing name is not displayed in jv partner result in jv partner project search
When I click on deal stage drop down in search
And I clear under contract option in deal stage drop down of jv partner search
And I click on current asset status drop down
And I select reo option in current asset status drop down
Then I verify 'Kelly Fund' of deal sponsor fund is not displayed in jv partner result in jv partner project search
And I verify 'Brown Project' of deal sponsor project name is not displayed in jv partner result in jv partner project search
And I verify 'Amira Fund' of investor fund name is not displayed in jv partner result in jv partner project search
And I verify 'LR Loan' of lender loan name is not displayed in jv partner result in jv partner project search
And I verify 'LR Mezz' of lender mezz name is not displayed in jv partner result in jv partner project search
And I verify 'Taylor Listing' of real estate advisor listing name is not displayed in jv partner result in jv partner project search
When I click on current asset status drop down
And I clear reo option in current asset status drop down
And I select asset strategy drop down
And I select platform build option in asset strategy drop down
Then I verify 'Kelly Fund' of deal sponsor fund is not displayed in jv partner result in jv partner project search
And I verify 'Brown Project' of deal sponsor project name is not displayed in jv partner result in jv partner project search
And I verify 'Amira Fund' of investor fund name is not displayed in jv partner result in jv partner project search
And I verify 'LR Loan' of lender loan name is not displayed in jv partner result in jv partner project search
And I verify 'LR Mezz' of lender mezz name is not displayed in jv partner result in jv partner project search
And I verify 'Taylor Listing' of real estate advisor listing name is not displayed in jv partner result in jv partner project search
When I select asset strategy drop down
And I clear platform build option in asset strategy drop down
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


