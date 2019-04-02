package ru.rt.client.appManager;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.rt.client.model.GroupDate;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    public  WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    public  void init() {
        driver = new FirefoxDriver();
        baseUrl = "http://localhost/addressbook/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(baseUrl);
        login("admin", "secret");
    }

    private void login(String login, String password) {
        driver.findElement(By.name("user")).click();
        driver.findElement(By.name("user")).clear();
        driver.findElement(By.name("user")).sendKeys(login);
        driver.findElement(By.name("pass")).clear();
        driver.findElement(By.name("pass")).sendKeys(password);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password:'])[1]/following::input[2]")).click();
    }

    public void submitGroupCreation() {
        driver.findElement(By.name("submit")).click();
    }

    public  void fillGroupForm(GroupDate groupDate) {
        driver.findElement(By.name("group_name")).click();
        driver.findElement(By.name("group_name")).clear();
        driver.findElement(By.name("group_name")).sendKeys(groupDate.getName());
        driver.findElement(By.name("group_header")).click();
        driver.findElement(By.name("group_header")).clear();
        driver.findElement(By.name("group_header")).sendKeys(groupDate.getHeader());
        driver.findElement(By.name("group_footer")).click();
        driver.findElement(By.name("group_footer")).clear();
        driver.findElement(By.name("group_footer")).sendKeys(groupDate.getFooter());
        driver.findElement(By.id("content")).click();
    }

    public  void initGroupCreation() {
        driver.findElement(By.name("new")).click();
    }

    public  void navToGroupPage() {
        driver.findElement(By.xpath(".//a[@href='group.php']")).click();
    }

    public  void clickDeleteBtn() {
        driver.findElement(By.name("delete")).click();
    }

    public  void SelectGroup() {
        driver.findElement(By.name("selected[]")).click();
    }

    public  void stop() {
        driver.quit();
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
