Feature: Login Functionality

Scenario: Validate Login functionality with multiple credentials
Given user should open chrome browser
When user enter valid username 
And user enter valid passsword 
And user click on login button
Then Page should be navigated to home page
And Close the browser

Scenario: Validate Login functionality with invalid credentials
Given user should open chrome browser
When user enter invalid username 
And user enter invalid passsword 
And user click on login button
Then Error message should be displayed
And Close the browser