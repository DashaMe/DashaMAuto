package TopPackage.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {
    @FindBy(xpath = "//span[@class='sn_menu_title']")
    private WebElement userEmail;

    @FindBy(xpath = "//p[@class='make_message']/a[contains(@href, 'compose')]")
    private WebElement createEmailButton;

    public String getUserEmail() {
        return userEmail.getText();
    }

    public void startCreateEmail() {
        createEmailButton.click();
    }
}
