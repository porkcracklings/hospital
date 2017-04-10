package beans;

import model.Personal;
import model.Specialization;
import service.PersonalService;


import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

/**
 * Created by User on 24.03.2017.
 */
@ManagedBean
@SessionScoped
public class PersonalBean {

    private Personal currentPersonal;
    private Personal addedPersonal;
    private Personal updatePersonal;
    private Specialization specialization;

    @ManagedProperty("#{personalService}")
    private PersonalService personalService;

    @PostConstruct
    public void initPersonal(){
        currentPersonal = new Personal();
        addedPersonal = new Personal();
        updatePersonal = new Personal();
        specialization = new Specialization();
    }

    public void insertPersonal() {
        addedPersonal.setSpecializationId(personalService.getSpecializationId(specialization.getSpecializationName()));
        personalService.insertPersonal(addedPersonal);
    }

    /*get-set*/

    public Specialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }

    public Personal getAddedPersonal() {
        return addedPersonal;
    }

    public void setAddedPersonal(Personal addedPersonal) {
        this.addedPersonal = addedPersonal;
    }

    public Personal getUpdatePersonal() {
        return updatePersonal;
    }

    public void setUpdatePersonal(Personal updatePersonal) {
        this.updatePersonal = updatePersonal;
    }

    public Personal getCurrentPersonal() {
        return currentPersonal;
    }

    public void setCurrentPersonal(Personal currentPersonal) {
        this.currentPersonal = currentPersonal;
    }

    public void setPersonalService(PersonalService personalService) {
        this.personalService = personalService;
    }
}
