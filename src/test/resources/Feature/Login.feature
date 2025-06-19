Feature: login functionality

@login
Scenario Outline: login with valid credential
    Given user on home page using valid <username> and <password>

    Examples:
      | username  | password      |
      |   "Admin" |    "admin123" |
