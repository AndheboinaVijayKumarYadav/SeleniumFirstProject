package part2.com.saucedemo.tests.login;

import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTest;

public class LoginTest extends BaseTest {


    @Description("TC: Verification of Login into Application")
    @Test
    public void testLoginErrorMessage(){
        loginPage.setUsernameField("standard_user");
        loginPage.setPasswordField("Zyuw");
        loginPage.clickLoginButton();
        String actualMessage = loginPage.getErrorMessage();
        Assert.assertTrue(actualMessage.contains("Epic sadface"));
    }

}
