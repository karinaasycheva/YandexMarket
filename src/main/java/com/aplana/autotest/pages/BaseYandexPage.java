package com.aplana.autotest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertTrue;

/**
 * Created by Карина on 21.11.2016.
 */
public class BaseYandexPage extends AbstrPage {

    @FindBy(xpath = "//a[@data-id=\"market\"]")
    public WebElement gotoMarket;

    public void checkYandexPage( ){
        assertTrue(driver.getCurrentUrl().contains("https://www.yandex.ru/"));
    }

    public void gotoSYandexMarketPage(){gotoMarket.click();}
}
