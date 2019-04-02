package ru.rt.client.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.rt.client.model.GroupDate;

public class GroupHelper {
   private WebDriver driver;

    public GroupHelper(WebDriver driver) {
        this.driver=driver;

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

    public  void clickDeleteBtn() {
        driver.findElement(By.name("delete")).click();
    }

    public  void SelectGroup() {
        driver.findElement(By.name("selected[]")).click();
    }
}
