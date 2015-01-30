Meta:
@storyType BQS

Narrative:
As a user
I verify companies other than "Deal Sponsor","Developer" sub role are not retrieved when deal sponsor search is performed.

Scenario: TC 138404: Verify companies other than Deal Sponsor,Developer are not displayed when search is performed
When I update TestCaseId 138404
When I update TestCaseName Perform: "Developer, Deal Sponsor >> Deal Sponsor, Developer" search Verify that companies other than "Deal Sponsor", "Developer" sub roles are not retrieved.
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
And I set value for average deal size field
Then I verify 'Sterling' company name is not displayed in deal sponsors developers search
And I verify 'Steele' company name is not displayed in developers search
When I clear value for average deal size field
And I set value for year in business field
Then I verify 'Sterling' company name is not displayed in deal sponsors developers search
And I verify 'Steele' company name is not displayed in developers search
When I clear value for year in business field
And I set value for number of professionals field
Then I verify 'Sterling' company name is not displayed in deal sponsors developers search
And I verify 'Steele' company name is not displayed in developers search
When I clear value for number of professionals field
And I set value for project completed field
Then I verify 'Sterling' company name is not displayed in deal sponsors developers search
And I verify 'Steele' company name is not displayed in developers search
When I clear value for project completed field
And I set value for sq ft developed field
Then I verify 'Sterling' company name is not displayed in deal sponsors developers search
And I verify 'Steele' company name is not displayed in developers search
When I clear value for sq ft developed field
And I set value of deals completed field
Then I verify 'Sterling' company name is not displayed in deal sponsors developers search
And I verify 'Steele' company name is not displayed in developers search
When I clear value of deals completed field
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Developer,Deal Sponsor' link
And I select 'Developer','DealSponsor' link
And I click on 'View Search Results' button
And I click on 'Route to Sponsor' drop down field
And I select direct only option in route to sponsor drop down list
Then I verify deal sponsor company selected 'Intermediary' option is not displayed
When I click on 'Route to Sponsor' drop down field
And I clear route to sponsor drop down
And I click on 'Route to Sponsor' drop down field
And I select placement agents in route to sponsor drop down
Then I verify developer company selected 'Brokers' option is not displayed
When I click on 'Route to Sponsor' drop down field
And I clear route to sponsor drop down of search
And I click on asset experience
And I click on asset type field of deal sponsor search
And I select office in the asset type drop down list
Then I verify deal sponsor company selected 'Hotel' option is not displayed
When I click on asset type field of deal sponsor search
And I clear asset type drop down
And I click on asset type field of deal sponsor search
And I select solar option in the asset drop down list
Then I verify developer company selected 'Hotel' option is not displayed
When I click on asset type field of deal sponsor search
And I clear asset option in asset type field
And I click on 'RiskProfile' drop down field
And I select a risk profile in drop down list
Then I verify deal sponsor company selected 'Core Plus' option is not displayed
When I click on 'RiskProfile' drop down field
And I clear core in risk profile drop down
And I click on 'RiskProfile' drop down field
And I select opportunistic option in risk profile
Then I verify developer company selected 'Core Plus' option is not displayed
When I click on 'RiskProfile' drop down field
And I clear risk profile field of developer search
And I click on 'Asset Strategy' drop down field
And I select acquisition option in a strategy field of drop down list
Then I verify deal sponsor company selected 'Lease-Up' option is not displayed
When I click on 'Asset Strategy' drop down field
And I clear acquisition option in a strategy field of drop down list
And I click on 'Asset Strategy' drop down field
And I select sales and leaseback option in strategy drop down
Then I verify developer company selected 'Lease-Up' option is not displayed
When I click on 'Asset Strategy' drop down field
And I clear strategy drop down of developer
And I click on Syndicate check box
Then I verify 'Camp Co' company name is not displayed in search
When I un check Syndicate check box
And I select co-invests with partners field
Then I verify 'Camp Co' company name is not displayed in search
When I clear co invests with partners field
And I logout from RealConnex application
