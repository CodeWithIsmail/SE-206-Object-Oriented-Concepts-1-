public class AuthenticationInfo {
    private String URL;
    private String userName;
    private String password;

    public AuthenticationInfo(String URL, String userName, String password) {
        this.URL = URL;
        this.userName = userName;
        this.password = password;
    }

    public String getURL() {
        return URL;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "URL: " + URL+ ", UserName: " + userName+
                ", Password: " + password;
    }
}
