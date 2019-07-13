package com.zensar.coreJava.collection;

import java.io.Serializable;

public class Employee implements Comparable<Employee>, Serializable{ //
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private int age;
	private String address;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.age - o.age;
	}
	
	/*@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			return super.equals(obj);
		}

	@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return super.hashCode();
		}*/
	
	public String whoIsThis() {
        StringBuffer employee = new StringBuffer();
        employee.append(getName()).append(" is ").append(getAge()).append(" years old and lives at ")
                .append(getAddress());
        return employee.toString();
    }

}
