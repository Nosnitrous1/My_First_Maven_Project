import org.testng.annotations.*;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    gotoGroupPage("groups");
    initGroipCreation("new");
    initGroipCreation("group_name");
    fillGroupForm("My 1 group", "Any 1 header", "Any 1 footer");
    submitGroupCreation();
    logout();
  }

}
