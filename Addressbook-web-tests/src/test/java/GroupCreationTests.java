import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class GroupCreationTests {

  private WebDriver wd;

  @BeforeMethod(alwaysRun = true)
  public void setUp() throws Exception {
    wd = new FirefoxDriver();
    wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook/");
    login("admin", "secret");
  }

  private void login(String userName, String password) {
      initGroipCreation("user");
      wd.findElement(By.name("user")).clear();
    wd.findElement(By.name("user")).sendKeys(userName);
    wd.findElement(By.name("pass")).click();
    wd.findElement(By.name("pass")).clear();
    wd.findElement(By.name("pass")).sendKeys(password);
    wd.findElement(By.xpath("//input[@value='Login']")).click();
  }

  @Test
  public void testGroupCreation() throws Exception {
      gotoGroupPage("groups");
      initGroipCreation("new");
      wd.findElement(By.name("group_name")).click();
      fillGroupForm("My new group", "Any new header", "Any new footer");
      submitGroupCreation();
      logout();
  }

    private void logout() {
        wd.findElement(By.linkText("Logout")).click();
    }

    private void submitGroupCreation() {
        wd.findElement(By.name("submit")).click();
    }

    private void fillGroupForm(String groupName, String groupHeader, String groupFooter) {
        wd.findElement(By.name("group_name")).clear();
        wd.findElement(By.name("group_name")).sendKeys(groupName);
        wd.findElement(By.name("group_header")).click();
        wd.findElement(By.name("group_header")).clear();
        wd.findElement(By.name("group_header")).sendKeys(groupHeader);
        wd.findElement(By.name("group_footer")).clear();
        wd.findElement(By.name("group_footer")).sendKeys(groupFooter);
    }

    private void initGroipCreation(String s) {
        wd.findElement(By.name(s)).click();
    }

    private void gotoGroupPage(String groups) {
        wd.findElement(By.linkText(groups)).click();
    }

    @AfterMethod(alwaysRun = true)
  public void tearDown() throws Exception {
    wd.quit();
  }

  private boolean isElementPresent(By by) {
    try {
      wd.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }
}
