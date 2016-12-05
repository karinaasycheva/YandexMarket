package com.aplana.autotest.steps;

import net.serenitybdd.jbehave.SerenityStory;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;
import com.aplana.autotest.PropertyLoader;
/**
 * Created by Карина on 26.11.2016.
 */
//@RunWith(SerenityJBehaveTestRunner.class)
public class YandexScenario extends SerenityStory{
    @Steps
    BaseYandexSteps basePage;
    @Steps
    MarketSteps marketPage;
    @Steps
    ElectronicSteps electronicPage;
    @Steps
    TVSteps tvPage;
    @Steps
    EarphoneSteps earPage;
    @Steps
    UploadSteps uploadPage;
    @Steps
    FoundSteps foundPage;
    @Steps
    ProductSteps productPage;

    String Name;
    String baseUrl = PropertyLoader.loadProperty("baseUrl");//"https://www.yandex.ru";

    @Given("открыта главная страница")
    public void setUp(){
        String workingDir = System.getProperty("user.dir");
        System.setProperty("webdriver.firefox.marionette", workingDir + File.separator + "drivers" + File.separator +"geckodriver");
        ThucydidesWebDriverSupport.getDriver().manage().window().maximize();
        ThucydidesWebDriverSupport.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @When("когда открыта главная страница")
    public void openHomePage() {
        ThucydidesWebDriverSupport.getDriver().get(baseUrl);
    }
    @Then("проверяем загрузилась ли она правильно")
    public void checkBaseUlmPage(){basePage.gotoCheckBasePage();}

    @When("когда загружена страница яндекс Маркета")
    public void gotoMarketPages(){basePage.gotoMarket();}

    @Then("проверка загрузки")
    public void checkMarketPage(){marketPage.gotoCheckMarkPage();}

    @When("когда загружена страница Электроники")
    public void gotoElPages(){marketPage.gotoEl();}

    @Then("проверка странцы")
    public void checkElPages(){electronicPage.gotoCheckElPage();}

    @When("загружена страница с Телевизорами")
    public void gotoTvPages(){electronicPage.gotoTV();}

    @Then("проверка загрузки страницы с Телевизорами")
    public void checkTvPages() {tvPage.checkPage();}

    @When("загружена страница с Наушниками")
    public void gotoEarPages(){electronicPage.gotoEar();}

    @Then("проверка загрузки страницы с Наушниками")
    public void checkEarPages() {earPage.checkPage();}

    @Then("задать параметр поиска от $n рублей")
    public void giveSum(int Sum){productPage.setSum(Sum);}

    @Then("выбрать производителей $name")
    public void chooseCr(List<String> name){
        for(String n: name){productPage.choose(n);}
    }

    @When("нажата кнопка применить")
    public void gotoMakeSelect(){productPage.gotoMake();}

    @Then("проверка количества элементов")
    public void checkNumber(){uploadPage.checkQ();}

    @Then("взаписать Имя товара")
    public void getNameItem(){Name = uploadPage.getName();}

    @Then("Ввести значение в поисковую строку")
    public void inputN(){uploadPage.inputName(Name);}

    @When("Когда нашли элемент")
    public void foundEl(){foundPage.clickFind();}

    @Then("сравнение")
    public void compare(){foundPage.compareNameArt(Name);}

}
