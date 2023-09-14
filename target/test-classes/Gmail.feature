Feature: To validate the login functionality of the gmail application
Scenario: To validate login with positive and negative combination of datas
Given To launch chrome browser and window maximize
When To launch the url of the gmail application
When To pass the email id in email field
When To click the next button
When To pass the email password in password field
When To click the next button
When To chek whether navigate to the home page or not
Then To close the browser 


Scenario Outline: To validate positive and negative combination of login functionality
Given User has to launch the browser and maximize the window
When User has to launch the gmail url
And User has to pass the valid email data "<emaildatas>" in email field
And User has to click the email field next button
And User has to pass the valid password data "<passworddatas>" in password field
And User has to click the passwor field next button
Then user has to close the browser

Examples:
|emaildatas                       |passworddatas    |
|dhanasekar00638@gmail.com        |6380403607       |
|dhansekar1303@gmail.com          |76397493         |
|abcde@gmail.com                  |1232345          |