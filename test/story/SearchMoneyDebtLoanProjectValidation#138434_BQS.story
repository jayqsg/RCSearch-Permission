Meta:
@storyType BQS

Narrative:
As a user
I verify that project type of "Loan" projects are retrieved

Scenario: TC 138434 : Verify that project type of "Loan" projects are retrieved
When I update TestCaseId 138434
When I update TestCaseName Perform: "Money >> Debt >> Loans" search Verify that projects other than "Loan" project type are not retrieved.
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Debt' link
And I click on 'Loans' link
And I click on 'Land Loan' link
And I click on 'View Search Results' button
Then I should see 'Money' in find of money search
And I should see 'Land Loan' in loan of money debt loan search
When I set asset or build value field
Then I verify 'Kings-made Villa' project name is not displayed in money debt loan search
When I clear asset or build value field
And I set the value in loan amount
Then I verify 'Kings-made Villa' project name is not displayed in money debt loan search
When I clear the value in loan amount
And I set value for LVT slider
Then I verify 'Kings-made Villa' project name is not displayed in money debt loan search
When I clear value for LVT slider
And I set value of term field in money search
Then I verify 'Kings-made Villa' project name is not displayed in money debt loan search
When I clear value of term field in money search
When I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Debt' link
And I click on 'Loans' link
And I click on 'Land Loan' link
And I click on 'View Search Results' button
And I click on interest field
And I select interest only option in interest field
Then I verify 'Aqua' project name is not displayed in money debt loan search
When I click on interest field
And I clear interest only option in interest field
And I set value for interest rate field
Then I verify 'Kings-made Villa' project name is not displayed in money debt loan search
When I clear value for interest rate field
And I select non recourse option
Then I verify 'Aqua' project name is not displayed in money debt loan search
When I select any option
And I select recourse option
Then I verify 'Kings-made Villa' project name is not displayed in money debt loan search
When I select any option
And I click on collateral drop down
And I select the asset option in collateral field
Then I verify project name of 'CD' option is not displayed
When I click on collateral drop down
And I clear the asset option in collateral field
And I check requires points in project field
Then I verify 'Aqua' project name is not displayed in money debt loan search
When I un check requires points in project field
And I click on geographical coverage field
And I click on countries field
And I select United States checkbox in countries field
And I click on region field
And I click on NorthEast region
And I click on states field
And I click on New York state
And I click on cities field
And I enter and select Buffalo city
Then I verify 'Aqua' project name is not displayed in money debt loan search
When I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Debt' link
And I click on 'Loans' link
And I click on 'Land Loan' link
And I click on 'View Search Results' button
And I click loan for field
And I click on asset type field of money search
And I select commercial option in asset type field
Then I verify project name of 'Industrial' option is not displayed
When I click on asset type field of money search
And I clear commercial option in asset type field
And I click risk profile in loan for field
And I select development option in risk profile field
Then I verify project name of 'Opportunistic' option is not displayed
When I click risk profile in loan for field
And I clear development option in risk profile field
And I click deal stage in loan for field
And I select concept option in deal stage field
Then I verify project name of 'Under Contract' option is not displayed
When I click deal stage in loan for field
And I clear concept option in deal stage field
And I click current asset status in loan for field
And I select partially rented option in current asset status
Then I verify project name of 'Entitled' option is not displayed
When I click current asset status in loan for field
And I clear partially rented option in current asset status
And I click asset strategy in loan for field
And I select land bank option in asset strategy
Then I verify project name of 'Forward Commitment/Forward Purchase' option is not displayed
When I click asset strategy in loan for field
And I clear land bank option in asset strategy
And I set value of pre-leased field
Then I verify 'Kings-made Villa' project name is not displayed in money debt loan search
When I clear value of pre-leased field
And I set value of pre-sold field
Then I verify 'Kings-made Villa' project name is not displayed in money debt loan search
When I clear value of pre-leased field
And I click on lender characteristics field
And I click on lender profile in lender characteristics field
And I select mezz fund option in lender profile of lender characteristics field
Then I verify project name of 'Endowment Fund' option is not displayed
When I click on lender profile in lender characteristics field
And I clear mezz fund option in lender profile
And I logout from RealConnex application