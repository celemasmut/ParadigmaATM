package SocialNetwork;

import java.nio.charset.StandardCharsets;

public abstract class SocialNetwork {

    private String userName;
    private String password;

    SocialNetwork(){    }

    public boolean post(String message){
        if(logIn(this.userName, this.password)){
            boolean result = sendData(message);
            logOut();
            return result;
        }
        return false;
    }

    abstract boolean logIn(String userName, String password);
    abstract void logOut();
    abstract boolean sendData(String message);

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
