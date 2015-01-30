Meta:
@storyType BQS

Narrative:
As a user
Perform "New Business >> Loans>> Loans/Hard Money" search and verify that projects that does not have loan requirement are not retrieved.

Scenario: TC 144810: Verify that projects which does not have loan requirement selected in new business loan search are not retrieved.
When I update TestCaseId 144810
When I update TestCaseName Perform "New Business >> Loans>> Loans/Hard Money" search and verify that projects that does not have loan requirement are not retrieved.
When I launch RealConnex application
And I click on Log In button in RealConnex login page
When I enter deal sponsor email id for new business search
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'New Business' link
And I click on 'Loans' link in new business search
And I click on 'LoansOrHardMoney' link
Then I should see 'New Business' as find in search option
And I should see 'Loan/Hard Money' as loan type in search option
And I verify 'ROld Fund' of deal sponsor fund name is not displayed in new business loan search
And I verify 'ROld Project' of deal sponsor fund name is not displayed in new business loan search
And I verify 'LBrian Fund' of investor fund name is not displayed in new business loan search
And I verify 'HJeff Loan' of lender loan name is not displayed in new business loan search
And I verify 'HJeff Mezz' of lender mezz name is not displayed in new business loan search
And I verify 'NSun Listing' of real estate advisor listing name is not displayed in new business loan search
And I verify 'NSun Service' of real estate advisor service name is not displayed in new business loan search
When I select loan use drop down list
And I select senior or permanent option in loan use
Then I verify 'ROld Fund' of deal sponsor fund is not displayed in new business loan result in new business loan search
And I verify 'ROld Project' of deal sponsor project name is not displayed in new business result in new business loan search
And I verify 'LBrian Fund' of investor fund name is not displayed in new business result in new business loan search
And I verify 'HJeff Loan' of lender loan name is not displayed in new business result in new business loan search
And I verify 'HJeff Mezz' of lender mezz name is not displayed in new business result in new business loan search
And I verify 'NSun Listing' of real estate advisor listing name is not displayed in new business loan result in new business loan search
And I verify 'NSun Service' of real estate advisor service name is not displayed in new business loan result in new business loan search
When I select loan use drop down list
And I clear senior or permanent option in loan use
When I set loan amount slider in new business search
Then I verify 'ROld Fund' of deal sponsor fund is not displayed in new business loan result in new business loan search
And I verify 'ROld Project' of deal sponsor project name is not displayed in new business result in new business loan search
And I verify 'LBrian Fund' of investor fund name is not displayed in new business result in new business loan search
And I verify 'HJeff Loan' of lender loan name is not displayed in new business result in new business loan search
And I verify 'HJeff Mezz' of lender mezz name is not displayed in new business result in new business loan search
And I verify 'NSun Listing' of real estate advisor listing name is not displayed in new business loan result in new business loan search
And I verify 'NSun Service' of real estate advisor service name is not displayed in new business loan result in new business loan search
When I clear loan amount slider in new business search
And I set loan term slider in new business search
Then I verify 'ROld Fund' of deal sponsor fund is not displayed in new business loan result in new business loan search
And I verify 'ROld Project' of deal sponsor project name is not displayed in new business result in new business loan search
And I verify 'LBrian Fund' of investor fund name is not displayed in new business result in new business loan search
And I verify 'HJeff Loan' of lender loan name is not displayed in new business result in new business loan search
And I verify 'HJeff Mezz' of lender mezz name is not displayed in new business result in new business loan search
And I verify 'NSun Listing' of real estate advisor listing name is not displayed in new business loan result in new business loan search
And I verify 'NSun Service' of real estate advisor service name is not displayed in new business loan result in new business loan search
When I clear loan term slider in new business search
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
And I click on risk profile drop down
And I select core option in risk profile drop down field
Then I verify 'ROld Fund' of deal sponsor fund is not displayed in new business loan result in new business loan search
And I verify 'ROld Project' of deal sponsor project name is not displayed in new business result in new business loan search
And I verify 'LBrian Fund' of investor fund name is not displayed in new business result in new business loan search
And I verify 'HJeff Loan' of lender loan name is not displayed in new business result in new business loan search
And I verify 'HJeff Mezz' of lender mezz name is not displayed in new business result in new business loan search
And I verify 'NSun Listing' of real estate advisor listing name is not displayed in new business loan result in new business loan search
And I verify 'NSun Service' of real estate advisor service name is not displayed in new business loan result in new business loan search
When I click on risk profile drop down
And I clear core option in risk profile drop down field
And I click on deal stage drop down
And I select owned option in deal stage drop down of jv partner search
Then I verify 'ROld Fund' of deal sponsor fund is not displayed in new business loan result in new business loan search
And I verify 'ROld Project' of deal sponsor project name is not displayed in new business result in new business loan search
And I verify 'LBrian Fund' of investor fund name is not displayed in new business result in new business loan search
And I verify 'HJeff Loan' of lender loan name is not displayed in new business result in new business loan search
And I verify 'HJeff Mezz' of lender mezz name is not displayed in new business result in new business loan search
And I verify 'NSun Listing' of real estate advisor listing name is not displayed in new business loan result in new business loan search
And I verify 'NSun Service' of real estate advisor service name is not displayed in new business loan result in new business loan search
When I click on deal stage drop down
And I clear owned option in deal stage drop down of jv partner search
And I click on current asset status drop down
And I select fully rented option in current asset status drop down
Then I verify 'ROld Fund' of deal sponsor fund is not displayed in new business loan result in new business loan search
And I verify 'ROld Project' of deal sponsor project name is not displayed in new business result in new business loan search
And I verify 'LBrian Fund' of investor fund name is not displayed in new business result in new business loan search
And I verify 'HJeff Loan' of lender loan name is not displayed in new business result in new business loan search
And I verify 'HJeff Mezz' of lender mezz name is not displayed in new business result in new business loan search
And I verify 'NSun Listing' of real estate advisor listing name is not displayed in new business loan result in new business loan search
And I verify 'NSun Service' of real estate advisor service name is not displayed in new business loan result in new business loan search
When I click on current asset status drop down
And I clear fully rented option in current asset status drop down
And I select asset strategy drop down
And I select acquisition option in asset strategy drop down
Then I verify 'ROld Fund' of deal sponsor fund is not displayed in new business loan result in new business loan search
And I verify 'ROld Project' of deal sponsor project name is not displayed in new business result in new business loan search
And I verify 'LBrian Fund' of investor fund name is not displayed in new business result in new business loan search
And I verify 'HJeff Loan' of lender loan name is not displayed in new business result in new business loan search
And I verify 'HJeff Mezz' of lender mezz name is not displayed in new business result in new business loan search
And I verify 'NSun Listing' of real estate advisor listing name is not displayed in new business loan result in new business loan search
And I verify 'NSun Service' of real estate advisor service name is not displayed in new business loan result in new business loan search
When I select asset strategy drop down
And I clear acquisition option in asset strategy drop down
And I logout RealConnex application


