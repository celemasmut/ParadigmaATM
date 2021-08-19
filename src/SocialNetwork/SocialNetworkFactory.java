package SocialNetwork;

public class SocialNetworkFactory {

    SocialNetwork socialNetwork;

    public SocialNetwork creadorDeRedSocial(int opcion, String userName, String password){
        switch (opcion){
            case 1:
                socialNetwork = new Facebook(userName,password);
                break;
            case 2:
                socialNetwork = new Twitter(userName, password);
                break;
        }
        return socialNetwork;
    }
}
