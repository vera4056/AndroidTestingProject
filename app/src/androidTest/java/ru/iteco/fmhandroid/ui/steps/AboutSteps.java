package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.isRoot;
import static ru.iteco.fmhandroid.ui.latency.ViewMatcherLatency.waitDisplayed;

import io.qameta.allure.kotlin.Allure;
import ru.iteco.fmhandroid.ui.pageobjects.About;
import ru.iteco.fmhandroid.ui.pageobjects.LogIn;
import ru.iteco.fmhandroid.ui.pageobjects.MainMenu;
import ru.iteco.fmhandroid.ui.pageobjects.News;

public class AboutSteps {
    LogIn logIn = new LogIn();
    About about = new About();
    MainMenu mainMenu = new MainMenu();
    News news = new News();

    public void checkScreenElementsAbout() {
        Allure.step("Проверка элементов экрана About us");
        onView(isRoot()).perform(waitDisplayed(about.aboutUs, 7000));
    }

    public void goToAboutSection () {
        Allure.step("Переход на страницу About");
        mainMenu.mainMenuButton();
        about.openAboutPage();

    }
    public void displayAboutSection () {
        Allure.step("Отображение страницы About с ссылками на Privacy Policy и Terms of use");
        mainMenu.mainMenuButton();
        about.checkAboutSection();
    }

    public void linkToPrivacyPolicy () {
        Allure.step("Переход к Privacy Policy");
        mainMenu.mainMenuButton();
        about.checkPrivacyPolicy();
    }

    public void linkToTermsOfUse() {
        Allure.step("Переход к Terms of use");
        mainMenu.mainMenuButton();
        about.checkTermsOfUse();
    }

    public void backToNews() {
        Allure.step("Обратный переход в раздел News");
        about.aboutBackToNews();
        news.newsTitleDisplayed();
    }

}
