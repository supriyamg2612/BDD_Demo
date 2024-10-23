Feature: JBK Offline Application Test


@Title 
Scenario: Logo Test

Cucumber hooks will set up the browser
#Given user should be on login page
Then user should see JBK logo



@logo
Scenario: HomePage Title Test

Cucumber hooks will set up the browser
#Given user should be on login page
Then user verify title of home page


@login
Scenario Outline: Login Test

#Cucumber hooks will set up the browser
#Given user should be on login page
When  user enters "<username>" and "<password>"
Then user verify "<title>"

Examples:
|username|password|title|
|kiran@gmail.com|123456|Dashboard|
|pari@gmail.com|6789|Log in|


