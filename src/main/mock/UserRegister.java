package main.mock;

public class UserRegister {
    private String userId;
    private String password;

    public void savePassword(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
