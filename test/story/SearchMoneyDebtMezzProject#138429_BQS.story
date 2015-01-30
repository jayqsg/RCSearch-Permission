Meta:
@storyType BQS

Narrative:
As a user
I verify that project type of "Mezz" project
are retrieved in "Money >> Debt >> Mezz" search

Scenario: TC 138429 : Verify that project type of "Mezz" projects are retrieved in search
When I update TestCaseId 138429
When I update TestCaseName Perform: "Money >> Debt >> Mezz" search Verify that project type of "Mezz" projects are retrieved.
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
When I set value of mezz amount
Then I verify 'J Mezz Project' project name is displayed in money debt mezz search
When I clear value of mezz amount
And I set value of equity
Then I verify 'J Mezz Project' project name is displayed in money debt mezz search
When I clear value of equity
And I set value of debt
Then I verify 'J Mezz Project' project name is displayed in money debt mezz search
When I clear value of debt
And I set value of term
Then I verify 'J Mezz Project' project name is displayed in money debt mezz search
When I clear value of term
And I set value of interest rate
Then I verify 'J Mezz Project' project name is displayed in money debt mezz search
When I clear value of interest rate
And I click on collateral drop down
And I select cross collateralized option in collateral field
Then I verify 'J Mezz Project' project name is displayed in money debt mezz search
When I click on collateral drop down
And I clear cross collateralized option in collateral field
When I click on collateral drop down
And I select the asset option in collateral field
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on collateral drop down
And I clear the asset option in collateral field
When I click on collateral drop down
And I select cross collateralized option in collateral field
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on collateral drop down
And I clear cross collateralized option in collateral field
When I click on collateral drop down
And I select CD's option in collateral field
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on collateral drop down
And I select PG's option in collateral field
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on collateral drop down
And I select other option in collateral field
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on collateral drop down
And I select all option in collateral field
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on collateral drop down
And I clear all option in collateral field
And I check requires points in project field
Then I verify 'J Mezz Project' project name is displayed in money debt mezz search
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
Then I verify 'J Mezz Project' project name is displayed in money debt mezz search
When I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Debt' link
And I click on 'Mezz' link
And I click on 'Income/Core' link
And I click on 'View Search Results' button
And I click loan for field in money debt mezz search
And I click on asset type field
And I select retail option in asset types field
Then I verify 'J Mezz Project' project name is displayed in money debt mezz search
When I click on asset type field
And I clear retail option in asset types field
And I click on asset type field
And I select a asset type office in drop down list
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on asset type field
And I click on multifamily option in asset type
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on asset type field
And I click on hotel option in asset type
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on asset type field
And I click on sports option in asset type
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on asset type field
And I click on health care option in asset type
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on asset type field
And I click on storage option in asset type
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on asset type field
And I click on other option in asset type
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on asset type field
And I click on retail option in asset type
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on asset type field
And I click on industrial option in asset type
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on asset type field
And I click on residential option in asset type
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on asset type field
And I click on single option in asset type
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on asset type field
And I click on retirement option in asset type
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on asset type field
And I click on student option in asset type
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on asset type field
And I click on other housing option in asset type
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on asset type field
And I click on residential multi family option in asset type
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on asset type field
And I clear residential of asset field
And I click on asset type field
And I click on mixed use option in asset type
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on asset type field
And I click on commercial option in asset type
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on asset type field
And I click on solar option in asset type
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on asset type field
And I click on all option in asset type
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on asset type field
And I clear all option in asset type
And I click on 'RiskProfile' drop down field
And I select value add option in risk profile field
Then I verify 'J Mezz Project' project name is displayed in money debt mezz search
When I click on 'RiskProfile' drop down field
And I clear value add option in risk profile field
And I click on 'RiskProfile' drop down field
And I select a risk profile in drop down list
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on 'RiskProfile' drop down field
And I click on core plus risk profile type
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on 'RiskProfile' drop down field
And I click on value add risk profile type
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on 'RiskProfile' drop down field
And I click on development risk profile type
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on 'RiskProfile' drop down field
And I click on opportunistic risk profile type
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on 'RiskProfile' drop down field
And I click on other option of risk profile type
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on 'RiskProfile' drop down field
And I click all option in risk profile type
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on 'RiskProfile' drop down field
And I clear risk profile
And I click on deal stage drop down field in money search
And I select plans approved or entitled option in deal stage
Then I verify 'J Mezz Project' project name is displayed in money debt mezz search
When I click on deal stage drop down field in money search
And I clear plans approved or entitled option in deal stage
And I click on deal stage drop down field in money search
And I click on concept option in deal stage drop down of money search
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on deal stage drop down field in money search
And I click on permitted option in deal stage drop down of money search
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on deal stage drop down field in money search
And I click on ready for purchase option in deal stage drop down of money search
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on deal stage drop down field in money search
And I click on LOI option in deal stage drop down of money search
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on deal stage drop down field in money search
And I click on under contract option in deal stage drop down of money search
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on deal stage drop down field in money search
And I click on plans option in deal stage drop down of money search
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on deal stage drop down field in money search
And I click on under construction option in deal stage drop down of money search
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on deal stage drop down field in money search
And I click on pursuit option in deal stage drop down of money search
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on deal stage drop down field in money search
And I click on in DD option in deal stage drop down of money search
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on deal stage drop down field in money search
And I select all option in deal stage drop down of money search
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on deal stage drop down field in money search
And I clear all field in deal stage of money search
And I click on current asset status drop down field in money search
And I select REO option in current asset status field
Then I verify 'J Mezz Project' project name is displayed in money debt mezz search
When I click on current asset status drop down field in money search
And I clear REO option in current asset status field
When I click on current asset status drop down field in money search
And I select partially stabilized option in current asset status field of money search
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on current asset status drop down field in money search
And I select vacant option in current asset status field of money search
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on current asset status drop down field in money search
And I select under construction option in current asset status field of money search
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on current asset status drop down field in money search
And I select all option in current asset status field of money search
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on current asset status drop down field in money search
And I select reo option in current asset status field of money search
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on current asset status drop down field in money search
And I select vacant structure option in current asset status field of money search
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on current asset status drop down field in money search
And I select partially rented option in current asset status field of money search
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on current asset status drop down field in money search
And I select entitled option in current asset status field of money search
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on current asset status drop down field in money search
And I clear entitled option in current asset status field of money search
And I click on 'Asset Strategy' drop down field
And I select quick flip option in asset strategy
Then I verify 'J Mezz Project' project name is displayed in money debt mezz search
When I click on 'Asset Strategy' drop down field
And I clear quick flip option in asset strategy
And I click on 'Asset Strategy' drop down field
And I select acquisition option in a strategy field of drop down list
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on 'Asset Strategy' drop down field
And I clear acquisition option in a strategy field of drop down list
And I click on 'Asset Strategy' drop down field
And I click on sale leaseback option in strategy
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on 'Asset Strategy' drop down field
And I click on stable income producing option in strategy
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on 'Asset Strategy' drop down field
And I click on quick flip option in strategy
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on 'Asset Strategy' drop down field
And I click on restructuring option in strategy
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on 'Asset Strategy' drop down field
And I click on recapitalization option in strategy
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on 'Asset Strategy' drop down field
And I click on land bank option in strategy
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on 'Asset Strategy' drop down field
And I click on change of use option in strategy
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on 'Asset Strategy' drop down field
And I click on development option in strategy
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on 'Asset Strategy' drop down field
And I click on platform build option in strategy
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on 'Asset Strategy' drop down field
And I click on pursuit option in strategy
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on 'Asset Strategy' drop down field
And I click on lease up option in strategy
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on 'Asset Strategy' drop down field
And I click on work out option in strategy
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on 'Asset Strategy' drop down field
And I click on restructuring corporate option in strategy
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on 'Asset Strategy' drop down field
And I click on public to private option in strategy
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on 'Asset Strategy' drop down field
And I click on rezoning option in strategy
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on 'Asset Strategy' drop down field
And I click on renovation option in strategy
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on 'Asset Strategy' drop down field
And I click on forward commitment option in strategy
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on 'Asset Strategy' drop down field
And I click on others option in strategy
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on 'Asset Strategy' drop down field
And I click on all option in strategy
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click on 'Asset Strategy' drop down field
And I clear all option in strategy
And I click on lender characteristics field
And I click lender profile in lender characteristics field
And I select bank option in lender characteristics
Then I verify 'J Mezz Project' project name is displayed in money debt mezz search
When I click lender profile in lender characteristics field
And I clear bank option in lender characteristics
And I click lender profile in lender characteristics field
And I select mezz fund option in lender profile
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click lender profile in lender characteristics field
And I select institution option in lender profile
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click lender profile in lender characteristics field
And I select foundation option in lender profile
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click lender profile in lender characteristics field
And I select corporate investor option in lender profile
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click lender profile in lender characteristics field
And I select investment bank option in lender profile
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click lender profile in lender characteristics field
And I select pension fund option in lender profile
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click lender profile in lender characteristics field
And I select sovereign wealth fund option in lender profile
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click lender profile in lender characteristics field
And I select bank option in lender profile
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click lender profile in lender characteristics field
And I select private lender option in lender profile
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click lender profile in lender characteristics field
And I select individual option in lender profile
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click lender profile in lender characteristics field
And I select RE fund option in lender profile
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click lender profile in lender characteristics field
And I select government agency option in lender profile
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click lender profile in lender characteristics field
And I select insurance company option in lender profile
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click lender profile in lender characteristics field
And I select private equity fund option in lender profile
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click lender profile in lender characteristics field
And I select endowment fund option in lender profile
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click lender profile in lender characteristics field
And I select all option in lender profile
Then I verify 'Mich Mezz' project name is displayed in money debt mezz search
When I click lender profile in lender characteristics field
And I clear all option in lender profile
And I logout from RealConnex application