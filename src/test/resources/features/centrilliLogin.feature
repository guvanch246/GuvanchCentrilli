Feature: Centrilli log in feature
  User Story :
  As a user, I should be able to log in.

@login
  Scenario: Login as Posmanager
    Given user is on the centrilli login page
    When user enters email
    And user enters password
    Then user clicks login


