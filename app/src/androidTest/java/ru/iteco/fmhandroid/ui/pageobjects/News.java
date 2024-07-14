package ru.iteco.fmhandroid.ui.pageobjects;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.action.ViewActions.scrollTo;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import ru.iteco.fmhandroid.R;

public class News {
    public final String newsOnMain = "News";
    public final int allNewsLayout = R.id.all_news_cards_block_constraint_layout;
    public final int newsCardButton = R.id.news_item_material_card_view;

    public final int newsDescription = R.id.news_item_description_text_view;
    public final int allNewsCardsBlock = R.id.all_news_cards_block_constraint_layout;
    public final int editNewsButton = R.id.edit_news_material_button;
    public final String addNewsButton = "Add news button";
    public final String categoryButton = "Show dropdown menu";
    public final int categoryText = R.id.news_item_category_text_auto_complete_text_view;
    public final int newsTitle = R.id.news_item_title_text_input_edit_text;
    public final int newsDate = R.id.news_item_publish_date_text_input_edit_text;
    public final int newsTime = R.id.news_item_publish_time_text_input_edit_text;
    public final int newsFillDescription = R.id.news_item_description_text_input_edit_text;
    public final int saveButton = R.id.save_button;
    public final int createdNewsDateView = R.id.news_item_publication_date_text_view;
    public final int newsDeleteButton = R.id.delete_news_item_image_view;
    public final int confirmationButton = android.R.id.button1;
    public final String doesNotExist = "На удаление";
    public final String changeTitle = "Тест";
    public final String addDescription = "Новая новость";


    public void newsTitleDisplayed() {
        onView(withText(newsOnMain))
                .check(matches(isDisplayed()));
    }

    public void allNewsDisplayed() {
        onView(withId(allNewsLayout))
                .check(matches(isDisplayed()));

    }

    public void checkTextInsideNews() {
        onView(withText(newsOnMain))
                .perform(click());
        onView(withId(newsCardButton))
                .perform(click());
        onView(withId(newsDescription))
                .perform(click());
        onView(withId(newsDescription))
                .check(matches(isDisplayed()));
        onView(withId(newsCardButton))
                .perform(click());
        onView(withId(allNewsCardsBlock))
                .check(matches(isDisplayed()));


    }

    public void checkNewsForm() {
        onView(withText(newsOnMain))
                .perform(click());
        onView(withText(editNewsButton))
                .check(matches(isDisplayed()));
        onView(withText(editNewsButton))
                .perform(click());
        onView(withText(addNewsButton))
                .check(matches(isDisplayed()));
        onView(withText(addNewsButton))
                .perform(click());

    }

    public void creatingNews() {

        onView(withText(categoryButton))
                .perform(click());
        onView(withId(categoryText))
                .perform(click());
        onView(withId(newsTitle))
                .check(matches(isDisplayed()));
        onView(withId(newsDate))
                .perform(click());
        onView(withId(newsTime))
                .perform(click());
        onView(withId(newsFillDescription))
                .perform(replaceText("celebrating bd"));
        onView(withId(saveButton))
                .perform(click());
        onView(withId(createdNewsDateView))
                .check(matches(isDisplayed()));
    }
    public  void deletingNews() {
        onView(withText(newsOnMain))
                .perform(click());
        onView(withText(newsOnMain))
                .perform(click());
        onView(withText(editNewsButton))
                .perform(click());
        onView(withId(newsDeleteButton))
                .check(matches(isDisplayed()));
        onView(withId(newsDeleteButton))
                .perform(click());
        onView(withId(confirmationButton))
                .perform(click());
        onView(withText(doesNotExist))
                .check(matches(isDisplayed()));

    }
    public void fillCategoryText() {
        onView(withId(categoryText))
                .perform(scrollTo(), click());
    }
    public void fillTitleText() {
            onView(withId(newsTitle))
                    .perform((replaceText(changeTitle))); // проверить возможность изменить заголовок

    }
    public void addNewsPublicationDate() {
        onView(withId(newsDate))
                .perform(click());
        onView(withId(confirmationButton)).perform(click());
    }

    public void addNewsTime() {
        onView(withId(newsTime))
                .perform(scrollTo(), click());
        onView(withId(confirmationButton))
                .perform(scrollTo(), click());

    }
    public void addNewsDescription(){
        onView(withId(newsFillDescription))
                .perform((replaceText(addDescription)));
        onView(withId(saveButton))
                .perform(click());

    }

}

