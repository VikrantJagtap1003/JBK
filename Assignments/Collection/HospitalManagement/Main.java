package August_29.HospitalManagement;

public class Main {
    public static void main(String[] args) {
        Patient patient=new Patient(1,"vikrant","maleria");

        PatientManagement patientManagement=new PatientManagement();
        patientManagement.addPatient(patient);
        patientManagement.showPatientsDetails();

    }
}
