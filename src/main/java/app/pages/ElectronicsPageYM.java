package app.pages;

import app.AppConfig;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ElectronicsPageYM extends BasePage {

    public SelenideElement televisionSection = $("[href*='/catalog--televizory/']");


    public ElectronicsPageYM(String pageUrl) {
        super(pageUrl);
    }
}
