package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutoExPage {

    public AutoExPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[text()=' Signup / Login']")
    public WebElement signUpLink;
    @FindBy(xpath ="//input[@name='name']" )
    public WebElement signUpNameBox;
    @FindBy (xpath = "(//input[@placeholder='Email Address'])[2]")
    public WebElement signUpEmailBox;
    @FindBy (xpath = "//*[text()='New User Signup!']")
    public WebElement signUpButton;
    @FindBy (xpath ="//*[@id='id_gender1']")
    public WebElement mrButton;

    @FindBy (xpath = "//input[@data-qa='login-email']")
    public WebElement loginEmailbox;
    @FindBy (xpath ="//input[@data-qa='login-password']" )
    public WebElement loginPasswordBox;

}
