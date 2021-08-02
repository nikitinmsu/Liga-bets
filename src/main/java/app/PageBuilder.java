package app;

import app.pages.ElectronicsPageYM;
import app.pages.MainPageYM;
import app.pages.TelevisionCatalogPageYM;

public class PageBuilder {

    public static MainPageYM buildYandexMarketMainPage() {
        return new MainPageYM("");
    }

    public static ElectronicsPageYM yandexMarketElectronicsPage() {
        return new ElectronicsPageYM("/catalog--elektronika/54440");
    }
     public static TelevisionCatalogPageYM yandexMarketTelevisionCatalogPage() {
        return new TelevisionCatalogPageYM("/catalog--televizory/18040671/list?cpa=0&hid=90639&onstock=1&local-offers-first=0");
    }

}
