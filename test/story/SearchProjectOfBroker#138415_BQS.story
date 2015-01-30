Meta:
@storyType BQS

Narrative:
As a user
I verify 'Service' project of "Broker" sub role user are
retrieved, when "Real Estate Advisors >> Broker" search is performed

Scenario: TC 138415: Verify service project is retrieved when broker search is performed
When I update TestCaseId 138415
When I update TestCaseName Search Project Of Broker
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
And I set the values in the slider of project size
Then I verify service project of broker is displayed
When I clear the project size field
When I click on 'RCMP MarketPlace' button
And I click on 'Brokers & Agencies' link
And I click on 'Residential' link
And I click on 'View Search Results' button
Then I should see 'Brokers & Agencies' as subrole in search option
And I select asset experience drop down field
And I click on solar option in asset experience field
Then I verify service project of broker is displayed
When I select asset experience drop down field
And I clear solar option of asset experience field
And I select asset experience drop down field
And I select office option in asset experience drop down
Then I verify service name of broker selected all search option is displayed
When I select asset experience drop down field
And I clear office option of asset experience drop down
When I select asset experience drop down field
And I click on multi family option in asset
Then I verify service name of broker selected all search option is displayed
When I select asset experience drop down field
And I click on hotel option in asset
Then I verify service name of broker selected all search option is displayed
When I select asset experience drop down field
And I click on sports option in asset
Then I verify service name of broker selected all search option is displayed
When I select asset experience drop down field
And I click on health option in asset
Then I verify service name of broker selected all search option is displayed
When I select asset experience drop down field
And I click on storage option in asset
Then I verify service name of broker selected all search option is displayed
When I select asset experience drop down field
And I click on asset other option in asset
Then I verify service name of broker selected all search option is displayed
When I select asset experience drop down field
And I click on retail option in asset
Then I verify service name of broker selected all search option is displayed
When I select asset experience drop down field
And I click on industrial option in asset
Then I verify service name of broker selected all search option is displayed
When I select asset experience drop down field
And I click on residential option in asset
Then I verify service name of broker selected all search option is displayed
When I select asset experience drop down field
And I click on single option in asset
Then I verify service name of broker selected all search option is displayed
When I select asset experience drop down field
And I click on retirement option in asset
Then I verify service name of broker selected all search option is displayed
When I select asset experience drop down field
And I click on student option in asset
Then I verify service name of broker selected all search option is displayed
When I select asset experience drop down field
And I click on residential other option in asset
Then I verify service name of broker selected all search option is displayed
When I select asset experience drop down field
And I click on residential multi option in asset
Then I verify service name of broker selected all search option is displayed
When I select asset experience drop down field
And I clear residential field in asset option
When I select asset experience drop down field
And I click on mixed option in asset
Then I verify service name of broker selected all search option is displayed
When I select asset experience drop down field
And I click on commercial option in asset
Then I verify service name of broker selected all search option is displayed
When I select asset experience drop down field
And I click on solar option in asset
Then I verify service name of broker selected all search option is displayed
When I select asset experience drop down field
And I clear asset options in asset drop down field
And I click on deal stage drop down
And I select in dd option in deal stage drop down
Then I verify service project of broker is displayed
When I click on deal stage drop down
And I clear in dd option in deal stage drop down
And I click on deal stage drop down
And I click on concept option in deal stage
Then I verify service name of broker selected all search option is displayed
When I click on deal stage drop down
And I click on permitted option in deal stage
Then I verify service name of broker selected all search option is displayed
When I click on deal stage drop down
And I click on ready option in deal stage
Then I verify service name of broker selected all search option is displayed
When I click on deal stage drop down
And I click on LOI option in deal stage
Then I verify service name of broker selected all search option is displayed
When I click on deal stage drop down
And I click on under contract option in deal stage
Then I verify service name of broker selected all search option is displayed
When I click on deal stage drop down
And I click on plans option in deal stage
Then I verify service name of broker selected all search option is displayed
When I click on deal stage drop down
And I click on under construction option in deal stage
Then I verify service name of broker selected all search option is displayed
When I click on deal stage drop down
And I click on pursuit option in deal stage
Then I verify service name of broker selected all search option is displayed
When I click on deal stage drop down
And I click on in DD option in deal stage
Then I verify service name of broker selected all search option is displayed
When I click on deal stage drop down
And I clear deal stage field
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
Then I verify service project of broker is displayed
When I click on 'RCMP MarketPlace' button
And I click on 'Brokers & Agencies' link
And I click on 'Residential' link
And I click on 'View Search Results' button
Then I should see 'Brokers & Agencies' as subrole in search option
And I click on profile and experience field
And I select number of offices
Then I verify service project of broker is displayed
When I clear number of offices
And I select number of professionals
Then I verify service project of broker is displayed
When I clear number of professionals
And I select number of transaction completed
Then I verify service project of broker is displayed
When I clear number of transaction completed
And I logout from RealConnex application
