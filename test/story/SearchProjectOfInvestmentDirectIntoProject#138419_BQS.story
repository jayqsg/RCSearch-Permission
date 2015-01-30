Meta:
@storyType BQS

Narrative:
As a user
I verify that project type of "Project" and "Listing" projects
are retrieved in "Investment >> Direct Into Project" search

Scenario: TC 138419: Verify service project is retrieved when Advisor search is performed
When I update TestCaseId 138419
When I update TestCaseName Search Project Of Investment Direct Into
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Investments' link
And I click on 'Direct Into Project' link
And I click on 'Core' link
And I click on 'View Search Results' button
Then I should see 'Investments' in find of search option
And I verify kind in search option
And I verify risk in search option
When I click on investment direct into service project
And I return back to the searched page
When I click on investment direct into listing project
And I return back to the searched page
And I select value in investment amount slider
Then I verify service project of investments is displayed
And I verify listing project of investments is displayed
When I clear value in investment amount slider
And I select the value of deal size
Then I verify service project of investments is displayed
And I verify listing project of investments is displayed
When I clear the value of deal size
And I click on 'RCMP MarketPlace' button
And I click on 'Investments' link
And I click on 'Direct Into Project' link
And I click on 'Core' link
And I click on 'View Search Results' button
And I click investing as drop down field
And I select general partner option in investing as drop down field
Then I verify service project of investments is displayed
And I verify listing project of investments is displayed
When I click investing as drop down field
And I clear general partner option in investing as drop down field
And I click investing as drop down field
And I select co gp option in investing drop down
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click investing as drop down field
And I select co lead option in investing drop down
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click investing as drop down field
And I select co developer in investing drop down
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click investing as drop down field
And I select other investor option in investing drop down
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click investing as drop down field
And I select all option in investing drop down
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click investing as drop down field
And I clear all option in investing drop down
And I click on asset interest
And I click on asset type field in investment direct into search
And I select a asset type office in investment direct into search
Then I verify service project of investments is displayed
And I verify listing project of investments is displayed
When I click on asset type field in investment direct into search
And I clear asset type drop down in investment direct into search
And I click on asset type field in investment direct into search
And I select a asset type office in investment direct into search
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on asset type field in investment direct into search
And I click on multifamily option in asset type of investment direct into search
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on asset type field in investment direct into search
And I click on hotel option in asset type of investment direct into search
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on asset type field in investment direct into search
And I click on sports option in asset type of investment direct into search
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on asset type field in investment direct into search
And I click on health care option in asset type of investment direct into search
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on asset type field in investment direct into search
And I click on storage option in asset type of investment direct into search
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on asset type field in investment direct into search
And I click on other option in asset type of investment direct into search
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on asset type field in investment direct into search
And I click on retail option in asset type of investment direct into search
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on asset type field in investment direct into search
And I click on industrial option in asset type of investment direct into search
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on asset type field in investment direct into search
And I click on residential option in asset type of investment direct into search
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on asset type field in investment direct into search
And I click on single option in asset type of investment direct into search
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on asset type field in investment direct into search
And I click on retirement option in asset type of investment direct into search
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on asset type field in investment direct into search
And I click on student option in asset type of investment direct into search
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on asset type field in investment direct into search
And I click on other housing option in asset type of investment direct into search
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on asset type field in investment direct into search
And I click on residential multi family option in asset type of investment direct into search
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on asset type field in investment direct into search
And I clear residential of asset field of investment direct into search
And I click on asset type field in investment direct into search
And I click on mixed use option in asset type of investment direct into search
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on asset type field in investment direct into search
And I click on commercial option in asset type of investment direct into search
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on asset type field in investment direct into search
And I click on solar option in asset type of investment direct into search
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on asset type field in investment direct into search
And I click on all option in asset type of investment direct into search
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on asset type field in investment direct into search
And I clear all option in asset type of investment direct into search
And I click on 'RiskProfile' drop down field in investment direct into project
And I select core option in risk profile drop down of investment direct into project
Then I verify service project of investments is displayed
And I verify listing project of investments is displayed
When I click on 'RiskProfile' drop down field in investment direct into project
And I clear core in risk profile drop down of investment direct into project
And I click on 'RiskProfile' drop down field in investment direct into project
And I select core option in risk profile drop down of investment direct into project
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on 'RiskProfile' drop down field in investment direct into project
And I click on core plus risk profile type of investment direct into project
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on 'RiskProfile' drop down field in investment direct into project
And I click on value add risk profile type of investment direct into project
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on 'RiskProfile' drop down field in investment direct into project
And I click on development risk profile type of investment direct into project
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on 'RiskProfile' drop down field in investment direct into project
And I click on opportunistic risk profile type of investment direct into project
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on 'RiskProfile' drop down field in investment direct into project
And I click on other option of risk profile type of investment direct into project
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on 'RiskProfile' drop down field in investment direct into project
And I click all option in risk profile type of investment direct into project
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on 'RiskProfile' drop down field in investment direct into project
And I clear risk profile of investment direct into project
And I click on deal stage drop down field
And I select owned option in deal stage drop down field
Then I verify service project of investments is displayed
And I verify listing project of investments is displayed
When I click on deal stage drop down field
And I clear owned option in deal stage drop down field
And I click on deal stage drop down field
And I click on concept option in deal stage drop down
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on deal stage drop down field
And I click on permitted option in deal stage drop down
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on deal stage drop down field
And I click on ready for purchase option in deal stage drop down
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on deal stage drop down field
And I click on LOI option in deal stage drop down
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on deal stage drop down field
And I click on under contract option in deal stage drop down
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on deal stage drop down field
And I click on plans option in deal stage drop down
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on deal stage drop down field
And I click on under construction option in deal stage drop down
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on deal stage drop down field
And I click on pursuit option in deal stage drop down
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on deal stage drop down field
And I click on in DD option in deal stage drop down
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on deal stage drop down field
And I select all option in deal stage drop down
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on deal stage drop down field
And I clear all field in deal stage
And I click on current asset status drop down field
And I select fully rented option in current asset status field
Then I verify service project of investments is displayed
And I verify listing project of investments is displayed
When I click on current asset status drop down field
And I clear fully rented option in current asset status field
When I click on current asset status drop down field
And I select partially stabilized option in current asset status field
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on current asset status drop down field
And I select vacant option in current asset status field
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on current asset status drop down field
And I select under construction option in current asset status field
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on current asset status drop down field
And I select all option in current asset status field
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on current asset status drop down field
And I select reo option in current asset status field
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on current asset status drop down field
And I select vacant structure option in current asset status field
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on current asset status drop down field
And I select partially rented option in current asset status field
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on current asset status drop down field
And I select entitled option in current asset status field
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on current asset status drop down field
And I clear entitled option in current asset status field
And I click on asset strategy drop down
And I select acquisition option in asset strategy field
Then I verify service project of investments is displayed
And I verify listing project of investments is displayed
When I click on asset strategy drop down
And I clear acquisition option in asset strategy field
And I click on asset strategy drop down
And I select acquisition option in asset strategy field
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on asset strategy drop down
And I clear acquisition option in asset strategy field
And I click on asset strategy drop down
And I click on sale leaseback option in strategy of investment direct into search
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on asset strategy drop down
And I click on stable income producing option in strategy of investment direct into search
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on asset strategy drop down
And I click on quick flip option in strategy of investment direct into search
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on asset strategy drop down
And I click on restructuring option in strategy of investment direct into search
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on asset strategy drop down
And I click on recapitalization option in strategy of investment direct into search
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on asset strategy drop down
And I click on land bank option in strategy of investment direct into search
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on asset strategy drop down
And I click on change of use option in strategy of investment direct into search
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on asset strategy drop down
And I click on development option in strategy of investment direct into search
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on asset strategy drop down
And I click on platform build option in strategy of investment direct into search
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on asset strategy drop down
And I click on pursuit option in strategy of investment direct into search
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on asset strategy drop down
And I click on lease up option in strategy of investment direct into search
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on asset strategy drop down
And I click on work out option in strategy of investment direct into search
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on asset strategy drop down
And I click on restructuring corporate option in strategy of investment direct into search
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on asset strategy drop down
And I click on public to private option in strategy of investment direct into search
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on asset strategy drop down
And I click on rezoning option in strategy of investment direct into search
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on asset strategy drop down
And I click on renovation option in strategy of investment direct into search
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on asset strategy drop down
And I click on forward commitment option in strategy of investment direct into search
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on asset strategy drop down
And I click on others option in strategy of investment direct into search
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on asset strategy drop down
And I click on all option in strategy of investment direct into search
Then I verify 'ANDREW PROJECT' and 'GARY LISTING' of investments is displayed
When I click on asset strategy drop down
And I clear all option in strategy of investment direct into search
And I click on return profile in investment direct into
And I select COC Percent value in return profile
Then I verify service project of investments is displayed
And I verify listing project of investments is displayed
When I clear COC Percent value in return profile
And I click Leveraged check box
Then I verify service project of investments is displayed
And I verify listing project of investments is displayed
When I clear Leveraged check box
And I select IRR Percent value in return profile
Then I verify service project of investments is displayed
And I verify listing project of investments is displayed
When I clear IRR Percent value in return profile
And I select ROE Percent value in return profile
Then I verify service project of investments is displayed
And I verify listing project of investments is displayed
When I clear ROE Percent value in return profile
And I click Actual check box
Then I verify service project of investments is displayed
And I verify listing project of investments is displayed
When I clear Actual check box
And I select CAP Percent value in return profile
Then I verify service project of investments is displayed
And I verify listing project of investments is displayed
When I clear CAP Percent value in return profile
And I click Pro Forma check box
Then I verify service project of investments is displayed
And I verify listing project of investments is displayed
When I clear Pro Forma check box
And I select holding min value in return profile
Then I verify service project of investments is displayed
And I verify listing project of investments is displayed
When I clear holding min value in return profile
And I select holding max value in return profile
Then I verify service project of investments is displayed
And I verify listing project of investments is displayed
When I clear holding max value in return profile
And I click on return profile in investment direct into
And I click on geographical coverage field in investment search
And I click on countries field in investment search
And I select United States checkbox in countries field of investment search
And I click on region field in investment search
And I click on NorthEast region in investment search
And I click on states field in investment search
And I click on New Jersey state in investment search
And I click on cities field in investment search
And I enter and select Kearny city in investment search
Then I verify service project of investments is displayed
And I verify listing project of investments is displayed
When I logout from RealConnex application