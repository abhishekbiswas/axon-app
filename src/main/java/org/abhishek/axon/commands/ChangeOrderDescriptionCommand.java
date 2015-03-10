package org.abhishek.axon.commands;

import org.axonframework.commandhandling.annotation.TargetAggregateIdentifier;

/**
 * Created by abhishek on 10/03/15.
 */
public class ChangeOrderDescriptionCommand {

    @TargetAggregateIdentifier
    private final String orderId;

    private final String description;

    public ChangeOrderDescriptionCommand(String orderId, String description){
        this.orderId = orderId;
        this.description = description;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getDescription() {
        return description;
    }
}
