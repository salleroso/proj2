package ru.rt.client;

import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {


    @Test
    public void testGroupCreation() throws Exception {
        navToGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupDate("group1", "header test", "group footer"));
        submitGroupCreation();
    }

}
