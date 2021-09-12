Feature: Dashboard Functionality
  @dash
  Scenario: Dashboard Verification
    When login with valid credentials
    Then verify the following dashboard tabs
      |Admin|PIM|Leave|Time|Recruitment|My Info|Performance|Dashboard|Directory|Maintenance|Buzz|