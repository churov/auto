package Homework11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Main {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anduser\\IdeaProjects\\auto\\auto1\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://crm.geekbrains.space/user/login");
        //WebElement header =driver.findElement(By.id("header"));
        driver.findElement(By.id("prependedInput")).sendKeys("Applanatest1");
        driver.findElement(By.id("prependedInput2")).sendKeys("Student2020!");
        driver.findElement(By.id("_submit")).click();
        WebElement myElement= driver.findElement(By.xpath("//span[text()='Проекты']//parent::a"));
        WebElement myElement2= driver.findElement(By.xpath("//span[text()='Мои проекты']//parent::a"));
        Actions builder = new Actions(driver);
        Actions click = builder.moveToElement(myElement).click(myElement2);
        Action mouseoverAndClick = builder.build();
        mouseoverAndClick.perform();
        Thread.sleep(2500);
        driver.findElement(By.xpath("//a[text()='Создать проект']")).click();
        Thread.sleep(4000);
        driver.findElement(By.name("crm_project[name]")).sendKeys("It's my new project");
        driver.findElement(By.className("select2-chosen")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='select2-result-label' and text()='1234']")).click();

        Select select = new Select(driver.findElement(By.xpath("//select[@name='crm_project[businessUnit]']")));
        select.selectByValue("1");

        Select select1 = new Select(driver.findElement(By.xpath("//select[@name='crm_project[curator]']")));
        select1.selectByValue("5");

        Select select2 = new Select(driver.findElement(By.xpath("//select[@name='crm_project[rp]']")));
        select2.selectByValue("58");

        Select select3 = new Select(driver.findElement(By.xpath("//select[@name='crm_project[manager]']")));
        select3.selectByValue("8");
        Thread.sleep(2000);
        driver.findElement(By.className("btn btn-success action-button")).click();

    }
}
