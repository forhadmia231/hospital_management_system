package HospitalManagementsystem;

public class Appointment {
    private patient patient;
    private Doctor doctor;
    private String date;
    private String time;

    //constractor appoinment class
    public Appointment(patient patient, Doctor doctor, String date, String time) {
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.time = time;
    }

    public void displayAppointmentDetails() {
        System.out.println("\nAppointment Details:");
        patient.displayPatientDetails();
        doctor.displayDoctorDetails();
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
    }
}
