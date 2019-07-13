package com.zensar.coreJava.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestCollection {

	public static void main(String[] args) {
		String[] employee = {"Niku","Jaya","Omp"};	
		
		Set<Employee> numSet1 = new HashSet<>();
		Set<Employee> numSet2 = new LinkedHashSet<>();
		Set<Employee> numSet3 = new TreeSet<>();
		Set<Employee> numSet4 = new TreeSet<>();	
		
		List<Employee> numList1 = new ArrayList<>();
		List<Employee> numList2 = new Vector<>();
		List<Employee> numList3 = new LinkedList<>();
		List<Employee> numList4 = new CopyOnWriteArrayList<>();
		
		Map<Integer,String> map = new HashMap<>();
		Map<Integer,String> table = new Hashtable<>();
		Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
		Map<Integer,String> treeMap = new TreeMap<>();
		
	//	Map<Integer,String> treeMap1 = new SortedMap();
		Map<Integer,String> treeMap1 = new ConcurrentHashMap<>();
	/*	Map<Integer,String> treeMap = new TreeMap<>();
		Map<Integer,String> treeMap = new SynchroMap<>();*/
		
		testArray(employee);
		testSet();
		testList();
		testMap();
		
		testMapIntenal();
		testConcurrentMap();
	}

	public static void testArray(String[] emp) {			
		Arrays.stream(emp).forEach(e -> System.out.print("," + e));
		
		List<Object> lst = Arrays.asList(emp);			
		lst.forEach(l -> System.out.println("Array to List = " + l));
	}

	public static void testSet() {		
		Set<? super Number> numSet = new HashSet<>();
		numSet.add(new Integer(1));
		numSet.add(1);
		numSet.add(10);
		numSet.add(1);		
		numSet.stream().forEach(n -> System.out.println("\n numSet = " + n));	
		
		Set<Integer> intSet = new TreeSet<>(Collections.reverseOrder());
		intSet.add(3);
		intSet.add(5);
		intSet.add(1);
		intSet.add(6);
		
		intSet.forEach(n -> System.out.println("Test TreeSet = " + n + "---- " + new Employee().toString()));
				
		Set<String> stringSet = new TreeSet<>();
		stringSet.add("Jaya");
		stringSet.add("Bala");
		stringSet.add("Niku");
		stringSet.add("Aai");
		
		stringSet.forEach(n -> System.out.println("Test String TreeSet = " + n + "---- " + new Employee().toString()));
		
		
	}

	public static void testList() {		
		List<Employee> numList = new ArrayList();
		numList.add(new Employee(1, "Jaya", 30));
		numList.add(new Employee(1, "Niku", 32));
		numList.add(new Employee(1, "Omp", 28));
		
		numList.forEach( n -> System.out.println("numList = " + n));
		
	//	List lst = new ArrayList<>();
		List lst = new LinkedList<>();
		lst.add(2);
		lst.add(5);
		lst.add(1);
		lst.add(1);
		lst.add(0);
		//lst.forEach(n -> System.out.println("Test random access before remove " +lst.get(3)));
		//lst.remove(0);
		lst.forEach(n -> System.out.println("Test random access " + lst.get(3)));

	}

	public static void testMap() {
		
		Arrays.stream({1,3,6,2,4}).
		
		Map<Integer,String> map = new HashMap<>();
		Map<Integer,String> table = new Hashtable();
		Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
		
		map.put(1, "jaya");
		map.put(2, "Niku");
		map.put(0, "Bala");
		map.put(null, "XYZ");  // accept one null key and multiple null values
		map.put(null, "Bala");
		map.put(1, "LMN");  
		
		Collections.synchronizedMap(map);
		
		map.forEach((k,v) -> System.out.println("map Key = " + k + " Value = " + v));
		try {
		table.put(1, "jaya");
		table.put(2, "Niku");
		table.put(0, "Bala");
		table.put(0, "qwqw");
		table.put(3, "XYZ");
		table.put(1, "LMN");
		table.put(null, "LMN");   // do not accept null key and null value
	//	table.put(1, null);
		
		//Collections.synchronizedMap(table);
		
		table.forEach((k,v) -> System.out.println("table Key = " + k + " Value = " + v));
		/*}catch(FileNotFoundException ex){
		     System.out.println(" ==== ");*/
		}catch(Exception ex){
		     System.out.println(" ==== ");
		}
	}
	
	private static void testMapIntenal() {
		Map<Employee,String> map1 = new HashMap<>();
		Employee e1 = new Employee(1, "Jaya", 30);
		Employee e2 = new Employee(1, "Jaya", 30);
		
		map1.put(e1, "girl");
		map1.put(e2, "girl");
		
		map1.forEach((k,v) -> System.out.println("map Key = " + k + " Value = " + v));
		
		System.out.println("" + map1.get(e1).equals(e2));
		
	}
	
	private static void testConcurrentMap() {
		Map<Integer,String> concMap = new ConcurrentHashMap<>();
		concMap.put(1, "One");
		concMap.put(1, "Two");
		concMap.put(0, "Zero");
	//	concMap.put(null, "One");
	//	concMap.put(null, "One");
	//	concMap.put(null, null);   -- do not accept null key and null value
	//	concMap.put(4, null);
		
		
		concMap.forEach((k, v) -> System.out.println("ConcMap key = " + k + " ConcMap value = " + v));
	}

}
