package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.isRoot;
import static ru.iteco.fmhandroid.ui.latency.ViewMatcherLatency.waitDisplayed;

import io.qameta.allure.kotlin.Allure;
import ru.iteco.fmhandroid.ui.pageobjects.LoveIsAll;
import ru.iteco.fmhandroid.ui.pageobjects.MainMenu;
import ru.iteco.fmhandroid.ui.pageobjects.News;

public class LoveIsAllSteps {

    LoveIsAll loveIsAll = new LoveIsAll();
    MainMenu mainMenu = new MainMenu();
    News news = new News();
    public void checkLoveIsAllElements() {
        Allure.step("Проверка элементов экрана Love Is All");
        onView(isRoot()).perform(waitDisplayed(loveIsAll.ourMissionButton, 7000));
    }
    public void goToLoveSection() {
        Allure.step("Переход на страницу Love is all");
        loveIsAll.checkOurMissionButton();
    }
    public void quotesLoveIsAll () {
        Allure.step("Наличие текста внутри цитаты в Love is all");
        loveIsAll.checkQuotesInside();

    }
    public void backFromLoveToMenuSection() {
        Allure.step("Обратный переход со страницы Love is all в основное меню");
        loveIsAll.clickOurMissionButton();
        mainMenu.mainMenuButton();
        news.newsTitleDisplayed();

    }
}