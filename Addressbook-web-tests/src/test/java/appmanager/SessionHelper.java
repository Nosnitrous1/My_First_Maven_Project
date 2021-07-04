package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SessionHelper {
  FirefoxDriver wd;

  public SessionHelper(FirefoxDriver wd) {
    this.wd = wd;
  }

  public void login(String userName, String password) {
    enterText(userName, By.name("user"));
    enterText(password, By.name("pass"));
    wd.findElement(By.xpath("//input[@value='Login']")).click();
  }

  private void enterText(String userName, By locator) {
    wd.findElement(locator).click();
    wd.findElement(locator).clear();
    wd.findElement(locator).sendKeys(userName);
  }

}
