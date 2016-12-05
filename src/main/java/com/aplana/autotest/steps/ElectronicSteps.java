package com.aplana.autotest.steps;

import com.aplana.autotest.pages.ElectronicPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;

/**
 * Created by Карина on 02.12.2016.
 */
public class ElectronicSteps {
    ElectronicPage electronicPage;
    @Step("проверка страницы")
    public void gotoCheckElPage( ){
        electronicPage.checkElectronicPage();
    }

    @Step("переход на страницу TV")
    public void gotoTV(){electronicPage.gotoTvPage();}

    @Step("")
    public void gotoEar(){electronicPage.gotoEarPage();}

}
