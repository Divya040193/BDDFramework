Feature: Register Functionality

Scenario: Validate Register Page
Given user should open chrome browser
When user enter opens url
And user enter name as "Divya" in name field
And user enter mobile number as "9876543210" in mobile field
And user enter email as "abc@123" in email field
And user enter password as "123456" in password field
And user click on SignIn button
Then verify registered successfully or not
And Close the browser