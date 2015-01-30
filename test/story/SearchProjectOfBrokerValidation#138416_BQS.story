Meta:
@storyType BQS

Narrative:
As a user
I verify 'Service' project other than "Broker" sub role user are not
retrieved, when "Real Estate Advisors >> Broker" search is performed

Scenario: TC 138416: Verify service project other than broker sub role are not retrieved when search is performed
When I update TestCaseId 138416
When I update TestCaseName Search Project Of Broker Validation
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Brokers & Agencies' link
And I click on 'Residential' link
And I click on 'View Search Results' button
Then I should see 'Brokers & Agencies' as subrole in search option
When I click on broker service name
And I return back to the searched page
And I set values of project slider
Then I verify 'Advisor service' service name of broker is displayed
And I verify 'Service' service name of broker is not displayed
When I clear values of project slider
And I select asset experience drop down field
And I click on solar option in asset experience field
Then I verify service name of broker selected 'Broker Solar' option is displayed
And I verify service name of broker selected 'Broker Multi Family' option is not displayed
When I select asset experience drop down field
And I clear solar option of asset experience field
And I click on deal stage drop down
And I select in dd option in deal stage drop down
Then I verify service name of broker selected 'In DD' option is displayed
And I verify service name of broker selected 'Broker Owned' option is not displayed
When I click on deal stage drop down
And I clear in dd option in deal stage drop down
And I click on geographical coverage field
And I click on countries field
And I select United States checkbox in countries field
And I click on region field
And I click on West region
And I click on states field
And I click on California state
And I click on cities field
And I enter and select Napa city
And I click on geographical coverage field
Then I verify 'Advisor service' service name of broker is not displayed
When I click on 'RCMP MarketPlace' button
And I click on 'Brokers & Agencies' link
And I click on 'Residential' link
And I click on 'View Search Results' button
Then I should see 'Brokers & Agencies' as subrole in search option
And I click on profile and experience field
And I select number of office in profile field
Then I verify 'Advisor service' service name of broker is displayed
And I verify 'Service' service name of broker is not displayed
When I clear number of office in profile field
And I select number of professionals in profile field
Then I verify 'Advisor service' service name of broker is displayed
And I verify 'Service' service name of broker is not displayed
When I clear number of professionals in profile field
And I select number of transaction completed in profile field
Then I verify 'Advisor service' service name of broker is displayed
And I verify 'Service' service name of broker is not displayed
When I clear number of transaction completed in profile field
And I logout from RealConnex application
