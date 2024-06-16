package ru.iteco.fmhandroid.ui.steps;


import static android.provider.Telephony.Carriers.PASSWORD;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static com.google.firebase.analytics.FirebaseAnalytics.Event.LOGIN;
import static ru.iteco.fmhandroid.ui.pageobjects.LogIn.loginText;
import static ru.iteco.fmhandroid.ui.pageobjects.LogIn.passwordText;
import static ru.iteco.fmhandroid.ui.pageobjects.LogIn.signButton;
import static ru.iteco.fmhandroid.ui.pageobjects.LogIn.textView;

import androidx.test.espresso.ViewAssertion;

import io.qameta.allure.kotlin.Allure;
import ru.iteco.fmhandroid.ui.pageobjects.LogIn;

public class LoginSteps {
    public static void isLogIn() {
        Allure.step("Проверка наличия данных авторизации");
        LogIn.loginText.check(matches(isDisplayed()));

    }

    public static void validLogin(String login, String password) {
        Allure.step("Авторизация с валидными данными");
        loginText.perform(replaceText(LOGIN));
        passwordText.perform(replaceText(PASSWORD));
        signButton.perform(click());
        textView.check((ViewAssertion)withText("News"));
    }

    public static void invalidLogin(String LOGIN2, String PASSWORD2) {
        Allure.step("Авторизация с невалидными данными");
        loginText.perform(replaceText(LOGIN2));
        passwordText.perform(replaceText(PASSWORD2));
        signButton.perform(click());
        textView.check((ViewAssertion)withText("Wrong login or password"));
    }

    public static void emptyLoginData() {
        Allure.step("Авторизация с пустым полем логин и паролем");
        loginText.perform(replaceText(""));
        passwordText.perform(replaceText(""));
        textView.check((ViewAssertion)withText("Login and password cannot be empty"));
    }


}

