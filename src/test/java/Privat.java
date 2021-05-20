import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Privat {

    @Test
    public void privat() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/Артем/IdeaProjects/My pro/src/main/resources/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Переход на сайт

        driver.get("https://next.privat24.ua/mobile");

        // Проверка Title

        String title = driver.getTitle();
        Assert.assertEquals("Поповнення рахунку мобільного телефону банківською карткою онлайн — Приват24", title);

        // Ввод номера телефона

        By tel = By.xpath("//input[@data-qa-node='phone-number']");
        driver.findElement(tel).sendKeys("509125159");

        // Ввод суммы пополнения

        By click = By.xpath("//input[@inputmode='decimal']");
        driver.findElement(click).sendKeys("200");

        //Ввод номера карты

        By CardNomber1 = By.xpath("//input[@data-qa-node='numberdebitSource']");
        driver.findElement(CardNomber1).sendKeys("4732757473574275");

        //Ввод срока действия

        By Validity = By.xpath("//input[@data-qa-node='expiredebitSource']");
        driver.findElement(Validity).sendKeys("2034");

        //Ввод CVV

        By CVV = By.xpath("//input[@data-qa-node='cvvdebitSource']");
        driver.findElement(CVV).sendKeys("092");

        //"В кошик"

        By Click3 = By.xpath("//button[@class='sc-VigVT eUaGVG']");
        driver.findElement(Click3).click();

        Thread.sleep(3000);

        driver.quit();

    }

}
