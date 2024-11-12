Feature: ParaBank Login Testing
Description: user should already have an account 
##Background: 
@regression @smoke
Scenario Outline: As an Parabank User, I want to login in my Bank accountwith valide credantial,
 so that I can use my bank website
 
 Given Open the browser
 And Pass the URL "<URL>"
 When Enter username in the username field "<username>"
 And  Enter password in the password field "<password>"
 And Click on Login button
 Then validate that Login is successful
 Examples:
 |URL                                             |username| password |
 |https://parabank.parasoft.com/parabank/index.htm|Tasmim47|taswas1021|
 
 @functional
 Scenario Outline: As a Parabank user, I want to signin with only username but no password,
 so that an error message will be displayed
  Given Open the browser
 And Pass the URL "<URL>"
 When Enter username in the username field "<username>"
  And Click on Login button
 Then validate that error message is displayed
  Examples:
 |URL                                             |username|
 |https://parabank.parasoft.com/parabank/index.htm|Tasmim47|
 