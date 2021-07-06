package tests;

import org.testng.annotations.Test;

import static tests.TestBase.app;

public class RegistrationTests extends TestBase {

  @Test
  public void testRegistration() {
    app.registration().start("user1", "user1@localhost.localdomain");
  }

}
