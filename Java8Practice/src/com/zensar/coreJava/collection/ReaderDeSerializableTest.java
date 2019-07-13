package com.zensar.coreJava.collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReaderDeSerializableTest {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		Employee employee = new Employee();
		FileInputStream fin = new FileInputStream("C:/Users/dh6rabe/Downloads/employee.txt");
		/*ObjectInputStream ois = new ObjectInputStream(fin);
		employee = (Employee) ois.readObject();
		ois.close();*/
		
		int ch1 = fin.read();
	    while(ch1 != -1) {
	        System.out.print((char)ch1);
	        ch1 = fin.read();
	    }
		System.out.println(employee.whoIsThis());
		
		//////////////////////////////////////
		try(FileReader fileReader = new FileReader("C:/Users/dh6rabe/Downloads/redableEmployee.txt")) {  
		    int ch = fileReader.read();
		    while(ch != -1) {
		        System.out.print((char)ch);
		        ch = fileReader.read();
		    }
		} catch (FileNotFoundException e) {
		    // exception handling
		} catch (IOException e) {
		    // exception handling
		}
	//	System.out.println(employee.whoIsThis());
		
		/////////////////////////////////////
		try(FileInputStream fileInputStream = new FileInputStream("C:/Users/dh6rabe/Downloads/redableEmployee1.txt")) {  
		    int ch = fileInputStream.read();
		    while(ch != -1) {
		        System.out.print((char)ch);
		        ch = fileInputStream.read();
		    }
		} catch (FileNotFoundException e) {
		    // exception handling
		} catch (IOException e) {
		    // exception handling
		}
	}

}
