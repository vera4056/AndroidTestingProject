package ru.iteco.fmhandroid.ui.pageobjects;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.espresso.ViewAssertion;
import androidx.test.espresso.ViewInteraction;

import ru.iteco.fmhandroid.R;

public class LogOut {


    public static ViewInteraction AuthImage =
        onView(withId(R.id.authorization_image_button)).perform(click());
    public static ViewInteraction LogOutButton =
        onView(withText("Log out")).perform(click());
    public static ViewInteraction CheckLogOut =
        onView(withId(R.id.nav_host_fragment)).check((ViewAssertion)withText("Authorization"));

    }


