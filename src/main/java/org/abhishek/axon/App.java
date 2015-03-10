package org.abhishek.axon;

import org.abhishek.axon.commands.ChangeOrderDescriptionCommand;
import org.abhishek.axon.commands.CreateOrderItemCommand;
import org.abhishek.axon.commands.MarkOrderCompletedCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.axonframework.eventstore.mongo.MongoEventStore;
import org.axonframework.eventstore.fs.FileSystemEventStore;

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
        final String itemId = UUID.randomUUID().toString();
        commandGateway.send(new CreateOrderItemCommand(itemId, "Need to do this"));
        commandGateway.send(new MarkOrderCompletedCommand(itemId));
        commandGateway.send(new ChangeOrderDescriptionCommand(itemId, "New Description"));
    }

}
