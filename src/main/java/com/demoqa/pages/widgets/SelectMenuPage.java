package com.demoqa.pages.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static utilities.DropDownUtility.*;
import static utilities.JavaScriptUtility.*;

public class SelectMenuPage extends WidgetPage{

    private By standardMultiSelect = By.id("cars");


    public void selectStandardMulti(String text){

        scrollToElementJS(standardMultiSelect);

        // here everytime instead of creating new object reference we are creating dropdown utility
//        Select select = new Select(find(selectMenuItem));
//        select.selectByVisibleText(text);

        selectByVisibleText(standardMultiSelect,text);

    }

    // Method overloading of selectStandardMulti
    public void selectStandardMulti(int index){
        scrollToElementJS(standardMultiSelect);
        selectByIndex(standardMultiSelect,index);
    }


    public void deselectStandardMulti(String value){
        scrollToElementJS(standardMultiSelect);
        deselectByValue(standardMultiSelect,value);

    }


}
