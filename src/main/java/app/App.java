package app;

import app.pages.ElectronicsPageYM;
import app.pages.MainPageYM;
import app.pages.TelevisionCatalogPageYM;

public class App {

    public MainPageYM mainPageYM;
    public ElectronicsPageYM electronicsPageYM;
    public TelevisionCatalogPageYM televisionCatalogPageYM;

    public App() {
        mainPageYM = PageBuilder.buildYandexMarketMainPage();
        electronicsPageYM = PageBuilder.yandexMarketElectronicsPage();
        televisionCatalogPageYM = PageBuilder.yandexMarketTelevisionCatalogPage();
    }
}
