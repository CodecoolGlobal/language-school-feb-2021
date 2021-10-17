package com.codecool.language_school;

import com.codecool.language_school.controller.AppControl;
import com.codecool.language_school.data.DataGenerator;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class App {
    /**
     *
     * Create AppControl passing EntityManager to constructor.
     * Run AppControl.
     *
     */
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("language_school");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        DataGenerator dataGenerator = new DataGenerator(entityManager);
        dataGenerator.populateDb();

        AppControl appControl = new AppControl(entityManager);
        appControl.run();

        entityManager.close();
        entityManagerFactory.close();
    }
}













