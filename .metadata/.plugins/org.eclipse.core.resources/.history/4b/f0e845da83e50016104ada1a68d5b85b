package com.github.schionato.domain;

import com.github.schionato.infra.EntityManagerFacade;
import org.junit.Before;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class TestSetup {

    private static EntityTransaction open(EntityManager em) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        return transaction;
    }

    private static void close(EntityTransaction transaction) {
        if (transaction.isActive())
            transaction.rollback();
    }

    @Before
    public void beforeTest() {
        open(EntityManagerFacade.em());
    }


    public void afterTest() {
        close(EntityManagerFacade.em().getTransaction());
    }
}
