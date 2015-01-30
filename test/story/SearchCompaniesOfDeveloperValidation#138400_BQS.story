Meta:
@storyType BQS

Narrative:
As a user
I verify companies other than "Developer" sub role are not
retrieved when "Developer/Deal Sponsor>>Developer" search is performed.

Scenario: TC 138400: Verify companies other than developer sub role are not displayed when search is performed
When I update TestCaseId 138400
When I update TestCaseName Perform: "Developer, Deal Sponsor >> Developer" search Verify that companies other than "Developer" sub role are not retrieved.
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Developer,Deal Sponsor' link
And I click on 'Developer' link
And I click on 'View Search Results' button
Then I should see 'Developers, Deal Sponsors' in find of search option
And I should see sub role as 'Developer'
And I verify the 'Developer' name is displayed
When I click on verified developer name
And I return back to the searched page
Then I verify 'Developer' company name is displayed
When I click on Developer company name
And I return back to the searched page
And I set value for average deal size field
Then I verify 'Steele' company name is not displayed in developers search
When I clear value for average deal size field
And I set value for year in business field
Then I verify 'Steele' company name is not displayed in developers search
When I clear value for year in business field
And I set value for number of professionals field
Then I verify 'Steele' company name is not displayed in developers search
When I clear value for number of professionals field
And I set value for project completed field
Then I verify 'Steele' company name is not displayed in developers search
When I clear value for project completed field
And I set value for sq ft developed field
Then I verify 'Steele' company name is not displayed in developers search
When I clear value for sq ft developed field
And I set value of deals completed field
Then I verify 'Steele' company name is not displayed in developers search
When I clear value of deals completed field
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Developer,Deal Sponsor' link
And I click on 'Developer' link
And I click on 'View Search Results' button
And I click on 'Route to Sponsor' drop down field
And I select placement agents in route to sponsor drop down
Then I verify developer company selected 'Brokers' option is not displayed
When I click on 'Route to Sponsor' drop down field
And I clear route to sponsor drop down of search
And I click on geographical coverage field
And I click on countries field
And I select United States checkbox in countries field
And I click on region field
And I click on MidWest region
And I click on states field
And I click on West Virginia state
And I click on cities field
And I enter and select Halo city
And I click on geographical coverage field
Then I verify 'Camp Co' company name is not displayed in deal sponsors developers search
When I click on 'RCMP MarketPlace' button
And I click on 'Developer,Deal Sponsor' link
And I click on 'Developer' link
And I click on 'View Search Results' button
And I click on asset experience
And I click on asset type field of deal sponsor search
And I select solar option in the asset drop down list
Then I verify developer company selected 'Hotel' option is not displayed
When I click on asset type field of deal sponsor search
And I clear asset option in asset type field
And I click on 'RiskProfile' drop down field
And I select opportunistic option in risk profile
Then I verify developer company selected 'Core Plus' option is not displayed
When I click on 'RiskProfile' drop down field
And I clear risk profile field of developer search
And I click on 'Asset Strategy' drop down field
And I select sales and leaseback option in strategy drop down
Then I verify developer company selected 'Lease-Up' option is not displayed
When I click on 'Asset Strategy' drop down field
And I clear strategy drop down of developer
And I click on Syndicate check box
Then I verify 'Camp Co' company name is not displayed in deal sponsors developers search
When I un check Syndicate check box
And I select co-invests with partners field
Then I verify 'Camp Co' company name is not displayed in deal sponsors developers search
When I clear co invests with partners field
And I logout from RealConnex application