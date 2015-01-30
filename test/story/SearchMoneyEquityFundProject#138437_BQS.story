Meta:
@storyType BQS

Narrative:
As a user
I Verify that Deal Sponsor "Fund" and Investor "Fund" projects are
retrieved when "Money >> Equity" search

Scenario: TC 138437 : Verify that Deal Sponsor "Fund" and Investor "Fund" projects are retrieved
When I update TestCaseId 138437
When I update TestCaseName Perform: "Money >> Equity" search Verify that Deal Sponsor "Fund" and Investor "Fund" projects are retrieved.
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Fund' of money search
And I click on 'View Search Results' button
Then I should see 'Money' in find of money search
And I should see 'Fund' in kind of money search
When I set the values for fund size
Then I verify 'NICK FUND' project of investor is displayed
And I verify 'Sheryl FUND' project of deal sponsor is displayed
When I clear the values for fund size
When I set the value of investment amount field
Then I verify 'NICK FUND' project of investor is displayed
And I verify 'Sheryl FUND' project of deal sponsor is displayed
When I clear the value of investment amount field
And I set the value of fund term
Then I verify 'NICK FUND' project of investor is displayed
When I clear the value of fund term
When I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Fund' of money search
And I click on 'View Search Results' button
And I click on geographical coverage field
And I click on countries field
And I select United States checkbox in countries field
And I click on region field
And I click on West region
And I click on states field
And I click on California state
And I click on cities field
And I enter and select San Francisco city
And I click on geographical coverage field
Then I verify 'NICK FUND' project of investor is displayed
And I verify 'Sheryl FUND' project of deal sponsor is displayed
When I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Fund' of money search
And I click on 'View Search Results' button
When I click on fund strategy
And I click on asset type field of money search
And I select office in the asset type drop down list
Then I verify 'NICK FUND' project of investor is displayed
And I verify 'Sheryl FUND' project of deal sponsor is displayed
When I click on asset type field of money search
And I clear asset type drop down
And I click on asset type field of money search
And I select a asset type office in drop down list
Then I verify 'LAVEN FUND' project of investor is displayed
And I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on asset type field of money search
And I click on multifamily option in asset type
Then I verify 'LAVEN FUND' project of investor is displayed
And I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on asset type field of money search
And I click on hotel option in asset type
Then I verify 'LAVEN FUND' project of investor is displayed
And I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on asset type field of money search
And I click on sports option in asset type
Then I verify 'LAVEN FUND' project of investor is displayed
And I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on asset type field of money search
And I click on health care option in asset type
Then I verify 'LAVEN FUND' project of investor is displayed
And I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on asset type field of money search
And I click on storage option in asset type
Then I verify 'LAVEN FUND' project of investor is displayed
And I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on asset type field of money search
And I click on other option in asset type
Then I verify 'LAVEN FUND' project of investor is displayed
And I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on asset type field of money search
And I click on retail option in asset type
Then I verify 'LAVEN FUND' project of investor is displayed
And I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on asset type field of money search
And I click on industrial option in asset type
Then I verify 'LAVEN FUND' project of investor is displayed
And I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on asset type field of money search
And I click on residential option in asset type
Then I verify 'LAVEN FUND' project of investor is displayed
And I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on asset type field of money search
And I click on single option in asset type
Then I verify 'LAVEN FUND' project of investor is displayed
And I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on asset type field of money search
And I click on retirement option in asset type
Then I verify 'LAVEN FUND' project of investor is displayed
And I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on asset type field of money search
And I click on student option in asset type
Then I verify 'LAVEN FUND' project of investor is displayed
And I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on asset type field of money search
And I click on other housing option in asset type
Then I verify 'LAVEN FUND' project of investor is displayed
And I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on asset type field of money search
And I click on residential multi family option in asset type
Then I verify 'LAVEN FUND' project of investor is displayed
And I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on asset type field of money search
And I clear residential of asset field
And I click on asset type field of money search
And I click on mixed use option in asset type
Then I verify 'LAVEN FUND' project of investor is displayed
And I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on asset type field of money search
And I click on commercial option in asset type
Then I verify 'LAVEN FUND' project of investor is displayed
And I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on asset type field of money search
And I click on solar option in asset type
Then I verify 'LAVEN FUND' project of investor is displayed
And I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on asset type field of money search
And I click on all option in asset type
Then I verify 'LAVEN FUND' project of investor is displayed
And I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on asset type field of money search
And I clear all option in asset type
And I click on 'RiskProfile' drop down field
And I select core option in risk profile drop down
Then I verify 'NICK FUND' project of investor is displayed
And I verify 'Sheryl FUND' project of deal sponsor is displayed
When I click on 'RiskProfile' drop down field
And I clear core in risk profile drop down
And I click on 'RiskProfile' drop down field
And I select a risk profile in drop down list
Then I verify 'LAVEN FUND' project of investor is displayed
And I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on 'RiskProfile' drop down field
And I click on core plus risk profile type
Then I verify 'LAVEN FUND' project of investor is displayed
And I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on 'RiskProfile' drop down field
And I click on value add risk profile type
Then I verify 'LAVEN FUND' project of investor is displayed
And I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on 'RiskProfile' drop down field
And I click on development risk profile type
Then I verify 'LAVEN FUND' project of investor is displayed
And I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on 'RiskProfile' drop down field
And I click on opportunistic risk profile type
Then I verify 'LAVEN FUND' project of investor is displayed
And I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on 'RiskProfile' drop down field
And I click on other option of risk profile type
Then I verify 'LAVEN FUND' project of investor is displayed
And I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on 'RiskProfile' drop down field
And I click all option in risk profile type
Then I verify 'LAVEN FUND' project of investor is displayed
And I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on 'RiskProfile' drop down field
And I clear risk profile
And I click asset strategy field in money search
And I select acquisition option in a strategy field of drop down list
Then I verify 'NICK FUND' project of investor is displayed
And I verify 'Sheryl FUND' project of deal sponsor is displayed
When I click asset strategy field in money search
And I clear acquisition option in a strategy field of drop down list
And I click asset strategy field in money search
And I select acquisition option in a strategy field of drop down list
Then I verify 'LAVEN FUND' project of investor is displayed
And I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click asset strategy field in money search
And I clear acquisition option in a strategy field of drop down list
And I click asset strategy field in money search
And I click on sale leaseback option in strategy
Then I verify 'LAVEN FUND' project of investor is displayed
And I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click asset strategy field in money search
And I click on stable income producing option in strategy
Then I verify 'LAVEN FUND' project of investor is displayed
And I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click asset strategy field in money search
And I click on quick flip option in strategy
Then I verify 'LAVEN FUND' project of investor is displayed
And I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click asset strategy field in money search
And I click on restructuring option in strategy
Then I verify 'LAVEN FUND' project of investor is displayed
And I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click asset strategy field in money search
And I click on recapitalization option in strategy
Then I verify 'LAVEN FUND' project of investor is displayed
And I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click asset strategy field in money search
And I click on land bank option in strategy
Then I verify 'LAVEN FUND' project of investor is displayed
And I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click asset strategy field in money search
And I click on change of use option in strategy
Then I verify 'LAVEN FUND' project of investor is displayed
And I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click asset strategy field in money search
And I click on development option in strategy
Then I verify 'LAVEN FUND' project of investor is displayed
And I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click asset strategy field in money search
And I click on platform build option in strategy
Then I verify 'LAVEN FUND' project of investor is displayed
And I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click asset strategy field in money search
And I click on pursuit option in strategy
Then I verify 'LAVEN FUND' project of investor is displayed
And I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click asset strategy field in money search
And I click on lease up option in strategy
Then I verify 'LAVEN FUND' project of investor is displayed
And I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click asset strategy field in money search
And I click on work out option in strategy
Then I verify 'LAVEN FUND' project of investor is displayed
And I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click asset strategy field in money search
And I click on restructuring corporate option in strategy
Then I verify 'LAVEN FUND' project of investor is displayed
And I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click asset strategy field in money search
And I click on public to private option in strategy
Then I verify 'LAVEN FUND' project of investor is displayed
And I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click asset strategy field in money search
And I click on rezoning option in strategy
Then I verify 'LAVEN FUND' project of investor is displayed
And I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click asset strategy field in money search
And I click on renovation option in strategy
Then I verify 'LAVEN FUND' project of investor is displayed
And I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click asset strategy field in money search
And I click on forward commitment option in strategy
Then I verify 'LAVEN FUND' project of investor is displayed
And I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click asset strategy field in money search
And I click on others option in strategy
Then I verify 'LAVEN FUND' project of investor is displayed
And I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click asset strategy field in money search
And I click on all option in strategy
Then I verify 'LAVEN FUND' project of investor is displayed
And I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click asset strategy field in money search
And I clear all option in strategy
And I check the syndicating check field
Then I verify 'NICK FUND' project of investor is displayed
When I un check the syndicating check field
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Fund' of money search
And I click on 'View Search Results' button
And I click on target return
And I select COC Percent value in return profile of money search
Then I verify 'NICK FUND' project of investor is displayed
And I verify 'Sheryl FUND' project of deal sponsor is displayed
When I clear COC Percent value in return profile of money search
And I select IRR Percent value in return profile of money search
Then I verify 'NICK FUND' project of investor is displayed
And I verify 'Sheryl FUND' project of deal sponsor is displayed
When I clear IRR Percent value in return profile of money search
And I select ROE Percent value in return profile of money search
Then I verify 'NICK FUND' project of investor is displayed
And I verify 'Sheryl FUND' project of deal sponsor is displayed
When I clear ROE Percent value in return profile of money search
And I select CAP Percent value in return profile of money search
Then I verify 'NICK FUND' project of investor is displayed
And I verify 'Sheryl FUND' project of deal sponsor is displayed
When I clear CAP Percent value in return profile of money search
And I select holding min value in return profile of money search
Then I verify 'NICK FUND' project of investor is displayed
And I verify 'Sheryl FUND' project of deal sponsor is displayed
When I clear holding min value in return profile of money search
And I select holding max value in return profile of money search
Then I verify 'NICK FUND' project of investor is displayed
And I verify 'Sheryl FUND' project of deal sponsor is displayed
When I clear holding max value in return profile of money search
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Fund' of money search
And I click on 'View Search Results' button
And I click on investor characteristics field
And I click on investor type field in investor characteristics
And I select advisor option in investor type drop down
Then I verify 'Sheryl FUND' project of deal sponsor is displayed
When I click on investor type field in investor characteristics
And I clear advisor option in investor type drop down
And I click on investor type field in investor characteristics
And I select broker or intermediary option in investor type drop down
Then I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on investor type field in investor characteristics
And I select consultant option in investor type drop down
Then I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on investor type field in investor characteristics
And I select EB5 program option in investor type drop down
Then I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on investor type field in investor characteristics
And I select family office option in investor type drop down
Then I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on investor type field in investor characteristics
And I select fund of funds option in investor type drop down
Then I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on investor type field in investor characteristics
And I select hedge fund option in investor type drop down
Then I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on investor type field in investor characteristics
And I select individual investor option in investor type drop down
Then I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on investor type field in investor characteristics
And I select investment manager option in investor type drop down
Then I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on investor type field in investor characteristics
And I select NCREIF style trust or fund option in investor type drop down
Then I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on investor type field in investor characteristics
And I select owner operator option in investor type drop down
Then I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on investor type field in investor characteristics
And I select private equity real estate fund option in investor type drop down
Then I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on investor type field in investor characteristics
And I select public REIT option in investor type drop down
Then I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on investor type field in investor characteristics
And I select sovereign wealth fund option in investor type drop down
Then I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on investor type field in investor characteristics
And I select bank option in investor type drop down
Then I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on investor type field in investor characteristics
And I select construction lender or purchaser option in investor type drop down
Then I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on investor type field in investor characteristics
And I select crowd funding platform option in investor type drop down
Then I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on investor type field in investor characteristics
And I select endowment and foundation option in investor type drop down
Then I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on investor type field in investor characteristics
And I select fund option in investor type drop down
Then I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on investor type field in investor characteristics
And I select government agency option in investor type drop down
Then I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on investor type field in investor characteristics
And I select high net worth investor option in investor type drop down
Then I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on investor type field in investor characteristics
And I select insurance company option in investor type drop down
Then I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on investor type field in investor characteristics
And I select mezzanine option in investor type drop down
Then I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on investor type field in investor characteristics
And I select other institutional investor option in investor type drop down
Then I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on investor type field in investor characteristics
And I select pension fund option in investor type drop down
Then I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on investor type field in investor characteristics
And I select private REIT option in investor type drop down
Then I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on investor type field in investor characteristics
And I select senior lender option in investor type drop down
Then I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on investor type field in investor characteristics
And I select special servicer option in investor type drop down
Then I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on investor type field in investor characteristics
And I clear special servicer option in investor type drop down
And I click on investment status field
And I select general partner option in investment status
Then I verify 'Sheryl FUND' project of deal sponsor is displayed
When I click on investment status field
And I clear general partner option in investment status
When I click on investment status field
And I select limited partner option in investment status
Then I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on investment status field
And I select co GP option in investment status
Then I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on investment status field
And I select co developer option in investment status
Then I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on investment status field
And I select co lead option in investment status
Then I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click on investment status field
And I clear co lead option in investment status
And I click route to investor field
And I select direct only option in route to investor
Then I verify 'Sheryl FUND' project of deal sponsor is displayed
When I click route to investor field
And I clear direct only option in route to investor
And I click route to investor field
And I select direct only option in route to investor
Then I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click route to investor field
And I clear direct only option in route to investor
When I click route to investor field
And I select intermediary option in route to investor
Then I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click route to investor field
And I select brokers option in route to investor
Then I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click route to investor field
And I clear brokers option in route to investor
And I click route to investor field
And I select placement agent option in route to investor
Then I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click route to investor field
And I clear placement agent option in route to investor
And I click route to investor field
And I select all option in route to investor
Then I verify 'ANDREW FUND' project of deal sponsor is displayed
When I click route to investor field
And I clear all option in route to investor
And I logout from RealConnex application

