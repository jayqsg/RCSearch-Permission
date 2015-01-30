Meta:
@storyType BQS

Narrative:
As a user
Perform "New Business >> Commercial Broker" search and verify that projects that has a commercial broker requirement but Lighthouse is turned OFF are not retrieved.

Scenario: TC 144847: Verify that projects which have commercial requirement selected in new business commercial search are not retrieved when lighthouse is turned off.
When I update TestCaseId 144847
When I update TestCaseName Perform "New Business >> Commercial Broker" search and verify that projects that has a commercial broker requirement but Lighthouse is turned OFF are not retrieved.
When I launch RealConnex application
And I click on Log In button in RealConnex login page
When I enter deal sponsor email id for new business search
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'New Business' link
And I click on 'Commercial Broker' link
And I click on 'Acquisitions' link in new business search
And I click on 'View Search Results' button
Then I should see 'New Business' as find in search option
And I verify 'Commercial Broker' is displayed in subrole field of New Business Search
And I should see 'Acquisitions' as strategy in search option
And I verify 'Haris Fund' fund name of user whose lighthouse is off are not displayed in new business search
When I click on 'Route to Sponsor' drop down field in search
And I select direct only option in route to sponsor drop down list
Then I verify 'Haris Fund' fund name of user whose lighthouse is off are not displayed in new business search when side search performed
When I click on 'Route to Sponsor' drop down field in search
And I clear route to sponsor drop down
And I click on asset type drop down
And I select office option in asset type drop down
Then I verify 'Haris Fund' fund name of user whose lighthouse is off are not displayed in new business search when side search performed
When I click on asset type drop down
And I clear office option in asset type drop down
And I select ideal customer drop down field
And I select investor option in ideal customer field
And I select advisor option in ideal customer field
Then I verify 'Haris Fund' fund name of user whose lighthouse is off are not displayed in new business search when side search performed
When I select ideal customer drop down field
And I clear investor option in ideal customer field
And I select number of professionals slider in new business advisor search
Then I verify 'Haris Fund' fund name of user whose lighthouse is off are not displayed in new business search when side search performed
When I clear number of professionals slider in new business advisor search
And I click on geographical coverage field
And I click on countries field
And I select United States checkbox in countries field
And I click on region field
And I click on NorthEast region
And I click on states field
And I click on New York state
And I click on cities field
And I enter and select Ira city
And I click on geographical coverage field
Then I verify 'Haris Fund' fund name of user whose lighthouse is off are not displayed in new business search when side search performed
When I logout RealConnex application
