package guru.qa;

import com.codeborne.selenide.SelenideElement;

import java.util.Locale;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class TestData {

    String url = "https://www.mann-ivanov-ferber.ru";
    SelenideElement searchInput = $(byName("query"));
    SelenideElement searchButton = $("button[type='submit']");
    SelenideElement searResult = $(byClassName("p-book-title-link"));
    SelenideElement fieldResult = $(byClassName("body"));
}
