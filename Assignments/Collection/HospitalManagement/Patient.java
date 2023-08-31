package August_29.HospitalManagement;

public class Patient {
    private int patientId;
    private String patientName;
    private String diseaseType;

    public Patient(int patientId, String patientName, String diseaseType) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.diseaseType = diseaseType;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", patientName='" + patientName + '\'' +
                ", diseaseType='" + diseaseType + '\'' +
                '}';
    }

    public String getDiseaseType() {
        return diseaseType;
    }

    public void setDiseaseType(String diseaseType) {
        this.diseaseType = diseaseType;
    }
}
