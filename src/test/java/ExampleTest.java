import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class ExampleTest extends A_BaseTest {

    @Test
    public void ChooseTvByModelsAndPrice_CheckModelsAndPrice() {

        // region #1 - Зайти на market.yandex.ru
        app.mainPageYM.open();
        Allure.addAttachment("Зайти на market.yandex.ru", new ByteArrayInputStream(((TakesScreenshot) getWebDriver()).getScreenshotAs(OutputType.BYTES)));
        //endregion

        //region #2 - Выбрать раздел Электроника - > Телевизоры
        app.mainPageYM.electronicsSection.click();
        app.electronicsPageYM.televisionSection.click();
        Allure.addAttachment("Выбрать раздел Электроника - > Телевизоры", new ByteArrayInputStream(((TakesScreenshot) getWebDriver()).getScreenshotAs(OutputType.BYTES)));
        //endregion

        //region #3 - Задать параметр поиска
        //Указываем цену
        app.televisionCatalogPageYM.televisionPriceFrom.scrollTo();
        app.televisionCatalogPageYM.televisionPriceFrom.sendKeys("20000");

        //Выбираем Samsung чекбокс
        app.televisionCatalogPageYM.televisionSamsungBrandCheckbox.scrollTo();
        app.televisionCatalogPageYM.televisionSamsungBrandCheckbox.shouldNotBe(selected);
        app.televisionCatalogPageYM.televisionSamsungBrandCheckbox.shouldNotBe(checked);
        app.televisionCatalogPageYM.televisionSamsungBrandCheckbox.click(1, 1);

        //Выбираем LG чекбокс
        app.televisionCatalogPageYM.televisionLGBrandCheckbox.scrollTo();
        app.televisionCatalogPageYM.televisionLGBrandCheckbox.shouldNotBe(selected);
        app.televisionCatalogPageYM.televisionLGBrandCheckbox.shouldNotBe(checked);
        app.televisionCatalogPageYM.televisionLGBrandCheckbox.click(1, 1);

        //Проверяем что первый элемент списка относится к указанным моделям
        app.televisionCatalogPageYM.televisionFirstOfList.shouldHave(matchesText("((?i)Samsung)|((?i)LG)"));
        Allure.addAttachment("Задать параметр поиска", new ByteArrayInputStream(((TakesScreenshot) getWebDriver()).getScreenshotAs(OutputType.BYTES)));
        //endregion

        //region #4 - Проверить что производитель и цена соответствуют выбранным параметрам поиска
        String priceSrt = app.televisionCatalogPageYM.televisionFirstOfListPrice.innerText();
        Allure.addAttachment("цена первого товара", priceSrt);

        softAssert.assertTrue(priceSrt.matches("^[2-9][0-9] [0-9][0-9][0-9] ₽"));
        Allure.addAttachment("Проверить производителя и цену", new ByteArrayInputStream(((TakesScreenshot) getWebDriver()).getScreenshotAs(OutputType.BYTES)));
        //endregion
    }
}
