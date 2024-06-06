package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static ru.iteco.fmhandroid.ui.pageobjects.LogOut.AuthImage;
import static ru.iteco.fmhandroid.ui.pageobjects.LogOut.CheckLogOut;
import static ru.iteco.fmhandroid.ui.pageobjects.LogOut.LogOutButton;

import androidx.test.espresso.ViewAssertion;

import io.qameta.allure.kotlin.Allure;

public class LogOutSteps {
    public void logOut() {
        Allure.step("Выход из учетной записи");
        AuthImage.perform(click());
        LogOutButton.perform(click());
        CheckLogOut.check((ViewAssertion)withText("Authorization"));;

    }
}
