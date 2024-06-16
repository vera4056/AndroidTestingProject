package ru.iteco.fmhandroid.ui.tests;


import static android.provider.Telephony.Carriers.PASSWORD;
import static com.google.firebase.analytics.FirebaseAnalytics.Event.LOGIN;

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
    public void login () throws InterruptedException {
        Thread.sleep(9000);
        try {
            loginSteps.validLogin(LOGIN, PASSWORD);
        } catch (NoMatchingViewException e) {
            return;
        }
        loginSteps.validLogin(LOGIN, PASSWORD);
    }

    AboutSteps aboutSteps = new AboutSteps();
    LoginSteps loginSteps = new LoginSteps();
    @Test
    public void displayAboutSectionTest() {
        aboutSteps.goToAboutSection();
        aboutSteps.displayAboutSection();

    }

    @Test
    public void goToPrivacyPolicyTest() {
        aboutSteps.goToAboutSection();
        aboutSteps.linkToPrivacyPolicy();
    }

    @Test
    public void goToTermsOfUseTest() {
        aboutSteps.goToAboutSection();
        aboutSteps.linkToTermsOfUse();
    }

    @Test
    public void backToNewsTest() {
        aboutSteps.goToAboutSection();
        aboutSteps.backToNews();
    }
}
