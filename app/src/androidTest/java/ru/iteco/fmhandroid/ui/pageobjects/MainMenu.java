package ru.iteco.fmhandroid.ui.pageobjects;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import ru.iteco.fmhandroid.R;

public class MainMenu {


    public final int menuButton = R.id.main_menu_image_button;
    public final String textMenuButton = "Main menu";
    public final int missionButton = R.id.our_mission_image_button;
    public final String textMissionButton = "Our Mission";
    public final int authorizationButton = R.id.authorization_image_button;
    public final String textAuthorizationButton = "Authorization";
    public final int logoMark = R.id.trademark_image_view;

    public void mainMenuButton() {
        onView(withId(menuButton))
                .perform(click());

    }

    public void checkMenuButtons() {
        onView(withId(menuButton))
                .perform(click());
        onView(withText(textMenuButton))
                .check(matches(isDisplayed()));
        onView(withId(missionButton))
                .perform(click());
        onView(withText(textMissionButton))
                .check(matches(isDisplayed()));
        onView(withId(authorizationButton))
                .perform(click());
        onView(withText(textAuthorizationButton))
                .check(matches(isDisplayed()));
        onView(withId(logoMark))
                .check(matches(isDisplayed()));
    }
}