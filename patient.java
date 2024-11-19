package HospitalManagementsystem;
import java.util.Scanner;

public class patient {
    private String name;
    private int age;
    private String gender;
    private String contactNumber;

    public patient(String name, int age, String gender, String contactNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.contactNumber = contactNumber;
    }

    // Display patient details
    public void displayPatientDetails() {
        System.out.println("Patient Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Contact Number: " + contactNumber);
    }
}


