package org.abhishek.axon.commands;

import org.abhishek.axon.aggregates.Address;
import org.axonframework.commandhandling.annotation.TargetAggregateIdentifier;

/**
 * Created by abhishek on 10/03/15.
 */
public class ChangeCustomerAddressCommand {

    @TargetAggregateIdentifier
    private String id;
    private Address address;

    public ChangeCustomerAddressCommand(String id, Address address){
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
