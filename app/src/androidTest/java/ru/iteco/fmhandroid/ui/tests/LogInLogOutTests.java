package ru.iteco.fmhandroid.ui.tests;


import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import ru.iteco.fmhandroid.ui.AppActivity;
import ru.iteco.fmhandroid.ui.pageobjects.LogIn;
import ru.iteco.fmhandroid.ui.steps.LogOutSteps;
import ru.iteco.fmhandroid.ui.steps.LoginSteps;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class LogInLogOutTests {

    String LOGIN = "login2";
    String PASSWORD = "password2";

    String LOGIN2 = "login3";
    String PASSWORD2 = "password3";
    @Rule
    public ActivityScenarioRule<AppActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(AppActivity.class);

    @Before
    public void sleep() throws InterruptedException {
        Thread.sleep(5000);

    }

    LogIn logIn = new LogIn();
    LoginSteps loginSteps = new LoginSteps();
    LogOutSteps logOutSteps = new LogOutSteps();

    @Test
    public void logInWithValidDataTest() {
        loginSteps.validLogin();

    }

    @Test
    public void logInWithNotValidDataTest() {
        loginSteps.invalidLogin();

    }

    @Test
    public void logInWithEmptyDataTest() {
        loginSteps.emptyLoginData();

    }

    @Test
    public void logOutTest() {
        loginSteps.validLogin();
        logOutSteps.logOut();


    }
}