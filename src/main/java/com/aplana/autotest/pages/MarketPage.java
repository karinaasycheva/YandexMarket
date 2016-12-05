package com.aplana.autotest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertTrue;

/**
 * Created by Карина on 21.11.2016.
 */
public class MarketPage extends AbstrPage {

    @FindBy(xpath="//a[@class = \"link topmenu__link\"][text()=\"Электроника\"]")
    public WebElement gotoElectron;

    public void checkGoodsPage( ){
        assertTrue(driver.getCurrentUrl().contains("https://market.yandex.ru/?clid=505"));
    }
    public void gotoElPage(){gotoElectron.click();}
}
