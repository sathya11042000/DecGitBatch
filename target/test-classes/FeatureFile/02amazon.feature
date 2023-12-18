Feature: To validate login funcnality of amazon application

  Scenario: To valdate positive username and positive password
    Given Launch the chrome browser
    When pass the value in emailfied
    And click the continue button
    And pass the value in passwordfied
    And click singin button
    Then close the chrome browser

  Scenario: valdate positive username and positive password
    Given to Launch the chrome browser
    When to pass the value in emailfied
    And to click the continue button
    And to pass the value in passwordfied
    And to click singin button
    Then to close the chrome browser
