package com.aplana.autotest.steps;

import com.aplana.autotest.pages.UploadPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;

/**
 * Created by Карина on 02.12.2016.
 */
public class UploadSteps {
    UploadPage uploadPage;

    @Step("проверка количесвтва элементов на сттранице")
    public void checkQ(){uploadPage.isQuantity();}

    @Step("запомнить первый элемент")
    public String getName( ){
        return uploadPage.getName();}

    @Step("Внести значение в поисковую строку")
    public void inputName(String Name){
        uploadPage.clearPurchase(Name);

    }
}
