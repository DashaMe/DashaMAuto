package TopPackage.Tests;

import org.testng.annotations.Test;

import static TopPackage.Helpers.CombinedSteps.checkReceivedEmail;
import static TopPackage.Helpers.CombinedSteps.sendEmail;

public class MyTest extends BaseTest {
    @Test
    public void testWeb() throws InterruptedException {
        app.login.login(sender);
        sendEmail(testEmail);
        app.header.logout();
        app.login.login(recipient);
        app.dashboard.openLastEmailFromSender(sender.getLogin());
        checkReceivedEmail(testEmail);
    }
}
