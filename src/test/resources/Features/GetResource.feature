Feature: Validate get user API

  Scenario: Validate I can get the resource when calling this API endpoint
    Given I have set get single user service endpoint
    When I send the GET API request
    Then I should receive an expected API response status code
    And receive the expected user details
