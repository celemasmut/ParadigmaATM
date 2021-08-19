package patrones.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Publisher {
    private String name;
    private List<Follower> followers;

    public Publisher(String name){
        this.name = name;
        this. followers = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public void addFollower(Follower follower){
        this.followers.add(follower);
    }
    public void removeFollower(Follower follower){
        this.followers.remove(follower);
    }

    public void notify(Message message){
        followers.forEach( follower -> follower.reciveMessage(message));
    }
}
