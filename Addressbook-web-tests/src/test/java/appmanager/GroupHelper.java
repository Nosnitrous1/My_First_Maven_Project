package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GroupHelper {
  private WebDriver wd;

  public GroupHelper(WebDriver wd) {
    this.wd = wd;
  }

  public void submitGroupCreation() {
    wd.findElement(By.name("submit")).click();
  }

  public void fillGroupForm(String groupName, String groupHeader, String groupFooter) {
    text(groupName, By.name("group_name"));
    text(groupHeader, By.name("group_header"));
    text(groupFooter, By.name("group_footer"));
  }

  private void text(String groupName, By locator) {
    if (groupName != null) {
      wd.findElement(locator).click();
      wd.findElement(locator).clear();
      wd.findElement(locator).sendKeys(groupName);
    }
  }

  public void initGroupCreation(String s) {
    wd.findElement(By.name(s)).click();
  }

  public void returnToGroupPage() {
    wd.findElement(By.linkText("group page")).click();
  }

  public void deleteSelectedGroups() {
    wd.findElement(By.name("delete")).click();
  }

  public void selectGroup() {
    wd.findElement(By.name("selected[]")).click();
  }
}
