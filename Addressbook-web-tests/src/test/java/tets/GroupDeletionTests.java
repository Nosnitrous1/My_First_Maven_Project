package tets;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testUntitledTestCase() throws Exception {
    app.getNavigationHelper().gotoGroupPage("groups");
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().returnToGroupPage();
    app.logout();
  }

}
