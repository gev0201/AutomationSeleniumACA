package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class SeleniumBase {
    public static void main(String[] args) throws InterruptedException {
        amazonTest();
    }

    public static void amazonTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        TimeUnit.SECONDS.sleep(1);
        String title = driver.getTitle();
        System.out.println(title);
        driver.close();


    }
}
