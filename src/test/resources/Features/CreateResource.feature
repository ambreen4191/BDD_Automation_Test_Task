Feature: Validate create user API

  Scenario: Validate I can create the resource when calling this API endpoint
    Given I have set create single user service endpoint
    And set its payload
    When I send the POST API request
    Then I should see the user I created in API response
