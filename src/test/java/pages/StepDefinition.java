package pages;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

import static org.openqa.selenium.Keys.ENTER;

public class StepDefinition {

    Hepsiburada_page hepsiburada_page = new Hepsiburada_page();

    @BeforeMethod
    public void setupMethod() {
        Driver.getDriver().get(ConfigurationReader.getProperty("hepsiburada.url"));
        hepsiburada_page = new Hepsiburada_page();
    }

    @Test
    public void test() {

        hepsiburada_page.cerezKullanımıKabul.click();
        BrowserUtils.sleep(2);

        hepsiburada_page.GirisYap.click();
        BrowserUtils.sleep(2);

        hepsiburada_page.GirisYapButton.click();
        BrowserUtils.sleep(2);

        hepsiburada_page.email.sendKeys("ahmet_eagle1903@hotmail.com" + ENTER);
        BrowserUtils.sleep(2);

        hepsiburada_page.sifre.sendKeys("Ao131015" + ENTER);
        BrowserUtils.sleep(2);





    }

}
