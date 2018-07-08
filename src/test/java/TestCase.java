import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

public class TestCase extends TestBase {
    @Test
    public void login(){

        setUp();
        driver.findElement(By.className("btnSignIn")).click();
        driver.findElement(By.id("email")).sendKeys("cegofose@dumoac.net");
        driver.findElement(By.id("password")).sendKeys("s123456789g");
        driver.findElement(By.id("loginButton")).click();

    }

    @Test
    public void doTestCase() throws InterruptedException {


        WebElement searchBox = driver.findElement(By.id("productSearchForm"));
        searchBox.click();

        WebElement fillSearchBox = driver.findElement(By.id("searchData"));
        fillSearchBox.sendKeys("samsung");

        WebElement searchBtn = driver.findElement(By.className("searchBtn"));
        searchBtn.click();

        WebElement nextPage = driver.findElement(By.xpath("//a[@href='https://www.n11.com/arama?q=samsung&pg=2'][contains(text(),'2')]"));
        nextPage.click();

        driver.findElement(By.xpath("//html//div[@id='view']//li[3]/div[1]/div[1]/a[1]")).click();


        Thread.sleep(4000);


        Select select = new Select (driver.findElement(By.xpath("//form[@class='proOpt form horizontal']//select[1]")));
        select.selectByIndex(2);

        Thread.sleep(4000);

        driver.findElement(By.xpath("//a[@id='getWishList']")).click();
        driver.findElement(By.id("addToFavouriteWishListBtn")).click();

        Thread.sleep(4000);

        driver.findElement(By.xpath("//span[@class='btn btnBlack confirm']")).click();

        Thread.sleep(4000);

        WebElement ele = driver.findElement(By.className("myAccount"));
        Actions action = new Actions(driver);
        action.moveToElement(ele).build().perform();

        //driver.findElement(By.xpath("//a[@href='https://www.n11.com/hesabim'][contains(text(),'Hesabım')]"));
        driver.findElement(By.xpath("//a[@href='https://www.n11.com/hesabim/istek-listelerim']")).click();

        Thread.sleep(4000);

        driver.findElement(By.xpath("//h4[@class='listItemTitle']")).click();

        driver.findElement(By.xpath("//html//div[@id='view']/ul/li[1]//div[1]//div[3]//span[1]")).click();




    }
}
