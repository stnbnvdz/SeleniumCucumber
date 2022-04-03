Feature: Google
  Scenario: Go to Google
    Given I redirect to google page
    When I enter "google"
    And I click search
    Then the google search should be displayed