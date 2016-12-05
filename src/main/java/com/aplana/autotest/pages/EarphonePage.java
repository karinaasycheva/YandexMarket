package com.aplana.autotest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by Карина on 05.12.2016.
 */
public class EarphonePage extends ProductPage {

    public void checkEarPage() {
        assertTrue(driver.getCurrentUrl().contains("https://market.yandex.ru/catalog/56179"));
    }
}
