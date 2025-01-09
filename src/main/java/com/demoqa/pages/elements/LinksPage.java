package com.demoqa.pages.elements;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class LinksPage extends ElementPage{

        // here we can use id as well because id is also unique
        private By badRequestLink = By.linkText("Bad Request");

        public void clickBadRequestLink(){
//            System.out.println(badRequestLink);
            scrollToElementJS(badRequestLink);
            click(badRequestLink);
        }

        public String getLinkResponseText(){
            delay(2000);
            By linkResponseField = By.id("linkResponse");
            return find(linkResponseField).getText();
        }


}
