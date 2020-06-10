package com.clientserver;

public class Employee {
	private int manNo;
	private String firstName;
	private String lastName;
	private String dob;
	private String email;
	private String phoneNumber;
	private String department;
	private int salary;
	
	public Employee(int manNo, String fname, String lname, String dob, String email, String phoneNumber, String department, int salary){
	      this.manNo = manNo;
	      this.firstName = fname;
	      this.lastName = lname;
	      this.dob = dob;
	      this.email = email;
	      this.phoneNumber = phoneNumber;
	      this.department = department;
	      this.salary = salary;
	      
	}
	
	// toString method
		@Override
		public String toString() {
			return "Employee [Man No.= " + manNo + ", name= " + firstName + " " + lastName +  ", department= " + department + ", dob= " + dob + ", getId()= "
					+ getManNo() + ", getFirstName()= " + getFirstName() + ", getDepartment()=" + getDepartment() + ", getDob()= "
					+ getDob() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		}

	

	public int getManNo() {
		return manNo;
	}
	
	public void setManNo(int manNo) {
		this.manNo = manNo;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
}
