package com.aplana.autotest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertTrue;

/**
 * Created by Карина on 21.11.2016.
 */
public class ElectronicPage extends AbstrPage {

    @FindBy(linkText="Телевизоры")
    public WebElement gotoTV;

    @FindBy(linkText="Наушники и Bluetooth-гарнитуры")
    public WebElement gotoEarphone;

    public void checkElectronicPage( ){
        assertTrue(driver.getCurrentUrl().contains("https://market.yandex.ru/catalog/54440"));
    }

    public void gotoTvPage(){
        gotoTV.click();}
    public void gotoEarPage(){
        gotoEarphone.click();}
}
