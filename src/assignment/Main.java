package assignment;

//Q3. Create a class in Java for student with suitable attributes and methods including
//1.	Saving and getting student name, age, contact, address, total marks, date of birth.
//2.	Calculating age from date of birth.
//3.	Checking student’s grade from the total marks.

import java.time.LocalDate;
public class Main {
	
	    // Main method for testing
	    public static void main(String[] args) {
	        // Create a student object
	        Student student = new Student();
	        student.setName("John Doe");
	        student.setContact("1234567890");
	        student.setAddress("123 Main St");
	        student.setTotalMarks(85);
	        student.setDateOfBirth(LocalDate.of(2005, 5, 15));
	        
	        //Display the age of the student
	        System.out.println("Student Age: "+ student.getAge());
	        
	        //Display the grade of the student
	        System.out.println("Student Grade: "+ student.getGrade()+"\n");
	        
	        // Display student details
	        System.out.println("Student Details:");
	        student.displayStudentDetails();
	    }
}
