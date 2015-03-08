package org.abhishek.axon.commands;

import org.axonframework.commandhandling.annotation.TargetAggregateIdentifier;

/**
 * Created by abhishek on 09/03/15.
 */
public class MarkOrderCompletedCommand {

    @TargetAggregateIdentifier
    private final String orderId;

    public MarkOrderCompletedCommand(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }
}
