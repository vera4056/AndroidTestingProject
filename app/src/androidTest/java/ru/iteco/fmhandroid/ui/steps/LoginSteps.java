package ru.iteco.fmhandroid.ui.steps;


import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static ru.iteco.fmhandroid.ui.pageobjects.LogIn.loginText;
import static ru.iteco.fmhandroid.ui.pageobjects.LogIn.passwordText;
import static ru.iteco.fmhandroid.ui.pageobjects.LogIn.signButton;
import static ru.iteco.fmhandroid.ui.pageobjects.LogIn.textView;

import androidx.test.espresso.ViewAssertion;

import io.qameta.allure.kotlin.Allure;

public class LoginSteps {

        public void validLogin() {
            Allure.step("Авторизация с валидными данными");
            loginText.perform(replaceText("LOGIN"));
            passwordText.perform(replaceText("PASSWORD"));
            signButton.perform(click());
            textView.check((ViewAssertion)withText("News"));
        }

        public void invalidLogin() {
            Allure.step("Авторизация с невалидными данными");
            loginText.perform(replaceText("LOGIN2"));
            passwordText.perform(replaceText("PASSWORD2"));
            signButton.perform(click());
            textView.check((ViewAssertion)withText("Wrong login or password"));
        }

       public  void emptyLoginData() {
            Allure.step("Авторизация с пустым полем логин и паролем");
            loginText.perform(replaceText(""));
            passwordText.perform(replaceText(""));
            textView.check((ViewAssertion)withText("Login and password cannot be empty"));
        }


    public void logIn(String login2, String password2) {
    }
}
