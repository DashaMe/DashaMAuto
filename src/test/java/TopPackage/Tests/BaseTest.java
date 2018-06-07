package TopPackage.Tests;

import TopPackage.App;
import TopPackage.Utils.Email.Email;
import TopPackage.Utils.Factory;
import TopPackage.Utils.Users.User;
import org.testng.annotations.AfterSuite;

public class BaseTest {
    static App app = new App();
    static User sender = Factory.Users.getValidSender();
    static User recipient = Factory.Users.getValidRecipient();
    static User randomUser = Factory.Users.getRandomUser();
    static Email testEmail = Factory.Emails.getEmail();

    @AfterSuite
    public void tearDown() {
        app.common.closeApp();
    }
}
