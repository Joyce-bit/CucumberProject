# https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

Feature: Login feature of orangehrmlive application

Scenario: User login with valid email and password
Given User is in login page
When User enter valid email
And User enter valid password
And User clicks on login button
Then User should be able to login to the application sucessfully