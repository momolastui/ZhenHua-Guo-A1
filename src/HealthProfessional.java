public class HealthProfessional {
    private final int id;            // Doctor's ID
    private final String name;       // Doctor's name
    private final String specialty;  // Doctor's specialty

    // Default constructor
    public HealthProfessional() {
        this.id = 0;
        this.name = "Unknown";
        this.specialty = "General";
    }

    // Constructor with parameters to initialize all instance variables
    public HealthProfessional(int id, String name, String specialty) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
    }

    // Get the doctor's ID
    public int getId() {
        return id;
    }

    // Get the doctor's name
    public String getName() {
        return name;
    }

    // Get the doctor's specialty
    public String getSpecialty() {
        return specialty;
    }

    // Display doctor's information
    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Specialty: " + specialty);
    }
}


