package com.aplana.autotest.steps;

import com.aplana.autotest.pages.EarphonePage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;

/**
 * Created by Карина on 05.12.2016.
 */
public class EarphoneSteps {
    EarphonePage earphonePage;

    @Step("проверка загрузки страницы")
    public void checkPage() {
        earphonePage.checkEarPage();
    }

}
