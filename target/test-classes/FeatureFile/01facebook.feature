Feature: To validate login funcnality of facebook application
Background: 
Given To launch the chrome browser and hit the fb url

  Scenario: To valdate invalide username and valide password
    #Given To launch the chrome browser and hit the fb url
    When To pass the value in emailfied
    And To pass the value in passwordfied
    And To click the login button
    Then To close the chrome browser

  Scenario Outline: To valdate valide username and valide password
    #Given Usr has To launch the chrome browser
    When User has To pass the value "<emailfield>" in email field
    And User has To pass the value "<passwordfield>" in password field
    And User has To click the login button
    Then User has To close the chrome browser

    Examples: 
      | emailfield             | passwordfield |
      | java123@gmail.com      |         55555 |
      | selenium123@gmail.com  |       7777777 |
      | python123@gmail.com    |      12345678 |
      | framework123@gmail.com |      99999999 |
