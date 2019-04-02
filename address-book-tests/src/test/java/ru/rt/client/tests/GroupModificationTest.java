package ru.rt.client.tests;

import org.testng.annotations.Test;
import ru.rt.client.model.GroupDate;

public class GroupModificationTest extends TestBase {
    @Test
    public void groupModification() {


        app.getNavigationHelper().navToGroupPage();
        app.getGroupHelper().SelectGroup();
        app.getGroupHelper().clickModificationGroup();
        app.getGroupHelper().fillGroupForm(new GroupDate("group3", "header test", "group footer"));
        app.getGroupHelper().clickBuUpdate();
    }
}
1