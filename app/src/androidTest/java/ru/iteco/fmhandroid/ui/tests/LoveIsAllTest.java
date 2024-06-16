package ru.iteco.fmhandroid.ui.tests;

import static android.provider.Telephony.Carriers.PASSWORD;
import static com.google.firebase.analytics.FirebaseAnalytics.Event.LOGIN;

import androidx.test.espresso.NoMatchingViewException;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import ru.iteco.fmhandroid.ui.AppActivity;
import ru.iteco.fmhandroid.ui.steps.LoginSteps;
import ru.iteco.fmhandroid.ui.steps.LoveIsAllSteps;

public class LoveIsAllTest {
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

    LoginSteps loginSteps = new LoginSteps();
    LoveIsAllSteps loveIsAllSteps = new LoveIsAllSteps();


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
