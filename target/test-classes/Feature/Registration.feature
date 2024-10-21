Feature: To test the registration form
Scenario Outline: To test the registration form with valid details
Given User launch the url
When User enters the "<Username>","<Email>", "<Password>","<Confirm_Password>"
And User clicks on the Register button
Then User should verify the message "Registration Successful"

  Examples: 
      | Username  | Email              | Password | Confirm Password |
      | Prem      | prem@gmail.com     | Viji@123 | Viji@123         |