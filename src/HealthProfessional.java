
public class HealthProfessional {
    private final int id;            // 医生编码
    private final String name;       // 医生姓名
    private final String specialty;  // 医生专业领域

    // 默认构造函数
    public HealthProfessional() {
        this.id = 0;
        this.name = "Unknown";
        this.specialty = "General";
    }

    // 带参构造函数，初始化所有实例变量
    public HealthProfessional(int id, String name, String specialty) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
    }

    // 获取医生编码
    public int getId() {
        return id;
    }

    // 获取医生姓名
    public String getName() {
        return name;
    }

    // 获取医生专业
    public String getSpecialty() {
        return specialty;
    }

    // 打印医生的信息
    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Specialty: " + specialty);
    }
}

