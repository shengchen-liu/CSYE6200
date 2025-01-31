package edu.neu.csye6200;

public class Employee extends Person implements Comparable<Employee>{
	private double wage;
	
	@Override
	public String toString() {
		return super.toString();
	}
	@Override
	public int compareTo(Employee employee) {
		return employee.getWage().compareTo(this.getWage());
	}

	public Double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}
	
	public Employee() {
		super();
		super.setFirstName("FName1");
		super.setLastName("LName1");
	}
	
	public Employee(String fName, String lName, int age, double wage) {
		super();
		super.setFirstName(fName);
		super.setLastName(lName);
		super.setAge(age);
		this.wage = wage;
	}




}
