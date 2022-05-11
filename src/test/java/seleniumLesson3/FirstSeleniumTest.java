package seleniumLesson3;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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

    @Test
    public void openWebPage() {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get(HOME_PAGE_URL);

        WebElement searchField = browser.findElement(SEARCH_INPUT_FIELD);
        searchField.sendKeys("Apple");
        searchField.sendKeys(Keys.ENTER);


    }
}
