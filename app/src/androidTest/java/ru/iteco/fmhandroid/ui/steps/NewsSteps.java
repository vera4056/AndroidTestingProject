package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.doesNotExist;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static ru.iteco.fmhandroid.ui.pageobjects.MainMenu.menuButton;
import static ru.iteco.fmhandroid.ui.pageobjects.News.addNewsButton;
import static ru.iteco.fmhandroid.ui.pageobjects.News.allNewsCardsBlock;
import static ru.iteco.fmhandroid.ui.pageobjects.News.categoryButton;
import static ru.iteco.fmhandroid.ui.pageobjects.News.categoryText;
import static ru.iteco.fmhandroid.ui.pageobjects.News.confirmationButton;
import static ru.iteco.fmhandroid.ui.pageobjects.News.createdNewsDateView;
import static ru.iteco.fmhandroid.ui.pageobjects.News.doesNotExist;
import static ru.iteco.fmhandroid.ui.pageobjects.News.editNewsButton;
import static ru.iteco.fmhandroid.ui.pageobjects.News.newsCardButton;
import static ru.iteco.fmhandroid.ui.pageobjects.News.newsDate;
import static ru.iteco.fmhandroid.ui.pageobjects.News.newsDeleteButton;
import static ru.iteco.fmhandroid.ui.pageobjects.News.newsDescription;
import static ru.iteco.fmhandroid.ui.pageobjects.News.newsFillDescription;
import static ru.iteco.fmhandroid.ui.pageobjects.News.newsOnMain;
import static ru.iteco.fmhandroid.ui.pageobjects.News.newsTime;
import static ru.iteco.fmhandroid.ui.pageobjects.News.newsTitle;
import static ru.iteco.fmhandroid.ui.pageobjects.News.saveButton;

import androidx.test.espresso.ViewAssertion;

import io.qameta.allure.kotlin.Allure;

public class NewsSteps {
    public static void checkNews() {
        Allure.step("Проверка на наличие текста в блоке News");
        menuButton.perform(click());
        newsOnMain.check(matches(isDisplayed()));
        newsOnMain.perform(click());
        newsCardButton.check(matches(isDisplayed()));
        newsCardButton.perform(click());
        newsDescription.check(matches(isDisplayed()));
        newsCardButton.perform(click());
        allNewsCardsBlock.check(matches(isDisplayed()));

    }

    public static void openCreateNewsForm() {
        Allure.step("Открытие формы для создания новости в News");
        menuButton.perform(click());
        newsOnMain.check(matches(isDisplayed()));
        newsOnMain.perform(click());
        editNewsButton.check(matches(isDisplayed()));
        editNewsButton.perform(click());
        addNewsButton.check(matches(isDisplayed()));
        addNewsButton.perform(click());

    }

    public static void createNewsWithValidData() {
        Allure.step("Создание новости валидными данными в News");
        categoryButton.check(matches(isDisplayed()));
        categoryButton.perform(click());
        categoryText.check(matches(isDisplayed()));
        categoryText.perform(click());
        newsTitle.check(matches(isDisplayed()));
        newsDate.check(matches(isDisplayed()));
        newsDate.perform(click());
        newsTime.check(matches(isDisplayed()));
        newsTime.perform(click());
        newsFillDescription.perform(replaceText("celebrating bd"));
        saveButton.check(matches(isDisplayed()));
        saveButton.perform(click());
        createdNewsDateView.check(matches(isDisplayed()));

    }

    public static void deleteNews() {
        Allure.step("Удаление новости  в News");
        menuButton.perform(click());
        newsOnMain.check(matches(isDisplayed()));
        newsOnMain.perform(click());
        editNewsButton.check(matches(isDisplayed()));
        editNewsButton.perform(click());
        newsCardButton.check((ViewAssertion) withText("На удаление"));
        newsDeleteButton.check(matches(isDisplayed()));
        newsDeleteButton.perform(click());
        confirmationButton.check(matches(isDisplayed()));
        confirmationButton.perform(click());
        doesNotExist.check(doesNotExist());


    }


}