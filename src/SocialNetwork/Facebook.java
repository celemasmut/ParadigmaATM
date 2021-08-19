package SocialNetwork;

public class Facebook extends SocialNetwork{

    public Facebook(String userName, String password){
        super.setUserName(userName);
        super.setPassword(password);
    }

    @Override
    boolean logIn(String userName, String password) {
        System.out.println("Verificando login.");
        System.out.println("LogIn correcto en Facebook");
        return true;
    }

    @Override
    void logOut() {
        System.out.println("User: " + getUserName() + " ha salido de Facebook.");
    }

    @Override
    boolean sendData(String message) {
        boolean messagePosted = true;
        if (messagePosted) {
            System.out.println("Message: '" + message + "' was posted on Facebook");
            return true;
        } else {
            System.out.println("Error en el posteo.");
            return false;
        }
    }
}
