Meta:
@storyType BQS

Narrative:
As a user
I verify that project type of "Loan" projects are retrieved in Money >> Debt >> Loans

Scenario: TC 138433 : Verify that project type of "Loan" projects are retrieved
When I update TestCaseId 138433
When I update TestCaseName Perform: "Money >> Debt >> Loans" search Verify that project type of "Loan" projects are retrieved.
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
When I set asset or build value
Then I verify 'Kings-made Villa' project name is displayed in money debt loan search
When I clear asset or build value
And I set the value in loan amount field
Then I verify 'Kings-made Villa' project name is displayed in money debt loan search
When I clear the value in loan amount field
And I set value of LVT field
Then I verify 'Kings-made Villa' project name is displayed in money debt loan search
When I clear value of LVT field
And I set value of term field
Then I verify 'Kings-made Villa' project name is displayed in money debt loan search
When I clear value of term field
And I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Debt' link
And I click on 'Loans' link
And I click on 'Land Loan' link
And I click on 'View Search Results' button
And I click on interest field
And I select interest only option in interest field
Then I verify 'Kings-made Villa' project name is displayed in money debt loan search
When I click on interest field
And I clear interest only option in interest field
When I click on interest field
And I select interest only option in interest field
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click on interest field
And I clear interest only option in interest field
When I click on interest field
And I select fixed rate option in interest field
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click on interest field
And I select floating rate option in interest field
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click on interest field
And I select PIK option in interest field
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click on interest field
And I clear PIK option in interest field
And I set interest rate
Then I verify 'Kings-made Villa' project name is displayed in money debt loan search
When I clear interest rate
And I click on 'RCMP MarketPlace' button
And I click on 'Loans' link
And I click on 'Land Loan' link
And I click on 'View Search Results' button
And I select non recourse option
Then I verify 'Kings-made Villa' project name is displayed in money debt loan search
When I select any option
And I click on collateral drop down
And I select the asset option in collateral field
Then I verify 'Kings-made Villa' project name is displayed in money debt loan search
When I click on collateral drop down
And I clear the asset option in collateral field
When I click on collateral drop down
And I select the asset option in collateral field
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click on collateral drop down
And I clear the asset option in collateral field
And I click on collateral drop down
And I select cross collateralized option in collateral field
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click on collateral drop down
And I clear cross collateralized option in collateral field
And I click on collateral drop down
And I select CD's option in collateral field
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click on collateral drop down
And I select PG's option in collateral field
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click on collateral drop down
And I select other option in collateral field
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click on collateral drop down
And I select all option in collateral field
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click on collateral drop down
And I clear all option in collateral field
And I check requires points in project field
Then I verify 'Kings-made Villa' project name is displayed in money debt loan search
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
Then I verify 'Kings-made Villa' project name is displayed in money debt loan search
When I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Debt' link
And I click on 'Loans' link
And I click on 'Land Loan' link
And I click on 'View Search Results' button
And I click loan for field
And I click asset types in loan for field
And I select commercial option in asset type field
Then I verify 'Kings-made Villa' project name is displayed in money debt loan search
When I click asset types in loan for field
And I clear commercial option in asset type field
And I click asset types in loan for field
And I select a asset type office in drop down list
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click asset types in loan for field
And I click on multifamily option in asset type
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click asset types in loan for field
And I click on hotel option in asset type
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click asset types in loan for field
And I click on sports option in asset type
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click asset types in loan for field
And I click on health care option in asset type
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click asset types in loan for field
And I click on storage option in asset type
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click asset types in loan for field
And I click on other option in asset type
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click asset types in loan for field
And I click on retail option in asset type
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click asset types in loan for field
And I click on industrial option in asset type
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click asset types in loan for field
And I click on residential option in asset type
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click asset types in loan for field
And I click on single option in asset type
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click asset types in loan for field
And I click on retirement option in asset type
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click asset types in loan for field
And I click on student option in asset type
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click asset types in loan for field
And I click on other housing option in asset type
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click asset types in loan for field
And I click on residential multi family option in asset type
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click asset types in loan for field
And I clear residential of asset field
And I click asset types in loan for field
And I click on mixed use option in asset type
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click asset types in loan for field
And I click on commercial option in asset type
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click asset types in loan for field
And I click on solar option in asset type
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click asset types in loan for field
And I click on all option in asset type
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click asset types in loan for field
And I clear all option in asset type
And I click risk profile in loan for field
And I select development option in risk profile field
Then I verify 'Kings-made Villa' project name is displayed in money debt loan search
When I click risk profile in loan for field
And I clear development option in risk profile field
And I click risk profile in loan for field
And I select a risk profile in drop down list
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click risk profile in loan for field
And I click on core plus risk profile type
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click risk profile in loan for field
And I click on value add risk profile type
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click risk profile in loan for field
And I click on development risk profile type
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click risk profile in loan for field
And I click on opportunistic risk profile type
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click risk profile in loan for field
And I click on other option of risk profile type
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click risk profile in loan for field
And I click all option in risk profile type
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click risk profile in loan for field
And I clear risk profile
And I click deal stage in loan for field
And I click on concept option in deal stage drop down of money search
Then I verify 'Kings-made Villa' project name is displayed in money debt loan search
When I click deal stage in loan for field
And I clear concept option in deal stage field
And I click deal stage in loan for field
And I click on concept option in deal stage drop down of money search
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click deal stage in loan for field
And I click on permitted option in deal stage drop down of money search
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click deal stage in loan for field
And I click on ready for purchase option in deal stage drop down of money search
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click deal stage in loan for field
And I click on LOI option in deal stage drop down of money search
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click deal stage in loan for field
And I click on under contract option in deal stage drop down of money search
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click deal stage in loan for field
And I click on plans option in deal stage drop down of money search
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click deal stage in loan for field
And I click on under construction option in deal stage drop down of money search
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click deal stage in loan for field
And I click on pursuit option in deal stage drop down of money search
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click deal stage in loan for field
And I click on in DD option in deal stage drop down of money search
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click deal stage in loan for field
And I select all option in deal stage drop down of money search
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click deal stage in loan for field
And I clear all field in deal stage of money search
And I click current asset status in loan for field
And I select partially rented option in current asset status
Then I verify 'Kings-made Villa' project name is displayed in money debt loan search
When I click current asset status in loan for field
And I clear partially rented option in current asset status
When I click current asset status in loan for field
And I select partially stabilized option in current asset status field
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click current asset status in loan for field
And I select vacant option in current asset status field
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click current asset status in loan for field
And I select under construction option in current asset status field
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click current asset status in loan for field
And I select all option in current asset status field
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click current asset status in loan for field
And I select reo option in current asset status field
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click current asset status in loan for field
And I select vacant structure option in current asset status field
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click current asset status in loan for field
And I select partially rented option in current asset status field
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click current asset status in loan for field
And I select entitled option in current asset status field
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click current asset status in loan for field
And I clear entitled option in current asset status field
And I click asset strategy in loan for field
And I select land bank option in asset strategy
Then I verify 'Kings-made Villa' project name is displayed in money debt loan search
When I click asset strategy in loan for field
And I clear land bank option in asset strategy
And I click asset strategy in loan for field
And I select acquisition option in a strategy field of drop down list
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click asset strategy in loan for field
And I clear acquisition option in a strategy field of drop down list
And I click asset strategy in loan for field
And I click on sale leaseback option in strategy
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click asset strategy in loan for field
And I click on stable income producing option in strategy
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click asset strategy in loan for field
And I click on quick flip option in strategy
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click asset strategy in loan for field
And I click on restructuring option in strategy
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click asset strategy in loan for field
And I click on recapitalization option in strategy
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click asset strategy in loan for field
And I click on land bank option in strategy
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click asset strategy in loan for field
And I click on change of use option in strategy
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click asset strategy in loan for field
And I click on development option in strategy
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click asset strategy in loan for field
And I click on platform build option in strategy
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click asset strategy in loan for field
And I click on pursuit option in strategy
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click asset strategy in loan for field
And I click on lease up option in strategy
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click asset strategy in loan for field
And I click on work out option in strategy
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click asset strategy in loan for field
And I click on restructuring corporate option in strategy
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click asset strategy in loan for field
And I click on public to private option in strategy
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click asset strategy in loan for field
And I click on rezoning option in strategy
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click asset strategy in loan for field
And I click on renovation option in strategy
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click asset strategy in loan for field
And I click on forward commitment option in strategy
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click asset strategy in loan for field
And I click on others option in strategy
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click asset strategy in loan for field
And I click on all option in strategy
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click asset strategy in loan for field
And I clear all option in strategy
And I set value of pre-leased
Then I verify 'Kings-made Villa' project name is displayed in money debt loan search
When I clear value of pre-leased
And I set value of pre-sold
Then I verify 'Kings-made Villa' project name is displayed in money debt loan search
When I clear value of pre-sold
And I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Debt' link
And I click on 'Loans' link
And I click on 'Land Loan' link
And I click on 'View Search Results' button
And I click on lender characteristics field
And I click on lender profile in lender characteristics field
And I select mezz fund option in lender profile of lender characteristics field
Then I verify 'Kings-made Villa' project name is displayed in money debt loan search
When I click on lender profile in lender characteristics field
And I clear mezz fund option in lender profile
When I click on lender profile in lender characteristics field
And I select mezz fund option in lender profile
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click on lender profile in lender characteristics field
And I select institution option in lender profile
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click on lender profile in lender characteristics field
And I select foundation option in lender profile
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click on lender profile in lender characteristics field
And I select corporate investor option in lender profile
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click on lender profile in lender characteristics field
And I select investment bank option in lender profile
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click on lender profile in lender characteristics field
And I select pension fund option in lender profile
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click on lender profile in lender characteristics field
And I select sovereign wealth fund option in lender profile
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click on lender profile in lender characteristics field
And I select bank option in lender profile
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click on lender profile in lender characteristics field
And I select private lender option in lender profile
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click on lender profile in lender characteristics field
And I select individual option in lender profile
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click on lender profile in lender characteristics field
And I select RE fund option in lender profile
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click on lender profile in lender characteristics field
And I select government agency option in lender profile
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click on lender profile in lender characteristics field
And I select insurance company option in lender profile field
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click on lender profile in lender characteristics field
And I select private equity fund option in lender profile
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click on lender profile in lender characteristics field
And I select endowment fund option in lender profile
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click on lender profile in lender characteristics field
And I select all option in lender profile
Then I verify 'Mich Loan' project name is displayed in money debt loan search
When I click on lender profile in lender characteristics field
And I clear all option in lender profile
And I logout from RealConnex application



