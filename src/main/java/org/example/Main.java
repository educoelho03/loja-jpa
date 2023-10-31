package org.example;

import org.example.model.Product;
import org.example.model.ProductDAO;
import org.example.util.JPAUtil;

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

        EntityManager entityManager = JPAUtil.getEntityManagerFactory();
        ProductDAO productDAO = new ProductDAO(entityManager);

        entityManager.getTransaction().begin();
        productDAO.cadastar(celular);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}