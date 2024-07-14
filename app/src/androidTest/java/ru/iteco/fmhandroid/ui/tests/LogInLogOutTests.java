package ru.iteco.fmhandroid.ui.tests;


import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import ru.iteco.fmhandroid.ui.AppActivity;
import ru.iteco.fmhandroid.ui.steps.LogOutSteps;
import ru.iteco.fmhandroid.ui.steps.LoginSteps;
import ru.iteco.fmhandroid.ui.steps.MainMenuSteps;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class LogInLogOutTests {


    @Rule
    public ActivityScenarioRule<AppActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(AppActivity.class);

    @Before
    public void waitForLoginFieldId ()  {
        loginSteps.shouldWaitLoadLoginFieldID();

    }
    String LOGIN = "login2";
    String PASSWORD = "password2";

    String LOGIN2 = "login3";
    String PASSWORD2 = "password3";

    LoginSteps loginSteps = new LoginSteps();
    LogOutSteps logOutSteps = new LogOutSteps();
    MainMenuSteps mainMenuSteps = new MainMenuSteps();

    @Test
    public void authorizationPageIsVisibleTest() {

        loginSteps.isLogIn();
    }

    @Test
    public void logInWithValidDataTest() {
        loginSteps.validLogin(LOGIN, PASSWORD);

    }

    @Test
    public void logInWithUnValidDataTest() {
        loginSteps.invalidLoginOrPassword(LOGIN2, PASSWORD2);

    }

    @Test
    public void logInWithEmptyDataTest() {
        loginSteps.emptyLoginData();

    }

    @Test
    public void logOutTest() {
        loginSteps.validLogin(LOGIN, PASSWORD);
        logOutSteps.logOut();


    }
}