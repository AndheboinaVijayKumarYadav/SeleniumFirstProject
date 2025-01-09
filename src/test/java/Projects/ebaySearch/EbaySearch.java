package Projects.ebaySearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class EbaySearch {
    WebDriver driver;
    String url ="https://www.ebay.com/";

    @Test
    public void testEbaySearch() throws Exception{

        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        WebElement inputSearchElement = driver.findElement(By.id("gh-ac"));
        inputSearchElement.sendKeys("macmini");

        WebElement searchButton = driver.findElement(By.id("gh-btn"));
        searchButton.click();

        List<WebElement> SearchTitle = driver.findElements(By.xpath("//div[@class=\"s-item__title\"]"));
        List<WebElement> SearchPrices = driver.findElements(By.xpath("//span[@class=\"s-item__price\"]"));

        for(int i = 0; i < SearchTitle.size();i++){
            System.out.println(SearchTitle.get(i).getText()+" "+ SearchPrices.get(i).getText());
        }


        driver.quit();


    }
}
