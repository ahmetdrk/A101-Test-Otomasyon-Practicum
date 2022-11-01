package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.base.TestBase;
import utilities.Driver;

public class HepsiburadaLocatePage extends TestBase {
    public HepsiburadaLocatePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "onetrust-accept-btn-handler")
    public WebElement çerezKullanımıKabul;

    @FindBy(xpath = "(//span[@title='Giriş Yap'])")
    public WebElement GirişYap;

    @FindBy(id = "login")
    public WebElement GirişYapButton;

    @FindBy(id = "txtUserName")
    public WebElement email;

    @FindBy(id = "btnLogin")
    public WebElement loginButton;

    @FindBy(id = "txtPassword")
    public WebElement şifre;

    @FindBy(xpath = "(//span[@class='sf-OldMyAccount-sS_G2sunmDtZl9Tld5PR'])")
    public WebElement kullanıcıdoğrulama;

    @FindBy(xpath = "(//input[@class='desktopOldAutosuggestTheme-UyU36RyhCTcuRs_sXL9b'])")
    public WebElement searchBox;

    @FindBy(xpath = "(//h3[@type='comfort'])")
    public WebElement futboltopu;

    @FindBy(xpath = "//button[@type='button']")
    public WebElement topseçimi1sepeteekle;

    @FindBy(xpath = "//a[@class='checkoutui-Modal-2iZXl']")
    public WebElement çıkış;

    @FindBy(xpath = "(//button[@class='add-to-basket button small'])[1]")
    public WebElement topseçimi2sepeteekle;

    @FindBy(xpath = "(//button[text()='Sepete git'])")
    public WebElement sepetim;

    @FindBy(xpath = "//*[@id=\"onboarding_item_list\"]/div[4]/div/div/div[1]/span[2]/a")
    public WebElement ilküründoğrulama;

    @FindBy(xpath = "//*[@id=\"onboarding_item_list\"]/div[3]/div/div/div[1]/span[2]/a")
    public WebElement ikinciüründoğrulama;

    @FindBy(xpath = "(//a[@class='delete_product_3DFC0'])[1]")
    public WebElement birinciürünsilme;

    @FindBy(xpath = "//button[text()='Sil']")
    public WebElement siluyarısı;

    @FindBy(xpath = "(//a[@class='delete_product_3DFC0'])[1]")
    public WebElement ikinciürünsilme;

    @FindBy(xpath = "//span[text()='AD']")
    public WebElement kullanıcıtıkla;

    @FindBy (xpath = "//a[@title='Çıkış yap']")
    public WebElement çıkışyap;

    @FindBy(xpath = "(//input[@class='ddesktopAutosuggestTheme-x_fXgYrFJR0IfdpkEScd'])")
    public WebElement searchBox2;








}
