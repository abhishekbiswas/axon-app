package org.abhishek.axon.commands;

import org.axonframework.commandhandling.annotation.TargetAggregateIdentifier;

/**
 * Created by abhishek on 10/03/15.
 */
public class ChangeCustomerEmailCommand {

    @TargetAggregateIdentifier
    private String id;
    private String email;

    public ChangeCustomerEmailCommand(String id, String email){
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
