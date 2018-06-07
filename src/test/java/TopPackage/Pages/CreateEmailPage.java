package TopPackage.Pages;

import TopPackage.Utils.Email.Email;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateEmailPage extends BasePage {

    @FindBy(id = "to")
    private WebElement emailToField;

    @FindBy(name = "subject")
    private WebElement emailSubjectField;

    @FindBy(id = "text")
    private WebElement emailBodyField;

    @FindBy(name = "send")
    protected WebElement sendEmailButton;

    public void composeEmail(Email email){
        emailToField.sendKeys(email.getEmailTo());
        emailSubjectField.sendKeys(email.getEmailSubject());
        emailBodyField.sendKeys(email.getEmailBody());
    }

    public void sendEmail(){
        sendEmailButton.click();
    }
}
