package ru.iteco.fmhandroid.ui.pageobjects;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import ru.iteco.fmhandroid.R;

public class LoveIsAll {
    public final int ourMissionButton = R.id.our_mission_image_button;
    public final String missionTextButton = "Our Mission";
    public final String missionBackgroundImage = "app background image";
    public final String missionTitle = "Love is all";

    public final int openCloseCardButton = R.id.our_mission_item_material_card_view;
    public final int  missionTitleText = R.id.our_mission_item_title_text_view;

    public final int  missionDescriptionText = R.id.our_mission_item_description_text_view;

    public void checkOurMissionButton(){
        onView(withId(ourMissionButton))
                .perform(click());
        onView(withText(missionTextButton))
                .check(matches(isDisplayed()));
        onView(withText(missionBackgroundImage))
                .check(matches(isDisplayed()));
        onView(withText(missionTitle))
                .check(matches(isDisplayed()));
    }
    public void checkQuotesInside(){
        onView(withId(ourMissionButton))
                .perform(click());
        onView(withId(openCloseCardButton))
                .perform(click());
        onView(withId(missionTitleText))
                .check(matches(isDisplayed()));
        onView(withId(missionDescriptionText))
                .check(matches(isDisplayed()));
        onView(withId(openCloseCardButton))
                .perform(click());
    }
    public void clickOurMissionButton(){
        onView(withId(ourMissionButton))
                .perform(click());

    }
}
