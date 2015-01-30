Meta:
@storyType BQS

Narrative:
As a user
Perform "New Business >> Loans>> Mezz" search and verify that projects that does not have mezz requirement are not retrieved.

Scenario: TC 144815: Verify that projects which does not have mezz requirement selected in new business mezz search are not retrieved.
When I update TestCaseId 144815
When I update TestCaseName Perform "New Business >> Loans>> Mezz" search and verify that projects that does not have mezz requirement are not retrieved.
When I launch RealConnex application
And I click on Log In button in RealConnex login page
When I enter deal sponsor email id for new business search
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'New Business' link
And I click on 'Loans' link in new business search
And I click on 'Mezz' link of new business search
Then I should see 'New Business' as find in search option
And I should see 'Mezz' as loan type in search option
And I verify 'RDavis Fund' of deal sponsor fund name is not displayed in new business mezz search
And I verify 'RDavis Project' of deal sponsor project name is not displayed in new business mezz search
And I verify 'BLee Fund' of investor fund name is not displayed in new business mezz search
And I verify 'JHall Loan' of lender loan name is not displayed in new business mezz search
And I verify 'JHall Mezz' of lender mezz name is not displayed in new business mezz search
And I verify 'KWin Listing' of real estate advisor listing name is not displayed in new business mezz search
And I verify 'KWin Service' of real estate advisor service name is not displayed in new business mezz search
When I select asset profile in new business mezz search
And I select core option in asset profile drop down in new business mezz search
Then I verify 'RDavis Fund' of deal sponsor fund is not displayed in new business mezz result in new business mezz search
And I verify 'RDavis Project' of deal sponsor project name is not displayed in new business result in new business mezz search
And I verify 'BLee Fund' of investor fund name is not displayed in new business result in new business mezz search
And I verify 'JHall Loan' of lender loan name is not displayed in new business result in new business mezz search
And I verify 'JHall Mezz' of lender mezz name is not displayed in new business result in new business mezz search
And I verify 'KWin Listing' of real estate advisor listing name is not displayed in new business mezz result in new business mezz search
And I verify 'KWin Service' of real estate advisor service name is not displayed in new business mezz result in new business mezz search
When I select asset profile in new business mezz search
And I clear core option in asset profile drop down in new business mezz search
When I set loan amount slider in new business search
Then I verify 'RDavis Fund' of deal sponsor fund is not displayed in new business mezz result in new business mezz search
And I verify 'RDavis Project' of deal sponsor project name is not displayed in new business result in new business mezz search
And I verify 'BLee Fund' of investor fund name is not displayed in new business result in new business mezz search
And I verify 'JHall Loan' of lender loan name is not displayed in new business result in new business mezz search
And I verify 'JHall Mezz' of lender mezz name is not displayed in new business result in new business mezz search
And I verify 'KWin Listing' of real estate advisor listing name is not displayed in new business mezz result in new business mezz search
And I verify 'KWin Service' of real estate advisor service name is not displayed in new business mezz result in new business mezz search
When I clear loan amount slider in new business search
And I select collateral drop down in new business mezz search
And I select the asset option in collateral field of new business mezz search
Then I verify 'RDavis Fund' of deal sponsor fund is not displayed in new business mezz result in new business mezz search
And I verify 'RDavis Project' of deal sponsor project name is not displayed in new business result in new business mezz search
And I verify 'BLee Fund' of investor fund name is not displayed in new business result in new business mezz search
And I verify 'JHall Loan' of lender loan name is not displayed in new business result in new business mezz search
And I verify 'JHall Mezz' of lender mezz name is not displayed in new business result in new business mezz search
And I verify 'KWin Listing' of real estate advisor listing name is not displayed in new business mezz result in new business mezz search
And I verify 'KWin Service' of real estate advisor service name is not displayed in new business mezz result in new business mezz search
When I select collateral drop down in new business mezz search
And I clear the asset option in collateral field of new business mezz search
And I click on route to browser drop down
And I select direct only option in route to browser
Then I verify 'RDavis Fund' of deal sponsor fund is not displayed in new business mezz result in new business mezz search
And I verify 'RDavis Project' of deal sponsor project name is not displayed in new business result in new business mezz search
And I verify 'BLee Fund' of investor fund name is not displayed in new business result in new business mezz search
And I verify 'JHall Loan' of lender loan name is not displayed in new business result in new business mezz search
And I verify 'JHall Mezz' of lender mezz name is not displayed in new business result in new business mezz search
And I verify 'KWin Listing' of real estate advisor listing name is not displayed in new business mezz result in new business mezz search
And I verify 'KWin Service' of real estate advisor service name is not displayed in new business mezz result in new business mezz search
When I click on route to browser drop down
And I clear direct only option in route to browser
And I click on asset type drop down
And I select office option in asset type drop down
Then I verify 'RDavis Fund' of deal sponsor fund is not displayed in new business mezz result in new business mezz search
And I verify 'RDavis Project' of deal sponsor project name is not displayed in new business result in new business mezz search
And I verify 'BLee Fund' of investor fund name is not displayed in new business result in new business mezz search
And I verify 'JHall Loan' of lender loan name is not displayed in new business result in new business mezz search
And I verify 'JHall Mezz' of lender mezz name is not displayed in new business result in new business mezz search
And I verify 'KWin Listing' of real estate advisor listing name is not displayed in new business mezz result in new business mezz search
And I verify 'KWin Service' of real estate advisor service name is not displayed in new business mezz result in new business mezz search
When I click on asset type drop down
And I clear office option in asset type drop down
And I click on deal stage drop down in search
And I select owned option in deal stage drop down of jv partner search
Then I verify 'RDavis Fund' of deal sponsor fund is not displayed in new business mezz result in new business mezz search
And I verify 'RDavis Project' of deal sponsor project name is not displayed in new business result in new business mezz search
And I verify 'BLee Fund' of investor fund name is not displayed in new business result in new business mezz search
And I verify 'JHall Loan' of lender loan name is not displayed in new business result in new business mezz search
And I verify 'JHall Mezz' of lender mezz name is not displayed in new business result in new business mezz search
And I verify 'KWin Listing' of real estate advisor listing name is not displayed in new business mezz result in new business mezz search
And I verify 'KWin Service' of real estate advisor service name is not displayed in new business mezz result in new business mezz search
When I click on deal stage drop down in search
And I clear owned option in deal stage drop down of jv partner search
And I click on current asset status drop down
And I select fully rented option in current asset status drop down
Then I verify 'RDavis Fund' of deal sponsor fund is not displayed in new business mezz result in new business mezz search
And I verify 'RDavis Project' of deal sponsor project name is not displayed in new business result in new business mezz search
And I verify 'BLee Fund' of investor fund name is not displayed in new business result in new business mezz search
And I verify 'JHall Loan' of lender loan name is not displayed in new business result in new business mezz search
And I verify 'JHall Mezz' of lender mezz name is not displayed in new business result in new business mezz search
And I verify 'KWin Listing' of real estate advisor listing name is not displayed in new business mezz result in new business mezz search
And I verify 'KWin Service' of real estate advisor service name is not displayed in new business mezz result in new business mezz search
When I click on current asset status drop down
And I clear fully rented option in current asset status drop down
And I select asset strategy drop down
And I select acquisition option in asset strategy drop down
Then I verify 'RDavis Fund' of deal sponsor fund is not displayed in new business mezz result in new business mezz search
And I verify 'RDavis Project' of deal sponsor project name is not displayed in new business result in new business mezz search
And I verify 'BLee Fund' of investor fund name is not displayed in new business result in new business mezz search
And I verify 'JHall Loan' of lender loan name is not displayed in new business result in new business mezz search
And I verify 'JHall Mezz' of lender mezz name is not displayed in new business result in new business mezz search
And I verify 'KWin Listing' of real estate advisor listing name is not displayed in new business mezz result in new business mezz search
And I verify 'KWin Service' of real estate advisor service name is not displayed in new business mezz result in new business mezz search
When I select asset strategy drop down
And I clear acquisition option in asset strategy drop down
And I logout RealConnex application


