package Projects.IDrive360Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginIDrive {

    WebDriver driver;
    String url ="https://www.idrive360.com/enterprise/login";

    @Test
    public void testLogin() throws Exception{
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        Thread.sleep(3000);

        WebElement emailElement = driver.findElement(By.xpath("//input[@id='username']"));
        emailElement.sendKeys("augtest_040823@idrive.com");

        WebElement passwordElement = driver.findElement(By.xpath("//input[@id='password']"));
        passwordElement.sendKeys("123456");

        WebElement signButton = driver.findElement(By.id("frm-btn"));
        signButton.click();

        Thread.sleep(20000);

        WebElement h5TextElement = driver.findElement(By.className("id-card-title"));

        Assert.assertEquals(h5TextElement.getText(),"Your free trial has expired","\n Text is not matched \n");
    }



}
