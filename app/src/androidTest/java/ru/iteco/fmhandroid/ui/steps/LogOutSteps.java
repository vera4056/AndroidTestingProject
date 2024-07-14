package ru.iteco.fmhandroid.ui.steps;

import io.qameta.allure.kotlin.Allure;
import ru.iteco.fmhandroid.ui.pageobjects.LogOut;

public class LogOutSteps {
        LogOut logOut = new LogOut();
    public  void logOut() {
        Allure.step("Выход из учетной записи");
        logOut.authButton();
        logOut.logOutImage();
        logOut.afterLogOutFrag();

    }
}
