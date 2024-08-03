package ru.iteco.fmhandroid.ui.pageobjects;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.espresso.ViewInteraction;

import ru.iteco.fmhandroid.R;


public class LogIn {


    public static ViewInteraction loginFieldId = onView(withId(R.id.login_text_input_layout));
    public static ViewInteraction  passwordFieldId = onView(withId(R.id.password_text_input_layout));
    public static ViewInteraction  enterButton = onView(withId(R.id.enter_button));

    public static ViewInteraction  mainFragment = onView(withId(R.id.container_list_news_include_on_fragment_main));

    public static ViewInteraction wrongAuthorization = onView(withText("Wrong login or password"));

    public static ViewInteraction emptyAuthField = onView(withText("Login and password cannot be empty"));
    public static ViewInteraction authorization = onView(withText("Authorization"));


}
