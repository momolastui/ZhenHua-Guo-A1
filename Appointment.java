public class Appointment {
    private final String patientName;         // 病人姓名
    private final String patientMobile;       // 病人手机号
    private final String preferredTimeSlot;   // 预约时间
    private final HealthProfessional doctor;  // 医生对象
    private boolean isConfirmed;              // 预约是否确认

    // 默认构造函数
    public Appointment() {
        this("Unknown", "Unknown", "Unknown", null);
    }

    // 带参构造函数
    public Appointment(String patientName, String patientMobile, String preferredTimeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.preferredTimeSlot = preferredTimeSlot;
        this.doctor = doctor;
        this.isConfirmed = false; // 默认预约未确认
    }

    // 获取病人手机号
    public String getPatientMobile() {
        return patientMobile;
    }

    // 确认预约
    public void confirmAppointment() {
        isConfirmed = true;
    }

    // 取消预约
    public void cancelAppointment() {
        isConfirmed = false;
    }

    // 打印预约详情
    public void printAppointmentInfo() {
        if (doctor != null) {
            System.out.println("Patient Name: " + patientName);
            System.out.println("Patient Mobile: " + patientMobile);
            System.out.println("Preferred Time Slot: " + preferredTimeSlot);
            System.out.println("Doctor: " + doctor.getName() + " (" + doctor.getSpecialty() + ")");
            System.out.println("Appointment Confirmed: " + isConfirmed);
        } else {
            System.out.println("Doctor not assigned for this appointment.");
        }
    }
}


