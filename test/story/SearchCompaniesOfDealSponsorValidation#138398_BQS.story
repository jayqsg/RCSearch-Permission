Meta:
@storyType BQS

Narrative:
As a user
I verify companies other than deal sponsor subrole are not
retrieved when "Developer, Deal Sponsor>>Deal Sponsor" search is performed.

Scenario: TC 138398: Verify companies other than deal sponsor subrole is not retrieved
When I update TestCaseId 138398
When I update TestCaseName Perform: "Developer, Deal Sponsor >> Deal Sponsor" search Verify that companies other than "Deal Sponsor" sub role are not retrieved.
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Developer,Deal Sponsor' link
And I click on 'Deal Sponsor' link
And I click on 'View Search Results' button
Then I should see 'Developers, Deal Sponsors' in find of search option
And I should see sub role as 'Deal Sponsors'
When I set value for average deal size field
Then I verify 'Sterling' company name is not displayed in deal sponsors developers search
When I clear value for average deal size field
And I set value for year in business field
Then I verify 'Sterling' company name is not displayed in deal sponsors developers search
When I clear value for year in business field
And I set value for number of professionals field
Then I verify 'Sterling' company name is not displayed in deal sponsors developers search
When I clear value for number of professionals field
And I set value for project completed field
Then I verify 'Sterling' company name is not displayed in deal sponsors developers search
When I clear value for project completed field
And I set value for sq ft developed field
Then I verify 'Sterling' company name is not displayed in deal sponsors developers search
When I clear value for sq ft developed field
And I set value of deals completed field
Then I verify 'Sterling' company name is not displayed in deal sponsors developers search
When I clear value of deals completed field
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Developer,Deal Sponsor' link
And I click on 'Deal Sponsor' link
And I click on 'View Search Results' button
When I click on 'Route to Sponsor' drop down field
And I select direct only option in route to sponsor drop down list
Then I verify deal sponsor company selected 'Intermediary' option is not displayed
When I click on 'Route to Sponsor' drop down field
And I clear route to sponsor drop down
And I click on geographical coverage field
And I click on countries field
And I select United States checkbox in countries field
And I click on region field
And I click on Southwest region
And I click on states field
And I click on Texas state
And I click on cities field
And I enter and select Massa city
Then I verify 'Camp Co' company name is not displayed in deal sponsors developers search
When I click on 'RCMP MarketPlace' button
And I click on 'Developer,Deal Sponsor' link
And I click on 'Deal Sponsor' link
And I click on 'View Search Results' button
And I click on asset experience
And I click on asset type field of deal sponsor search
And I select office in the asset type drop down list
Then I verify deal sponsor company selected 'Hotel' option is not displayed
When I click on asset type field of deal sponsor search
And I clear asset type drop down
And I click on 'RiskProfile' drop down field
And I select a risk profile in drop down list
Then I verify deal sponsor company selected 'Core Plus' option is not displayed
When I click on 'RiskProfile' drop down field
And I clear core in risk profile drop down
And I click on 'Asset Strategy' drop down field
And I select acquisition option in a strategy field of drop down list
Then I verify deal sponsor company selected 'Lease-Up' option is not displayed
When I click on 'Asset Strategy' drop down field
And I clear acquisition option in a strategy field of drop down list
And I click on Syndicate check box
Then I verify 'Sterling' company name is displayed in deal sponsors developers search
And I verify 'Camp Co' company name is not displayed in deal sponsors developers search
When I un check Syndicate check box
And I select co-invests with partners field
Then I verify 'Camp Co' company name is not displayed in deal sponsors developers search
When I clear co invests with partners field
And I logout from RealConnex application
