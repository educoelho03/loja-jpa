package org.example.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

    private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("loja");;


    public static EntityManager getEntityManagerFactory() {
        return entityManagerFactory.createEntityManager();
    }
}
