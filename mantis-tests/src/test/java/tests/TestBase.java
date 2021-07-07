package tests;

import appmanager.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.File;

public class TestBase {

  protected static final ApplicationManager app
          = new ApplicationManager(System.getProperty("browser", BrowserType.FIREFOX));

  @BeforeSuite
  public void setUp() throws Exception {
    app.init();
    app.ftp().upload(new File("src/test/resources/config_default_inc.php"),
            "config_default_inc", "config_default_inc.bak");
  }

  @AfterSuite
public void tearDown() throws Exception {
    app.ftp().restore("config_default_inc.bak", "config_default_inc.php");
    app.stop();
  }

}
