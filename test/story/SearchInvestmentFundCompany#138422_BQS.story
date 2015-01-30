Meta:
@storyType BQS

Narrative:
As a user
I verify that companies of user with "Investor" role
are retrieved in "Investment >> Fund/Fund of Funds" search

Scenario: TC 138422 : Verify companies of user is retrieved when investment Fund search is performed
When I update TestCaseId 138422
When I update TestCaseName Perform: "Investment >> Fund/Fund of Funds" search Verify that companies of users with "Investor" role are retrieved.
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Investments' link
And I click on 'Fund' link
And I click on 'Core' in fund link
And I click on 'View Search Results' button
Then I should see 'Investments' in find of search option
And I verify kind of search option in fund search
And I verify risk of search option in fund search
When I click on company name of investment fund
And I return back to the searched page
And I click investing as drop down field
And I select co developer option in investing as drop down field
Then I verify 'NEPTUNE' company name of investments fund is displayed
When I click investing as drop down field
And I clear co developer option in investing as drop down field
When I click investing as drop down field
And I select general partner option in investing as drop down field
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click investing as drop down field
And I clear general partner option in investing as drop down field
When I click investing as drop down field
And I select limited partner option in investing as drop down field
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click investing as drop down field
And I select limited partner option in investing as drop down field
When I click investing as drop down field
And I select co gp option in investing drop down
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click investing as drop down field
And I select co lead option in investing drop down
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click investing as drop down field
And I select co developer in investing drop down
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click investing as drop down field
And I select other investor option in investing drop down
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click investing as drop down field
And I select all option in investing drop down
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click investing as drop down field
And I clear all option in investing drop down
And I click on route to investment field
And I select intermediary option in route to investment field
Then I verify 'NEPTUNE' company name of investments fund is displayed
When I click on route to investment field
And I clear intermediary option in route to investment field
And I click on route to investment field
And I select direct only option in route to investment field
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on route to investment field
And I select direct only option in route to investment field
When I click on route to investment field
And I select intermediary option in route to investment field
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on route to investment field
And I select broker option in route to investment field
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on route to investment field
And I select placement agent option in route to investment field
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on route to investment field
And I select all option in route to investment field
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on route to investment field
And I clear all option in route to investment field
And I click on geographical coverage field
And I click on countries field
And I select United States checkbox in countries field
And I click on region field
And I click on MidWest region
And I click on states field
And I click on West Virginia state
And I click on cities field
And I enter and select Yerba city
And I click on geographical coverage field
Then I verify 'NEPTUNE' company name of investments fund is displayed
When I click on 'RCMP MarketPlace' button
And I click on 'Investments' link
And I click on 'Fund' link
And I click on 'Core' in fund link
And I click on 'View Search Results' button
And I click on fund strategy
And I click on asset type field of investment fund search
And I select solar option of asset type
Then I verify 'NEPTUNE' company name of investments fund is displayed
When I click on asset type field of investment fund search
And I clear on solar option of asset type
When I click on asset type field of investment fund search
And I select a asset type office in drop down list
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on asset type field of investment fund search
And I click on multifamily option in asset type
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on asset type field of investment fund search
And I click on hotel option in asset type
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on asset type field of investment fund search
And I click on sports option in asset type
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on asset type field of investment fund search
And I click on health care option in asset type
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on asset type field of investment fund search
And I click on storage option in asset type
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on asset type field of investment fund search
And I click on other option in asset type
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on asset type field of investment fund search
And I click on retail option in asset type
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on asset type field of investment fund search
And I click on industrial option in asset type
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on asset type field of investment fund search
And I click on residential option in asset type
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on asset type field of investment fund search
And I click on single option in asset type
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on asset type field of investment fund search
And I click on retirement option in asset type
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on asset type field of investment fund search
And I click on student option in asset type
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on asset type field of investment fund search
And I click on other housing option in asset type
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on asset type field of investment fund search
And I click on residential multi family option in asset type
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on asset type field of investment fund search
And I clear residential of asset field
When I click on asset type field of investment fund search
And I click on mixed use option in asset type
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on asset type field of investment fund search
And I click on commercial option in asset type
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on asset type field of investment fund search
And I click on solar option in asset type
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on asset type field of investment fund search
And I click on all option in asset type
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on asset type field of investment fund search
And I clear all option in asset type
And I click on 'RiskProfile' drop down field
And I select core option in risk profile drop down
Then I verify 'NEPTUNE' company name of investments fund is displayed
When I click on 'RiskProfile' drop down field
And I clear core in risk profile drop down
And I click on 'RiskProfile' drop down field
And I select a risk profile in drop down list
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on 'RiskProfile' drop down field
And I click on core plus risk profile type
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on 'RiskProfile' drop down field
And I click on value add risk profile type
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on 'RiskProfile' drop down field
And I click on development risk profile type
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on 'RiskProfile' drop down field
And I click on opportunistic risk profile type
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on 'RiskProfile' drop down field
And I click on other option of risk profile type
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on 'RiskProfile' drop down field
And I click all option in risk profile type
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on 'RiskProfile' drop down field
And I clear risk profile
And I click on 'Asset Strategy' drop down field
And I select rezoning option in asset strategy
Then I verify 'NEPTUNE' company name of investments fund is displayed
When I click on 'Asset Strategy' drop down field
And I clear rezoning option in asset strategy
And I click on 'Asset Strategy' drop down field
And I select acquisition option in a strategy field of drop down list
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on 'Asset Strategy' drop down field
And I clear acquisition option in a strategy field of drop down list
And I click on 'Asset Strategy' drop down field
And I click on sale leaseback option in strategy
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on 'Asset Strategy' drop down field
And I click on stable income producing option in strategy
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on 'Asset Strategy' drop down field
And I click on quick flip option in strategy
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on 'Asset Strategy' drop down field
And I click on restructuring option in strategy
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on 'Asset Strategy' drop down field
And I click on recapitalization option in strategy
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on 'Asset Strategy' drop down field
And I click on land bank option in strategy
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on 'Asset Strategy' drop down field
And I click on change of use option in strategy
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on 'Asset Strategy' drop down field
And I click on development option in strategy
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on 'Asset Strategy' drop down field
And I click on platform build option in strategy
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on 'Asset Strategy' drop down field
And I click on pursuit option in strategy
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on 'Asset Strategy' drop down field
And I click on lease up option in strategy
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on 'Asset Strategy' drop down field
And I click on work out option in strategy
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on 'Asset Strategy' drop down field
And I click on restructuring corporate option in strategy
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on 'Asset Strategy' drop down field
And I click on public to private option in strategy
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on 'Asset Strategy' drop down field
And I click on rezoning option in strategy
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on 'Asset Strategy' drop down field
And I click on renovation option in strategy
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on 'Asset Strategy' drop down field
And I click on forward commitment option in strategy
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on 'Asset Strategy' drop down field
And I click on others option in strategy
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on 'Asset Strategy' drop down field
And I click on all option in strategy
Then I verify 'LAVEN COMPANY' company name of investments fund is displayed
When I click on 'Asset Strategy' drop down field
And I clear all option in strategy
And I check syndicators type check box
Then I verify 'NEPTUNE' company name of investments fund is displayed
When I un check syndicators type check box
And I logout from RealConnex application






