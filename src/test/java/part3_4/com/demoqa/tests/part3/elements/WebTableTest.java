package part3_4.com.demoqa.tests.part3.elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class WebTableTest extends BaseTest {

    @Test
    public void webTableEditTest(){
        String email = "alden@example.com";
        var webTablePage = homePage.goToElements().clickWebTables();
        webTablePage.clickEdit(email);
        webTablePage.setAge("50");
        webTablePage.clickSubmitButton();

        String tableAge = webTablePage.getTableAge(email);
        Assert.assertEquals(tableAge,"50","\n Actual and Expected Ages Do not match\n");

    }

}
