package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.isRoot;
import static ru.iteco.fmhandroid.ui.latency.ViewMatcherLatency.waitDisplayed;

import io.qameta.allure.kotlin.Allure;
import ru.iteco.fmhandroid.ui.pageobjects.About;
import ru.iteco.fmhandroid.ui.pageobjects.MainMenu;
import ru.iteco.fmhandroid.ui.pageobjects.News;

public class MainMenuSteps {

    MainMenu mainMenu = new MainMenu();
    News news = new News();
    About about = new About();

    public void mainScreenLoad() {
        Allure.step("Загрузка страницы Main");
        onView(isRoot()).perform(waitDisplayed(mainMenu.menuButton, 7000));

    }

    public void menuButtons() {
        Allure.step("Отображение информации (разделов) на верхней панеле меню");
        mainMenu.checkMenuButtons();

    }

    public void goToNews () {
        Allure.step("Переход из раздела Main в раздел News");
        mainMenu.mainMenuButton();
        news.newsTitleDisplayed();
        news.allNewsDisplayed();

    }

    public void goToAbout () {
        Allure.step("Переход из раздела Main в раздел About");
        mainMenu.mainMenuButton();
        about.aboutTitleDisplayed();

    }

}