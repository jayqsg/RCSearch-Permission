Meta:
@storyType BQS

Narrative:
As a user
Create "Financial >> Debt >> Mezz" requirement and verify that appropriate matches are displayed when "Matches" link is clicked

Scenario: TC 144816 : Create financial requirement in Financial>>Debt>>Mezz and verify the appropriate matches.
When I update TestCaseId 144816
When I update TestCaseName Create "Financial >> Debt >> Mezz" requirement and verify that appropriate matches are displayed when "Matches" link is clicked
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter email ID of deal sponsor user for creating the requirement
And I enter password of user
And I click on login button
Then I verify Activities is displayed in side pane
When I click on Activities in side pane
And I click on your postings link
Then I verify 'Your Postings' is displayed in header
When I click on 'Post new' button in posting tab
Then I verify 'What do you want to post to the marketplace?' is displayed
When I click on 'Fund' button in market place
And I enter fund name of deal sponsor
And I click on 'Save' button of posting tab
When I click on 'Fund' button in market place
And I enter fund name of deal sponsor
And I click on 'Save' button of posting tab
And I click on edit button of 'About this Fund' section
And I click on 'Fund Invest In' field and select 'Direct Into Project' option
And I click on 'Risk Profile' field and select 'Core' option
And I click on 'Save' button in 'About this Fund' section
And I click on 'Debt Requirement' option
And I enter requirement name in financial debt requirement
And I select mezz option in loan type field of Debt Requirement
And I click on 'Create' button in service requirement
And I click on matches
Then I should see 'Money' in find of money search
And I verify 'MSmi Mezz' lender mezz name is displayed when click on matches of financial requirement
When I logout RealConnex application
