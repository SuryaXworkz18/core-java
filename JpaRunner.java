package com.xworkz.jpa.boot;

import com.xworkz.entity.SuperHeroEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaRunner {
    public static void main(String[] args) {
       EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
        System.out.println("EMF"+emf);
        EntityManager em = emf.createEntityManager();;
        System.out.println("EM"+em);
        EntityTransaction et = em.getTransaction();
        System.out.println("ET"+et);
        et.begin();
     System.out.println("Et begins");
        System.out.println("String operation");
        SuperHeroEntity superHeroEntity = new SuperHeroEntity(2,"Robert","Ironman",
                "Technology&robotics","USA","Wife");
        em.persist(superHeroEntity);
        System.out.println("operation completed");
        et.commit();
        System.out.println("ET commit");
        System.out.println("Closing em & emf");
        em.close();
        emf.close();


    }
}
