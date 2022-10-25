package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Hepsiburada_page extends BasePage{


    @FindBy(id = "onetrust-accept-btn-handler")
    public WebElement cerezKullanımıKabul;

    @FindBy (xpath = "(//span[@title='Giriş Yap'])")
    public WebElement GirisYap;

    @FindBy (id = "login")
    public WebElement GirisYapButton;

    @FindBy (id = "txtUserName")
    public WebElement email;

    @FindBy(id = "btnLogin")
    public WebElement loginButton;

    @FindBy(id = "txtPassword")
    public WebElement sifre;
}
