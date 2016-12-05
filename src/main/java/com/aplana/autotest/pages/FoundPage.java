package com.aplana.autotest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertEquals;

/**
 * Created by Карина on 02.12.2016.
 */
public class FoundPage extends AbstrPage {
    @FindBy(xpath="//h1[@itemprop=\"name\"]")
    private WebElement NameItem;

    @FindBy(xpath="//span[@class=\"button2__text\"][text()=\"Найти\"]/..")
    private WebElement Find;

    public void gotoFind(){Find.click();
    System.out.println(Find.getTagName());}

    public void comparison(String Name){
        assertEquals(Name, NameItem.getText());
    }

    public void gotoChoosenItem() {

    }
}
