package com.aplana.autotest.steps;

import com.aplana.autotest.pages.FoundPage;
import net.thucydides.core.annotations.Step;

/**
 * Created by Карина on 02.12.2016.
 */
public class FoundSteps {
    FoundPage foundPage;

    @Step("Нажатие найти")
    public void clickFind(){foundPage.gotoFind();}

    @Step("")
    public void gotoItem(){foundPage.gotoChoosenItem();}

    @Step("сравнение имени и артикула")
    public void compareNameArt(String Name){foundPage.comparison(Name);}
}
