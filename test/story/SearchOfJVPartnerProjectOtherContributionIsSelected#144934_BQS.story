Meta:
@storyType BQS

Narrative:
As a user
Perform "JV Partner >> Other" search and Verify that projects which has "Other" contribution selected in JV Partner requirement are retrieved.

Scenario: TC 144934: Verify that projects which has other contribution selected in JV Partner requirement are retrieved.
When I update TestCaseId 144934
When I update TestCaseName Perform "JV Partner >> Other" search and Verify that projects which has "Other" contribution selected in JV Partner requirement are retrieved.
When I launch RealConnex application
And I click on Log In button in RealConnex login page
When I enter deal sponsor email id for jv partner search
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'JV Partner' link
And I click on 'Other' link
And I click on 'View Search Results' button
Then I should see 'JV Partners' as find in search option
And I should see 'Other' as looking for in search option
And I verify 'LRoss Fund' of deal sponsor fund name is displayed in jv partner other search
And I verify 'LRoss Project' of deal sponsor project name is displayed in jv partner other search
And I verify 'Hill Fund' of investor fund name is displayed in jv partner other search
And I verify 'Kings Loan' of lender loan name is displayed in jv partner other search
And I verify 'Kings Mezz' of lender mezz name is displayed in jv partner other search
And I verify 'SMid Listing' of real estate advisor listing name is displayed in jv partner other search
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter deal sponsor email id who has created the jv requirement in jv search other
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on Activities in side pane
And I click on your postings link
And I click on lross fund of deal sponsor
And I get the number of matches count
When I click on matches
Then I should see 'JV Partners' as find in search option
And I should see 'Other' as looking for in search option
When I get the number of matches in the search result
Then I verify that other is selected in your contribution drop down
And I verify 'LRoss Fund' deal sponsor fund name is displayed when click on matches of jv partner other search
And I verify 'LRoss Project' of deal sponsor project name is displayed when click on matches of jv partner other search
And I verify 'Hill Fund' of investor fund name is displayed when click on matches of jv partner other search
And I verify 'Kings Loan' of lender loan name is displayed when click on matches of jv partner other search
And I verify 'Kings Mezz' of lender mezz name is displayed when click on matches of jv partner other search
And I verify 'SMid Listing' of real estate advisor listing name is displayed when click on matches of jv partner other search
And I verify the count of matches in search result and profile of user
When I logout RealConnex application
And I click on Log In button in RealConnex login page
When I enter deal sponsor email id for jv partner search
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'JV Partner' link
And I click on 'Other' link
And I click on 'View Search Results' button
Then I should see 'JV Partners' as find in search option
And I should see 'Other' as looking for in search option
When I click on route to partnership drop down
And I select broker option in route to partnership field
Then I verify 'LRoss Fund' of deal sponsor fund is displayed in jv partner result in jv partner other search
And I verify 'LRoss Project' of deal sponsor project name is displayed in jv partner result in jv partner other search
And I verify 'Hill Fund' of investor fund name is displayed in jv partner result in jv partner other search
And I verify 'Kings Loan' of lender loan name is displayed in jv partner result in jv partner other search
And I verify 'Kings Mezz' of lender mezz name is displayed in jv partner result in jv partner other search
And I verify 'SMid Listing' of real estate advisor listing name is displayed in jv partner result in jv partner other search
When I click on route to partnership drop down
And I clear broker option in route to partnership field
And I click on your contribution drop down
And I select other option in your contribution field
Then I verify 'LRoss Fund' of deal sponsor fund is displayed in jv partner result in jv partner other search
And I verify 'LRoss Project' of deal sponsor project name is displayed in jv partner result in jv partner other search
And I verify 'Hill Fund' of investor fund name is displayed in jv partner result in jv partner other search
And I verify 'Kings Loan' of lender loan name is displayed in jv partner result in jv partner other search
And I verify 'Kings Mezz' of lender mezz name is displayed in jv partner result in jv partner other search
And I verify 'SMid Listing' of real estate advisor listing name is displayed in jv partner result in jv partner other search
When I click on your contribution drop down
And I clear other option in your contribution field
And I click on asset type drop down
And I select mixed use option in asset type drop down of jv partner search
Then I verify 'LRoss Fund' of deal sponsor fund is displayed in jv partner result in jv partner other search
And I verify 'LRoss Project' of deal sponsor project name is displayed in jv partner result in jv partner other search
And I verify 'Hill Fund' of investor fund name is displayed in jv partner result in jv partner other search
And I verify 'Kings Loan' of lender loan name is displayed in jv partner result in jv partner other search
And I verify 'Kings Mezz' of lender mezz name is displayed in jv partner result in jv partner other search
And I verify 'SMid Listing' of real estate advisor listing name is displayed in jv partner result in jv partner other search
When I click on asset type drop down
And I clear mixed use option in asset type drop down
And I click on risk profile drop down
And I select opportunistic option in risk profile drop down field
Then I verify 'LRoss Fund' of deal sponsor fund is displayed in jv partner result in jv partner other search
And I verify 'LRoss Project' of deal sponsor project name is displayed in jv partner result in jv partner other search
And I verify 'Hill Fund' of investor fund name is displayed in jv partner result in jv partner other search
And I verify 'Kings Loan' of lender loan name is displayed in jv partner result in jv partner other search
And I verify 'Kings Mezz' of lender mezz name is displayed in jv partner result in jv partner other search
And I verify 'SMid Listing' of real estate advisor listing name is displayed in jv partner result in jv partner other search
When I click on risk profile drop down
And I clear opportunistic option in risk profile drop down field
And I click on deal stage drop down in search
And I select permitted option in deal stage drop down of jv partner search
Then I verify 'LRoss Fund' of deal sponsor fund is displayed in jv partner result in jv partner other search
And I verify 'LRoss Project' of deal sponsor project name is displayed in jv partner result in jv partner other search
And I verify 'Hill Fund' of investor fund name is displayed in jv partner result in jv partner other search
And I verify 'Kings Loan' of lender loan name is displayed in jv partner result in jv partner other search
And I verify 'Kings Mezz' of lender mezz name is displayed in jv partner result in jv partner other search
And I verify 'SMid Listing' of real estate advisor listing name is displayed in jv partner result in jv partner other search
When I click on deal stage drop down in search
And I clear permitted option in deal stage drop down of jv partner search
And I click on current asset status drop down
And I select partially rented option in current asset status drop down
Then I verify 'LRoss Fund' of deal sponsor fund is displayed in jv partner result in jv partner other search
And I verify 'LRoss Project' of deal sponsor project name is displayed in jv partner result in jv partner other search
And I verify 'Hill Fund' of investor fund name is displayed in jv partner result in jv partner other search
And I verify 'Kings Loan' of lender loan name is displayed in jv partner result in jv partner other search
And I verify 'Kings Mezz' of lender mezz name is displayed in jv partner result in jv partner other search
And I verify 'SMid Listing' of real estate advisor listing name is displayed in jv partner result in jv partner other search
When I click on current asset status drop down
And I clear partially rented option in current asset status drop down
And I select asset strategy drop down
And I select stable income producing option in asset strategy drop down
Then I verify 'LRoss Fund' of deal sponsor fund is displayed in jv partner result in jv partner other search
And I verify 'LRoss Project' of deal sponsor project name is displayed in jv partner result in jv partner other search
And I verify 'Hill Fund' of investor fund name is displayed in jv partner result in jv partner other search
And I verify 'Kings Loan' of lender loan name is displayed in jv partner result in jv partner other search
And I verify 'Kings Mezz' of lender mezz name is displayed in jv partner result in jv partner other search
And I verify 'SMid Listing' of real estate advisor listing name is displayed in jv partner result in jv partner other search
When I select asset strategy drop down
And I clear stable income producing option in asset strategy drop down
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
Then I verify 'LRoss Fund' of deal sponsor fund is displayed in jv partner result in jv partner other search
And I verify 'LRoss Project' of deal sponsor project name is displayed in jv partner result in jv partner other search
And I verify 'Hill Fund' of investor fund name is displayed in jv partner result in jv partner other search
And I verify 'Kings Loan' of lender loan name is displayed in jv partner result in jv partner other search
And I verify 'Kings Mezz' of lender mezz name is displayed in jv partner result in jv partner other search
And I verify 'SMid Listing' of real estate advisor listing name is displayed in jv partner result in jv partner other search
When I logout RealConnex application


