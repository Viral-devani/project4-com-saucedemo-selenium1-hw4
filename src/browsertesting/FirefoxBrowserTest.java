package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxBrowserTest {
    public static void main(String[] args) {

        String baseUrl = "https://www.saucedemo.com/";
        System.setProperty("Webdriver.gheko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(baseUrl);//Launch the Url

        //Give implicit time to browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //Print title of the page
        String title = driver.getTitle();
        System.out.println("Page title is :" + title);


        //Print current Url
        System.out.println("Current url :" + driver.getCurrentUrl());

        //Print the page source
        System.out.println("Page source is :" + driver.getPageSource());

        //Enter username to username field
        WebElement username = driver.findElement(By.name("user-name"));
        username.sendKeys("Admin");

        //Enter password to password field
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("abc123");

        //Close the browser
        driver.quit();


    }

}
