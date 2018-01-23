package com.javawebtutor;

import javax.persistence.*;

@Entity
@Table(name = "EMP_DB")
public class Employee {

	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "fistName")
	private String firstName;

	@Column(name = "lastName")
	private String lastName;

	@Column(name = "dept")
	private String dept;

	public Employee() {

	}

	public Employee(String firstName, String lastName, String dept) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setDept(dept);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"id=" + id +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", dept='" + dept + '\'' +
				'}';
	}
}
