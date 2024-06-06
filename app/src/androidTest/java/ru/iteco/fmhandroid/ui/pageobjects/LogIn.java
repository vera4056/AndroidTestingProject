package ru.iteco.fmhandroid.ui.pageobjects;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.espresso.ViewAssertion;
import androidx.test.espresso.ViewInteraction;

import ru.iteco.fmhandroid.R;

public class LogIn {


        public static ViewInteraction loginText =
                onView(withId(R.id.login_text_input_layout)).perform(replaceText("LOGIN"));
        public static ViewInteraction passwordText =
                onView(withId(R.id.password_text_input_layout)).perform(replaceText("PASSWORD"));
        public static ViewInteraction signButton = onView(withId(R.id.enter_button)).perform(click());
        public static ViewInteraction textView = onView(withId(R.id.container_list_news_include_on_fragment_main)).check((ViewAssertion) withText("News"));
    }
