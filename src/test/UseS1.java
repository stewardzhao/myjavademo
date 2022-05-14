package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.net.MalformedURLException;

public class UseS1 {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        System.out.println("Hello Selenium Test");
//        System.setProperty("webdriver.chorme.driver", "chromedriver.exe");
        EdgeDriver driver = new EdgeDriver();
        try {
            driver.navigate().to("https://bing.com");

            WebElement element = driver.findElement(By.id("sb_form_q"));
            element.sendKeys("WebDriver");
            element.submit();

            Thread.sleep(5000);
        } finally {
            driver.quit();
        }
        System.setProperty("webdriver.edge.verboseLogging", "true");
//        EdgeDriverService service = EdgeDriverService.createDefaultService();

//        EdgeDriver driver = new EdgeDriver(service);
//        System.setProperty("webdriver.chorme.driver", "chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//
//        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//        WebDriver driver = new RemoteWebDriver(
//                new URL("http://127.0.0.1:9515"),
//                new ChromeOptions());
//        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
    }
}
