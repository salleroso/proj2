package ru.rt.client.tests;

import org.testng.annotations.Test;
import ru.rt.client.model.GroupDate;

public class GroupCreationTest extends TestBase {


    @Test
    public void testGroupCreation() throws Exception {
        app.getNavigationHelper().navToGroupPage();
        app.getGroupHelper().initGroupCreation();
        final GroupDate groupDate = new GroupDate("group1", "header test", "group footer");app.getGroupHelper().fillGroupForm(groupDate,groupDate);
        app.getGroupHelper().submitGroupCreation();
    }
}
