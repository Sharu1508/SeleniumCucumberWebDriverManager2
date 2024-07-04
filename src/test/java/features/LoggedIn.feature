Feature: LoggedIn User View

    Scenario: Validate user is able to Login
      Given User navigates to the Login page
      When User successfully enters the Log in details
      Then User should be able to view the Product category page
