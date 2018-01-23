package com.javawebtutor;

public interface EmployeeDAO {

    void add(Employee employee);

    Object get(int id);

    void update(int id);

    void delete(int id);

    void getAll();

}
