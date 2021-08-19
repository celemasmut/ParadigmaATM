package patrones.observer;

public class ObserverRun {

    public static void main(String [] args){
        User influencer = new User("murmu","twitter","murmu@redbee.com");
        User follower1 = new User("pepe","twitter","pepe@redbee.com");
        User follower2 = new User("pablo","twitter", "pablo@redbee.com");
        User follower3 = new User("DOMINGO","twitter", "domingo@redbee.com");

        influencer.addFollower(follower1);
        influencer.addFollower(follower2);
        influencer.addFollower(follower3);

        influencer.publish("Hola chicos este es mi primer mensaje");
        influencer.removeFollower(follower3);

        influencer.publish("me enoje con DOMINGO Y lo bloquie");

    }
}
