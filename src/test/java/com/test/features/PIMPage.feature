Feature: Personal Information Page

@regression @PIM
Scenario: Add New Users to the Database
Given I Navigate to Orange HRM URL And Login to the Application
Then I Click on "PIM" Link on Main Page
When I Click on "Add Employee" Menu Icon
When I Create New Employee in Add Employee Page
Then I Click on "Add Employee" Menu Icon
When I Click on "Employee List" Menu Icon
Then I Search Employee by Employee Name in Employee List Page
Then I Validate Whether the Employee is Created in the System