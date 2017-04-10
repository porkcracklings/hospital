package service;

import model.Address;
import model.Patient;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by User on 30.03.2017.
 */
@Service
@Transactional
public class PatientServiceImpl implements PatientService {

    @Autowired
    private SqlSession sqlSession;

    @Override
    public Patient getPatientById(int id) {
        PatientService patientService = sqlSession.getMapper(PatientService.class);
        return patientService.getPatientById(id);
    }

    @Override
    public List<Patient> getPatient(Patient patient) {
        PatientService patientService = sqlSession.getMapper(PatientService.class);
        return patientService.getPatient(patient);
    }

    @Override
    public List<String> getStreet() {
        PatientService patientService = sqlSession.getMapper(PatientService.class);
        return patientService.getStreet();
    }

    @Override
    public List<Patient> getPatientByStreet(Address address) {
        PatientService patientService = sqlSession.getMapper(PatientService.class);
        return patientService.getPatientByStreet(address);
    }

    @Override
    public void updatePatient(Patient patient) {
        PatientService patientService = sqlSession.getMapper(PatientService.class);
        patientService.updatePatient(patient);
    }


    @Override
    public Integer getPatientId(Patient patient) {
        PatientService patientService = sqlSession.getMapper(PatientService.class);
        return patientService.getPatientId(patient);
    }

    @Override
    public Integer getAddressId(Address address) {
        PatientService patientService = sqlSession.getMapper(PatientService.class);
        return patientService.getAddressId(address);
    }

    @Override
    public void insertPatient(Patient patient) {
        PatientService patientService = sqlSession.getMapper(PatientService.class);
        patientService.insertPatient(patient);
    }

    @Override
    public void insertPatientAddress(Address address) {
        PatientService patientService = sqlSession.getMapper(PatientService.class);
        patientService.insertPatientAddress(address);
    }
}
