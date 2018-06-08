package TopPackage;

import TopPackage.Helpers.*;

public class App {
    public LoginHelper login;
    public DashboardHelper dashboard;
    public CommonHelper common;
    public HeaderHelper header;
    public CreateEmailHelper createEmail;
    public ReceivedEmailPageHelper receivedEmail;

    public App() {
        this.login = new LoginHelper();
        this.dashboard = new DashboardHelper();
        this.common = new CommonHelper();
        this.header = new HeaderHelper();
        this.createEmail = new CreateEmailHelper();
        this.receivedEmail = new ReceivedEmailPageHelper();
    }
}
