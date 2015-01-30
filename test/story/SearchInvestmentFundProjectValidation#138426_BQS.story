Meta:
@storyType BQS

Narrative:
As a user
I verify that projects other than Deal Sponsor "Fund" and Investor "Fund" projects
are not retrieved in "Investment >> Fund/Fund of Funds" search

Scenario: TC 138426 : Verify project other than deal sponsor fund and investor fund are not retrieved when search is performed
When I update TestCaseId 138426
When I update TestCaseName Perform: "Investment >> Fund/Fund of Funds" search Verify that Projects other than Deal Sponsor "Fund" and Investor "Fund" projects are not retrieved.
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
When I click on fund of deal sponsor
And I return back to the searched page
And I set value for fund size field
Then I verify 'Monsoon Heights' of investment fund is not displayed
When I clear value for fund size field
And I set the value of investment amount
Then I verify 'Monsoon Heights' of investment fund is not displayed
When I clear the value of investment amount
And I click on 'RCMP MarketPlace' button
And I click on 'Investments' link
And I click on 'Fund' link
And I click on 'Core' in fund link
And I click on 'View Search Results' button
When I click investing as drop down field
And I select co developer option in investing as drop down field
Then I verify 'Pantaloons' of investment fund is not displayed
When I click investing as drop down field
And I clear co developer option in investing as drop down field
And I click on route to investment field
And I select intermediary option in route to investment field
Then I verify 'Pantaloons' of investment fund is not displayed
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
Then I verify 'Pantaloons' of investment fund is not displayed
When I click on 'RCMP MarketPlace' button
And I click on 'Investments' link
And I click on 'Fund' link
And I click on 'Core' in fund link
And I click on 'View Search Results' button
And I click on fund strategy
And I click on asset type field of investment fund search
And I select solar option of asset type
Then I verify 'Pantaloons' of investment fund is not displayed
When I click on asset type field of investment fund search
And I clear on solar option of asset type
And I click on 'RiskProfile' drop down field
And I select core plus option in risk profile of investment fund search
Then I verify 'Monsoon Heights' of investment fund is not displayed
When I click on 'RiskProfile' drop down field
And I clear core plus option in risk profile of investment fund search
And I click on 'Asset Strategy' drop down field
And I select rezoning option in asset strategy
Then I verify 'Pantaloons' of investment fund is not displayed
When I click on 'Asset Strategy' drop down field
And I clear rezoning option in asset strategy
And I select In House Sponsors
Then I verify 'Pantaloons' of investment fund is not displayed
When I clear In House Sponsors
And I select Co-Invest with Operating Partners
Then I verify 'Pantaloons' of investment fund is not displayed
When I clear Co-Invest with Operating Partners
And I check syndicators type check box
Then I verify 'Beta' fund name of investor is not displayed
When I un check syndicators type check box
And I click on target return
And I select COC percent value in return profile field
Then I verify 'Monsoon Heights' of investment fund is not displayed
When I clear COC percent value in return profile field
And I select IRR percent in return profile
Then I verify 'Monsoon Heights' of investment fund is not displayed
When I clear IRR percent in return profile
And I select ROE percent in return profile
Then I verify 'Monsoon Heights' of investment fund is not displayed
When I clear ROE percent in return profile
And I select CAP percent in return profile
Then I verify 'Monsoon Heights' of investment fund is not displayed
When I clear CAP percent in return profile
And I select holding min in return profile
Then I verify 'Monsoon Heights' of investment fund is not displayed
When I clear holding min in return profile
And I select holding max in return profile
Then I verify 'Monsoon Heights' of investment fund is not displayed
When I clear holding max in return profile
And I click on fund experience
And I set values for manager experience field
Then I verify fund name of deal sponsor 'Monsoon Heights' is not displayed
When I clear values for manager experience field
And I set value for average returns over 1 year field
Then I verify fund name of deal sponsor 'Monsoon Heights' is not displayed
When I clear value for average returns over 1 year field
And I set value for average returns over 3 year field
Then I verify fund name of deal sponsor 'Monsoon Heights' is not displayed
When I clear value for average returns over 3 year field
And I set value for average returns over 5 year field
Then I verify fund name of deal sponsor 'Monsoon Heights' is not displayed
When I clear value for average returns over 5 year field
And I logout from RealConnex application









