Meta:
@storyType BQS

Narrative:
As a user
Perform: "Design, Build & Engineering >> Engineer >> Civil Engineer" search and Verify that companies of users other than "Design, Build & Engineering" role with "We are a" as "Civil Engineer" are not retrieved.

Scenario: TC 149709 :  Search and Verify the company of "Design, Build & Engineering role" role is not displayed in "Design, Build & Engineering >> Civil Engineer" search
When I update TestCaseId 149709
When I update TestCaseName Perform: "Design, Build & Engineering >> Engineer >> Civil Engineer" search and Verify that companies of users other than "Design, Build & Engineering" role with "We are a" as "Civil Engineer" are not retrieved.
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Engineer' link
And I click on 'Civil Engineer' link
Then I verify 'Design Build & Engineering' is displayed in find of search option
And I verify 'Civil Engineer' is displayed in provider of search option
When I click on service drop down field
And I select solid waste facilities option in service drop down field
Then I verify 'Clark Company' is not displayed in search result of DBE search
When I click on service drop down field
And I clear solid waste facilities option in service drop down field
And I click on asset focus drop down
And I select office option in asset focus drop down
Then I verify 'Clark Company' is not displayed in search result of DBE search
When I click on asset focus drop down
And I clear office option in asset focus drop down
And I click on engagement stage drop down
And I select planning option in engagement stage drop down field
Then I verify 'Clark Company' is not displayed in search result of DBE search
When I click on engagement stage drop down
And I clear planning option in engagement stage drop down field
And I set the value for year in business field in DBE search
Then I verify 'Clark Company' is not displayed in search result of DBE search
When I clear the value for year in business field in DBE search
And I set the value for average project value field in DBE search
Then I verify 'Clark Company' is not displayed in search result of DBE search
When I clear the value for average project value field in DBE search
And I click on geographical coverage field
And I click on countries field
And I select United States checkbox in countries field
And I click on region field
And I click on Southwest region
And I click on states field
And I click on Texas state
And I click on cities field
And I enter and select Massa city
Then I verify 'Clark Company' is not displayed in search result of DBE search
When I logout from RealConnex application







