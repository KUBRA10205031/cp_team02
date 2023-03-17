package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {

    private static WebDriver driver;

    private Driver() {

    }

    public static WebDriver getDriver() {

        String browser = ConfigReader.getProperty("browser");

        if (driver == null) {
            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions co = new ChromeOptions();
                    co.addArguments("--remote-allow-origins=*");
                    driver = new ChromeDriver(co);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }

        return driver;
    }


    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
