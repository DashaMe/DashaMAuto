package TopPackage.Helpers;

import TopPackage.App;
import TopPackage.Utils.Email.Email;
import org.testng.Assert;

public class CombinedSteps {
    public static void sendEmail(Email testEmail) {
        App app = new App();
        app.dashboard.startCreateEmail();
        app.createEmail.composeEmail(testEmail);
        app.createEmail.sendEmail();
    }

    public static void checkReceivedEmail(Email testEmail) {
        App app = new App();
        Email receivedEmail = app.receivedEmail.receivedEmail();
        Assert.assertEquals(receivedEmail.getEmailTo(), testEmail.getEmailTo());
        Assert.assertEquals(receivedEmail.getEmailFrom(), testEmail.getEmailFrom());
        Assert.assertEquals(receivedEmail.getEmailSubject(), testEmail.getEmailSubject());
        Assert.assertTrue(receivedEmail.getEmailBody().contains(testEmail.getEmailBody()));
    }
}
