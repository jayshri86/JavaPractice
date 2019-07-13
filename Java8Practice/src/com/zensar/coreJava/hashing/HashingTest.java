package com.zensar.coreJava.hashing;

import java.util.HashMap;
import java.util.Map;

public class HashingTest {
	
	public static void main(String[] args) {
		
		Map<DataKey, Integer> hm = getAllData();
		
		hm.forEach((k,v) -> System.out.println(" Key = " + k + " Value = " + v));

		DataKey dk = new DataKey();
		dk.setId(1);
		dk.setName("Pankaj");
		System.out.println("After changing feilds = " + dk.hashCode());

		Integer value = hm.get(dk);

		System.out.println( "== " + value);

	}

	private static Map<DataKey, Integer> getAllData() {
		Map<DataKey, Integer> hm = new HashMap<>();

		DataKey dk = new DataKey();
		dk.setId(1);
		dk.setName("Pankaj");
		System.out.println("before change = " + dk.hashCode());

		hm.put(dk, 10);

		return hm;
	}


}
