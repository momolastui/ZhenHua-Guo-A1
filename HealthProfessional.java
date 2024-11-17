public public class HealthProfessional {
    private int id;            // 医生编码
    private String name;       // 医生姓名
    private String specialty;  // 医生专业领域

    // 构造函数：初始化姓名和专业
    public HealthProfessional(int id, String name, String specialty) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
    }

    // 获取医生编码
    public int getId() {
        return id;
    }

    // 设置医生编码
    public void setId(int id) {
        this.id = id;
    }

    // 获取医生姓名
    public String getName() {
        return name;
    }

    // 设置医生姓名
    public void setName(String name) {
        this.name = name;
    }

    // 获取医生专业
    public String getSpecialty() {
        return specialty;
    }

    // 设置医生专业
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    // 打印医生信息
    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Specialty: " + specialty);
    }
}
  {
    
}
