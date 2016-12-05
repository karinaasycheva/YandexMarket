package com.aplana.autotest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Карина on 21.11.2016.
 */
public class UploadPage extends AbstrPage {
    @FindBy(xpath="//input[@id=\"header-search\"]")
    public WebElement searcheRow;

    @FindAll({@FindBy(xpath="//div[contains(@class, \"n-snippet-card\")]"),})
    List<WebElement> cards;

    public void isQuantity(){
        assertEquals(12, cards.size());
    }

    public String getName( ){
        return driver.findElement(By.xpath("//span[@class=\"snippet-card__header-text\"][1]")).getText();
    }

    public void clearPurchase(String Name){
         searcheRow.sendKeys(new String[] {Name});
    }
}
