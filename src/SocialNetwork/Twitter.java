package SocialNetwork;

public class Twitter extends SocialNetwork{

    public Twitter(String userName, String password){
        super.setUserName(userName);
        super.setPassword(password);
    }

    @Override
    boolean logIn(String userName, String password) {
        System.out.println("Verificando login...");
        System.out.println("Name : " + userName);
        System.out.println("Password: ");
        for(int i =0; i< password.length(); i++){
            System.out.println("*");
        }
        System.out.println("Login exitoso en Twitter");
        return true;
    }

    @Override
    void logOut() {
        System.out.println("User: " + super.getUserName() + " se ha deslogueado");
    }

    @Override
    boolean sendData(String message) {
        boolean messagePosted = true;
        if(messagePosted){
            System.out.println("Mensaje: "+message + " fue posteado en Twitter");
        }else{
            System.out.println("Error en el posteo");
        }
        return false;
    }
}
