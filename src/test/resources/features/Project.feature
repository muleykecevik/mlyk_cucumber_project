Feature: US43 As a user, I should be able to log into the Student Panel with a username and password.


  @query4
  Scenario: TC01 The user should be able to log into the Student Panel with a valid username and valid password.

    * User goes to "URL"
    * User enters  "email" address
    * User enters "password"
    * User clicks the sign in button
    * User verifies that she has entered the student panel

  Scenario: TC02 The user shouldn't be able to log into the Student Panel with a wrong password or a wrong username.

    * User goes to "URL"
    * User enters valid email address
    * User enters wrong password
    * User verifies that she has not entered the student panel
    * User enters unvalid email address
    * User enters password
    * User verifies that she has not entered the student panel

  Scenario: TC03 The user should be change his password in the "Forgot Password" page.

    * User goes to "URL"
    * User clicks forgot password button
    * User enters her e mail
    * User chooses student button
    * User clicks submit button


  Scenario: US44_TC01 The user should be able to change his password with valid password

    * User goes to "URL"
    * User enters  "email" address
    * User enters "password"
    * User clicks the sign in button
    * User clicks Profile Image Icon
    * User clicks Change Password button
    * User enters Current password
    * User enters New password
    * User enters confirm password
    * User clicks Save button
    * User verify that she has received a success message stating that her password has been changed successfully.

  Scenario: US44_TC02 The user shouldn't be able to change his password unless he enter correct password combination

    * User goes to "URL"
    * User enters  "email" address
    * User enters "password"
    * User clicks the sign in button
    * User clicks Profile Image Icon
    * User clicks Change Password button
    * User enters Current password
    * User enters New password
    * User enters wrong confirm password
    * User clicks Save button
    * User verify that password was not changed.

  Scenario: US44_TC03 The user shouldn't be able to change his password unless he enter  min 6 character and special character in password

    * User goes to "URL"
    * User enters  "email" address
    * User enters "password"
    * User clicks the sign in button
    * User clicks Profile Image Icon
    * User clicks Change Password button
    * User enters Current password
    * User enters unvalid New password
    * User enters confirm password
    * User clicks Save button
    * User verify that password was not changed.
