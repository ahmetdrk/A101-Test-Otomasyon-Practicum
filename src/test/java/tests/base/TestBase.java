package tests.base;


import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public abstract class TestBase {

    public TestBase() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
}

