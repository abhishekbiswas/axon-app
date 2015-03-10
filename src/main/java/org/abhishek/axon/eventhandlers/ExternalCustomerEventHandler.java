package org.abhishek.axon.eventhandlers;

import org.abhishek.axon.commands.ChangeCustomerEmailCommand;
import org.abhishek.axon.events.CustomerAddressChangedEvent;
import org.abhishek.axon.events.CustomerCreatedEvent;
import org.abhishek.axon.events.CustomerEmailChangedEvent;
import org.abhishek.axon.events.CustomerNameChangedEvent;
import org.axonframework.eventhandling.annotation.EventHandler;

/**
 * Created by abhishek on 10/03/15.
 */
public class ExternalCustomerEventHandler {

    @EventHandler
    public void handle(CustomerCreatedEvent event){
        System.out.println("New Customer created with ID: " + event.getId());
    }

    @EventHandler
    public void handle(CustomerNameChangedEvent event){
        System.out.println("Customer(" + event.getId() + ") name changed to: " + event.getName());
    }

    @EventHandler
    public void handle(CustomerEmailChangedEvent event){
        System.out.println("Customer(" + event.getId() + ") email changed to: " + event.getEmail());
    }

    @EventHandler
    public void handle(CustomerAddressChangedEvent event){
        System.out.println("Customer(" + event.getId() + ") address changed to: " + event.getAddress());
    }


}
