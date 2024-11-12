Feature: Parabank Logout testing
Description: Users Account is logged in
#Background
Scenario Outline: As a Parabank user, I want to log out from my bank account,
so that My account wil be safe 

 Given Open the browser
 And Pass the URL "<URL>"
 When Enter username in the username field "<username>"
 And  Enter password in the password field "<password>"
 And Click on Login button

And click on logout button
Then Validate that log out is successful
 Examples:
 |URL                                             |username| password |
 |https://parabank.parasoft.com/parabank/index.htm|Tasmim12344|tasmimrahman|
 