package app.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class TelevisionCatalogPageYM extends BasePage {

    public SelenideElement televisionPriceFrom = $("[data-range-input-type = 'from'] > input");
    public SelenideElement televisionSamsungBrandCheckbox = $(byXpath("//input[@name = 'Производитель Samsung']"));
    public SelenideElement televisionLGBrandCheckbox = $(byXpath("//input[@name = 'Производитель LG']"));
    public SelenideElement televisionFirstOfList = $(byXpath("//*[@data-autotest-id='product-snippet']//* [@data-tid='ce80a508']"));
    public SelenideElement televisionFirstOfListPrice = $("[data-autotest-currency='₽']");


    public TelevisionCatalogPageYM(String pageUrl) {
        super(pageUrl);
    }
}
