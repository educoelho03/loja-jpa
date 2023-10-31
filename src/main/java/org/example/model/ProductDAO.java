package org.example.model;

import javax.persistence.EntityManager;


public class ProductDAO {

    private final EntityManager entityManager;

    public ProductDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

   public void cadastar(Product product){
        this.entityManager.persist(product);
   }
}
