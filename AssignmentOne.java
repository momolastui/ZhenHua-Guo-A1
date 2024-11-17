import java.util.ArrayList;

public class AssignmentOne {
    public static void main(String[] args) {
        // 创建全科医生和专科医生对象
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Alice", "Greenfield Clinic");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Bob", "Downtown Clinic");
        Specialist sp1 = new Specialist(3, "Dr. Carol", "Cardiology");
        Specialist sp2 = new Specialist(4, "Dr. Eve", "Dermatology");

        // 打印健康专业人员信息
        System.out.println("Health Professionals:");
        gp1.displayInfo();
        gp2.displayInfo();
        sp1.displayInfo();
        sp2.displayInfo();
        System.out.println("------------------------------");

        // 创建预约集合并添加预约
        ArrayList<Appointment> appointments = new ArrayList<>();
        createAppointment(appointments, "John Doe", "1234567890", "08:00", gp1);
        createAppointment(appointments, "Jane Smith", "0987654321", "10:00", sp1);
        createAppointment(appointments, "Mary Johnson", "1122334455", "14:30", gp2);

        // 打印所有预约
        System.out.println("Appointments:");
        printExistingAppointments(appointments);
        System.out.println("------------------------------");

        // 取消预约
        cancelBooking(appointments, "1234567890");

        // 打印更新后的预约列表
        System.out.println("Updated Appointments:");
        printExistingAppointments(appointments);
    }

    /**
     * 创建预约并添加到列表
     *
     * @param appointments      用于存储预约的列表
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

            // 创建并添加预约
            appointments.add(new Appointment(patientName, patientMobile, preferredTimeSlot, doctor));
            System.out.println("Appointment created for " + patientName);
        } else {
            System.out.println("Failed to create appointment. All fields must be provided.");
        }
    }

    /**
     * 打印现有预约信息
     *
     * @param appointments 存储所有预约的列表
     */
    public static void printExistingAppointments(ArrayList<Appointment> appointments) {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
        } else {
            for (Appointment appointment : appointments) {
                appointment.printAppointmentInfo(); // 打印预约信息
                System.out.println("------------------------------");
            }
        }
    }

    /**
     * 根据手机号取消预约
     *
     * @param appointments  存储所有预约的列表
     * @param patientMobile 病人的手机号
     */
    public static void cancelBooking(ArrayList<Appointment> appointments, String patientMobile) {
        boolean found = false;
        for (Appointment appointment : appointments) {
            if (appointment.getPatientMobile().equals(patientMobile)) {
                appointments.remove(appointment); // 移除预约
                System.out.println("Appointment cancelled for " + patientMobile);
                found = true;
                break; // 只需移除第一个匹配项
            }
        }
        if (!found) {
            System.out.println("No appointment found for " + patientMobile);
        }
    }
}

