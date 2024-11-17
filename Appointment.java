public class Appointment {
    private final String patientName;         // 病人姓名
    private final String patientMobile;       // 病人手机号
    private final String preferredTimeSlot;   // 预约时间
    private final HealthProfessional doctor;  // 医生对象

    // 默认构造函数
    public Appointment() {
        this.patientName = "Unknown";
        this.patientMobile = "Unknown";
        this.preferredTimeSlot = "Unknown";
        this.doctor = null;
    }

    // 带参构造函数
    public Appointment(String patientName, String patientMobile, String preferredTimeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.preferredTimeSlot = preferredTimeSlot;
        this.doctor = doctor;
    }

    // 获取病人手机号
    public String getPatientMobile() {
        return patientMobile;
    }

    // 打印预约详情
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


