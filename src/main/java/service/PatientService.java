package service;

import model.Address;
import model.Patient;

import java.util.List;

/**
 * Created by User on 30.03.2017.
 */
public interface PatientService {

    Patient getPatientById(int id);

    List<String> getStreet();
    /*new*/
    List<Patient> getPatient(Patient patient);

    List<Patient> getPatientByStreet(Address address);

    void updatePatient(Patient patient);
    void insertPatient(Patient patient);
    void insertPatientAddress(Address address);

    Integer getPatientId(Patient patient);
    Integer getAddressId(Address address);

}
