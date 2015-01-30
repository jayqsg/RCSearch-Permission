Meta:
@storyType BQS

Narrative:
As a user
I verify service project other than "Advisor" sub role user are
not retrieved, when "Real Estate Advisors >> Advisor" search is performed

Scenario: TC 138412: Verify service project other than advisor sub role is not retrieved when search is performed
When I update TestCaseId 138412
When I update TestCaseName Search Project Of Advisor Validation
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Real Estate Advisors' link
And I click on 'Advisor' link
And I click on 'Appraisal' link
And I click on 'View Search Results' button
Then I should see 'Real Estate Advisors' as find in search option
And I should see 'Advisor' as subrole in search option
And I should see 'Appraisal' as strategy in search option
When I click on service of user
And I return back to the searched page
And I click on company of user
And I return back to the searched page
And I set values of project slider
Then I verify 'Shawn service' service name of advisor is displayed
And I verify 'Barb Service' service name of advisor is not displayed
When I clear values of project slider
And I select asset experience drop down field
And I select office option in asset experience drop down
Then I verify service name of advisor selected 'Advisor Multi Family' option is not displayed
When I select asset experience drop down field
And I clear office option of asset experience drop down
And I click on deal stage drop down
And I select owned option in deal stage drop down
Then I verify service name of advisor selected 'Concept' option is not displayed
When I click on deal stage drop down
And I clear owned option in deal stage drop down
And I click on geographical coverage field
And I click on countries field
And I select United States checkbox in countries field
And I click on region field
And I click on MidWest region
And I click on states field
And I click on Missouri state
And I click on cities field
And I enter and select Ink city
Then I verify 'Shawn service' service name of advisor is not displayed
When I click on 'RCMP MarketPlace' button
And I click on 'Real Estate Advisors' link
And I click on 'Advisor' link
And I click on 'Appraisal' link
And I click on 'View Search Results' button
And I click on profile and experience field
And I select number of office in profile field
Then I verify 'Barb Service' service name of advisor is not displayed
When I clear number of office in profile field
And I select number of professionals in profile field
Then I verify 'Barb Service' service name of advisor is not displayed
When I clear number of professionals in profile field
And I select number of transaction completed in profile field
Then I verify 'Barb Service' service name of advisor is not displayed
When I clear number of transaction completed in profile field
And I logout from RealConnex application








