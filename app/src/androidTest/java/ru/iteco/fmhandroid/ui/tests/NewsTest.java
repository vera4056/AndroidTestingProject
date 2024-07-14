package ru.iteco.fmhandroid.ui.tests;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import ru.iteco.fmhandroid.ui.AppActivity;
import ru.iteco.fmhandroid.ui.steps.LoginSteps;
import ru.iteco.fmhandroid.ui.steps.NewsSteps;
@LargeTest
@RunWith(AndroidJUnit4.class)
public class NewsTest {
    LoginSteps loginSteps = new LoginSteps();
    NewsSteps newsSteps = new NewsSteps();
    @Rule
    public ActivityScenarioRule<AppActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(AppActivity.class);

    @Before
    public void newsScreenLoad()  {
        newsSteps.newsListLoad();
    }

    @Test
    public void newsTextIsVisibleTest() {
        newsSteps.checkTextInNews();

    }

    @Test
    public void openNewsCreateFormTest() {
        newsSteps.checkCreateNewsForm();

    }

    @Test
    public void createNewsTest() {
        newsSteps.creatingNews();

    }

    @Test
    public void deleteNewsTest() {
        newsSteps.deletingNews();

    }

    @Test
    public void fillCategoryInNewsTest() {
        newsSteps.newsCategory();

    }

    @Test
    public void fillNewsTitleTest() {
        newsSteps.newsTitle();
    }
    @Test
    public void fillNewsDateTest() {
        newsSteps.newsDate();
    }

    @Test
    public void fillNewsTimeTest() {
        newsSteps.newsTime();
    }
}
