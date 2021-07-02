import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testUntitledTestCase() throws Exception {
    gotoGroupPage("groups");
    selectGroup();
    deleteSelectedGroups();
    returnToGroupPage();
    logout();
  }

}
