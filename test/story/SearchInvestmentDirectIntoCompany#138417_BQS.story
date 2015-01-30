Meta:
@storyType BQS

Narrative:
I verify that companies of user with role deal sponsor but not fund sponsor
are retrieved in "Investment >> Direct Into Project" search

Scenario: TC 138417 : Verify company of deal sponsor role is retrieved when search is performed
When I update TestCaseId 138417
When I update TestCaseName Perform: "Investment >> Direct Into Project" search Verify that companies of users with role "Deal Sponsor" but not "Fund Sponsor" sub-role are retrieved.
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Investments' link
And I click on 'Direct Into Project' link
And I click on 'Core' link
And I click on 'View Search Results' button
Then I should see 'Investments' in find of search option
And I verify kind in search option
And I verify risk in search option
When I click on investment direct into company
And I return back to the searched page
And I select the value in deal size
Then I verify the company name of investment direct into is displayed
When I clear value in deal size
And I click on investor type field
And I select advisor option in investor type field
Then I verify the company name of investment direct into is displayed
When I click on investor type field
And I clear advisor option in investor type field
And I click on investor type field
And I select broker or intermediary option in investor type
Then I verify 'Andrew Company' company name of investments is displayed
When I click on investor type field
And I select consultant option in investor type
Then I verify 'Andrew Company' company name of investments is displayed
When I click on investor type field
And I select EB5 program option in investor type
Then I verify 'Andrew Company' company name of investments is displayed
When I click on investor type field
And I select family office option in investor type
Then I verify 'Andrew Company' company name of investments is displayed
When I click on investor type field
And I select fund of funds option in investor type
Then I verify 'Andrew Company' company name of investments is displayed
When I click on investor type field
And I select hedge fund option in investor type
Then I verify 'Andrew Company' company name of investments is displayed
When I click on investor type field
And I select individual investor option in investor type
Then I verify 'Andrew Company' company name of investments is displayed
When I click on investor type field
And I select investment manager option in investor type
Then I verify 'Andrew Company' company name of investments is displayed
When I click on investor type field
And I select NCREIF style trust or fund option in investor type
Then I verify 'Andrew Company' company name of investments is displayed
When I click on investor type field
And I select owner operator option in investor type
Then I verify 'Andrew Company' company name of investments is displayed
When I click on investor type field
And I select private equity real estate fund option in investor type
Then I verify 'Andrew Company' company name of investments is displayed
When I click on investor type field
And I select public REIT option in investor type
Then I verify 'Andrew Company' company name of investments is displayed
When I click on investor type field
And I select sovereign wealth fund option in investor type
Then I verify 'Andrew Company' company name of investments is displayed
When I click on investor type field
And I select bank option in investor type
Then I verify 'Andrew Company' company name of investments is displayed
When I click on investor type field
And I select construction lender or purchaser option in investor type
Then I verify 'Andrew Company' company name of investments is displayed
When I click on investor type field
And I select crowd funding platform option in investor type
Then I verify 'Andrew Company' company name of investments is displayed
When I click on investor type field
And I select endowment and foundation option in investor type
Then I verify 'Andrew Company' company name of investments is displayed
When I click on investor type field
And I select fund option in investor type
Then I verify 'Andrew Company' company name of investments is displayed
When I click on investor type field
And I select government agency option in investor type
Then I verify 'Andrew Company' company name of investments is displayed
When I click on investor type field
And I select high net worth investor option in investor type
Then I verify 'Andrew Company' company name of investments is displayed
When I click on investor type field
And I select insurance company option in investor type
Then I verify 'Andrew Company' company name of investments is displayed
When I click on investor type field
And I select mezzanine option in investor type
Then I verify 'Andrew Company' company name of investments is displayed
When I click on investor type field
And I select other institutional investor option in investor type
Then I verify 'Andrew Company' company name of investments is displayed
When I click on investor type field
And I select pension fund option in investor type
Then I verify 'Andrew Company' company name of investments is displayed
When I click on investor type field
And I select private REIT option in investor type
Then I verify 'Andrew Company' company name of investments is displayed
When I click on investor type field
And I select senior lender option in investor type
Then I verify 'Andrew Company' company name of investments is displayed
When I click on investor type field
And I select special servicer option in investor type
Then I verify 'Andrew Company' company name of investments is displayed
When I click on investor type field
And I select all option in investor type
Then I verify 'Andrew Company' company name of investments is displayed
When I click on investor type field
And I clear all option in investor type
And I click route to sponsor field
And I select direct only option in route to sponsor drop down
Then I verify the company name of investment direct into is displayed
When I click route to sponsor field
And I clear direct only option in route to sponsor drop down
When I click route to sponsor field
And I select intermediary option in route to sponsor
Then I verify 'Andrew Company' company name of investments is displayed
When I click route to sponsor field
And I select placement agent option in route to sponsor
Then I verify 'Andrew Company' company name of investments is displayed
When I click route to sponsor field
And I select all option in route to sponsor of investment search
Then I verify 'Andrew Company' company name of investments is displayed
When I click route to sponsor field
And I clear all option option in route to sponsor
And I click on asset interest
And I click on asset type field in investment direct into search
And I select a asset type office in investment direct into search
Then I verify the company name of investment direct into is displayed
When I click on asset type field in investment direct into search
And I clear asset type drop down in investment direct into search
And I click on asset type field in investment direct into search
And I select a asset type office in investment direct into search
Then I verify 'Andrew Company' company name of investments is displayed
When I click on asset type field in investment direct into search
And I click on multifamily option in asset type of investment direct into search
Then I verify 'Andrew Company' company name of investments is displayed
When I click on asset type field in investment direct into search
And I click on hotel option in asset type of investment direct into search
Then I verify 'Andrew Company' company name of investments is displayed
When I click on asset type field in investment direct into search
And I click on sports option in asset type of investment direct into search
Then I verify 'Andrew Company' company name of investments is displayed
When I click on asset type field in investment direct into search
And I click on health care option in asset type of investment direct into search
Then I verify 'Andrew Company' company name of investments is displayed
When I click on asset type field in investment direct into search
And I click on storage option in asset type of investment direct into search
Then I verify 'Andrew Company' company name of investments is displayed
When I click on asset type field in investment direct into search
And I click on other option in asset type of investment direct into search
Then I verify 'Andrew Company' company name of investments is displayed
When I click on asset type field in investment direct into search
And I click on retail option in asset type of investment direct into search
Then I verify 'Andrew Company' company name of investments is displayed
When I click on asset type field in investment direct into search
And I click on industrial option in asset type of investment direct into search
Then I verify 'Andrew Company' company name of investments is displayed
When I click on asset type field in investment direct into search
And I click on residential option in asset type of investment direct into search
Then I verify 'Andrew Company' company name of investments is displayed
When I click on asset type field in investment direct into search
And I click on single option in asset type of investment direct into search
Then I verify 'Andrew Company' company name of investments is displayed
When I click on asset type field in investment direct into search
And I click on retirement option in asset type of investment direct into search
Then I verify 'Andrew Company' company name of investments is displayed
When I click on asset type field in investment direct into search
And I click on student option in asset type of investment direct into search
Then I verify 'Andrew Company' company name of investments is displayed
When I click on asset type field in investment direct into search
And I click on other housing option in asset type of investment direct into search
Then I verify 'Andrew Company' company name of investments is displayed
When I click on asset type field in investment direct into search
And I click on residential multi family option in asset type of investment direct into search
Then I verify 'Andrew Company' company name of investments is displayed
When I click on asset type field in investment direct into search
And I clear residential of asset field of investment direct into search
And I click on asset type field in investment direct into search
And I click on mixed use option in asset type of investment direct into search
Then I verify 'Andrew Company' company name of investments is displayed
When I click on asset type field in investment direct into search
And I click on commercial option in asset type of investment direct into search
Then I verify 'Andrew Company' company name of investments is displayed
When I click on asset type field in investment direct into search
And I click on solar option in asset type of investment direct into search
Then I verify 'Andrew Company' company name of investments is displayed
When I click on asset type field in investment direct into search
And I click on all option in asset type of investment direct into search
Then I verify 'Andrew Company' company name of investments is displayed
When I click on asset type field in investment direct into search
And I clear all option in asset type of investment direct into search
And I click on 'RiskProfile' drop down field in investment direct into project
And I select core option in risk profile drop down of investment direct into project
Then I verify the company name of investment direct into is displayed
When I click on 'RiskProfile' drop down field in investment direct into project
And I clear core in risk profile drop down of investment direct into project
And I click on 'RiskProfile' drop down field in investment direct into project
And I select core option in risk profile drop down of investment direct into project
Then I verify 'Andrew Company' company name of investments is displayed
When I click on 'RiskProfile' drop down field in investment direct into project
And I click on core plus risk profile type of investment direct into project
Then I verify 'Andrew Company' company name of investments is displayed
When I click on 'RiskProfile' drop down field in investment direct into project
And I click on value add risk profile type of investment direct into project
Then I verify 'Andrew Company' company name of investments is displayed
When I click on 'RiskProfile' drop down field in investment direct into project
And I click on development risk profile type of investment direct into project
Then I verify 'Andrew Company' company name of investments is displayed
When I click on 'RiskProfile' drop down field in investment direct into project
And I click on opportunistic risk profile type  of investment direct into project
Then I verify 'Andrew Company' company name of investments is displayed
When I click on 'RiskProfile' drop down field in investment direct into project
And I click on other option of risk profile type of investment direct into project
Then I verify 'Andrew Company' company name of investments is displayed
When I click on 'RiskProfile' drop down field in investment direct into project
And I click all option in risk profile type of investment direct into project
Then I verify 'Andrew Company' company name of investments is displayed
When I click on 'RiskProfile' drop down field in investment direct into project
And I clear risk profile of investment direct into project
And I click on deal stage drop down field
And I select owned option in deal stage drop down field
Then I verify the company name of investment direct into is displayed
When I click on deal stage drop down field
And I clear owned option in deal stage drop down field
And I click on deal stage drop down field
And I click on concept option in deal stage drop down
Then I verify 'Andrew Company' company name of investments is displayed
When I click on deal stage drop down field
And I click on permitted option in deal stage drop down
Then I verify 'Andrew Company' company name of investments is displayed
When I click on deal stage drop down field
And I click on ready for purchase option in deal stage drop down
Then I verify 'Andrew Company' company name of investments is displayed
When I click on deal stage drop down field
And I click on LOI option in deal stage drop down
Then I verify 'Andrew Company' company name of investments is displayed
When I click on deal stage drop down field
And I click on under contract option in deal stage drop down
Then I verify 'Andrew Company' company name of investments is displayed
When I click on deal stage drop down field
And I click on plans option in deal stage drop down
Then I verify 'Andrew Company' company name of investments is displayed
When I click on deal stage drop down field
And I click on under construction option in deal stage drop down
Then I verify 'Andrew Company' company name of investments is displayed
When I click on deal stage drop down field
And I click on pursuit option in deal stage drop down
Then I verify 'Andrew Company' company name of investments is displayed
When I click on deal stage drop down field
And I click on in DD option in deal stage drop down
Then I verify 'Andrew Company' company name of investments is displayed
When I click on deal stage drop down field
And I select all option in deal stage drop down
Then I verify 'Andrew Company' company name of investments is displayed
When I click on deal stage drop down field
And I clear all field in deal stage
And I click on asset strategy drop down
And I select acquisition option in asset strategy field
Then I verify the company name of investment direct into is displayed
When I click on asset strategy drop down
And I clear acquisition option in asset strategy field
And I click on asset strategy drop down
And I select acquisition option in asset strategy field
Then I verify 'Andrew Company' company name of investments is displayed
When I click on asset strategy drop down
And I clear acquisition option in asset strategy field
And I click on asset strategy drop down
And I click on sale leaseback option in strategy of investment direct into search
Then I verify 'Andrew Company' company name of investments is displayed
When I click on asset strategy drop down
And I click on stable income producing option in strategy of investment direct into search
Then I verify 'Andrew Company' company name of investments is displayed
When I click on asset strategy drop down
And I click on quick flip option in strategy of investment direct into search
Then I verify 'Andrew Company' company name of investments is displayed
When I click on asset strategy drop down
And I click on restructuring option in strategy of investment direct into search
Then I verify 'Andrew Company' company name of investments is displayed
When I click on asset strategy drop down
And I click on recapitalization option in strategy of investment direct into search
Then I verify 'Andrew Company' company name of investments is displayed
When I click on asset strategy drop down
And I click on land bank option in strategy of investment direct into search
Then I verify 'Andrew Company' company name of investments is displayed
When I click on asset strategy drop down
And I click on change of use option in strategy of investment direct into search
Then I verify 'Andrew Company' company name of investments is displayed
When I click on asset strategy drop down
And I click on development option in strategy of investment direct into search
Then I verify 'Andrew Company' company name of investments is displayed
When I click on asset strategy drop down
And I click on platform build option in strategy of investment direct into search
Then I verify 'Andrew Company' company name of investments is displayed
When I click on asset strategy drop down
And I click on pursuit option in strategy of investment direct into search
Then I verify 'Andrew Company' company name of investments is displayed
When I click on asset strategy drop down
And I click on lease up option in strategy of investment direct into search
Then I verify 'Andrew Company' company name of investments is displayed
When I click on asset strategy drop down
And I click on work out option in strategy of investment direct into search
Then I verify 'Andrew Company' company name of investments is displayed
When I click on asset strategy drop down
And I click on restructuring corporate option in strategy of investment direct into search
Then I verify 'Andrew Company' company name of investments is displayed
When I click on asset strategy drop down
And I click on public to private option in strategy of investment direct into search
Then I verify 'Andrew Company' company name of investments is displayed
When I click on asset strategy drop down
And I click on rezoning option in strategy of investment direct into search
Then I verify 'Andrew Company' company name of investments is displayed
When I click on asset strategy drop down
And I click on renovation option in strategy of investment direct into search
Then I verify 'Andrew Company' company name of investments is displayed
When I click on asset strategy drop down
And I click on forward commitment option in strategy of investment direct into search
Then I verify 'Andrew Company' company name of investments is displayed
When I click on asset strategy drop down
And I click on others option in strategy of investment direct into search
Then I verify 'Andrew Company' company name of investments is displayed
When I click on asset strategy drop down
And I click on all option in strategy of investment direct into search
Then I verify 'Andrew Company' company name of investments is displayed
When I click on asset strategy drop down
And I clear all option in strategy of investment direct into search
And I check the syndicating check field
Then I verify the company name of investment direct into is displayed
When I un check the syndicating check field
And I click on geographical coverage field in investment search
And I click on countries field in investment search
And I select United States checkbox in countries field of investment search
And I click on region field in investment search
And I click on NorthEast region in investment search
And I click on states field in investment search
And I click on New Jersey state in investment search
And I click on cities field in investment search
And I enter and select Kearny city in investment search
Then I verify the company name of investment direct into is displayed
When I logout from RealConnex application