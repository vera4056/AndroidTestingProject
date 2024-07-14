package ru.iteco.fmhandroid.ui.tests;


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

    LoginSteps loginSteps = new LoginSteps();
    AboutSteps aboutSteps = new AboutSteps();

    @Rule
    public ActivityScenarioRule<AppActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(AppActivity.class);

    @Before
    public void waitAboutLoad ()  {
        aboutSteps.checkScreenElementsAbout();

    }

    @Test
    public void openAboutSectionTest() {
        aboutSteps.goToAboutSection();

    }
    @Test
    public void displayAboutSectionsTest(){
        aboutSteps.displayAboutSection();
    }
    @Test
    public void goToPrivacyPolicyTest() {
        aboutSteps.linkToPrivacyPolicy();

    }

    @Test
    public void goToTermsOfUseTest() {
        aboutSteps.linkToTermsOfUse();

    }

    @Test
    public void backToNewsTest() {
        aboutSteps.backToNews();

    }
}
