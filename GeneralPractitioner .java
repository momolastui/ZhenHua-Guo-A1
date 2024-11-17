public class GeneralPractitioner extends HealthProfessional {
    private String clinicName;  // 全科医生的诊所名称

    // 默认构造函数
    public GeneralPractitioner() {
        super(0, "Unknown", "General Practitioner");
        this.clinicName = "Unknown Clinic";
    }

    // 带参数构造函数，初始化所有实例变量
    public GeneralPractitioner(int id, String name, String clinicName) {
        super(id, name, "General Practitioner");
        this.clinicName = clinicName;
    }

    // 打印全科医生的信息
    @Override
    public void displayInfo() {
        System.out.println("Health Professional Type: General Practitioner");
        super.displayInfo();
        System.out.println("Clinic Name: " + clinicName);
    }
}
