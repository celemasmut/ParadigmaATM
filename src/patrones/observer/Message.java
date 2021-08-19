package patrones.observer;

import java.time.LocalDateTime;

public class Message {

    private Publisher subject;
    private String message;
    private LocalDateTime date;

    public Message(Publisher subject, String message){
        this.subject = subject;
        this.message = message;
        this.date = LocalDateTime.now();
    }

    public Publisher getSubject() {
        return subject;
    }

    public void setSubject(Publisher subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
