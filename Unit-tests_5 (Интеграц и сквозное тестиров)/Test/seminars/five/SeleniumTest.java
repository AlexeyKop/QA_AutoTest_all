package seminars.five;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class SeleniumTest {

    /**
     * Задание No4
     *  Напишите автоматизированный тест, который выполнит следующие шаги:
     *  1.Открывает главную страницу Google.
     *  2.Вводит "Selenium" в поисковую строку и нажимает кнопку "Поиск в Google".
     *  3.В результатах поиска ищет ссылку на официальный сайт Selenium (https://www.selenium.dev) и проверяет,
     *  что ссылка действительно присутствует среди результатов поиска.
     */

    @Test
    public void testGoogleSearch() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");
        searchBox.submit();

        Thread.sleep(300);

        List<WebElement> searchResults = driver.findElements(By.cssSelector("div"));

        boolean isFound = false;
        for (WebElement webElement : searchResults) {
            System.out.println(webElement.getText());
            if (webElement.getText().contains("https://www.selenium.dev")) {
                isFound = true;
                break;
            }
        }
        assertTrue(isFound);
        driver.quit();
    }

    /**
     * Задание No5
     *  Нужно написать сквозной тест с использованием Selenium, который авторизует пользователя
     *  на сайте https://www.saucedemo.com/.
     *  Данные для входа - логин: "standard_user", пароль: "secret_sauce".
     *  Проверить, что авторизация прошла успешно и отображаются товары.
     *  Вам необходимо использовать WebDriver для открытия страницы и методы sendKeys() для ввода данных
     *  в поля формы, и submit() для отправки формы. После этого, проверьте, что на странице отображаются
     *  продукты (productsLabel.getText() = "Products")
     */

    @Test
    public void testLogin() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        WebElement usernameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");

        Thread.sleep(300);

        loginButton.click();

        Thread.sleep(3000);

        WebElement productsLabel = driver.findElement(By.className("title"));
        assertEquals("Products", productsLabel.getText());

        driver.quit();
    }

}
