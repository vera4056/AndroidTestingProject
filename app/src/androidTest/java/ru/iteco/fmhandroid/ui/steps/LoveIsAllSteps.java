package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static ru.iteco.fmhandroid.ui.pageobjects.LoveIsAll.missionBackgroundImage;
import static ru.iteco.fmhandroid.ui.pageobjects.LoveIsAll.missionDescriptionText;
import static ru.iteco.fmhandroid.ui.pageobjects.LoveIsAll.missionTextButton;
import static ru.iteco.fmhandroid.ui.pageobjects.LoveIsAll.missionTitle;
import static ru.iteco.fmhandroid.ui.pageobjects.LoveIsAll.missionTitleText;
import static ru.iteco.fmhandroid.ui.pageobjects.LoveIsAll.openCloseCardButton;
import static ru.iteco.fmhandroid.ui.pageobjects.LoveIsAll.ourMissionButton;
import static ru.iteco.fmhandroid.ui.pageobjects.MainMenu.menuButton;
import static ru.iteco.fmhandroid.ui.pageobjects.News.newsOnMain;

import io.qameta.allure.kotlin.Allure;

public class LoveIsAllSteps {
    public static void goToLoveSection() {
        Allure.step("Переход на страницу Love is all");
        ourMissionButton.perform(click());
        missionTextButton.check(matches(isDisplayed()));
        missionBackgroundImage.check(matches(isDisplayed()));
        missionTitle.check(matches(isDisplayed()));
    }
    public static void quotesLoveIsAll () {
        Allure.step("Наличие текста внутри цитаты в Love is all");
        ourMissionButton.perform(click());
        missionTextButton.check(matches(isDisplayed()));
        openCloseCardButton.check(matches(isDisplayed()));
        openCloseCardButton.perform(click());
        missionTitleText.check(matches(isDisplayed()));
        missionDescriptionText.check(matches(isDisplayed()));
        openCloseCardButton.perform(click());


    }
    public static void backFromLoveToMenuSection() {
        Allure.step("Обратный переход со страницы Love is all в основное меню");
        ourMissionButton.perform(click());
        missionTextButton.check(matches(isDisplayed()));
        menuButton.perform(click());
        newsOnMain.check(matches(isDisplayed()));

    }
}
