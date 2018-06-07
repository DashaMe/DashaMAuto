package TopPackage.Utils;

import TopPackage.Utils.Email.Email;
import TopPackage.Utils.Users.User;

import java.util.ResourceBundle;

public class Factory {
    public static class Users{
        static ResourceBundle resourceUser = ResourceBundle.getBundle("user");

        public static User getValidSender(){
            return new User(resourceUser.getString("sender.login"),
                    resourceUser.getString("sender.password"),
                    resourceUser.getString("sender.email"));
        }

        public static User getValidRecipient(){
            return new User(resourceUser.getString("recipient.login"),
                    resourceUser.getString("recipient.password"),
                    resourceUser.getString("recipient.email"));
        }

        public static User getRandomUser(){
            return new User("","","");
        }
    }

    public static class Emails{
        static ResourceBundle resourceEmail = ResourceBundle.getBundle("email");

        public static Email getEmail(){
            return new Email(resourceEmail.getString("testEmail.emailFrom"),
                    resourceEmail.getString("testEmail.emailTo"),
                    resourceEmail.getString("testEmail.emailSubject"),
                    resourceEmail.getString("testEmail.emailBody"));
        }
    }
}