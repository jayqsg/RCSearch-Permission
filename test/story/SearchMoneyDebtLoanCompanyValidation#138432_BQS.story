Meta:
@storyType BQS

Narrative:
As a user
I verify that companies of users other than "Lender" role and "Loan" loan
type option selected are not retrieved in "Money>>Debt>>Loans" search

Scenario: TC 138432 : Verify that companies of user other then lender role and loan type option are not retrieved
When I update TestCaseId 138432
When I update TestCaseName Perform: "Money >> Debt >> Loans" search Verify that companies of users other than "Lender" role and "Loan" Loan Type option selected are not retrieved.
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Debt' link
And I click on 'Loans' link
And I click on 'Land Loan' link
And I click on 'View Search Results' button
Then I should see 'Money' in find of money search
And I should see 'Land Loan' in loan of money debt loan search
When I set the value in loan amount
Then I verify 'Pluto' company name is displayed in money debt loan search
And I verify 'SATURN' company name is not displayed in money debt loan search
When I clear the value in loan amount
And I set value for LVT slider
Then I verify 'Pluto' company name is displayed in money debt loan search
And I verify 'SATURN' company name is not displayed in money debt loan search
When I clear value for LVT slider
And I set value in term field
Then I verify 'Pluto' company name is displayed in money debt loan search
And I verify 'SATURN' company name is not displayed in money debt loan search
When I clear value in term field
And I click on geographical coverage field
And I click on countries field
And I select United States checkbox in countries field
And I click on region field
And I click on NorthEast region
And I click on states field
And I click on New York state
And I click on cities field
And I enter and select Buffalo city
Then I verify 'Pluto' company name is not displayed in money debt loan search
When I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Debt' link
And I click on 'Loans' link
And I click on 'Land Loan' link
And I click on 'View Search Results' button
And I click on lender characteristics field
And I click on lender profile in lender characteristics field
And I select insurance company option in lender profile
Then I verify 'SATURN' company name is displayed in money debt loan search
And I verify 'Pluto' company name is not displayed in money debt loan search
When I click on lender profile in lender characteristics field
And I clear insurance company option in lender profile
And I click on route to lender in lender characteristics field
And I select brokers in route to lender field
Then I verify 'SATURN' company name is displayed in money debt loan search
And I verify 'Pluto' company name is not displayed in money debt loan search
When I click on route to lender in lender characteristics field
And I clear brokers in route to lender field
And I logout from RealConnex application