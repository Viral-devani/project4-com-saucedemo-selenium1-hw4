package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) {

        String baseUrl = "https://www.saucedemo.com/";
        System.setProperty("Webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);//launch the Url


        //Give implicit time to browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Print title of the page
        String title = driver.getTitle();
        System.out.println("Page title is :" + title);

        //Print Current Url
        System.out.println("Current Url is :" + driver.getCurrentUrl());

        //Print the page source
        System.out.println("Page source is :" + driver.getPageSource());

        //Enter Username to Userfield
        WebElement userField = driver.findElement(By.name("user-name"));
        userField.sendKeys("Admin");

        //Enter password to passwordfield
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        //close the browser
        driver.quit();


    }
}
