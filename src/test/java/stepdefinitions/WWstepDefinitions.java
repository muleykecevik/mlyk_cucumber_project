package stepdefinitions;

import io.cucumber.java.en.Given;

public class WWstepDefinitions {
    {

        ParentStudentPage parenStudentstepDef= new ParentStudentPage();


        //US43_TC01 Step Defi.

        @Given("User goes to {string}")
        public void user_goes_to(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("studentLoginUrl"));
    }
        @Given("User enters {string} address")
        public void user_enters_address(String email) {
        parenStudentstepDef.enterUserName(email);
    }
        @Given("User enters {string}")
        public void user_enters(String password) {
        parenStudentstepDef.enterPassword(password);
    }
        @Given("User clicks the sign in button")
        public void user_clicks_the_button () {
        parenStudentstepDef.clickSignin();
    }
        @Given("User verifies that she has entered the student panel")
        public void user_verifies_that_she_has_entered_the_student_panel() {
        parenStudentstepDef.studentPanelisEntered();
    }
        @Given("User closes driver")
        public void user_closes_driver() {
        Driver.closeDriver();
    }

        //US43_TC02 Step Defi.

        @Given("User enters {string} in password box.")
        public void user_enters_in_password_box(String wrongPassword1) {
        parenStudentstepDef.enterWrongPassword(wrongPassword1);
    }
        @Given("User verifies that she has not entered the student panel")
        public void user_verifies_that_she_has_not_entered_the_student_panel() {
        parenStudentstepDef.invalidEmailorPasswordTextisDisplayed();
    }
        @Given("User enters {string} email address")
        public void user_enters_email_address(String unvalidEmail) {
        parenStudentstepDef.enterUnvalidEmail(unvalidEmail);
    }
        @Given("User clicks forgot password button")
        public void user_clicks_forgot_password_button() {
        parenStudentstepDef.clickForgotPassword();
    }
        @Given("User enters {string} again")
        public void user_enters_again(String studentEmail) {
        parenStudentstepDef.enterForgotPasswordEmailBox(studentEmail);
    }
        @Given("User chooses student button")
        public void user_chooses_student_button() {
        parenStudentstepDef.clickStudentRadioButton();
    }
        @Given("User clicks submit button")
        public void user_clicks_submit_button() {
        parenStudentstepDef.clickForgotPasswordSubmitButton();
    }
        @Given("User verify that email was sent for change password.")
        public void user_verify_that_email_was_sent_for_change_password() {
        Assert.assertFalse(parenStudentstepDef.forgotPasswordTextIsDisplayed());
    }
        //US 44
        @Given("User clicks Profile Image Icon")
        public void user_clicks_profile_image_icon() {
        parenStudentstepDef.clickStudentImageButton();
    }
        @Given("User clicks Change Password button")
        public void user_clicks_change_password_button() {
        parenStudentstepDef.clickChangePasswordButton();
    }
        @Given("User enters {string} in current password box")
        public void user_enters_in_current_password_box(String currentPassword) {
        parenStudentstepDef.enterCurrentPassword(currentPassword);
    }
        @Given("User enters {string} in new password box.")
        public void user_enters_in_new_password_box(String newPassword) {
        parenStudentstepDef.enterNewPassword(newPassword);
    }
        @Given("User enters {string} in confirm password box.")
        public void user_enters_in_confirm_password_box(String currentPassword) {
        parenStudentstepDef.enterConfirmPassword(currentPassword);
    }
        @Given("User clicks Save button")
        public void user_clicks_save_button() {
        parenStudentstepDef.clickChangePasswordSaveButton();
    }
        @Given("User verify that she has received a success message stating that her password has been changed successfully.")
        public void user_verify_that_she_has_received_a_success_message_stating_that_her_password_has_been_changed_successfully() {
        Assert.assertTrue(parenStudentstepDef.passwordHasBeenChangedText.isDisplayed());
    }
        @Given("User verify that he has received password is invalid message")
        public void user_verify_that_he_has_received_password_is_invalid_message() {
        Assert.assertTrue(parenStudentstepDef.passwordIsInvalidText.isDisplayed());
    }
        @Given("User enters {string} in new password boxx")
        public void user_enters_new_password_boxx(String unvalidPass) {
        unvalidPass=ConfigReader.getProperty("wrongpassword");
        parenStudentstepDef.enterNewPassInNewPasswordBox(unvalidPass);
    }
        @Given("User enters {string} confirm password")
        public void user_enters_confirm_password(String unvalidPass) {
        unvalidPass=ConfigReader.getProperty("wrongpassword");
        parenStudentstepDef.enterUnvalidPasswordInConfirmPasswordBox(unvalidPass);
    }
        @Given("User verify that password was not changed.")
        public void user_verify_that_password_was_not_changed() {
        Assert.assertTrue(parenStudentstepDef.passwordHasBeenChangedText.isDisplayed());
    }
        @Given("User clicks Change Username section")
        public void user_clicks_change_username_section() {
        parenStudentstepDef.changePassPageChangeUsernameButton.click();
    }
        @Given("User enters {string} in current username box.")
        public void user_enters_in_current_username_box(String currentUsername) {
        parenStudentstepDef.enterCurrentUsername(currentUsername);
    }
        @Given("User enters {string} in new username box.")
        public void user_enters_in_new_username_box(String newUsername) {
        parenStudentstepDef.enterNewUsername(newUsername);
    }
        @Given("User enters {string} again in confirm username box.")
        public void user_enters_again_in_confirm_username_box(String confirmUsername) {
        parenStudentstepDef.enterConfirmUsername(confirmUsername);
    }
        @Given("User clicks save buttonn.")
        public void user_clicks_save_buttonn() {
        parenStudentstepDef.changeUsernamePageSaveButton.click();
    }
        @Given("User verifies that username was changed correctly and received a success message stating that their username has been changed successfully.")
        public void user_verifies_that_username_was_changed_correctly_and_receive_a_success_message_stating_that_their_username_has_been_changed_successfully() {
        Assert.assertTrue(parenStudentstepDef.usernameChangedSuccessfullyMessage.isDisplayed());
    }
        @Given("User verifies that username was not changed.")
        public void user_verifies_that_username_was_not_changed() {
        Assert.assertTrue(parenStudentstepDef.usernameIsInvalidMessage.isDisplayed());
    }
        @Given("User clicks My Profile section.")
        public void user_clicks_my_profile_section() {
        parenStudentstepDef.studentPageMyProfileSection.click();
    }
        @Given("User verifies that she is able to view the Student's name, Admission No, Class, Section, and Gender.")
        public void user_verifies_that_she_is_able_to_view_the_student_s_name_admission_no_class_section_and_gender() {
        Assert.assertTrue(parenStudentstepDef.myProfileSectionsIsDisplayed());
    }
        @Given("User verifies that she is able to view and able the Profile, Fees, Exam, and Documents segments.")
        public void user_verifies_that_she_is_able_to_view_and_able_the_profile_fees_exam_and_documents_segments() {


    }


    }
}
