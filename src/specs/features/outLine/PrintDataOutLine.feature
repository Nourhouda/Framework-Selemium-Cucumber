@PrintData
Feature: Print data - Text box
  As user I want to print my data

  @PrintData
  Scenario Outline: Print data - Text box
    Given Open application text box
    When I want to print FullName "<FullName>"
    When I want to print Email "<Email>"

    Examples: 
      | FullName | Email              |
      | Nour     | nour123@gmail.com  |
      | Rawen    | Rawen789@gmail.com |
