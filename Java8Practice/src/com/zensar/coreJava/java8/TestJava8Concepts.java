package com.zensar.coreJava.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import com.zensar.coreJava.collection.Employee;

public class TestJava8Concepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		Consumer<String> c = System.out::println;
		
		Vehicle v = new Car();
		List<Integer> integers = Arrays.asList(1,12,433,5);
        
		Optional<Integer> max = integers.stream().reduce( Math::max );
		 
		max.ifPresent(value -> System.out.println(value));
	}
	
	private ststic void findIndians()
	

}
