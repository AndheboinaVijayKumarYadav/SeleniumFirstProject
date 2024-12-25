package Projects.loginIntoVWO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class selenium05 {


    @Test
    public void test_VWOLogin_Negative() throws Exception {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        edgeOptions.addArguments("--incognito");

        WebDriver driver= new EdgeDriver(edgeOptions);

        driver.get("https://app.vwo.com");

        Assert.assertEquals(driver.getTitle(),"Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");

        // link text - full
        // partial link text - partial
        // both are only used for anchor tags

        // on way
//        WebElement link_free_trail_element = driver.findElement(By.linkText("Start a free trial"));
//        link_free_trail_element.click();

        WebElement link_partial_element = driver.findElement(By.partialLinkText("free trial"));
        link_partial_element.click();

        WebElement emailInputBoxInFreeTrail = driver.findElement(By.id("page-v1-step1-email"));
        emailInputBoxInFreeTrail.sendKeys("viajadflsf88");

        WebElement checkPolicy = driver.findElement(By.name("gdpr_consent_checkbox"));
        // we have used name instead of id because id contains number we can avoid it
        checkPolicy.click();

        List<WebElement> button_list = driver.findElements(By.tagName("button"));
        button_list.get(0).click();

        // <div
        // class="C($color-red) Fz($font-size-12) Trsp($Op) Trsdu(0.15s) Op(0) invalid-input+Op(1) invalid-reason">
        // The email address you entered is incorrect.
        // </div>

        WebElement errorMessage = driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(errorMessage.getText(),"The email address you entered is incorrect.");

        Thread.sleep(3000);
        driver.quit();
    }


}
