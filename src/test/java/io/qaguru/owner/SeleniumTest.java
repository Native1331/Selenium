package io.qaguru.owner;


import io.qaguru.owner.config.WebDriverProvider;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeleniumTest {
    private WebDriver driver = new WebDriverProvider().get();
    @Test
    public void testGithubTitle() {
  /**      //Настройка Chrome Driver, если у Вас всё хороошо сконфигурировано, то она не нужна
        WebDriverManager.chromedriver().setup();
        //Конфигурация запуска: browser = chrome, base url = https://github.com
        WebDriver driver = new ChromeDriver();
        driver.get("https://github.com");**/
        //Код выполнения теста
        String title = driver.getTitle();
         assertEquals(title, "GitHub: Where the world builds software · GitHub");
    }
    @AfterEach
    public void stopDriver() {
        driver.quit();
    }

}
