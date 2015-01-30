Meta:
@storyType BQS

Narrative:
As a user
I Verify that when "Deal Sponsor" user sets privacy to "Private" in "Me >> Privacy" page, only users who have been granted permission can view Me Profile.

Scenario: 100 : Verify that deal sponsor user privacy is set to "Private" in "Me" page can be viewed to user who have permission
When I update TestCaseId 100
When I update TestCaseName Privacy Set To Private In Me Tab Of Deal Sponsor
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter deal sponsor email ID whose privacy set to private
And I enter Password
And I click on login button
Then I should see Privacy button
When I click on Privacy button
Then I verify that privacy page is displayed
When I click on ME tab
And I select private radio button
And I click on save button in ME tab
Then I verify 'Privacy successfully saved' message is displayed
When I logout RealConnex application
And I click on sign up for free link
And I enter investor email ID for registration in mailinator
And I enter first name of user
And I enter last name of user
And I enter password in registration field
And I re enter password in registration field
And I click select role drop down field
And I select Investor option in select role drop down
Then I verify 'Investor' is selected in drop down
When I click on I certify I am an accredited investor check box
And I click register button
Then I verify 'Almost Done!' confirmation message is displayed
When I click on close button
And I launch mailinator
And I enter mailinator email address of newly created user
And I click on check it button
And I click on RealConnex mail in the inbox
And I click on Click here link in the inbox
And I switch to RealConnex page
Then I verify RealConnex page
When I click Skip Tour button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on search real connex marketplace link
And I click on 'People,companies and association' link
And I click on 'People' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter deal sponsor user name in the name text field
And I click on click here link of the private user
And I click on request a viewing link
Then I verify message displayed after clicking on request a view
When I logout RealConnex application
And I launch yopmail
And I enter deal sponsor email ID whose privacy set to private in yopmail
And I click on check inbox button
And I click on real connex mail
And I click on Accept link
And I switch to RealConnex page
And I click on Log In button in RealConnex login page
And I enter deal sponsor email ID whose privacy set to private
And I enter Password
And I click on login button
Then I verify access successfully updated message is displayed
When I logout RealConnex application
And I launch mailinator
And I enter mailinator email address of newly created user
And I click on check it button
And I click on RealConnex mail in the inbox
And I click on 'View Profile' link who granted the permission to view the profile
And I switch to RealConnex page
And I click on Log In button in RealConnex login page
And I enter newly created 'Investor' email ID
And I enter Password
And I click on login button
Then I verify the deal sponsor profile is displayed
And I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on search real connex marketplace link
And I click on 'People,companies and association' link
And I click on 'People' link
Then I should see 'People, Companies & Associations' as find in search option
And I verify 'Jacob Smith' deal sponsor user name is displayed in search result
When I click on 'Jacob Smith' deal sponsor user name in search result
And I logout RealConnex application





