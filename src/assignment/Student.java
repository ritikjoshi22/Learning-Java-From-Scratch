package assignment;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Student {
    private String name;
    private int age;
    private String contact;
    private String address;
    private int totalMarks;
    private LocalDate dateOfBirth;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        this.age = calculateAge(dateOfBirth); // Recalculate age when DOB changes
    }
    // 2.Method to calculate age from date of birth
    private int calculateAge(LocalDate dateOfBirth) {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }


    // 3.Checking student’s grade from the total marks.
    public String getGrade() {
        if (totalMarks >= 90) {
            return "A+";
        } else if (totalMarks >= 80) {
            return "A";
        } else if (totalMarks >= 70) {
            return "B";
        } else if (totalMarks >= 60) {
            return "C";
        } else if (totalMarks >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    // Display student details
    public void displayStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Contact: " + contact);
        System.out.println("Address: " + address);
        System.out.println("Date of Birth: " + dateOfBirth.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Grade: " + getGrade());
    }
}