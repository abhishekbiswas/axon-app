package org.abhishek.axon.aggregates;

import org.abhishek.axon.commands.ChangeCustomerAddressCommand;
import org.abhishek.axon.commands.ChangeCustomerEmailCommand;
import org.abhishek.axon.commands.ChangeCustomerNameCommand;
import org.abhishek.axon.commands.CreateCustomerCommand;
import org.abhishek.axon.events.CustomerAddressChangedEvent;
import org.abhishek.axon.events.CustomerCreatedEvent;
import org.abhishek.axon.events.CustomerEmailChangedEvent;
import org.abhishek.axon.events.CustomerNameChangedEvent;
import org.axonframework.commandhandling.annotation.CommandHandler;
import org.axonframework.eventhandling.annotation.EventHandler;
import org.axonframework.eventsourcing.annotation.AbstractAnnotatedAggregateRoot;
import org.axonframework.eventsourcing.annotation.AggregateIdentifier;

/**
 * Created by abhishek on 10/03/15.
 */
public class Customer extends AbstractAnnotatedAggregateRoot {

    @AggregateIdentifier
    private String id;

    private String name;
    private String email;
    private Address address;

    public Customer(){}

    @CommandHandler
    public Customer(CreateCustomerCommand command){
        apply(new CustomerCreatedEvent(command.getId(), command.getName(), command.getEmail(), command.getAddress()));
    }

    @CommandHandler
    public void changeName(ChangeCustomerNameCommand command){
        apply(new CustomerNameChangedEvent(command.getId(), command.getName()));
    }

    @CommandHandler
    public void changeEmail(ChangeCustomerEmailCommand command){
        apply(new CustomerEmailChangedEvent(command.getId(), command.getEmail()));
    }

    @CommandHandler
    public void changeAddress(ChangeCustomerAddressCommand command) {
        apply(new CustomerAddressChangedEvent(command.getId(), command.getAddress()));
    }


    @EventHandler
    public void on(CustomerCreatedEvent event){
        this.id = event.getId();

//        this.name = event.getName();
//        this.email = event.getEmail();
//        this.address = event.getAddress();

        apply(new CustomerNameChangedEvent(event.getId(), event.getName()));
        apply(new CustomerEmailChangedEvent(event.getId(), event.getEmail()));
        apply(new CustomerAddressChangedEvent(event.getId(), event.getAddress()));
    }

    @EventHandler
    public void on(CustomerNameChangedEvent event){
        this.name = event.getName();
    }

    @EventHandler
    public void on(CustomerEmailChangedEvent event){
        this.email = event.getEmail();
    }

    @EventHandler
    public void on(CustomerAddressChangedEvent event) {
        this.address = event.getAddress();
    }

}
