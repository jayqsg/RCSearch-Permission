Meta:
@storyType BQS

Narrative:
As a user
I verify that companies of users with "Lender" role and "Loan" loan
type option selected are retrieved in "Money>>Debt>>Loans" search

Scenario: TC 138431 : Verify that companies of user with lender role and loan type option are retrieved
When I update TestCaseId 138431
When I update TestCaseName Perform: "Money >> Debt >> Loans" search Verify that companies of users with "Lender" role and "Loan" Loan Type option selected are retrieved.
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
When I set the value in loan amount field
Then I verify 'SATURN' company name is displayed in money debt loan search
When I clear the value in loan amount field
And I set value of LVT field
Then I verify 'SATURN' company name is displayed in money debt loan search
When I clear value of LVT field
And I set the value in term field
Then I verify 'SATURN' company name is displayed in money debt loan search
When I clear the value in term field
And I click on geographical coverage field
And I click on countries field
And I select United States checkbox in countries field
And I click on region field
And I click on NorthEast region
And I click on states field
And I click on New York state
And I click on cities field
And I enter and select Buffalo city
Then I verify 'SATURN' company name is displayed in money debt loan search
When I click on 'RCMP MarketPlace' button
And I click on 'Money' link
And I click on 'Debt' link
And I click on 'Loans' link
And I click on 'Land Loan' link
And I click on 'View Search Results' button
And I click on lender characteristics field
And I click lender profile in lender characteristics field
And I select insurance company option in lender profile
Then I verify 'SATURN' company name is displayed in money debt loan search
When I click lender profile in lender characteristics field
And I clear insurance company option in lender profile
When I click lender profile in lender characteristics field
And I select mezz fund option in lender profile
Then I verify 'Mich COMP' company name is displayed in money debt loan search
When I click lender profile in lender characteristics field
And I select institution option in lender profile
Then I verify 'Mich COMP' company name is displayed in money debt loan search
When I click lender profile in lender characteristics field
And I select foundation option in lender profile
Then I verify 'Mich COMP' company name is displayed in money debt loan search
When I click lender profile in lender characteristics field
And I select corporate investor option in lender profile
Then I verify 'Mich COMP' company name is displayed in money debt loan search
When I click lender profile in lender characteristics field
And I select investment bank option in lender profile
Then I verify 'Mich COMP' company name is displayed in money debt loan search
When I click lender profile in lender characteristics field
And I select pension fund option in lender profile
Then I verify 'Mich COMP' company name is displayed in money debt loan search
When I click lender profile in lender characteristics field
And I select sovereign wealth fund option in lender profile
Then I verify 'Mich COMP' company name is displayed in money debt loan search
When I click lender profile in lender characteristics field
And I select bank option in lender profile
Then I verify 'Mich COMP' company name is displayed in money debt loan search
When I click lender profile in lender characteristics field
And I select private lender option in lender profile
Then I verify 'Mich COMP' company name is displayed in money debt loan search
When I click lender profile in lender characteristics field
And I select individual option in lender profile
Then I verify 'Mich COMP' company name is displayed in money debt loan search
When I click lender profile in lender characteristics field
And I select RE fund option in lender profile
Then I verify 'Mich COMP' company name is displayed in money debt loan search
When I click lender profile in lender characteristics field
And I select government agency option in lender profile
Then I verify 'Mich COMP' company name is displayed in money debt loan search
When I click lender profile in lender characteristics field
And I select insurance company option in lender profile field
Then I verify 'Mich COMP' company name is displayed in money debt loan search
When I click lender profile in lender characteristics field
And I select private equity fund option in lender profile
Then I verify 'Mich COMP' company name is displayed in money debt loan search
When I click lender profile in lender characteristics field
And I select endowment fund option in lender profile
Then I verify 'Mich COMP' company name is displayed in money debt loan search
When I click lender profile in lender characteristics field
And I select all option in lender profile
Then I verify 'Mich COMP' company name is displayed in money debt loan search
When I click lender profile in lender characteristics field
And I clear all option in lender profile
And I click on route to lender in lender characteristics field
And I select brokers in route to lender field
Then I verify 'SATURN' company name is displayed in money debt loan search
When I click on route to lender in lender characteristics field
And I clear brokers in route to lender field
When I click on route to lender in lender characteristics field
And I select direct only option in route to lender
Then I verify 'Mich COMP' company name is displayed in money debt loan search
When I click on route to lender in lender characteristics field
And I select intermediary option in route to lender
Then I verify 'Mich COMP' company name is displayed in money debt loan search
When I click on route to lender in lender characteristics field
And I select broker option in route to lender
Then I verify 'Mich COMP' company name is displayed in money debt loan search
When I click on route to lender in lender characteristics field
And I select placement agent in route to lender
Then I verify 'Mich COMP' company name is displayed in money debt loan search
When I click on route to lender in lender characteristics field
And I select all option in route to lender
Then I verify 'Mich COMP' company name is displayed in money debt loan search
When I click on route to lender in lender characteristics field
And I clear all option in route to lender
And I logout from RealConnex application