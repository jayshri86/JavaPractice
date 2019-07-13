package com.zensar.coreJava.collection.generics;

import java.util.ArrayList;
import java.util.List;

public class TestGenerics {

	public static void main(String[] args) {
		testGen1();
		testGen2();
		testGen3();

	}
	
	public static void testGen1() {
		List<Object> lstObj = new ArrayList<>();
		lstObj.add("Jaya");
		
		List<String> lstStr = new ArrayList<>();
		//lstStr = lstObj;
	}
	
	public static void testGen2() {
		List<Object> lstObj = new ArrayList<>();
		lstObj.add("Jaya");
		
		List<? extends Object> lstStr = new ArrayList<>();
		lstStr = lstObj;
		//lstObj = lstStr;
		
		lstStr.forEach(l -> System.out.println("testGen2 = " + l));
	}
	
	public static void testGen3() {
		List<Object> lstObj = new ArrayList<>();
		lstObj.add(1);
		
		List<? super Number> lstStr = new ArrayList<>();
		lstStr = lstObj;
	//	lstObj = lstStr;
		
		List<Integer> lstObj1 = new ArrayList<>();
		lstObj.add(1);
		
		List<? extends Number> lstStr1 = new ArrayList<>();
		lstStr1 = lstObj1;
		//lstObj1 = lstStr1;
		
		List<? super Number> lstStr2 = new ArrayList<>();
	//	lstStr2 = lstObj1; will not work bcz  lstObis lower class of Number .. it is expecting upper class of number
		lstStr2 = lstObj;
	}

}
