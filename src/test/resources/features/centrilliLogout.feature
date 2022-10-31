Feature: Centrilli log out feature
  User Story :
  As a user, I should be able to log out.

@logout
  Scenario: Logout as Posmanager
  Given user is on the centrilli login page
  When user enters email
  And user enters password
  Then user clicks login
  And user clicks POSManager10
  Then user clicks logout