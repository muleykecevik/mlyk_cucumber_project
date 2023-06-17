package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutoExPage;
import utilities.Driver;

public class AutomationExercisesStepDefinitions {
    AutoExPage autoExPage=new AutoExPage();
    Faker faker=new Faker();
    String email;
    Actions actions;
    @Given("user sign up linkine tiklar")
    public void user_sign_up_linkine_tiklar() {
        autoExPage.signUpLink.click();
    }
    @Given("user Create an account bolumune name ve email adresi girer")
    public void user_create_an_account_bolumune_name_ve_email_adresi_girer() {
        autoExPage.signUpNameBox.sendKeys(faker.name().firstName());
        email=faker.internet().emailAddress();
        autoExPage.signUpEmailBox.sendKeys(email);

    }
    @Given("signUp butonuna basar")
    public void sign_up_butonuna_basar() {
        autoExPage.signUpButton.click();

    }
    @Given("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {
        actions=new Actions(Driver.getDriver());
        actions.click(autoExPage.mrButton).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(faker.internet().password()).sendKeys(Keys.TAB).
                sendKeys("2").sendKeys(Keys.TAB)
                .sendKeys("May").sendKeys(Keys.TAB).
                sendKeys("1998").sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();


    }
    @Given("user Create Account butonuna basar")
    public void user_create_account_butonuna_basar() {

    }
    @Then("hesap olustugunu test edin")
    public void hesap_olustugunu_test_edin() {

    }

    @Given("Login to your account bolumunde e mail kutusuna @isareti olmayan email adresi yazar")
    public void login_to_your_account_bolumunde_e_mail_kutusuna_isareti_olmayan_email_adresi_yazar() {
    autoExPage.loginEmailbox.sendKeys("bybyworld");
    }
    @Given("password kutusuna  sifre yazar ve enter’a tiklar")
    public void password_kutusuna_sifre_yazar_ve_enter_a_tiklar() {
    autoExPage.loginPasswordBox.sendKeys("seeyousoon");
    }

    @Then("sisteme giris yapilamadigini test eder")
    public void sistemeGirisYapilamadiginiTestEder() {

        Assert.assertTrue(autoExPage.loginPasswordBox.isEnabled());
    }
}
