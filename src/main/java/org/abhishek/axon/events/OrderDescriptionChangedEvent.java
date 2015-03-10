package org.abhishek.axon.events;

/**
 * Created by abhishek on 10/03/15.
 */
public class OrderDescriptionChangedEvent {

    private final String orderId;
    private final String description;

    public OrderDescriptionChangedEvent(String orderId, String description) {
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
