
@webTable
Feature: Protractor app web table feature

  Background: In this feature file User expect to be on web table page for each scenario
    Given User navigate to web table page


  Scenario:Add a user and validate the user has been added to the table
    When User click the Add User button and open the user table
    And User enters First Name "Omer"
    And User enters Last Name "Guven"
    And User enters User Name "OG"
    And User enters Password "123456789"
    And User select Customer "Company AAA"
    And User select Role "Admin"
    And User enter E-mail "aaa@hotmail.com"
    And User enter Cell Phone "2134567421"
    When User click the save button
    Then User validated new user "OG" has been added to web table


    Scenario:Delete the user "novak" from the table and validate the user has been deleted.
      When User delete the username "novak" from web tables
      Then User validate the username "novak" has been deleted