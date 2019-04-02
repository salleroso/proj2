package ru.rt.client.tests;

public class GroupModificationTest extends TestBase {
     public void groupModification(){


    app.getNavigationHelper().navToGroupPage();
    app.getGroupHelper().SelectGroup();
    app.getGroupHelper().clickModificationGroup();
     }
}
