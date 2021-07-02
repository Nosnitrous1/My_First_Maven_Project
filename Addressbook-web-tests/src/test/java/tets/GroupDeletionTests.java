package tets;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testUntitledTestCase() throws Exception {
    app.gotoGroupPage("groups");
    app.selectGroup();
    app.deleteSelectedGroups();
    app.returnToGroupPage();
    app.logout();
  }

}
