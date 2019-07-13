package com.zensar.coreJava.collection;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriterSerializableTest {

	public static void main(String[] args) throws IOException {
		Employee employee = new Employee();
		employee.setName("Ashintha");
		employee.setAge((byte) 30);
		employee.setAddress("Galle");
		FileOutputStream fout = new FileOutputStream("C:/Users/dh6rabe/Downloads/employee.txt");
		/*ObjectOutputStream oos = new ObjectOutputStream(fout);
		oos.writeObject(employee);
		oos.close();*/
		fout.write(employee.toString().getBytes());
		System.out.println("Process complete");
		
		try(FileWriter fileWriter = new FileWriter("C:/Users/dh6rabe/Downloads/redableEmployee.txt")) {  
		    String fileContent = "This is a sample text.";
		    fileWriter.write(fileContent);
		} catch (IOException e) {
		    // exception handling
		}
		System.out.println("Process complete");
		
		
		try(FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/dh6rabe/Downloads/redableEmployee1.txt")) {  
		    String fileContent = "This is a sample text.";
		    fileOutputStream.write(fileContent.getBytes());
		} catch (FileNotFoundException e) {
		    // exception handling
		} catch (IOException e) {
		    // exception handling
		}
	}

}
