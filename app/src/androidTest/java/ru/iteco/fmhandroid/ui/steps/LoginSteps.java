package ru.iteco.fmhandroid.ui.steps;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.isRoot;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static ru.iteco.fmhandroid.ui.latency.ViewMatcherLatency.waitDisplayed;
import static ru.iteco.fmhandroid.ui.pageobjects.LogIn.emptyAuthField;
import static ru.iteco.fmhandroid.ui.pageobjects.LogIn.enterButton;
import static ru.iteco.fmhandroid.ui.pageobjects.LogIn.loginFieldId;
import static ru.iteco.fmhandroid.ui.pageobjects.LogIn.passwordFieldId;
import static ru.iteco.fmhandroid.ui.pageobjects.LogIn.wrongAuthorization;

import io.qameta.allure.kotlin.Allure;
import ru.iteco.fmhandroid.R;


public class LoginSteps {
    String LOGIN = "login2";
    String PASSWORD = "password2";

    String LOGIN2 = "login3";
    String PASSWORD2 = "password3";

    public void shouldWaitLoadLoginFieldID() {
        Allure.step("Загрузка страницы авторизации");
        onView(isRoot()).perform(waitDisplayed(R.id.enter_button, 7000));
        onView(allOf(withId(R.id.enter_button), withText("SIGN IN"))).check(matches(isDisplayed()));


    }

    public  void isLogIn() {
        Allure.step("Проверка наличия данных авторизации");
        loginFieldId.check(matches(isDisplayed()));

    }

    public void validLogin() {
        Allure.step("Авторизация с валидными данными");
        loginFieldId.perform(replaceText(LOGIN));
        passwordFieldId.perform(replaceText(PASSWORD));
        enterButton.perform(click());

    }


    public void invalidLoginOrPassword() {
        Allure.step("Авторизация с невалидными данными");
        loginFieldId.perform(replaceText(LOGIN2));
        passwordFieldId.perform(replaceText(PASSWORD2));
        enterButton.perform(click());
        wrongAuthorization.check(matches(isDisplayed()));


    }

    public void emptyLoginData() {
        Allure.step("Авторизация с пустым полем логин и паролем");
        loginFieldId.perform(replaceText(""));
        passwordFieldId.perform(replaceText(""));
        enterButton.perform(click());
        emptyAuthField.check(matches(isDisplayed()));
    }



}

