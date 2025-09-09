package Task1;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient();
        patient.setTreatmentPlan(3);
        Therapist therapist = new Therapist();
        therapist.AppointDoctor(patient);
    }
}
