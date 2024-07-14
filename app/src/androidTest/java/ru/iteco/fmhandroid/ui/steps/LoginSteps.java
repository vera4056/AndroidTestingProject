package ru.iteco.fmhandroid.ui.steps;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.isRoot;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import static ru.iteco.fmhandroid.ui.latency.ViewMatcherLatency.waitDisplayed;

import io.qameta.allure.kotlin.Allure;
import ru.iteco.fmhandroid.ui.latency.ViewMatcherLatency;
import ru.iteco.fmhandroid.ui.pageobjects.LogIn;


public class LoginSteps {


    LogIn logIn = new LogIn();
    ViewMatcherLatency viewMatcherLatency = new ViewMatcherLatency();

    public void shouldWaitLoadLoginFieldID() {
        Allure.step("Загрузка страницы авторизации");
        onView(isRoot()).perform(waitDisplayed(logIn.loginFieldId, 7000));

    }

    public void isLogIn() {
        Allure.step("Проверка наличия данных авторизации");
        onView(withId(logIn.loginFieldId)).check(matches(isDisplayed()));

    }

    public void validLogin(String LOGIN, String PASSWORD) {
        Allure.step("Авторизация с валидными данными");
        logIn.fillValidLoginPassword(LOGIN, PASSWORD);
        logIn.viewMainButton();

    }


    public void invalidLoginOrPassword(String LOGIN2, String PASSWORD2) {
        Allure.step("Авторизация с невалидными данными");
        logIn.fillUnValidLoginPassword(LOGIN2, PASSWORD2);


    }

    public void emptyLoginData() {
        Allure.step("Авторизация с пустым полем логин и паролем");
        logIn.emptyLoginPassword();
    }



}

