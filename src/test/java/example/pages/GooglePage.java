package example.pages;

import example.utils.Driver;
import org.openqa.selenium.WebDriver;

public class GooglePage extends Driver {

    public GooglePage(WebDriver driver) {
        super(driver);
    }

    public GooglePage navigateTo() {
        driver.navigate().to("https://www.google.com");
        return new GooglePage(driver);
    }

}
