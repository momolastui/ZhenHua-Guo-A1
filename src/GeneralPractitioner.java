
public class GeneralPractitioner extends HealthProfessional {
    private final String clinicName;  // Name of the general practitioner's clinic

    // Default constructor
    public GeneralPractitioner() {
        super(0, "Unknown", "General Practitioner");
        this.clinicName = "Unknown Clinic";
    }

    // Constructor with parameters
    public GeneralPractitioner(int id, String name, String clinicName) {
        super(id, name, "General Practitioner");
        this.clinicName = clinicName;
    }

    // Get the clinic name
    public String getClinicName() {
        return clinicName;
    }

    // Display information about the general practitioner
    @Override
    public void displayInfo() {
        System.out.println("Health Professional Type: General Practitioner");
        super.displayInfo();
        System.out.println("Clinic Name: " + clinicName);
    }
}
