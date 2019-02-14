package example.stepdefs;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import example.pages.GooglePage;
import example.pages.GovUkPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainSteps {

    private static WebDriver driver = null;

    private GooglePage googlePage;
    private GovUkPage govukPage;

    @Before
    public void startUp() {
        //Uncomment line 22 if driver is not set on your system's PATH
//        System.setProperty("webdriver.chrome.driver", "driverlocation");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        googlePage = new GooglePage(driver);
        govukPage = new GovUkPage(driver);

    }

    @Given("^A user is on the (.*) homepage$")
    public void a_user_is_on_the_homepage(String site) throws Exception {
        navigateToSite(site);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    public void navigateToSite(String site) {
        switch (site) {
            case "Google":
                googlePage.navigateTo();
                break;
            case "Gov Uk":
                govukPage.navigateTo();
                break;
        }
    }


}
