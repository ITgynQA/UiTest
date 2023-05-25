
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {

    private WebDriver driver;

    @BeforeEach
    void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.get("http://localhost:9999");
    }

    @AfterEach
    void tearDown() {
        driver.quit();
        driver = null;
    }

    @Test
    void happyPathTest1() {
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
        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Иванова-Петрова Анна-Мария");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79998887766");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        String expected = "Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        String actual = driver.findElement(By.cssSelector("[data-test-id=order-success]")).getText().trim();

        assertEquals(expected, actual);
    }

    @Test
    void happyPathTest4() {
        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Иванова-Петрова Анна Мария");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79998887766");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        String expected = "Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        String actual = driver.findElement(By.cssSelector("[data-test-id=order-success]")).getText().trim();

        assertEquals(expected, actual);
    }

    @Test
    void happyPathTest5() {
        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Семёнов Семён");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79998887766");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        String expected = "Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        String actual = driver.findElement(By.cssSelector("[data-test-id=order-success]")).getText().trim();

        assertEquals(expected, actual);
    }

    @Test
    void happyPathTest6() {
        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("ИвАнОв ИвАн");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79998887766");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        String expected = "Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        String actual = driver.findElement(By.cssSelector("[data-test-id=order-success]")).getText().trim();

        assertEquals(expected, actual);
    }


    @Test
    void englishLettersInFieldName() {
        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Ivanov Ivan");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79998887766");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        assertEquals(true, driver.findElement(By.cssSelector("[data-test-id=name].input_invalid")).isDisplayed());
    }

    @Test
    void numbersInFieldName() {
        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("123 456");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79998887766");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        assertEquals(true, driver.findElement(By.cssSelector("[data-test-id=name].input_invalid")).isDisplayed());
    }

    @Test
    void oneLetterInFieldName() {
        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("А");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79998887766");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        assertEquals(true, driver.findElement(By.cssSelector("[data-test-id=name].input_invalid")).isDisplayed());
    }

    @Test
    void tooManyLettersInFieldName() {
        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Аааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааа Бббббббббббббббббббббббббббббббббббббббббббббббббббббббббббббббб");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79998887766");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        assertEquals(true, driver.findElement(By.cssSelector("[data-test-id=name].input_invalid")).isDisplayed());
    }

    @Test
    void oneWordInFieldName() {
        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Иван");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79998887766");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        assertEquals(true, driver.findElement(By.cssSelector("[data-test-id=name].input_invalid")).isDisplayed());
    }

    @Test
    void hyphensBeforeNameInFieldName() {
        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("--Иванов Иван");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79998887766");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        assertEquals(true, driver.findElement(By.cssSelector("[data-test-id=name].input_invalid")).isDisplayed());
    }

    @Test
    void onlyHyphensInFieldName() {
        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("-------");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79998887766");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        assertEquals(true, driver.findElement(By.cssSelector("[data-test-id=name].input_invalid")).isDisplayed());
    }

    @Test
    void specialSymbolsInFieldName() {
        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("@$& #*!");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79998887766");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        assertEquals(true, driver.findElement(By.cssSelector("[data-test-id=name].input_invalid")).isDisplayed());
    }

    @Test
    void emojiInFieldName() {
        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("☺☺☺ ☺☺☺");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79998887766");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        assertEquals(true, driver.findElement(By.cssSelector("[data-test-id=name].input_invalid")).isDisplayed());
    }

    @Test
    void anEmptyFieldName() {
        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79998887766");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        assertEquals(true, driver.findElement(By.cssSelector("[data-test-id=name].input_invalid")).isDisplayed());

    }

    @Test
    void anEmptyFieldPhone() {
        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Иванов Иван");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        assertEquals(true, driver.findElement(By.cssSelector("[data-test-id=phone].input_invalid")).isDisplayed());
    }

    @Test
    void wrongInformationInFieldPhone() {
        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Иванов Иван");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+00000000000");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        assertEquals(true, driver.findElement(By.cssSelector("[data-test-id=phone].input_invalid")).isDisplayed());
    }

    @Test
    void plusNotInFirstPlaceInFieldPhone() {
        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Иванов Иван");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("7+9998887766");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        assertEquals(true, driver.findElement(By.cssSelector("[data-test-id=phone].input_invalid")).isDisplayed());
    }

    @Test
    void tenNumbersInFieldPhone() {
        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Иванов Иван");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+7999888776");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        assertEquals(true, driver.findElement(By.cssSelector("[data-test-id=phone].input_invalid")).isDisplayed());
    }

    @Test
    void twelveNumbersInFieldPhone() {
        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Иванов Иван");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+799988877665");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        assertEquals(true, driver.findElement(By.cssSelector("[data-test-id=phone].input_invalid")).isDisplayed());
    }

    @Test
    void lettersInFieldPhone() {
        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Иванов Иван");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+7апролорпар");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        assertEquals(true, driver.findElement(By.cssSelector("[data-test-id=phone].input_invalid")).isDisplayed());
    }

    @Test
    void specialSymbolsInFieldPhone() {
        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Иванов Иван");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+7@$& #*!");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button__text")).click();

        assertEquals(true, driver.findElement(By.cssSelector("[data-test-id=phone].input_invalid")).isDisplayed());
    }

    @Test
    void anEmptyFieldCheckbox() {
        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Иванов Иван");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79998887766");
        driver.findElement(By.className("button__text")).click();

        assertEquals(true, driver.findElement(By.cssSelector("[data-test-id=agreement].input_invalid")).isDisplayed());
    }

}
