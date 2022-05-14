package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseSelenium {

    public static void main(String[] args) {
        System.out.println("Appl start...");
        System.setProperty("Webdriver.chrome.driver", "d:/appl/java/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
    }
}

