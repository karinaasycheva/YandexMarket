package com.aplana.autotest.steps;


import com.aplana.autotest.pages.TVPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;

/**
 * Created by Карина on 02.12.2016.
 */
public class TVSteps {
    TVPage tvPage;

    @Step("проверка загрузки страницы")
    public void checkPage( ) {
        tvPage.checkTvPage();
    }
}
