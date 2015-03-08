package org.abhishek.axon.events;

/**
 * Created by abhishek on 09/03/15.
 */
public class OrderItemCreatedEvent {

    private final String orderId;
    private final String description;

    public OrderItemCreatedEvent(String orderId, String description) {
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