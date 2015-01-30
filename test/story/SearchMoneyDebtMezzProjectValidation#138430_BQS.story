Meta:
@storyType BQS

Narrative:
As a user
I verify that project type of "Mezz" project
are retrieved in "Money >> Debt >> Mezz" search

Scenario: TC 138430 : Verify that project type of "Mezz" projects are retrieved in search
When I update TestCaseId 138430
When I update TestCaseName Perform: "Money >> Debt >> Mezz" search Verify that projects other than "Mezz" project type are not retrieved.
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Debt' link
And I click on 'Mezz' link
And I click on 'Income/Core' link
And I click on 'View Search Results' button
Then I should see 'Money' in find of search option
And I should see 'Core' in risk of search option
When I set value in mezz amount field
Then I verify 'J Mezz Project' project name is not displayed in money debt mezz search
When I clear value in mezz amount field
And I set value of equity field
Then I verify 'J Mezz Project' project name is not displayed in money debt mezz search
When I clear value of equity field
And I set value of debt field
Then I verify 'J Mezz Project' project name is not displayed in money debt mezz search
When I clear value of debt field
And I set value for the term field
Then I verify 'J Mezz Project' project name is not displayed in money debt mezz search
When I clear value for the term field
And I set value of interest rate field
Then I verify 'J Mezz Project' project name is not displayed in money debt mezz search
When I clear value of interest rate field
When I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Debt' link
And I click on 'Mezz' link
And I click on 'Income/Core' link
And I click on 'View Search Results' button
And I click on collateral drop down
And I select cross collateralized option in collateral field
Then I verify 'Prod Mezz' project name is not displayed in money debt mezz search
When I click on collateral drop down
And I clear cross collateralized option in collateral field
And I check requires points in project field
Then I verify 'Prod Mezz' project name is not displayed in money debt mezz search
When I un check requires points in project field
And I click on geographical coverage field
And I click on countries field
And I select United States checkbox in countries field
And I click on region field
And I click on MidWest region
And I click on states field
And I click on West Virginia state
And I click on cities field
And I enter and select Mason city
And I click on geographical coverage field
Then I verify 'Prod Mezz' project name is not displayed in money debt mezz search
When I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Debt' link
And I click on 'Mezz' link
And I click on 'Income/Core' link
And I click on 'View Search Results' button
And I click loan for field in money debt mezz search
And I click on asset type field
And I select retail option in asset types field
Then I verify 'Prod Mezz' project name is not displayed in money debt mezz search
When I click on asset type field
And I clear retail option in asset types field
And I click on 'RiskProfile' drop down field
And I select value add option in risk profile field
Then I verify 'Prod Mezz' project name is not displayed in money debt mezz search
When I click on 'RiskProfile' drop down field
And I clear value add option in risk profile field
And I click on deal stage drop down field in money search
And I select plans approved or entitled option in deal stage
Then I verify 'Prod Mezz' project name is not displayed in money debt mezz search
When I click on deal stage drop down field in money search
And I clear plans approved or entitled option in deal stage
And I click on current asset status drop down field in money search
And I select REO option in current asset status field
Then I verify 'Prod Mezz' project name is not displayed in money debt mezz search
When I click on current asset status drop down field in money search
And I clear REO option in current asset status field
And I click asset strategy in loan for field
And I select quick flip option in asset strategy
Then I verify 'Prod Mezz' project name is not displayed in money debt mezz search
When I click asset strategy in loan for field
And I clear quick flip option in asset strategy
And I click on lender characteristics field
And I click lender profile in lender characteristics field
And I select bank option in lender characteristics
Then I verify 'Prod Mezz' project name is not displayed in money debt mezz search
When I click lender profile in lender characteristics field
And I clear bank option in lender characteristics
And I logout from RealConnex application

