package model;

/**
 * Created by User on 04.04.2017.
 */
public class Specialization {

    private Integer id_specialization;
    private String specializationName;

    @Override
    public String toString(){
        return "specialization: " + specializationName;
    }

    public String getSpecializationName() {
        return specializationName;
    }

    public void setSpecializationName(String specializationName) {
        this.specializationName = specializationName;
    }

    public Integer getId_specialization() {
        return id_specialization;
    }

    public void setId_specialization(Integer id_specialization) {
        this.id_specialization = id_specialization;
    }
}
