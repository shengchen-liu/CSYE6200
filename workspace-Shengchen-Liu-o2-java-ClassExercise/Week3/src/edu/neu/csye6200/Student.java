package edu.neu.csye6200;

public class Student extends Person{
	private double GPA;
	private String parentFname;
	private String parentLname;
	
	public String getParentFname() {
		return parentFname;
	}

	public void setParentFname(String parentFname) {
		this.parentFname = parentFname;
	}

	public String getParentLname() {
		return parentLname;
	}

	public void setParentLname(String parentLname) {
		this.parentLname = parentLname;
	}

	public Student() {
		super();
		super.setAge(20);
		super.setFirstName("firstStudent");
		super.setLastName("lastStudent");
		GPA = 0.0;
	}
	
	public Student(String fname, String lname, int age, double gpa) {
		super();
		super.setAge(age);
		super.setFirstName(fname);
		super.setLastName(lname);
		GPA = gpa;
	}
	
	public Student(String fname, String lname, int age, double gpa, String parentFname, String parentLname) {
		super();
		super.setAge(age);
		super.setFirstName(fname);
		super.setLastName(lname);
		GPA = gpa;
		this.setParentFname(parentFname);
		this.setParentLname(parentLname);
		
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}
	
	@Override
	public String speak() {
		return "My name is " + super.getFirstName() + " " + super.getLastName()+ " and I am a student." + " My GPA is: " + this.getGPA() 
				+ ". My parent is:" + this.getParentFname() + " "+ this.getParentLname();
	}
	
	
	

}
