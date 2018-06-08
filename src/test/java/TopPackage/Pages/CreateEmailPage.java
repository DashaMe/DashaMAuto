package TopPackage.Pages;

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
    private WebElement sendEmailButton;

    protected void composeEmail(String emailTo, String emailSubject, String emailBody){
        emailToField.sendKeys(emailTo);
        emailSubjectField.sendKeys(emailSubject);
        emailBodyField.sendKeys(emailBody);
    }

    public void sendEmail(){
        sendEmailButton.click();
    }
}
