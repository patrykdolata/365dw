Feature: Hello World

  Scenario: Which I see welcome message on front page 
    Given that front page adress is 'http://localhost:8080/'
    When I run front page
    Then site will be contain text 'Hello World!'