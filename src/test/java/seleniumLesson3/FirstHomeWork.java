package seleniumLesson3;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class FirstHomeWork {
    private final String PAGE_RUL = "http://www.qaguru.lv:8089/tickets/step2.php?afrom=CPT&bfrom=BCN";
    private final By REGISTRATION_NAME = By.id("name");
    private final By REGISTRATION_SURNAME = By.id("surname");
    private final By CARD_CODE = By.id("discount");
    private final By PASAGER_AMOUNT = By.id("adults");
    private final By CHILDREN_AMOUNT = By.id("children");
    private final By LUGGAGE_AMMOUNT = By.id("bugs");
    private final By TRAVELING_DATES = By.id("flight");
    private final By TRAVELING_DATE = By.xpath(".//select[@option = '13']");

    @Test
    public void openWebPage() {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get(PAGE_RUL);

        WebElement nameField = browser.findElement(REGISTRATION_NAME);
        nameField.sendKeys("Vasja");

        WebElement surnameField = browser.findElement(REGISTRATION_SURNAME);
        surnameField.sendKeys("Pupkins");

        WebElement cardField = browser.findElement(CARD_CODE);
        cardField.sendKeys("123456");

        WebElement pasagerField = browser.findElement(PASAGER_AMOUNT);
        pasagerField.sendKeys("1");

        WebElement childrenField = browser.findElement(CHILDREN_AMOUNT);
        childrenField.sendKeys("0");

        WebElement luggageField = browser.findElement(LUGGAGE_AMMOUNT);
        luggageField.sendKeys("2");

        WebElement flyDatesField = browser.findElement(TRAVELING_DATES);
        flyDatesField.click();

        WebElement flyDataField = browser.findElement(TRAVELING_DATE);
        flyDataField.click();

        Select date =  new Select(browser.findElement(By.id("13")));
        date.selectByVisibleText("11-05-2018");


    }
}
