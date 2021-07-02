package tets;

import org.testng.annotations.*;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    app.gotoGroupPage("groups");
    app.initGroipCreation("new");
    app.initGroipCreation("group_name");
    app.fillGroupForm("My 1 group", "Any 1 header", "Any 1 footer");
    app.submitGroupCreation();
    app.logout();
  }

}
