package github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SearchSelenideRepo {

    @Test
    void shouldSelenideInGithub(){

        //Открыть стр гихаб
        open("https://github.com/");
        //ввести в поле поиска selenide и нажать Enter
        $("[data-test-selector=\"nav-search-input\"]").setValue("selenide").pressEnter();
        sleep (5000);
        //Нажимаем линк от первого результата
        $("href=\"/selenide/selenide\"").click();
        // сheck: в заголовке есть selenide/selenide
        SelenideElement $ = $(("[class=\" d-flex flex-wrap flex-items-center wb-break-word f3 text-normal\"]")).shouldHave(text("selenide/selenide"));


    }



}




