package org.abhishek.axon.events;

import org.abhishek.axon.aggregates.Address;

/**
 * Created by abhishek on 10/03/15.
 */
public class CustomerAddressChangedEvent {

    private String id;
    private Address address;

    public CustomerAddressChangedEvent(String id, Address address){
        this.id = id;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public Address getAddress() {
        return address;
    }
}
