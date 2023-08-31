package August_29.HospitalManagement;

import java.util.HashMap;
import java.util.Map;

public class PatientManagement {

    private static Map<Integer,Patient> patientDetails=new HashMap<>();
    public PatientManagement()
    {

    }

    public void addPatient(Patient patient)
    {
        PatientManagement.patientDetails.put(patient.getPatientId(),patient);
    }

    public Patient getpatientDetailsUsingID(int id)
    {
        return PatientManagement.patientDetails.get(id);
    }
    public void showPatientsDetails()
    {
        for(Integer patientId:PatientManagement.patientDetails.keySet())
        {
            System.out.println(getpatientDetailsUsingID(patientId));
        }
    }


}
