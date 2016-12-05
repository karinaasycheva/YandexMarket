package com.aplana.autotest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by Карина on 05.12.2016.
 */
public class ProductPage extends AbstrPage {
    @FindBy(id="glf-pricefrom-var")
    public WebElement from;

    @FindBy(xpath = "//span[@class=\"button__text\"][text()=\"Применить\"]")
    public WebElement button;

    @FindAll({@FindBy(tagName = "label"),})
    List<WebElement> labels;

    private String getId(String name){
        //List<WebElement> labels = driver.findElements(By.tagName("label"));
        String id = "";
        for (WebElement wb: labels){
            if (wb.getText().contains(name)) {
                id = wb.getAttribute("for");
                break;
            }
        }
        return id;
    }

    public void pushBut(String n){
        driver.findElement(By.id(getId(n))).click();
    }

    public void gotoCreate(){button.click();}

     public void setSum(int sum) {
        from.sendKeys(new String[] {Integer.toString(sum)});
    }
}
