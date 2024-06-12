package ru.iteco.fmhandroid.ui.tests;

import androidx.test.espresso.NoMatchingViewException;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import ru.iteco.fmhandroid.ui.AppActivity;
import ru.iteco.fmhandroid.ui.steps.LoginSteps;
import ru.iteco.fmhandroid.ui.steps.MainMenuSteps;


public class MainTests {

    @Rule
    public ActivityScenarioRule<AppActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(AppActivity.class);

    @Before
    public void logIn () throws InterruptedException {
        Thread.sleep(9000);
        try {
            loginSteps.validLogin();
        } catch (NoMatchingViewException e) {
            return;
        }
        loginSteps.logIn("login2", "password2");
    }

    LoginSteps loginSteps = new LoginSteps();
    MainMenuSteps mainMenuSteps = new MainMenuSteps();

    @Test
    public void displayMainMenuTest() {
        mainMenuSteps.menuButtons();


    }

    @Test
    public void goToNewsPageTest() {
        mainMenuSteps.goToNews();

    }

    @Test
    public void goToAboutPageTest() {
        mainMenuSteps.goToAbout();
    }
}