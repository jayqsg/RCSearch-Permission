Meta:
@storyType BQS

Narrative:
As a user
Perform "New Business >> Loans>> Loans/Hard Money" search and verify that projects that has loan requirement but Lighthouse is turned OFF are not retrieved.

Scenario: TC 144840: Verify that projects which has loan requirement selected in new business loan search are retrieved.
When I update TestCaseId 144840
When I update TestCaseName Perform "New Business >> Loans>> Loans/Hard Money" search and verify that projects that has loan requirement but Lighthouse is turned OFF are not retrieved.
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter deal sponsor email id for new business search
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'New Business' link
And I click on 'Loans' link in new business search
And I click on 'LoansOrHardMoney' link
Then I should see 'New Business' as find in search option
And I should see 'Loan/Hard Money' as loan type in search option
And I verify 'Haris Fund' fund name of user whose lighthouse is off are not displayed in new business loan search
When I select loan use drop down list
And I select senior or permanent option in loan use
Then I verify 'Haris Fund' fund name of user whose lighthouse is off are not displayed in new business loan search when side search performed
When I select loan use drop down list
And I clear senior or permanent option in loan use
When I set loan amount slider in new business search
Then I verify 'Haris Fund' fund name of user whose lighthouse is off are not displayed in new business loan search when side search performed
When I clear loan amount slider in new business search
And I set loan term slider in new business search
Then I verify 'Haris Fund' fund name of user whose lighthouse is off are not displayed in new business loan search when side search performed
When I clear loan term slider in new business search
And I click on route to browser drop down
And I select direct only option in route to browser
Then I verify 'Haris Fund' fund name of user whose lighthouse is off are not displayed in new business loan search when side search performed
When I click on route to browser drop down
And I clear direct only option in route to browser
And I click on asset type drop down
And I select office option in asset type drop down
Then I verify 'Haris Fund' fund name of user whose lighthouse is off are not displayed in new business loan search when side search performed
When I click on asset type drop down
And I clear office option in asset type drop down
And I click on risk profile drop down
And I select core option in risk profile drop down field
Then I verify 'Haris Fund' fund name of user whose lighthouse is off are not displayed in new business loan search when side search performed
When I click on risk profile drop down
And I clear core option in risk profile drop down field
And I click on deal stage drop down
And I select owned option in deal stage drop down of jv partner search
Then I verify 'Haris Fund' fund name of user whose lighthouse is off are not displayed in new business loan search when side search performed
When I click on deal stage drop down
And I clear owned option in deal stage drop down of jv partner search
And I click on current asset status drop down
And I select fully rented option in current asset status drop down
Then I verify 'Haris Fund' fund name of user whose lighthouse is off are not displayed in new business loan search when side search performed
When I click on current asset status drop down
And I clear fully rented option in current asset status drop down
And I select asset strategy drop down
And I select acquisition option in asset strategy drop down
Then I verify 'Haris Fund' fund name of user whose lighthouse is off are not displayed in new business loan search when side search performed
When I select asset strategy drop down
And I clear acquisition option in asset strategy drop down
And I logout RealConnex application
