package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },
        features ="src/test/resources/features" ,
        glue = "stepdefinitions",
        tags= "@ae",
        dryRun = false
)
public class Runner {

    /*
    cucumber da runner class i istedigimiz testleri calsitirmak ve
    her calistirilan test icin rapor hazirlamak amaciyla kullanilir
    Runner Class i bos bir classdir
    Belirtilen bu isleri class icerisindeki kodlar degil
    class deklarsyonunda kullanilan notasyonlar halleder
    @Runwith notasyonu frameworkumuza junit yuklememizin sebebidir.
    ve runner class inin cucumber ile calismasini saglar
    @cucumberoptions ise frameworkumuzda gerekli ayarlari yapar
    features : fetatures dosyalarimizin bulundugu konumu gosterir
    dikkat edilirse tek tek feature dosyalarini degil
    tum feature dosyalarini iceren klasorun yolunu yaziyoruz
    glue : feature dosyalari ile bagli olan Java methodlarinin yerini
    gosterir burada da tek tek classlari degil tum classlari iceren
    package in adresini yazariz
    Boylece ilgili step hangi class altinda olursa olsun
    cucumeber bulup calistirir
    tags : calistiralacak feature veya scenerio lari isaretlemek icin
    kullanilir
    Cucumber runner class i calistirildiginda
    tum feature dosyalarini gozden gecirir ve runner classinda belirtilen tag a
    sahip tum feature ve scenerio lari calistirir.

    Eger birden fazla tagi kontrol ederek calistirmasini istersek
    "@regression or/and smoke" yazariz.
    dryRun bir fetture dosyasini ilk defa yazdigimzida steplerden bazilari daha obce var
    oldugundan beyaz bazilari ise
    ilk defa kullanacgimiz icin sari olur
    Bu feature dosyasini direkt calistirmak istersek bastan baslayarak beyaz
    olan adimlari calistirir
    Ilk sari adima geldiginde exception firlatip calistirmayi denedigi ilk sari satir
    ve geriye kalan sari satirlarin eksik steplerini bize yazdirir
    Amacimiz feature dosyasini calistirmak degil
    sadece eksik steplere ait kodlari olusturmak ise o zaman runner classinda
    dryRun =true yapip runner c lassini calistiririz.
    dryRun=true dedigimizde cucumber testleri calistirmaz sadece eksik adim var mi
    diye kontrol eder.
    dryRun=false default degerdir ve testleri normal olarak calistirmamizi saglar

     */
}
