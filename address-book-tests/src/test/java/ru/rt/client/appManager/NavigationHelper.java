package ru.rt.client.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {


    public NavigationHelper(WebDriver driver) {
       super(driver);
    }

    public  void navToGroupPage() {
        click(By.xpath(".//a[@href='group.php']"));
    }
}