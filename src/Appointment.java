public class Appointment {
    private final String patientName;         // Patient's name
    private final String patientMobile;       // Patient's mobile number
    private final String preferredTimeSlot;   // Preferred appointment time
    private final HealthProfessional doctor;  // Doctor object

    // Default constructor
    public Appointment() {
        this.patientName = "Unknown";
        this.patientMobile = "Unknown";
        this.preferredTimeSlot = "Unknown";
        this.doctor = null;
    }

    // Constructor with parameters
    public Appointment(String patientName, String patientMobile, String preferredTimeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.preferredTimeSlot = preferredTimeSlot;
        this.doctor = doctor;
    }

    // Get patient's mobile number
    public String getPatientMobile() {
        return patientMobile;
    }

    // Print appointment details
    public void printAppointmentInfo() {
        if (doctor != null) {
            System.out.println("Patient Name: " + patientName);
            System.out.println("Patient Mobile: " + patientMobile);
            System.out.println("Preferred Time Slot: " + preferredTimeSlot);
            System.out.println("Doctor: " + doctor.getName() + " (" + doctor.getSpecialty() + ")");
        } else {
            System.out.println("Doctor not assigned for this appointment.");
        }
    }
}



