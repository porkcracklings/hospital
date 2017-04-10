package beans;

import model.Address;
import model.Patient;
import service.PatientService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.List;

/**
 * Created by User on 23.03.2017.
 */

@ManagedBean
@SessionScoped
public class PatientBean implements Serializable {

    private Patient currentPatient;
    private Patient updatePatient;
    private Address currentAddress;


    public String selected;

    @ManagedProperty("#{patientService}")
    private PatientService patientService;

    @PostConstruct
    public void initPatient(){
        currentPatient = new Patient();
        currentAddress = new Address();
        updatePatient = new Patient();
    }

    public List<Patient> getPatientByStreet(){
        return patientService.getPatientByStreet(currentAddress);
    }

    /*db*/
    public void insertPatient(){
        Integer currentAddressId = patientService.getAddressId(currentAddress);
        if(currentAddressId == null){
            patientService.insertPatientAddress(currentAddress);
        }
        currentPatient.setAddressId(currentAddressId);
        patientService.insertPatient(currentPatient);
    }

    public List<Patient> getPatient(){
        List<Patient> patientList;
        patientList = patientService.getPatient(currentPatient);
        return patientList;
    }
    public void updateOldPatient(){
        updatePatient.setId_patient(patientService.getPatientId((Patient) patientService.getPatient(currentPatient)));
        patientService.updatePatient(updatePatient);
    }

    public String getSelected() {
        return selected;
    }

    /*get-set*/

    public Patient getUpdatePatient() {
        return updatePatient;
    }

    public void setUpdatePatient(Patient updatePatient) {
        this.updatePatient = updatePatient;
    }

    public Address getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(Address currentAddress) {
        this.currentAddress = currentAddress;
    }

    public void setPatientService(PatientService patientService) {
        this.patientService = patientService;
    }

    public void setSelected(String selected) {
        this.selected = selected;
    }

    public Patient getCurrentPatient() {
        return currentPatient;
    }

    public void setCurrentPatient(Patient currentPatient) {
        this.currentPatient = currentPatient;
    }


}
