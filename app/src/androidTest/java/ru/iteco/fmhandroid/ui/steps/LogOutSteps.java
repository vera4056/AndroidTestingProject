package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static ru.iteco.fmhandroid.ui.pageobjects.LogOut.authImage;
import static ru.iteco.fmhandroid.ui.pageobjects.LogOut.logOutButton;

import io.qameta.allure.kotlin.Allure;

public class LogOutSteps {

    public  void logOut() {
        Allure.step("Выход из учетной записи");
        authImage.perform(click());
        logOutButton.check(matches(isDisplayed()));
        logOutButton.perform(click());
        /*authorization.check(matches(isDisplayed()));*/


    }
}
