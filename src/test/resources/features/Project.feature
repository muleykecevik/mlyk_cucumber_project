Feature: US43, US44, US45, US46, US47



  Scenario: US43_TC01 The user should be able to log into the Student Panel with a valid username and valid password.

    * User goes to "URL"
    * User enters "email" address
    * User enters "password"
    * User clicks the sign in button
    * User verifies that she has entered the student panel
    * User closes driver


  Scenario: US43_TC02 The user shouldn't be able to log into the Student Panel with a wrong password or a wrong username.

    * User goes to "URL"
    * User enters "email" address
    * User enters "wrongpassword" in password box.
    * User clicks the sign in button
    * User verifies that she has not entered the student panel
    * User enters "unvalid" email address
    * User enters "password"
    * User verifies that she has not entered the student panel
    * User closes driver


  Scenario: US43_TC03 The user should be change his password in the "Forgot Password" page.

    * User goes to "URL"
    * User clicks forgot password button
    * User enters "email" again
    * User chooses student button
    * User clicks submit button
    * User verify that email was sent for change password.
    * User closes driver


  Scenario: US44_TC01 The user should be able to change his password with valid password

    * User goes to "URL"
    * User enters "email" address
    * User enters "password"
    * User clicks the sign in button
    * User clicks Profile Image Icon
    * User clicks Change Password button
    * User enters "currentpassword" in current password box
    * User enters "newpassword" in new password box.
    * User enters "newpasswordAgain" in confirm password box.
    * User clicks Save button
    * User verify that she has received a success message stating that her password has been changed successfully.
    * User closes driver


  Scenario: US44_TC02 The user shouldn't be able to change his password unless he enter correct password combination

    * User goes to "URL"
    * User enters "email" address
    * User enters "password"
    * User clicks the sign in button
    * User clicks Profile Image Icon
    * User clicks Change Password button
    * User enters "currentpassword" in current password box
    * User enters "newpassword" in new password box.
    * User enters "wrongnewpassword" in confirm password box.
    * User clicks Save button
    * User verify that he has received password is invalid message
    * User closes driver

  Scenario: US44_TC03 The user shouldn't be able to change his password unless he enter  min 6 character and special character in password

    * User goes to "URL"
    * User enters "email" address
    * User enters "password"
    * User clicks the sign in button
    * User clicks Profile Image Icon
    * User clicks Change Password button
    * User enters "currentPassword" in current password box
    * User enters "unvalidNewPassword" in new password boxx
    * User enters "unvalidNewPassword" confirm password
    * User clicks Save button
    * User verify that password was not changed.
    * User closes driver


  Scenario:  US_045 TC01 The user should be able to change his username from student page with valid username.

    * User goes to "URL"
    * User enters "email" address
    * User enters "password"
    * User clicks the sign in button
    * User clicks Profile Image Icon
    * User clicks Change Password button
    * User clicks Change Username section
    * User enters "currentUsername" in current username box.
    * User enters "new username" in new username box.
    * User enters "new username" again in confirm username box.
    * User clicks save buttonn.
    * User verifies that username was changed correctly and received a success message stating that their username has been changed successfully.
    * User closes driver


  Scenario: US_045 TC02 The user shouldn't be able to change his username unless he enter valid username.

    * User goes to "URL"
    * User enters "email" address
    * User enters "password"
    * User clicks the sign in button
    * User clicks Profile Image Icon
    * User clicks Change Password button
    * User clicks Change Username section
    * User enters "currentUsername" in current username box.
    * User enters "new username" in new username box.
    * User enters "wrongNewUsername" again in confirm username box.
    * User clicks save buttonn.
    * User verifies that username was not changed.
    * User closes driver


  Scenario: US_046 TC01 User should be able to view the Student's name, Admission No, Class, Section, and Gender from student Panel.

    * User goes to "URL"
    * User enters "email" address
    * User enters "password"
    * User clicks the sign in button
    * User clicks My Profile section.
    * User verifies that she is able to view the Student's name, Admission No, Class, Section, and Gender.
    * User closes driver
  @query4
  Scenario: US_046 TC02 User should be able to view the Profile, Fees, Exam, and Documents segments.

    * User goes to "URL"
    * User enters "email" address
    * User enters "password"
    * User clicks the sign in button
    * User clicks My Profile section.
    * User verifies that she is able to view and able the Profile, Fees, Exam, and Documents segments.
    * User closes driver

  Scenario: [TC_003->US_046] User should be able to see the functions of the Profile, Fees, Exam, and Documents segments and the fields under these segments.

    * User goes to "URL"
    * User enters "email" address
    * User enters "password"
    * User clicks the sign in button
    * User clicks My Profile section.
    * User verifies that she is able to see the fields under the Profile section, fees section, exam section and documents section.
    * User closes driver

  Scenario: [TC_001->US_047] The user should be able to view column fields in the "Upcoming Homework" segment from Homework section.

    * User goes to "URL"
    * User enters "email" address
    * User enters "password"
    * User clicks the sign in button
    * User clicks Homework section
    * User verifies that she views column fields in the "Upcoming Homework" segment
    * User closes driver

  Scenario: [TC_002->US_047] The user should be able to access the homework details and send a message in the "Action" section.

    * User goes to "URL"
    * User enters "email" address
    * User enters "password"
    * User clicks the sign in button
    * User clicks Homework section
    * User clicks view/edit button in the action section
    * User enters a message
    * User clicks save button
    * User verifies that message was sent
    * User closes driver

  Scenario: [TC_003->US_047] The user should be able to send a message from the "Action" section in the "Closed Homework" segment

    * User goes to "URL"
    * User enters "email" address
    * User enters "password"
    * User clicks the sign in button
    * User clicks Homework section
    * User clicks closed homework section
    * The User clicks view/edit button in the action section
    * User enters a message
    * User clicks save button
    * User verifies that message was sent
    * User closes driver

  Scenario:[TC_004->US_047] The user should be able to enter the "Daily Assignment" segment, and add a new assignment from +Daliy Assignment button

    * User goes to "URL"
    * User enters "email" address
    * User enters "password"
    * User clicks the sign in button
    * User clicks Homework section
    * User clicks Daily Assignment button
    * User Clicks +daliy Assignment button
    * User selects subject
    * User enters title
    * User clicks save button
    * User verifiies that assignment was added
    * User closes driver

  Scenario: [TC_005->US_047] The user should be able to update and delete assignments from the "Action" section

    * User goes to "URL"
    * User enters "email" address
    * User enters "password"
    * User clicks the sign in button
    * User clicks Homework section
    * User clicks Daily Assignment button
    * User clicks delete button
    * User Clicks ok on the alert
    * User Verifies that message was deleted
    * User closes driver

  Scenario: [TC_006->US_047] The user should verify the column fields in the "Daily Assignment List" page

    * User goes to "URL"
    * User enters "email" address
    * User enters "password"
    * User clicks the sign in button
    * User clicks Homework section
    * User clicks Daily Assignment button
    * User verifies that the column fields in the "Daily Assignment List" page
    * User closes driver