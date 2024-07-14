package ru.iteco.fmhandroid.ui.pageobjects;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import ru.iteco.fmhandroid.R;

public class About {
    public final String aboutTextButton = "About";
    public final String privacyPolicyLink = "https://vhospice.org/#/privacy-policy/";
    public final String termsOfUseLink = "https://vhospice.org/#/terms-of-use";
    public final String aboutCompany = "© I-Teco, 2022";
    public final String versionInfo = "1.0.0";
    public final int aboutBackButton = R.id.about_back_image_button;
    public final int  aboutUs = R.id.about_company_info_label_text_view;


    public void openAboutPage() {
        onView(withText(aboutTextButton))
                .perform(click());
        onView(withText(versionInfo))
                .check(matches(isDisplayed()));
    }

    public void checkAboutSection(){
        onView(withText(aboutTextButton))
                .perform(click());
        onView(withText(privacyPolicyLink))
                .check(matches(isDisplayed()));
        onView(withText(termsOfUseLink))
                .check(matches(isDisplayed()));
        onView(withText(aboutCompany))
                .check(matches(isDisplayed()));

    }
    public void checkPrivacyPolicy(){
        onView(withText(aboutTextButton))
                .perform(click());
        onView(withText(privacyPolicyLink))
                .perform(click());
    }
    public void checkTermsOfUse(){
        onView(withText(aboutTextButton))
                .perform(click());
        onView(withText(termsOfUseLink))
                .perform(click());
    }

    public void aboutBackToNews(){
        onView(withText(aboutTextButton))
                .perform(click());
        onView(withId(aboutBackButton))
                .perform(click());
    }
    public void aboutTitleDisplayed(){
        onView(withText(aboutTextButton))
                .check(matches(isDisplayed()));
    }
}



