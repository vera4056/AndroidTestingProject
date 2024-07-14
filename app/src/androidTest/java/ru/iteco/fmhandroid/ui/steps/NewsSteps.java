package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.isRoot;
import static ru.iteco.fmhandroid.ui.latency.ViewMatcherLatency.waitDisplayed;

import io.qameta.allure.kotlin.Allure;
import ru.iteco.fmhandroid.ui.pageobjects.MainMenu;
import ru.iteco.fmhandroid.ui.pageobjects.News;

public class NewsSteps {

    MainMenu mainMenu = new MainMenu();
    News news = new News();

    public void newsListLoad() {
        Allure.step("Загрузка списка новостей");
        onView(isRoot()).perform(waitDisplayed(news.allNewsLayout, 7000));
    }

    public void checkTextInNews() {
        Allure.step("Проверка на наличие текста в блоке News");
        mainMenu.mainMenuButton();
        news.checkTextInsideNews();

    }

    public void checkCreateNewsForm() {
        Allure.step("Открытие формы для создания новости в News");
        mainMenu.mainMenuButton();
        news.checkNewsForm();

    }

    public void creatingNews() {
        Allure.step("Создание новости ");
        news.creatingNews();

    }

    public void deletingNews() {
        Allure.step("Удаление новости  в News");
        news.deletingNews();
    }
    public void newsCategory() {
        Allure.step("Заполнение поля Category");
        news.fillCategoryText();
    }
    public void newsTitle() {
        Allure.step("Заполнение поля Title");
        news.fillTitleText();
    }

    public void newsDate(){
        Allure.step("Выбор текущей даты для новости");
        news.addNewsPublicationDate();
    }
    public void newsTime() {
        Allure.step("Выбор текущего времени для новости");
        news.addNewsTime();

    }
    public void newsDescription(){
        Allure.step("Заполнение поля Description");
        news.addNewsDescription();

    }
}


