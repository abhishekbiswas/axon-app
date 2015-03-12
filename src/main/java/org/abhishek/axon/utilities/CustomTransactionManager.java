package org.abhishek.axon.utilities;


import org.axonframework.unitofwork.SpringTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;

/**
 * Created by abhishek on 12/03/15.
 */
public class CustomTransactionManager extends SpringTransactionManager {

    private SpringTransactionManager springTransactionManager;

    public CustomTransactionManager(SpringTransactionManager springTransactionManager){
        this.springTransactionManager = springTransactionManager;
    }

    @Override
    public TransactionStatus startTransaction() {
        System.out.println("Start Transaction");
        return springTransactionManager.startTransaction();
    }

    @Override
    public void commitTransaction(TransactionStatus tx) {
        System.out.println("Commit Transaction");
        springTransactionManager.commitTransaction(tx);
    }

    @Override
    public void rollbackTransaction(TransactionStatus tx) {
        System.out.println("Rollback Transaction");
        springTransactionManager.rollbackTransaction(tx);
    }

    public void setTransactionManager(PlatformTransactionManager transactionManager) {
        springTransactionManager.setTransactionManager(transactionManager);
    }

    public void setTransactionDefinition(TransactionDefinition transactionDefinition) {
        springTransactionManager.setTransactionDefinition(transactionDefinition);
    }

}
