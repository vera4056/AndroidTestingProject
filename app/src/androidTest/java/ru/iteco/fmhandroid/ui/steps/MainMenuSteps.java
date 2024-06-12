package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static ru.iteco.fmhandroid.ui.pageobjects.About.aboutCompany;
import static ru.iteco.fmhandroid.ui.pageobjects.About.aboutTextButton;
import static ru.iteco.fmhandroid.ui.pageobjects.MainMenu.authorizationButton;
import static ru.iteco.fmhandroid.ui.pageobjects.MainMenu.logoMark;
import static ru.iteco.fmhandroid.ui.pageobjects.MainMenu.menuButton;
import static ru.iteco.fmhandroid.ui.pageobjects.MainMenu.missionButton;
import static ru.iteco.fmhandroid.ui.pageobjects.MainMenu.textAuthorizationButton;
import static ru.iteco.fmhandroid.ui.pageobjects.MainMenu.textMenuButton;
import static ru.iteco.fmhandroid.ui.pageobjects.MainMenu.textMissionButton;
import static ru.iteco.fmhandroid.ui.pageobjects.News.allNewsLayout;
import static ru.iteco.fmhandroid.ui.pageobjects.News.newsOnMain;

import androidx.test.espresso.ViewAssertion;

import io.qameta.allure.kotlin.Allure;
import ru.iteco.fmhandroid.R;

public class MainMenuSteps {

    public static void menuButtons() {
        Allure.step("Отображение информации (разделов) на верхней панеле меню");
        menuButton.perform(click());
        textMenuButton.check(matches(isDisplayed()));
        missionButton.perform(click());
        textMissionButton.check(matches(isDisplayed()));
        authorizationButton.perform(click());
        textAuthorizationButton.check(matches(isDisplayed()));
        logoMark.check((ViewAssertion)withId(R.id.trademark_image_view));

    }

    public static void goToNews () {
        Allure.step("Переход из раздела Main в раздел News");
        menuButton.perform(click());
        newsOnMain.check(matches(isDisplayed()));
        newsOnMain.perform(click());
        allNewsLayout.check(matches(isDisplayed()));

    }

    public static void goToAbout () {
        Allure.step("Переход из раздела Main в раздел About");
        menuButton.perform(click());
        aboutTextButton.check(matches(isDisplayed()));
        aboutTextButton.perform(click());
        aboutCompany.check(matches(isDisplayed()));

    }
}