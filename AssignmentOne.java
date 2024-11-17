import java.util.ArrayList;

public class AssignmentOne {
    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        // 创建健康专业人员对象
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Alice", "Greenfield Clinic");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Bob", "Downtown Clinic");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Carol", "Westside Clinic");

        Specialist sp1 = new Specialist(4, "Dr. Dave", "Cardiology");
        Specialist sp2 = new Specialist(5, "Dr. Eve", "Dermatology");

        // 打印所有健康专业人员的信息
        gp1.displayInfo();
        gp2.displayInfo();
        gp3.displayInfo();
        System.out.println("------------------------------");
        sp1.displayInfo();
        sp2.displayInfo();
        System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        // 创建一个 ArrayList 存储预约
        ArrayList<Appointment> appointments = new ArrayList<>();

        // 创建并添加预约
        createAppointment(appointments, "John Doe", "1234567890", "08:00", gp1);
        createAppointment(appointments, "Jane Smith", "0987654321", "10:00", sp1);
        createAppointment(appointments, "Mary Johnson", "1122334455", "14:30", gp2);
        createAppointment(appointments, "Chris Lee", "2233445566", "09:00", sp2);

        // 打印现有预约
        printExistingAppointments(appointments);
        System.out.println("------------------------------");

        // 取消预约
        cancelBooking(appointments, "1234567890");

        // 打印更新后的预约列表
        printExistingAppointments(appointments);
        System.out.println("------------------------------");
    }

    // 创建预约并添加到列表
    public static void createAppointment(ArrayList<Appointment> appointments, String patientName, String patientMobile, String preferredTimeSlot, HealthProfessional doctor) {
        if (patientName != null && !patientName.isEmpty() && patientMobile != null && !patientMobile.isEmpty() && preferredTimeSlot != null && !preferredTimeSlot.isEmpty() && doctor != null) {
            appointments.add(new Appointment(patientName, patientMobile, preferredTimeSlot, doctor));
            System.out.println("Appointment created for " + patientName);
        } else {
            System.out.println("Failed to create appointment. All fields must be provided.");
        }
    }

    // 打印所有现有的预约
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

    // 取消预约
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
