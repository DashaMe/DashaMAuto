package TopPackage.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DashboardPage extends BasePage {
    @FindBy(xpath = "//span[@class='sn_menu_title']")
    private WebElement userEmail;

    @FindBy(xpath = "//p[@class='make_message']/a[contains(@href, 'compose')]")
    private WebElement createEmailButton;

    @FindBy(xpath = "//span[@class='frm']")
    private List<WebElement> recievedEmailsFrom;

    public void openLastEmailFromSender(String sender){
       for (WebElement i : recievedEmailsFrom)
       {
        if (i.getText().equals(sender))
        {
            i.click();
            break;
        }
       }
    }

    public String getUserEmail() {
        return userEmail.getText();
    }

    public void startCreateEmail() {
        createEmailButton.click();
    }
}
