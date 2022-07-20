package pageobject.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseFunc {
    private WebDriver driver;
    private WebDriverWait wait;

    public BaseFunc() {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void openUrl(String url) {

        if (!url.startsWith("http://") && !url.startsWith("https://")) {
            url = "http://" + url;

        }
        driver.get(url);
    }

    public void click(By locator) {

        WebElement we = wait.until(ExpectedConditions.elementToBeClickable(locator));

        try {
            we.click();
        } catch (ElementClickInterceptedException e) {
            System.out.println("Cant click from the first try");
            we.click();
        }
    }

    public void typr(By locator , String text) {
       WebElement we = driver.findElement(locator);

        we.clear();
        we.sendKeys(text);
    }

    public void pressKey(By locator, Keys key) {
        FindElement(locator).sendKeys(key);
    }

    public WebElement FindElement(By locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }
}