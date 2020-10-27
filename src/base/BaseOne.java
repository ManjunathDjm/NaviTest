package base;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseOne {

    protected static WebDriver driver;

    @Parameters({ "browser"})
    @BeforeMethod
    public static void openbrowser1(String browser) {
    	
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		driver = new ChromeDriver(options);
		//driver.navigate().to(url);
		driver.manage().window().maximize();
    }

    @AfterMethod
    public static void closeAllDrivers() {
        if (driver != null) {
            driver.quit();
        }
    }
}
