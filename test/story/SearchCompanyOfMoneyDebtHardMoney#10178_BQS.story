Meta:
@storyType BQS

Narrative:
As a deal sponsor user
I verify that company of lender is displayed in Money>>Debt>>Hard Money search

Scenario: TC 10178: I verify that company of lender is displayed in Money>>Debt>>Hard Money search
When I update TestCaseId 10178
When I update TestCaseName I verify that company of lender is displayed in Money>>Debt>>Hard Money search
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Debt' link
And I click on 'Hard Money' link
Then I should see 'Money' in find of search option
When I set the value in loan amount field
Then I verify 'Angel Company' company name is displayed in money debt hard money search
When I clear the value in loan amount field
And I set the value of LTV field
Then I verify 'Angel Company' company name is displayed in money debt hard money search
When I clear the value of LTV field
And I set the value in term field
Then I verify 'Angel Company' company name is displayed in money debt hard money search
When I clear the value in term field
And I select non recourse option
Then I verify 'Angel Company' company name is displayed in money debt hard money search
When I select any option
And I click loan for field
And I click deal stage in loan for field
And I select under contract option in deal stage field
Then I verify 'Angel Company' company name is displayed in money debt hard money search
When I clear under contract option in deal stage field
And I click asset strategy in loan for field
And I click on platform build option in asset strategy
Then I verify 'Angel Company' company name is displayed in money debt hard money search
When I clear on platform build option in asset strategy
And I click on lender characteristics field
And I click lender profile in lender characteristics field
And I select insurance company option in lender profile
Then I verify 'Angel Company' company name is displayed in money debt hard money search
When I click lender profile in lender characteristics field
And I clear insurance company option in lender profile
And I click on route to lender in lender characteristics field
And I select brokers in route to lender field
Then I verify 'Angel Company' company name is displayed in money debt hard money search
When I click on route to lender in lender characteristics field
And I clear brokers in route to lender field