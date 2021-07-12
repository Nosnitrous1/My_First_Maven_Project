package tets;

import org.testng.annotations.*;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    app.getNavigationHelper().gotoGroupPage("groups");
    app.getGroupHelper().initGroupCreation("new");
    app.getGroupHelper().initGroupCreation("group_name");
    app.getGroupHelper().fillGroupForm("My 1 group", "Header 1 group","Footer 1 group");
    app.getGroupHelper().submitGroupCreation();
    app.logout();
  }

}
