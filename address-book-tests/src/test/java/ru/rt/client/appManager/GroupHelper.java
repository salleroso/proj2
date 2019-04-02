package ru.rt.client.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.rt.client.model.GroupDate;

public class GroupHelper extends HelperBase {

    public GroupHelper(WebDriver driver) {
        super(driver);
    }

    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    public  void fillGroupForm(GroupDate groupDate) {
        type (By.name("group_name"), groupDate.getName());
        type(By.name("group_header"), groupDate.getHeader());
        type(By.name("group_footer"), groupDate.getFooter());
        click(By.id("content"));
    }

    public  void initGroupCreation() {
        click(By.name("new"));
    }

    public  void clickDeleteBtn() {
        click(By.name("delete"));
    }

    public  void SelectGroup() {
        click(By.name("selected[]"));
    }

    public void clickModificationGroup() {
        click(By.name("edit"));
    }

    public void clickBuUpdate() {
        click(By.xpath(".//input[@name='update']"));
    }
}



