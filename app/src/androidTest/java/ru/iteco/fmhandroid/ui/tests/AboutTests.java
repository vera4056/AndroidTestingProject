package ru.iteco.fmhandroid.ui.tests;


import androidx.test.espresso.NoMatchingViewException;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import ru.iteco.fmhandroid.ui.AppActivity;
import ru.iteco.fmhandroid.ui.steps.AboutSteps;
import ru.iteco.fmhandroid.ui.steps.LoginSteps;

@LargeTest
@RunWith(AndroidJUnit4.class)



public class AboutTests {

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

    AboutSteps aboutSteps = new AboutSteps();
    LoginSteps loginSteps = new LoginSteps();
    @Test
    public void displayAboutSectionTest() {
        AboutSteps.goToAboutSection();
        aboutSteps.displayAboutSection();

    }

    @Test
    public void goToPrivacyPolicyTest() {
        AboutSteps.goToAboutSection();
        AboutSteps.linkToPrivacyPolicy();
    }

    @Test
    public void goToTermsOfUseTest() {
        AboutSteps.goToAboutSection();
        AboutSteps.linkToTermsOfUse();
    }

    @Test
    public void backToNewsTest() {
        AboutSteps.goToAboutSection();
        AboutSteps.backToNews();
    }
}

