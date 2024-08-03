package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.isRoot;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static ru.iteco.fmhandroid.ui.latency.ViewMatcherLatency.waitDisplayed;
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

import io.qameta.allure.kotlin.Allure;
import ru.iteco.fmhandroid.R;

public class MainMenuSteps {


    public void mainScreenLoad() {
        Allure.step("Загрузка страницы Main");
        onView(isRoot()).perform(waitDisplayed(R.id.main_menu_image_button, 7000));
        onView(allOf(withId(R.id.main_menu_image_button), withText("Main menu"))).check(matches(isDisplayed()));

    }

    public void menuButtons() {
        Allure.step("Отображение информации (разделов) на верхней панеле меню");
        menuButton.perform(click());
        textMenuButton.check(matches(isDisplayed()));
        missionButton.perform(click());
        textMissionButton.check(matches(isDisplayed()));
        authorizationButton.perform(click());
        textAuthorizationButton.check(matches(isDisplayed()));
        logoMark.check(matches(isDisplayed()));

    }

    public void goToNews () {
        Allure.step("Переход из раздела Main в раздел News");
        menuButton.perform(click());
        newsOnMain.perform(click());
        allNewsLayout.check(matches(isDisplayed()));

    }

    public void goToAbout () {
        Allure.step("Переход из раздела Main в раздел About");
        menuButton.perform(click());
        aboutTextButton.check(matches(isDisplayed()));

    }

}