package ru.rt.client.tests;

import ru.rt.client.model.GroupDate;

public class GroupModificationTest extends TestBase {
    
    public void groupModification() {


        app.getNavigationHelper().navToGroupPage();
        app.getGroupHelper().SelectGroup();
        app.getGroupHelper().clickModificationGroup();
        app.getGroupHelper().fillGroupForm(new GroupDate("group3", "header test", "group footer"));
        app.getGroupHelper().clickBuUpdate();
    }
}
