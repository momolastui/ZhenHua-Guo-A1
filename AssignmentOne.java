import java.util.ArrayList;

public class AssignmentOne {
    public static void main(String[] args) {
        // Part 3 – 使用类和对象
        // 创建健康专业人员对象，包括全科医生（GeneralPractitioner）和专科医生（Specialist）

        // 创建三个全科医生对象
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Alice", "Greenfield Clinic");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Bob", "Downtown Clinic");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Carol", "Westside Clinic");

        // 创建两个专科医生对象
        Specialist sp1 = new Specialist(4, "Dr. Dave", "Cardiology");  // 专攻心脏科
        Specialist sp2 = new Specialist(5, "Dr. Eve", "Dermatology");  // 专攻皮肤科

        // 打印每个健康专业人员的信息
        System.out.println("All health professionals:");
        gp1.displayInfo(); // 打印全科医生1的信息
        gp2.displayInfo(); // 打印全科医生2的信息
        gp3.displayInfo(); // 打印全科医生3的信息
        System.out.println("------------------------------");
        sp1.displayInfo(); // 打印专科医生1的信息
        sp2.displayInfo(); // 打印专科医生2的信息
        System.out.println("------------------------------");

        // Part 5 – 管理预约集合
        // 创建一个用于存储预约的 ArrayList
        ArrayList<Appointment> appointments = new ArrayList<>();

        // 使用 createAppointment 方法创建并添加预约到集合中
        createAppointment(appointments, "John Doe", "1234567890", "08:00", gp1); // 给全科医生1的预约
        createAppointment(appointments, "Jane Smith", "0987654321", "10:00", sp1); // 给专科医生1的预约
        createAppointment(appointments, "Mary Johnson", "1122334455", "14:30", gp2); // 给全科医生2的预约
        createAppointment(appointments, "Chris Lee", "2233445566", "09:00", sp2); // 给专科医生2的预约

        // 打印当前所有的预约
        System.out.println("Existing appointments:");
        printExistingAppointments(appointments);
        System.out.println("------------------------------");

        // 根据病人手机号取消一个预约
        System.out.println("Cancelling appointment for patient with mobile: 1234567890");
        cancelBooking(appointments, "1234567890");

        // 打印更新后的预约列表，显示取消后的状态
        System.out.println("Updated appointments after cancellation:");
        printExistingAppointments(appointments);
        System.out.println("------------------------------");
    }

    /**
     * 创建并添加预约到集合中
     *
     * @param appointments      ArrayList 用于存储预约
     * @param patientName       病人姓名
     * @param patientMobile     病人手机号
     * @param preferredTimeSlot 预约时间
     * @param doctor            健康专业人员对象（全科医生或专科医生）
     */
    public static void createAppointment(ArrayList<Appointment> appointments, String patientName, String patientMobile, String preferredTimeSlot, HealthProfessional doctor) {
        // 验证所有参数是否有效
        if (patientName != null && !patientName.isEmpty() &&
            patientMobile != null && !patientMobile.isEmpty() &&
            preferredTimeSlot != null && !preferredTimeSlot.isEmpty() &&
            doctor != null) {

            // 创建新预约对象并添加到列表
            appointments.add(new Appointment(patientName, patientMobile, preferredTimeSlot, doctor));
            System.out.println("Appointment created for " + patientName);
        } else {
            // 如果任何字段无效，输出错误信息
            System.out.println("Failed to create appointment. All fields must be provided.");
        }
    }

    /**
     * 打印现有的所有预约信息
     *
     * @param appointments ArrayList 存储所有预约
     */
    public static void printExistingAppointments(ArrayList<Appointment> appointments) {
        if (appointments.isEmpty()) {
            // 如果列表为空，输出提示信息
            System.out.println("No existing appointments.");
        } else {
            // 遍历列表并打印每个预约信息
            for (Appointment appointment : appointments) {
                appointment.printAppointmentInfo();
                System.out.println("------------------------------");
            }
        }
    }

    /**
     * 根据病人手机号取消预约
     *
     * @param appointments  ArrayList 存储所有预约
     * @param patientMobile 病人手机号，用于标识要取消的预约
     */
    public static void cancelBooking(ArrayList<Appointment> appointments, String patientMobile) {
        boolean found = false; // 标记是否找到对应的预约
        for (Appointment appointment : appointments) {
            if (appointment.getPatientMobile().equals(patientMobile)) {
                // 找到匹配的预约后，移除并标记为已找到
                appointments.remove(appointment);
                System.out.println("Appointment cancelled for " + patientMobile);
                found = true;
                break; // 结束循环，因为一个手机号对应一个预约
            }
        }
        if (!found) {
            // 如果没有找到对应的预约，输出提示信息
            System.out.println("No appointment found for " + patientMobile);
        }
    }
}
