Meta:
@storyType BQS

Narrative:
As a user
Create "Financial >> Debt >> Mezz" requirement and verify that appropriate matches are displayed when "Matches" link is clicked

Scenario: TC 144817 : Create financial requirement in Financial>>Debt>>Mezz and verify the appropriate matches.
When I update TestCaseId 144817
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
And I click on 'Create New' requirement button
And I click on 'Financial' link in the requirement
And I enter requirement name in financial requirement
And I select equity radio button
And I select preferred equity option in type field of financial equity requirement
And I click on 'Create' button in service requirement
And I click on matches
Then I should see 'Money' in find of money search
And I should see 'Fund' in kind of money search
And I should see 'Preferred Equity' in type of money search
And I verify 'GC Equity' of investor equity name is displayed when click on matches of financial equity requirement
When I logout RealConnex application
