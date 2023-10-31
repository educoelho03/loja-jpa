package org.example;

import org.example.model.Product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Product celular = new Product();

        celular.setName("Iphone 15");
        celular.setDescription("Azul e bonito");
        celular.setPrice(new BigDecimal("800"));

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("loja");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        entityManager.persist(celular); // Inserir/persistir dados no banco de dados
        entityManager.getTransaction().commit();
    }
}