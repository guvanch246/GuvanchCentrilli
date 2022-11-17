@Regression @CNTR-780
Feature: Centrilli application Employment Functionality

  Background: User is logged in
    Given user is logged in the application

@CNTR-762
  Scenario: Verify that user can create an Employee
    When user clicks on Employees module
    Then user clicks on the create button
    And user enters employee's name
    Then user clicks save button
    And user can see employee's name on an Employee page

  @CNTR-763
  Scenario: Verify that user cannot create an Employee without typing name (empty name)
    When user clicks on Employees module
    And user clicks on the create button
    And user clicks save button
    Then user should see the error message

  @CNTR-764
  Scenario: Verify that user can cancel creating by clicking Discard button
    When user clicks on Employees module
    And user clicks on the create button
    And user clicks on discard button
    Then user cancels by clicking Discard button and sees create button


  @CNTR-765
  Scenario: Verify that page title is changed to the new Employee name after user create the Employee
    When user clicks on Employees module
    Then user clicks on the create button
    And user enters employee's name
    Then user clicks save button
    And user sees the title is changed to the new Employee name

  @CNTR-766
  Scenario: Verify that “Employee created” message is displayed at the bottom of the page (after creating a new Employee)
    When user clicks on Employees module
    Then user clicks on the create button
    And user enters employee's name
    And user clicks save button
    Then user sees the Employee created message at the bottom of the page

  @CNTR-767
  Scenario: Verify that user can find the new created Employee under Employee list by using search box
    When user clicks on Employees module
    Then user clicks on the create button
    And user enters employee's name
    Then user clicks save button
    When user clicks on Employees module
    Then user types employee's name  in the search box and presses enter
    And user can find the new created employee under Employee list

  @CNTR-768
  Scenario: Verify that user can change Employee display to Kanban / List
    Then user clicks on Employees module
    Then user clicks on list button
    And user clicks on kanban button
    Then user sees the change on Employee display from Kanban to List

  @CNTR-769
  Scenario: Verify that all Employee number increased 1
    When user clicks on Employees module
    And user clicks on create button
    Then user enters employee's name
    And user clicks save button
    And user clicks on Employees module
    Then user sees that all employee number increased one




