package org.abhishek.axon.events;

import org.abhishek.axon.aggregates.Address;

/**
 * Created by abhishek on 10/03/15.
 */
public class CustomerCreatedEvent {

    private String id;
    private String name;
    private String email;
    private Address address;

    public CustomerCreatedEvent(String id, String name, String email, Address address){
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public Address getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}
