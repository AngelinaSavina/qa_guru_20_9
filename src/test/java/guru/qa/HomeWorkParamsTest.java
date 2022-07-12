package guru.qa;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.*;

@SuppressWarnings("ALL")
public class HomeWorkParamsTest extends TestData {

    SelenideElement searchInput = $("#link-search-input");
    SelenideElement searchButton = $("button[type='submit']");
    SelenideElement searResult = $(byClassName("p-book-title-link"));
    SelenideElement fieldResult = $(byClassName("body"));

    @CsvSource(value = {
            "Код, Код цвета, Небесный голубой",
            "Магия утра, Магия утра для всей семьи, Как выявить лучшее в себе и в своих детях"
    })
    @ParameterizedTest(name = "Проcмотр карточки товара {0}")
    void yaTestComplex(String searchData, String expectedResultFirst, String expectedResultSecond) {
        Selenide.open(url);
        searchInput.shouldBe(interactable).setValue(searchData);
        searchButton.shouldBe(interactable, Duration.ofMillis(8000)).click();
        searResult.shouldHave(text(expectedResultFirst), Duration.ofMillis(8000)).click();
        fieldResult.shouldHave(text(expectedResultSecond));
        Selenide.closeWindow();
    }
}

