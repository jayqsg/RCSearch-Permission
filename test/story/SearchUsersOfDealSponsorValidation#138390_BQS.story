Meta:
@storyType BQS

Narrative:
As a user
I Verify users other than "Deal Sponsor" sub-role are not retrieved when
"Developer/Deal Sponsor>>Deal Sponsor" search is performed.

Scenario: TC 138390: Verify other than deal sponsors are not displayed when search is performed
When I update TestCaseId 138390
When I update TestCaseName Search Users Of Deal Sponsor Validation
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Developer,Deal Sponsor' link
And I click on 'Deal Sponsor' link
And I click on 'View Search Results' button
Then I should see 'Developers, Deal Sponsors' in find of search option
And I should see sub role as 'Deal Sponsors'
When I click on geographical coverage field
And I click on countries field
And I select United States checkbox in countries field
And I click on region field
And I click on Southwest region
And I click on states field
And I click on Texas state
And I click on cities field
And I enter and select Massa city
Then I verify 'Jiah Maten' investor user name is not displayed
When I click on 'RCMP MarketPlace' button
And I click on 'Developer,Deal Sponsor' link
And I click on 'Deal Sponsor' link
And I click on 'View Search Results' button
Then I should see 'Developers, Deal Sponsors' in find of search option
And I should see sub role as 'Deal Sponsors'
When I click on asset experience
And I click on 'Asset Strategy' drop down field
And I select acquisition option in a strategy field of drop down list
Then I verify user selected 'DealSponsor Acquisition' option is displayed
And I verify user selected 'Lease-Up' option is not displayed
When I click on 'Asset Strategy' drop down field
And I select acquisition and lease-up strategy in drop down
Then I verify user selected 'DealSponsor Acquisition' option is displayed
And I verify user selected 'Lease-Up' option is displayed
When I click on 'Asset Strategy' drop down field
And I clear strategy field
And I logout from RealConnex application

