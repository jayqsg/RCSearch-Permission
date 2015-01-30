Meta:
@storyType BQS

Narrative:
As a user
Perform: "Design, Build & Engineering >> Sub Contractor" search and Verify that "Design, Build & Engineering Service" postings with "I am a" as "Sub Contractor" are retrieved.

Scenario: 149702 : Search and Verify the postings of "Design, Build & Engineering role" role is displayed in "Design, Build & Engineering >> Sub Contractor" search
When I update TestCaseId 149702
When I update TestCaseName Perform: "Design, Build & Engineering >> Sub Contractor" search and Verify that "Design, Build & Engineering Service" postings with "I am a" as "Sub Contractor" are retrieved.
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Design, Build & Engineering' link
And I click on 'Sub Contractor' link
Then I verify 'Design Build & Engineering' is displayed in find of search option
And I verify 'Sub Contractor' is displayed in provider of search option
When I set the value for project size field in DBE search
Then I verify 'CGary DBE Service' posting is displayed in search result of DBE search
When I clear the value for project size field in DBE search
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Design, Build & Engineering' link
And I click on 'Contractor' link
Then I verify 'Design Build & Engineering' is displayed in find of search option
And I verify 'Contractor' is displayed in provider of search option
When I click on service drop down field
And I select decommissioning and closure option in service drop down field
Then I verify 'CGary DBE Service' posting is displayed in search result of DBE search
When I click on service drop down field
And I clear decommissioning and closure option in service drop down field
When I click on asset focus drop down
And I select solar option in asset focus drop down
Then I verify 'CGary DBE Service' posting is displayed in search result of DBE search
When I click on asset focus drop down
And I clear solar option in asset focus drop down
And I click on engagement stage drop down
And I select design option in engagement stage drop down field
Then I verify 'CGary DBE Service' posting is displayed in search result of DBE search
When I click on engagement stage drop down
And I clear design option in engagement stage drop down field
And I set the value for year in business field in DBE search
Then I verify 'CGary DBE Service' posting is displayed in search result of DBE search
When I clear the value for year in business field in DBE search
And I set the value for average project value field in DBE search
Then I verify 'CGary DBE Service' posting is displayed in search result of DBE search
When I clear the value for average project value field in DBE search
And I click on geographical coverage field
And I click on countries field
And I select United States checkbox in countries field
And I click on region field
And I click on MidWest region
And I click on states field
And I click on Wisconsin state
And I click on cities field
And I enter and select Eden city
Then I verify 'CGary DBE Service' posting is displayed in search result of DBE search
When I logout from RealConnex application



