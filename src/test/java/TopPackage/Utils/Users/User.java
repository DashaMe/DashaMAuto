package TopPackage.Utils.Users;

import java.util.Objects;

public class User {
    private String login;
    private String password;
    private String email;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(getLogin(), user.getLogin()) &&
                Objects.equals(getPassword(), user.getPassword()) &&
                Objects.equals(getEmail(), user.getEmail());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getLogin(), getPassword(), getEmail());
    }

    public User(String login, String password, String email) {
        this.login = login;
        this.password = password;
        this.email = email;
    }
}
