package TopPackage.Pages;

import TopPackage.Utils.Email.Email;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReceivedEmailPage extends BasePage {

    @FindBy(xpath = "//*[@class='black']")
    private WebElement emailFrom;

    @FindBy(xpath = "//*[@class = 'to']/*[@class = 'field_value']")
    private WebElement emailTo;

    @FindBy(xpath = "//*[@class = 'message_header clear']/h3")
    private WebElement emailSubject;

    @FindBy(xpath = "//*[@class = 'message_body']")
    private WebElement emailBody;

    public Email receivedEmail(){
        return new Email(emailFrom.getText(), emailTo.getText(), emailSubject.getText(), emailBody.getText());
    }

}
