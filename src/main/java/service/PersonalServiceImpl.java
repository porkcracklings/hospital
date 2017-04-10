package service;

import model.Personal;
import model.Specialization;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;



/**
 * Created by User on 28.03.2017.
 */
@Service
@Transactional
public class PersonalServiceImpl implements PersonalService {


    @Autowired
    private SqlSession sqlSession;

    @Override
    public Personal getDoctorById(int id) {
        PersonalService personalService = sqlSession.getMapper(PersonalService.class);
        return personalService.getDoctorById(id);
    }

    @Override
    public Personal getDoctorByLoginPassword(Personal personal) {
        PersonalService personalService = sqlSession.getMapper(PersonalService.class);
        return personalService.getDoctorByLoginPassword(personal);
    }

    @Override
    public List<Personal> getDoctorBySpecialization(String specialization) {
        PersonalService personalService = sqlSession.getMapper(PersonalService.class);
        return personalService.getDoctorBySpecialization(specialization);
    }

    @Override
    public void insertPersonal(Personal personal) {
        PersonalService personalService = sqlSession.getMapper(PersonalService.class);
        personalService.insertPersonal(personal);
    }

    @Override
    public void insertPersonalSpecialization(Specialization specialization) {
        PersonalService personalService = sqlSession.getMapper(PersonalService.class);
        personalService.insertPersonalSpecialization(specialization);
    }

    @Override
    public void deleteDoctorByFio(Personal personal) {
        PersonalService personalService = sqlSession.getMapper(PersonalService.class);
        personalService.deleteDoctorByFio(personal);
    }

    @Override
    public void updateDoctor(Personal personal) {
        PersonalService personalService = sqlSession.getMapper(PersonalService.class);
        personalService.updateDoctor(personal);
    }

    @Override
    public List<Personal> getAllPersonal() {
        PersonalService personalService = sqlSession.getMapper(PersonalService.class);
        return personalService.getAllPersonal();
    }

    @Override
    public Personal getDoctorByFIO(Personal personal) {
        PersonalService personalService = sqlSession.getMapper(PersonalService.class);
        return personalService.getDoctorByFIO(personal);
    }

    @Override
    public List<String> getSpecializationNames() {
        PersonalService personalService = sqlSession.getMapper(PersonalService.class);
        return personalService.getSpecializationNames();
    }

    @Override
    public Integer getSpecializationId(String specialization) {
        PersonalService personalService = sqlSession.getMapper(PersonalService.class);
        return personalService.getSpecializationId(specialization);
    }

}
