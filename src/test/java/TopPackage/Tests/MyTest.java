package TopPackage.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest extends BaseTest {
    @Test
    public void testWeb() throws InterruptedException {
        app.login.login(sender);
        Assert.assertEquals(app.dashboard.getUserEmail(), sender.getEmail());
        app.dashboard.startCreateEmail();
        app.createEmail.composeEmail(testEmail);
        app.createEmail.sendEmail();
        app.header.logout();
        app.login.login(recipient);
    }

}
