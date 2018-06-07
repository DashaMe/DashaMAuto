package TopPackage.Helpers;

import TopPackage.Pages.LoginPage;
import TopPackage.Utils.Users.User;

public class LoginHelper extends LoginPage {
    public void login(User user) {
        login(user.getLogin(), user.getPassword());
    }
}