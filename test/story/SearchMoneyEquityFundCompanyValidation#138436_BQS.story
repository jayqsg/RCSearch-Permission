Meta:
@storyType BQS

Narrative:
As a user
I Verify that companies of users other than "Investor" role are
retrieved in "Money >> Equity" search

Scenario: TC 138436 : Verify that companies of user other than investor role are retrieved
When I update TestCaseId 138436
When I update TestCaseName Perform: "Money >> Equity" search Verify that companies of users other than "Investor" role are not retrieved.
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
When I click on geographical coverage field
And I click on countries field
And I select United States checkbox in countries field
And I click on region field
And I click on West region
And I click on states field
And I click on California state
And I click on cities field
And I enter and select San Francisco city
Then I verify 'Gibb COMP' company name in money fund search is not displayed
When I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Equity' link
And I click on 'Fund' of money search
And I click on 'View Search Results' button
When I click on fund strategy
And I click on asset type field of money search
And I select office in the asset type drop down list
Then I verify 'NEEL' company name in money fund search is displayed
And I verify 'Gibb COMP' company name in money fund search is not displayed
When I click on asset type field of money search
And I clear asset type drop down
And I click on 'RiskProfile' drop down field
And I select core option in risk profile drop down
Then I verify 'NEEL' company name in money fund search is displayed
And I verify 'Gibb COMP' company name in money fund search is not displayed
When I click on 'RiskProfile' drop down field
And I select core and core plus in risk profile
Then I verify 'NEEL' company name in money fund search is displayed
And I verify 'Gibb COMP' company name in money fund search is displayed
When I click on 'RiskProfile' drop down field
And I clear risk profile field in money search
And I click asset strategy field in money search
And I select acquisition option in a strategy field of drop down list
Then I verify 'NEEL' company name in money fund search is displayed
And I verify 'Gibb COMP' company name in money fund search is not displayed
When I click asset strategy field in money search
And I clear acquisition option in a strategy field of drop down list
And I check the syndicating check field
Then I verify 'NEEL' company name in money fund search is displayed
And I verify 'Gibb COMP' company name in money fund search is not displayed
When I un check the syndicating check field
And I click on investor characteristics field
And I click on investor type field in investor characteristics
And I select advisor option in investor type drop down
Then I verify 'NEEL' company name in money fund search is displayed
And I verify 'Gibb COMP' company name in money fund search is not displayed
When I click on investor type field in investor characteristics
And I clear advisor option in investor type drop down
And I logout from RealConnex application



