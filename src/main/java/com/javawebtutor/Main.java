package com.javawebtutor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        final EntityManagerFactory factory = Persistence
//                .createEntityManagerFactory("primary");
//        //основний інтерфейс для роботи з БД
//        final EntityManager em = factory.createEntityManager();
//        //почати транзакцію
//        em.getTransaction().begin();
//
//        Employee employee = new Employee("1","2","3");
//        em.persist(employee);
//        Query query = em.createQuery("From Employee");
//        List<Employee> employees = query.getResultList();
//        System.out.println(employees);
//        //		закінчити транзакцію
//        em.getTransaction().commit();
//        em.close();
//        factory.close();
        EmployeeService service = new EmployeeService();
        Employee employee = service.get(4);
        service.add(new Employee("ivan","john","obse"));
        service.getAll();
        service.delete(4);
        service.getAll();
    }
}
