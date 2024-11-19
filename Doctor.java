package HospitalManagementsystem;

public class Doctor {
    private String name;
    private String specialization;
    private String contactNumber;

    //  doctor class Constructor
    public Doctor(String name, String specialization, String contactNumber) {
        this.name = name;
        this.specialization = specialization;
        this.contactNumber = contactNumber;
    }

    // Display doctor details
    public void displayDoctorDetails() {
        System.out.println("Doctor Name: " + name);
        System.out.println("Specialization: " + specialization);
        System.out.println("Contact Number: " + contactNumber);
    }
}
