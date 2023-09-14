Feature: To validate account signin of amazon application

Scenario: To signin amazon account

Given To launch the chrome browser and window maimize
When To launch the url of the amazon application
When To click a accounts and lists
When To pass the mobile or email in textbox
|6380403607|7639749369|8610817347|7374222168|
When To click the continue button
When To pass the password in textbox
|123456|789468|859538|8899380|
When To click the signin button
Then To close the chrome browser
