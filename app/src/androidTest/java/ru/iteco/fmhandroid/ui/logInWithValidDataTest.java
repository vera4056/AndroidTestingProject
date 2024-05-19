package ru.iteco.fmhandroid.ui;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.isRoot;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static ru.iteco.fmhandroid.R.id.password_text_input_layout;

import androidx.test.espresso.ViewInteraction;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import ru.iteco.fmhandroid.R;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class logInWithValidDataTest {

    String LOGIN = "login2";
    String PASSWORD = "password2";
    @Rule
    public ActivityScenarioRule<AppActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(AppActivity.class);

    @Test
    public void logInWithValidDataTest() {
        ViewInteraction textInputEditText = onView(withId(R.id.login_text_input_layout));
        textInputEditText.check(matches(isDisplayed()));
        textInputEditText.perform(replaceText(LOGIN), closeSoftKeyboard());

        ViewInteraction textInputEditText2 = onView(withId(password_text_input_layout));
        textInputEditText2.check(matches(isDisplayed()));
        textInputEditText2.perform(replaceText(PASSWORD), closeSoftKeyboard());

        ViewInteraction materialButton = onView(withId(R.id.enter_button));
        materialButton.check(matches(isDisplayed()));
        materialButton.perform(click());

        ViewInteraction textView = onView(withId(R.id.container_list_news_include_on_fragment_main));
        textView.check(matches(isDisplayed()));
        textView.check(matches(withText("News")));
    }
}
