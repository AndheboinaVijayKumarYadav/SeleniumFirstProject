package com.demoqa.pages;

import com.demoqa.pages.elements.ElementPage;
import com.demoqa.pages.forms.FormsPage;
import com.base.BasePage;
import com.demoqa.pages.widgets.WidgetPage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage {

    private By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");
    private By elementCard = By.xpath("//div[@id='app']//h5[text()='Elements']");
    private By widgetsCard = By.xpath("//div[@id='app']//h5[text()='Widgets']");

    public FormsPage goToForms(){
        scrollToElementJS(formsCard);
        click(formsCard);
        return new FormsPage();
    }

    public ElementPage goToElements(){
        scrollToElementJS(elementCard);
        click(elementCard);
        return new ElementPage();
    }

    public WidgetPage goToWidgets(){
        scrollToElementJS(widgetsCard);
        click(widgetsCard);
        return new WidgetPage();
    }

}
