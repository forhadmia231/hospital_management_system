package HospitalManagementsystem;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Patient Details:");
        System.out.print("Name: ");
        String patientName = scanner.nextLine();
        System.out.print("Age: ");
        int patientAge = scanner.nextInt();

        scanner.nextLine();
        System.out.print("Gender: ");
        String patientGender = scanner.nextLine();
        System.out.print("Contact Number: ");
        String patientContact = scanner.nextLine();

        patient patient = new patient(patientName, patientAge, patientGender, patientContact);

        System.out.println("\nEnter Doctor Details:");
        System.out.print("Name: ");
        String doctorName = scanner.nextLine();
        System.out.print("Specialization: ");
        String doctorSpecialization = scanner.nextLine();
        System.out.print("Contact Number: ");
        String doctorContact = scanner.nextLine();

        Doctor doctor = new Doctor(doctorName, doctorSpecialization, doctorContact);

        System.out.println("\nEnter Appointment Details:");
        System.out.print("Date (Ex.., 2024-11-20): ");
        String appointmentDate = scanner.nextLine();
        System.out.print("Time (ex.., 10:00 AM): ");
        String appointmentTime = scanner.nextLine();

        Appointment appointment = new Appointment(patient, doctor, appointmentDate, appointmentTime);

        appointment.displayAppointmentDetails();

        scanner.close();
    }
}
