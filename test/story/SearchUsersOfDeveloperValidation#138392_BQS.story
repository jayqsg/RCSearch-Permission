Meta:
@storyType BQS

Narrative:
As a user
I Verify users other than "Developer" sub-role are not retrieved when
"Developer/Deal Sponsor>>Developer" search is performed.

Scenario: TC 138392: Verify developer are displayed when search is performed
When I update TestCaseId 138392
When I update TestCaseName Search Users Of Developer Validation
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Developer,Deal Sponsor' link
And I click on 'Developer' link
And I click on 'View Search Results' button
Then I should see 'Developers, Deal Sponsors' in find of search option
And I should see sub role as 'Developer'
When I click on geographical coverage field
And I click on countries field
And I select United States checkbox in countries field
And I click on region field
And I click on MidWest region
And I click on states field
And I click on West Virginia state
And I click on cities field
And I enter and select Halo city
Then I verify 'Jiah Maten' investor user name is not displayed
When I click on 'RCMP MarketPlace' button
And I click on 'Developer,Deal Sponsor' link
And I click on 'Developer' link
And I click on 'View Search Results' button
When I click on asset experience
And I click on 'Asset Strategy' drop down field
And I select sale and leaseback option in strategy drop down list
Then I verify user selected 'Sale And Leaseback' option is displayed
And I verify user selected 'Lease-Up' option is not displayed
And I verify user selected 'Platform Builds' option is not displayed
When I click on 'Asset Strategy' drop down field
And I select sale and leaseback and lease-up strategy in drop down
Then I verify user selected 'Platform Builds' option is not displayed
And I verify user selected 'Sale And Leaseback' option is displayed
And I verify user selected 'Lease-Up' option is displayed
When I click on 'Asset Strategy' drop down field
And I clear strategy field drop down
And I logout from RealConnex application
