package org.abhishek.axon.utilities;

import org.axonframework.domain.AggregateRoot;
import org.axonframework.domain.EventMessage;
import org.axonframework.unitofwork.UnitOfWork;
import org.axonframework.unitofwork.UnitOfWorkListener;

import java.util.List;
import java.util.Set;

/**
 * Created by abhishek on 13/03/15.
 */
public class CustomUnitOfWorkListener implements UnitOfWorkListener {

    @Override
    public void afterCommit(UnitOfWork unitOfWork) {
        System.out.println("AfterCommit Called");
    }

    @Override
    public void onRollback(UnitOfWork unitOfWork, Throwable failureCause) {
        System.out.println("OnRollback Called");
    }

    @Override
    public <T> EventMessage<T> onEventRegistered(UnitOfWork unitOfWork, EventMessage<T> event) {
        System.out.println("OnEventRegistered Called");
        return null;
    }

    @Override
    public void onPrepareCommit(UnitOfWork unitOfWork, Set<AggregateRoot> aggregateRoots, List<EventMessage> events) {
        System.out.println("OnPrepareCommit Called");
    }

    @Override
    public void onPrepareTransactionCommit(UnitOfWork unitOfWork, Object transaction) {
        System.out.println("OnPrepareTransactionCommit Called");
    }

    @Override
    public void onCleanup(UnitOfWork unitOfWork) {
        System.out.println("OnCleanup Called");
    }
}
