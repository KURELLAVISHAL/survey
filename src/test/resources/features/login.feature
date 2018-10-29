Feature: login and logout

  @tc-1
  Scenario: Open login page and do logout
    Given navigate to "http://stage.survey.hff.ukkoteknik.com/admin/"
    Then enter userid with "admin@gmail.com"
    Then enter password with "1111"
    And click on login button
    Then click on logout
    Then click on ok

  @tc-2
  Scenario Outline: validate login fields
    Given navigate to "http://stage.survey.hff.ukkoteknik.com/admin/"
    Then enter userid with "<x>"
    Then enter password with "<y>"
    And click on login button

    Examples: 
      | x               | y    |
      |                 |      |
      | admin@gmail.com | 2222 |
      | admi@gmail.com  | 1111 |
      | admin@gmail.com | 1111 |
