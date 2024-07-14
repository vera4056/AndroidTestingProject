package ru.iteco.fmhandroid.ui.pageobjects;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.espresso.ViewAssertion;

import ru.iteco.fmhandroid.R;


public class LogIn {


    public final int loginFieldId = R.id.login_text_input_layout;
    public final int passwordFieldId = R.id.password_text_input_layout;
    public final int enterButton = R.id.enter_button;

    public final int mainFragment = R.id.container_list_news_include_on_fragment_main;


    public void fillValidLoginPassword(String LOGIN, String PASSWORD) {
        onView(withId(loginFieldId))
                .perform(replaceText(LOGIN));
        onView(withId(passwordFieldId))
                .perform(replaceText(PASSWORD));
        onView(withId(enterButton))
                .perform(click());

    }

    public void fillUnValidLoginPassword(String LOGIN2, String PASSWORD2) {
        onView(withId(loginFieldId))
                .perform(replaceText(LOGIN2));
        onView(withId(passwordFieldId))
                .perform(replaceText(PASSWORD2));
        onView(withId(enterButton))
                .perform(click());
        onView(withText(R.string.wrong_login_or_password))
                .check((ViewAssertion)withText("Wrong login or password"));


    }

    public void viewMainButton () {

        onView(withId(mainFragment))
                .check((ViewAssertion) withText("News"));

    }
    public void emptyLoginPassword() {
        onView(withId(loginFieldId))
                .perform(replaceText(""));
        onView(withId(passwordFieldId))
                .perform(replaceText(""));
        onView(withId(enterButton))
                .perform(click());
        onView(withText(R.string.empty_login_or_password))
                .check((ViewAssertion)withText("Login and password cannot be empty"));

    }
}
