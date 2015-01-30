Meta:
@storyType BQS

Narrative:
Perform: "Developer, Deal Sponsor >> Deal Sponsor, Developer" search Verify that users other than "Deal Sponsor", "Developer" sub roles are not retrieved.

Scenario: TC 138396: Verify user other than deal sponsor,developer are not displayed when search is performed
When I update TestCaseId 138396
When I update TestCaseName Perform: "Developer, Deal Sponsor >> Deal Sponsor, Developer" search Verify that users other than "Deal Sponsor", "Developer" sub roles are not retrieved.
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Developer,Deal Sponsor' link
And I select 'Developer','DealSponsor' link
And I click on 'View Search Results' button
Then I should see 'Developers, Deal Sponsors' as find in search option
And I should see 'Developer, Deal Sponsor' as sub role in search option
And I should see 'Marylin Joe' deal sponsor user name is displayed
When I click on verified deal sponsor user name
And I return back to the searched page
Then I verify the 'Developer' name is displayed
When I click on verified developer name
And I return back to the searched page
When I click on asset experience
And I click on 'Asset Strategy' drop down field
And I select acquisition option in a strategy field of drop down list
Then I verify user selected 'Lease-Up' option is not displayed
When I click on 'Asset Strategy' drop down field
And I clear acquisition option in a strategy field of drop down list
And I click on 'Asset Strategy' drop down field
And I select sale and leaseback option in strategy drop down list
Then I verify user selected 'Lease-Up' option is not displayed
When I click on 'Asset Strategy' drop down field
And I clear strategy of asset drop down
And I logout from RealConnex application



