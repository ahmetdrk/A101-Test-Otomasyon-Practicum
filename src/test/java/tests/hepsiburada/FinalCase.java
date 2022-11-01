package tests.hepsiburada;

import org.junit.*;
import org.openqa.selenium.NoSuchElementException;
import page.HepsiburadaLocatePage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

import static org.openqa.selenium.Keys.ENTER;

public class FinalCase {
    HepsiburadaLocatePage hepsiburadaLocatePage = new HepsiburadaLocatePage();

    @BeforeClass
    public static void setUp() {
        Driver.getDriver().get(ConfigurationReader.getProperty("hepsiburada.url"));
    }

    @AfterClass
    public static void tearDown() {
        Driver.getDriver().quit();
    }

    @Test
    public void test1() throws InterruptedException {

        System.out.println("Hepsiburada.com sitesi ziyaret edildi.");

        hepsiburadaLocatePage.çerezKullanımıKabul.click();
        BrowserUtils.sleep(2);

        hepsiburadaLocatePage.GirişYap.click();
        BrowserUtils.sleep(2);

        hepsiburadaLocatePage.GirişYapButton.click();
        BrowserUtils.sleep(2);

        hepsiburadaLocatePage.email.sendKeys("ahmet_eagle1903@hotmail.com" + ENTER);
        BrowserUtils.sleep(2);

        hepsiburadaLocatePage.şifre.sendKeys("ao131015" + ENTER);
        BrowserUtils.sleep(5);
        System.out.println("Kullanıcı giriş işlemi yapıldı.");

        String expectedkullanıcı = "ahmet doruk";
        String actualkullanıcı = hepsiburadaLocatePage.kullanıcıdoğrulama.getText();
        BrowserUtils.waitForVisibility(hepsiburadaLocatePage.kullanıcıdoğrulama, 10);
        Assert.assertEquals(expectedkullanıcı, actualkullanıcı);
        System.out.println("Kullanıcı giriş işleminin yapıldığı doğrulandı.");
        BrowserUtils.sleep(2);

        hepsiburadaLocatePage.searchBox.sendKeys("futbol topu" + ENTER);
        BrowserUtils.waitForStaleElement(hepsiburadaLocatePage.searchBox, 10);
        BrowserUtils.sleep(2);
        System.out.println("Satın almak istenilen ürün için arama yapıldı.");

        hepsiburadaLocatePage.futboltopu.click();
        BrowserUtils.sleep(2);
        System.out.println("İlk ürün seçildi.");

        List<String> sayfalar = new ArrayList<>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(sayfalar.get(1));

        hepsiburadaLocatePage.topseçimi1sepeteekle.click();
        BrowserUtils.waitForStaleElement(hepsiburadaLocatePage.topseçimi1sepeteekle, 10);
        BrowserUtils.sleep(5);

        hepsiburadaLocatePage.çıkış.click();
        BrowserUtils.sleep(2);

        Driver.getDriver().navigate().refresh();

        hepsiburadaLocatePage.topseçimi2sepeteekle.click();
        BrowserUtils.waitForStaleElement(hepsiburadaLocatePage.topseçimi2sepeteekle, 10);
        BrowserUtils.sleep(5);
        System.out.println("İki farklı satıcıdan aynı ürün seçilip sepete eklendi.");

        try {
            hepsiburadaLocatePage.sepetim.click();
        } catch (NoSuchElementException e) {
            BrowserUtils.sleep(5);
        }

        String expectedilkürünsatıcı = "Aplus";
        String actualilkürünsatıcı = hepsiburadaLocatePage.ilküründoğrulama.getText();
        BrowserUtils.waitForVisibility(hepsiburadaLocatePage.ilküründoğrulama, 10);
        Assert.assertEquals(expectedilkürünsatıcı, actualilkürünsatıcı);
        BrowserUtils.sleep(2);

        String expectedikinciürünsatıcı = "Maxioutlet";
        String actualikinciürünsatıcı = hepsiburadaLocatePage.ikinciüründoğrulama.getText();
        BrowserUtils.waitForVisibility(hepsiburadaLocatePage.ikinciüründoğrulama, 10);
        Assert.assertEquals(expectedikinciürünsatıcı, actualikinciürünsatıcı);
        System.out.println("Seçilen ürünlerin doğru olarak eklendiği Sepetim sayfasında doğrulandı.");

        System.out.println("-----------------------------------------");

        hepsiburadaLocatePage.birinciürünsilme.click();
        BrowserUtils.sleep(5);

        hepsiburadaLocatePage.siluyarısı.click();
        BrowserUtils.sleep(5);

        hepsiburadaLocatePage.ikinciürünsilme.click();
        BrowserUtils.sleep(8);

        hepsiburadaLocatePage.çıkışyap.click();
        BrowserUtils.sleep(5);

        hepsiburadaLocatePage.searchBox2.sendKeys("futbol topu" + ENTER);
        BrowserUtils.waitForStaleElement(hepsiburadaLocatePage.searchBox, 10);
        BrowserUtils.sleep(2);
        System.out.println("Satın almak istenilen ürün için tekrar arama yapıldı.");

        hepsiburadaLocatePage.futboltopu.click();
        BrowserUtils.sleep(2);
        System.out.println("İlk ürün tekrar seçildi.");

        hepsiburadaLocatePage.çıkış.click();
        BrowserUtils.sleep(2);

        Driver.getDriver().navigate().refresh();

        hepsiburadaLocatePage.topseçimi2sepeteekle.click();
        BrowserUtils.waitForStaleElement(hepsiburadaLocatePage.topseçimi2sepeteekle, 10);
        BrowserUtils.sleep(5);
        System.out.println("İki farklı satıcıdan aynı ürün seçilip tekrar sepete eklendi.");

        hepsiburadaLocatePage.sepetim.click();
        BrowserUtils.sleep(2);

        String expectedilkürünsatıcı1 = "Aplus";
        String actualilkürünsatıcı1 = hepsiburadaLocatePage.ilküründoğrulama.getText();
        BrowserUtils.waitForVisibility(hepsiburadaLocatePage.ilküründoğrulama, 10);
        Assert.assertEquals(expectedilkürünsatıcı1, actualilkürünsatıcı1);
        BrowserUtils.sleep(2);

        String expectedikinciürünsatıcı1 = "Maxioutlet";
        String actualikinciürünsatıcı1 = hepsiburadaLocatePage.ikinciüründoğrulama.getText();
        BrowserUtils.waitForVisibility(hepsiburadaLocatePage.ikinciüründoğrulama, 10);
        Assert.assertEquals(expectedikinciürünsatıcı1, actualikinciürünsatıcı1);
        System.out.println("Seçilen ürünlerin doğru olarak eklendiği Sepetim sayfasında tekrar doğrulandı.");


    }

}

