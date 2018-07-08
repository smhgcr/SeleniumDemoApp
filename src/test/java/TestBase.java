import com.sun.javafx.binding.StringFormatter;
import org.junit.AfterClass;
import org.junit.Before;
import org.testng.annotations.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestBase {

    public static WebDriver driver;
    public static String baseUrl = "https://www.n11.com/";


    @BeforeClass
    public static void setUp(){

        System.setProperty("webdriver.gecko.driver", "/Users/semih/Downloads/geckodriver");

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);

    }

    //@AfterClass
    // public static void tearDown(){driver.quit();}

}
