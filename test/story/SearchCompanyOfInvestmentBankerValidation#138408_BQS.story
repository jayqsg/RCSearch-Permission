Meta:
@storyType BQS

Narrative:
As a user
I verify companies other than "Investment Banker" sub role are not retrieved,
when "Real Estate Advisors >> Investment Banker" search is performed

Scenario: TC 138408: Verify companies other than investment banker is not retrieved when search is performed
When I update TestCaseId 138408
When I update TestCaseName Perform: "Real Estate Advisor >> Investment Banker" search Verify that companies other than "Investment Banker" sub role users are not retrieved.
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Investment Banker / Capital Markets' link
And I click on 'Capital Raising' link
And I click on 'View Search Results' button
Then I should see 'Real Estate Advisors' as find in search option
And I should see 'Investment Banker' as subrole in search option
And I should see 'Capital Raising' as strategy in search option
When I click on banker project name
And I return back to the searched page
When I click on banker company name
And I return back to the searched page
And I set value in project size field
Then I verify 'Cubes' company name of investment banker is not displayed
When I clear values in project size field
And I select asset experience drop down field
And I select health care option in asset experience drop down
Then I verify investment banker company name of 'Storage' is not displayed
When I select asset experience drop down field
And I clear health care option in asset experience drop down
And I click on deal stage drop down
And I select permitted option in deal stage drop down
Then I verify investment banker company name of 'Pursuit' is not displayed
When I click on deal stage drop down
And I clear permitted option in deal stage drop down
And I click on geographical coverage field
And I click on countries field
And I select United States checkbox in countries field
And I click on region field
And I click on MidWest region
And I click on states field
And I click on Wisconsin state
And I click on cities field
And I enter and select Eden city
Then I verify 'Mercury' company name of investment banker is not displayed
When I click on 'RCMP MarketPlace' button
And I click on 'Investment Banker / Capital Markets' link
And I click on 'Capital Raising' link
And I click on 'View Search Results' button
And I click on profile and experience field
And I select number of office in profile field
Then I verify 'Cubes' company name of investment banker is not displayed
When I clear number of office in profile field
And I select number of professionals in profile field
Then I verify 'Cubes' company name of investment banker is not displayed
When I clear number of professionals in profile field
And I select number of value transaction completed in profile field
Then I verify 'Cubes' company name of investment banker is not displayed
When I clear number of value transaction completed in profile field
And I select number of transaction completed in profile field
Then I verify 'Cubes' company name of investment banker is not displayed
When I clear number of transaction completed in profile field
And I logout from RealConnex application



