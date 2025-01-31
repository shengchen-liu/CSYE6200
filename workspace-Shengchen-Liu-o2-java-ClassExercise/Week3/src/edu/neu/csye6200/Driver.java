package edu.neu.csye6200;

import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Driver {
	public static void main(String [] args) {
	
		String fileName = "students2.csv";	
		List<Person> persons = new ArrayList<Person>();
		List<Student> students = new ArrayList<Student>();
	
	// Read entire ASCII comma separated value file: each line becomes a student object
	// try with resources: all resources in () are closed at conclusion of try clause
	
		try (BufferedReader inLine = new BufferedReader(new FileReader(fileName));
		) {
			
			String inputLine = null; // read one line from file at a timewhile ((inputLine = inLine.readLine()) != null) {
			
			while ((inputLine = inLine.readLine()) != null) {
				// Parse line converting each string token into a Student object field
			
				String[] fields = inputLine.split(",");
				int age = new Integer(fields[0]);
				String fname = fields[1];			
				String lname = fields[2];
				
				double gpa = new Double(fields[3]);
				
				String parentFname = fields[4];
				String parentLname = fields[5];
				// instantiate Student object from line in file and add to list
				persons.add(new Person ( fname, lname, age));
				//students.add(new Student( fname, lname, age, gpa ));
				students.add(new Student (fname,lname,age,gpa,parentFname,parentLname));
			}
	
		} catch (IOException e) {
	// catch IOException (and implicitly FileNotFoundException)
			e.printStackTrace();
		}
		
		for (Person p : persons) {
			System.out.println(p.speak());
		}
		
		for (Student s : students) {
			System.out.println(s.speak());
		}
		
		System.out.printf("Original sort, list:%s\n", persons);
		
		String[] fiveNames = {"Dan", "Jim", "Eve", "Ina"};
		String fileName_write = "new_students.csv";
		// try with resources: all resources in () are closed at conclusion of try clause
		try ( // open output stream to output file for writing purpose.
			FileWriter fw = new FileWriter(fileName_write);
			BufferedWriter out= new BufferedWriter(fw);
			) {
			System.out.println("BufferedWriter: "+ " write " + fiveNames.length + "items");
			for (String name : fiveNames) {
				out.write(name);
				out.newLine();
			}
				out.flush();
			} catch (Exception e) {
		// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
