Feature: To validate login funcnality of amazon application

  Scenario: To valdate positive username and positive password
    Given Launch the chrome browser
    When pass the value in emailfied
    And click the continue button
    And pass the value in passwordfied
    And click singin button
    Then close the chrome browser
