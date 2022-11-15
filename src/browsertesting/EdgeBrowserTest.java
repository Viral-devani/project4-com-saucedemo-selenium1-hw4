package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowserTest {
    public static void main(String[] args) {

        String baseUrl = "https://www.saucedemo.com/";
        System.setProperty("Webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        //Launch the Url
        driver.get(baseUrl);

        //Give implicit time to browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Print the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is :" + driver.getCurrentUrl());

        //Print the current Url
        System.out.println("Current Url :" + driver.getCurrentUrl());

        //Print the page source
        System.out.println("Page source :" + driver.getPageSource());

        //Enter username in username field
        WebElement username = driver.findElement(By.name("user-name"));
        username.sendKeys("Admin");

        //Enter password to password field
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("abc123");

        //Close the browser
        driver.quit();


    }

}
