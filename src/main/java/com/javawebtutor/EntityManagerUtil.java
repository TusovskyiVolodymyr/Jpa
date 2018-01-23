package com.javawebtutor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtil{

    private static EntityManagerFactory entityManagerFactory = null;
    private static EntityManager entityManager = null;

    public static EntityManager getEntityManager() {
        entityManagerFactory = Persistence.createEntityManagerFactory("primary");
        entityManager = entityManagerFactory.createEntityManager();
        return entityManager;
    }

    public static void close(){
        entityManager.close();
        entityManagerFactory.close();
    }
}
