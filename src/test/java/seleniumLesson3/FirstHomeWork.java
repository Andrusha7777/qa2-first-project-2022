package seleniumLesson3;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstHomeWork {
    private final String PAGE_RUL = "http://www.qaguru.lv:8089/tickets/step2.php?afrom=CPT&bfrom=BCN";


    @Test
    public void openWebPage() {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get(PAGE_RUL);

    }
}
