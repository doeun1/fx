package common;

import java.time.LocalDate;

public class Employee {
 int employeeId;
 String firstName;
 String lastName;
 String email;
 LocalDate hireDate;
 String jobId;
 int salary;
 
 public Employee() {
	 
 }
public Employee(int employeeId, String firstName, String lastName, String email, LocalDate hireDate, String jobId,
		int salary) {
	this.employeeId = employeeId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.hireDate = hireDate;
	this.jobId = jobId;
	this.salary = salary;
}



public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getJobId() {
	return jobId;
}
public void setJobId(String jobId) {
	this.jobId = jobId;
}
public Employee(int employeeId, String lastName, LocalDate hireDate, int salary) {
	this.employeeId = employeeId;
	this.lastName = lastName;
	this.hireDate = hireDate;
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", lastName=" + lastName + ", hireDate=" + hireDate + ", salary="
			+ salary + "]";
}



public Employee(String lastName, LocalDate hireDate, int salary) {
	super();
	this.lastName = lastName;
	this.hireDate = hireDate;
	this.salary = salary;
}



public Employee(String lastName, int salary) {
	super();
	this.lastName = lastName;
	this.salary = salary;
}
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}

public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public LocalDate getHireDate() {
	return this.hireDate;
}
public void setHireDate(LocalDate hireDate) {
	this.hireDate = hireDate;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
 
 
 
}
