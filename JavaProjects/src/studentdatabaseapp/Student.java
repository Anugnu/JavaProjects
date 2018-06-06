package studentdatabaseapp;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	private int tutionBalance = 0;
	private static int costOfCourse=600;
	private static int id = 1000;
	
	// Constructor : prompt user to enter student's name and year
	public Student() {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Student firstname :");
		this.firstName = in.nextLine();
		
		System.out.print("Enter Student lastname :");
		this.lastName = in.nextLine();
		
		System.out.print("\n1 - Freshmen\n2 - Sopmore\n3 - Junior\n4 - Senior\nEnter Student class level :");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
	
	}
	
	// Generate an ID
	private void setStudentID() {
		//Grade level + ID
		id++;
		this.studentID = gradeYear + "" + id;
		
	}
	
	// Enroll in courses
	public void enroll() {
		//Get inside a loop user gets 0
		do {
			System.out.println("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q")) {
				courses = courses + "\n" + course;
				tutionBalance = tutionBalance + costOfCourse;
			}
			else {
				break;
			}
		} while (1 != 0);
		
		System.out.println("ENROLLED IN: " + courses);
		System.out.println("TUTUION BALANCE: " + tutionBalance);
	} 
	
	// View balance
	public void viewBalance() {
		System.out.println("Your balance is: $" + tutionBalance);
		
	}
	
	// pay tuition
	public void payTution() {
		viewBalance();
		System.out.println("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tutionBalance = tutionBalance - payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
		
	}
	// show status
	public String toString() {
		return "Name: " + firstName + " " + lastName +
				"\nCourses Enrolled: " + courses +
				"\nBalance: $ " + tutionBalance;
	}
}