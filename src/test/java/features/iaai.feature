Feature: IAAI "Home page" login

  Scenario Outline:

    Given User is on landing "URL"
    When User login into application with "username" and "password"
    Then Navigated to the home page title
#    And Main menu is visible
    Examples:
      | URL             | username             | password  |
      | http://iaai.com | igors.acco@gmail.com | Dems_1975 |
