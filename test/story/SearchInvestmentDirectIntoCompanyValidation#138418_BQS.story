Meta:
@storyType BQS

Narrative:
As a user
I Verify that companies of users other than "Deal Sponsor" role but not "Fund Sponsor" sub-role
are not retrieved when "Investment >> Direct Into Project" search

Scenario: TC 138418: Verify companies of user other than deal sponsor role are not retrieved in investment direct into project search
When I update TestCaseId 138418
When I update TestCaseName Perform: "Investment >> Direct Into Project" search Verify that companies of users other than "Deal Sponsor" role but not "Fund Sponsor" sub-role are not retrieved.
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
When I select the value in deal size
Then I verify 'Patric' company name of investments is not displayed
When I clear value in deal size
When I click on 'RCMP MarketPlace' button
And I click on 'Investments' link
And I click on 'Direct Into Project' link
And I click on 'Core' link
And I click on 'View Search Results' button
And I click on investor type field
And I select advisor option in investor type field
Then I verify investments company name of 'Family Office' option is not displayed
When I click on investor type field
And I clear advisor option in investor type field
And I click route to sponsor field
And I select direct only option in route to sponsor drop down
Then I verify investments company name of 'Brokers' option is not displayed
When I click route to sponsor field
And I clear direct only option in route to sponsor drop down
And I click on asset interest
And I click on asset type field in investment direct into search
And I select a asset type office in investment direct into search
Then I verify investments company name of 'Mixed Use' option is not displayed
When I click on asset type field in investment direct into search
And I clear asset type drop down in investment direct into search
And I click on 'RiskProfile' drop down field in investment direct into project
And I select core option in risk profile drop down of investment direct into project
Then I verify investments company name of 'CorePlus' option is displayed
When I click on 'RiskProfile' drop down field in investment direct into project
And I clear core in risk profile drop down of investment direct into project
And I click on 'RiskProfile' drop down field in investment direct into project
And I select core plus option in risk profile
Then I verify investments company name of 'Core' option is not displayed
When I click on 'RiskProfile' drop down field in investment direct into project
And I clear core plus option in risk profile
And I click on deal stage drop down field
And I select owned option in deal stage drop down field
Then I verify investments company name of 'Ready for Purchase' option is not displayed
When I click on deal stage drop down field
And I clear owned option in deal stage drop down field
And I click on asset strategy drop down
And I select acquisition option in asset strategy field
Then I verify investments company name of 'Sale Leaseback' option is not displayed
When I click on asset strategy drop down
And I clear acquisition option in asset strategy field
And I click on geographical coverage field in investment search
And I click on countries field in investment search
And I select United States checkbox in countries field of investment search
And I click on region field in investment search
And I click on NorthEast region in investment search
And I click on states field in investment search
And I click on New Jersey state in investment search
And I click on cities field in investment search
And I enter and select Kearny city in investment search
Then I verify 'Patric' company name of investments is not displayed
When I logout from RealConnex application


