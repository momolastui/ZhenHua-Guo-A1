import java.util.ArrayList;

public class AssignmentOne {
    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        // Create General Practitioners and Specialists
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Alice", "Greenfield Clinic");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Bob", "Downtown Clinic");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Carol", "Westside Clinic");
        Specialist sp1 = new Specialist(4, "Dr. Dave", "Cardiology");
        Specialist sp2 = new Specialist(5, "Dr. Eve", "Dermatology");

        // Print the information of health professionals
        System.out.println("// Part 3 – Using classes and objects");
        System.out.println("Health Professionals:");
        gp1.displayInfo();
        gp2.displayInfo();
        gp3.displayInfo();
        sp1.displayInfo();
        sp2.displayInfo();
        System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        System.out.println("// Part 5 – Collection of appointments");

        // Create an ArrayList to store appointments
        ArrayList<Appointment> appointments = new ArrayList<>();

        // Create and add appointments
        createAppointment(appointments, "John Doe", "1234567890", "08:00", gp1);
        createAppointment(appointments, "Jane Smith", "0987654321", "10:00", sp1);
        createAppointment(appointments, "Mary Johnson", "1122334455", "14:30", gp2);
        createAppointment(appointments, "Chris Lee", "2233445566", "09:00", sp2);

        // Print all appointments
        System.out.println("Appointments:");
        printExistingAppointments(appointments);
        System.out.println("------------------------------");

        // Cancel an appointment based on phone number and print the updated list
        System.out.println("Cancelling appointment for John Doe (Mobile: 1234567890)");
        cancelBooking(appointments, "1234567890");
        System.out.println("Updated Appointments:");
        printExistingAppointments(appointments);
        System.out.println("------------------------------");
    }

    /**
     * Create an appointment and add it to the list
     *
     * @param appointments      ArrayList storing the appointments
     * @param patientName       Patient's name
     * @param patientMobile     Patient's mobile number
     * @param preferredTimeSlot Preferred appointment time
     * @param doctor            Doctor object (General Practitioner or Specialist)
     */
    public static void createAppointment(ArrayList<Appointment> appointments, String patientName, String patientMobile, String preferredTimeSlot, HealthProfessional doctor) {
        if (patientName != null && !patientName.isEmpty() &&
            patientMobile != null && !patientMobile.isEmpty() &&
            preferredTimeSlot != null && !preferredTimeSlot.isEmpty() &&
            doctor != null) {
            appointments.add(new Appointment(patientName, patientMobile, preferredTimeSlot, doctor));
            System.out.println("Appointment created for " + patientName);
        } else {
            System.out.println("Failed to create appointment. All fields must be provided.");
        }
    }

    /**
     * Print all appointments
     *
     * @param appointments ArrayList storing the appointments
     */
    public static void printExistingAppointments(ArrayList<Appointment> appointments) {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
        } else {
            for (Appointment appointment : appointments) {
                appointment.printAppointmentInfo();
                System.out.println("------------------------------");
            }
        }
    }

    /**
     * Cancel an appointment based on patient's mobile number
     *
     * @param appointments  ArrayList storing the appointments
     * @param patientMobile Patient's mobile number
     */
    public static void cancelBooking(ArrayList<Appointment> appointments, String patientMobile) {
        boolean found = false;
        for (Appointment appointment : appointments) {
            if (appointment.getPatientMobile().equals(patientMobile)) {
                appointments.remove(appointment);
                System.out.println("Appointment cancelled for " + patientMobile);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No appointment found for " + patientMobile);
        }
    }
}

