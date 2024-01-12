package com.xworkz.jpa.boot;




import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FestivalEntityRunner {

    public static <FestivalEntity> void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
       // FestivalEntity festivalEntity = new FestivalEntity(1,"Diwali","November","Karnataka","India");
      //  em.persist(festivalEntity);

        et.commit();
        em.close();
        emf.close();
    }
}