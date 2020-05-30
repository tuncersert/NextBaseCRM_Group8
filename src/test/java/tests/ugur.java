package tests;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.Logs;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

    public class ugur extends TestBase{
        @Test
        public void login() throws InterruptedException {
            extentLogger=report.createTest("Test ");
            driver.get("https://login.nextbasecrm.com");
            String username = "marketing15@cybertekschool.com";
            String password = "UserUser";
            //Thread.sleep(5);
            driver.findElement(By.xpath("//input[@name='USER_LOGIN']")).sendKeys(username);
            driver.findElement(By.xpath("//input[@name='USER_PASSWORD']")).sendKeys(password);
            driver.findElement(By.xpath("//input[@type='submit']")).click();
            // Thread.sleep(7);
            extentLogger.info("click the messages tab");
            driver.findElement(By.cssSelector(" .feed-add-post-form-variants span span")).click();
            BrowserUtils.waitFor(3);
            extentLogger.info("click the Record video ");
            driver.findElement(By.xpath("( //div[@id='post-buttons-bottom']/span[text()='Record Video'])[1]")).click();
            BrowserUtils.waitFor(3);
            System.out.println("0");
            extentLogger.info("click allow");
            driver.findElement(By.cssSelector(".popup-window-button.popup-window-button-blue")).click();
            System.out.println("1");

            driver.switchTo().alert().accept();
//        Thread.sleep(2000);
//        alert.accept();
            System.out.println("3");

            Thread.sleep(5000);
            String ActualMessage=driver.findElement(By.cssSelector("#popup-window-content-bx-popup-videomessage-popup")).getText();
            String ExpectedMessage="Cannot access your camera and microphone";

            Assert.assertEquals(ActualMessage,ExpectedMessage,"error message");
            driver.findElement(By.cssSelector("#user-name")).click();
            driver.findElement(By.xpath("//span[text()='Log out']")).click();
            driver.quit();
        }

    }
