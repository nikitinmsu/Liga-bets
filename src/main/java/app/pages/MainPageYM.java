package app.pages;

import app.AppConfig;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import helpers.Driver;
import helpers.Trim;

import static com.codeborne.selenide.Selenide.$;

public class MainPageYM extends BasePage {

    public SelenideElement electronicsSection = $("[href*='catalog--elektronika/54440'] > ._3z8Gf");


    public MainPageYM(String pageUrl) {
        super(pageUrl);
    }

    @Override
    public void open() {
        Selenide.open(AppConfig.baseUrl);
    }

}
