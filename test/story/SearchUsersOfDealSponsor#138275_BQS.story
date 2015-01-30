Meta:
@storyType BQS

Narrative:
As a user
I Verify users of "Deal Sponsor" sub-role are retrieved when
"Developer/Deal Sponsor>>Deal Sponsor" search is performed.

Scenario: TC 138275: Verify deal sponsors are displayed when search is performed
When I update TestCaseId 138275
When I update TestCaseName Search Users Of Deal Sponsor
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
And I should see 'Marylin Joe' deal sponsor user name is displayed
When I click on verified deal sponsor user name
And I return back to the searched page
And I click on geographical coverage field
And I click on countries field
And I select United States checkbox in countries field
And I click on region field
And I click on Southwest region
And I click on states field
And I click on Texas state
And I click on cities field
And I enter and select Massa city
And I click on geographical coverage field
Then I verify 'Marylin Joe' deal sponsor user name is displayed
When I click on 'RCMP MarketPlace' button
And I click on 'Developer,Deal Sponsor' link
And I click on 'Deal Sponsor' link
And I click on 'View Search Results' button
Then I should see 'Developers, Deal Sponsors' in find of search option
And I should see sub role as 'Deal Sponsors'
When I click on asset experience
And I click on 'Asset Strategy' drop down field
And I select acquisition option in a strategy field of drop down list
Then I verify 'Marylin Joe' deal sponsor user name is displayed
When I click on 'Asset Strategy' drop down field
And I clear acquisition option in a strategy field of drop down list
And I click on 'Asset Strategy' drop down field
And I select acquisition option in a strategy field of drop down list
Then I verify deal sponsor user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I clear acquisition option in a strategy field of drop down list
And I click on 'Asset Strategy' drop down field
And I click on sale leaseback option in strategy
Then I verify deal sponsor user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on stable income producing option in strategy
Then I verify deal sponsor user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on quick flip option in strategy
Then I verify deal sponsor user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on restructuring option in strategy
Then I verify deal sponsor user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on recapitalization option in strategy
Then I verify deal sponsor user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on land bank option in strategy
Then I verify deal sponsor user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on change of use option in strategy
Then I verify deal sponsor user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on development option in strategy
Then I verify deal sponsor user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on platform build option in strategy
Then I verify deal sponsor user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on pursuit option in strategy
Then I verify deal sponsor user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on lease up option in strategy
Then I verify deal sponsor user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on work out option in strategy
Then I verify deal sponsor user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on restructuring corporate option in strategy
Then I verify deal sponsor user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on public to private option in strategy
Then I verify deal sponsor user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on rezoning option in strategy
Then I verify deal sponsor user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on renovation option in strategy
Then I verify deal sponsor user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on forward commitment option in strategy
Then I verify deal sponsor user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on others option in strategy
Then I verify deal sponsor user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I click on all option in strategy
Then I verify deal sponsor user of all option is displayed
When I click on 'Asset Strategy' drop down field
And I clear all option in strategy
And I logout from RealConnex application















