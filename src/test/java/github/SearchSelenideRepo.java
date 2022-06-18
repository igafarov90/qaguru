package github;

import org.junit.jupiter.api.Test;

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


    }

}
