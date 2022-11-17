@Smoke
Feature: Centrilli log in feature
  User Story :
  As a user, I should be able to log in.



  @CNTR-761
  Scenario: Login as Posmanager
    Given user is on the centrilli login page
    When user enters email "posmanager10@info.com"
    And user enters password "posmanager"
    Then user clicks login

