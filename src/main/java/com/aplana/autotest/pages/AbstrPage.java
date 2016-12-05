package com.aplana.autotest.pages;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.webdriver.ThucydidesWebDriverEventListener;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

/**
 * Created by Карина on 21.11.2016.
 */
public class AbstrPage extends PageObject{
    protected WebDriver driver;
    protected boolean acceptNextAlert = true;
    protected StringBuffer verificationErrors = new StringBuffer();

    public AbstrPage(){
        driver = ThucydidesWebDriverSupport.getDriver();
    }

    public void checkElement(WebElement element){
        try {
            assertTrue("Element is not found", isElementPresent(element));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
    }
    protected boolean isElementPresent(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

}
