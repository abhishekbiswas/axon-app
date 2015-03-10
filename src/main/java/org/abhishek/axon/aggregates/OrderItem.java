package org.abhishek.axon.aggregates;

import org.abhishek.axon.commands.ChangeOrderDescriptionCommand;
import org.abhishek.axon.commands.CreateOrderItemCommand;
import org.abhishek.axon.commands.MarkOrderCompletedCommand;
import org.abhishek.axon.events.OrderCompletedEvent;
import org.abhishek.axon.events.OrderDescriptionChangedEvent;
import org.abhishek.axon.events.OrderItemCreatedEvent;
import org.axonframework.commandhandling.annotation.CommandHandler;
import org.axonframework.eventhandling.annotation.EventHandler;
import org.axonframework.eventsourcing.EventSourcingRepository;
import org.axonframework.eventsourcing.annotation.AbstractAnnotatedAggregateRoot;
import org.axonframework.eventsourcing.annotation.AggregateIdentifier;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Created by abhishek on 09/03/15.
 */
public class OrderItem extends AbstractAnnotatedAggregateRoot {

    @AggregateIdentifier
    private String id;

    private String description;

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

    @CommandHandler
    public void changeDescription(ChangeOrderDescriptionCommand command){
        System.out.println("Inside ChangeOrderDescription command handler");
        apply(new OrderDescriptionChangedEvent(command.getOrderId(), command.getDescription()));
    }

    @EventHandler
    public void on(OrderItemCreatedEvent event) {
        this.id = event.getOrderId();
        this.description = event.getDescription();
    }

    @EventHandler
    public void on(OrderDescriptionChangedEvent event){
        this.description = event.getDescription();
    }

}
