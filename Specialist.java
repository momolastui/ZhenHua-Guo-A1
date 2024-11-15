public class Specialist extends HealthProfessional {
    private final String specialtyArea;  // 专科医生的专攻领域

    // 带参数构造函数
    public Specialist(int id, String name, String specialtyArea) {
        super(id, name, "Specialist");
        this.specialtyArea = specialtyArea;
    }

    // 获取专攻领域
    public String getSpecialtyArea() {
        return specialtyArea;
    }

    // 打印专科医生的信息
    @Override
    public void displayInfo() {
        System.out.println("Health Professional Type: Specialist");
        super.displayInfo(); // 假设这会打印ID和姓名
        System.out.println("Specialty Area: " + specialtyArea);
    }

    // 添加 toString 方法
    @Override
    public String toString() {
        return "Specialist{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", specialtyArea='" + specialtyArea + '\'' +
                '}';
    }

    // 添加 equals 和 hashCode 方法
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Specialist specialist = (Specialist) o;
        return getId() == specialist.getId() &&
               Objects.equals(getName(), specialist.getName()) &&
               Objects.equals(specialtyArea, specialist.specialtyArea);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), specialtyArea);
    }
}