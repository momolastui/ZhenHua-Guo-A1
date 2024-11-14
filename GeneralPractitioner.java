public class GeneralPractitioner extends HealthProfessional {
    private final String clinicName;  // 全科医生的诊所名称

    // 带参数构造函数
    public GeneralPractitioner(int id, String name, String clinicName) {
        super(id, name, "General Practitioner"); // 假设 HealthProfessional 有这个构造函数
        this.clinicName = clinicName;
    }

    // 获取诊所名称
    public String getClinicName() {
        return clinicName;
    }

    // 打印全科医生的信息
    @Override
    public void displayInfo() {
        System.out.println("Health Professional Type: General Practitioner");
        super.displayInfo(); // 打印基本信息，如ID和姓名
        System.out.println("Clinic Name: " + clinicName);
    }

    // 添加 toString 方法
    @Override
    public String toString() {
        return "GeneralPractitioner{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", clinicName='" + clinicName + '\'' +
                '}';
    }

    // 添加 equals 和 hashCode 方法
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GeneralPractitioner that = (GeneralPractitioner) o;
        return getId() == that.getId() &&
               Objects.equals(getName(), that.getName()) &&
               Objects.equals(clinicName, that.clinicName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), clinicName);
    }
}