package com.clientserver;

import java.net.*;
import java.util.Scanner;
import java.io.*;

public class Client {
	
	public static void main(String args[]) throws UnknownHostException, IOException {
	
	Socket client = new Socket("localhost", 5555);
	
	Scanner scanner = new Scanner(System.in);
	String manNo;
	
	//Enter Man Number and press Enter
	System.out.println("Enter Man Number:");
	manNo = scanner.nextLine();
	
	// send data to server
	PrintWriter pr = new PrintWriter(client.getOutputStream());
	pr.println(manNo);
	pr.flush();

	// get data from server
	InputStreamReader in = new InputStreamReader(client.getInputStream());
	BufferedReader bf = new BufferedReader(in);
	
	String details = bf.readLine();
	String manno = bf.readLine();
	String name = bf.readLine();
	String dob = bf.readLine();
	String email = bf.readLine();
	String phoneNo = bf.readLine();
	String dept = bf.readLine();
	String salary = bf.readLine();
	String endDetails = bf.readLine();
	
	// Display results on console
	System.out.println(details);
	System.out.println(manno);
	System.out.println(name);
	System.out.println(dob);
	System.out.println(email);
	System.out.println(phoneNo);
	System.out.println(dept);
	System.out.println(salary);
	System.out.println(endDetails);
	
	scanner.close();
	client.close();
	}
	
	
	
}
