Meta:
@storyType BQS

Narrative:
As a user
Perform "New Business >> Advisor" search and verify that projects that does not have advisor requirement are not retrieved.

Scenario: TC 144821: Verify that projects which does not have advisor requirement selected in new business advisor search are not retrieved.
When I update TestCaseId 144821
When I update TestCaseName Perform "New Business >> Advisor" search and verify that projects that does not have advisor requirement are not retrieved.
When I launch RealConnex application
And I click on Log In button in RealConnex login page
When I enter deal sponsor email id for new business search
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'New Business' link
And I click on 'Advisor' link
And I click on 'Appraisal' link
And I click on 'View Search Results' button
Then I should see 'New Business' as find in search option
And I should see 'Advisor' as subrole in search option
And I should see 'Appraisal' as strategy in search option
And I verify 'ROld Fund' of deal sponsor fund name is not displayed in new business loan search
And I verify 'ROld Project' of deal sponsor fund name is not displayed in new business loan search
And I verify 'LBrian Fund' of investor fund name is not displayed in new business loan search
And I verify 'HJeff Loan' of lender loan name is not displayed in new business loan search
And I verify 'HJeff Mezz' of lender mezz name is not displayed in new business loan search
And I verify 'NSun Listing' of real estate advisor listing name is not displayed in new business loan search
And I verify 'NSun Service' of real estate advisor service name is not displayed in new business loan search
When I click on 'Route to Sponsor' drop down field in search
And I select direct only option in route to sponsor drop down list
Then I verify 'ROld Fund' of deal sponsor fund is not displayed in new business loan result in new business loan search
And I verify 'LBrian Fund' of investor fund name is not displayed in new business result in new business loan search
When I click on 'Route to Sponsor' drop down field in search
And I clear route to sponsor drop down
And I click on asset type drop down
And I select office option in asset type drop down
Then I verify 'ROld Fund' of deal sponsor fund is not displayed in new business loan result in new business loan search
And I verify 'ROld Project' of deal sponsor project name is not displayed in new business result in new business loan search
And I verify 'LBrian Fund' of investor fund name is not displayed in new business result in new business loan search
And I verify 'HJeff Loan' of lender loan name is not displayed in new business result in new business loan search
And I verify 'HJeff Mezz' of lender mezz name is not displayed in new business result in new business loan search
And I verify 'NSun Listing' of real estate advisor listing name is not displayed in new business loan result in new business loan search
And I verify 'NSun Service' of real estate advisor service name is not displayed in new business loan result in new business loan search
When I click on asset type drop down
And I clear office option in asset type drop down
And I select ideal customer drop down field
And I select deal sponsor option in ideal customer field
And I select developer option in ideal customer field
Then I verify 'ROld Fund' of deal sponsor fund is not displayed in new business loan result in new business loan search
And I verify 'ROld Project' of deal sponsor project name is not displayed in new business result in new business loan search
When I select ideal customer drop down field
And I clear deal sponsor option in ideal customer field
And I select ideal customer drop down field
And I select investor option in ideal customer field
And I select advisor option in ideal customer field
Then I verify 'LBrian Fund' of investor fund name is not displayed in new business result in new business loan search
When I select ideal customer drop down field
And I clear investor option in ideal customer field
And I select ideal customer drop down field
And I select lender option in ideal customer field
And I select family office option in ideal customer field
Then I verify 'HJeff Loan' of lender loan name is not displayed in new business result in new business loan search
And I verify 'HJeff Mezz' of lender mezz name is not displayed in new business result in new business loan search
When I select ideal customer drop down field
And I clear lender option in ideal customer field
And I select ideal customer drop down field
And I select real estate advisor option in ideal customer field
And I select advisor option of real estate advisor in ideal customer field
Then I verify 'NSun Listing' of real estate advisor listing name is not displayed in new business loan result in new business loan search
And I verify 'NSun Service' of real estate advisor service name is not displayed in new business loan result in new business loan search
When I select ideal customer drop down field
And I clear real estate advisor option in ideal customer field
And I select number of professionals slider in new business advisor search
Then I verify 'ROld Fund' of deal sponsor fund is not displayed in new business loan result in new business loan search
And I verify 'ROld Project' of deal sponsor project name is not displayed in new business result in new business loan search
And I verify 'LBrian Fund' of investor fund name is not displayed in new business result in new business loan search
And I verify 'HJeff Loan' of lender loan name is not displayed in new business result in new business loan search
And I verify 'HJeff Mezz' of lender mezz name is not displayed in new business result in new business loan search
And I verify 'NSun Listing' of real estate advisor listing name is not displayed in new business loan result in new business loan search
And I verify 'NSun Service' of real estate advisor service name is not displayed in new business loan result in new business loan search
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
Then I verify 'ROld Fund' of deal sponsor fund is not displayed in new business loan result in new business loan search
And I verify 'ROld Project' of deal sponsor project name is not displayed in new business result in new business loan search
And I verify 'LBrian Fund' of investor fund name is not displayed in new business result in new business loan search
And I verify 'HJeff Loan' of lender loan name is not displayed in new business result in new business loan search
And I verify 'HJeff Mezz' of lender mezz name is not displayed in new business result in new business loan search
And I verify 'NSun Listing' of real estate advisor listing name is not displayed in new business loan result in new business loan search
And I verify 'NSun Service' of real estate advisor service name is not displayed in new business loan result in new business loan search
When I logout RealConnex application