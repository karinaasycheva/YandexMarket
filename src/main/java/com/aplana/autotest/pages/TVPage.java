package com.aplana.autotest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by Карина on 02.12.2016.
 */
public class TVPage extends ProductPage {

    public void checkTvPage( ) {
        assertTrue(driver.getCurrentUrl().contains("https://market.yandex.ru/catalog/59601"));
    }
}
