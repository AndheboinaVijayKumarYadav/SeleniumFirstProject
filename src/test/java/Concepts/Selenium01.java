package Concepts;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Selenium01 {

    @Test
    public void test_selenium(){
        // In Selenium 3
//        System.setProperty("webdriver.gecko.driver", "path/to/firefoxdriver");

        // Selenium 4
       //  EdgeDriver driver1 = new EdgeDriver();
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://app.vwo.com");
    }
}
