Meta:
@storyType BQS

Narrative:
As a user
I verify that companies of user other than "Investor" role
are not retrieved in "Investment >> Fund/Fund of Funds" search

Scenario: TC 138423 : Verify that companies other than investor role are not retrieved.
When I update TestCaseId 138423
When I update TestCaseName Perform: "Investment >> Fund/Fund of Funds" search Verify that companies of users other than "Investor" role are not retrieved.
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
And I verify 'Jupiter' company name of investments fund is not displayed
When I click investing as drop down field
And I clear co developer option in investing as drop down field
And I click on route to investment field
And I select intermediary option in route to investment field
Then I verify 'NEPTUNE' company name of investments fund is displayed
And I verify 'Jupiter' company name of investments fund is not displayed
When I click on route to investment field
And I clear intermediary option in route to investment field
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
Then I verify 'Jupiter' company name of investments fund is not displayed
When I click on 'RCMP MarketPlace' button
And I click on 'Investments' link
And I click on 'Fund' link
And I click on 'Core' in fund link
And I click on 'View Search Results' button
And I click on fund strategy
And I click on asset type field of investment fund search
And I select solar option of asset type
Then I verify 'NEPTUNE' company name of investments fund is displayed
And I verify 'Jupiter' company name of investments fund is not displayed
When I click on asset type field of investment fund search
And I clear on solar option of asset type
And I click on 'RiskProfile' drop down field
And I select core option in risk profile drop down
Then I verify 'NEPTUNE' company name of investments fund is displayed
And I verify 'Jupiter' company name of investments fund is displayed
When I click on 'RiskProfile' drop down field
And I clear core in risk profile drop down
And I click on 'RiskProfile' drop down field
And I select core plus option in risk profile of investment fund search
Then I verify 'NEPTUNE' company name of investments fund is not displayed
And I verify 'Jupiter' company name of investments fund is displayed
When I click on 'RiskProfile' drop down field
And I clear core plus option in risk profile of investment fund search
And I click on 'Asset Strategy' drop down field
And I select rezoning option in asset strategy
Then I verify 'NEPTUNE' company name of investments fund is displayed
And I verify 'Jupiter' company name of investments fund is not displayed
When I click on 'Asset Strategy' drop down field
And I clear rezoning option in asset strategy
And I check syndicators type check box
Then I verify 'Jupiter' company name of investments fund is not displayed
When I un check syndicators type check box
And I logout from RealConnex application






