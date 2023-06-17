package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import pages.HerokuPage;

public class HerokuappStepdefinitions {
    HerokuPage herokuPage=new HerokuPage();
    @Then("Add Element butona basar")
    public void addElementButonaBasar()  {
        herokuPage.addElementButton.click();
    }
    @Then("Delete butonu gorunur oluncaya kadar bekler")
    public void delete_butonu_gorunur_oluncaya_kadar_bekler() {
        //delete butonu implicitly wait suresi icinde gorunur oldgundan
        //bu adimda bir islem yapmadik
    }
    @Then("Delete butonunun gorunur oldugunu test eder")
    public void delete_butonunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(herokuPage.deleteButton.isDisplayed());
    }
    @Then("Delete butonuna basarak butonu siler")
    public void delete_butonuna_basarak_butonu_siler() {
        herokuPage.deleteButton.click();
    }
    @Then("Delete butonunun gorunmedigini test eder")
    public void delete_butonunun_gorunmedigini_test_eder() {
        try {
            Assert.assertTrue(herokuPage.deleteButton.isDisplayed());
        } catch (NoSuchElementException e) {
           Assert.assertTrue(true);
        }

    }

}
