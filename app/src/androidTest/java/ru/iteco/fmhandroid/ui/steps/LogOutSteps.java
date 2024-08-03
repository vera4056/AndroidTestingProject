package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static ru.iteco.fmhandroid.ui.pageobjects.LogOut.authImage;
import static ru.iteco.fmhandroid.ui.pageobjects.LogOut.checkLogOut;
import static ru.iteco.fmhandroid.ui.pageobjects.LogOut.logOutButton;

import androidx.test.espresso.ViewAssertion;

import io.qameta.allure.kotlin.Allure;

public class LogOutSteps {

    public  void logOut() {
        Allure.step("Выход из учетной записи");
        authImage.perform(click());
        logOutButton.perform(click());
        checkLogOut.check((ViewAssertion) withText("Authorization"));

    }
}
