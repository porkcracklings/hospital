package model;

import java.io.Serializable;

/**
 * Created by User on 20.03.2017.
 */
public class Personal implements Serializable {

    private Integer id_doctor;
    private Integer specializationId;
    private String firstName;
    private String lastName;
    private String middleName;
    private String password;
    private String login;

    private Specialization spec;

    public Personal(){}

    @Override
    public String toString(){
        return lastName + " " + firstName + " " + middleName;
    }

    public Specialization getSpec() {
        return spec;
    }

    public void setSpec(Specialization spec) {
        this.spec = spec;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Integer getId_doctor() {
        return id_doctor;
    }

    public void setId_doctor(Integer id_doctor) {
        this.id_doctor = id_doctor;
    }

    public Integer getSpecializationId() {
        return specializationId;
    }

    public void setSpecializationId(Integer specializationId) {
        this.specializationId = specializationId;
    }
}
