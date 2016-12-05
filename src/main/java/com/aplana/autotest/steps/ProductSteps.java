package com.aplana.autotest.steps;

import com.aplana.autotest.pages.ProductPage;
import com.aplana.autotest.pages.TVPage;
import net.thucydides.core.annotations.Step;

/**
 * Created by Карина on 05.12.2016.
 */
public class ProductSteps {
    ProductPage productPage;
    @Step("выбираем производителей")
    public void choose(String n){productPage.pushBut(n);}

    @Step("нажать кнопку Применить")
    public void gotoMake(){productPage.gotoCreate();}

    @Step("Задается параметр поиска")
    public void setSum(int sum) {
        productPage.setSum(sum);
    }
}
