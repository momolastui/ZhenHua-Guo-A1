import java.util.ArrayList;

public class AssignmentOne {
    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        // 创建全科医生和专科医生对象
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Alice", "Greenfield Clinic");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Bob", "Downtown Clinic");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Carol", "Westside Clinic");
        Specialist sp1 = new Specialist(4, "Dr. Dave", "Cardiology");
        Specialist sp2 = new Specialist(5, "Dr. Eve", "Dermatology");

        // 打印健康专业人员的信息
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

        // 创建一个用于存储预约的 ArrayList
        ArrayList<Appointment> appointments = new ArrayList<>();

        // 创建并添加预约
        createAppointment(appointments, "John Doe", "1234567890", "08:00", gp1);
        createAppointment(appointments, "Jane Smith", "0987654321", "10:00", sp1);
        createAppointment(appointments, "Mary Johnson", "1122334455", "14:30", gp2);
        createAppointment(appointments, "Chris Lee", "2233445566", "09:00", sp2);

        // 打印所有预约
        System.out.println("Appointments:");
        printExistingAppointments(appointments);
        System.out.println("------------------------------");

        // 根据手机号取消预约并打印更新后的列表
        System.out.println("Cancelling appointment for John Doe (Mobile: 1234567890)");
        cancelBooking(appointments, "1234567890");
        System.out.println("Updated Appointments:");
        printExistingAppointments(appointments);
        System.out.println("------------------------------");
    }

    /**
     * 创建预约并添加到列表
     *
     * @param appointments      存储预约的 ArrayList
     * @param patientName       病人姓名
     * @param patientMobile     病人手机号
     * @param preferredTimeSlot 预约时间
     * @param doctor            医生对象（全科医生或专科医生）
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
     * 打印所有预约
     *
     * @param appointments 存储预约的 ArrayList
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
     * 根据手机号取消预约
     *
     * @param appointments  存储预约的 ArrayList
     * @param patientMobile 病人手机号
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
