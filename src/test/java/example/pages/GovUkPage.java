package example.pages;

import example.utils.Driver;
import org.openqa.selenium.WebDriver;

public class GovUkPage extends Driver {

    public GovUkPage(WebDriver driver) {
        super(driver);
    }

    public GovUkPage navigateTo() {
        driver.navigate().to("https://www.gov.uk");
        return new GovUkPage(driver);
    }


}
