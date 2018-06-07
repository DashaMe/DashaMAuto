package TopPackage;

import TopPackage.Helpers.*;
import TopPackage.Pages.CreateEmailPage;

public class App {
    public LoginHelper login;
    public DashboardHelper dashboard;
    public CommonHelper common;
    public HeaderHelper header;
    public CreateEmailPage createEmail;

    public App() {
        this.login = new LoginHelper();
        this.dashboard = new DashboardHelper();
        this.common = new CommonHelper();
        this.header = new HeaderHelper();
        this.createEmail = new CreateEmailHelper();
    }
}
