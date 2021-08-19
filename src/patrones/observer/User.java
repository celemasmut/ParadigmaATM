package patrones.observer;

public class User extends Publisher implements Follower {

    private String socialMedia;
    private String email;

    public User(String name, String socialMedia, String email){
        super(name);
        this.socialMedia = socialMedia;
        this.email = email;
    }

    @Override
    public void reciveMessage(Message message) {
        System.out.println("Soy "+ this.getName()+ " y recibi el mensaje "+ message.getMessage()+ " de "+ message.getSubject().getName()+ "a las "+ message.getDate());
    }

    public void publish(String message){
        Message messageToSend = new Message(this,message);
        super.notify(messageToSend);
    }

}
