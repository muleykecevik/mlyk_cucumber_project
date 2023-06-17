package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    // Page class lari surekli kullandigimiz locate islemleri
    //ve varsa login gibi kucuk islevleri iceren methodlar barindirir.
    //Selenium ile locate islemi veya herhangi bir islev gerceklestirmek
    //istedigimizde webdriver obj ihtiyac vardir.
    //POM'de Driver class inda olsuturdugumuz webdriver driver objesini
    //page classlarina tanimlamak icin pagefactory class indan initElements
    //kullanilir.

    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
        //bu ayari cons. icine koyma sebebimiz:
        //page sayfalarina obje olusturularak ulasildigi icin
        //kim page sayfasini kullanmak isterse
        //page sayfasindan obj olusturmak icin cons calisacak
        //
    }
    @FindBy(id="twotabsearchtextbox")
     public WebElement searchBox;
    @FindBy(xpath="(//div[@class='sg-col-inner'])[1]")
     public WebElement searchBoxResultElement;

    @FindBy (xpath = "//*[@data-image-index='1']")
    public WebElement firstProductElement;
    @FindBy(xpath = "//span[@id='productTitle']")
    public WebElement firstProductName;

}
