package part3_4.com.demoqa.tests.part3.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class CheckboxTest extends BaseTest {

    @Test
    public void checkBoxTest(){
        var formsPage = homePage.goToForms().clickPractiseForm();
        formsPage.clickMusicCheckbox();
        formsPage.clickReadingCheckbox();
        formsPage.clickSportsCheckbox();
        formsPage.unclickReadingCheckbox();

        // checking formsPage instance
        System.out.println("formsPage is an instance of: " + formsPage.getClass().getName());

        boolean isReadingCheckboxSelected = formsPage.isReadingCheckBoxSelected();
        Assert.assertFalse(isReadingCheckboxSelected,"\n Reading checkbox is selected\n");
    }


}
