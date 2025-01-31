package edu.neu.csye6200;

public class Student extends Person implements Comparable<Student> {

	@Override
	public String toString() {
		return super.toString();
	}
	//toString

	private Double GPA;
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

	public void setGPA(double gpa) {
		GPA = gpa;
	}
	

	@Override
	/**
	 * sort by GPA, descending order.
	 */
    public int compareTo(Student student) {
        return student.GPA.compareTo(this.GPA);
        
    }   

	
}
	

