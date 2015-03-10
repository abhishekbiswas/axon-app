package org.abhishek.axon.events;

/**
 * Created by abhishek on 10/03/15.
 */
public class CustomerNameChangedEvent {

    private String id;
    private String name;

    public CustomerNameChangedEvent(String id, String name){
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
