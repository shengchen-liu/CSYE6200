package edu.neu.csye6200;

public class Person implements Comparable<Person>{

	private String lastName;
	private String firstName;
	private int age = 0;
	
	public Person() {

		this.lastName = "Last";
		this.firstName = "first";
		this.age = 3;
		
	}
	public Person(String fname, String lname, int age) {

		this.lastName = lname;
		this.firstName = fname;
		this.age = age;
		
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String speak() {
		return "My name is " + this.getFirstName() + " " + this.getLastName();
	}
	
	public static void demo() {
		System.out.println("This is a demo: display all ... ");

	}
	
	@Override
    public int compareTo(Person person) {
        return lastName.compareTo(person.lastname);
        //return this.name - person.name;
    }   
}
