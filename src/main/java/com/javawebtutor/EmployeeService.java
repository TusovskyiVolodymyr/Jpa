package com.javawebtutor;

import javax.persistence.EntityManager;
import java.util.List;

public class EmployeeService implements EmployeeDAO {

    public void add(Employee employee) {
        EntityManager entityManager = EntityManagerUtil.getEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(employee);
            entityManager.getTransaction().commit();
            EntityManagerUtil.close();
        } catch (Exception e) {
            e.getMessage();
            entityManager.getTransaction().rollback();
        }
    }

    @Override
    public Employee get(int id) {
        EntityManager entityManager = EntityManagerUtil.getEntityManager();
        Employee employee = null;
        try {
            entityManager.getTransaction().begin();
            employee = entityManager.find(Employee.class, id);
            if (employee==null){
                System.out.println("No such element ");
            }
            entityManager.getTransaction().commit();
            EntityManagerUtil.close();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            e.getMessage();
        }
        return employee;
    }

    @Override
    public void delete(int id) {
        EntityManager entityManager = EntityManagerUtil.getEntityManager();
        try {
            entityManager.getTransaction().begin();
            Employee employee = entityManager.find(Employee.class, id);
            entityManager.remove(employee);
            entityManager.getTransaction().commit();
            EntityManagerUtil.close();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            e.getMessage();
        }
    }

    @Override
    public void getAll() {
        EntityManager entityManager = EntityManagerUtil.getEntityManager();
        try {
            entityManager.getTransaction().begin();
            List<Employee> employees = entityManager.createQuery("from Employee").getResultList();
            entityManager.getTransaction().commit();
            EntityManagerUtil.close();
            System.out.println(employees.toString());
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            e.getMessage();
        }
    }

    @Override
    public void update(int id) {
        EntityManager entityManager = EntityManagerUtil.getEntityManager();
        try {
            entityManager.getTransaction().begin();
            Employee employee = entityManager.find(Employee.class, id);
            entityManager.merge(employee);
            entityManager.getTransaction().commit();
            EntityManagerUtil.close();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            e.getMessage();
        }
    }
}
