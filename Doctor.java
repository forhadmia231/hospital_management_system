package HospitalManagementsystem;

public class Doctor {
    private String name;
    private String specialization;
    private String contactNumber;

    public Doctor(String name, String specialization, String contactNumber) {
        this.name = name;
        this.specialization = specialization;
        this.contactNumber = contactNumber;
    }

    public void displayDoctorDetails() {
        System.out.println("Doctor Name: " + name);
        System.out.println("Specialization: " + specialization);
        System.out.println("Contact Number: " + contactNumber);
    }
}
