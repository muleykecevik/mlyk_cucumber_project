package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WonderworldPAge {

    public WonderworldPAge (){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //[US43_TC01]
    @FindBy (id = "//input[@id='email']")
    public WebElement studentEmailBox;
    @FindBy (id = "//input[@id='password']")
    public WebElement studentPasswordBox;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement studentLoginPageSinginButton;
    @FindBy(xpath ="//div[@class='col-lg-3 col-md-3 col-sm-3']" )
    public WebElement studentPageNoImage;

    @FindBy (xpath = "//*[text()='Invalid Username Or Password']")
    public WebElement invalidText;

    //[US43_TC03]
    @FindBy (xpath = "//a[@class='forgot']")
    public WebElement studentPageForgotPassword;
    @FindBy (id = "//input[@id='form-username']")
    public WebElement forgotPasswordEmailBox;
    @FindBy(xpath = "(//input[@type='radio'])[1]")
    public WebElement studentRadioButton;
    @FindBy (xpath = "//button[@type='submit']")
    public WebElement forgotPasswordSubmitButton;

    //US44_TC01

    @FindBy (xpath = "//img[@class='topuser-image']")
    public WebElement studentImageButton;
    @FindBy(xpath = "//*[text()=' Change Password']")
    public WebElement studentProfileChangePasswordButton;
    @FindBy (xpath = "//input[@name='current_pass']")
    public WebElement changePasswordPageCurrentPassBox;
    @FindBy(xpath = "//input[@name='new_pass']")
    public WebElement changePasswordPageNewPassBox;
    @FindBy(id = "//input[@id='confirm_pass']")
    public WebElement changePasswordPageConfirmPassBox;
    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement changePassPageSaveButton;

    //US45
    @FindBy(xpath = "//*[text()='Change Username']")
    public WebElement ChangePassPageChangeUsernameButton;
    @FindBy(xpath = "//input[@name='current_username']")
    public WebElement changeUsernameCurrentUsername;
    @FindBy(xpath = "//input[@name='new_username']")
    public WebElement changeUsernameNewUsername;
    @FindBy (xpath = "//input[@name='confirm_username']")
    public WebElement changeUsernameConfirmUsername;
    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement changeUsernamePageSaveButton;

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

    //US47
    @FindBy (xpath = "//*[text()='Homework']")
    public WebElement studentPageHomework;
    @FindBy(xpath = "//tbody/tr[1]/td[1]") ////tbody/tr[1]/td[1,2,3,4,5,6,7,8,9,10,11]
    public WebElement upcomingHomeworkColumns;
    @FindBy (xpath = "//tbody/tr[1]/td[11]")
    public WebElement upcomingHomeworkActionButton;
    @FindBy( id = "//textarea[@id='assigment_message']")
    public WebElement homeworkDetailsMessageBox;
    @FindBy (id = "//button[@id='submit']")
    public WebElement homeworkDetailsSaveButton;
    @FindBy (xpath = "//*[text()='  Daily Assignment']")
    public WebElement dailyAssignmentButton;
    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement newAssignmentButton;
    @FindBy (id = "//select[@id='subject']")
    public WebElement addDailyAssingmentSubjBox;
    @FindBy(id = "//input[@id='title']")
    public WebElement addDailyAssingmentTitleBox;
    @FindBy (xpath = "(//button[@type='submit'])[1]")
    public WebElement addDailyAssingmentSaveButton;
    @FindBy (xpath = "//tbody/tr[1]/td[1]")
    public WebElement firstAssignmentThatAdded;
    @FindBy (xpath = "(//a[@class='btn btn-default btn-xs edit_modal_btn'])[1]")
    public WebElement firstRowEditbutton;
    @FindBy (xpath = )











}
