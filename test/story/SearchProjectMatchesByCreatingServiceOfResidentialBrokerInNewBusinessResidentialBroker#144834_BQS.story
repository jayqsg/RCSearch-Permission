Meta:
@storyType BQS

Narrative:
As a user
Create "Service >>Residential Broker" requirement and verify that appropriate matches are displayed when "Matches" link is clicked

Scenario: TC 144834 : Create service requirement in commercial broker and verify the appropriate matches.
When I update TestCaseId 144834
When I update TestCaseName Create "Service >>Residential Broker" requirement and verify that appropriate matches are displayed when "Matches" link is clicked
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter email ID of real estate advisor user for creating the requirement
And I enter password of user
And I click on login button
Then I verify Activities is displayed in side pane
When I click on Activities in side pane
And I click on your postings link
Then I verify 'Your Postings' is displayed in header
When I click on 'Post new' button in posting tab
Then I verify 'What do you want to post to the marketplace?' is displayed
When I click on 'Service' button in market place
And I enter service name of real estate advisor
And I click on 'Save' button of posting tab
And I click on edit button in general field
And I click on engagement stage field
And I select owned option in engagement stage field
And I click on save button in general field
And I click on 'Create New' requirement button
And I click on 'Service' link in the requirement
And I enter the service name in 'Service Requirement'
And I click on professional requirement field
And I select residential broker option in professional requirement field
And I click on service field in service requirement
And I select acquisition option in service field
And I click on 'Create' button in service requirement
And I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter email ID of real estate advisor user for creating the requirement and verifying the number of matches
And I enter password of user
And I click on login button
Then I verify Activities is displayed in side pane
When I click on Activities in side pane
And I click on your postings link
Then I verify 'Your Postings' is displayed in header
When I click on 'Post new' button in posting tab
Then I verify 'What do you want to post to the marketplace?' is displayed
When I click on 'Service' button in market place
And I enter service name of real estate advisor
And I click on 'Save' button of posting tab
And I click on edit button in general field
And I click on engagement stage field
And I select owned option in engagement stage field
And I click on save button in general field
And I click on 'Create New' requirement button
And I click on 'Service' link in the requirement
And I enter the service name in 'Service Requirement'
And I click on professional requirement field
And I select residential broker option in professional requirement field
And I click on service field in service requirement
And I select acquisition option in service field
And I click on 'Create' button in service requirement
And I click on matches
Then I verify 'Residential Broker' is displayed in subrole field of New Business Search
And I should see 'Acquisitions' as strategy in search option
And I verify real estate advisor service name which has commercial broker requirement is displayed
When I logout RealConnex application