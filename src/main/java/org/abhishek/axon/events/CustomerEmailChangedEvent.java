package org.abhishek.axon.events;

/**
 * Created by abhishek on 10/03/15.
 */
public class CustomerEmailChangedEvent {

    private String id;
    private String email;

    public CustomerEmailChangedEvent(String id, String email){
        this.id = id;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}
