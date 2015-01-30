Meta:
@storyType BQS

Narrative:
As a user
I verify companies of deal sponsor user who have selected "Deal Sponsor","Developer" are retrieved when deal sponsor search is performed.

Scenario: TC 138403: Verify companies of Deal Sponsor,Developer are displayed when search is performed
When I update TestCaseId 138403
When I update TestCaseName Perform: "Developer, Deal Sponsor >> Deal Sponsor, Developer" search Verify that companies of "Deal Sponsor", "Developer" sub role are retrieved.
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Developer,Deal Sponsor' link
And I select 'Developer','DealSponsor' link
And I click on 'View Search Results' button
Then I should see 'Developers, Deal Sponsors' as find in search option
And I should see 'Developer, Deal Sponsor' as sub role in search option
And I should see 'Sterling' company name of deal sponsor
When I click on company name of deal sponsor
And I return back to the searched page
Then I verify 'Developer' company name is displayed
When I click on Developer company name
And I return back to the searched page
And I set value for average deal size
Then I verify company name of deal sponsor
And I verify company name of developer
When I clear value for average deal size
And I set value for year in business
Then I verify company name of deal sponsor
And I verify company name of developer
When I clear value for year in business
And I set value for number of professionals
Then I verify company name of deal sponsor
And I verify company name of developer
When I clear value for number of professionals
When I set value for sq ft developed
Then I verify company name of deal sponsor
And I verify company name of developer
When I clear value for sq ft developed
And I set value of deals completed
Then I verify company name of deal sponsor
And I verify company name of developer
When I clear value of deals completed
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Developer,Deal Sponsor' link
And I select 'Developer','DealSponsor' link
And I click on 'View Search Results' button
And I click on 'Route to Sponsor' drop down field
And I select direct only option in route to sponsor drop down list
Then I verify company name of deal sponsor
When I click on 'Route to Sponsor' drop down field
And I clear route to sponsor drop down
And I click on 'Route to Sponsor' drop down field
And I select placement agents in route to sponsor drop down
Then I verify company name of developer
When I click on 'Route to Sponsor' drop down field
And I clear route to sponsor drop down of search
When I click on 'Route to Sponsor' drop down field
And I select a route to sponsor in drop down list
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Route to Sponsor' drop down field
And I click on intermediary option in route to sponsor
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Route to Sponsor' drop down field
And I click on brokers option in route to sponsor
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Route to Sponsor' drop down field
And I click on placement agents option in route to sponsor
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Route to Sponsor' drop down field
And I select all option in route to sponsor
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Route to Sponsor' drop down field
And I clear route to sponsor option
And I click on asset experience field
And I click on asset type field in asset experience
And I select office in the asset type drop down list
Then I verify company name of deal sponsor
When I click on asset type field in asset experience
And I clear asset type drop down
And I click on asset type field in asset experience
And I select solar option in the asset drop down list
Then I verify company name of developer
When I click on asset type field in asset experience
And I clear asset option in asset type field
And I click on asset type field in asset experience
And I select a asset type office in drop down list
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on asset type field in asset experience
And I click on multifamily option in asset type
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on asset type field in asset experience
And I click on hotel option in asset type
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on asset type field in asset experience
And I click on sports option in asset type
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on asset type field in asset experience
And I click on health care option in asset type
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on asset type field in asset experience
And I click on storage option in asset type
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on asset type field in asset experience
And I click on other option in asset type
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on asset type field in asset experience
And I click on retail option in asset type
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on asset type field in asset experience
And I click on industrial option in asset type
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on asset type field in asset experience
And I click on residential option in asset type
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on asset type field in asset experience
And I click on single option in asset type
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on asset type field in asset experience
And I click on retirement option in asset type
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on asset type field in asset experience
And I click on student option in asset type
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on asset type field in asset experience
And I click on other housing option in asset type
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on asset type field in asset experience
And I click on residential multi family option in asset type
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on asset type field in asset experience
And I clear residential of asset field
And I click on asset type field in asset experience
And I click on mixed use option in asset type
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on asset type field in asset experience
And I click on commercial option in asset type
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on asset type field in asset experience
And I click on solar option in asset type
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on asset type field in asset experience
And I click on all option in asset type
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on asset type field in asset experience
And I clear all option in asset type
And I click on 'RiskProfile' drop down field
And I select core option in risk profile drop down
Then I verify company name of deal sponsor
When I click on 'RiskProfile' drop down field
And I clear core in risk profile drop down
And I click on 'RiskProfile' drop down field
And I select opportunistic option in risk profile
Then I verify company name of developer
When I click on 'RiskProfile' drop down field
And I clear risk profile field of developer search
And I click on 'RiskProfile' drop down field
And I select a risk profile in drop down list
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on 'RiskProfile' drop down field
And I click on core plus risk profile type
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on 'RiskProfile' drop down field
And I click on value add risk profile type
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on 'RiskProfile' drop down field
And I click on development risk profile type
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on 'RiskProfile' drop down field
And I click on opportunistic risk profile type
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on 'RiskProfile' drop down field
And I click on other option of risk profile type
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on 'RiskProfile' drop down field
And I click all option in risk profile type
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on 'RiskProfile' drop down field
And I clear risk profile
And I click on 'Asset Strategy' drop down field
And I select acquisition option in a strategy field of drop down list
Then I verify company name of deal sponsor
When I click on 'Asset Strategy' drop down field
And I clear acquisition option in a strategy field of drop down list
And I click on 'Asset Strategy' drop down field
And I select sales and leaseback option in strategy drop down
Then I verify company name of developer
When I click on 'Asset Strategy' drop down field
And I clear strategy drop down of developer
And I click on 'Asset Strategy' drop down field
And I select acquisition option in a strategy field of drop down list
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I clear acquisition option in a strategy field of drop down list
And I click on 'Asset Strategy' drop down field
And I click on sale leaseback option in strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on stable income producing option in strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on quick flip option in strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on restructuring option in strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on recapitalization option in strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on land bank option in strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on change of use option in strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on development option in strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on platform build option in strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on pursuit option in strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on lease up option in strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on work out option in strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on restructuring corporate option in strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on public to private option in strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on rezoning option in strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on renovation option in strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on forward commitment option in strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on others option in strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I click on all option in strategy
Then I verify company name of deal sponsor of all search option is displayed
And I verify developer company name of all search option is displayed
When I click on 'Asset Strategy' drop down field
And I clear all option in strategy
And I click on Syndicate check box
Then I verify company name of deal sponsor
And I verify company name of developer
When I un check Syndicate check box
And I select co-invests with partners field
Then I verify company name of deal sponsor
And I verify company name of developer
When I clear co invests with partners field
And I logout from RealConnex application


