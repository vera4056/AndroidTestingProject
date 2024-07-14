package ru.iteco.fmhandroid.ui.tests;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import ru.iteco.fmhandroid.ui.AppActivity;
import ru.iteco.fmhandroid.ui.steps.LoginSteps;
import ru.iteco.fmhandroid.ui.steps.LoveIsAllSteps;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class LoveIsAllTest {
    LoginSteps loginSteps = new LoginSteps();
    LoveIsAllSteps loveIsAllSteps = new LoveIsAllSteps();
    @Rule
    public ActivityScenarioRule<AppActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(AppActivity.class);

    @Before
    public void waitLoveIsAllLoad ()  {
        loveIsAllSteps.checkLoveIsAllElements();
    }

    @Test
    public void openLoveIsAllSection() {
        loveIsAllSteps.goToLoveSection();

    }

    @Test
    public void checkQuotesLoveIsAll() {
        loveIsAllSteps.quotesLoveIsAll();

    }

    @Test
    public void checkBackNavigationLoveIsAll() {
        loveIsAllSteps.backFromLoveToMenuSection();

    }
}
