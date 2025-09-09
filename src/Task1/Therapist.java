package Task1;

public class Therapist implements Dotor {
    @Override
    public void treat() {
        System.out.println("Лечит терапевт согласно плану лечения");
    }

    public void AppointDoctor(Patient patient) {
        if (patient.getTreatmentPlan() == 1) {
            patient.setDoctor(new Surgeon());
            patient.getDoctor().treat();
        }else if (patient.getTreatmentPlan() == 2) {
            patient.setDoctor(new Dentist());
            patient.getDoctor().treat();
        }else {
            patient.setDoctor(this);
            patient.getDoctor().treat();
        }
    }
}
