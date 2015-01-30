Meta:
@storyType BQS

Narrative:
As a user
Perform "New Business >> Corporate Finance" search and verify that projects that has a corporate requirement which matches the filters are retrieved.

Scenario: TC 144824 :  Search and verify that project which has corporate requirement are retrieved in New Business >> Corporate Finance requirement.
When I update TestCaseId 144824
When I update TestCaseName Perform "New Business >> Corporate Finance" search and verify that projects that has a corporate requirement which matches the filters are retrieved.
When I launch RealConnex application
And I click on Log In button in RealConnex login page
When I enter deal sponsor email id for new business search
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'New Business' link
And I click on 'Corporate Finance' link
And I click on 'Capital Raising' link
And I click on 'View Search Results' button
Then I should see 'New Business' as find in search option
And I verify 'Corporate Finance' is displayed in subrole field of New Business Search
And I should see 'Capital Raising' as strategy in search option
And I verify 'Moore Fund' of deal sponsor fund name is displayed in new business corporate finance search
And I verify 'Moore Project' of deal sponsor project name is displayed in new business corporate finance search
And I verify 'Luke Fund' of investor fund name is displayed in new business corporate finance search
And I verify 'Henry Loan' of lender loan name is displayed in new business corporate finance search
And I verify 'Henry Mezz' of lender mezz name is displayed in new business corporate finance search
And I verify 'Gavin Service' of real estate advisor service name is displayed in new business corporate finance search
And I verify 'Gavin Listing' of real estate advisor listing name is displayed in new business corporate finance search
When I click on 'Route to Sponsor' drop down field in search
And I select direct only option in route to sponsor drop down list
Then I verify 'Moore Fund' of deal sponsor fund name is displayed side search of corporate finance in new business corporate finance search
And I verify 'Luke Fund' of investor fund name is displayed side search of corporate finance in new business corporate finance search
When I click on 'Route to Sponsor' drop down field in search
And I clear route to sponsor drop down
And I click on asset type drop down
And I select office option in asset type drop down
Then I verify 'Moore Fund' of deal sponsor fund name is displayed side search of corporate finance in new business corporate finance search
And I verify 'Moore Project' of deal sponsor project name is displayed side search of corporate finance in new business corporate finance search
And I verify 'Luke Fund' of investor fund name is displayed side search of corporate finance in new business corporate finance search
And I verify 'Henry Loan' of lender loan name is displayed side search of corporate finance in new business corporate finance search
And I verify 'Henry Mezz' of lender mezz name is displayed side search of corporate finance in new business corporate finance search
And I verify 'Gavin Service' of real estate advisor service name is displayed side search of corporate finance in new business corporate finance search
And I verify 'Gavin Listing' of real estate advisor listing name is displayed side search of corporate finance in new business corporate finance search
When I click on asset type drop down
And I clear office option in asset type drop down
And I select ideal customer drop down field
And I select deal sponsor option in ideal customer field
And I select developer option in ideal customer field
Then I verify 'Moore Fund' of deal sponsor fund name is displayed side search of corporate finance in new business corporate finance search
And I verify 'Moore Project' of deal sponsor project name is displayed side search of corporate finance in new business corporate finance search
When I select ideal customer drop down field
And I clear deal sponsor option in ideal customer field
And I select ideal customer drop down field
And I select investor option in ideal customer field
And I select advisor option in ideal customer field
Then I verify 'Luke Fund' of investor fund name is displayed side search of corporate finance in new business corporate finance search
When I select ideal customer drop down field
And I clear investor option in ideal customer field
And I select ideal customer drop down field
And I select lender option in ideal customer field
And I select family office option in ideal customer field
Then I verify 'Henry Loan' of lender loan name is displayed side search of corporate finance in new business corporate finance search
And I verify 'Henry Mezz' of lender mezz name is displayed side search of corporate finance in new business corporate finance search
When I select ideal customer drop down field
And I clear lender option in ideal customer field
And I select ideal customer drop down field
And I select real estate advisor option in ideal customer field
And I select advisor option of real estate advisor in ideal customer field
Then I verify 'Gavin Service' of real estate advisor service name is displayed side search of corporate finance in new business corporate finance search
And I verify 'Gavin Listing' of real estate advisor listing name is displayed side search of corporate finance in new business corporate finance search
When I select ideal customer drop down field
And I clear real estate advisor option in ideal customer field
And I select number of professionals slider in new business advisor search
Then I verify 'Moore Fund' of deal sponsor fund name is displayed side search of corporate finance in new business corporate finance search
And I verify 'Moore Project' of deal sponsor project name is displayed side search of corporate finance in new business corporate finance search
And I verify 'Luke Fund' of investor fund name is displayed side search of corporate finance in new business corporate finance search
And I verify 'Henry Loan' of lender loan name is displayed side search of corporate finance in new business corporate finance search
And I verify 'Henry Mezz' of lender mezz name is displayed side search of corporate finance in new business corporate finance search
And I verify 'Gavin Service' of real estate advisor service name is displayed side search of corporate finance in new business corporate finance search
And I verify 'Gavin Listing' of real estate advisor listing name is displayed side search of corporate finance in new business corporate finance search
When I clear number of professionals slider in new business advisor search
When I click on geographical coverage field
And I click on countries field
And I select United States checkbox in countries field
And I click on region field
And I click on Southwest region
And I click on states field
And I click on Texas state
And I click on cities field
And I enter and select Era city
Then I verify 'Moore Fund' of deal sponsor fund name is displayed side search of corporate finance in new business corporate finance search
And I verify 'Moore Project' of deal sponsor project name is displayed side search of corporate finance in new business corporate finance search
And I verify 'Luke Fund' of investor fund name is displayed side search of corporate finance in new business corporate finance search
And I verify 'Henry Loan' of lender loan name is displayed side search of corporate finance in new business corporate finance search
And I verify 'Henry Mezz' of lender mezz name is displayed side search of corporate finance in new business corporate finance search
And I verify 'Gavin Service' of real estate advisor service name is displayed side search of corporate finance in new business corporate finance search
And I verify 'Gavin Listing' of real estate advisor listing name is displayed side search of corporate finance in new business corporate finance search
When I logout RealConnex application
