Feature: Login Functionality
Scenario: Validate Login functionality with valid credentials

Given user should open chrome browser
When user enter valid username "<username>" and enter password "<password>"
And user click on login button
Then Page should be navigated to home page or else show error message
And Close the browser

    Examples: 
      | username  | password | 
      | admin |admin@123| 
      | user |admin@356|
      | kiran@gmil.com|123456|
