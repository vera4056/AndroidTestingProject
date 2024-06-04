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

        public void loginPage() {
            Allure.step("Вход в аккаунт");
            loginText.perform(replaceText("LOGIN"));
            passwordText.perform(replaceText("PASSWORD"));
            signButton.perform(click());
            textView.check((ViewAssertion)withText("News"));
        }

}
