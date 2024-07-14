package ru.iteco.fmhandroid.ui.pageobjects;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.espresso.ViewAssertion;

import ru.iteco.fmhandroid.R;

public class LogOut {

    public final int authImage = R.id.authorization_image_button;
    public final String logOutButton = "Log out";
    public final int checkLogOut = R.id.nav_host_fragment;


    public void authButton() {
        onView(withId(authImage))
                .perform(click());
    }

    public void logOutImage() {

        onView(withText(logOutButton))
                .perform(click());
    }

    public void afterLogOutFrag() {
        onView(withId(checkLogOut)).
                check((ViewAssertion) withText("Authorization"));

    }
}


