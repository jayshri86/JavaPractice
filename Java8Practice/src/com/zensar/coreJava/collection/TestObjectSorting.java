package com.zensar.coreJava.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestObjectSorting {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(5, "Jaya", 30));
		empList.add(new Employee(3, "Niku", 32));
		empList.add(new Employee(4, "Omp", 28));

		testObjectSort(empList);
		//testGenerics();
	}

	public static void testObjectSort(List<Employee> empList) {
		// empList.sort(c);
		// Collections.sort(empList);
		// Collections.sort(empList, comp);
		List<Integer> lst1 = new ArrayList<>();
		lst1.add(2);
		lst1.add(1);
		lst1.add(3);
		Collections.sort(lst1);
		lst1.forEach(emp -> System.out.println(" == > " + emp.toString()));	
		Collections.sort(empList);
		empList.sort(comp);
		empList.forEach(emp -> System.out.println(" == " + emp.toString()));
	}

	/*
	 * static Comparator<Employee> comp = new Comparator<Employee>() {
	 * 
	 * @Override public int compare(Employee o1, Employee o2) {
	 *  return o1.getName().compareTo(o2.getName()); 
	 *  }};
	 */

	static Comparator<Employee> comp = (o1, o2) -> {return o1.getName().compareTo(o2.getName());};

	public static void testGenerics() {
		List<Object> lst = new ArrayList<>();
		lst.add("Jaya");
		lst.add(1);

		lst.forEach(l -> System.out.println(l));
	}

}
