package part3_4.com.demoqa.tests.part3.elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class LinksTest extends BaseTest {


    @Test
    public void testLinkClick(){
        var linksPage = homePage.goToElements().clickLinksPage();
        linksPage.clickBadRequestLink();
        String ActualLinkResponse = linksPage.getLinkResponseText();

        Assert.assertEquals(ActualLinkResponse,"Link has responded with staus 400 and status text Bad Request");
    }
}
