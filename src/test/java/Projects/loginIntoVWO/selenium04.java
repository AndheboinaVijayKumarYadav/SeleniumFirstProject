package Projects.loginIntoVWO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class selenium04 {


    @Test
    public void test_VWOLogin_Negative() throws Exception {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        edgeOptions.addArguments("--incognito");

        WebDriver driver= new EdgeDriver(edgeOptions);

        driver.get("https://app.vwo.com");

        Assert.assertEquals(driver.getTitle(),"Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");

        // <input
        // type="email"
        // class="text-input W(100%)"
        // name="username"
        // id="login-username"
        // data-qa="hocewoqisi" fdprocessedid="24qfi"
        // >

        WebElement emailInputBox = driver.findElement(By.id("login-username"));

        emailInputBox.sendKeys("admin@admin.com");

        WebElement passwordInputBox = driver.findElement(By.id("login-password"));

        passwordInputBox.sendKeys("1234");

        WebElement signButton = driver.findElement(By.id("js-login-btn"));
        signButton.click();

        // because after clicking the sign-in button error message is displayed after 3secs
        Thread.sleep(3000);

        WebElement errorElement = driver.findElement(By.className("notification-box-description"));

        Assert.assertEquals(errorElement.getText(),"Your email, password, IP address or location did not match");

        driver.quit();
    }


}
