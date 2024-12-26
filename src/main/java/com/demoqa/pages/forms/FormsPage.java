package com.demoqa.pages.forms;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class FormsPage extends HomePage {

    private By PracticeFormMenuItem = By.xpath("//li[@id='item-0']/span[text()='Practice Form']");

    public PracticeFormPage clickPractiseForm(){
        scrollToElementJS(PracticeFormMenuItem);
        click(PracticeFormMenuItem);

        return new PracticeFormPage();
    }
}
