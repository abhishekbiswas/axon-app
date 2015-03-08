package org.abhishek.axon.aggregates;

import org.abhishek.axon.commands.CreateOrderItemCommand;
import org.abhishek.axon.commands.MarkOrderCompletedCommand;
import org.abhishek.axon.events.OrderCompletedEvent;
import org.abhishek.axon.events.OrderItemCreatedEvent;
import org.axonframework.commandhandling.annotation.CommandHandler;
import org.axonframework.eventhandling.annotation.EventHandler;
import org.axonframework.eventsourcing.annotation.AbstractAnnotatedAggregateRoot;
import org.axonframework.eventsourcing.annotation.AggregateIdentifier;


/**
 * Created by abhishek on 09/03/15.
 */
public class OrderItem extends AbstractAnnotatedAggregateRoot {

    @AggregateIdentifier
    private String id;

    public OrderItem() {}

    @CommandHandler
    public OrderItem(CreateOrderItemCommand command) {
        System.out.println("Inside CreateOrderItem command handler");
        apply(new OrderItemCreatedEvent(command.getOrderId(), command.getDescription()));
    }

    @CommandHandler
    public void markCompleted(MarkOrderCompletedCommand command) {
        System.out.println("Inside MarkOrderCompleted command handler");
        apply(new OrderCompletedEvent(id));
    }

    @EventHandler
    public void on(OrderItemCreatedEvent event) {
        this.id = event.getOrderId();
    }

}
