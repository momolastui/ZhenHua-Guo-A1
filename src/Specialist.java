public class Specialist extends HealthProfessional {
    private final String specialtyArea;  // Specialist's area of expertise

    // Default constructor
    public Specialist() {
        super(0, "Unknown", "Specialist");
        this.specialtyArea = "Unknown Specialty";
    }

    // Constructor with parameters
    public Specialist(int id, String name, String specialtyArea) {
        super(id, name, "Specialist");
        this.specialtyArea = specialtyArea;
    }

    // Get the specialty area
    public String getSpecialtyArea() {
        return specialtyArea;
    }

    // Display information about the specialist
    @Override
    public void displayInfo() {
        System.out.println("Health Professional Type: Specialist");
        super.displayInfo();
        System.out.println("Specialty Area: " + specialtyArea);
    }
}
