package org.abhishek.axon.aggregates;

import org.axonframework.test.FixtureConfiguration;
import org.axonframework.test.Fixtures;
import org.junit.Before;
import org.junit.Test;

public class CustomerTest {

    private FixtureConfiguration fixture;

    @Before
    public void setUp() throws Exception {
        fixture = Fixtures.newGivenWhenThenFixture(Customer.class);
    }

//    @Test
//    public void testCreateOrderItem() throws Exception {
//        fixture.given()
//                .when(new CreateOrderItemCommand("order1", "need to implement the aggregate"))
//                .expectEvents(new OrderItemCreatedEvent("order1", "need to implement the aggregate"));
//    }
//
//    @Test
//    public void testMarkOrderAsCompleted() throws Exception {
//        fixture.given(new OrderItemCreatedEvent("order1", "need to implement the aggregate"))
//                .when(new MarkOrderCompletedCommand("order1"))
//                .expectEvents(new OrderCompletedEvent("order1"));
//    }

}