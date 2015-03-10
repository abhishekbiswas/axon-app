package org.abhishek.axon.eventhandlers;

import org.abhishek.axon.events.OrderCompletedEvent;
import org.abhishek.axon.events.OrderDescriptionChangedEvent;
import org.abhishek.axon.events.OrderItemCreatedEvent;
import org.axonframework.eventhandling.annotation.EventHandler;

/**
 * Created by abhishek on 09/03/15.
 */
public class OrderEventHandler {

    @EventHandler
    public void handle(OrderItemCreatedEvent event) {
        System.out.println("We've got something to do: " + event.getDescription() + " (" + event.getOrderId() + ")");
    }

    @EventHandler
    public void handle(OrderCompletedEvent event) {
        System.out.println("We've completed a task: " + event.getOrderId());
    }

    @EventHandler
    public void handle(OrderDescriptionChangedEvent event){
        System.out.println("We've changed the description to: \"" + event.getDescription() + "\"");
    }


}
