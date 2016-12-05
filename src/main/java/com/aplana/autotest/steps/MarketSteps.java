package com.aplana.autotest.steps;


import com.aplana.autotest.pages.MarketPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;

/**
 * Created by Карина on 02.12.2016.
 */
public class MarketSteps {
    MarketPage marketPage;
    @Step("проверка страницы")
    public void gotoCheckMarkPage( ){marketPage.checkGoodsPage();}

    @Step("переход на страницу Electronic")
    public void gotoEl(){marketPage.gotoElPage();}
}
