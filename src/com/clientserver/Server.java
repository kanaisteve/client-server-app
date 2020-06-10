package com.clientserver;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;

public class Server {
	
	public static void main(String args[]) throws IOException{

		String manNoLabel = "Man No Entered: ";
		String nameLabel = "Name: ";
		String dobLabel = "DOB: ";
		String emailLabel = "Email: ";
		String phLabel = "Phone No.: ";
		String deptLabel = "Department: ";
		String salaryLabel = "Salary: K";

		List<Employee> employees = new ArrayList<Employee>(); 
		Employee employee1 = new Employee(1, "Edgar", "Musonda", "1989", "edgarmusonda@gmail.com", "0978454347", "Health", 4000);
		Employee employee2 = new Employee(2, "Kay", "Mulonda", "1995", "kaymulonda@gmail.com", "0978454347", "Economics", 3000);
		Employee employee3 = new Employee(3, "Karen", "Bupe", "1987", "karenbupe@gmail.com", "0978454347", "Information Technology", 6000);
		Employee employee4 =  new Employee(4, "Peter", "Makasa", "1993", "petermakasa@gmail.com", "0978454347", "Agriculture", 7000);
		Employee employee5 = new Employee(5, "Henry", "Mwila", "1995", "henrymwila@gmail.com", "0978454347", "Environmental", 5000);
		
		
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);
		
		
	System.out.println("Server has been started...");	
	
	ServerSocket server = new ServerSocket(5555);
	Socket s = server.accept();
	
	
	InputStreamReader in = new InputStreamReader(s.getInputStream());
	BufferedReader bf = new BufferedReader(in);
	
	// Get data from client
	String manNo = bf.readLine();
	
	// loop employee list to match client user input
	for (Employee emp : employees) {
		
		// send data to client
		PrintWriter pr = new PrintWriter(s.getOutputStream());				
		
		 if  (emp.getManNo() == Integer.parseInt(manNo)) {
			 pr.println("==========  EMPLOYEE DETAILS  ==============");
			 pr.println(manNoLabel + emp.getManNo());
			 pr.println(nameLabel + emp.getFirstName() + " " + emp.getLastName());
			 pr.println(dobLabel + emp.getDob());
			 pr.println(emailLabel + emp.getEmail());
			 pr.println(phLabel + emp.getPhoneNumber());
			 pr.println(deptLabel + emp.getDepartment());
			 pr.println(salaryLabel + emp.getSalary());
			 pr.println("===========================================");
			 pr.flush();
		}
	}
	

	server.close();
	}
	

}
