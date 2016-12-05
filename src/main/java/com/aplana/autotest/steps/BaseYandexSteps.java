package com.aplana.autotest.steps;

import com.aplana.autotest.pages.BaseYandexPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;

/**
 * Created by Карина on 27.11.2016.
 */
public class BaseYandexSteps {
    BaseYandexPage basePage;
    @Step("проверка базовой страницы")
    public void gotoCheckBasePage(){basePage.checkYandexPage();}

    @Step("переход на страницу Маркет")
    public void gotoMarket(){basePage.gotoSYandexMarketPage();}

}
