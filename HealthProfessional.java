public class HealthProfessional {
    private final int id;            // 医生编码，唯一标识
    private final String name;       // 医生姓名
    private final String specialty;  // 医生专业领域

    /**
     * 默认构造函数
     * 初始化医生的 ID、姓名和专业为默认值
     */
    public HealthProfessional() {
        this.id = 0;                   // 默认 ID 为 0
        this.name = "Unknown";         // 默认姓名为 "Unknown"
        this.specialty = "General";    // 默认专业为 "General"
    }

    /**
     * 带参数的构造函数
     * 
     * @param id        医生编码
     * @param name      医生姓名
     * @param specialty 医生专业领域
     */
    public HealthProfessional(int id, String name, String specialty) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
    }

    /**
     * 获取医生编码
     * 
     * @return 医生的 ID
     */
    public int getId() {
        return id;
    }

    /**
     * 获取医生姓名
     * 
     * @return 医生的姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 获取医生专业领域
     * 
     * @return 医生的专业领域
     */
    public String getSpecialty() {
        return specialty;
    }

    /**
     * 打印医生的详细信息
     * 格式为：ID, Name, Specialty
     */
    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Specialty: " + specialty);
    }
}

