package seleniumLesson3;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SecondHomeWork {

    private String A1_RUL = "https://www.1a.lv/?gclid=Cj0KCQjw-daUBhCIARIsALbkjSYz4LAWdDMvh9ob5FkfeIoQIJlixdgsCDkswTMuRMKO5xyED4_KYacaAiM7EALw_wcB&gclsrc=aw.ds";
    private String MENU_ITEM = "Datortehnika ";

    private final By DATORTEHNIKA = By.xpath(".//li[contains(@class, 'submenu-lvl1__list-item color-theme-17 submenu-lvl1__list-item--has-child')]");
    private final By ACCEPT_COOKIES_BUTTON = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    private final By MENU = By.xpath(".//ul[@class = 'submenu-lvl1__list']");


    @Test
    public void openWebPage() {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get(A1_RUL);

        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(6));
        wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES_BUTTON));

        WebElement cookiesAccept = browser.findElement(ACCEPT_COOKIES_BUTTON);
        cookiesAccept.click();

        List<WebElement> item = browser.findElement(MENU).findElements(DATORTEHNIKA);

        for (WebElement we : item) {
            if (we.getText().equals(MENU_ITEM)) {
                we.click();
                break;
            }
        }
        try {
            item.get(1).click();
        } catch (ElementClickInterceptedException e) {
            item.get(1).click();
        }
    }
}
