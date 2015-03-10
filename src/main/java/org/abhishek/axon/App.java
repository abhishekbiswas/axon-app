package org.abhishek.axon;

import org.abhishek.axon.aggregates.Address;
import org.abhishek.axon.commands.ChangeCustomerAddressCommand;
import org.abhishek.axon.commands.ChangeCustomerEmailCommand;
import org.abhishek.axon.commands.ChangeCustomerNameCommand;
import org.abhishek.axon.commands.CreateCustomerCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.UUID;

public class App 
{

    private CommandGateway commandGateway;

    public App(CommandGateway commandGateway) {
        this.commandGateway = commandGateway;
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("axonAppContext.xml");
        App app = new App(applicationContext.getBean(CommandGateway.class));
        app.run();
    }

    private void run() {
        final String customerId = UUID.randomUUID().toString();

        commandGateway.send(new CreateCustomerCommand(customerId, "Abhishek", "biswas.abhishek@ymail.com",
                            new Address("B-1104", "ATS Haciendas")));

        commandGateway.send(new ChangeCustomerNameCommand(customerId, "Abhishek Biswas"));
        commandGateway.send(new ChangeCustomerEmailCommand(customerId, "biswas.abhishek@outlook.com"));
        commandGateway.send(new ChangeCustomerAddressCommand(customerId, new Address("I-62", "Forest County")));
    }

}
