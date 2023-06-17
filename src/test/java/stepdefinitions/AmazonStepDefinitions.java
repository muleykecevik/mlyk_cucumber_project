package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {
    AmazonPage amazonPage=new AmazonPage();
    @Given("Kullanici amazon anasayfaya gider")
    public void kullanici_amazon_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
    @When("Nutella icin arama yapar")
    public void nutella_icin_arama_yapar() {
        amazonPage.searchBox.sendKeys("Nutella"+ Keys.ENTER);
    }
    @Then("Arama sonuclarinin Nutella icerdigini test eder")
    public void arama_sonuclarinin_nutella_icerdigini_test_eder() {
    String actualResult=amazonPage.searchBoxResultElement.getText();
    String expectedResult="Nutella";
    Assert.assertTrue(actualResult.contains(expectedResult));

    }
    @Then("Sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }


    @When("Java icin arama yapar")
    public void java_icin_arama_yapar() {
        amazonPage.searchBox.sendKeys("Java"+ Keys.ENTER);

    }
    @Then("Arama sonuclarinin Java icerdigini test eder")
    public void arama_sonuclarinin_java_icerdigini_test_eder() {
        String actualResult=amazonPage.searchBoxResultElement.getText();
        String expectedResult="Java";
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @When("Samsung icin arama yapar")
    public void samsungIcinAramaYapar() {
        amazonPage.searchBox.sendKeys("Samsung"+ Keys.ENTER);
    }

    @Then("Arama sonuclarinin Samsung icerdigini test eder")
    public void aramaSonuclarininSamsungIcerdiginiTestEder() {
        String actualResult=amazonPage.searchBoxResultElement.getText();
        String expectedResult="Samsung";
        Assert.assertTrue(actualResult.contains(expectedResult));


    }

    @Then("title in Amazon icerdigini test eder")
    public void titleInAmazonIcerdiginiTestEder() {
        String actualTitle= Driver.getDriver().getTitle();
        String expectedTitle= "Amazon";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    @Given("Kullanici {string} anasayfaya gider")
    public void kullaniciAnasayfayaGider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @When("{string} icin arama yapar")
    public void icinAramaYapar(String aranacakKelime) {
        amazonPage.searchBox.sendKeys(aranacakKelime+Keys.ENTER);

    }

    @Then("Arama sonuclarinin {string} icerdigini test eder")
    public void aramaSonuclarininIcerdiginiTestEder(String expectedKelime) {
        String actualResult=amazonPage.searchBoxResultElement.getText();
        Assert.assertTrue(actualResult.contains(expectedKelime));
    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int beklenecekSaniye) {
        try {
            Thread.sleep(beklenecekSaniye*1000);
        } catch (InterruptedException e) {
        }

    }

    @Then("ilk urune click yapar")
    public void ilk_urune_click_yapar() {
        amazonPage.firstProductElement.click();


    }
    @Then("acilan urun isminin {string} icerdigini test eder")
    public void acilan_urun_isminin_icerdigini_test_eder(String expectedWord) {
    String actualProductName=amazonPage.firstProductName.getText();
    expectedWord="Nutella";
    Assert.assertTrue(actualProductName.contains(expectedWord));
    }



}
