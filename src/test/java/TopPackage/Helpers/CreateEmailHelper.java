package TopPackage.Helpers;

import TopPackage.Pages.CreateEmailPage;
import TopPackage.Utils.Email.Email;

public class CreateEmailHelper extends CreateEmailPage {
    public void composeEmail(Email email){
        composeEmail(email.getEmailTo(), email.getEmailSubject(), email.getEmailBody());
    }
}
