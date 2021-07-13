package tests;

import org.testng.annotations.*;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    app.getNavigationHelper().gotoGroupPage("groups");
    app.getGroupHelper().initGroupCreation("new");
//    app.getGroupHelper().initGroupCreation("group_name");
    app.getGroupHelper().fillGroupForm("My 2 group", "Header 2 group","Footer 2 group");
    app.getGroupHelper().submitGroupCreation();
    app.logout();
  }

}
