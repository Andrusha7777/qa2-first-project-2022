package seleniumLesson3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class FirstSeleniumTest {
    private final String HOME_PAGE_URL = "http:1a.lv";
    private final By SEARCH_INPUT_FIELD = By.id("q");
    private final By PRODUCT_TYPE = By.xpath(".//span[@class = 'single-title']");
    private final By LOGO_BUTTON = By.xpath(".//a[@class = 'main-logo']");
    private final By ORDER_SEARCH = By.xpath(".//a[@href = '/order_search']");
    private final By SEARCH_BUTTON = By.xpath(".// button[@type = 'submit']");
    private final By LV_LANGUAGE = By.xpath(".//a[@href = '/kp/apple/eb']");
    private final By RU_LANGUAGE = By.xpath(".//a[@href = '/ru/kp/apple/eb']");
    private final By AVORITE_ITEMS = By.xpath(".//i[@class = 'favorite-items__icon icon-svg']");
    private final By PC_FOR_OFFICE = By.xpath(".//a[@href = '/c/datortehnika-preces-birojam/2pd']");
    private final By COMPUTER_COMPONENTS = By.xpath(".//a[@href = '/c/datoru-komponentes-tikla-produkti/2pe']");
    private final By PHONES_TABLETS_AND_APPLE_SHOP = By.xpath(".//a[@href = '/c/telefoni-plansetdatori-apple-veikals/2pc']");
    private final By TV_AND_CONSOLES = By.xpath(".//a[@href = '/c/tv-audio-video-spelu-konsoles/2pf']");
    private final By ACCEPT_COOKIES_BTN = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");

    private final String CATEGORY_NAME = "Apple AirPods";

    @Test
    public void openWebPage() {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get(HOME_PAGE_URL);

        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES_BTN));

        browser.findElement(ACCEPT_COOKIES_BTN).click();

        WebElement searchField = browser.findElement(SEARCH_INPUT_FIELD);
        searchField.sendKeys("Apple");
        searchField.sendKeys(Keys.ENTER);

        List<WebElement> subMenuitems = browser.findElements(PRODUCT_TYPE);
        boolean flag = false;
        for (WebElement we : subMenuitems) {
            if (we.getText().equals(CATEGORY_NAME)) {
                flag = true;
                wait.until(ExpectedConditions.elementToBeClickable(we));
                try {
                    we.click();
                } catch (ElementClickInterceptedException e) {
                    System.out.println("Cant click from the first try");
                    we.click();
                }

                break;

            }
        }

        Assertions.assertTrue(flag, "Category not found");


    }
}
