public class Appointment {
    private String patientName;
    private String patientMobile;
    private String preferredTimeSlot;
    private HealthProfessional doctor;

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

    // 打印预约详情
    public void printAppointmentInfo() {
        if (doctor != null) {
            System.out.println("Patient Name: " + patientName);
            System.out.println("Patient Mobile: " + patientMobile);
            System.out.println("Preferred Time Slot: " + preferredTimeSlot);
            System.out.println("Doctor: " + doctor.getName() + " (" + doctor.getSpecialty() + ")");
        }
    }

    public String getPatientMobile() {
        return patientMobile;
    }
}
