package service;

/**
 * Created by User on 01.05.2016.
 */

import model.Personal;
import model.Specialization;

import java.util.List;

public interface PersonalService {

    Personal getDoctorById(int id);
    Personal getDoctorByLoginPassword(Personal personal);
    List<Personal> getDoctorBySpecialization(String specialization);
    Personal getDoctorByFIO(Personal personal);
    void deleteDoctorByFio(Personal personal);


    void updateDoctor(Personal personal);

    /*new*/
    List<String> getSpecializationNames();
    Integer getSpecializationId(String specialization);

    List<Personal> getAllPersonal();

    void insertPersonal(Personal personal);
    void insertPersonalSpecialization(Specialization specialization);

}
