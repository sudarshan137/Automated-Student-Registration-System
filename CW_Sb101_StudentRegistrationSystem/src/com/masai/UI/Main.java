package com.masai.UI;

import java.util.Scanner;

public class Main {
	private static StudentUi studentUi;
	private static CourseUi courseUi;
	private static BatchUi batchUi;
	
	
	static void displayAdminMenu() {
		System.out.println("Enter your choice admin.");
		System.out.println("1. Add a new course.");
		System.out.println("2. update fees of a coure.");
		System.out.println("3. Delete a course from any training session.");
		System.out.println("4. Search information about a course.");
		System.out.println("5. Create batch under a course.");
		System.out.println("6. Allocate students in a batch under a course.");
		System.out.println("7. Update total seats of a batch");
		System.out.println("8. View the students of every batch");
		System.out.println("0. Exit");
	}
	
	
	static void adminMenu(Scanner sc) {
		int choice=0;
		do {
			displayAdminMenu();
			choice=sc.nextInt();
			switch(choice) {
			case 0:
				System.out.println("Thank you visit again admin");
				break;
				
			case 1:
				courseUi.addCourse();
				break;
				
			case 2:
				courseUi.updateCourse();
				break;
				
			case 3:
				courseUi.deleteCourse();
				break;
			
			case 4:
				courseUi.courseinfo();
				break;
				
			case 5:
				courseUi.createBatch();
				break;
				
			}
			
		}while(choice!=0);
	}
	
	static void adminLogin(Scanner sc) {
		System.out.println("Enter username");
		String username=sc.next();
		System.out.println("Enter password");
		String password=sc.next();
		if(username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {
			System.out.println("Login Successfull\nWelcome Admin");
			adminMenu(sc);		
		}else {
			System.out.println("Wrong Credentials Admin");
		}
	}
	
	
	
	static void studentLogin(Scanner sc) {
		System.out.println("Code to krlo pehle uncle");
	}
	
	
	
	
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 studentUi = new StudentUi(sc);
	 courseUi = new CourseUi(sc);
	 batchUi = new BatchUi(sc);
	 
	 int choice = 0;
	 
	 do {
		 System.out.println("1. Admin Login\n2. Student Login\n0. Exit");
		 choice=sc.nextInt();
		switch(choice) {
		case 0:
			System.out.println("Thank You, Visit again");
			break;
		case 1:
			adminLogin(sc);
			break;
		case 2:
			studentLogin(sc);
			break;
		default:
			System.out.println("Invalid input!, Please try again ");
		}
	 }while(choice!=0);
	 sc.close();
	 
	 
}
	
}
