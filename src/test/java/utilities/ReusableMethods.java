package utilities;
import com.github.javafaker.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class ReusableMethods {

    private static int timeout = 5;

    public static String getScreenshot(WebDriver driver, String name) throws IOException {


        // Screenshot dosya ismi icin suanki tarihi string olarak aliyoruz

        String date = formatCurrentDate("yyyyMMddhhmmss");


        // Screenshot alip file objesine atiyoruz

        java.io.File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);


        // Kaydedilecek dosyanin yolunu belirliyoruz

        String target = System.getProperty("user.dir") + "\\test-output\\Screenshots\\" + name + date + ".png";


        File targetFile = new File(target);


        FileUtils.copyFile(source, targetFile);


        return target;
    }
    public static String formatCurrentDate(String pattern){



        return new SimpleDateFormat(pattern).format(new Date());



    }
    public static void waitUntilElementVisible(WebElement webElement) {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(webElement));

    }

    public static void waitUntilClickableAndClick(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(webElement)).click();

    }

    public static void waitFor(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void waitAndClick(WebElement element) throws InterruptedException {
        for (int i = 0; i < timeout; i++) {
            try {
                element.click();
                return;
            } catch (WebDriverException e) {
                wait(1);
            }
        }
    }
}
