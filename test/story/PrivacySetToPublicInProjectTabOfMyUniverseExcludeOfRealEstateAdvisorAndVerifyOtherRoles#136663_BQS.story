Meta:
@storyType BQS

Narrative:
As a user
I Verify that projects of other role users except Property Service Provider can be view.

Scenario: 136663 : Verify that property service provider users exclude from my universe are invisible when privacy is set to exclude in project tab
When I update TestCaseId 136663
When I update TestCaseName Verify that projects of other role users except Property Service Provider can be view.
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter real estate advisor email ID of user who set the privacy in my universe include in project tab
And I enter Password
And I click on login button
Then I should see Privacy button
When I click on Privacy button
Then I verify that privacy page is displayed
When I click on POSTINGS tab
And I click on service project of the real estate advisor who set privacy in my universe include
And I click on public button of project tab
And I click on save button in my universe page of PROJECT tab
Then I verify 'Privacy successfully saved' message is displayed
When I click on service project of the real estate advisor who set privacy in my universe include
When I click on my universe radio button
And I click on exclude radio button
And I select public option in drop down
And I select real estate advisor check box in my universe exclude
And I select sub role field of real estate advisor in my universe exclude
And I select advisor sub role option in my universe exclude of real estate advisor
And I set the value in deal/fund size field of real estate advisor in my universe exclude
And I select country of the user in my universe exclude
And I select regions of the user in my universe exclude
And I select states of the user in my universe exclude
And I select cities of the user in my universe exclude
And I click on save button in my universe page of PROJECT tab
Then I verify 'Privacy successfully saved' message is displayed
When I click on service project of the real estate advisor who set privacy in my universe include
Then I verify that public option is selected
And I verify real estate advisor subrole is selected
And I verify advisor subrole is selected in real estate advisor
When I return back to the searched page
When I click on listing project of the real estate advisor who set privacy in my universe include
And I click on public button of project tab
And I click on save button in my universe page of PROJECT tab
Then I verify 'Privacy successfully saved' message is displayed
When I click on listing project of the real estate advisor who set privacy in my universe include
And I click on my universe radio button
And I click on exclude radio button
And I select public option in drop down
And I select real estate advisor check box in my universe exclude
And I select sub role field of real estate advisor in my universe exclude
And I select advisor sub role option in my universe exclude of real estate advisor
And I set the value in deal/fund size field of real estate advisor in my universe exclude
And I select country of the user in my universe exclude
And I select regions of the user in my universe exclude
And I select states of the user in my universe exclude
And I select cities of the user in my universe exclude
And I click on save button in my universe page of PROJECT tab
Then I verify 'Privacy successfully saved' message is displayed
When I click on listing project of the real estate advisor who set privacy in my universe include
Then I verify that public option is selected
Then I verify real estate advisor subrole is selected
And I verify advisor subrole is selected in real estate advisor
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter email ID of user with role as real estate advisor and sub role as advisor
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
And I verify property service provider service profile whose privacy is set to my universe include is not displayed
When I click on 'RCMP MarketPlace' button
And I click on 'Investments' link
And I click on 'Direct Into Project' link
And I click on 'Core' link
And I click on 'View Search Results' button
Then I should see 'Investments' in find of search option
And I verify kind in search option
And I verify risk in search option
And I verify property service provider service profile whose privacy is set to my universe include is not displayed
When I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter investor email ID for login
And I enter password of user
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
Then I verify 'Davis Service' property service provider service name who set privacy in my universe include is displayed
When I click on 'Davis Service' property service provider service name who set privacy in my universe include
When I click on 'RCMP MarketPlace' button
And I click on 'Investments' link
And I click on 'Direct Into Project' link
And I click on 'Core' link
And I click on 'View Search Results' button
Then I should see 'Investments' in find of search option
And I verify kind in search option
And I verify risk in search option
Then I verify 'Davis Listing' property service provider service name who set privacy in my universe include is displayed
When I click on 'Davis Listing' property service provider service name who set privacy in my universe include
When I click on 'RCMP MarketPlace' button
And I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter lender email ID for login
And I enter password of user
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
Then I verify 'Davis Service' property service provider service name who set privacy in my universe include is displayed
When I click on 'Davis Service' property service provider service name who set privacy in my universe include
When I click on 'RCMP MarketPlace' button
And I click on 'Investments' link
And I click on 'Direct Into Project' link
And I click on 'Core' link
And I click on 'View Search Results' button
Then I should see 'Investments' in find of search option
And I verify kind in search option
And I verify risk in search option
Then I verify 'Davis Listing' property service provider service name who set privacy in my universe include is displayed
When I click on 'Davis Listing' property service provider service name who set privacy in my universe include
When I click on 'RCMP MarketPlace' button
And I logout RealConnex application
And I click on Log In button in RealConnex login page
And I enter deal sponsor email ID for login
And I enter password of user
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
Then I verify 'Davis Service' property service provider service name who set privacy in my universe include is displayed
When I click on 'Davis Service' property service provider service name who set privacy in my universe include
When I click on 'RCMP MarketPlace' button
And I click on 'Investments' link
And I click on 'Direct Into Project' link
And I click on 'Core' link
And I click on 'View Search Results' button
Then I should see 'Investments' in find of search option
And I verify kind in search option
And I verify risk in search option
Then I verify 'Davis Listing' property service provider service name who set privacy in my universe include is displayed
When I click on 'Davis Listing' property service provider service name who set privacy in my universe include
When I click on 'RCMP MarketPlace' button
And I logout RealConnex application
