package TopPackage.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Header extends BasePage {
    @FindBy(xpath = "//*[@class='icon-ho ho_settings ho_i_settings']")
    private WebElement settingsIcon;

    @FindBy(xpath = "//*[@class='ho_popup_menu_item']/a[contains(@href,'logout')]")
    private WebElement logoutLink;

    public void logout() throws InterruptedException {
        settingsIcon.click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(logoutLink));
        logoutLink.click();
    }
}
