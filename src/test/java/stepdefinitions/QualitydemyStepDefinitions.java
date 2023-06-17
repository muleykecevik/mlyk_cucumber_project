package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.QualityDemyPage;

public class QualitydemyStepDefinitions {
    QualityDemyPage qualityDemyPage=new QualityDemyPage();
    @Then("ilk login linkine click yapar")
    public void ilk_login_linkine_click_yapar() {
        qualityDemyPage.ilkLoginLinki.click();

    }
    @Then("user email olarak {string} girer")
    public void user_email_olarak_girer(String email) {
        qualityDemyPage.emailKutusu.sendKeys(email);

    }
    @Then("password olarak {string} girer")
    public void password_olarak_girer(String password) {
        qualityDemyPage.passwordKutusu.sendKeys(password);

    }
    @When("login butonuna basar")
    public void login_butonuna_basar() {
        qualityDemyPage.loginButonu.submit();

    }
    @Then("giris yapilamadigini test eder.")
    public void giris_yapilamadigini_test_eder() {
        Assert.assertTrue(qualityDemyPage.emailKutusu.isEnabled());
    }

}
