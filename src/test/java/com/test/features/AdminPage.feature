Feature: User Management Page Under Admin Page

@UserMngmt
@regression
Scenario: Add New Users to the Database
Given I Navigate to Orange HRM URL And Login to the Application
Then I Click on "Admin" Link on Main Page
When I Click on "Add" User button
Then I Enter following User details in Add User Page
  | ESS | murali krishna | RaviKK | Enabled | Ravi@123 |



@Naty
Scenario: Validate All the Nationalities Present in the Portal
Given I Navigate to Orange HRM URL And Login to the Application
Then I Click on "Admin" Link on Main Page
Then I Click on Nationalities Link under Admin Section
Then I Validate the list of Nationalities in the page are as Expected