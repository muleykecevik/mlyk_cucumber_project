package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class WonderworldPAge {





        @FindBy(xpath = "//a[text()=' Parent Login']")        //  panelin olduğu ana sayfa
        private WebElement parentPanel;
        @FindBy(xpath = " //a[text()=' Student Login']")      // panelin olduğu ana sayfa
        private WebElement studentPanel;
        @FindBy(xpath = "//input[@name='username']")          // student login page
        public WebElement usernameStudentbox;
        @FindBy(id = "password")                              // student login page
        public WebElement passwordStudentbox;

        @FindBy(xpath = "//button[@type='submit']")            // student login page
        public WebElement signIn;
        @FindBy(id = "email")
        public WebElement usernameParent;
        @FindBy(xpath = "//span[text()='Teachers Reviews']")   // teachers review page
        public WebElement teachersReviewsStudent;
        @FindBy(tagName = "h3")                                 // teachers review page
        public WebElement teacherReviewsText;
        @FindBy(xpath = "//i[@class='fa fa-plus'][1]")          // teachers review page
        private WebElement teaacherPlus;

        @FindBy(id = "rate4")                                    // teachers review page
        private WebElement teacherYildiz;

        @FindBy(id = "submit")
        private WebElement saveTheacerStar;                       //teacher star pupup

        @FindBy(xpath = "//input[@class='form-control'][1]")       //teacher star pupup
        private WebElement commentbox;


        @FindBy(xpath = "//h3[text()='User Login']")
        private WebElement userLoginText;

        @FindBy(xpath = "//img[@alt='User Image']")                             // Sağ üstteki profil geörseli
        public WebElement profileUserImage;

        @FindBy(xpath = "//a[text()=' Change Password']")                        // Change password pup up
        public WebElement changePassword;
        @FindBy(xpath = "//input[@class='form-control col-md-7 col-xs-12'][1]")  // Change password pup up
        public WebElement currentPaswordBox;
        @FindBy(xpath = "//input[@name='new_pass']")
        public WebElement newPasswordBox;                                        // Change password page

        @FindBy (xpath = "//input[@name='confirm_pass']")                        // Change password page
        public WebElement confirmPasswordBox;

        @FindBy(xpath = "//button[@type='submit']")                              // Change password page
        public WebElement saveButton;

        @FindBy(xpath = "//span[text()='My Profile']")                            //Parent olarak girince profile section(soldaki meniü)
        public WebElement profileSection;

        @FindBy(xpath = "//div[@class='alert alert-danger']")                    // Login page
        public WebElement invalidUsernameOrPassword;

        @FindBy(xpath = "//a[@class='forgot']")                                  // Log in page
        public WebElement forgetPasswordButton;

        @FindBy(xpath = "//h3[text()='Forgot Password']")                        // Forget password page
        public WebElement forgetPasswordPage;

        @FindBy(xpath = "//strong[text()='Alert!']")                              // Change password page
        public WebElement messageChangePassword;


        public void logInForm() {
        String expectedText = "User Login";
        Assert.assertEquals(expectedText, userLoginText.getText());
    }


        public void writeacomment() {
        commentbox.sendKeys(ConfigReader.getProperty("comment"));
    }


        public void saveTeacherStar() {
        saveTheacerStar.click();
    }

        public void teacherStar() {
        teacherYildiz.click();
    }

        public void studentPanel() {
        studentPanel.click();
    }

        public void sendKeysPassword(String password) {
        passwordStudentbox.sendKeys(password);

    }

        public void sendKeysUsername(String username) {
        usernameStudentbox.sendKeys(username);

    }

        public void parentPanel() {
        parentPanel.click();
    }

        public void teacherPlus() {
        teaacherPlus.click();
    }



        //[US43_TC01]

        //Student Page Login form email box
        @FindBy(id = "email")
        private WebElement studentEmailBox;

        //Student Page Login form password box
        @FindBy (id = "password")
        private WebElement studentPasswordBox;

        //Student login page sign in button
        @FindBy(xpath = "//button[@type='submit']")
        private WebElement studentLoginPageSinginButton;

        //Student panel no image
        @FindBy(xpath ="//div[@class='col-lg-3 col-md-3 col-sm-3']" )
        private WebElement studentPageNoImage;

        @FindBy (xpath = "//*[text()='Invalid Username Or Password']")
        private WebElement invalidText;

        public void enterUserName(String email){
        email= ConfigReader.getProperty("studentEmail");
        studentEmailBox.sendKeys(email);
    }
        public void enterPassword(String password){
        password=ConfigReader.getProperty("studentPassword");
        studentPasswordBox.sendKeys(password);
    }
        public void clickSignin(){
        studentLoginPageSinginButton.click();
    }
        public void studentPanelisEntered(){
        studentPageNoImage.isDisplayed();
    }
        public void invalidEmailorPasswordTextisDisplayed(){
        invalidText.isDisplayed();
    }
        public void enterWrongPassword(String wrongPassword){
        wrongPassword=ConfigReader.getProperty("wrongpassword");
        studentPasswordBox.sendKeys(wrongPassword);
    }
        public void enterUnvalidEmail (String unvalidEmail){
        unvalidEmail=ConfigReader.getProperty("unvalidEmail");
        studentPasswordBox.sendKeys(unvalidEmail);

    }

        //[US43_TC03]
        @FindBy (xpath = "//a[@class='forgot']")
        private WebElement studentPageForgotPassword;
        @FindBy (xpath = "//input[@name='username']")
        private WebElement forgotPasswordEmailBox;
        @FindBy(xpath = "(//input[@type='radio'])[1]")
        private WebElement studentRadioButton;
        @FindBy (xpath = "//button[@type='submit']")
        private WebElement forgotPasswordSubmitButton;

        public void clickForgotPassword(){
        studentPageForgotPassword.click();
    }
        public void enterForgotPasswordEmailBox(String forgotPasswordEmail){
        forgotPasswordEmail= ConfigReader.getProperty("forgotPasswordEmail");
        forgotPasswordEmailBox.sendKeys(forgotPasswordEmail);
    }
        public void clickStudentRadioButton(){
        studentRadioButton.click();
    }
        public void clickForgotPasswordSubmitButton(){
        forgotPasswordSubmitButton.click();
    }
        public boolean forgotPasswordTextIsDisplayed(){
        studentPageForgotPassword.isDisplayed();
        return true;
    }

        //US44_TC01

        @FindBy (xpath = "//img[@class='topuser-image']")
        private WebElement studentImageButton;
        @FindBy(xpath = "//*[text()=' Change Password']")
        private WebElement studentProfileChangePasswordButton;
        @FindBy (xpath = "//input[@name='current_pass']")
        private WebElement changePasswordPageCurrentPassBox;
        @FindBy(xpath = "//input[@name='new_pass']")
        private WebElement changePasswordPageNewPassBox;
        @FindBy(id = "confirm_pass")
        private WebElement changePasswordPageConfirmPassBox;
        @FindBy(xpath = "(//button[@type='submit'])[1]")
        private WebElement changePassPageSaveButton;

        @FindBy(xpath = "//*[text()='Password has been changed successfully']")
        public WebElement passwordHasBeenChangedText;
        @FindBy(xpath = "//[text()='Password is invalid']")
        public WebElement passwordIsInvalidText;

        public void clickStudentImageButton(){
        studentImageButton.click();
    }
        public void clickChangePasswordButton(){
        studentProfileChangePasswordButton.click();
    }
        public void enterCurrentPassword(String currentPassword){
        currentPassword=ConfigReader.getProperty("studentPassword");
        changePasswordPageCurrentPassBox.sendKeys(currentPassword);
    }
        public void enterNewPassword(String newPassword){
        newPassword=ConfigReader.getProperty("newPassword");
        changePasswordPageNewPassBox.sendKeys(newPassword);
    }
        public void enterConfirmPassword(String confirmPassword){
        confirmPassword=ConfigReader.getProperty("newPassword");
        changePasswordPageNewPassBox.sendKeys(confirmPassword);}
        public void clickChangePasswordSaveButton (){
        changePassPageSaveButton.click();
    }

        public void enterNewPassInNewPasswordBox(String unvalidNewPass){
        unvalidNewPass=ConfigReader.getProperty("wrongpassword");
        changePasswordPageNewPassBox.sendKeys(unvalidNewPass);
    }
        public void enterUnvalidPasswordInConfirmPasswordBox(String unvalidPass){
        unvalidPass=ConfigReader.getProperty("wrongpassword");
        confirmPasswordBox.sendKeys(unvalidPass);
    }
        //US45
        @FindBy(xpath = "//*[text()='Change Username']")
        public WebElement changePassPageChangeUsernameButton;
        @FindBy(xpath = "//input[@name='current_username']")
        private WebElement changeUsernameCurrentUsername;
        @FindBy(xpath = "//input[@name='new_username']")
        private WebElement changeUsernameNewUsername;
        @FindBy (xpath = "//input[@name='confirm_username']")
        private WebElement changeUsernameConfirmUsername;
        @FindBy(xpath = "(//button[@type='submit'])[1]")
        public WebElement changeUsernamePageSaveButton;
        @FindBy (xpath = "//*[text()='Username has been changed successfully']")
        public WebElement usernameChangedSuccessfullyMessage;
        @FindBy(xpath = "//[text()='Username is invalid']")
        public WebElement usernameIsInvalidMessage;

        public void enterCurrentUsername(String currentUsername){
        currentUsername=ConfigReader.getProperty("studentEmail");
        changeUsernameCurrentUsername.sendKeys(currentUsername);
    }
        public void enterNewUsername(String newUsername){
        newUsername=ConfigReader.getProperty("newUsername");
        changeUsernameNewUsername.sendKeys(newUsername);
    }
        public void enterConfirmUsername(String confirmUsername){
        confirmUsername=ConfigReader.getProperty("newUsername");
        changeUsernameConfirmUsername.sendKeys(confirmUsername);
    }


        //US_46

        @FindBy(xpath = "//*[text()='My Profile']")
        public WebElement studentPageMyProfileSection;
        @FindBy(xpath = "//h3[@class='widget-user-username']")
        public WebElement myProfileName;
        @FindBy(xpath = "//h5[@class='widget-user-desc mb5']")
        public WebElement myProfileAdmissionNo;
        @FindBy(xpath = "(//a[@class='pull-right text-aqua'])[1]")
        public WebElement myProfileClass;
        @FindBy(xpath ="(//a[@class='pull-right text-aqua'])[2]" )
        public WebElement myProfileSection;
        @FindBy (xpath ="(//a[@class='pull-right text-aqua'])[3]")
        public WebElement myProfileGender;
        @FindBy(xpath = "//*[text()='Profile']")
        public WebElement myProfileProfileSection;
        @FindBy(xpath = "//*[text()='Exam']")
        public WebElement myProfileExamSection;
        @FindBy(xpath = "//*[text()='Documents']")
        public WebElement myProfileDocumentsSection;
        @FindBy(xpath = "//tbody/tr[1]/td[1]") //8 tane tr var 2 ser tane de td var
        public WebElement myProfileAdmissionDate;
        @FindBy(xpath = "//*[text()='Address Details']") //2 data 2 sütun
        public WebElement myProfileAddressDetalisHeader;
        @FindBy (xpath = "//div//tbody/tr[1]/td[1]")
        public WebElement myProfileAddresDetCurrentAddress;
        @FindBy(xpath = "//*[text()='Parent Guardian Detail ']") //12 data var 3 sütun var
        public WebElement myProfilePArentGuardianDetailsHeader;
        @FindBy(xpath = "//*[text()='Hostel Details']") //3 data var 2 sütun var
        public WebElement myProfileHostelDetailsHeader;
        @FindBy(xpath ="//*[text()='Miscellaneous Details']" ) //11 data var 2 sütum var
        public WebElement myProfileMiscellanaousDetailsHeader;

        public boolean myProfileSectionsIsDisplayed(){
        List<WebElement> sectionsList= new ArrayList<>();
        sectionsList.add(myProfileName);
        sectionsList.add(myProfileAdmissionNo);
        sectionsList.add(myProfileClass);
        sectionsList.add(myProfileSection);
        sectionsList.add(myProfileGender);

        for (WebElement each:sectionsList) {
            if (each.isDisplayed());

        }
        return true;
    }

        //US47
        @FindBy (xpath = "//*[text()='Homework']")
        public WebElement studentPageHomework;
        @FindBy(xpath = "//tbody/tr[1]/td[1]") ////tbody/tr[1]/td[1,2,3,4,5,6,7,8,9,10,11]
        public WebElement upcomingHomeworkColumns;
        @FindBy (xpath = "//tbody/tr[1]/td[11]")
        public WebElement upcomingHomeworkActionButton;
        @FindBy( id = "assigment_message")
        public WebElement homeworkDetailsMessageBox;
        @FindBy (id = "submit")
        public WebElement homeworkDetailsSaveButton;
        @FindBy (xpath = "//*[text()='  Daily Assignment']")
        public WebElement dailyAssignmentButton;
        @FindBy(xpath = "(//button[@type='button'])[3]")
        public WebElement newAssignmentButton;
        @FindBy (id = "subject")
        public WebElement addDailyAssingmentSubjBox;
        @FindBy(id = "title")
        public WebElement addDailyAssingmentTitleBox;
        @FindBy (xpath = "(//button[@type='submit'])[1]")
        public WebElement addDailyAssingmentSaveButton;
        @FindBy (xpath = "//tbody/tr[1]/td[1]")
        public WebElement firstAssignmentThatAdded;
        @FindBy (xpath = "(//a[@class='btn btn-default btn-xs edit_modal_btn'])[1]")
        public WebElement firstRowEditbutton;
        @FindBy (xpath = "(//i[@class='fa fa-remove'])[1]" )
        public WebElement firstRawDeleteButton;

    }

}
