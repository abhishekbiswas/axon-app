package org.abhishek.axon.commands;

import org.axonframework.commandhandling.annotation.TargetAggregateIdentifier;

/**
 * Created by abhishek on 10/03/15.
 */
public class ChangeCustomerNameCommand {

    @TargetAggregateIdentifier
    private String id;
    private String name;

    public ChangeCustomerNameCommand(String id, String name){
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
