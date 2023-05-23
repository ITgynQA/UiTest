import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {

    private WebDriver driver;

    @BeforeAll
    static void setUpAll() {
        System.setProperty("web-driver.chrome.driver", "./driver/chromedriver/chromedriver.exe");
    }

    @BeforeEach
    void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
    }

    @AfterEach
    void tearDown() {
        driver.quit();
        driver = null;
    }

    @Test
    void happyPathTest1() {
        driver.get("http://localhost:9999");

        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Иванов Иван");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79998887766");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        String expected = "Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        String actual = driver.findElement(By.cssSelector("[data-test-id=order-success]")).getText().trim();

        assertEquals(expected, actual);
    }

    @Test
    void happyPathTest2() {
        driver.get("http://localhost:9999");

        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Петров-Водкин Кузьма");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79998887766");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        String expected = "Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        String actual = driver.findElement(By.cssSelector("[data-test-id=order-success]")).getText().trim();

        assertEquals(expected, actual);
    }

    @Test
    void happyPathTest3() {
        driver.get("http://localhost:9999");

        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Петрова Анна-Мария");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79998887766");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        String expected = "Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        String actual = driver.findElement(By.cssSelector("[data-test-id=order-success]")).getText().trim();

        assertEquals(expected, actual);
    }

    @Test
    void happyPathTest4() {
        driver.get("http://localhost:9999");

        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Иванова-Петрова Анна-Мария");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79998887766");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        String expected = "Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        String actual = driver.findElement(By.cssSelector("[data-test-id=order-success]")).getText().trim();

        assertEquals(expected, actual);
    }

    @Test
    void happyPathTest5() {
        driver.get("http://localhost:9999");

        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Иванова Петрова Анна-Мария");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79998887766");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        String expected = "Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        String actual = driver.findElement(By.cssSelector("[data-test-id=order-success]")).getText().trim();

        assertEquals(expected, actual);
    }

    @Test
    void happyPathTest6() {
        driver.get("http://localhost:9999");

        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Семёнов Семён");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79998887766");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        String expected = "Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        String actual = driver.findElement(By.cssSelector("[data-test-id=order-success]")).getText().trim();

        assertEquals(expected, actual);
    }

    @Test
    void happyPathTest7() {
        driver.get("http://localhost:9999");

        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Алексеев Алексей");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79998887766");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        String expected = "Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        String actual = driver.findElement(By.cssSelector("[data-test-id=order-success]")).getText().trim();

        assertEquals(expected, actual);
    }

    @Test
    void happyPathTest8() {
        driver.get("http://localhost:9999");

        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Подъемов Иван");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79998887766");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        String expected = "Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        String actual = driver.findElement(By.cssSelector("[data-test-id=order-success]")).getText().trim();

        assertEquals(expected, actual);
    }

    @Test
    void happyPathTest9() {
        driver.get("http://localhost:9999");

        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Аниськин Иван");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79998887766");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        String expected = "Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        String actual = driver.findElement(By.cssSelector("[data-test-id=order-success]")).getText().trim();

        assertEquals(expected, actual);
    }

    @Test
    void happyPathTest10() {
        driver.get("http://localhost:9999");

        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Иванова Ия");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79998887766");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        String expected = "Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        String actual = driver.findElement(By.cssSelector("[data-test-id=order-success]")).getText().trim();

        assertEquals(expected, actual);
    }

    @Test
    void happyPathTest11() {
        driver.get("http://localhost:9999");

        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("ИвАнОв ИвАн");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79998887766");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        String expected = "Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        String actual = driver.findElement(By.cssSelector("[data-test-id=order-success]")).getText().trim();

        assertEquals(expected, actual);
    }

    @Test
    void happyPathTest12() {
        driver.get("http://localhost:9999");

        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Розалинд Флоренс");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79998887766");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        String expected = "Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        String actual = driver.findElement(By.cssSelector("[data-test-id=order-success]")).getText().trim();

        assertEquals(expected, actual);
    }

    @Test
    void happyPathTest13() {
        driver.get("http://localhost:9999");

        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("-Иванов Иван");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79998887766");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        String expected = "Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        String actual = driver.findElement(By.cssSelector("[data-test-id=order-success]")).getText().trim();

        assertEquals(expected, actual);
    }

    @Test
    void happyPathTest14() {
        driver.get("http://localhost:9999");

        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("   Иванов Иван");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79998887766");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        String expected = "Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        String actual = driver.findElement(By.cssSelector("[data-test-id=order-success]")).getText().trim();

        assertEquals(expected, actual);
    }

    @Test
    void englishLettersInFieldName() {
        driver.get("http://localhost:9999");

        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Ivanov Ivan");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79998887766");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        String expected = "Имя и Фамилия указаные неверно. Допустимы только русские буквы, пробелы и дефисы.";
        String actual = driver.findElement(By.className("input__sub")).getText().trim();

        assertEquals(expected, actual);
    }
    @Test
    void numbersInFieldName() {
        driver.get("http://localhost:9999");

        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("123 456");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79998887766");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        String expected = "Имя и Фамилия указаные неверно. Допустимы только русские буквы, пробелы и дефисы.";
        String actual = driver.findElement(By.className("input__sub")).getText().trim();

        assertEquals(expected, actual);
    }
    @Test
    void oneLetterInFieldName() {
        driver.get("http://localhost:9999");

        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("А");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79998887766");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        String expected = "Ошибка. Поле не может содержать меньше 3 символов.";
        String actual = driver.findElement(By.className("input__sub")).getText().trim();

        assertEquals(expected, actual);
    }
    @Test
    void tooManyLettersInFieldName() {
        driver.get("http://localhost:9999");

        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Аааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааа Бббббббббббббббббббббббббббббббббббббббббббббббббббббббббббббббб");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79998887766");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        String expected = "Ошибка. Поле не может содержать больше 129 символов.";
        String actual = driver.findElement(By.className("input__sub")).getText().trim();

        assertEquals(expected, actual);
    }
    @Test
    void specialSymbolsInFieldName() {
        driver.get("http://localhost:9999");

        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("@$& #*!");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79998887766");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        String expected = "Имя и Фамилия указаные неверно. Допустимы только русские буквы, пробелы и дефисы.";
        String actual = driver.findElement(By.className("input__sub")).getText().trim();

        assertEquals(expected, actual);
    }
    @Test
    void emojiInFieldName() {
        driver.get("http://localhost:9999");

        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("☺☺☺ ☺☺☺");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79998887766");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        String expected = "Имя и Фамилия указаные неверно. Допустимы только русские буквы, пробелы и дефисы.";
        String actual = driver.findElement(By.className("input__sub")).getText().trim();

        assertEquals(expected, actual);
    }
    @Test
    void hyphensInFieldName() {
        driver.get("http://localhost:9999");

        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("-------");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79998887766");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        String expected = "Имя и Фамилия указаные неверно. Допустимы только русские буквы, пробелы и дефисы.";
        String actual = driver.findElement(By.className("input__sub")).getText().trim();

        assertEquals(expected, actual);
    }
    @Test
    void wrongInformationInFieldName() {
        driver.get("http://localhost:9999");

        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Ааааааа Аааааааа");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79998887766");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        String expected = "Фамилия и имя указаны неверно.о";
        String actual = driver.findElement(By.className("input__sub")).getText().trim();

        assertEquals(expected, actual);
    }
    @Test
    void anEmptyFieldName() {
        driver.get("http://localhost:9999");

        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79998887766");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        String expected = "Поле обязательно для заполнения";
        String actual = driver.findElement(By.className("input__sub")).getText().trim();

        assertEquals(expected, actual);
    }
    @Test
    void anEmptyFieldPhone() {
        driver.get("http://localhost:9999");

        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Иванов Иван");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        String expected = "Поле обязательно для заполнения";
        String actual = driver.findElements(By.className("input__sub")).get(1).getText().trim();

        assertEquals(expected, actual);
    }
    @Test
    void wrongInformationInFieldPhone() {
        driver.get("http://localhost:9999");

        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Иванов Иван");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+00000000000");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        String expected = "Телефон указан неверно.";
        String actual = driver.findElements(By.className("input__sub")).get(1).getText().trim();

        assertEquals(expected, actual);
    }
    @Test
    void tenNumbersInFieldPhone() {
        driver.get("http://localhost:9999");

        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Иванов Иван");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+7999888776");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        String expected = "Телефон указан неверно. Должно быть 11 цифр, например, +79012345678.";
        String actual = driver.findElements(By.className("input__sub")).get(1).getText().trim();

        assertEquals(expected, actual);
    }
    @Test
    void twelveNumbersInFieldPhone() {
        driver.get("http://localhost:9999");

        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Иванов Иван");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+799988877665");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        String expected = "Телефон указан неверно. Должно быть 11 цифр, например, +79012345678.";
        String actual = driver.findElements(By.className("input__sub")).get(1).getText().trim();

        assertEquals(expected, actual);
    }
    @Test
    void lettersInFieldPhone() {
        driver.get("http://localhost:9999");

        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Иванов Иван");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+7апролорпар");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        String expected = "Телефон указан неверно. Должно быть 11 цифр, например, +79012345678.";
        String actual = driver.findElements(By.className("input__sub")).get(1).getText().trim();

        assertEquals(expected, actual);
    }
    @Test
    void specialSymbolsInFieldPhone() {
        driver.get("http://localhost:9999");

        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Иванов Иван");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+7апролорпар");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        String expected = "Телефон указан неверно. Должно быть 11 цифр, например, +79012345678.";
        String actual = driver.findElements(By.className("input__sub")).get(1).getText().trim();

        assertEquals(expected, actual);
    }

    @Test
    void anEmptyFieldCheckbox() {
        driver.get("http://localhost:9999");

        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Иванов Иван");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("");
        //driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        String expected = "Поле обязательно для заполнения";
        String actual = driver.findElement(By.className("checkbox__text")).getText().trim();

        assertEquals(expected, actual);
    }

}
