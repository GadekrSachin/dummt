Feature: login functionality

@login
Scenario Outline: login with valid credential
    Given user on home page using valid <username> and <password>

    Examples:
      | username  | password      |
      |   "Admin" |    "admin123" |


@login_with_invalid
Scenario Outline: login with Invalid credential
    Given getting error using Invalid <username> and <password>

    Examples:
      | username  | password      |
      |   "52633" |    "admin123" |