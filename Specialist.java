public class Specialist extends HealthProfessional {
    private String specialtyArea;  // 专科医生的专攻领域

    // 默认构造函数
    public Specialist() {
        super(0, "Unknown", "Specialist");
        this.specialtyArea = "Unknown Specialty";
    }

    // 带参数构造函数，初始化所有实例变量
    public Specialist(int id, String name, String specialtyArea) {
        super(id, name, "Specialist");
        this.specialtyArea = specialtyArea;
    }

    // 打印专科医生的信息
    @Override
    public void displayInfo() {
        System.out.println("Health Professional Type: Specialist");
        super.displayInfo();
        System.out.println("Specialty Area: " + specialtyArea);
    }
}
