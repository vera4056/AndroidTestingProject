package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static ru.iteco.fmhandroid.ui.pageobjects.About.aboutBackButton;
import static ru.iteco.fmhandroid.ui.pageobjects.About.aboutCompany;
import static ru.iteco.fmhandroid.ui.pageobjects.About.aboutTextButton;
import static ru.iteco.fmhandroid.ui.pageobjects.About.privacyPolicyLink;
import static ru.iteco.fmhandroid.ui.pageobjects.About.termsOfUseLink;
import static ru.iteco.fmhandroid.ui.pageobjects.About.versionInfo;
import static ru.iteco.fmhandroid.ui.pageobjects.MainMenu.menuButton;
import static ru.iteco.fmhandroid.ui.pageobjects.News.newsOnMain;

import io.qameta.allure.kotlin.Allure;

public class AboutSteps {

    public static void goToAboutSection () {
        Allure.step("Переход на страницу About");
        menuButton.perform(click());
        aboutTextButton.check(matches(isDisplayed()));
        aboutTextButton.perform(click());
        versionInfo.check(matches(isDisplayed()));

    }
    public static void displayAboutSection () {
        Allure.step("Отображение страницы About с ссылками на Privacy Policy и Terms of use");
        versionInfo.check(matches(isDisplayed()));
        privacyPolicyLink.check(matches(isDisplayed()));
        termsOfUseLink.check(matches(isDisplayed()));
        aboutCompany.check(matches(isDisplayed()));

    }

    public static void linkToPrivacyPolicy () {
        Allure.step("Переход к Privacy Policy");
        privacyPolicyLink.perform(click());
    }

    public static void linkToTermsOfUse() {
        Allure.step("Переход к Terms of use");
        termsOfUseLink.perform(click());
    }

    public static void backToNews() {
        Allure.step("Обратный переход в раздел News");
        aboutBackButton.perform(click());
        newsOnMain.check(matches(isDisplayed()));
    }


}
