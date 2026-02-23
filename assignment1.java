CT100/G/23925/24
VICTOR KIBET RANDABUN
kibetvictor630@gmail.com
kibet-lgtm

import java.util.Scanner;

// i) StudentRecord class
class StudentRecord {
    // Fields to store student details
    private String studentID;
    private String name;
    private String course;
    
    // Constructor to initialize fields
    public StudentRecord(String studentID, String name, String course) {
        this.studentID = studentID;
        this.name = name;
        this.course = course;
    }
    
    // Method to display student details
    public void displayInfo() {
        System.out.println("\n--- Student Information ---");
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}

// ii) StudentApp class
public class StudentApp {
    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Display program header
        System.out.println("STUDENT RECORD MANAGEMENT SYSTEM");
        System.out.println("================================");
        
        // Prompt user for student details
        System.out.println("\nPlease enter the following student details:");
        
        System.out.print("Student ID: ");
        String studentID = scanner.nextLine();
        
        System.out.print("Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Course: ");
        String course = scanner.nextLine();
        
        // Instantiate a StudentRecord object using user-provided data
        StudentRecord student = new StudentRecord(studentID, name, course);
        
        // Call the displayInfo method to display student details
        student.displayInfo();
        
        // Close the scanner to prevent resource leak
        scanner.close();
        
        System.out.println("\nThank you for using the Student Record System!");
    }
}